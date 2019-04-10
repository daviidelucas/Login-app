package br.com.etecia.loginaplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonLogin = findViewById(R.id.btnLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtLogin = findViewById(R.id.txtLogin);
                TextView txtSenha = findViewById(R.id.txtSenha);
                String login = txtLogin.getText().toString();
                String senha = txtSenha.getText().toString();

                if(login.equals("Davi") && senha.equals("carlao1234")){
                    Intent intentGoHome = new Intent(MainActivity.this,Home.class);
                    startActivity(intentGoHome);
                }
                else{
                        
                    System.out.println("Deu errado");

                }
            }

        });


    }
    private void alert(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();

    }
}

