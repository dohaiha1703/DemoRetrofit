package com.demo.framgia.demoretrofit.data.source.remote;

import com.demo.framgia.demoretrofit.data.model.ContactResponse;
import com.demo.framgia.demoretrofit.data.source.ContactDataSource;

import retrofit2.Call;
import retrofit2.Callback;

public class ContactRemoteDataSource implements ContactDataSource.Remote {
    private static ContactRemoteDataSource sInstance;

    private ContactRemoteDataSource() {
    }

    public static ContactRemoteDataSource getInstance() {
        if (sInstance == null) {
            synchronized (ContactRemoteDataSource.class) {
                sInstance = new ContactRemoteDataSource();
            }
            return sInstance;
        }
        return sInstance;
    }

    @Override
    public void getContacts(Callback<ContactResponse> callback) {
        Call<ContactResponse> call = ContactDataApi.getClient().create(ApiService.class).getContacts();
        call.enqueue(callback);
    }
}
