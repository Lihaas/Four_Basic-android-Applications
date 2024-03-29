package com.example.android.spanishno;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
private SoundPool soundPool;
private int s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idFound();

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            soundPool = new SoundPool.Builder()
                    .setMaxStreams(10)
                    .setAudioAttributes(audioAttributes)
                    .build();
        }
        else {
            soundPool = new SoundPool(6, AudioManager.STREAM_MUSIC,0);
        }

        s1 = soundPool.load(this,R.raw.one,1);
        s2 = soundPool.load(this,R.raw.two,1);
        s3 = soundPool.load(this,R.raw.three,1);
        s4 = soundPool.load(this,R.raw.four,1);
        s5 = soundPool.load(this,R.raw.five,1);
        s6 = soundPool.load(this,R.raw.six,1);
        s7 = soundPool.load(this,R.raw.seven,1);
        s8 = soundPool.load(this,R.raw.eight,1);
        s9 = soundPool.load(this,R.raw.nine,1);
        s10 = soundPool.load(this,R.raw.ten,1);





    }
public void playSound(View v){
        switch (v.getId()){
            case R.id.b1:   b1.setSoundEffectsEnabled(false);
                soundPool.play(s1,1,1,0,0,1);
                soundPool.autoPause();
            break;
            case R.id.b2:  b2.setSoundEffectsEnabled(false);
                soundPool.play(s2,1,1,0,0,1);
                soundPool.autoPause();
                break;
            case R.id.b3:   b3.setSoundEffectsEnabled(false);
                soundPool.play(s3,1,1,0,0,1);
                soundPool.autoPause();
                break;
            case R.id.b4:   b4.setSoundEffectsEnabled(false);
                soundPool.play(s4,1,1,0,0,1);
                soundPool.autoPause();
                break;
            case R.id.b5:  b5.setSoundEffectsEnabled(false);
                soundPool.play(s5,1,1,0,0,1);
                soundPool.autoPause();
                break;
            case R.id.b6:  b6.setSoundEffectsEnabled(false);
                soundPool.play(s6,1,1,0,0,1);
                soundPool.autoPause();
                break;
            case R.id.b7:  b7.setSoundEffectsEnabled(false);
                soundPool.play(s7,1,1,0,0,1);
                soundPool.autoPause();
                break;
            case R.id.b8:   b8.setSoundEffectsEnabled(false);
            soundPool.play(s8,1,1,0,0,1);
                soundPool.autoPause();
                break;
            case R.id.b9:  b9.setSoundEffectsEnabled(false);
            soundPool.play(s9,1,1,0,0,1);
                soundPool.autoPause();
                break;
            case R.id.b10:   b10.setSoundEffectsEnabled(false);
            soundPool.play(s10,1,1,0,0,1);
                soundPool.autoPause();
                break;

        }


}









    void idFound(){
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b10 = findViewById(R.id.b10);
    }
}
