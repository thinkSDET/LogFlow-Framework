# LogConcept Framework

A lightweight logging solution for parallel test execution in TestNG.

## Key Features

- **Thread-safe logging** - Isolated logs per test thread
- **Parallel execution support** - Works seamlessly with TestNG parallel tests
- **Minimal configuration** - Easy setup with Log4j2

## Installation

Add this dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
    <version>2.22.1</version>
</dependency>
