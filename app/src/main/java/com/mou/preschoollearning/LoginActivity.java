package com.mou.preschoollearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.imgLogo)
    ImageView imgLogo;

    @BindView(R.id.txtTitle)
    TextView txtTitle;

    @BindView(R.id.layoutContainer)
    RelativeLayout layoutContainer;

    @BindView(R.id.btnGo)
    Button btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        bounce(layoutContainer);
        slideDown(imgLogo);
        wobble(btnGo);
    }

    public void bounce(View view){
        YoYo.with(Techniques.Bounce)
                .duration(1000)
                .playOn(view);
    }

    public void slideDown(View view){
        YoYo.with(Techniques.RubberBand)
                .duration(1000)
                .playOn(view);
    }

    public void wobble(View view){
        YoYo.with(Techniques.FlipInX)
                .duration(1000)
                .playOn(view);
    }

}