plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version("7.2.1").apply(false)
    id("com.android.library").version("7.2.1").apply(false)
    kotlin("android").version("1.7.10").apply(false)
    kotlin("multiplatform").version("1.7.10").apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

buildscript {
    val sqlDelightVersion = "1.5.4"

    dependencies {
        classpath("com.squareup.sqldelight:gradle-plugin:$sqlDelightVersion")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.42")
    }
}

repositories {
    maven(url = uri("https://repo.tools.telstra.com/repository/maven-public"))
    mavenCentral()
    maven( url = uri("https://plugins.gradle.org/m2/"))
}