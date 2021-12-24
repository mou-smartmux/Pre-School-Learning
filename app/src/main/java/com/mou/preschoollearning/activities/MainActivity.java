package com.mou.preschoollearning.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import com.mou.preschoollearning.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @OnClick(R.id.cardAlphabet)
    public void gotoAlphabetActivity(){
        startActivity(new Intent(MainActivity.this, AlphabetActivity.class));
    }

    @OnClick(R.id.cardWord)
    public void gotoWordActivity(){
        startActivity(new Intent(MainActivity.this, AlphabetActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}