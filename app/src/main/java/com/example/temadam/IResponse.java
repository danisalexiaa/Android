package com.example.temadam;

import java.util.List;

public interface IResponse {

    void onSuccess(List<Tweets> tweets);
    void onError(String mesaj);

}
