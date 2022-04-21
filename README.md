# Honeycomb Aleph

Project to demonstrate exception when using Honeycomb and Aleph.

## Reproduction

1. Install [Clojure](https://clojure.org/guides/getting_started#_clojure_installer_and_cli_tools)
2. Clone and build the project `clj -T:build uber`
3. [Download](https://docs.honeycomb.io/getting-data-in/opentelemetry/java-distro/#automatic-instrumentation-with-the-opentelemetry-java-agent) the Honeycomb javaagent
4. Update the `honeycomb-config.txt` with you details
5. Run the resulting jar `HONEYCOMB_CONFIG_FILE=./honeycomb-config.txt java -javaagent:honeycomb-opentelemetry-javaagent-1.0.0.jar -jar target/honeycomb-aleph-0.1.1-standalone.jar`

### OpenTelemetry

This also reproduces with the stock OpenTelemetry javaagent using the following steps

1. Install [Clojure](https://clojure.org/guides/getting_started#_clojure_installer_and_cli_tools)
2. Clone and build the project `clj -T:build uber`
3. [Download](https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v1.13.0/opentelemetry-javaagent.jar)
the OpenTelemetry javaagent
5. Run the resulting jar `OTEL_TRACES_EXPORTER=logging java -javaagent:opentelemetry-javaagent.jar -jar target/honeycomb-aleph-0.1.1-standalone.jar`

### Note

Running the jar without the javaagent, `java -jar target/honeycomb-aleph-0.1.1-standalone.jar`, works as expected.
