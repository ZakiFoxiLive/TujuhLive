plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.dagger.hilt.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.tujuhlive.app"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.tujuhlive.app"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(project(":feature:home:ui"))
    implementation(project(":core:common"))
    implementation(project(":core:api"))

    implementation(Core.core)
    implementation(Lifecycle.lifecycle)
    implementation(Compose.activityCompose)
    implementation(platform(Compose.composeBoom))
    implementation(Compose.composeUi)
    implementation(Compose.composeUiGraphic)
    implementation(Compose.composeUiToolingPreview)
    implementation(Compose.composeMaterial3)
    testImplementation(Junit.junit)
    androidTestImplementation(Junit.junitTest)
    androidTestImplementation(Espresso.espressoCore)
    androidTestImplementation(platform(Compose.composeBoom))
    androidTestImplementation(Compose.composeJunitUiTest)
    debugImplementation(Compose.composeUiTooling)
    debugImplementation(Compose.composeUiTestManifest)

    implementation(Compose.composeNavigation)
    implementation(DaggerHilt.hilt)
    kapt(DaggerHilt.hiltCompiler)
}