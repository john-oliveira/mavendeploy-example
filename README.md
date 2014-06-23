This is a sample project to deploy on JBoss server and run all tests, including integration tests in this case are the acceptance tests with Selenium. 

With a running instance of JBoss 7 execute the command:

`mvn clean install -Pambiente-integracao`

The profile 'environment-integration' instructs to deploy on JBoss 7 and run integration tests (see pom.xml).