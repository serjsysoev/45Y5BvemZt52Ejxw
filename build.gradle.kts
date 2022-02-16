import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.reflektTask.plugin.reflektTask

plugins {
    kotlin("jvm") version "1.5.31" apply true
    id("org.jetbrains.reflektTask") version "1.5.31" apply true
    application
}

group = "me.user"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        useIR = true
        languageVersion = "1.5"
        apiVersion = "1.5"
        jvmTarget = "11"
        incremental = false
    }
}

reflektTask {
    // Enable or disable ReflektTask plugin
    enabled = true
}

application {
    mainClass.set("MainKt")
}
