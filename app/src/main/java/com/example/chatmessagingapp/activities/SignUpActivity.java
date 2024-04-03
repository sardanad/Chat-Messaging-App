package com.example.chatmessagingapp.activities;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.chatmessagingapp.R;
import com.example.chatmessagingapp.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    private ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        binding.textSignIn.setOnClickListener(v -> onBackPressed());
        binding.buttonSignUp.setOnClickListener(v -> {
            if (validatedSignUpInfo()) {
                signUp();
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    private void signUp() {

    }

    private Boolean validatedSignUpInfo() {
        if(encodedImage == null) {
            showToast("Select profile image");
            return false;
        }else if(binding.inputName.getText().toString().trim().isEmpty()) {
            showToast("Enter name");
            return false;
        }else if(binding.inputEmail.getText().toString().trim().isEmpty()) {
            showToast("Enter email");
            return false;
        }else if(!Patterns.EMAIL_ADDRESS.matcher(binding.inputEmail.getText().toString()).matches()) {
            showToast("Enter valid image");
            return false;
        }else if(binding.inputPassword.getText().toString().trim().isEmpty()) {
            showToast("Enter password");
            return false;
        }else if(binding.inputConfirmPassword.getText().toString().trim().isEmpty()) {
            showToast("Confirm password");
            return false;
        }else if(!binding.inputPassword.getText().toString().equals(binding.inputConfirmPassword.getText().toString())) {
            showToast("Passwords must match");
            return false;
        }else {
            return true;
        }
    }
}