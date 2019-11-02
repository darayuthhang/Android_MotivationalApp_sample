package com.darayuth.motivationapp.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.darayuth.motivationapp.R;
import com.darayuth.motivationapp.model.JackMaQuote;
import com.darayuth.motivationapp.model.Quote;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomAdapter extends ArrayAdapter {
    private Context context;
    private List<JackMaQuote> jackMaQuoteList;

    // View lookup cache
    private static class ViewHolder {
        TextView textView;
        ImageView image;
    }

    /****
     *
     * @param context context of the android default
     * @param resource resourece is the layout list view
     * @param list list collection of item for particular object
     */
    public CustomAdapter(@NonNull Context context, int resource, List<JackMaQuote> list) {
        super(context, resource, list);
        this.context = context;
        this.jackMaQuoteList = list;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull final ViewGroup parent) {
        View rowView = convertView;
        ViewHolder viewHolder;

        //get the object inside the colletion arraylist.
        JackMaQuote jackMaQuote = this.jackMaQuoteList.get(position);

        if(rowView == null){
            viewHolder = new ViewHolder();
            rowView = LayoutInflater.from(this.context).inflate(R.layout.listview_row,parent,false);
            //get referencec of the layout image view from listview xml.
            viewHolder.image = (ImageView) rowView.findViewById(R.id.jackMaImageView);
            //get referencec of the layout image textview from listview xml.
            viewHolder.textView = (TextView) rowView.findViewById(R.id.jackMaTextView);

        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.image.setImageResource(jackMaQuote.getImage());
        viewHolder.textView.setText(jackMaQuote.getQuote());
        return rowView  ;

    }


}
