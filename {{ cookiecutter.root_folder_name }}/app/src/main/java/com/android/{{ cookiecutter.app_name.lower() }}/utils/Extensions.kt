package com.android.{{ cookiecutter.app_name.lower() }}.utils

import android.util.Patterns

val String.isNotValidEmail: Boolean
    get() = Patterns.EMAIL_ADDRESS.matcher(this).matches()