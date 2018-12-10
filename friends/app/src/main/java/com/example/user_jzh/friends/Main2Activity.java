package com.example.user_jzh.friends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        String exam=null;
        exam="这是我的第三条说说";
        List<String> data=Arrays.asList(exam);
        Adapat adapat=new Adapat(this,R.layout.layout,data);
        ListView listView=(ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapat);

        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        listView.setAdapter(adapat);
        Button send=findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Main2Activity.this,SendFace.class);
                startActivity(intent1);
            }
        });
    }
}
