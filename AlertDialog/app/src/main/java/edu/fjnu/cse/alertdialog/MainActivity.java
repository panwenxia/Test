package edu.fjnu.cse.alertdialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void customView(View source)
    {
        TableLayout loginForm=(TableLayout) getLayoutInflater().inflate(R.layout.activity_main,null);
        new AlertDialog.Builder(this).setTitle("Android App").setView(loginForm)
                .setPositiveButton("Sign in",new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog,int which)
                    {
                    }
                })
                .setNegativeButton("Cancel",new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog,int which)
                    {
                    }
                })
                .create().show();
    }
}
