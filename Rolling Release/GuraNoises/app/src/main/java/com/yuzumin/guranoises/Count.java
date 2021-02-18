package com.yuzumin.guranoises;

public class Count {

    public interface CountListener{
        void OnUpdated(int count);
    }

    private int count;
    private CountListener listener;

    public void setCount(int count){
        this.count = count;
        if(listener!=null)
            listener.OnUpdated(count);
    }
    public int getCount(){
        return count;
    }

    public void increment(){
        count++;
        if(listener!=null)
            listener.OnUpdated(count);
    }

    public void setListener(CountListener listener){
        this.listener = listener;
    }
}
