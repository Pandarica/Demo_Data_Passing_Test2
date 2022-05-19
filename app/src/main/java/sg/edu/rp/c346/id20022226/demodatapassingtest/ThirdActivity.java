package sg.edu.rp.c346.id20022226.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tv3 = findViewById(R.id.tv3);

        Intent intentReceived = getIntent();
        char value = intentReceived.getCharExtra("value2", 'z');
        tv3.setText("Character value received is: " + value);
    }
}