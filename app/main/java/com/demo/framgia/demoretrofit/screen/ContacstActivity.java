package com.demo.framgia.demoretrofit.screen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.demo.framgia.demoretrofit.R;
import com.demo.framgia.demoretrofit.data.model.Contact;
import com.demo.framgia.demoretrofit.data.repository.ContactsRetository;
import com.demo.framgia.demoretrofit.data.source.remote.ContactRemoteDataSource;

import java.util.ArrayList;
import java.util.List;

public class ContacstActivity extends AppCompatActivity implements ContactsContract.View{
    private ContactsAdapter mAdapter;
    private List<Contact> mContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        RecyclerView recyclerView = findViewById(R.id.recycler_view_contact);
        mContacts = new ArrayList<>();
        mAdapter = new ContactsAdapter(mContacts);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mAdapter);

        ContactsContract.Presenter presenter = ContactPresenter.getInstance(
                ContactsRetository.getInstance(ContactRemoteDataSource.getInstance()));
        presenter.setView(this);
        presenter.getContacts();
    }

    @Override
    public void onGetContactsSuccess(List<Contact> contacts) {
        mAdapter.setData(contacts);
    }

    @Override
    public void onGetContactsFailed(Throwable throwable) {
        Toast.makeText(this, throwable.getMessage(), Toast.LENGTH_SHORT).show();
    }
}
