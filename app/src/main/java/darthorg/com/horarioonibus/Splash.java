package darthorg.com.horarioonibus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    private long splash = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        setContentView(R.layout.activity_splash);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent ProximaTela;
                ProximaTela = new Intent(Splash.this,HorarioOnibus.class);
                startActivity(ProximaTela);

                Splash.this.finish();
            }
        };

        Timer timer = new Timer();
        timer.schedule(task,splash);

    }
}
