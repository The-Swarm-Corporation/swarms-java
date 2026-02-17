// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.agent

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.swarms.api.core.JsonValue
import com.swarms.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class McpConnectionTest {

    @Test
    fun create() {
        val mcpConnection =
            McpConnection.builder()
                .authorizationToken("authorization_token")
                .headers(
                    McpConnection.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .timeout(0L)
                .toolConfigurations(
                    McpConnection.ToolConfigurations.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .transport("transport")
                .type("type")
                .url("url")
                .build()

        assertThat(mcpConnection.authorizationToken()).contains("authorization_token")
        assertThat(mcpConnection.headers())
            .contains(
                McpConnection.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(mcpConnection.timeout()).contains(0L)
        assertThat(mcpConnection.toolConfigurations())
            .contains(
                McpConnection.ToolConfigurations.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(mcpConnection.transport()).contains("transport")
        assertThat(mcpConnection.type()).contains("type")
        assertThat(mcpConnection.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mcpConnection =
            McpConnection.builder()
                .authorizationToken("authorization_token")
                .headers(
                    McpConnection.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .timeout(0L)
                .toolConfigurations(
                    McpConnection.ToolConfigurations.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .transport("transport")
                .type("type")
                .url("url")
                .build()

        val roundtrippedMcpConnection =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mcpConnection),
                jacksonTypeRef<McpConnection>(),
            )

        assertThat(roundtrippedMcpConnection).isEqualTo(mcpConnection)
    }
}
