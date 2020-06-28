package com.example.aplicativo2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ActivitySecond extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        inTheActivitySecond();
    }

    private void inTheActivitySecond() {
        Bundle b = getIntent().getExtras();
        String day1 = null;
        String day2 = null;
        String day3 = null;
        TextView vData1 = findViewById(R.id.textData);
        TextView vData2 = findViewById(R.id.textData2);
        TextView vData3 = findViewById(R.id.textData3);
        if (b != null) {
            day1 = b.getString("data1");
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date date1 = new Date(day1);
            String dataFormatada1 = formato.format(date1);
            vData1.setText(dataFormatada1);

            day2 = b.getString("data2");
            Date date2 = new Date(day2);
            String dataFormatada2 = formato.format(date2);
            vData2.setText(dataFormatada2);

            day3 = b.getString("data3");
            Date date3 = new Date(day3);
            String dataFormatada3 = formato.format(date3);
            vData3.setText(dataFormatada3);
        }
    }
}
