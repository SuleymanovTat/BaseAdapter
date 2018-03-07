package ru.suleymanovtat.baseadapterapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ru.suleymanovtat.baseadapterapplication.R;
import ru.suleymanovtat.baseadapterapplication.model.Contact;

public class ListContactsAdapter extends BaseAdapter<Contact, ListContactsAdapter.ViewHolder> {

    public ListContactsAdapter(List<Contact> list) {
        super(list);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.text_item_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.performBind(list.get(position), position);
    }


    public class ViewHolder extends BaseViewHolder<Contact> {

        private TextView textView;

        ViewHolder(View parent) {
            super(parent);
            textView = itemView.findViewById(R.id.textView);
            parent.setOnClickListener(this);
        }

        @Override
        protected void onBind(Contact item, int position) {
            textView.setText(item.getName() + "\n" + item.getPhone());
        }

        @Override
        protected void onClick(View view, Contact item) {
            if (clickListener != null)
                clickListener.onItemClick(view, item);
        }

        @Override
        void onLongClick(View view, Contact item) {

        }
    }
}
