package ru.suleymanovtat.baseadapterapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

public abstract class BaseAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    public ClickListener<T> clickListener;

    public void setOnItemClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public interface ClickListener<T> {
        void onItemClick(View view, T item);
    }

    protected List<T> list;

    public BaseAdapter(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setDataList(List<T> listT) {
        list.clear();
        list.addAll(listT);
        notifyDataSetChanged();
    }

}