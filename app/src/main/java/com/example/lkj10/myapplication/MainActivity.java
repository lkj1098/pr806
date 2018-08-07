package com.example.lkj10.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button plus;
    Button minus;
    TextView textView;
    EditText leditText;
    EditText redittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    plus = (Button)findViewById(R.id.button2);
    minus = (Button) findViewById(R.id.button3);
    textView = (TextView) findViewById(R.id.textView);
    leditText = (EditText)findViewById(R.id.editText4);lk
    redittext = (EditText) findViewById(R.id.editText5);

    textView.setText("0");

    plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try{
                int i= Integer.parseInt( leditText.getText().toString()) + Integer.parseInt( redittext.getText().toString());

                textView.setText(i+""); } catch(Exception e) {
                     e.printStackTrace();
                    textView.setText("숫자가 아닙니다.");
        }
            }
        });

        minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try{
                int i= Integer.parseInt( leditText.getText().toString()) - Integer.parseInt( redittext.getText().toString());

                textView.setText(i+""); } catch(Exception e){
                    e.printStackTrace();
                    textView.setText("숫자가 아닙니다.");
                }
            }
        });


    }

}
