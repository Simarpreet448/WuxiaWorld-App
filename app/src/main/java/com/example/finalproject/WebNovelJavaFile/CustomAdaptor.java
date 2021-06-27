package com.example.finalproject.WebNovelJavaFile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.finalproject.R;

import java.util.ArrayList;
import java.util.List;

public class CustomAdaptor extends ArrayAdapter<WebNovel>
{
    List<WebNovel> items_list = new ArrayList<>();
    int custom_layout_id;
    Animation animation = AnimationUtils.loadAnimation(getContext(), R.anim.fade_in);

    public CustomAdaptor(@NonNull Context context, int resource, @NonNull List<WebNovel> novels) {
        super(context, resource, novels);
        items_list = novels;
        custom_layout_id = resource;
    }

    @Override
    public int getCount() {
        return items_list.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            // getting reference to the main layout and
            // initializing
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(custom_layout_id, null);
        }

        // initializing the imageview and textview and
        // setting data
        ImageView imageView = view.findViewById(R.id.novelimage);
        TextView textView = view.findViewById(R.id.novelname);

        // get the item using the  position param
        WebNovel item = items_list.get(position);
        imageView.setImageResource(item.getImage());
        imageView.startAnimation(animation);
        textView.setText(item.getName());
        return view;
    }
}
