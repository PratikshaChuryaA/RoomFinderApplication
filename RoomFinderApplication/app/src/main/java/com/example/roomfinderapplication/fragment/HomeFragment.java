package com.example.roomfinderapplication.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.roomfinderapplication.R;
import com.example.roomfinderapplication.adapters.HomeAdapters;
import com.example.roomfinderapplication.listeners.ItemListener;
import com.example.roomfinderapplication.model.Item;
import com.example.roomfinderapplication.screen.DetailedActivity;
import com.example.roomfinderapplication.screen.DetailsActivity;
import com.example.roomfinderapplication.screen.LoginActivity;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class HomeFragment extends Fragment implements ItemListener {


    private RecyclerView topDealRV;
    private HomeAdapters adapters;
    Button btn;
    private List<Item> itemList;
    private TextView username;
    private DatabaseReference ref;

    private ImageView home,home1,home2,home3,home4,home5,home6,home7,home8;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        topDealRV = view.findViewById(R.id.top_deal_RV);
        username=view.findViewById(R.id.user_name);
        btn = view.findViewById(R.id.button2);
        home=view.findViewById(R.id.home_image);
        home1=view.findViewById(R.id.home1_image1);
        home2=view.findViewById(R.id.home1_image3);
        home3=view.findViewById(R.id.home1_image);
        home4=view.findViewById(R.id.home2_image1);
        home5=view.findViewById(R.id.home_image3);
        home6=view.findViewById(R.id.home2_image);
        home7=view.findViewById(R.id.home2_image2);
        home8=view.findViewById(R.id.home2_image3);





        itemList = new ArrayList<>();
//        itemList.add(new Item("Adyar,Mangalore,Karnataka,India", "Rs.3000", "2 Bedroom"));
//        itemList.add(new Item("Surathkal,Mangalore,Karnataka,India", "Rs.3000", "2 Bedroom"));
//        itemList.add(new Item("Shakthinagar,Mangalore,Karnataka,India", "Rs.3000", "2 Bedroom"));
//       itemList.add(new Item("Carstreet,Mangalore,Karnataka,India", "Rs.3000", "2 Bedroom"));

        FirebaseDatabase.getInstance().getReference().child("images")
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        for (DataSnapshot dataSnapshot : snapshot.getChildren())
                        {
                            itemList.add(new Item(
                                    Objects.requireNonNull(dataSnapshot.child("location").getValue()).toString(),
                                    Objects.requireNonNull(dataSnapshot.child("price").getValue()).toString(),
                                    Objects.requireNonNull(dataSnapshot.child("description").getValue()).toString(),
                                    Objects.requireNonNull(dataSnapshot.child("shortDescription").getValue()).toString(),
                                    Objects.requireNonNull(dataSnapshot.child("image").getValue()).toString()
                                    ));
                        }

                        adapters.notifyDataSetChanged();

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

        adapters = new HomeAdapters(getContext(), itemList, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        topDealRV.setLayoutManager(linearLayoutManager);
        topDealRV.setAdapter(adapters);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireActivity(), DetailedActivity.class);
                startActivity(intent);
            }
        });
        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireActivity(), DetailedActivity.class);
                startActivity(intent);
            }
        });
        home2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireActivity(), DetailedActivity.class);
                startActivity(intent);
            }
        });
        home3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireActivity(), DetailedActivity.class);
                startActivity(intent);
            }
        });
        home4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireActivity(), DetailedActivity.class);
                startActivity(intent);
            }
        });
        home5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireActivity(), DetailedActivity.class);
                startActivity(intent);
            }
        });
        home6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireActivity(), DetailedActivity.class);
                startActivity(intent);
            }
        });
        home7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireActivity(), DetailedActivity.class);
                startActivity(intent);
            }
        });
        home8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireActivity(), DetailedActivity.class);
                startActivity(intent);
            }
        });


    }
    @Override
    public void OnItemPosition(int position) {
        Intent intent=new Intent(getContext(), DetailsActivity.class);
        intent.putExtra("price",itemList.get(position).getPrice());
        intent.putExtra("location",itemList.get(position).getLocation());
        intent.putExtra("description",itemList.get(position).getDescription());
        intent.putExtra("shortDescription",itemList.get(position).getShortDescription());
        intent.putExtra("image",itemList.get(position).getImage());


        startActivity(intent);

    }

}