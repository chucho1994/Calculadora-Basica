package com.example.operacionesvacicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText ingresevalorA,ingresevalorB;
    Button  b_suma,b_resta,b_multiplicacion,b_divicion;





    int contador = 1;//Nos servira para movernos entre metodo registrar y borrar dependiendo las
    //condiciones se empiesa en uno por que si damos en borrar mientras llenamos campos  se borra y
    //no tiene que ser asi se llenan todos los campos se da en registrar y luego ya se puede  borrar


    int suma=0,valor1=0,valor2=0,resta=0,multiplicacion=0,contadorTodo=0;
    String cadena1,cadena2;
    float division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ingresevalorA = (EditText) findViewById(R.id.id_valor_A);
        ingresevalorB = (EditText) findViewById(R.id.id_valorB);






    }

    public void suma(View view){


         cadena1=ingresevalorA.getText().toString();
         cadena2=ingresevalorB.getText().toString();

        if(cadena1.length()!=0&&cadena2.length()!=0){
            valor1=Integer.parseInt(cadena1);
            valor2=Integer.parseInt(cadena2);
            suma=valor1+valor2;

            Toast.makeText(this, "La suma es : "+suma,Toast.LENGTH_LONG).show();
        }
        else if (cadena1.length()==0&&cadena2.length()!=0){
            Toast.makeText(this, "Ingrese valor A",Toast.LENGTH_LONG).show();
        }else if(cadena1.length()!=0&&cadena2.length()==0){
            Toast.makeText(this, "Ingrese valor B",Toast.LENGTH_LONG).show();
        }else if(cadena1.length()==0&&cadena2.length()==0){
            Toast.makeText(this, "Faltan llenar los campos A y B",Toast.LENGTH_LONG).show();

        }



    }
    public void resta(View view){
        cadena1=ingresevalorA.getText().toString();
        cadena2=ingresevalorB.getText().toString();
        if(cadena1.length()!=0&&cadena2.length()!=0){
            valor1=Integer.parseInt(cadena1);
            valor2=Integer.parseInt(cadena2);
            resta=valor1-valor2;

            Toast.makeText(this, "La resta es : "+resta,Toast.LENGTH_LONG).show();
        }
        else if (cadena1.length()==0&&cadena2.length()!=0){
        Toast.makeText(this, "Ingrese valor A",Toast.LENGTH_LONG).show();
    }else if(cadena1.length()!=0&&cadena2.length()==0){
        Toast.makeText(this, "Ingrese valor B",Toast.LENGTH_LONG).show();
    }else if(cadena1.length()==0&&cadena2.length()==0){
        Toast.makeText(this, "Faltan llenar los campos A y B",Toast.LENGTH_LONG).show();

    }

    }
    public void multiplicacion(View view){
        cadena1=ingresevalorA.getText().toString();
        cadena2=ingresevalorB.getText().toString();

        if(cadena1.length()!=0&&cadena2.length()!=0){
            valor1=Integer.parseInt(cadena1);
            valor2=Integer.parseInt(cadena2);
            multiplicacion=valor1*valor2;

            Toast.makeText(this, "La multiplicacion es : "+multiplicacion,Toast.LENGTH_LONG).show();
        }
        else if (cadena1.length()==0&&cadena2.length()!=0){
        Toast.makeText(this, "Ingrese valor A",Toast.LENGTH_LONG).show();
    }else if(cadena1.length()!=0&&cadena2.length()==0){
        Toast.makeText(this, "Ingrese valor B",Toast.LENGTH_LONG).show();
    }else if(cadena1.length()==0&&cadena2.length()==0){
        Toast.makeText(this, "Faltan llenar los campos A y B",Toast.LENGTH_LONG).show();

    }


    }
    public void divicion(View view){

        cadena1=ingresevalorA.getText().toString();
        cadena2=ingresevalorB.getText().toString();
         float valor11=0,valor22=0;
        if(cadena1.length()!=0&&cadena2.length()!=0){
            valor11=Float.parseFloat(cadena1);
            valor22=Float.parseFloat(cadena2);
            division=valor11/valor22;

            Toast.makeText(this, "La division es : "+division,Toast.LENGTH_LONG).show();
        }
        else if (cadena1.length()==0&&cadena2.length()!=0){
            Toast.makeText(this, "Ingrese valor A",Toast.LENGTH_LONG).show();
        }else if(cadena1.length()!=0&&cadena2.length()==0){
            Toast.makeText(this, "Ingrese valor B",Toast.LENGTH_LONG).show();
        }else if(cadena1.length()==0&&cadena2.length()==0){
            Toast.makeText(this, "Faltan llenar los campos A y B",Toast.LENGTH_LONG).show();

        }

    }

    public void reiniciar(View accionar){

        ingresevalorA.setText("");
        ingresevalorB.setText("");

        resta=0;
        multiplicacion=0;
        division=0;


    }



}