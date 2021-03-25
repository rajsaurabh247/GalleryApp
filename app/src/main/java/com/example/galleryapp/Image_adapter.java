package com.example.galleryapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class Image_adapter extends BaseAdapter {


    private Context mContext;

    public int[] imageArray={
         R.drawable.a,
         R.drawable.b,
         R.drawable.c,
         R.drawable.d,
         R.drawable.e,
         R.drawable.f,
         R.drawable.g,
         R.drawable.h,
         R.drawable.i,
         R.drawable.j,
         R.drawable.k,
         R.drawable.l,
         R.drawable.m,
         R.drawable.n,
         R.drawable.o,
         R.drawable.p,
         R.drawable.q,
         R.drawable.r,
         R.drawable.s,
         R.drawable.t,
         R.drawable.u,
    };

    public Image_adapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int position) {
        return imageArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        ImageView imageView=new ImageView(mContext);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(340,350));
        return imageView;
    }
}
