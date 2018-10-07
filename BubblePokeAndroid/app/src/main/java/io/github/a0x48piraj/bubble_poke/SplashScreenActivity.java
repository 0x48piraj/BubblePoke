package io.github.a0x48piraj.bubble_poke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        final Intent changeActivity = new Intent(this, MainActivity.class);

        new Thread(){
            @Override
            public void run() {
                try{
                    Thread.sleep(3000);
                    startActivity(changeActivity);
                }catch (InterruptedException e){
                    //TODO(treat here)
                }
            }
        }.start();

    }

}
