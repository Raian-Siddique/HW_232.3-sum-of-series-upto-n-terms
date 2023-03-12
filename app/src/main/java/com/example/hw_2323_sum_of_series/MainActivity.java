package com.example.hw_2323_sum_of_series;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstInput;
    Button button;
    TextView tvDisplay, tvDisplaySum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstInput = findViewById(R.id.firstInput);
        button = findViewById(R.id.button);
        tvDisplay= findViewById(R.id.tvDisplay);
        tvDisplaySum= findViewById(R.id.tvDisplaySum);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvDisplay.setText("");
                tvDisplaySum.setText("");
                long sum=0;
                long series= 0;

                int userInput = Integer.parseInt(firstInput.getText().toString());

                for (int i = 0; i <userInput ; i++) {

                    series = series*10+9;
                    tvDisplay.append(" "+series);
                    sum +=series;
                    tvDisplaySum.setText(""+sum);


                }



            }
        });

    }
}