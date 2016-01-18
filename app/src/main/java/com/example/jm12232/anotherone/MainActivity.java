package com.example.jm12232.anotherone;

import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

   ImageButton  AnotherOne;
    ImageView imageView;
    int width;
    int height;
   Vibrator vibrate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vibrate = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        //setting the image view programatically
        imageView=(ImageView)findViewById(R.id.dj);
        width=850;
        height=840;
        final LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(width,height);
        AnotherOne=(ImageButton)findViewById(R.id.play);


        AnotherOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrate.vibrate(25);
                MediaPlayer mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.khaled);
                mediaPlayer.start();
                imageView.setLayoutParams(params);






            }
        });

    }



}
