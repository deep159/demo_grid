package com.example.hi.grid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ArrayList FLAG;
    GridView mgridview;
    LayoutInflater inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FLAG=new ArrayList();
        FLAG.add(R.drawable.india);
        FLAG.add(R.drawable.canada);
        FLAG.add(R.drawable.america);
        //FLAG.add(R.drawable.bangl);
        FLAG.add(R.drawable.puerto);
        FLAG.add(R.drawable.singa);
        //FLAG.add(R.drawable.skorea);
        FLAG.add(R.drawable.uk);

        mgridview= (GridView) findViewById(R.id.grid);
        gridadapter adapter=new gridadapter(MainActivity.this,FLAG);
        mgridview.setAdapter(adapter);
        mgridview.setOnItemClickListener(this);
        inflater=getLayoutInflater();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position==0){
            myToast("INDIA");
        }
        if(position==1){
            myToast("CANADA");
        }
        if(position==2){
            myToast("AMERICA");
        }
        if(position==3){
            myToast("PUERTO");
        }
        if(position==4){
            myToast("SINGAPORE");
        }
        if(position==5){
            myToast("UK");
        }
        //Toast.makeText(this,"hello",Toast.LENGTH_LONG).show();
    }
    public  void myToast(String msg)
    {
        TextView mMsgTextView;
        Toast t = new Toast(MainActivity.this);
        View view2 = inflater.inflate(R.layout.ctoast, null);
        mMsgTextView= (TextView) view2.findViewById(R.id.ct);
        mMsgTextView.setText(msg);
        t.setView(view2);
        t.setGravity(Gravity.CENTER,0,0);
        t.setDuration(Toast.LENGTH_LONG);
        t.show();
    }
}
