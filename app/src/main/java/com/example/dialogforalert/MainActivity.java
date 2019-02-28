package com.example.dialogforalert;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowAlert(View view) {
        AlertDialog.Builder myAlertDialog = new AlertDialog.Builder(MainActivity.this);
        //set the dialog title and message
        myAlertDialog.setTitle(R.string.alert_title);
        myAlertDialog.setMessage(R.string.alert_message);
        //add the dialog buttons
        myAlertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //user clicked OK button
                Toast.makeText(getApplicationContext(), getString(R.string.ok_button), Toast.LENGTH_SHORT).show();
            }
        });
        myAlertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //user clicked OK button
                Toast.makeText(getApplicationContext(), getString(R.string.cancel_button), Toast.LENGTH_SHORT).show();
            }
        });
        myAlertDialog.show();
    }
}
