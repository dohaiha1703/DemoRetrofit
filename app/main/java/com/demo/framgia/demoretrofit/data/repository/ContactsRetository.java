package com.demo.framgia.demoretrofit.data.repository;

import com.demo.framgia.demoretrofit.data.model.ContactResponse;
import com.demo.framgia.demoretrofit.data.source.ContactDataSource;
import com.demo.framgia.demoretrofit.data.source.remote.ContactRemoteDataSource;

import retrofit2.Callback;

public class ContactsRetository implements ContactDataSource.Remote {

    private ContactRemoteDataSource mRemoteDataSource;
    private static ContactsRetository sInstance;

    private ContactsRetository(ContactRemoteDataSource remoteDataSource) {
        mRemoteDataSource = remoteDataSource;
    }

    public static ContactsRetository getInstance(ContactRemoteDataSource remoteDataSource) {
        if (sInstance == null) {
            sInstance = new ContactsRetository(remoteDataSource);
            return sInstance;
        }
        return sInstance;
    }

    @Override
    public void getContacts(Callback<ContactResponse> callback) {
        mRemoteDataSource.getContacts(callback);
    }
}
