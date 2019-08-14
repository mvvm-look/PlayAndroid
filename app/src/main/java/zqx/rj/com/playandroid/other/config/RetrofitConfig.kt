package zqx.rj.com.playandroid.other.config

import com.zhan.mvvm.http.BaseOkHttpClient
import com.zhan.mvvm.http.BaseRetrofitConfig
import okhttp3.OkHttpClient
import zqx.rj.com.playandroid.other.api.API
import zqx.rj.com.playandroid.other.interceptor.CookieInterceptor
import zqx.rj.com.playandroid.other.interceptor.LoginInterceptor

/**
 * author：  HyZhan
 * create：  2019/8/6
 * desc：    TODO
 */
class RetrofitConfig : BaseRetrofitConfig() {
    override val baseUrl: String
        get() = API.BASE_URL

    override fun initOkHttpClient(): OkHttpClient {
        return BaseOkHttpClient.create(
            CookieInterceptor.create(),
            LoginInterceptor.create()
        )
    }
}