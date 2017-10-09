package com.example.s528759.gdp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void login(View v){

    EditText et=(EditText) findViewById(R.id.editText);
    String str=et.getText().toString();

    Intent in=new Intent(this,Main2Activity.class);
in.putExtra("Name",str);
    startActivity(in);


}

}
