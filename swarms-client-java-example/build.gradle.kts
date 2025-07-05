plugins {
    id("swarms-client.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":swarms-client-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    mainClass = "com.swarms.api.example.Main"
}
