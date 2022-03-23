package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView listlifecycle;
    Button tmb_finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todo);

        listlifecycle = (TextView) findViewById(R.id.tv_todo);
        tmb_finish = (Button) findViewById(R.id.btnFinish);

        String isianskenario = "LifeCycle Arsitektur\n"
                +"1. New Isntance (onCreate,OnStart,onResume)\n"
                +"2. Back Arrow (onPause, onStop, onDesctroy)\n"
                +"3. Finish (onPause, onStop, onDestroy)\n"
                +"4. Reopen App (onRestart, onStart, onResume)\n"
                +"5. Home (onPause, onStop)\n"
                +"6. Receipt Call/sms (onRestart, onStart, onResume)\n"
                +"7. rotate (onPause, onStop, onDestroy, onCreate, onStart, onResume)\n";

        listlifecycle.setText(isianskenario);

        Toast.makeText(getApplicationContext(),"onCreate", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"onStart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"onResume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"onPause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"onStop", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(),"onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"onDestroy", Toast.LENGTH_SHORT).show();
    }

}