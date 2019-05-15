package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button b2 = (Button)findViewById(R.id.button);
        final EditText txt = (EditText)findViewById(R.id.editText);

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s = new String(txt.getText().toString());
                Log.i("Msg", s);

                Intent intent = new Intent();
                intent.putExtra("Nome", s);
                setResult(10, intent);

                finish();
            }
        });


    }
}
