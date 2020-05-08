package com.example.currentplacedetailsonmap;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;


public class Stats extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stats_screen);
        ArrayList<String> all_data = new ArrayList<String>();
        String data = " ";
        String entry = " ";
        TextView people_seen = findViewById(R.id.devices_interacted);
        String pseudo_location = "Whole Foods";
        String pseudo_address = "123 Main Street";
            //int year = DeviceListActivity.times.get(i).YEAR; Doesn't work
            int month = DeviceListActivity.times.MONTH;
            int day = DeviceListActivity.times.DAY_OF_MONTH;
            int hour = DeviceListActivity.times.HOUR_OF_DAY;
            int minutes = DeviceListActivity.times.MINUTE;
            //This is used to demostrate how output should look if I went outside
            if(MapsActivityCurrentPlace.location_name == " " || MapsActivityCurrentPlace.location_address == " "){
                entry +=  DeviceListActivity.number_score/2 + " people meet on " + hour + ":" + minutes +" "+ month + "/" + day + "/" + "2020 at " + pseudo_location + " at " + pseudo_address + " \n";
            }else{
                entry +=  DeviceListActivity.people_seen + " meet on " + hour + ":" + minutes +" "+ month + "/" + day + "/" + "2020 at" + MapsActivityCurrentPlace.location_name + " at address " + MapsActivityCurrentPlace.location_address + " \n";
            }
            people_seen.setText(entry);

    }
}
