package com.example.l11_customized_list;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<Students> {
       public MyAdapter(Context context, ArrayList<Students> studentArrayList)
        {
            super(context, 0, studentArrayList);
        }
       @Override
       public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
       {
              Students student = getItem(position);
              convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_student_view, parent, false);
                      TextView textViewName =  convertView.findViewById(R.id.txtName);
                      TextView textViewDegree = convertView.findViewById(R.id.txtDegree);
                      TextView textViewId = convertView.findViewById(R.id.txtId);

              ImageView imageView = convertView.findViewById(R.id.imageView);
              textViewName.setText(student.name);
              textViewDegree.setText(student.degree);
              textViewId.setText(student.rollNumber);
              imageView.setImageResource(student.imageID);
              return convertView;    }


}
