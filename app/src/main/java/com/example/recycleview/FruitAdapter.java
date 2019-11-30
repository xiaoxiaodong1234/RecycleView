package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;
import java.util.List;
//创建一个水果适配器继承recyclerview adapter
public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder>{
    private List<Fruit> mFruitList;
   static  class ViewHolder extends RecyclerView.ViewHolder{
       View fruitView;
       ImageView fruitimage;
       TextView fruitname;
       public ViewHolder(View view){
           super(view);
           fruitView=view;
        fruitimage=view.findViewById(R.id.image_view);
        fruitname=view.findViewById(R.id.text_view);
       }
    }
    public FruitAdapter(List<Fruit> fruitList){
       mFruitList=fruitList;
    }
    @NonNull
    @Override
    //创建VIEWHOLDER实例
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View view;
         view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item,parent,false);
         final ViewHolder holder=new ViewHolder(view);
         holder.fruitView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 int position=holder.getAdapterPosition();
                 Fruit fruit=mFruitList.get(position);
                 Toast.makeText(v.getContext(), "you clicked view  "+fruit.getName(), Toast.LENGTH_SHORT).show();
             }
         });
         holder.fruitimage.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 int position=holder.getAdapterPosition();
                 Fruit fruit=mFruitList.get(position);
                 Toast.makeText(v.getContext(),"you clicked image  "+fruit.getName(),Toast.LENGTH_SHORT).show();
             }
         });
        return holder ;
    }

    @Override
    //赋值
    public void onBindViewHolder(ViewHolder holder, int position) {
           Fruit fruit=mFruitList.get(position);
           holder.fruitimage.setImageResource(fruit.getImageId());
           holder.fruitname.setText(fruit.getName());
    }

    @Override
    public int getItemCount() {
        return mFruitList.size();
    }
}
