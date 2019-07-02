package com.android.sampleapp.utils

import android.util.Patterns

val String.isNotValidEmail: Boolean
    get() = Patterns.EMAIL_ADDRESS.matcher(this).matches()