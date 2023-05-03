plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "me.admin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}



kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("MainKt")
}