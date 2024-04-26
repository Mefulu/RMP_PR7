package com.example.myapplication_pr7.UI.View;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication_pr7.DATA.Model.DataListRecycler;
import com.example.myapplication_pr7.R;

public class T_Screen extends Fragment {

    public ArrayList<DataListRecycler> Items = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        for (int i = 0; i < 200; i++) {
            String line = "item #" + (i+1);
            DataListRecycler list = new DataListRecycler(line, R.drawable.flower);
            Items.add(list);
        }

        View view = inflater.inflate(R.layout.t_screen, container, false);
        RecyclerView itemsList = view.findViewById(R.id.recycler_view);
        MyRecyclerAdapter adapter = new MyRecyclerAdapter(getContext(), Items);
        LinearLayoutManager layoutManager = new LinearLayoutManager(requireContext());
        itemsList.setLayoutManager(layoutManager);
        itemsList.setAdapter(adapter);

        return view;
    }

}