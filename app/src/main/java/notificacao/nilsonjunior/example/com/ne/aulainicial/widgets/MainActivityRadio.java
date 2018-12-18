package notificacao.nilsonjunior.example.com.ne.aulainicial.widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import notificacao.nilsonjunior.example.com.ne.aulainicial.R;

public class MainActivityRadio extends AppCompatActivity {

    private RadioButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_radio);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean checked = ((RadioButton) view).isChecked();
                StringBuffer result = new StringBuffer();

                if(checked){

                    result.append("CheckBox : ").append("TRUE");
                }else{
                    result = new StringBuffer();
                    result.append("CheckBox : ").append("FALSE");
                }




                Toast.makeText(MainActivityRadio.this, result.toString(),
                        Toast.LENGTH_SHORT).show();

            }
        });
    }
}
