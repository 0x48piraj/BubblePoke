package io.github.a0x48piraj.bubble_poke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        int score = getIntent().getIntExtra("SCORE", -1);
        int acc = getIntent().getIntExtra("ACCURACY", -1);
        TextView scoretxt = findViewById(R.id.scoretxt);
        scoretxt.setText(getString(R.string.your_score) + ": " + score + ", " + getString(R.string.accuracy) + " " + acc + "%");
        final Intent intent = new Intent(this, MenuActivity.class);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(intent);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    finish();
                }
            }
        };
        timer.start();

    }
}
