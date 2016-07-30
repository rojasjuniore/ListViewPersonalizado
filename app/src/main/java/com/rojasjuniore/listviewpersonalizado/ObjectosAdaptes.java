package com.rojasjuniore.listviewpersonalizado;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Junior on 28/07/2016.
 */
public class ObjectosAdaptes extends ArrayAdapter<Objectos> {
    Context myContext;
    int myLayoutResourceId;
    Objectos mydata[] = null;

    public ObjectosAdaptes(Context context, int LayoutResourceId, Objectos[] data) {
        super(context, LayoutResourceId, data);
        this.myContext = context;
        this.mydata = data;
        this.myLayoutResourceId = LayoutResourceId;
    }

    public View getView(int position, View converView, ViewGroup parent) {
        View row = converView;
        ObjectosHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = ((Activity) myContext).getLayoutInflater();
            row = inflater.inflate(myLayoutResourceId, parent, false);

            holder = new ObjectosHolder();
            holder.imageView = (ImageView) row.findViewById(R.id.imagen);
            holder.textView = (TextView) row.findViewById(R.id.tvText);
            row.setTag(holder);
        } else {
            holder = (ObjectosHolder) row.getTag();
        }

        Objectos objectos = mydata[position];
        holder.imageView.setImageResource(objectos.icon);
        holder.textView.setText(objectos.title);

        return row;
    }

    static class ObjectosHolder {
        ImageView imageView;
        TextView textView;
    }


}
