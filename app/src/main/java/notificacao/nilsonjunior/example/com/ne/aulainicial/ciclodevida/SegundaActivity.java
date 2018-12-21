package notificacao.nilsonjunior.example.com.ne.aulainicial.ciclodevida;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import notificacao.nilsonjunior.example.com.ne.aulainicial.R;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        String rota = "https://www.google.com/maps/@-8.0580658,-34.9348098,16z";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(rota));
        startActivity(intent);


    }
}
