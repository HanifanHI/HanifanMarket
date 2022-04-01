package com.example.hanifanmarket.ui.auth.signin

import com.example.hanifanmarket.base.BasePresenter
import com.example.hanifanmarket.base.BaseView
import com.example.hanifanmarket.model.response.login.LoginResponse

interface SigninContract {

    interface View : BaseView {
        fun onLoginSuccess(loginResponse: LoginResponse)
        fun onLoginFailed(message: String)
    }

    interface Presenter : SigninContract, BasePresenter {
        fun subimtLogin(email: String, password: String)
    }

}