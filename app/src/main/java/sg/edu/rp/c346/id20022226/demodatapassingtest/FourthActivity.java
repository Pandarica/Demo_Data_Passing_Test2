package sg.edu.rp.c346.id20022226.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tv4 = findViewById(R.id.tv4);

        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("value3", 0.0);
        tv4.setText("Boolean value received is: " + value);
    }
}