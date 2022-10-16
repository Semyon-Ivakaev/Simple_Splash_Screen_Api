package com.vertigo.splashscreenapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

/**
 * Simple Splash screen app"
 * 1. In Values-file create "splash_theme"
 * 2. In "splash_theme" add 4 params.
 * 3. Edit Manifest with start theme name from "splash_theme".
 * 4. Add installSplashScreen() in MainActivity between "onCreate" and "setContentView".
 * 5. Ready!
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen()

        setContentView(R.layout.activity_main)
    }
}