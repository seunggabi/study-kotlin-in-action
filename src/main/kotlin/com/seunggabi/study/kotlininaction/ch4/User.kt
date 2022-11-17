package com.seunggabi.study.kotlininaction.ch4

class User private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) =
            User(email.substringBefore("@"))
        fun newFacebookUser(accountId: Int) =
            User(accountId.toString())
    }
}