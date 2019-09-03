package com.example.triathlonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    double costperAthlete = 725.00;
    int numberAthletes;
    double totalCost;
    String citySelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText athletes = (EditText)findViewById(R.id.editText3);
        final Spinner group = (Spinner)findViewById(R.id.cityNames);
        final TextView result = ((TextView)findViewById(R.id.totalResult));
        Button button = (Button)findViewById(R.id.calculateButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberAthletes = Integer.parseInt(athletes.getText().toString());
                totalCost = costperAthlete * numberAthletes;
                DecimalFormat currency = new DecimalFormat("$###,###.##");
                citySelection = group.getSelectedItem().toString();
                result.setText(currency.format(totalCost));
            }
        });
    }
}
