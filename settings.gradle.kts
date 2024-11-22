pluginManagement {
    repositories {
        google()  // Define Google repository here
        mavenCentral()  // Define Maven Central repository here
        gradlePluginPortal()  // Define Gradle Plugin Portal repository here
    }
    plugins {
        id("org.jetbrains.kotlin.android") version "1.8.20"
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()  // Ensure Google repository is included
        mavenCentral()  // Ensure Maven Central repository is included
        gradlePluginPortal()  // Ensure Gradle Plugin Portal repository is included
    }
}

rootProject.name = "Smart-MR"
include(":app")
