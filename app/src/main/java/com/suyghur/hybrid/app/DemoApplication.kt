package com.suyghur.hybrid.app

import android.app.Application
import android.content.Context

/**
 * @author #Suyghur,
 * Created on 2021/3/25
 */
class DemoApplication:Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }

    override fun onCreate() {
        super.onCreate()
    }
}