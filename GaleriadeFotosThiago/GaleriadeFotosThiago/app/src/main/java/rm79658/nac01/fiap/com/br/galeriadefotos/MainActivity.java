package rm79658.nac01.fiap.com.br.galeriadefotos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

import static rm79658.nac01.fiap.com.br.galeriadefotos.R.id.imagem1;

public class MainActivity extends AppCompatActivity {

    ImageView imagem1;

    int[] imagens = {
            R.drawable.p0,
            R.drawable.p1,
            R.drawable.p2,
            R.drawable.p3,
            R.drawable.p4,
            R.drawable.p5,
            R.drawable.p6

    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imagem1 = findViewById(R.id.imagem1);

    }

    public void btnAnterior(View view) {







    }

    public void btnProxima(View view) {





    }
}

