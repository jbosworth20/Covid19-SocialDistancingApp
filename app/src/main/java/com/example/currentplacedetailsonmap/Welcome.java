package com.example.currentplacedetailsonmap;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;



public class Welcome extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);
        //Set up the survey button
        final Button survey = findViewById(R.id.survey_button);
        //Set up the scanning button
        final Button scanning = findViewById(R.id.scanning_button);
        scanning.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(Welcome.this, MapsActivityCurrentPlace.class));
            }
        });
        survey.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(Welcome.this, HealthSurvey.class));
            }
        });
    }


}
