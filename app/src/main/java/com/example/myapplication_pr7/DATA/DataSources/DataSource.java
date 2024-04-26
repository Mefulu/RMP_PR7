package com.example.myapplication_pr7.DATA.DataSources;

import androidx.lifecycle.LiveData;
import com.example.myapplication_pr7.DATA.Model.DataListRecycler;
import java.util.List;

public interface DataSource {
    LiveData<List<DataListRecycler>> getItems();
    LiveData<DataListRecycler> getItem(int itemId);
}