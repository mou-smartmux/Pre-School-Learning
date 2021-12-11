package com.mou.preschoollearning.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.mou.preschoollearning.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.imgLogo)
    ImageView imgLogo;

    @BindView(R.id.txtTitle)
    TextView txtTitle;

    @BindView(R.id.layoutContainer)
    RelativeLayout layoutContainer;

    @BindView(R.id.btnSignUp)
    Button btnGo;

    @OnClick(R.id.txtSignUp)
    public void gotoSignUpActivity(){
        startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        bounce(layoutContainer);
        slideDown(imgLogo);
        //wobble(btnGo);
        btnGo.animate()
                .translationY(50)
                .setDuration(700)
                .start();
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