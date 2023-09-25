package com.example.mynavdrawer.ui.ShoppingCart;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShoppingCartViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ShoppingCartViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("開發人員資訊\n" + "開發者：夏辰旭");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
