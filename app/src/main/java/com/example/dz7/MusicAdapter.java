package com.example.dz7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dz7.databinding.ItemMusicBinding;

import java.util.ArrayList;

public class MusicAdapter extends RecyclerView.Adapter <MusicAdapter.MusicViewHolder>{

    private ArrayList<Music> data;
    private ClickListener OnClick;

    public MusicAdapter(ArrayList<Music> data, ClickListener onClick) {
        this.data = data;
        OnClick = onClick;
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MusicViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.getContext()) , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MusicViewHolder extends RecyclerView.ViewHolder {

        private ItemMusicBinding binding;

        public MusicViewHolder(@NonNull ItemMusicBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Music music) {
            binding.number1.setText(music.getNumberMusic());
            binding.number2.setText(music.getMusicName());
            binding.number3.setText(music.getPersonName());
            binding.number4.setText(music.getTimeMusic());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    OnClick.onClick(data.get(getAdapterPosition()));
                }
            });
        }
        }
    }
