package com.raywenderlich.android.cryptome.helper

import com.google.gson.internal.LinkedTreeMap
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

const val APIKEY = "b44b602b37bd4bbe2ee0ad5928d2f56f7fe4a05e43a4bf9c7dd4b7117c85aeb8"
const val BASEURL = "https://min-api.cryptocompare.com/"

interface CryptoDataAPI {
  @Headers("Authorization: $APIKEY")
  @GET("data/pricemulti?fsyms=BTC,ETH,LTC")
  //TODO 2: Declare the function to return an Observable
  fun getCryptoData(@Query("tsyms") currencies: String): Observable<LinkedTreeMap<Any, Any>>
}