package com.example.user_pc.myapplication;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;


public class NBA_adapter extends BaseAdapter {
    Context context;
    List<NBAItem> items;
    public NBA_adapter(Context context, List<NBAItem> items)
    {
        this.context=context;
        this.items=items;
    }
//
    private class viewholder{
    ImageView i1;
    ImageView i2;
    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
}
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        viewholder holder=null;
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

//        LinearLayout itemlayout = null;
        if(convertView==null)
        {
//            itemlayout=(LinearLayout)inflater.inflate(R.layout.own_list,null);
            convertView=inflater.inflate(R.layout.own_list,null);
            holder = new viewholder();
            holder.i1=(ImageView)convertView.findViewById(R.id.itemiv1);
            holder.i2=(ImageView)convertView.findViewById(R.id.itemiv2);
            holder.t1=(TextView)convertView.findViewById(R.id.textView1);
            holder.t2=(TextView)convertView.findViewById(R.id.textView2);
            holder.t3=(TextView)convertView.findViewById(R.id.textView3);
            holder.t4=(TextView)convertView.findViewById(R.id.textView4);
            convertView.setTag(holder);
        }
        else
        {
//            itemlayout=(LinearLayout)convertView;
            holder=(viewholder)convertView.getTag();
        }
        NBAItem nbaitem = (NBAItem) getItem(position);
        holder.i1.setImageResource(nbaitem.getHostid());
        holder.t1.setText(nbaitem.getHostname());
        holder.t2.setText(nbaitem.getHostscore());
        holder.i2.setImageResource(nbaitem.getGuestid());
        holder.t3.setText(nbaitem.getGuestname());
        holder.t4.setText(nbaitem.getGuestscore());
        return convertView;

       /* NBAItem item=(NBAItem)getItem(position);
        ImageView H_img=(ImageView) itemlayout.findViewById(R.id.itemiv1);
        H_img.setImageResource(item.getHostid());
        TextView H_name=(TextView)itemlayout.findViewById(R.id.textView1);
        H_name.setText(item.getHostname());
        TextView H_score=(TextView)itemlayout.findViewById(R.id.textView2);
        H_score.setText(item.getHostscore());

        ImageView G_img=(ImageView)itemlayout.findViewById(R.id.itemiv2);
        G_img.setImageResource(item.getGuestid());
        TextView G_name=(TextView)itemlayout.findViewById(R.id.textView3);
        G_name.setText(item.getGuestname());
        TextView G_score=(TextView)itemlayout.findViewById(R.id.textView4);
        G_score.setText(item.getGuestscore());*/

//        return itemlayout;

    }
    @Override
    public int getCount()
    {
        return items.size();
    }
    @Override
    public Object getItem(int position)
    {
        return items.get(position);
    }
    @Override
    public long getItemId(int position)
    {
        return items.indexOf(getItem(position));
    }
}
