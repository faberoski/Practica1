package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button0, button1, button2, button3, button4, button5;
    Button button6, button7, button8, button9, buttonigual, buttonc;
    Button buttonsum, buttonrest, buttonmult, buttondiv, buttondot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.eNumero);
        button0=(Button) findViewById(R.id.b0);
        button1=(Button) findViewById(R.id.b1);
        button2=(Button) findViewById(R.id.b2);
        button3=(Button) findViewById(R.id.b3);
        button4=(Button) findViewById(R.id.b4);
        button5=(Button) findViewById(R.id.b5);
        button6=(Button) findViewById(R.id.b6);
        button7=(Button) findViewById(R.id.b7);
        button8=(Button) findViewById(R.id.b8);
        button9=(Button) findViewById(R.id.b9);
        buttonsum=(Button) findViewById(R.id.suma);
        buttonrest=(Button) findViewById(R.id.resta);
        buttonmult=(Button) findViewById(R.id.multiplicacion);
        buttondiv=(Button) findViewById(R.id.division);
        buttonc=(Button) findViewById(R.id.bclr);
        buttonigual=(Button) findViewById(R.id.bequal);
        buttondot=(Button) findViewById(R.id.bdot);
    }
    String numero="";
    boolean punto=false;
    int flag=0;
    Double memoria=0.0, memoria2=0.0, memoria3=0.0, ans=0.0;
    public void pressed (View view){


        int id=view.getId();

        try{
        switch (id) {
            case R.id.b0:
                numero = numero.concat("0");
                editText.setText(numero);
                break;
            case R.id.b1:
                numero = numero.concat("1");
                editText.setText(numero);
                break;
            case R.id.b2:
                numero = numero.concat("2");
                editText.setText(numero);
                break;
            case R.id.b3:
                numero = numero.concat("3");
                editText.setText(numero);
                break;
            case R.id.b4:
                numero = numero.concat("4");
                editText.setText(numero);
                break;
            case R.id.b5:
                numero = numero.concat("5");
                editText.setText(numero);
                break;
            case R.id.b6:
                numero = numero.concat("6");
                editText.setText(numero);
                break;
            case R.id.b7:
                numero = numero.concat("7");
                editText.setText(numero);
                break;
            case R.id.b8:
                numero = numero.concat("8");
                editText.setText(numero);
                break;
            case R.id.b9:
                numero = numero.concat("9");
                editText.setText(numero);
                break;
            case R.id.bdot:
                if (punto == false) {
                    numero = numero.concat(".");
                    editText.setText(numero);
                    punto = true;
                } else return;
                break;
            case R.id.suma:
                //memoria = Double.parseDouble(numero);
                memoria=Double.parseDouble(editText.getText().toString());
                editText.setText("");
                flag = 1;
                numero = "";
                punto = false;
                break;
            case R.id.resta:
                //memoria = Double.parseDouble(numero);
                memoria=Double.parseDouble(editText.getText().toString());
                editText.setText(numero);
                flag = 2;
                numero = "";
                punto = false;
                break;
            case R.id.multiplicacion:
                //memoria = Double.parseDouble(numero);
                memoria=Double.parseDouble(editText.getText().toString());
                editText.setText(numero);
                flag = 3;
                numero = "";
                punto = false;
                break;
            case R.id.division:
                //memoria = Double.parseDouble(numero);
                memoria=Double.parseDouble(editText.getText().toString());
                editText.setText(numero);
                flag = 4;
                numero = "";
                punto = false;
                break;
            case R.id.bclr:
                memoria = 0.0;
                memoria2 = 0.0;
                ans = 0.0;
                numero = "";
                punto = false;
                editText.setText("");
                break;

            case R.id.bequal:
                if (ans != 0.0) {
                    memoria3 = ans;
                    //////////////////////////}
                    memoria2 = Double.parseDouble(numero);
                    if (flag == 1) {
                        ans = memoria3 + memoria2;
                        flag = 0;
                    }
                    if (flag == 2) {
                        ans = memoria3 - memoria2;
                        flag = 0;
                    }
                    if (flag == 3) {
                        ans = memoria3 * memoria2;
                        flag = 0;
                    }
                    if (flag == 4) {
                        ans = memoria3 / memoria2;
                        flag = 0;
                    }
                }else {
                    memoria2 = Double.parseDouble(numero);
                    if (flag == 1) {
                        ans = memoria + memoria2;
                        flag = 0;
                    }
                    if (flag == 2) {
                        ans = memoria - memoria2;
                        flag = 0;
                    }
                    if (flag == 3) {
                        ans = memoria * memoria2;
                        flag = 0;
                    }
                    if (flag == 4) {
                        ans = memoria / memoria2;
                        flag = 0;
                    }
                }

                editText.setText(ans.toString());
                //flag = 0;
                numero = "";

                break;
        }


        }catch (Exception e)
        {editText.setText("error");}
    }
}
