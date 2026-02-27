plugins {
    id("kmp")
}
kotlin {
    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":model"))
            }
        }
    }
}