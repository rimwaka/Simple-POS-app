package com.example.retrial2;
//Automatically updated imports by IDE.
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

//Defining the textView I will use.
    TextView D_cost, P_cost,T_cost,A_cost, G_T, Discount, Networth, Disc, Net;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//Calling textViews into my class by their IDS.
        D_cost = findViewById(R.id.D_cost);
        P_cost = findViewById(R.id.P_cost);
        T_cost = findViewById(R.id.T_cost);
        A_cost = findViewById(R.id.A_cost);
        G_T = findViewById(R.id.G_T);
        Discount = findViewById(R.id.Dis);
        Networth = findViewById(R.id.Net);
        Disc = findViewById(R.id.DS);
        Net = findViewById(R.id.NT);
//Starting intent to acquire received data from mainActivity1.
        Intent intent = getIntent();
//Acquiring the data using their unique keys and renaming them.
        int first = intent.getIntExtra("key1", 0);
        int second = intent.getIntExtra("key2", 0);
        int third = intent.getIntExtra("key3", 0);
        int fourth = intent.getIntExtra("key4", 0);
        int fifth = intent.getIntExtra("key5", 0);
        float sixth = intent.getFloatExtra("key6", 0);
        float seventh = intent.getFloatExtra("key7", 0);
//Placing the data within the new textView placeholders.
        D_cost.setText(Integer.toString(first));
        P_cost.setText(Integer.toString(second));
        T_cost.setText(Integer.toString(third));
        A_cost.setText(Integer.toString(fourth));
        G_T.setText(Integer.toString(fifth));
        Disc.setText(Float.toString(sixth));
        Net.setText(Float.toString(seventh));
//Regards Rimwaka's Property LtdKe.
        //https://www.stechies.com/click-counter-android-application/
       // https://www.c-sharpcorner.com/blogs/create-simple-click-counter-android-application#:~:text=If%20you%20click%20the%20ClickMe,count%20in%20the%20Application%20screen.&text=Here%2C%20we%20can%20see%20now,times%20in%20an%20app%20screen.&text=Android%20Studio%202.3.
        //https://www.geeksforgeeks.org/android-how-to-send-data-from-one-activity-to-second-activity/
        //https://www.tutorialspoint.com/how-to-pass-values-from-one-activity-to-another-in-android
        //https://www.quora.com/How-would-I-get-an-int-value-from-an-edit-text-view-in-Android-studio
        //https://www.quora.com/How-would-I-get-an-int-value-from-an-edit-text-view-in-Android-studio
        //https://stackoverflow.com/questions/6054562/how-to-make-the-corners-of-a-button-round

    }
}