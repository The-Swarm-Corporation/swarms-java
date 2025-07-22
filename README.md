# Swarms Client Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.swarms.api/swarms-client-java)](https://central.sonatype.com/artifact/com.swarms.api/swarms-client-java/0.0.1-alpha.0)
[![javadoc](https://javadoc.io/badge2/com.swarms.api/swarms-client-java/0.0.1-alpha.0/javadoc.svg)](https://javadoc.io/doc/com.swarms.api/swarms-client-java/0.0.1-alpha.0)

<!-- x-release-please-end -->

The Swarms Client Java SDK provides convenient access to the [Swarms Client REST API](https://docs.swarms.world/en/latest/) from applications written in Java.

It is generated with [Stainless](https://www.stainless.com/).

<!-- x-release-please-start-version -->

The REST API documentation can be found on [docs.swarms.world](https://docs.swarms.world/en/latest/). Javadocs are available on [javadoc.io](https://javadoc.io/doc/com.swarms.api/swarms-client-java/0.0.1-alpha.0).

<!-- x-release-please-end -->

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("com.swarms.api:swarms-client-java:0.0.1-alpha.0")
```

### Maven

```xml
<dependency>
  <groupId>com.swarms.api</groupId>
  <artifactId>swarms-client-java</artifactId>
  <version>0.0.1-alpha.0</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

```java
import com.swarms.api.client.SwarmsClientClient;
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClient;
import com.swarms.api.models.ClientGetRootParams;
import com.swarms.api.models.ClientGetRootResponse;

// Configures using the `swarmsclient.swarmsApiKey` and `swarmsclient.baseUrl` system properties
// Or configures using the `SWARMS_API_KEY` and `SWARMS_CLIENT_BASE_URL` environment variables
SwarmsClientClient client = SwarmsClientOkHttpClient.fromEnv();

ClientGetRootResponse response = client.getRoot();
```

## Client configuration

Configure the client using system properties or environment variables:

```java
import com.swarms.api.client.SwarmsClientClient;
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClient;

// Configures using the `swarmsclient.swarmsApiKey` and `swarmsclient.baseUrl` system properties
// Or configures using the `SWARMS_API_KEY` and `SWARMS_CLIENT_BASE_URL` environment variables
SwarmsClientClient client = SwarmsClientOkHttpClient.fromEnv();
```

Or manually:

```java
import com.swarms.api.client.SwarmsClientClient;
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClient;

SwarmsClientClient client = SwarmsClientOkHttpClient.builder()
    .apiKey("My API Key")
    .build();
```

Or using a combination of the two approaches:

```java
import com.swarms.api.client.SwarmsClientClient;
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClient;

SwarmsClientClient client = SwarmsClientOkHttpClient.builder()
    // Configures using the `swarmsclient.swarmsApiKey` and `swarmsclient.baseUrl` system properties
    Or configures using the `SWARMS_API_KEY` and `SWARMS_CLIENT_BASE_URL` environment variables
    .fromEnv()
    .apiKey("My API Key")
    .build();
```

See this table for the available options:

| Setter    | System property             | Environment variable     | Required | Default value                                        |
| --------- | --------------------------- | ------------------------ | -------- | ---------------------------------------------------- |
| `apiKey`  | `swarmsclient.swarmsApiKey` | `SWARMS_API_KEY`         | false    | -                                                    |
| `baseUrl` | `swarmsclient.baseUrl`      | `SWARMS_CLIENT_BASE_URL` | true     | `"https://swarms-api-285321057562.us-east1.run.app"` |

System properties take precedence over environment variables.

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

### Modifying configuration

To temporarily use a modified client configuration, while reusing the same connection and thread pools, call `withOptions()` on any client or service:

```java
import com.swarms.api.client.SwarmsClientClient;

SwarmsClientClient clientWithOptions = client.withOptions(optionsBuilder -> {
    optionsBuilder.baseUrl("https://example.com");
    optionsBuilder.maxRetries(42);
});
```

The `withOptions()` method does not affect the original client or service.

## Requests and responses

To send a request to the Swarms Client API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Java class.

For example, `client.getRoot(...)` should be called with an instance of `ClientGetRootParams`, and it will return an instance of `ClientGetRootResponse`.

## Immutability

Each class in the SDK has an associated [builder](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java) or factory method for constructing it.

Each class is [immutable](https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html) once constructed. If the class has an associated builder, then it has a `toBuilder()` method, which can be used to convert it back to a builder for making a modified copy.

Because each class is immutable, builder modification will _never_ affect already built class instances.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```java
import com.swarms.api.client.SwarmsClientClient;
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClient;
import com.swarms.api.models.ClientGetRootParams;
import com.swarms.api.models.ClientGetRootResponse;
import java.util.concurrent.CompletableFuture;

// Configures using the `swarmsclient.swarmsApiKey` and `swarmsclient.baseUrl` system properties
// Or configures using the `SWARMS_API_KEY` and `SWARMS_CLIENT_BASE_URL` environment variables
SwarmsClientClient client = SwarmsClientOkHttpClient.fromEnv();

CompletableFuture<ClientGetRootResponse> response = client.async().getRoot();
```

Or create an asynchronous client from the beginning:

```java
import com.swarms.api.client.SwarmsClientClientAsync;
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClientAsync;
import com.swarms.api.models.ClientGetRootParams;
import com.swarms.api.models.ClientGetRootResponse;
import java.util.concurrent.CompletableFuture;

// Configures using the `swarmsclient.swarmsApiKey` and `swarmsclient.baseUrl` system properties
// Or configures using the `SWARMS_API_KEY` and `SWARMS_CLIENT_BASE_URL` environment variables
SwarmsClientClientAsync client = SwarmsClientOkHttpClientAsync.fromEnv();

CompletableFuture<ClientGetRootResponse> response = client.getRoot();
```

The asynchronous client supports the same options as the synchronous one, except most methods return `CompletableFuture`s.

## Raw responses

The SDK defines methods that deserialize responses into instances of Java classes. However, these methods don't provide access to the response headers, status code, or the raw response body.

To access this data, prefix any HTTP method call on a client or service with `withRawResponse()`:

```java
import com.swarms.api.core.http.Headers;
import com.swarms.api.core.http.HttpResponseFor;
import com.swarms.api.models.ClientGetRootParams;
import com.swarms.api.models.ClientGetRootResponse;

HttpResponseFor<ClientGetRootResponse> response = client.withRawResponse().getRoot();

int statusCode = response.statusCode();
Headers headers = response.headers();
```

You can still deserialize the response into an instance of a Java class if needed:

```java
import com.swarms.api.models.ClientGetRootResponse;

ClientGetRootResponse parsedResponse = response.parse();
```

## Error handling

The SDK throws custom unchecked exception types:

- [`SwarmsClientServiceException`](swarms-client-java-core/src/main/kotlin/com/swarms/api/errors/SwarmsClientServiceException.kt): Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                                                                                                                         |
  | ------ | --------------------------------------------------------------------------------------------------------------------------------- |
  | 400    | [`BadRequestException`](swarms-client-java-core/src/main/kotlin/com/swarms/api/errors/BadRequestException.kt)                     |
  | 401    | [`UnauthorizedException`](swarms-client-java-core/src/main/kotlin/com/swarms/api/errors/UnauthorizedException.kt)                 |
  | 403    | [`PermissionDeniedException`](swarms-client-java-core/src/main/kotlin/com/swarms/api/errors/PermissionDeniedException.kt)         |
  | 404    | [`NotFoundException`](swarms-client-java-core/src/main/kotlin/com/swarms/api/errors/NotFoundException.kt)                         |
  | 422    | [`UnprocessableEntityException`](swarms-client-java-core/src/main/kotlin/com/swarms/api/errors/UnprocessableEntityException.kt)   |
  | 429    | [`RateLimitException`](swarms-client-java-core/src/main/kotlin/com/swarms/api/errors/RateLimitException.kt)                       |
  | 5xx    | [`InternalServerException`](swarms-client-java-core/src/main/kotlin/com/swarms/api/errors/InternalServerException.kt)             |
  | others | [`UnexpectedStatusCodeException`](swarms-client-java-core/src/main/kotlin/com/swarms/api/errors/UnexpectedStatusCodeException.kt) |

- [`SwarmsClientIoException`](swarms-client-java-core/src/main/kotlin/com/swarms/api/errors/SwarmsClientIoException.kt): I/O networking errors.

- [`SwarmsClientInvalidDataException`](swarms-client-java-core/src/main/kotlin/com/swarms/api/errors/SwarmsClientInvalidDataException.kt): Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- [`SwarmsClientException`](swarms-client-java-core/src/main/kotlin/com/swarms/api/errors/SwarmsClientException.kt): Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

## Logging

The SDK uses the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

Enable logging by setting the `SWARMS_CLIENT_LOG` environment variable to `info`:

```sh
$ export SWARMS_CLIENT_LOG=info
```

Or to `debug` for more verbose logging:

```sh
$ export SWARMS_CLIENT_LOG=debug
```

## Jackson

The SDK depends on [Jackson](https://github.com/FasterXML/jackson) for JSON serialization/deserialization. It is compatible with version 2.13.4 or higher, but depends on version 2.18.2 by default.

The SDK throws an exception if it detects an incompatible Jackson version at runtime (e.g. if the default version was overridden in your Maven or Gradle config).

If the SDK threw an exception, but you're _certain_ the version is compatible, then disable the version check using the `checkJacksonVersionCompatibility` on [`SwarmsClientOkHttpClient`](swarms-client-java-client-okhttp/src/main/kotlin/com/swarms/api/client/okhttp/SwarmsClientOkHttpClient.kt) or [`SwarmsClientOkHttpClientAsync`](swarms-client-java-client-okhttp/src/main/kotlin/com/swarms/api/client/okhttp/SwarmsClientOkHttpClientAsync.kt).

> [!CAUTION]
> We make no guarantee that the SDK works correctly when the Jackson version check is disabled.

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a response.

To set a custom number of retries, configure the client using the `maxRetries` method:

```java
import com.swarms.api.client.SwarmsClientClient;
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClient;

SwarmsClientClient client = SwarmsClientOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default.

To set a custom timeout, configure the method call using the `timeout` method:

```java
import com.swarms.api.models.ClientGetRootResponse;

ClientGetRootResponse response = client.getRoot(RequestOptions.builder().timeout(Duration.ofSeconds(30)).build());
```

Or configure the default for all method calls at the client level:

```java
import com.swarms.api.client.SwarmsClientClient;
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClient;
import java.time.Duration;

SwarmsClientClient client = SwarmsClientOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build();
```

### Proxies

To route requests through a proxy, configure the client using the `proxy` method:

```java
import com.swarms.api.client.SwarmsClientClient;
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClient;
import java.net.InetSocketAddress;
import java.net.Proxy;

SwarmsClientClient client = SwarmsClientOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
      Proxy.Type.HTTP, new InetSocketAddress(
        "https://example.com", 8080
      )
    ))
    .build();
```

### HTTPS

> [!NOTE]
> Most applications should not call these methods, and instead use the system defaults. The defaults include
> special optimizations that can be lost if the implementations are modified.

To configure how HTTPS connections are secured, configure the client using the `sslSocketFactory`, `trustManager`, and `hostnameVerifier` methods:

```java
import com.swarms.api.client.SwarmsClientClient;
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClient;

SwarmsClientClient client = SwarmsClientOkHttpClient.builder()
    .fromEnv()
    // If `sslSocketFactory` is set, then `trustManager` must be set, and vice versa.
    .sslSocketFactory(yourSSLSocketFactory)
    .trustManager(yourTrustManager)
    .hostnameVerifier(yourHostnameVerifier)
    .build();
```

### Custom HTTP client

The SDK consists of three artifacts:

- `swarms-client-java-core`
  - Contains core SDK logic
  - Does not depend on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`SwarmsClientClient`](swarms-client-java-core/src/main/kotlin/com/swarms/api/client/SwarmsClientClient.kt), [`SwarmsClientClientAsync`](swarms-client-java-core/src/main/kotlin/com/swarms/api/client/SwarmsClientClientAsync.kt), [`SwarmsClientClientImpl`](swarms-client-java-core/src/main/kotlin/com/swarms/api/client/SwarmsClientClientImpl.kt), and [`SwarmsClientClientAsyncImpl`](swarms-client-java-core/src/main/kotlin/com/swarms/api/client/SwarmsClientClientAsyncImpl.kt), all of which can work with any HTTP client
- `swarms-client-java-client-okhttp`
  - Depends on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`SwarmsClientOkHttpClient`](swarms-client-java-client-okhttp/src/main/kotlin/com/swarms/api/client/okhttp/SwarmsClientOkHttpClient.kt) and [`SwarmsClientOkHttpClientAsync`](swarms-client-java-client-okhttp/src/main/kotlin/com/swarms/api/client/okhttp/SwarmsClientOkHttpClientAsync.kt), which provide a way to construct [`SwarmsClientClientImpl`](swarms-client-java-core/src/main/kotlin/com/swarms/api/client/SwarmsClientClientImpl.kt) and [`SwarmsClientClientAsyncImpl`](swarms-client-java-core/src/main/kotlin/com/swarms/api/client/SwarmsClientClientAsyncImpl.kt), respectively, using OkHttp
- `swarms-client-java`
  - Depends on and exposes the APIs of both `swarms-client-java-core` and `swarms-client-java-client-okhttp`
  - Does not have its own logic

This structure allows replacing the SDK's default HTTP client without pulling in unnecessary dependencies.

#### Customized [`OkHttpClient`](https://square.github.io/okhttp/3.x/okhttp/okhttp3/OkHttpClient.html)

> [!TIP]
> Try the available [network options](#network-options) before replacing the default client.

To use a customized `OkHttpClient`:

1. Replace your [`swarms-client-java` dependency](#installation) with `swarms-client-java-core`
2. Copy `swarms-client-java-client-okhttp`'s [`OkHttpClient`](swarms-client-java-client-okhttp/src/main/kotlin/com/swarms/api/client/okhttp/OkHttpClient.kt) class into your code and customize it
3. Construct [`SwarmsClientClientImpl`](swarms-client-java-core/src/main/kotlin/com/swarms/api/client/SwarmsClientClientImpl.kt) or [`SwarmsClientClientAsyncImpl`](swarms-client-java-core/src/main/kotlin/com/swarms/api/client/SwarmsClientClientAsyncImpl.kt), similarly to [`SwarmsClientOkHttpClient`](swarms-client-java-client-okhttp/src/main/kotlin/com/swarms/api/client/okhttp/SwarmsClientOkHttpClient.kt) or [`SwarmsClientOkHttpClientAsync`](swarms-client-java-client-okhttp/src/main/kotlin/com/swarms/api/client/okhttp/SwarmsClientOkHttpClientAsync.kt), using your customized client

### Completely custom HTTP client

To use a completely custom HTTP client:

1. Replace your [`swarms-client-java` dependency](#installation) with `swarms-client-java-core`
2. Write a class that implements the [`HttpClient`](swarms-client-java-core/src/main/kotlin/com/swarms/api/core/http/HttpClient.kt) interface
3. Construct [`SwarmsClientClientImpl`](swarms-client-java-core/src/main/kotlin/com/swarms/api/client/SwarmsClientClientImpl.kt) or [`SwarmsClientClientAsyncImpl`](swarms-client-java-core/src/main/kotlin/com/swarms/api/client/SwarmsClientClientAsyncImpl.kt), similarly to [`SwarmsClientOkHttpClient`](swarms-client-java-client-okhttp/src/main/kotlin/com/swarms/api/client/okhttp/SwarmsClientOkHttpClient.kt) or [`SwarmsClientOkHttpClientAsync`](swarms-client-java-client-okhttp/src/main/kotlin/com/swarms/api/client/okhttp/SwarmsClientOkHttpClientAsync.kt), using your new client class

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```java
import com.swarms.api.core.JsonValue;
import com.swarms.api.models.ClientGetRootParams;

ClientGetRootParams params = ClientGetRootParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build();
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a [`JsonValue`](swarms-client-java-core/src/main/kotlin/com/swarms/api/core/Values.kt) object to its setter:

```java
import com.swarms.api.models.ClientGetRootParams;

ClientGetRootParams params = ClientGetRootParams.builder().build();
```

The most straightforward way to create a [`JsonValue`](swarms-client-java-core/src/main/kotlin/com/swarms/api/core/Values.kt) is using its `from(...)` method:

```java
import com.swarms.api.core.JsonValue;
import java.util.List;
import java.util.Map;

// Create primitive JSON values
JsonValue nullValue = JsonValue.from(null);
JsonValue booleanValue = JsonValue.from(true);
JsonValue numberValue = JsonValue.from(42);
JsonValue stringValue = JsonValue.from("Hello World!");

// Create a JSON array value equivalent to `["Hello", "World"]`
JsonValue arrayValue = JsonValue.from(List.of(
  "Hello", "World"
));

// Create a JSON object value equivalent to `{ "a": 1, "b": 2 }`
JsonValue objectValue = JsonValue.from(Map.of(
  "a", 1,
  "b", 2
));

// Create an arbitrarily nested JSON equivalent to:
// {
//   "a": [1, 2],
//   "b": [3, 4]
// }
JsonValue complexValue = JsonValue.from(Map.of(
  "a", List.of(
    1, 2
  ),
  "b", List.of(
    3, 4
  )
));
```

### Response properties

To access undocumented response properties, call the `_additionalProperties()` method:

```java
import com.swarms.api.core.JsonValue;
import java.util.Map;

Map<String, JsonValue> additionalProperties = client.getRoot(params)._additionalProperties();
JsonValue secretPropertyValue = additionalProperties.get("secretProperty");

String result = secretPropertyValue.accept(new JsonValue.Visitor<>() {
    @Override
    public String visitNull() {
        return "It's null!";
    }

    @Override
    public String visitBoolean(boolean value) {
        return "It's a boolean!";
    }

    @Override
    public String visitNumber(Number value) {
        return "It's a number!";
    }

    // Other methods include `visitMissing`, `visitString`, `visitArray`, and `visitObject`
    // The default implementation of each unimplemented method delegates to `visitDefault`, which throws by default, but can also be overridden
});
```

To access a property's raw JSON value, which may be undocumented, call its `_` prefixed method:

```java
import com.swarms.api.core.JsonField;
import java.util.Optional;

JsonField<Object> field = client.getRoot(params)._field();

if (field.isMissing()) {
  // The property is absent from the JSON response
} else if (field.isNull()) {
  // The property was set to literal null
} else {
  // Check if value was provided as a string
  // Other methods include `asNumber()`, `asBoolean()`, etc.
  Optional<String> jsonString = field.asString();

  // Try to deserialize into a custom type
  MyClass myObject = field.asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Response validation

In rare cases, the API may return a response that doesn't match the expected type. For example, the SDK may expect a property to contain a `String`, but the API could return something else.

By default, the SDK will not throw an exception in this case. It will throw [`SwarmsClientInvalidDataException`](swarms-client-java-core/src/main/kotlin/com/swarms/api/errors/SwarmsClientInvalidDataException.kt) only if you directly access the property.

If you would prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```java
import com.swarms.api.models.ClientGetRootResponse;

ClientGetRootResponse response = client.getRoot(params).validate();
```

Or configure the method call to validate the response using the `responseValidation` method:

```java
import com.swarms.api.models.ClientGetRootResponse;

ClientGetRootResponse response = client.getRoot(RequestOptions.builder().responseValidation(true).build());
```

Or configure the default for all method calls at the client level:

```java
import com.swarms.api.client.SwarmsClientClient;
import com.swarms.api.client.okhttp.SwarmsClientOkHttpClient;

SwarmsClientClient client = SwarmsClientOkHttpClient.builder()
    .fromEnv()
    .responseValidation(true)
    .build();
```

## FAQ

### Why don't you use plain `enum` classes?

Java `enum` classes are not trivially [forwards compatible](https://www.stainless.com/blog/making-java-enums-forwards-compatible). Using them in the SDK could cause runtime exceptions if the API is updated to respond with a new enum value.

### Why do you represent fields using `JsonField<T>` instead of just plain `T`?

Using `JsonField<T>` enables a few features:

- Allowing usage of [undocumented API functionality](#undocumented-api-functionality)
- Lazily [validating the API response against the expected shape](#response-validation)
- Representing absent vs explicitly null values

### Why don't you use [`data` classes](https://kotlinlang.org/docs/data-classes.html)?

It is not [backwards compatible to add new fields to a data class](https://kotlinlang.org/docs/api-guidelines-backward-compatibility.html#avoid-using-data-classes-in-your-api) and we don't want to introduce a breaking change every time we add a field to a class.

### Why don't you use checked exceptions?

Checked exceptions are widely considered a mistake in the Java programming language. In fact, they were omitted from Kotlin for this reason.

Checked exceptions:

- Are verbose to handle
- Encourage error handling at the wrong level of abstraction, where nothing can be done about the error
- Are tedious to propagate due to the [function coloring problem](https://journal.stuffwithstuff.com/2015/02/01/what-color-is-your-function)
- Don't play well with lambdas (also due to the function coloring problem)

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/The-Swarm-Corporation/swarms-java/issues) with questions, bugs, or suggestions.
