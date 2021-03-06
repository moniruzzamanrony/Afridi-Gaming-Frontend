package com.itvillage.afridigaming.api;

import com.itvillage.afridigaming.dto.response.GameResponse;
import com.itvillage.afridigaming.dto.response.WithDrawMoneyResponse;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface GetWithdrawListApi {
    @GET("api/auth/admin/show/withdraw/request/active")
    Observable<List<WithDrawMoneyResponse>> getWithdrawList();
}
