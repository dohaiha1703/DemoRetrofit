package com.demo.framgia.demoretrofit.screen;

import com.demo.framgia.demoretrofit.data.model.ContactResponse;
import com.demo.framgia.demoretrofit.data.repository.ContactsRetository;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ContactPresenter implements ContactsContract.Presenter {

    private ContactsRetository mRetository;
    private ContactsContract.View mView;
    private static ContactPresenter sInstance;

    private ContactPresenter(ContactsRetository retository) {
        mRetository = retository;
    }

    public static ContactPresenter getInstance(ContactsRetository retository){
        if (sInstance == null){
            sInstance = new ContactPresenter(retository);
            return sInstance;
        }
        return sInstance;
    }

    @Override
    public void setView(ContactsContract.View view) {
        mView = view;
    }

    @Override
    public void getContacts() {
        mRetository.getContacts(new Callback<ContactResponse>() {
            @Override
            public void onResponse(Call<ContactResponse> call, Response<ContactResponse> response) {
                mView.onGetContactsSuccess(response.body().getContacts());
            }

            @Override
            public void onFailure(Call<ContactResponse> call, Throwable t) {
                mView.onGetContactsFailed(t);
            }
        });
    }
}
