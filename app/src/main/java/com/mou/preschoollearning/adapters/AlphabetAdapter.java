package com.mou.preschoollearning.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.annotations.NotNull;
import com.mou.preschoollearning.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AlphabetAdapter extends RecyclerView.Adapter<AlphabetAdapter.ViewHolder> {

    private Context context;
    private List<Integer> alphabets;
    private AlphabetClickListener alphabetClickListener;

    public AlphabetAdapter(Context context, List<Integer> alphabets) {
        this.context = context;
        this.alphabets = alphabets;
    }

    public void setAlphabetClickListener(AlphabetClickListener alphabetClickListener) {
        this.alphabetClickListener = alphabetClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_alphabet, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AlphabetAdapter.ViewHolder holder, int position) {
        holder.imgAlphabet.setImageResource(alphabets.get(position));
        holder.imgAlphabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alphabetClickListener.onAlphabetClick(position);

//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        for(int degree = 1; degree <= 360; degree += 10){
//                            holder.imgAlphabet.setRotation(degree);
//                            try {
//                                Thread.sleep(150);
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                    }
//                }).start();
            }
        });
    }

    @Override
    public int getItemCount() {
        return alphabets.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.imgAlphabet)
        ImageView imgAlphabet;

        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
