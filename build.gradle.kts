plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.seleniumhq.selenium:selenium-java:4.27.0")
    implementation("org.testng:testng:7.10.2")
    implementation("io.cucumber:cucumber-java:7.15.0")
    implementation("io.cucumber:cucumber-junit:7.15.0")
}