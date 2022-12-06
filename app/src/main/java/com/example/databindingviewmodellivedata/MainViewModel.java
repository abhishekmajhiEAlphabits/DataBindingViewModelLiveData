package com.example.databindingviewmodellivedata;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    MutableLiveData<String> quoteMutableLiveData = new MutableLiveData<>();

    public LiveData<String> getQuoteLiveData() {
        return quoteMutableLiveData;
    }

    public void getQuote() {
        quoteMutableLiveData.postValue("Success");
    }
}
