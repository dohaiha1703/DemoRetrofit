package com.demo.framgia.demoretrofit.data.source;

import com.demo.framgia.demoretrofit.data.model.ContactResponse;

import retrofit2.Callback;

public interface ContactDataSource {
    interface Remote{
        void getContacts(Callback<ContactResponse> callback);
    }
}
