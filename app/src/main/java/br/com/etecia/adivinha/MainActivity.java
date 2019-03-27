package br.com.etecia.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnPlay;
    private TextView txtresult;
    private Button btnLimp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = findViewById(R.id.btnPlay);
        txtresult = findViewById(R.id.txtresult);
        btnLimp = findViewById(R.id.btnlimp);



        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int resultado = random.nextInt(10);
                txtresult.setText("O sorteado foi "+ resultado);
                btnLimp.setCursorVisible(true);
            }
        });

        btnLimp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtresult.setText("");
            }
        });
    }
}
