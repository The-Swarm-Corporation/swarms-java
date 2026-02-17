// File generated from our OpenAPI spec by Stainless.

package com.swarms.api.models.agent

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.swarms.api.core.ExcludeMissing
import com.swarms.api.core.JsonField
import com.swarms.api.core.JsonMissing
import com.swarms.api.core.JsonValue
import com.swarms.api.core.checkKnown
import com.swarms.api.core.checkRequired
import com.swarms.api.core.toImmutable
import com.swarms.api.errors.SwarmsClientInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AgentSpec
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val agentName: JsonField<String>,
    private val autoGeneratePrompt: JsonField<Boolean>,
    private val description: JsonField<String>,
    private val dynamicTemperatureEnabled: JsonField<Boolean>,
    private val llmArgs: JsonField<LlmArgs>,
    private val maxLoops: JsonField<Long>,
    private val maxTokens: JsonField<Long>,
    private val mcpConfig: JsonField<McpConnection>,
    private val mcpConfigs: JsonField<McpConfigs>,
    private val mcpUrl: JsonField<String>,
    private val modelName: JsonField<String>,
    private val reasoningEffort: JsonField<String>,
    private val reasoningEnabled: JsonField<Boolean>,
    private val role: JsonField<String>,
    private val streamingOn: JsonField<Boolean>,
    private val systemPrompt: JsonField<String>,
    private val temperature: JsonField<Double>,
    private val thinkingTokens: JsonField<Long>,
    private val toolCallSummary: JsonField<Boolean>,
    private val toolsListDictionary: JsonField<List<ToolsListDictionary>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("agent_name") @ExcludeMissing agentName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("auto_generate_prompt")
        @ExcludeMissing
        autoGeneratePrompt: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dynamic_temperature_enabled")
        @ExcludeMissing
        dynamicTemperatureEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("llm_args") @ExcludeMissing llmArgs: JsonField<LlmArgs> = JsonMissing.of(),
        @JsonProperty("max_loops") @ExcludeMissing maxLoops: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_tokens") @ExcludeMissing maxTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("mcp_config")
        @ExcludeMissing
        mcpConfig: JsonField<McpConnection> = JsonMissing.of(),
        @JsonProperty("mcp_configs")
        @ExcludeMissing
        mcpConfigs: JsonField<McpConfigs> = JsonMissing.of(),
        @JsonProperty("mcp_url") @ExcludeMissing mcpUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("model_name") @ExcludeMissing modelName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reasoning_effort")
        @ExcludeMissing
        reasoningEffort: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reasoning_enabled")
        @ExcludeMissing
        reasoningEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("role") @ExcludeMissing role: JsonField<String> = JsonMissing.of(),
        @JsonProperty("streaming_on")
        @ExcludeMissing
        streamingOn: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("system_prompt")
        @ExcludeMissing
        systemPrompt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("temperature")
        @ExcludeMissing
        temperature: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("thinking_tokens")
        @ExcludeMissing
        thinkingTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("tool_call_summary")
        @ExcludeMissing
        toolCallSummary: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("tools_list_dictionary")
        @ExcludeMissing
        toolsListDictionary: JsonField<List<ToolsListDictionary>> = JsonMissing.of(),
    ) : this(
        agentName,
        autoGeneratePrompt,
        description,
        dynamicTemperatureEnabled,
        llmArgs,
        maxLoops,
        maxTokens,
        mcpConfig,
        mcpConfigs,
        mcpUrl,
        modelName,
        reasoningEffort,
        reasoningEnabled,
        role,
        streamingOn,
        systemPrompt,
        temperature,
        thinkingTokens,
        toolCallSummary,
        toolsListDictionary,
        mutableMapOf(),
    )

    /**
     * The unique name assigned to the agent, which identifies its role and functionality within the
     * swarm.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun agentName(): Optional<String> = agentName.getOptional("agent_name")

    /**
     * A flag indicating whether the agent should automatically create prompts based on the task
     * requirements.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun autoGeneratePrompt(): Optional<Boolean> =
        autoGeneratePrompt.getOptional("auto_generate_prompt")

    /**
     * A detailed explanation of the agent's purpose, capabilities, and any specific tasks it is
     * designed to perform.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * A flag indicating whether the agent should dynamically adjust its temperature based on the
     * task.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dynamicTemperatureEnabled(): Optional<Boolean> =
        dynamicTemperatureEnabled.getOptional("dynamic_temperature_enabled")

    /**
     * Additional arguments to pass to the LLM such as top_p, frequency_penalty, presence_penalty,
     * etc.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun llmArgs(): Optional<LlmArgs> = llmArgs.getOptional("llm_args")

    /**
     * The maximum number of times the agent is allowed to repeat its task, enabling iterative
     * processing if necessary.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun maxLoops(): Optional<Long> = maxLoops.getOptional("max_loops")

    /**
     * The maximum number of tokens that the agent is allowed to generate in its responses, limiting
     * output length.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun maxTokens(): Optional<Long> = maxTokens.getOptional("max_tokens")

    /**
     * The MCP connection to use for the agent.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun mcpConfig(): Optional<McpConnection> = mcpConfig.getOptional("mcp_config")

    /**
     * The MCP connections to use for the agent. This is a list of MCP connections. Includes
     * multiple MCP connections.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun mcpConfigs(): Optional<McpConfigs> = mcpConfigs.getOptional("mcp_configs")

    /**
     * The URL of the MCP server that the agent can use to complete its task.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun mcpUrl(): Optional<String> = mcpUrl.getOptional("mcp_url")

    /**
     * The name of the AI model that the agent will utilize for processing tasks and generating
     * outputs. For example: gpt-4o, gpt-4o-mini, openai/o3-mini
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun modelName(): Optional<String> = modelName.getOptional("model_name")

    /**
     * The effort to put into reasoning.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reasoningEffort(): Optional<String> = reasoningEffort.getOptional("reasoning_effort")

    /**
     * A parameter enabling an agent to use reasoning.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reasoningEnabled(): Optional<Boolean> = reasoningEnabled.getOptional("reasoning_enabled")

    /**
     * The designated role of the agent within the swarm, which influences its behavior and
     * interaction with other agents.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun role(): Optional<String> = role.getOptional("role")

    /**
     * A flag indicating whether the agent should stream its output.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun streamingOn(): Optional<Boolean> = streamingOn.getOptional("streaming_on")

    /**
     * The initial instruction or context provided to the agent, guiding its behavior and responses
     * during execution.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun systemPrompt(): Optional<String> = systemPrompt.getOptional("system_prompt")

    /**
     * A parameter that controls the randomness of the agent's output; lower values result in more
     * deterministic responses.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun temperature(): Optional<Double> = temperature.getOptional("temperature")

    /**
     * The number of tokens to use for thinking.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun thinkingTokens(): Optional<Long> = thinkingTokens.getOptional("thinking_tokens")

    /**
     * A parameter enabling an agent to summarize tool calls.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun toolCallSummary(): Optional<Boolean> = toolCallSummary.getOptional("tool_call_summary")

    /**
     * A dictionary of tools that the agent can use to complete its task.
     *
     * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun toolsListDictionary(): Optional<List<ToolsListDictionary>> =
        toolsListDictionary.getOptional("tools_list_dictionary")

    /**
     * Returns the raw JSON value of [agentName].
     *
     * Unlike [agentName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agent_name") @ExcludeMissing fun _agentName(): JsonField<String> = agentName

    /**
     * Returns the raw JSON value of [autoGeneratePrompt].
     *
     * Unlike [autoGeneratePrompt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("auto_generate_prompt")
    @ExcludeMissing
    fun _autoGeneratePrompt(): JsonField<Boolean> = autoGeneratePrompt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [dynamicTemperatureEnabled].
     *
     * Unlike [dynamicTemperatureEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("dynamic_temperature_enabled")
    @ExcludeMissing
    fun _dynamicTemperatureEnabled(): JsonField<Boolean> = dynamicTemperatureEnabled

    /**
     * Returns the raw JSON value of [llmArgs].
     *
     * Unlike [llmArgs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("llm_args") @ExcludeMissing fun _llmArgs(): JsonField<LlmArgs> = llmArgs

    /**
     * Returns the raw JSON value of [maxLoops].
     *
     * Unlike [maxLoops], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_loops") @ExcludeMissing fun _maxLoops(): JsonField<Long> = maxLoops

    /**
     * Returns the raw JSON value of [maxTokens].
     *
     * Unlike [maxTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_tokens") @ExcludeMissing fun _maxTokens(): JsonField<Long> = maxTokens

    /**
     * Returns the raw JSON value of [mcpConfig].
     *
     * Unlike [mcpConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mcp_config")
    @ExcludeMissing
    fun _mcpConfig(): JsonField<McpConnection> = mcpConfig

    /**
     * Returns the raw JSON value of [mcpConfigs].
     *
     * Unlike [mcpConfigs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mcp_configs")
    @ExcludeMissing
    fun _mcpConfigs(): JsonField<McpConfigs> = mcpConfigs

    /**
     * Returns the raw JSON value of [mcpUrl].
     *
     * Unlike [mcpUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mcp_url") @ExcludeMissing fun _mcpUrl(): JsonField<String> = mcpUrl

    /**
     * Returns the raw JSON value of [modelName].
     *
     * Unlike [modelName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model_name") @ExcludeMissing fun _modelName(): JsonField<String> = modelName

    /**
     * Returns the raw JSON value of [reasoningEffort].
     *
     * Unlike [reasoningEffort], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reasoning_effort")
    @ExcludeMissing
    fun _reasoningEffort(): JsonField<String> = reasoningEffort

    /**
     * Returns the raw JSON value of [reasoningEnabled].
     *
     * Unlike [reasoningEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reasoning_enabled")
    @ExcludeMissing
    fun _reasoningEnabled(): JsonField<Boolean> = reasoningEnabled

    /**
     * Returns the raw JSON value of [role].
     *
     * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<String> = role

    /**
     * Returns the raw JSON value of [streamingOn].
     *
     * Unlike [streamingOn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("streaming_on")
    @ExcludeMissing
    fun _streamingOn(): JsonField<Boolean> = streamingOn

    /**
     * Returns the raw JSON value of [systemPrompt].
     *
     * Unlike [systemPrompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("system_prompt")
    @ExcludeMissing
    fun _systemPrompt(): JsonField<String> = systemPrompt

    /**
     * Returns the raw JSON value of [temperature].
     *
     * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("temperature") @ExcludeMissing fun _temperature(): JsonField<Double> = temperature

    /**
     * Returns the raw JSON value of [thinkingTokens].
     *
     * Unlike [thinkingTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("thinking_tokens")
    @ExcludeMissing
    fun _thinkingTokens(): JsonField<Long> = thinkingTokens

    /**
     * Returns the raw JSON value of [toolCallSummary].
     *
     * Unlike [toolCallSummary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tool_call_summary")
    @ExcludeMissing
    fun _toolCallSummary(): JsonField<Boolean> = toolCallSummary

    /**
     * Returns the raw JSON value of [toolsListDictionary].
     *
     * Unlike [toolsListDictionary], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tools_list_dictionary")
    @ExcludeMissing
    fun _toolsListDictionary(): JsonField<List<ToolsListDictionary>> = toolsListDictionary

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AgentSpec].
         *
         * The following fields are required:
         * ```java
         * .agentName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentSpec]. */
    class Builder internal constructor() {

        private var agentName: JsonField<String>? = null
        private var autoGeneratePrompt: JsonField<Boolean> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var dynamicTemperatureEnabled: JsonField<Boolean> = JsonMissing.of()
        private var llmArgs: JsonField<LlmArgs> = JsonMissing.of()
        private var maxLoops: JsonField<Long> = JsonMissing.of()
        private var maxTokens: JsonField<Long> = JsonMissing.of()
        private var mcpConfig: JsonField<McpConnection> = JsonMissing.of()
        private var mcpConfigs: JsonField<McpConfigs> = JsonMissing.of()
        private var mcpUrl: JsonField<String> = JsonMissing.of()
        private var modelName: JsonField<String> = JsonMissing.of()
        private var reasoningEffort: JsonField<String> = JsonMissing.of()
        private var reasoningEnabled: JsonField<Boolean> = JsonMissing.of()
        private var role: JsonField<String> = JsonMissing.of()
        private var streamingOn: JsonField<Boolean> = JsonMissing.of()
        private var systemPrompt: JsonField<String> = JsonMissing.of()
        private var temperature: JsonField<Double> = JsonMissing.of()
        private var thinkingTokens: JsonField<Long> = JsonMissing.of()
        private var toolCallSummary: JsonField<Boolean> = JsonMissing.of()
        private var toolsListDictionary: JsonField<MutableList<ToolsListDictionary>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentSpec: AgentSpec) = apply {
            agentName = agentSpec.agentName
            autoGeneratePrompt = agentSpec.autoGeneratePrompt
            description = agentSpec.description
            dynamicTemperatureEnabled = agentSpec.dynamicTemperatureEnabled
            llmArgs = agentSpec.llmArgs
            maxLoops = agentSpec.maxLoops
            maxTokens = agentSpec.maxTokens
            mcpConfig = agentSpec.mcpConfig
            mcpConfigs = agentSpec.mcpConfigs
            mcpUrl = agentSpec.mcpUrl
            modelName = agentSpec.modelName
            reasoningEffort = agentSpec.reasoningEffort
            reasoningEnabled = agentSpec.reasoningEnabled
            role = agentSpec.role
            streamingOn = agentSpec.streamingOn
            systemPrompt = agentSpec.systemPrompt
            temperature = agentSpec.temperature
            thinkingTokens = agentSpec.thinkingTokens
            toolCallSummary = agentSpec.toolCallSummary
            toolsListDictionary = agentSpec.toolsListDictionary.map { it.toMutableList() }
            additionalProperties = agentSpec.additionalProperties.toMutableMap()
        }

        /**
         * The unique name assigned to the agent, which identifies its role and functionality within
         * the swarm.
         */
        fun agentName(agentName: String?) = agentName(JsonField.ofNullable(agentName))

        /** Alias for calling [Builder.agentName] with `agentName.orElse(null)`. */
        fun agentName(agentName: Optional<String>) = agentName(agentName.getOrNull())

        /**
         * Sets [Builder.agentName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun agentName(agentName: JsonField<String>) = apply { this.agentName = agentName }

        /**
         * A flag indicating whether the agent should automatically create prompts based on the task
         * requirements.
         */
        fun autoGeneratePrompt(autoGeneratePrompt: Boolean?) =
            autoGeneratePrompt(JsonField.ofNullable(autoGeneratePrompt))

        /**
         * Alias for [Builder.autoGeneratePrompt].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun autoGeneratePrompt(autoGeneratePrompt: Boolean) =
            autoGeneratePrompt(autoGeneratePrompt as Boolean?)

        /**
         * Alias for calling [Builder.autoGeneratePrompt] with `autoGeneratePrompt.orElse(null)`.
         */
        fun autoGeneratePrompt(autoGeneratePrompt: Optional<Boolean>) =
            autoGeneratePrompt(autoGeneratePrompt.getOrNull())

        /**
         * Sets [Builder.autoGeneratePrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoGeneratePrompt] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun autoGeneratePrompt(autoGeneratePrompt: JsonField<Boolean>) = apply {
            this.autoGeneratePrompt = autoGeneratePrompt
        }

        /**
         * A detailed explanation of the agent's purpose, capabilities, and any specific tasks it is
         * designed to perform.
         */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * A flag indicating whether the agent should dynamically adjust its temperature based on
         * the task.
         */
        fun dynamicTemperatureEnabled(dynamicTemperatureEnabled: Boolean?) =
            dynamicTemperatureEnabled(JsonField.ofNullable(dynamicTemperatureEnabled))

        /**
         * Alias for [Builder.dynamicTemperatureEnabled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun dynamicTemperatureEnabled(dynamicTemperatureEnabled: Boolean) =
            dynamicTemperatureEnabled(dynamicTemperatureEnabled as Boolean?)

        /**
         * Alias for calling [Builder.dynamicTemperatureEnabled] with
         * `dynamicTemperatureEnabled.orElse(null)`.
         */
        fun dynamicTemperatureEnabled(dynamicTemperatureEnabled: Optional<Boolean>) =
            dynamicTemperatureEnabled(dynamicTemperatureEnabled.getOrNull())

        /**
         * Sets [Builder.dynamicTemperatureEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dynamicTemperatureEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dynamicTemperatureEnabled(dynamicTemperatureEnabled: JsonField<Boolean>) = apply {
            this.dynamicTemperatureEnabled = dynamicTemperatureEnabled
        }

        /**
         * Additional arguments to pass to the LLM such as top_p, frequency_penalty,
         * presence_penalty, etc.
         */
        fun llmArgs(llmArgs: LlmArgs?) = llmArgs(JsonField.ofNullable(llmArgs))

        /** Alias for calling [Builder.llmArgs] with `llmArgs.orElse(null)`. */
        fun llmArgs(llmArgs: Optional<LlmArgs>) = llmArgs(llmArgs.getOrNull())

        /**
         * Sets [Builder.llmArgs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llmArgs] with a well-typed [LlmArgs] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun llmArgs(llmArgs: JsonField<LlmArgs>) = apply { this.llmArgs = llmArgs }

        /**
         * The maximum number of times the agent is allowed to repeat its task, enabling iterative
         * processing if necessary.
         */
        fun maxLoops(maxLoops: Long?) = maxLoops(JsonField.ofNullable(maxLoops))

        /**
         * Alias for [Builder.maxLoops].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxLoops(maxLoops: Long) = maxLoops(maxLoops as Long?)

        /** Alias for calling [Builder.maxLoops] with `maxLoops.orElse(null)`. */
        fun maxLoops(maxLoops: Optional<Long>) = maxLoops(maxLoops.getOrNull())

        /**
         * Sets [Builder.maxLoops] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxLoops] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxLoops(maxLoops: JsonField<Long>) = apply { this.maxLoops = maxLoops }

        /**
         * The maximum number of tokens that the agent is allowed to generate in its responses,
         * limiting output length.
         */
        fun maxTokens(maxTokens: Long?) = maxTokens(JsonField.ofNullable(maxTokens))

        /**
         * Alias for [Builder.maxTokens].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxTokens(maxTokens: Long) = maxTokens(maxTokens as Long?)

        /** Alias for calling [Builder.maxTokens] with `maxTokens.orElse(null)`. */
        fun maxTokens(maxTokens: Optional<Long>) = maxTokens(maxTokens.getOrNull())

        /**
         * Sets [Builder.maxTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxTokens] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxTokens(maxTokens: JsonField<Long>) = apply { this.maxTokens = maxTokens }

        /** The MCP connection to use for the agent. */
        fun mcpConfig(mcpConfig: McpConnection?) = mcpConfig(JsonField.ofNullable(mcpConfig))

        /** Alias for calling [Builder.mcpConfig] with `mcpConfig.orElse(null)`. */
        fun mcpConfig(mcpConfig: Optional<McpConnection>) = mcpConfig(mcpConfig.getOrNull())

        /**
         * Sets [Builder.mcpConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mcpConfig] with a well-typed [McpConnection] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mcpConfig(mcpConfig: JsonField<McpConnection>) = apply { this.mcpConfig = mcpConfig }

        /**
         * The MCP connections to use for the agent. This is a list of MCP connections. Includes
         * multiple MCP connections.
         */
        fun mcpConfigs(mcpConfigs: McpConfigs?) = mcpConfigs(JsonField.ofNullable(mcpConfigs))

        /** Alias for calling [Builder.mcpConfigs] with `mcpConfigs.orElse(null)`. */
        fun mcpConfigs(mcpConfigs: Optional<McpConfigs>) = mcpConfigs(mcpConfigs.getOrNull())

        /**
         * Sets [Builder.mcpConfigs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mcpConfigs] with a well-typed [McpConfigs] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mcpConfigs(mcpConfigs: JsonField<McpConfigs>) = apply { this.mcpConfigs = mcpConfigs }

        /** The URL of the MCP server that the agent can use to complete its task. */
        fun mcpUrl(mcpUrl: String?) = mcpUrl(JsonField.ofNullable(mcpUrl))

        /** Alias for calling [Builder.mcpUrl] with `mcpUrl.orElse(null)`. */
        fun mcpUrl(mcpUrl: Optional<String>) = mcpUrl(mcpUrl.getOrNull())

        /**
         * Sets [Builder.mcpUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mcpUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mcpUrl(mcpUrl: JsonField<String>) = apply { this.mcpUrl = mcpUrl }

        /**
         * The name of the AI model that the agent will utilize for processing tasks and generating
         * outputs. For example: gpt-4o, gpt-4o-mini, openai/o3-mini
         */
        fun modelName(modelName: String?) = modelName(JsonField.ofNullable(modelName))

        /** Alias for calling [Builder.modelName] with `modelName.orElse(null)`. */
        fun modelName(modelName: Optional<String>) = modelName(modelName.getOrNull())

        /**
         * Sets [Builder.modelName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modelName(modelName: JsonField<String>) = apply { this.modelName = modelName }

        /** The effort to put into reasoning. */
        fun reasoningEffort(reasoningEffort: String?) =
            reasoningEffort(JsonField.ofNullable(reasoningEffort))

        /** Alias for calling [Builder.reasoningEffort] with `reasoningEffort.orElse(null)`. */
        fun reasoningEffort(reasoningEffort: Optional<String>) =
            reasoningEffort(reasoningEffort.getOrNull())

        /**
         * Sets [Builder.reasoningEffort] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reasoningEffort] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reasoningEffort(reasoningEffort: JsonField<String>) = apply {
            this.reasoningEffort = reasoningEffort
        }

        /** A parameter enabling an agent to use reasoning. */
        fun reasoningEnabled(reasoningEnabled: Boolean?) =
            reasoningEnabled(JsonField.ofNullable(reasoningEnabled))

        /**
         * Alias for [Builder.reasoningEnabled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun reasoningEnabled(reasoningEnabled: Boolean) =
            reasoningEnabled(reasoningEnabled as Boolean?)

        /** Alias for calling [Builder.reasoningEnabled] with `reasoningEnabled.orElse(null)`. */
        fun reasoningEnabled(reasoningEnabled: Optional<Boolean>) =
            reasoningEnabled(reasoningEnabled.getOrNull())

        /**
         * Sets [Builder.reasoningEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reasoningEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reasoningEnabled(reasoningEnabled: JsonField<Boolean>) = apply {
            this.reasoningEnabled = reasoningEnabled
        }

        /**
         * The designated role of the agent within the swarm, which influences its behavior and
         * interaction with other agents.
         */
        fun role(role: String?) = role(JsonField.ofNullable(role))

        /** Alias for calling [Builder.role] with `role.orElse(null)`. */
        fun role(role: Optional<String>) = role(role.getOrNull())

        /**
         * Sets [Builder.role] to an arbitrary JSON value.
         *
         * You should usually call [Builder.role] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun role(role: JsonField<String>) = apply { this.role = role }

        /** A flag indicating whether the agent should stream its output. */
        fun streamingOn(streamingOn: Boolean?) = streamingOn(JsonField.ofNullable(streamingOn))

        /**
         * Alias for [Builder.streamingOn].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun streamingOn(streamingOn: Boolean) = streamingOn(streamingOn as Boolean?)

        /** Alias for calling [Builder.streamingOn] with `streamingOn.orElse(null)`. */
        fun streamingOn(streamingOn: Optional<Boolean>) = streamingOn(streamingOn.getOrNull())

        /**
         * Sets [Builder.streamingOn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streamingOn] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun streamingOn(streamingOn: JsonField<Boolean>) = apply { this.streamingOn = streamingOn }

        /**
         * The initial instruction or context provided to the agent, guiding its behavior and
         * responses during execution.
         */
        fun systemPrompt(systemPrompt: String?) = systemPrompt(JsonField.ofNullable(systemPrompt))

        /** Alias for calling [Builder.systemPrompt] with `systemPrompt.orElse(null)`. */
        fun systemPrompt(systemPrompt: Optional<String>) = systemPrompt(systemPrompt.getOrNull())

        /**
         * Sets [Builder.systemPrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.systemPrompt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun systemPrompt(systemPrompt: JsonField<String>) = apply {
            this.systemPrompt = systemPrompt
        }

        /**
         * A parameter that controls the randomness of the agent's output; lower values result in
         * more deterministic responses.
         */
        fun temperature(temperature: Double?) = temperature(JsonField.ofNullable(temperature))

        /**
         * Alias for [Builder.temperature].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun temperature(temperature: Double) = temperature(temperature as Double?)

        /** Alias for calling [Builder.temperature] with `temperature.orElse(null)`. */
        fun temperature(temperature: Optional<Double>) = temperature(temperature.getOrNull())

        /**
         * Sets [Builder.temperature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.temperature] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun temperature(temperature: JsonField<Double>) = apply { this.temperature = temperature }

        /** The number of tokens to use for thinking. */
        fun thinkingTokens(thinkingTokens: Long?) =
            thinkingTokens(JsonField.ofNullable(thinkingTokens))

        /**
         * Alias for [Builder.thinkingTokens].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun thinkingTokens(thinkingTokens: Long) = thinkingTokens(thinkingTokens as Long?)

        /** Alias for calling [Builder.thinkingTokens] with `thinkingTokens.orElse(null)`. */
        fun thinkingTokens(thinkingTokens: Optional<Long>) =
            thinkingTokens(thinkingTokens.getOrNull())

        /**
         * Sets [Builder.thinkingTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thinkingTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun thinkingTokens(thinkingTokens: JsonField<Long>) = apply {
            this.thinkingTokens = thinkingTokens
        }

        /** A parameter enabling an agent to summarize tool calls. */
        fun toolCallSummary(toolCallSummary: Boolean?) =
            toolCallSummary(JsonField.ofNullable(toolCallSummary))

        /**
         * Alias for [Builder.toolCallSummary].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun toolCallSummary(toolCallSummary: Boolean) = toolCallSummary(toolCallSummary as Boolean?)

        /** Alias for calling [Builder.toolCallSummary] with `toolCallSummary.orElse(null)`. */
        fun toolCallSummary(toolCallSummary: Optional<Boolean>) =
            toolCallSummary(toolCallSummary.getOrNull())

        /**
         * Sets [Builder.toolCallSummary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolCallSummary] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun toolCallSummary(toolCallSummary: JsonField<Boolean>) = apply {
            this.toolCallSummary = toolCallSummary
        }

        /** A dictionary of tools that the agent can use to complete its task. */
        fun toolsListDictionary(toolsListDictionary: List<ToolsListDictionary>?) =
            toolsListDictionary(JsonField.ofNullable(toolsListDictionary))

        /**
         * Alias for calling [Builder.toolsListDictionary] with `toolsListDictionary.orElse(null)`.
         */
        fun toolsListDictionary(toolsListDictionary: Optional<List<ToolsListDictionary>>) =
            toolsListDictionary(toolsListDictionary.getOrNull())

        /**
         * Sets [Builder.toolsListDictionary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolsListDictionary] with a well-typed
         * `List<ToolsListDictionary>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun toolsListDictionary(toolsListDictionary: JsonField<List<ToolsListDictionary>>) = apply {
            this.toolsListDictionary = toolsListDictionary.map { it.toMutableList() }
        }

        /**
         * Adds a single [ToolsListDictionary] to [Builder.toolsListDictionary].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addToolsListDictionary(toolsListDictionary: ToolsListDictionary) = apply {
            this.toolsListDictionary =
                (this.toolsListDictionary ?: JsonField.of(mutableListOf())).also {
                    checkKnown("toolsListDictionary", it).add(toolsListDictionary)
                }
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [AgentSpec].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .agentName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentSpec =
            AgentSpec(
                checkRequired("agentName", agentName),
                autoGeneratePrompt,
                description,
                dynamicTemperatureEnabled,
                llmArgs,
                maxLoops,
                maxTokens,
                mcpConfig,
                mcpConfigs,
                mcpUrl,
                modelName,
                reasoningEffort,
                reasoningEnabled,
                role,
                streamingOn,
                systemPrompt,
                temperature,
                thinkingTokens,
                toolCallSummary,
                (toolsListDictionary ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AgentSpec = apply {
        if (validated) {
            return@apply
        }

        agentName()
        autoGeneratePrompt()
        description()
        dynamicTemperatureEnabled()
        llmArgs().ifPresent { it.validate() }
        maxLoops()
        maxTokens()
        mcpConfig().ifPresent { it.validate() }
        mcpConfigs().ifPresent { it.validate() }
        mcpUrl()
        modelName()
        reasoningEffort()
        reasoningEnabled()
        role()
        streamingOn()
        systemPrompt()
        temperature()
        thinkingTokens()
        toolCallSummary()
        toolsListDictionary().ifPresent { it.forEach { it.validate() } }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: SwarmsClientInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (agentName.asKnown().isPresent) 1 else 0) +
            (if (autoGeneratePrompt.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (dynamicTemperatureEnabled.asKnown().isPresent) 1 else 0) +
            (llmArgs.asKnown().getOrNull()?.validity() ?: 0) +
            (if (maxLoops.asKnown().isPresent) 1 else 0) +
            (if (maxTokens.asKnown().isPresent) 1 else 0) +
            (mcpConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (mcpConfigs.asKnown().getOrNull()?.validity() ?: 0) +
            (if (mcpUrl.asKnown().isPresent) 1 else 0) +
            (if (modelName.asKnown().isPresent) 1 else 0) +
            (if (reasoningEffort.asKnown().isPresent) 1 else 0) +
            (if (reasoningEnabled.asKnown().isPresent) 1 else 0) +
            (if (role.asKnown().isPresent) 1 else 0) +
            (if (streamingOn.asKnown().isPresent) 1 else 0) +
            (if (systemPrompt.asKnown().isPresent) 1 else 0) +
            (if (temperature.asKnown().isPresent) 1 else 0) +
            (if (thinkingTokens.asKnown().isPresent) 1 else 0) +
            (if (toolCallSummary.asKnown().isPresent) 1 else 0) +
            (toolsListDictionary.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /**
     * Additional arguments to pass to the LLM such as top_p, frequency_penalty, presence_penalty,
     * etc.
     */
    class LlmArgs
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [LlmArgs]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LlmArgs]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(llmArgs: LlmArgs) = apply {
                additionalProperties = llmArgs.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [LlmArgs].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): LlmArgs = LlmArgs(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): LlmArgs = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: SwarmsClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LlmArgs && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "LlmArgs{additionalProperties=$additionalProperties}"
    }

    /**
     * The MCP connections to use for the agent. This is a list of MCP connections. Includes
     * multiple MCP connections.
     */
    class McpConfigs
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val connections: JsonField<List<McpConnection>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("connections")
            @ExcludeMissing
            connections: JsonField<List<McpConnection>> = JsonMissing.of()
        ) : this(connections, mutableMapOf())

        /**
         * List of MCP connections
         *
         * @throws SwarmsClientInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun connections(): List<McpConnection> = connections.getRequired("connections")

        /**
         * Returns the raw JSON value of [connections].
         *
         * Unlike [connections], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("connections")
        @ExcludeMissing
        fun _connections(): JsonField<List<McpConnection>> = connections

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [McpConfigs].
             *
             * The following fields are required:
             * ```java
             * .connections()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [McpConfigs]. */
        class Builder internal constructor() {

            private var connections: JsonField<MutableList<McpConnection>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(mcpConfigs: McpConfigs) = apply {
                connections = mcpConfigs.connections.map { it.toMutableList() }
                additionalProperties = mcpConfigs.additionalProperties.toMutableMap()
            }

            /** List of MCP connections */
            fun connections(connections: List<McpConnection>) =
                connections(JsonField.of(connections))

            /**
             * Sets [Builder.connections] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connections] with a well-typed `List<McpConnection>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun connections(connections: JsonField<List<McpConnection>>) = apply {
                this.connections = connections.map { it.toMutableList() }
            }

            /**
             * Adds a single [McpConnection] to [connections].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addConnection(connection: McpConnection) = apply {
                connections =
                    (connections ?: JsonField.of(mutableListOf())).also {
                        checkKnown("connections", it).add(connection)
                    }
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [McpConfigs].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .connections()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): McpConfigs =
                McpConfigs(
                    checkRequired("connections", connections).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): McpConfigs = apply {
            if (validated) {
                return@apply
            }

            connections().forEach { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: SwarmsClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (connections.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is McpConfigs &&
                connections == other.connections &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(connections, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "McpConfigs{connections=$connections, additionalProperties=$additionalProperties}"
    }

    class ToolsListDictionary
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ToolsListDictionary]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ToolsListDictionary]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(toolsListDictionary: ToolsListDictionary) = apply {
                additionalProperties = toolsListDictionary.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ToolsListDictionary].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ToolsListDictionary =
                ToolsListDictionary(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ToolsListDictionary = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: SwarmsClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ToolsListDictionary &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ToolsListDictionary{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentSpec &&
            agentName == other.agentName &&
            autoGeneratePrompt == other.autoGeneratePrompt &&
            description == other.description &&
            dynamicTemperatureEnabled == other.dynamicTemperatureEnabled &&
            llmArgs == other.llmArgs &&
            maxLoops == other.maxLoops &&
            maxTokens == other.maxTokens &&
            mcpConfig == other.mcpConfig &&
            mcpConfigs == other.mcpConfigs &&
            mcpUrl == other.mcpUrl &&
            modelName == other.modelName &&
            reasoningEffort == other.reasoningEffort &&
            reasoningEnabled == other.reasoningEnabled &&
            role == other.role &&
            streamingOn == other.streamingOn &&
            systemPrompt == other.systemPrompt &&
            temperature == other.temperature &&
            thinkingTokens == other.thinkingTokens &&
            toolCallSummary == other.toolCallSummary &&
            toolsListDictionary == other.toolsListDictionary &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            agentName,
            autoGeneratePrompt,
            description,
            dynamicTemperatureEnabled,
            llmArgs,
            maxLoops,
            maxTokens,
            mcpConfig,
            mcpConfigs,
            mcpUrl,
            modelName,
            reasoningEffort,
            reasoningEnabled,
            role,
            streamingOn,
            systemPrompt,
            temperature,
            thinkingTokens,
            toolCallSummary,
            toolsListDictionary,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentSpec{agentName=$agentName, autoGeneratePrompt=$autoGeneratePrompt, description=$description, dynamicTemperatureEnabled=$dynamicTemperatureEnabled, llmArgs=$llmArgs, maxLoops=$maxLoops, maxTokens=$maxTokens, mcpConfig=$mcpConfig, mcpConfigs=$mcpConfigs, mcpUrl=$mcpUrl, modelName=$modelName, reasoningEffort=$reasoningEffort, reasoningEnabled=$reasoningEnabled, role=$role, streamingOn=$streamingOn, systemPrompt=$systemPrompt, temperature=$temperature, thinkingTokens=$thinkingTokens, toolCallSummary=$toolCallSummary, toolsListDictionary=$toolsListDictionary, additionalProperties=$additionalProperties}"
}
