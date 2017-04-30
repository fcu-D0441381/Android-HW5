package com.example.user_pc.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ListView lv=(ListView)findViewById(R.id.LV) ;
       /* List NBAlist = new ArrayList<NBAItem>();
        ArrayList <String>test = new ArrayList<String>();
       test.add("為什麼");
        test.add("沒辦法");
        test.add("接受adapter");
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,test);
        lv.setAdapter(adapter);*/
       ArrayList nbaitem = new ArrayList<NBAItem>();
        NBAItem item = new NBAItem(R.drawable.grizzlies,"Grizzlies","87",R.drawable.rockets,"Rockets","102");
        nbaitem.add(item);
        NBA_adapter adapter = new NBA_adapter(this,nbaitem);
        lv.setAdapter(adapter);
       /* NBAItem team1=new NBAItem(R.drawable.grizzlies,"Grizzlies","87",R.drawable.rockets,"Rockets","102");
        NBAlist.add(team1);

        NBA_adapter adapter=new NBA_adapter(this,R.layout.own_list,NBAlist);

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(onItemClickListener);
        */
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    AdapterView.OnItemClickListener onItemClickListener=new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            int[] imgid=null;
            switch (position){
                case 0:
                    break;
                case 1:
                    break;
            }
        }
    } ;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
