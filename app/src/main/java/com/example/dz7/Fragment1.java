package com.example.dz7;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dz7.databinding.Fragment1Binding;

import java.io.Serializable;
import java.util.ArrayList;


public class Fragment1 extends Fragment implements DialogInterface.OnClickListener {
    private Fragment1Binding binding;
    private ArrayList<Music> music;
    private MusicAdapter adapter;




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = Fragment1Binding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new MusicAdapter(music, this::onClick);
        binding.RecyclerView.setAdapter(adapter);


    }

    private void loadData() {
        music = new ArrayList<>();
        music.add(new Music("nj,l;", "ок", "1", "4:32"));
        music.add(new Music("Xcho", "Memorise", "2", "3:32"));
        music.add(new Music("Shir", "Ты Моё", "3", "5:32"));
        music.add(new Music("Alexsandra Stan", "Ecoute", "4", "3:31"));
        music.add(new Music("Rauf Faik", " Если тебе будеть грустно ", "5", "3:12"));
        music.add(new Music("Al fakher", " Я влюбился тебя шахризад", "6", "3:08"));
        music.add(new Music("Janga", "Малыш", "7", "2:44"));


    }

    public void onClick (Music music) {
        Intent intent = new Intent(requireActivity(),SecondActivity.class);
        intent.putExtra("text", music.getMusicName());
        startActivity(intent);

    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {

    }
}

