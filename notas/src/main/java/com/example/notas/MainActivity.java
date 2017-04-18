package com.example.notas;

import android.icu.text.DecimalFormat;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {

    EditText n1, n2,n3,n4,n5;
    TextView Tnota;
    Button bCalcular, bLimpiar;
    float pesos, dolares;
    double nota, nota1=0, nota2=0, nota3=0, nota4=0, nota5=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById (R.id.n1);
        n2 = (EditText) findViewById (R.id.n2);
        n3 = (EditText) findViewById (R.id.n3);
        n4 = (EditText) findViewById (R.id.n4);
        n5 = (EditText) findViewById (R.id.n5);
        Tnota=(TextView) findViewById(R.id.Tnota);

        bCalcular = (Button) findViewById(R.id.bCalcular);
        bLimpiar=(Button) findViewById(R.id.bLimpiar);
        bCalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if ( n1.getText().toString().equals("") && n2.getText().toString().equals("")&& n3.getText().toString().equals("")&& n4.getText().toString().equals("")&&n5.getText().toString().equals("") ) {
                    Toast.makeText(getApplicationContext(), "Ingrese sus notas", Toast.LENGTH_SHORT).show();

                }
                else {
                    if(!(n1.getText().toString().equals("")))
                    nota1=(Float.parseFloat(n1.getText().toString()));
                    if(!(n2.getText().toString().equals("")))
                    nota2=(Float.parseFloat(n2.getText().toString()));
                    if(!(n3.getText().toString().equals("")))
                    nota3=(Float.parseFloat(n3.getText().toString()));
                    if(!(n4.getText().toString().equals("")))
                    nota4=(Float.parseFloat(n4.getText().toString()));
                    if(!(n5.getText().toString().equals("")))
                    nota5=(Float.parseFloat(n5.getText().toString()));
                    //nota = ((Float.parseFloat(n1.getText().toString())) * (0.6)) + ((Float.parseFloat(n2.getText().toString())) * (0.05)) + ((Float.parseFloat(n3.getText().toString())) * (0.07)) + ((Float.parseFloat(n4.getText().toString())) * (0.08)) + ((Float.parseFloat(n5.getText().toString())) * (0.2));
                    nota= (nota1*0.6)+(nota2*0.05)+(nota3*0.07)+(nota4*0.05)+(nota5*0.2);
                    //DecimalFormat formato = new DecimalFormat("0.00");

                    Tnota.setText(String.format("%.2f",nota));//Double.toString(nota)));
                    //Tnota.setText(formato.format(nota));
                    if (nota <= 1) {
                        Toast.makeText(getApplicationContext(), "Estas en el lugar equivocado", Toast.LENGTH_SHORT).show();
                    }
                    if ((1<nota) && (nota<=2)) {
                        Toast.makeText(getApplicationContext(), "Remal", Toast.LENGTH_SHORT).show();
                    }
                    if ((2<nota) && (nota<=3)) {
                        Toast.makeText(getApplicationContext(), "Es posible recuperarse", Toast.LENGTH_SHORT).show();
                    }
                    if ((3<nota) && (nota<=4)) {
                        Toast.makeText(getApplicationContext(), "Normalito", Toast.LENGTH_SHORT).show();
                    }
                    if ((4<nota) && (nota<=4.5)) {
                        Toast.makeText(getApplicationContext(), "Muy Bien", Toast.LENGTH_SHORT).show();
                    }
                    if ((4.5<nota) && (nota<=5)) {
                        Toast.makeText(getApplicationContext(), "Excelente estudiante", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        bLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                n1.setText("");
                n2.setText("");
                n3.setText("");
                n4.setText("");
                n5.setText("");
                nota=0;



            }
        });




    }
}
