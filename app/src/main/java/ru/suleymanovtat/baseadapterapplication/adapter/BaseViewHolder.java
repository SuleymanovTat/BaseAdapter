package ru.suleymanovtat.baseadapterapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

    private T item;

    BaseViewHolder(View parent) {
        super(parent);
    }

    final void performBind(T item, int position) {
        this.item = item;
        onBind(item, position);
    }

    protected T getItem() {
        return item;
    }

    protected abstract void onBind(T item, int position);

    protected abstract void onClick(View view, T item);

    abstract void onLongClick(View view, T item);

    @Override
    public final void onClick(View view) {
        onClick(view, item);
    }

    @Override
    public final boolean onLongClick(View view) {
        onLongClick(view, item);
        return true;
    }
}