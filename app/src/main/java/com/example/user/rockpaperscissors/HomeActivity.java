package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 09/11/2016.
 */

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBoringButton;
    private Button mSpicyButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mBoringButton = (Button) findViewById(R.id.BORING);
        mSpicyButton = (Button) findViewById(R.id.SPICY);

        mBoringButton.setOnClickListener( this );
        mSpicyButton.setOnClickListener( this );

    }

    @Override
    public void onClick(View view) {
        int viewId = view.getId();
        Intent intent = null;
        if (viewId == R.id.BORING) {
            intent = new Intent(this, BoringActivity.class);
        } else {
            intent = new Intent(this, SpicyActivity.class);
        }
        startActivity(intent);
    }
}
