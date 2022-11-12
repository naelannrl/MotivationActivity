//package Retrofit

//import retrofit2.Retrofit
//import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

//val BASE_URL = "https://newsapi.org/v2/"

//val retrofit = Retrofit.Builder()
//    .addConverterFactory(ScalarsConverterFactory.create())
//    .baseUrl(BASE_URL)
//    .build()

//interface NewsApiService {
//    @GET("top-headlines?country=us&apiKey=2a78c5b43e5847ac8f95fc1d5fa310d1")
//    suspend fun getTopHeadLine(): String

//    @GET("everything?q=bitcoin&apiKey=2a78c5b43e5847ac8f95fc1d5fa310d1")
//    suspend fun getTopHeadLine(): String
//}

//object NewsApi {
//    val retrofitService: NewsApiService by lazy {
//        retrofit.create(NewsApiService::class.java)
//    }
//}