package at.fh.swengb.pythagoras;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by 2540p on 16.11.2016.
 */

public class DisplayAboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_about);

        Intent intent = getIntent();

        String message = intent.getStringExtra("resultOfCalc");
        TextView textView = (TextView) findViewById(R.id.resultNumber
        );

        textView.setText(message);

    }
}

