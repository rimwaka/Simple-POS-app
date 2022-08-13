package com.example.retrial2;
//Auto importation of required packages
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//Defining the types of characters and terms I will use,(Variables).
    int Counter, mCounter, t_Counter, Tally_mCounter = 0;
    int dd;
    int pp;
    int tt;
    int aa;
    int total;
    float net_pay;
    float discount;

    Button button, button1, button2, button3, button4, button5;
    TextView text, text1, text2, text3;
    @SuppressLint("SetTextI18n") //Auto update by IDE

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// Calling buttons using their IDs.
        button =  findViewById(R.id.button);
        button1 = findViewById(R.id.button2);
        button2 = findViewById(R.id.button3);
        button3 = findViewById(R.id.button4);
        button4 = findViewById(R.id.button5);
        button5 = findViewById(R.id.button6);

//Calling textViews using their IDs for manipulation.
        text =  findViewById(R.id.textView);
        text1 = findViewById(R.id.textView3);
        text2 = findViewById(R.id.textView5);
        text3 = findViewById(R.id.textView2);

//Algorithmic process.
        dd = Tally_mCounter*20;
        pp = Counter*20;
        tt = mCounter*50;
        aa = t_Counter*50;
        total = dd + pp+ tt + aa;

//defining OnClick Listener for every button, the counters to increase on every click and to be displayed on textViews specified.
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Tally_mCounter ++;
                text.setText(Integer.toString(Tally_mCounter));

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Counter ++;
                text1.setText(Integer.toString(Counter));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCounter ++;
                text2.setText(Integer.toString(mCounter));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t_Counter ++;
                text3.setText(Integer.toString(t_Counter));
            }
        });

//Defining RESET button, every counter is reset to zero on it's click.
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Counter= mCounter= Tally_mCounter= t_Counter = 0;
                text.setText(String.valueOf(Counter));
                text1.setText(String.valueOf(Counter));
                text2.setText(String.valueOf(Counter));
                text3.setText(String.valueOf(Counter));

            }
        });

// Converting counted click in form of strings to integers by parseInt() method when this button is clicked.
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bb = text.getText().toString();
                dd = Integer.parseInt(bb);
                String cc = text1.getText().toString();
                pp = Integer.parseInt(cc);
                String ee = text2.getText().toString();
                tt = Integer.parseInt(ee);
                String ff = text3.getText().toString();
                aa = Integer.parseInt(ff);

//Algorithmic process for the desired output.
                total = (dd*20) + (pp*20) + (tt*50) + (aa*50);
                discount =  total * 15/100;
                net_pay = total - discount;

//Using intent to define two.
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
//Sending data with different Keys using intent.putExtra("My keys") methods.
                intent.putExtra("key1", dd*20);
                intent.putExtra("key2", pp*20);
                intent.putExtra("key3", tt*50);
                intent.putExtra("key4", aa*50);
                intent.putExtra("key5", total);
                intent.putExtra("key6", discount);
                intent.putExtra("key7", net_pay);

//Starting activity two
                startActivity(intent);

            }
        });
    }
}