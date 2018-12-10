package com.example.peska.primos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText n;
    Button boton;
    TextView r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n=(EditText)findViewById(R.id.et2);
        r=(TextView)findViewById(R.id.tv3);
        boton=(Button)findViewById(R.id.bt);
        boton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int num = Integer.parseInt(n.getText().toString());
        int res;
        if(num == 1){res=2;}
        else if(num == 2){res=3;}
        else if(num == 3){res=5;}
        else if(num == 4){res=7;}
        else if(num == 5){res=11;}
        else if(num == 6){res=13;}
        else if(num == 7){res=17;}
        else if(num == 8){res=19;}
        else if(num == 9){res=23;}
        else if(num == 10){res=29;}
        else if(num == 11){res=31;}
        else{res=num*num;}
        r.setText(res + "");

    }
}
