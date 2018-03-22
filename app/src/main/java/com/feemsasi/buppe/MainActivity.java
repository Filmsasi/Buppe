package com.feemsasi.buppe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String rest = "";
    private TextView resttext;
    private TextView resttext2;
    private Button btnsend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resttext = findViewById(R.id.rest);
        resttext2 = findViewById(R.id.rest2);
        btnsend = findViewById(R.id.send);

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rest = "คนที่คุณชอบได้แก่" + rest;
                resttext.setText(rest);
            }
        });

    }

    public void onCheckboxClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.cast1 :
                if (checked) {
                    rest = rest + getString(R.string.name_name1) + ", ";
                }
                break;
            case R.id.cast2 :
                if (checked) {
                    rest = rest + getString(R.string.name_name2) + ", ";
                }
                break;
            case R.id.cast3 :
                if (checked) {
                    rest = rest + getString(R.string.name_name3) + ", ";
                }
                break;
            case R.id.cast4 :
                if (checked) {
                    rest = rest + getString(R.string.name_name4) + ", ";
                }
                break;
            case R.id.cast5 :
                if (checked) {
                    rest = rest + getString(R.string.name_name5) + ", ";
                }
                break;
            case R.id.cast6 :
                if (checked) {
                    rest = rest + getString(R.string.name_name6) + ", ";
                }
                break;
            case R.id.cast7 :
                if (checked) {
                    rest = rest + getString(R.string.name_name7) + ", ";
                }
                break;
            case R.id.cast8 :
                if (checked) {
                    rest = rest + getString(R.string.name_name8) + ", ";
                }
                break;
        }
    }

    public void onRadioButtonChecked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        String text = "คนที่เหมาะสมกับคุณพี่คือ ";

        switch(view.getId()) {
            case R.id.cast9 :
                if (checked) {
                    text = text + getString(R.string.name_name9);
                    resttext2.setText(text);
                }
                break;
            case R.id.cast10 :
                if (checked) {
                    text = text + getString(R.string.name_name10);
                    resttext2.setText(text);
                }
                break;
        }
    }
}
