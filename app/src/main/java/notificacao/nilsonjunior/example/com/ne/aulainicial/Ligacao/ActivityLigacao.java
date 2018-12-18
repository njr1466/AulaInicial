package notificacao.nilsonjunior.example.com.ne.aulainicial.Ligacao;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import notificacao.nilsonjunior.example.com.ne.aulainicial.R;
import notificacao.nilsonjunior.example.com.ne.aulainicial.ciclodevida.MainActivityCyclelife;

public class ActivityLigacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ligacao);

        Uri uri =  Uri.parse("tel:988554240");
        Intent intent = new Intent(Intent.ACTION_CALL, uri);
        if (ContextCompat.checkSelfPermission(ActivityLigacao.this, android.Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED) {


        } else {

            try {
                startActivity(intent);
            } catch(SecurityException e) {
                e.printStackTrace();
            }
        }
    }
}
