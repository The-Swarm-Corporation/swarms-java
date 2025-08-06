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
    // Use `./gradlew :swarms-client-java-example:run` to run `Main`
    // Use `./gradlew :swarms-client-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.swarms.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
