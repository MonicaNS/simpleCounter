package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView counterText;
    private Button counterButton;
    private String currentCounter;
    private int intCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterText = findViewById(R.id.counterText);
        counterButton = findViewById(R.id.counterButton);

        //Method 1 (Easier, more efficient)

        counterButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                intCounter++;
                counterText.setText(intCounter + " ");

            }

        });

        //Method 2 (just an alternative)
        /**
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentCounter = (String)(counterText.getText());
                int newCounter = Integer.parseInt(currentCounter);
                newCounter++;
                counterText.setText(Integer.toString(newCounter));

            }
        };

        counterButton.setOnClickListener(listener);
         **/
    }

}
