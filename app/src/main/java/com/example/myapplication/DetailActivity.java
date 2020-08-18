package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private int positionCountry;
    TextView tvCountry, tvCases,tvNewCases,tvRecovered,tvDeaths,tvNewDeaths,tvCritical,tvActive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent= getIntent();
        positionCountry=intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Details of"+AffectedCountries.countryModelList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        tvCountry= findViewById(R.id.tvCountry);
        tvCases= findViewById(R.id.tvCases);
        tvNewCases= findViewById(R.id.tvNewCases);
        tvDeaths= findViewById(R.id.tvDeaths);
        tvNewDeaths= findViewById(R.id.tvNewDeaths);
        tvRecovered= findViewById(R.id.tvRecovered);
        tvCritical= findViewById(R.id.tvCritical);
        tvActive= findViewById(R.id.tvActive);

        tvCountry.setText(AffectedCountries.countryModelList.get(positionCountry).getCountry());
        tvCases.setText(AffectedCountries.countryModelList.get(positionCountry).getCases());
        tvNewCases.setText(AffectedCountries.countryModelList.get(positionCountry).getNewCases());
        tvActive.setText(AffectedCountries.countryModelList.get(positionCountry).getActive());
        tvRecovered.setText(AffectedCountries.countryModelList.get(positionCountry).getRecovered());
        tvDeaths.setText(AffectedCountries.countryModelList.get(positionCountry).getDeaths());
        tvNewDeaths.setText(AffectedCountries.countryModelList.get(positionCountry).getNewDeaths());
        tvCritical.setText(AffectedCountries.countryModelList.get(positionCountry).getCritical());
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }

}