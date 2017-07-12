package com.dlshare.dlshare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    static int times = 5;
    static int CUNT = 100000;
    Map<String, Person> persons = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Thread("子线程"){
            @Override
            public void run() {
                super.run();
                while (times>0){
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    times--;
                    for (int i = 0; i < CUNT; i++) {
                        Person person = new Person("dlshare", 28);
                        persons.put("" + i, person);
                    }
                }
            }
        }.start();

    }
}
