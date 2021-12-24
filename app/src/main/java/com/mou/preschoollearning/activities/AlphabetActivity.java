package com.mou.preschoollearning.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.mou.preschoollearning.adapters.AlphabetAdapter;
import com.mou.preschoollearning.R;
import com.mou.preschoollearning.adapters.AlphabetClickListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AlphabetActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @BindView(R.id.imgAlphabetImage)
    ImageView imgAlphabetImage;

    @BindView(R.id.lottieImage)
    LottieAnimationView lottieImage;

    @BindView(R.id.txtDescription)
    TextView txtDescription;

    private AlphabetAdapter alphabetAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
        ButterKnife.bind(this);

        List<Integer> alphabets = new ArrayList<>();
        alphabets.add(R.drawable.letter_a);
        alphabets.add(R.drawable.letter_b);
        alphabets.add(R.drawable.letter_c);
        alphabets.add(R.drawable.letter_d);
        alphabets.add(R.drawable.letter_e);
        alphabets.add(R.drawable.letter_f);
        alphabets.add(R.drawable.letter_g);
        alphabets.add(R.drawable.letter_h);
        alphabets.add(R.drawable.letter_i);
        alphabets.add(R.drawable.letter_j);
        alphabets.add(R.drawable.letter_k);
        alphabets.add(R.drawable.letter_l);
        alphabets.add(R.drawable.letter_m);
        alphabets.add(R.drawable.letter_n);
        alphabets.add(R.drawable.letter_o);
        alphabets.add(R.drawable.letter_p);
        alphabets.add(R.drawable.letter_q);
        alphabets.add(R.drawable.letter_r);
        alphabets.add(R.drawable.letter_s);
        alphabets.add(R.drawable.letter_t);
        alphabets.add(R.drawable.letter_u);
        alphabets.add(R.drawable.letter_v);
        alphabets.add(R.drawable.letter_w);
        alphabets.add(R.drawable.letter_x);
        alphabets.add(R.drawable.letter_y);
        alphabets.add(R.drawable.letter_z);

        alphabetAdapter = new AlphabetAdapter(this, alphabets);

        alphabetAdapter.setAlphabetClickListener(new AlphabetClickListener() {
            @Override
            public void onAlphabetClick(int position) {

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imgAlphabetImage.setImageResource(alphabets.get(position));
                        if(position == 1){
                            lottieImage.setVisibility(View.VISIBLE);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("B for Bees");
                            lottieImage.setAnimation("bee.json");
                            lottieImage.playAnimation();
                        }else {
                            txtDescription.setVisibility(View.GONE);
                            lottieImage.setVisibility(View.GONE);
                        }

                    }
                }, 100);

                YoYo.with(Techniques.ZoomIn)
                        .delay(100)
                        .playOn(imgAlphabetImage);
            }
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(alphabetAdapter);

    }
}