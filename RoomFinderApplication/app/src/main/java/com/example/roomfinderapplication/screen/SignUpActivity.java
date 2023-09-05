package com.example.roomfinderapplication.screen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.roomfinderapplication.R;
import com.example.roomfinderapplication.model.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class SignUpActivity extends AppCompatActivity {

    private TextView haveAccount;
    private FirebaseAuth mAuth;
    private EditText userName, userEmail, userPassword, confirmPassword;
    private AppCompatButton signUpButton;
    private DatabaseReference mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        haveAccount = findViewById(R.id.have_account);
        userName = findViewById(R.id.user_name);
        userEmail = findViewById(R.id.user_email);
        userPassword = findViewById(R.id.user_password);
        confirmPassword = findViewById(R.id.user_confirm_password);
        signUpButton = findViewById(R.id.sign_up_button);
        mAuth = FirebaseAuth.getInstance();
        mRef = FirebaseDatabase.getInstance().getReference();

        haveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
                finish();
            }
        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userName.getText().toString().trim().isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Enter Name", Toast.LENGTH_SHORT).show();
                } else if (userEmail.getText().toString().trim().isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Enter Valid Email", Toast.LENGTH_SHORT).show();
                } else if (userPassword.getText().toString().trim().isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Enter Password", Toast.LENGTH_SHORT).show();
                } else if (!userPassword.getText().toString().trim().equals(confirmPassword.getText().toString().trim())) {
                    Toast.makeText(SignUpActivity.this, "Enter Valid Password", Toast.LENGTH_SHORT).show();
                } else if (!isValidPassword(userPassword.getText().toString().trim())) {
                    Toast.makeText(SignUpActivity.this, "Password should have at least 1 uppercase letter, 1 number, 1 special character, and a total length of 8 characters", Toast.LENGTH_SHORT).show();
                } else {
                    if (emailChecker(userEmail.getText().toString().trim())) {
                        createUser(userEmail.getText().toString().trim(),
                                userPassword.getText().toString().trim(),
                                userName.getText().toString().trim(),
                                userEmail.getText().toString().trim());
                    } else {
                        Toast.makeText(SignUpActivity.this, "Enter Valid Email", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    boolean isValidPassword(String password) {
        String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        return password.matches(passwordPattern);
    }

    boolean emailChecker(String email) {
        String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailPattern);

        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }


    void createUser(String email, String password, String name, String signupEmail) {
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        User user = new User(name, email);
                        if (task.isSuccessful()) {
                            mRef.child("users").push().setValue(user);
                            Intent intent = new Intent();
                            intent.putExtra("signup_email", signupEmail);
                            setResult(Activity.RESULT_OK, intent);
                            finish();
                            Toast.makeText(SignUpActivity.this, "User created Successfully..", Toast.LENGTH_SHORT).show();
                        } else {
                            String errorMessage = task.getException().getMessage();
                            Toast.makeText(SignUpActivity.this, "Failed to create User: " + errorMessage, Toast.LENGTH_SHORT).show();
                            Log.e("SignUpActivity", "Failed to create User: " + errorMessage);
                        }
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        String errorMessage = e.getMessage();
                        Toast.makeText(SignUpActivity.this, "Failed to create User: " + errorMessage, Toast.LENGTH_SHORT).show();
                        Log.e("SignUpActivity", "Failed to create User: " + errorMessage);
                    }
                });
    }
}

