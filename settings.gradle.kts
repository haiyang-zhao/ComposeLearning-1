pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ComposeLearning"
include(":app")
include(":Chapter_02_BasicUI")
include(":Chapter_02_BasicUI:app")
include(":Chapter_04_State")
include(":KotlinLearming")
include(":Chapter_04_State:app")
