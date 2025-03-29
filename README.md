# LogConcept Framework

A lightweight logging solution for parallel test execution in TestNG.

## Key Features

- **Thread-safe logging** - Isolated logs per test thread with automatic file naming (`{TestClass}-{ThreadID}.log`)
- **Parallel execution support** - Works seamlessly with TestNG parallel tests (methods/classes/tests)
- **Minimal configuration** - Easy setup with Log4j2 (single config file)
- **Environment-aware** - Automatically loads `config-{env}.properties` (QA/Prod) via `-DENV=prod`
- **Browser control** - Override defaults with `-Dbrowser=firefox` or `-DHEADLESS=true`
- **TestNG integration** - Supports XML parameters via `<parameter name="env" value="prod">`
- **Structured output** - Consistent log format with timestamps, thread IDs, and log levels

## Installation

1. **Prerequisites**:
   - Java 17+
   - Maven 3.8+
   - TestNG 7.10.2+

2. **Add to `pom.xml`**:
```xml
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
    <version>2.22.1</version>
</dependency>
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.10.2</version>
</dependency>
