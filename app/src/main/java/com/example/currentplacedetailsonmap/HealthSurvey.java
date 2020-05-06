package com.example.currentplacedetailsonmap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.content.SharedPreferences;



public class HealthSurvey extends Activity {
    static int health_score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.health_survey);
        final Button submit = findViewById(R.id.submit);
        final CheckBox is_65 = findViewById(R.id.sixtyfive_yes);
        final CheckBox cld = findViewById(R.id.cld);
        final CheckBox asthma = findViewById(R.id.asthma);
        final CheckBox compromised = findViewById(R.id.compromised);
        final CheckBox BMI = findViewById(R.id.BMI);
        final CheckBox ckd = findViewById(R.id.ckd);
        final CheckBox ld = findViewById(R.id.ld);
        final CheckBox heart = findViewById(R.id.heart);
        final CheckBox diabetes = findViewById(R.id.diabetes);
        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                health_score = 0;
                health_score += computeScore(is_65);
                health_score += computeScore(cld);
                health_score += computeScore(asthma);
                health_score += computeScore(compromised);
                health_score += computeScore(BMI);
                health_score += computeScore(ckd);
                health_score += computeScore(ld);
                health_score +=computeScore(heart);
                health_score += computeScore(diabetes);
                System.out.println(health_score);
                startActivity(new Intent(HealthSurvey.this, MapsActivityCurrentPlace.class));
            }
        });
    }
    protected int computeScore(CheckBox check){
        if(check.isChecked()){
            return 1;
        }else{
            return 0;
        }
    }
}
