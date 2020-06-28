package com.example.aplicativo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    Date vData1, vData2, vData3;
    EditText vCPF, vDtNascimento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void consultar(View view) throws ParseException {
        vCPF = findViewById(R.id.editText);
        vDtNascimento = findViewById(R.id.data2);

        String s = String.valueOf(vDtNascimento.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date date = sdf.parse(s);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        if (dia >= 1 && dia <= 10){
            cal.add(Calendar.MONTH,1);
            cal.set(Calendar.DAY_OF_MONTH,5);
            cal.set(Calendar.YEAR,2020);
            vData1 = cal.getTime();
            cal.add(Calendar.MONTH,1);
            vData2 = cal.getTime();
            cal.add(Calendar.MONTH,1);
            vData3 = cal.getTime();
            Toast.makeText(this, vData1.toString()+" - "+vData2.toString()+" - "+vData3.toString(), Toast.LENGTH_LONG).show();
        } else if (dia >= 11 && dia <= 20){
            cal.add(Calendar.MONTH,1);
            cal.set(Calendar.DAY_OF_MONTH,10);
            cal.set(Calendar.YEAR,2020);
            vData1 = cal.getTime();
            cal.add(Calendar.MONTH,1);
            vData2 = cal.getTime();
            cal.add(Calendar.MONTH,1);
            vData3 = cal.getTime();
            Toast.makeText(this, vData1.toString()+" - "+vData2.toString()+" - "+vData3.toString(), Toast.LENGTH_LONG).show();
        } else if (dia >= 21 && dia <= 31){
            cal.add(Calendar.MONTH,1);
            cal.set(Calendar.DAY_OF_MONTH,15);
            cal.set(Calendar.YEAR,2020);
            vData1 = cal.getTime();
            cal.add(Calendar.MONTH,1);
            vData2 = cal.getTime();
            cal.add(Calendar.MONTH,1);
            vData3 = cal.getTime();
            Toast.makeText(this, vData1.toString()+" - "+vData2.toString()+" - "+vData3.toString(), Toast.LENGTH_LONG).show();
        }

        Intent intent = new Intent(MainActivity.this, ActivitySecond.class);
        Bundle b = new Bundle();
        b.putString("data1", vData1.toString());
        b.putString("data2", vData2.toString());
        b.putString("data3", vData3.toString());
        intent.putExtras(b);
        startActivity(intent);
        finish();

    }

}
