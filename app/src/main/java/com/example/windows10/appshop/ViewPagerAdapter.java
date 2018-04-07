package com.example.windows10.appshop;

/**
 * Created by ASUS on 4/7/2018.
 */

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
<<<<<<< HEAD
    private Integer [] images = {R.drawable.cart_icon,R.drawable.calendar_icon,R.drawable.cart_icon};
=======
    private Integer [] images = {R.drawable.test_img1,R.drawable.test_img2,R.drawable.test_img3};
>>>>>>> a67d99daa91dfd99f9037e7c31bcd3041c1c2d9b

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.sliding_news, null);
        ImageView imageView = view.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);

        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);

    }
}