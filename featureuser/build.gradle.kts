plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
}

android {
    namespace = "sajjad.shahbazi.featureuser"
    compileSdk = appConfig.compileSdkVersion

    defaultConfig {
        minSdk = appConfig.minSdkVersion
        targetSdk = appConfig.targetSdkVersion

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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

    buildFeatures { viewBinding = true }
}

dependencies {

    implementation(domain)
    implementation(common)
    implementation(data)

    implementation(deps.lifecycle.viewModelKtx)

    implementation(deps.androidx.coreKtx)
    implementation(deps.androidx.appCompat)
    implementation(deps.androidx.material)
    implementation(deps.androidx.constraintLayout)

    implementation(deps.koin.android)
    implementation(deps.koin.core)
    implementation(deps.lifecycle.extensions)

//    implementation(deps.viewBindingDelegate)

    addUnitTest()
    testImplementation(deps.koin.testJunit4)
    testImplementation(deps.koin.test)
    testImplementation(deps.test.junit)

    implementation(deps.coroutines.core)
    implementation(deps.timber)
//
//    implementation("org.koin:koin-android-viewmodel:2.0.1")
}

kapt {
    correctErrorTypes = true
}