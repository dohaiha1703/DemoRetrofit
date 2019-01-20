package com.demo.framgia.demoretrofit.data.source.remote;

import com.demo.framgia.demoretrofit.data.model.ContactResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    public static final String CONTACTS = "contacts/";

    @GET(CONTACTS)
    Call<ContactResponse> getContacts();
}
