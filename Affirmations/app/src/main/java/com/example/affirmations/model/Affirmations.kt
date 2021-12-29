package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// 添加data作为数据类
data class Affirmation(@StringRes val stringResourceId: Int, @DrawableRes val imageResourceId: Int) {

}