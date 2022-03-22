package com.example.robin_toussaint_hw2;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView


public class MainActivity extends AppCompatActivity {

    private static final String TAG= MainActivity.class.getSimpleName();
    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView=(TextView)findViewById(R.id.textView);
        Log.i(TAG, msg: "OnCreate is called");

    }

    @Override
    protected void onStart() {
        super.onStart();
        msg+="onStart is called \n";
        Log.i(TAG, msg: "onStart is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        msg+="onStop is called \n";
        Log.i(TAG, msg:"onStop is called");
    }

    Override
    protected void onPause() {
        super.onPause();
        msg+="onPause is called \n";
        Log.i(TAG, msg: "onPause is called");
    }

    Override
    protected void onResume() {
        super.onResume();
        msg+="onResume is called \n";
        Log.i(TAG, msg:"onResume is called");
    }

    public void doSomething(View view) {
        myTextView.setText(msg);
    }
}