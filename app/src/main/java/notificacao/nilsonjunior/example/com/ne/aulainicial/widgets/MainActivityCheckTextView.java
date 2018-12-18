package notificacao.nilsonjunior.example.com.ne.aulainicial.widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.Toast;

import notificacao.nilsonjunior.example.com.ne.aulainicial.R;

public class MainActivityCheckTextView extends AppCompatActivity {

    private CheckedTextView textChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_check_text_view);
        textChecked = (CheckedTextView) findViewById(R.id.checkedTextViewid) ;

        textChecked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean checked = ((CheckedTextView) view).isChecked();
                StringBuffer result = new StringBuffer();
                textChecked.setChecked(!checked);

                if(checked){

                    result.append("CheckBoxTextView : ").append("TRUE");
                    textChecked.setChecked(!checked);

                }else{
                    result = new StringBuffer();
                    result.append("CheckBoxTextView : ").append("FALSE");
                    textChecked.setChecked(!checked);
                }




                Toast.makeText(MainActivityCheckTextView.this, result.toString(),
                        Toast.LENGTH_SHORT).show();

            }


        });
    }
}
