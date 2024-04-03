package com.example.chatmessagingapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.chatmessagingapp.R;
import com.example.chatmessagingapp.databinding.ActivitySignInBinding;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
