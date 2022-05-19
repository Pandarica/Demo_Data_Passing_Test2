package sg.edu.rp.c346.id20022226.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv2 = findViewById(R.id.tv3);

        Intent intentReceived = getIntent();
        int value = intentReceived.getIntExtra("value", 0);
        tv2.setText("Integer value received is: " + value);
    }
}