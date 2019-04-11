package com.example.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setBackgroundDrawableResource(R.drawable.bird);
    }
    int size=30;
    TextView a=findViewById(R.id.textView);
    EditText ed1=findViewById(R.id.editText),ed2=findViewById(R.id.editText2),ed3=findViewById(R.id.editText3);
    public void response(View v){
        float height=Float.parseFloat(ed2.getText().toString());
        float weight=Float.parseFloat(ed3.getText().toString());
        float bmi=BMI(height,weight);
        String bmi2=String.valueOf(bmi);
        a.setTextSize(size);
        a.setText(ed1.getText().toString()+"Hello"+"\n"+"Your BMI is: "+bmi2);
    }
    public float BMI(float tall,float fat){
        return (float)(fat/Math.pow(tall,2));
    }
    private String ChangePic(float std){
        String text=null;
        if(std>25){
            text=new String("You are too heavy!");
            getW
        }
    }
}
