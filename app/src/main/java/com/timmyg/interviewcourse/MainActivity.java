package com.timmyg.interviewcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.timmyg.interviewcourse.data.Converter;
import com.timmyg.interviewcourse.data.ConverterMeters2Feet;

public class MainActivity extends AppCompatActivity {

    EditText et_source;
    EditText et_result;
    Button btn_convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }


    private void initUI() {
        et_source = findViewById(R.id.et_input);
        et_result = findViewById(R.id.et_result);
        btn_convert = findViewById(R.id.btn_convert);
        btn_convert.setOnClickListener(convertListener);
    }

    View.OnClickListener convertListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            float source = Float.parseFloat(et_source.getText().toString());
            Converter converter = new Converter(source);
            String result = String.valueOf(converter.convert(new ConverterMeters2Feet()));
            et_result.setText(result);
        }
    };

}
