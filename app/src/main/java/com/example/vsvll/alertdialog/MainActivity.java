package com.example.vsvll.alertdialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    public void onBackPressed(){

        //Toast.makeText(this,"back button is pressed now",Toast.LENGTH_SHORT).show();
        showAlertDialogBox();
        }
    private void showAlertDialogBox(){
        //init alert dialog box
        //Toast.makeText(this,"back button is in Alert Dialog method now",Toast.LENGTH_SHORT).show();

        final AlertDialog.Builder builder;
        builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("Exit");
        builder.setMessage("Are you sure you want to leave?");

        //The following will decide what needs be done.


        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Finish to go back

                finish();

            }


        });

        builder.setNegativeButton("NO", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Dismiss to stay on the same page

                dialog.dismiss();
            }
        });
        //Create the alert dialog and show it.
        builder.create().show();
    }
}
