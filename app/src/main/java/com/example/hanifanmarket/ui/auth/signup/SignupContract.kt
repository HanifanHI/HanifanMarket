package com.example.hanifanmarket.ui.auth.signup

import android.net.Uri
import com.example.hanifanmarket.base.BasePresenter
import com.example.hanifanmarket.base.BaseView
import com.example.hanifanmarket.model.request.RegisterRequest
import com.example.hanifanmarket.model.response.login.LoginResponse

interface SignupContract {
    interface View : BaseView {
        fun onRegisterSuccess(
            loginResponse: LoginResponse,
            view: android.view.View
        )

        fun onRegisterPhotoSuccess(view: android.view.View)
        fun onRegisterFailed(message: String)
    }

    interface Presenter : SignupContract, BasePresenter {
        fun submitRegister(
            registerRequest: RegisterRequest,
            view: android.view.View
        )

        fun submitPhotoRegister(filePath: Uri, view: android.view.View)
    }
}