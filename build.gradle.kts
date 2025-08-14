plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    // Updated Hilt plugin to the latest stable version
    id ("com.google.dagger.hilt.android") version "2.57" apply false
}
