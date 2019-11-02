package com.darayuth.motivationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.beardedhen.androidbootstrap.BootstrapButton;
import com.beardedhen.androidbootstrap.TypefaceProvider;
import com.darayuth.motivationapp.jackMaActivity.listOfQuote;

public class MainActivity extends AppCompatActivity {
    /***private field of this class ***/
    private BootstrapButton bootstrapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TypefaceProvider.registerDefaultIconSets();

        initApp();
    }

    public void Toast(){
        Toast.makeText(getApplicationContext(), "hello", Toast.LENGTH_SHORT).show();
    }
    private void initApp(){
        bootstrapButton = (BootstrapButton)findViewById(R.id.bootStrapBtn);
        bootstrapButton.setOnClickListener(new ButtonClick());
    }

    /**
     * switch to Jack Ma Activity after user clicked.
     */
    private void JackMaActivity(){
        Toast();
        Intent intent = new Intent(this, listOfQuote.class);
        startActivity(intent);
    }

    /**
     * Event on Click listener wrap in ButtonClick class
     */
    class ButtonClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            JackMaActivity();
        }
    }
}
