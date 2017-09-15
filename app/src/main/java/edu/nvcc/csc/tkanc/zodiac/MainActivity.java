package edu.nvcc.csc.tkanc.zodiac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    String zodiac="zodiac";
    int year=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btnZodiac = (Button) findViewById(R.id.btnZodiac);
        final TextView textView = (TextView) findViewById(R.id.textView);
        final DatePicker datePicker = (DatePicker) findViewById(R.id.datePicker);
        final EditText yearText = (EditText) findViewById(R.id.yearText);
        btnZodiac.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                //Date date = new Date();
                year = datePicker.getYear();
                System.out.println(year);
                switch (year % 12) {
                    case 0:
                        zodiac = "monkey";
                        break;
                    case 1:
                        zodiac = "rooster";
                        break;
                    case 2:
                        zodiac ="dog";
                        break;
                    case 3:
                        zodiac ="pig";
                        break;
                    case 4:
                        zodiac ="rat";
                        break;
                    case 5:
                        zodiac ="ox";
                        break;
                    case 6:
                        zodiac ="tiger";
                        break;
                    case 7:
                        zodiac ="rabbit";
                        break;
                    case 8:
                        zodiac ="dragon";
                        break;
                    case 9:
                        zodiac ="snake";
                        break;
                    case 10:
                        zodiac ="horse";
                        break;
                    case 11:
                        zodiac ="sheep";
                }
                textView.setText("The zodiac for " + year + " is " + zodiac + ".");
            }
        });
        System.out.println("The zodiac for " + year + " is " + zodiac + ".");
    }
}
