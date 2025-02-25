package com.jm.appsolve_fe.network

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

// 서버 API와 매핑되는 함수 정의
interface SignUpService {
    @POST("/member/signUp") // 이메일 유효성 검사 URL
    fun signUp(@Body request: SignUpRequest): Call<SignUpResponse>

    @GET("/member/duplication-check")
    fun checkDuplicate(
        @Query("loginId") loginId: String
    ): Call<SignUpResponse>

    @POST("/auth/login")
    fun login(@Body request: LoginRequest): Call<LoginResponse>

    @POST("/auth/refresh")
    fun refreshAccessToken(@Body request: RefreshTokenRequest): Call<RefreshTokenResponse>
}