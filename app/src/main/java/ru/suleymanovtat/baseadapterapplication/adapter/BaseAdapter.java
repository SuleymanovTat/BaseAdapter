package ru.suleymanovtat.baseadapterapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import ru.suleymanovtat.baseadapterapplication.model.Contact;

public abstract class BaseAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    public ClickListener clickListener;

    public void setOnItemClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public interface ClickListener {
        void onItemClick(View view, Contact item);
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

}