This is a sample project to deploy on JBoss server and run all tests, including integration tests in this case are the acceptance tests with Selenium. 

With a running instance of JBoss 7 execute the command:

`mvn clean install -Pambiente-integracao -DskipTests=false`

The profile 'environment-integration' instructs to deploy on JBoss 7 and -DskipTests=false parameter instructs the run tests (see pom.xml).