package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView = findViewById(R.id.recycle_view);
    LinearLayoutManager layoutManager=new LinearLayoutManager(MainActivity.this);
    recyclerView.setLayoutManager(layoutManager);
    FruitAdapter adapter=new FruitAdapter( fruitList);
    recyclerView.setAdapter(adapter);

    }
    private  void initFruits(){
        for(int i=0;i<15;i++){
            Fruit apple=new Fruit("Apple",R.drawable.apple);
            fruitList.add(apple);
            Fruit pear=new Fruit("Pear",R.drawable.pear);
            fruitList.add(pear);
            Fruit orange=new Fruit("Orange",R.drawable.orange);
            fruitList.add(orange);
            Fruit watermelon=new Fruit("Watermelon",R.drawable.watermelon);
            fruitList.add(watermelon);
            Fruit banana=new Fruit("banana",R.drawable.banana);
            fruitList.add(banana);
        }
    }
}
