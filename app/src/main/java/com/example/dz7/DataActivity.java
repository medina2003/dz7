package com.example.dz7;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dz7.databinding.ActivityDataActivityBinding;

public class DataActivity extends AppCompatActivity {
    private ActivityDataActivityBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        binding=ActivityDataActivityBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        binding.name1.setText(getIntent().getStringExtra("text"));

    }
}
