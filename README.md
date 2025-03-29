LogConcept-FrameworkLogConcept-Framework is a test automation framework built using TestNG, Log4j, and Maven. It provides structured logging for parallel test execution and helps in managing logs efficiently using thread-based logging.
📌 FeaturesParallel Execution Support: Configured via testng.xml.
Thread-Specific Logging: Uses Log4j with dynamic log file generation for each test.
Custom Test Logging Utility: TestLogger ensures proper log tracking per test case.
Environment-Specific Configuration: Loads properties dynamically based on the environment (QA, PreProd, Prod).
🛠 Setup Instructions1️⃣ Clone the Repositorygit clone https://github.com/your-repo/logconcept-framework.git
cd logconcept-framework2️⃣ Install DependenciesEnsure you have Java 22 and Maven installed.
mvn clean install3️⃣ Configuring EnvironmentsThe framework supports multiple environments (qa, preprod, prod). The environment can be set:
Via System Property:
mvn test -DENV=prodVia testng.xml Parameters:
<suite name="Regression Suite">
    <parameter name="ENV" value="qa"/>
</suite>4️⃣ Running TestsRunning with Maven:mvn testRunning Specific Test Suite:mvn test -DsuiteXmlFile=testng.xml📂 Project Structurelogconcept-framework/
├── src/test/java/
│   ├── testCases/               # Test classes
│   ├── utils/                   # Utility classes (Logging, Config, etc.)
├── src/test/resources/
│   ├── config-qa.properties     # QA Environment config
│   ├── config-preprod.properties # PreProd config
│   ├── config-prod.properties   # Prod Environment config
│   ├── log4j2.xml               # Log4j configuration
├── pom.xml                      # Maven dependencies
├── testng.xml                   # TestNG suite configuration
├── README.md                    # Project documentation📝 Logging Configuration (log4j2.xml)The framework generates thread-based logs stored in target/logs/.
<RollingFile name="Thread-${ctx:threadName}"
             fileName="target/logs/${ctx:threadName}.log"
             filePattern="target/logs/${ctx:threadName}-%d{yyyy-MM-dd}.log.gz">Example log output:
2025-03-29 12:00:01.123 [TestNG-test-LoginTest-1] LoginTest - INFO - Starting test: loginWithValidCredentials
