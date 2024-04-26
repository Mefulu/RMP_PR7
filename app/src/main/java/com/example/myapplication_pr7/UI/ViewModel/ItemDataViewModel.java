package com.example.myapplication_pr7.UI.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.myapplication_pr7.DATA.Model.DataListRecycler;
import com.example.myapplication_pr7.R;
import java.util.List;

public class ItemDataViewModel extends ViewModel {
    private LiveData<List<DataListRecycler>> items = new MutableLiveData<>();
    public ItemDataViewModel() {
        for (int i = 0; i < 200; i++) {
            String line = "item #" + (i + 1);
            ((MutableLiveData<List<DataListRecycler>>) items).getValue()
                    .add(new DataListRecycler(line, R.drawable.flower));
        }
    }
    public LiveData<List<DataListRecycler>> getItems() {
        return items;
    }
}