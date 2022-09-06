package com.example.myquranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ParaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_para);

        ListView listView = findViewById(R.id.listView);
        ArrayList<String> paras = new ArrayList<>();
        paras.add("Paragraph 1");
        paras.add("Paragraph 2");
        paras.add("Paragraph 3");
        paras.add("Paragraph 4");
        paras.add("Paragraph 5");
        paras.add("Paragraph 6");
        paras.add("Paragraph 7");
        paras.add("Paragraph 8");
        paras.add("Paragraph 9");
        paras.add("Paragraph 10");
        paras.add("Paragraph 11");
        paras.add("Paragraph 12");
        paras.add("Paragraph 13");
        paras.add("Paragraph 14");
        paras.add("Paragraph 15");
        paras.add("Paragraph 16");
        paras.add("Paragraph 17");
        paras.add("Paragraph 18");
        paras.add("Paragraph 19");
        paras.add("Paragraph 20");
        paras.add("Paragraph 21");
        paras.add("Paragraph 22");
        paras.add("Paragraph 23");
        paras.add("Paragraph 24");
        paras.add("Paragraph 25");
        paras.add("Paragraph 26");
        paras.add("Paragraph 27");
        paras.add("Paragraph 28");
        paras.add("Paragraph 29");
        paras.add("Paragraph 30");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,paras);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ParaActivity.this,ParaText.class);
                DBhelper dbHelper  = new DBhelper(ParaActivity.this);
                ArrayList<tayah> list =dbHelper.Para(i+1);
                String para = new String();
                para="";
                for (int j = 0; j < list.size(); j++) {
                    tayah t=list.get(j);
                    para+= t.getArabicText().toString();
                }

                intent.putExtra("paraText",para);
                startActivity(intent);
            }
        });




    }
}