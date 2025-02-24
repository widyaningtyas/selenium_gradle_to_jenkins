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

tasks.register<JavaExec>("gradle-test") {
    dependsOn("assemble", "compileTestJava")
    mainClass.set("io.cucumber.core.cli.Main")
    classpath = sourceSets["test"].runtimeClasspath

    val defaultArgs = listOf(
            "--glue", "stepdefinitions",
            "--plugin", "pretty",
            "--plugin", "json:cucumber-html-reports/cucumber.json",
            "--tags", "@Regression"
    )
    args = defaultArgs
}