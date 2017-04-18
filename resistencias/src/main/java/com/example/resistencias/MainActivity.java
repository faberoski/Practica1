package com.example.resistencias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button0, button1, button2, button3, button4, button5;
    Button button6, button7, button8, button9, buttonc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.eNumero);
        button0=(Button) findViewById(R.id.negro);
        button1=(Button) findViewById(R.id.cafe);
        button2=(Button) findViewById(R.id.rojo);
        button3=(Button) findViewById(R.id.naranja);
        button4=(Button) findViewById(R.id.amarillo);
        button5=(Button) findViewById(R.id.verde);
        button6=(Button) findViewById(R.id.azul);
        button7=(Button) findViewById(R.id.violeta);
        button8=(Button) findViewById(R.id.gris);
        button9=(Button) findViewById(R.id.blanco);
        buttonc=(Button) findViewById(R.id.clr);
    }
    int mnegro=0,mcafe=1,mrojo=2,mnaranja=3,mamarillo=4,mverde=5,mazul=6,mvioleta=7,mgris=8,mblanco=9;
    int valo=0, banda2=0, flag=0, flag2=0;
    long valor=0;
    String numero="";
    public void pressed (View view){
        int id=view.getId();
        try {
            switch (id) {
                case R.id.negro:
                    //editText.setText("negro");
                    if (flag < 2) {
                        numero = numero + mnegro;
                        editText.setText(numero);
                        flag++;
                    } else {
                        valor = (Integer.parseInt(numero))*((int) Math.pow(10, mnegro));
                        //editText.setText(String.valueOf(valor));
                        editText.setText(String.valueOf(valor).concat(" ohms"));
                        flag=0;
                        numero="";
                        valor=0;
                    }
                    break;
                case R.id.cafe:
                    if (flag < 2) {
                        numero = numero + mcafe;
                        editText.setText(numero);
                        flag++;
                    } else {
                        valor = (Integer.parseInt(numero))*((int) Math.pow(10, mcafe));
                        numero= String.valueOf(numero);
                        //editText.setText(String.valueOf(valor));
                        editText.setText(String.valueOf(valor).concat(" ohms"));
                        flag=0;
                        numero="";
                        valor=0;

                    }
                    break;

                case R.id.rojo:
                    if (flag < 2) {
                        numero = numero + mrojo;
                        editText.setText(numero);
                        flag++;
                    } else {
                        valor = (Integer.parseInt(numero))*((int) Math.pow(10, mrojo));
                        numero= String.valueOf(numero);
                        //editText.setText(String.valueOf(valor));
                        editText.setText(String.valueOf(valor).concat(" ohms"));
                        flag=0;
                        numero="";
                        valor=0;
                    }
                    break;

                case R.id.naranja:
                    if (flag < 2) {
                        numero = numero + mnaranja;
                        editText.setText(numero);
                        flag++;
                    } else {
                        valor = (Integer.parseInt(numero))*((int) Math.pow(10, mnaranja));
                        numero= String.valueOf(numero);
                        //editText.setText(String.valueOf(valor));
                        editText.setText(String.valueOf(valor).concat(" ohms"));
                        flag=0;
                        numero="";
                        valor=0;
                    }
                    break;

                case R.id.amarillo:
                    if (flag < 2) {
                        numero = numero + mamarillo;
                        editText.setText(numero);
                        flag++;
                    } else {
                        valor = (Integer.parseInt(numero))*((int) Math.pow(10, mamarillo));
                        numero= String.valueOf(numero);
                        //editText.setText(String.valueOf(valor));
                        editText.setText(String.valueOf(valor).concat(" ohms"));
                        flag=0;
                        numero="";
                        valor=0;
                    }
                    break;
                case R.id.verde:
                    if (flag < 2) {
                        numero = numero + mverde;
                        editText.setText(numero);
                        flag++;
                    } else {
                        valor = (Integer.parseInt(numero))*((int) Math.pow(10, mverde));
                        numero= String.valueOf(numero);
                        //editText.setText(String.valueOf(valor));
                        editText.setText(String.valueOf(valor).concat(" ohms"));
                        flag=0;
                        numero="";
                        valor=0;
                    }
                    break;
                case R.id.azul:
                    if (flag < 2) {
                        numero = numero + mazul;
                        editText.setText(numero);
                        flag++;
                    } else {
                        valor = (Integer.parseInt(numero))*((int) Math.pow(10, mazul));
                        numero= String.valueOf(numero);
                        //editText.setText(String.valueOf(valor));
                        editText.setText(String.valueOf(valor).concat(" ohms"));
                        flag=0;
                        numero="";
                        valor=0;
                    }
                    break;
                case R.id.violeta:
                    if (flag < 2) {
                        numero = numero + mvioleta;
                        editText.setText(numero);
                        flag++;
                    } else {
                        valor = (Integer.parseInt(numero))*((int) Math.pow(10, mvioleta));
                        numero= String.valueOf(numero);
                        //editText.setText(String.valueOf(valor));
                        editText.setText(String.valueOf(valor).concat(" ohms"));
                        flag=0;
                        numero="";
                        valor=0;
                    }
                    break;
                case R.id.gris:
                    if (flag < 2) {
                        numero = numero + mgris;
                        editText.setText(numero);
                        flag++;
                    } else {
                        //valor = (Integer.parseInt(numero))*((long) Math.pow(10, mgris));
                        valor= (Long.parseLong(numero))*((long)Math.pow(10,mgris));
                        numero= String.valueOf(numero);
                        editText.setText(String.valueOf(valor).concat(" ohms"));
                        flag=0;
                        numero="";
                        valor=0;
                    }
                    break;
                case R.id.blanco:
                    if (flag < 2) {
                        numero = numero + mblanco;
                        editText.setText(numero);
                        flag++;
                    } else {
                        valor = (Integer.parseInt(numero))*((long) Math.pow(10, mblanco));
                        numero= String.valueOf(numero);
                        //editText.setText(String.valueOf(valor));
                        editText.setText(String.valueOf(valor).concat(" ohms"));
                        flag=0;
                        numero="";
                        valor=0;
                    }
                    break;
                case R.id.clr:
                    flag=0;
                    numero="";
                    valor=0;
                    editText.setText("");

                    break;



            }
        }catch (Exception e)
        {editText.setText("error");}
    }
}
