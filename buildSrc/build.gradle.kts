plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

kotlin {
    jvmToolchain(25)
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

val kotlinVersion = "2.3.10"
val composeVersion = "1.10.0"
fun pluginId(pluginName: String, version: String) = "$pluginName:$pluginName.gradle.plugin:$version"
fun kotlinPluginId(pluginName: String, version: String = kotlinVersion) =
    pluginId("org.jetbrains.kotlin.$pluginName", version)

fun kotlinId(id: String) = "org.jetbrains.kotlin:$id:$kotlinVersion"
dependencies {
    implementation(kotlinPluginId("multiplatform"))
}
