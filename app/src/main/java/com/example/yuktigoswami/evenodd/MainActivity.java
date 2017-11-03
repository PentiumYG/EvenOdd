package com.example.yuktigoswami.evenodd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView t;
    Button b;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(TextView)findViewById(R.id.textView);
        b=(Button)findViewById(R.id.button);
        e=(EditText)findViewById(R.id.editText);

        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int a;
        String s=e.getText().toString();
        a=Integer.parseInt(s);
        if(a%2==0){
            t.setText("Even No.");
        }
        else{
            t.setText("Odd No.");
        }
        e.setText(null);
    }
}
