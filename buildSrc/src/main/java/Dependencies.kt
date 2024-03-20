object Version{
    const val core = "1.9.0"
    const val lifecycle = "2.6.2"
    const val activityCompose = "1.8.1"
    const val composeBoom = "2023.03.00"
    const val junit = "4.13.2"
    const val junitTest = "1.1.5"
    const val espressoCore = "3.5.1"
}

object Core{
    const val core = "androidx.core:core-ktx:${Version.core}"
}

object Lifecycle{
    const val  lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.lifecycle}"
}

object Compose{
    const val activityCompose = "androidx.activity:activity-compose:${Version.activityCompose}"
    const val composeBoom = "androidx.compose:compose-bom:${Version.composeBoom}"
    const val composeUi = "androidx.compose.ui:ui"
    const val composeUiGraphic = "androidx.compose.ui:ui-graphics"
    const val composeUiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
    const val composeMaterial3 = "androidx.compose.material3:material3"
    const val composeJunitUiTest = "androidx.compose.ui:ui-test-junit4"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling"
    const val composeUiTestManifest = "androidx.compose.ui:ui-test-manifest"
}

object Junit{
    const val junit = "junit:junit:${Version.junit}"
    const val junitTest = "androidx.test.ext:junit:${Version.junitTest}"
}

object Espresso{
    const val espressoCore = "androidx.test.espresso:espresso-core:${Version.espressoCore}"
}