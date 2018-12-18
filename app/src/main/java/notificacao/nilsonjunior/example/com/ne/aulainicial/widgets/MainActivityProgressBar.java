package notificacao.nilsonjunior.example.com.ne.aulainicial.widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import notificacao.nilsonjunior.example.com.ne.aulainicial.R;

public class MainActivityProgressBar extends AppCompatActivity {

    int progress = 0;
    private ProgressBar simpleProgressBar;
    private Button startButton;
    private ProgressBar horizontalBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_progress_bar);
        // initiate progress bar and start button
        simpleProgressBar = (ProgressBar) findViewById(R.id.progressBarId);
        startButton = (Button) findViewById(R.id.buttonId);
        horizontalBar = (ProgressBar) findViewById(R.id.progressBarHorizontalId) ;
        // perform click event on button
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // call a function
                //setProgressValue(progress);
                horizontalBar.setMax(100000);
                for(int i=0;i<=100000;i++){

                    setProgressValue(i);
                }

            }
        });
    }

    private void setProgressValue(final int progress) {

        // set the progress
        simpleProgressBar.setProgress(progress);
        // thread is used to change the progress value
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                horizontalBar.setProgress(progress);
            }
        });
        thread.start();
    }
}
