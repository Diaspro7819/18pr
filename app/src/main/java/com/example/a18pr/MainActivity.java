package com.example.a18pr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    String[] from = {"image", "text", "checkbox"};
    int[] to = {R.id.imageView, R.id.textView, R.id.checkBox};
    List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Map<String, Object> map;
        int[] images = {R.drawable.dd, R.drawable.photo, R.drawable.photo2};
        String[] texts = {"Item 1", "Item 2", "Item 3"};
        boolean[] checkboxes = {false, true, false};

        for (int i = 0; i < images.length; i++) {
            map = new HashMap<String, Object>();
            map.put("image", images[i]);
            map.put("text", texts[i]);
            map.put("checkbox", checkboxes[i]);
            data.add(map);

        }
        // Определяем массивы идентификаторов View-компонентов и соответствующих им ключей в Map
        String[] from = {"image", "text", "checkbox"};
        int[] to = {R.id.imageView, R.id.textView, R.id.checkBox};

        // Создаем адаптер и устанавливаем его для ListView
        SimpleAdapter adapter = new SimpleAdapter(this, data, R.layout.list_item, from, to);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}