package com.example.sportsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<SportData> sportDatas;

    /**
     * 競技の名前リスト
     */
    ArrayList<String> names;

    /**
     * 画像のリソースの名前リスト
     */
    ArrayList<String> imageNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycle);

        fruitsItemSetUP();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        Adapter adapter = new Adapter(sportDatas);
        recyclerView.setAdapter(adapter);

    }

    /**
     * アイテムデータを設定するメソッド
     */
    private void fruitsItemSetUP() {
        imageNames = new ArrayList<>();
        names = new ArrayList<>();
        sportDatas = new ArrayList<>();

        imageNames.add("basketball");
        imageNames.add("football");
        imageNames.add("ping");
        imageNames.add("tennis");
        imageNames.add("volley");


        names.add("バスケットボール");
        names.add("サッカー");
        names.add("卓球");
        names.add("テニス");
        names.add("バレーボール");;


        for (int i = 0; i < 5; i++) {
            SportData sportData = new SportData(imageNames.get(i), names.get(i));
            sportDatas.add(sportData);
        }
    }
}