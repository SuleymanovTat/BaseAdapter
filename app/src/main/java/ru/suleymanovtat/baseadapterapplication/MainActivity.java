package ru.suleymanovtat.baseadapterapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

import ru.suleymanovtat.baseadapterapplication.adapter.ListContactsAdapter;
import ru.suleymanovtat.baseadapterapplication.model.Contact;

public class MainActivity extends AppCompatActivity implements ListContactsAdapter.ClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rvList = findViewById(R.id.rvList);

        ArrayList<Contact> сontacts = new ArrayList<>();
        сontacts.add(new Contact("Алмас", "+7(111)111-11-11", "", false));
        сontacts.add(new Contact("Алсу", "+7(222)222-22-22", "", false));
        сontacts.add(new Contact("Айрат", "+7(333)333-33-33", "", false));
        сontacts.add(new Contact("Айдар", "+7(555)555-55-55", "", false));
        сontacts.add(new Contact("Айзат", "+7(000)000-00-00", "", false));
        сontacts.add(new Contact("Ильмир", "+7(777)777-77-77", "", false));
        сontacts.add(new Contact("Ильдар", "+7(888)888-88-88", "", false));
        сontacts.add(new Contact("Ильнур", "+7(666)666-66-66", "", false));
        сontacts.add(new Contact("Ильсур", "+7(555)555-55-55", "", false));
        сontacts.add(new Contact("Ильнар", "+7(444)444-44-44", "", false));
        сontacts.add(new Contact("Рамиль", "+7(777)777-77-77", "", false));
        сontacts.add(new Contact("Раил", "+7(888)888-88-88", "", false));
        сontacts.add(new Contact("Рамир", "+7(666)666-66-66", "", false));
        сontacts.add(new Contact("Руслан", "+7(555)555-55-55", "", false));
        сontacts.add(new Contact("Рамис", "+7(444)444-44-44", "", false));
        ListContactsAdapter mAdapter = new ListContactsAdapter(сontacts);
        mAdapter.setOnItemClickListener(this);
        rvList.setAdapter(mAdapter);
    }

    @Override
    public void onItemClick(View view, Contact item) {
        Log.e("tab"," " + item.getName());
    }
}
