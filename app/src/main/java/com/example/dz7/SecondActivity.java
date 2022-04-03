package com.example.dz7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dz7.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
private ActivitySecondBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        String text = getIntent().getStringExtra("text");
        binding.TextNazvanie.setText(text);
    }
}