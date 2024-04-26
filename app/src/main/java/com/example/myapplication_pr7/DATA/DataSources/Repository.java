package com.example.myapplication_pr7.DATA.DataSources;

import androidx.lifecycle.LiveData;
import com.example.myapplication_pr7.DATA.Model.DataListRecycler;
import java.util.List;

public class Repository {
    private DataSource dataSource = new LocalDataSource();
    public LiveData<List<DataListRecycler>> getItems() {
        return dataSource.getItems();
    }
    public LiveData<DataListRecycler> getItem(int itemId) {
        return dataSource.getItem(itemId);
    }
}