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
                description.set("The Swarms API delivers a high-performance, enterprise-grade platform for\norchestrating advanced multi-agent systems. Built on a Rust-powered agent\nruntime, it enables scalable, robust, and secure agent collaboration, supporting\ncomplex workflows and dynamic agent communication. The API exposes a\ncomprehensive suite of RESTful endpoints for the management, execution, and\nmonitoring of agents, swarms, and related resources, empowering organizations to\nautomate and optimize mission-critical processes. To access the API, obtain your\nAPI key from the [Swarms API Keys page](https://swarms.world/platform/api-keys).\nFor detailed integration guides, best practices, and reference material, consult\nthe [Swarms API Documentation](https://docs.swarms.ai).")
                url.set("https://docs.swarms.ai")

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
