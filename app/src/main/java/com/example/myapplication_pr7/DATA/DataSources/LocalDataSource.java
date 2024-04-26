package com.example.myapplication_pr7.DATA.DataSources;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.example.myapplication_pr7.DATA.Model.DataListRecycler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.example.myapplication_pr7.R;

public class LocalDataSource implements DataSource {
    private Map<Integer, DataListRecycler> items = new HashMap<>();
    public LocalDataSource() {
        for (int i = 0; i < 200; i++) {
            String text = "item #" + (i + 1);
            items.put(R.drawable.flower, new DataListRecycler(text,R.drawable.flower));
        }
    }
    @Override
    public LiveData<List<DataListRecycler>> getItems() {
        MutableLiveData<List<DataListRecycler>> liveData = new MutableLiveData<>();
        liveData.setValue(new ArrayList<>(items.values()));
        return liveData;
    }
    @Override
    public LiveData<DataListRecycler> getItem(int itemId) {
        MutableLiveData<DataListRecycler> liveData = new MutableLiveData<>();
        liveData.setValue(items.get(itemId));
        return liveData;
    }
}