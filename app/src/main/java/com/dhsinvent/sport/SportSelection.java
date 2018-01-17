package com.dhsinvent.sport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SportSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_selection);

        configureBasketballSelection();
    }

    private void configureBasketballSelection() {
        Button basketballSelection = (Button) findViewById(R.id.basketballSelection);
        basketballSelection.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(SportSelection.this, LevelBaskatball.class));
                }

        })
    }
}
