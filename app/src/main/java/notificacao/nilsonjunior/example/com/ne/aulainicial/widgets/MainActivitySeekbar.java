package notificacao.nilsonjunior.example.com.ne.aulainicial.widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;

import notificacao.nilsonjunior.example.com.ne.aulainicial.R;

public class MainActivitySeekbar extends AppCompatActivity {

    private SeekBar seekbar;
    private SeekBar seekbarDiscrete;
    private Switch swith;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_seekbar);

        seekbar = (SeekBar) findViewById(R.id.seekBarId);
        seekbarDiscrete = (SeekBar) findViewById(R.id.seekBarDiscreteId);
        swith = (Switch) findViewById(R.id.switchId);


        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progresso = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progresso = progress;
                Toast.makeText(getApplicationContext(), "progress" + progresso, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "Click seekbar's progress", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "Covered: " + progresso + "/" + seekBar.getMax(), Toast.LENGTH_SHORT).show();

            }
        });


        seekbarDiscrete.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progresso = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                progresso = progress;
                Toast.makeText(getApplicationContext(), "progress" + progresso, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "Click seekbar's progress", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "Covered: " + progresso + "/" + seekBar.getMax(), Toast.LENGTH_SHORT).show();
            }
        });

        swith.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getApplicationContext(), "Ligado", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Desligado", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
