plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("Swarms API")
                description.set("The Swarms API is a RESTful interface for interacting with the Swarms platform.\nIt provides endpoints for managing and executing swarms, agents, and related\nresources. To get your API key, visit the\n[Swarms API Keys page](https://swarms.world/platform/api-keys). Comprehensive\ndocumentation is available at\n[Swarms API Documentation](https://docs.swarms.world).")
                url.set("https://docs.swarms.world/en/latest/")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("Swarms Client")
                        email.set("kye@swarms.world")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/The-Swarm-Corporation/swarms-java.git")
                    developerConnection.set("scm:git:git://github.com/The-Swarm-Corporation/swarms-java.git")
                    url.set("https://github.com/The-Swarm-Corporation/swarms-java")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
