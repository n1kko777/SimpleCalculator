package ru.n1kko777.simplecalculator;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by User on 09.06.2017.
 */

public class ViewModel extends BaseObservable {

    private String textView = "";

    @Bindable
    public String getTextView() {
        return textView;
    }

    public void setTextView(String textView) {
        this.textView = textView;
        notifyPropertyChanged(BR.textView);
    }
}
