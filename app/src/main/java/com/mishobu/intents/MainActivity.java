package com.mishobu.intents;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn2 = (Button) findViewById(R.id.button1);

        btn2.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent();
                String packageName = "com.betosoft.intentsex";
                String className = "com.betosoft.intentsex.SecondActivity";
                intent.setClassName(packageName, className);
                startActivity(intent);

            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
