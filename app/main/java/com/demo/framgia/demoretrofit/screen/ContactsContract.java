package com.demo.framgia.demoretrofit.screen;

import com.demo.framgia.demoretrofit.data.model.Contact;

import java.util.List;

public interface ContactsContract {
    interface View {
        void onGetContactsSuccess(List<Contact> contacts);

        void onGetContactsFailed(Throwable throwable);
    }

    interface Presenter<View> {
        void setView(ContactsContract.View view);

        void getContacts();
    }
}
