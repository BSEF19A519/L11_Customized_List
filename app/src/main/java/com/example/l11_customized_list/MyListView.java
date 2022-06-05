package com.example.l11_customized_list;

import android.app.Activity;
import android.widget.ArrayAdapter;

public class MyListView extends ArrayAdapter {
     private final Activity context;
     private final String[] maintitle;
     private final String[] subtitle;
     private final Integer[] imgid;
     public MyListView(Activity context, String[] maintitle, String[] subtitle, Integer[] imgid)
     {
         super(context, R.layout.activity_student_view, maintitle);
         this.context=context;
         this.maintitle=maintitle;
         this.subtitle=subtitle;
         this.imgid=imgid;    }

    }
