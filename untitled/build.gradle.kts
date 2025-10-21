plugins {
    kotlin("jvm") version "2.2.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.sun.mail:jakarta.mail:1.6.5")
}

tasks.test {
    useJUnitPlatform()
}