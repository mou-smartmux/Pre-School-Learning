package com.mou.preschoollearning.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
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
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WordActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @BindView(R.id.imgAlphabetImage)
    ImageView imgAlphabetImage;

    @BindView(R.id.imgLottieAlternative)
    ImageView imgLottieAlternative;

    @BindView(R.id.lottieImage)
    LottieAnimationView lottieImage;

    @BindView(R.id.txtDescription)
    TextView txtDescription;

    private AlphabetAdapter alphabetAdapter;
    private TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);
        ButterKnife.bind(this);

        textToSpeech = new TextToSpeech(this, status -> {
            if (status != TextToSpeech.ERROR) {
                textToSpeech.setLanguage(Locale.US);
                textToSpeech.setSpeechRate(.7f);
            }
        });

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

                        imgLottieAlternative.setVisibility(View.GONE);
                        imgAlphabetImage.setImageResource(alphabets.get(position));

                        if (position == 0) {
                            lottieImage.setVisibility(View.VISIBLE);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("A for Apple");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            lottieImage.setAnimation("apple.json");
                            lottieImage.playAnimation();
                        } else if (position == 1) {
                            lottieImage.setVisibility(View.VISIBLE);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("B for Bee");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            lottieImage.setAnimation("bee.json");
                            lottieImage.playAnimation();
                        } else if (position == 2) {
                            lottieImage.setVisibility(View.VISIBLE);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("c for Cat");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            lottieImage.setAnimation("cat.json");
                            lottieImage.playAnimation();
                        } else if (position == 3) {
                            lottieImage.setVisibility(View.VISIBLE);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("D for Drum");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            lottieImage.setAnimation("drum.json");
                            lottieImage.playAnimation();
                        } else if (position == 4) {
                            lottieImage.setVisibility(View.VISIBLE);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("E for Egg");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            lottieImage.setAnimation("egg.json");
                            lottieImage.playAnimation();
                        } else if (position == 5) {
                            lottieImage.setVisibility(View.VISIBLE);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("F for Fish");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            lottieImage.setAnimation("fish.json");
                            lottieImage.playAnimation();
                        } else if (position == 6) {
                            lottieImage.setVisibility(View.GONE);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("G for Gloves");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            imgLottieAlternative.setVisibility(View.VISIBLE);
                            imgLottieAlternative.setImageResource(R.drawable.gloves);
                            txtDescription.setVisibility(View.VISIBLE);
                        } else if (position == 7) {
                            lottieImage.setVisibility(View.VISIBLE);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("H for House");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            lottieImage.setAnimation("house.json");
                            lottieImage.playAnimation();
                        } else if (position == 8) {
                            lottieImage.setVisibility(View.VISIBLE);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("I for Igloo");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            lottieImage.setAnimation("igloo.json");
                            lottieImage.playAnimation();
                        } else if (position == 9) {
                            lottieImage.setVisibility(View.VISIBLE);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("J for Jar");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            lottieImage.setAnimation("jar.json");
                            lottieImage.playAnimation();
                        } else if (position == 10) {
                            lottieImage.setVisibility(View.VISIBLE);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("K for Key");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            lottieImage.setAnimation("key.json");
                            lottieImage.playAnimation();
                        } else if (position == 11) {
                            lottieImage.setVisibility(View.VISIBLE);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("L for Lock");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            lottieImage.setAnimation("lock.json");
                            lottieImage.playAnimation();
                        } else if (position == 12) {
                            lottieImage.setVisibility(View.VISIBLE);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("M for Mug");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            lottieImage.setAnimation("mug.json");
                            lottieImage.playAnimation();
                        } else if (position == 13) {
                            lottieImage.setVisibility(View.GONE);
                            imgLottieAlternative.setVisibility(View.VISIBLE);
                            imgLottieAlternative.setImageResource(R.drawable.net);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("N for Net");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            //lottieImage.setAnimation("drum.json");
                            //lottieImage.playAnimation();
                        } else if (position == 14) {
                            lottieImage.setVisibility(View.VISIBLE);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("O for Orange");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            lottieImage.setAnimation("orange.json");
                            lottieImage.playAnimation();
                        } else if (position == 15) {
                            lottieImage.setVisibility(View.VISIBLE);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("P for Pumpkin");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            lottieImage.setAnimation("pumpkin.json");
                            lottieImage.playAnimation();
                        } else if (position == 16) {
                            lottieImage.setVisibility(View.VISIBLE);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("Q for Queen");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            lottieImage.setAnimation("queen.json");
                            lottieImage.playAnimation();
                        } else if (position == 17) {
                            lottieImage.setVisibility(View.VISIBLE);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("R for Robot");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            lottieImage.setAnimation("robot.json");
                            lottieImage.playAnimation();
                        } else if (position == 18) {
                            lottieImage.setVisibility(View.VISIBLE);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("S for Snake");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            lottieImage.setAnimation("snake.json");
                            lottieImage.playAnimation();
                        } else if (position == 19) {
                            lottieImage.setVisibility(View.VISIBLE);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("T for Teapot");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            lottieImage.setAnimation("teapot.json");
                            lottieImage.playAnimation();
                        } else if (position == 20) {
                            lottieImage.setVisibility(View.VISIBLE);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("U for Umbrella");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            lottieImage.setAnimation("umbrella.json");
                            lottieImage.playAnimation();
                        } else if (position == 21) {
                            lottieImage.setVisibility(View.VISIBLE);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("V for Vase");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            lottieImage.setAnimation("vase.json");
                            lottieImage.playAnimation();
                        } else if (position == 22) {
                            lottieImage.setVisibility(View.VISIBLE);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("W for Watch");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            lottieImage.setAnimation("watch.json");
                            lottieImage.playAnimation();
                        } else if (position == 23) {
                            lottieImage.setVisibility(View.VISIBLE);
                            imgLottieAlternative.setVisibility(View.VISIBLE);
                            imgLottieAlternative.setImageResource(R.drawable.xylophone);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("X for Xylophone");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            //lottieImage.setAnimation("drum.json");
                            //lottieImage.playAnimation();
                        } else if (position == 24) {
                            lottieImage.setVisibility(View.VISIBLE);
                            imgLottieAlternative.setVisibility(View.VISIBLE);
                            imgLottieAlternative.setImageResource(R.drawable.yoyo);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("Y for YoYo");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            //lottieImage.setAnimation("drum.json");
                            //lottieImage.playAnimation();
                        } else if (position == 25) {
                            lottieImage.setVisibility(View.VISIBLE);
                            txtDescription.setVisibility(View.VISIBLE);
                            txtDescription.setText("Z for Zip");
                            textToSpeech.speak(txtDescription.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                            lottieImage.setAnimation("zip.json");
                            lottieImage.playAnimation();
                        } else {
                            txtDescription.setVisibility(View.GONE);
                            imgLottieAlternative.setVisibility(View.GONE);
                            lottieImage.setVisibility(View.GONE);
                        }

                    }
                }, 100);

                YoYo.with(Techniques.ZoomIn)
                        .delay(100)
                        .playOn(imgAlphabetImage);
            }
        });

        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(alphabetAdapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (textToSpeech != null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
    }
}