package edu.nvcc.csc.tkanc.zodiac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    String zodiac="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btnZodiac = (Button) findViewById(R.id.btnZodiac);
        btnZodiac.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Date date = new Date();
                int year = date.getYear() + 1900;
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
            }

        });
        System.out.println(zodiac);
    }
}
