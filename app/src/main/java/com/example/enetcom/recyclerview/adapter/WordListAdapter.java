package com.example.enetcom.recyclerview.adapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.enetcom.recyclerview.R;
import com.example.enetcom.recyclerview.model.Word;

import java.util.LinkedList;


public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {
    private final LinkedList<Word> mWordList;
    public WordListAdapter(LinkedList<Word> mWordList) {
        this.mWordList = mWordList;
    }
    @Override
    public int getItemCount() {
        return mWordList.size();
    }
    @NonNull
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class WordViewHolder extends RecyclerView.ViewHolder    {

        public final TextView wordItemView;
        final WordListAdapter mAdapter;
        public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.word_title);
            this.mAdapter = adapter;
        }
    }
}
