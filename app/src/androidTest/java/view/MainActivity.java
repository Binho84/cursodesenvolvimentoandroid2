package view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroide.fabio.udemy13aplicativos.R;
import devandroide.fabio.udemy13aplicativos.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
    }
}