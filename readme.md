** SpringBoot Micro-services Provider for Provider side Pact test **

1. Run `mvn test` OR `mvn clean install` to build the project and run the Pact tests.
2. All the tests that in the Pact files will be executed. Provided all the States are defined in the `ProviderSideTest.java` class.
3. The `@TestTarget` annotation in the `ProviderSideTest.java` class defines the `url` and `port` where the mock will be started for the test.
4. The `path` parameter in the `@TestTarget` annotated object defines the base `sub-url` that needs to be provided between the `base uri` and the `endpoint` defined in the consumer side test.
5. For debugging purposes, if needed Run `mvn spring-boot:run` for starting the app.