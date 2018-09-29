package com.delacruz.hanz;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Hanz","onCreate has executed...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Hanz","onStart has executed..");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Hanz","onResume has executed..");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Hanz","onPause has executed..");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Hanz","onStop has executed..");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Hanz","onRestart is again executed..");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Hanz","object is deallocated..");
    }

    public void back(View b){
        Toast.makeText(this,"BACK button works with TOAST.",Toast.LENGTH_LONG).show();
    }

    public void next(View n){
        Snackbar.make(n,"NEXT button works with SNACKBAR.",Snackbar.LENGTH_LONG).show();
    }
}
