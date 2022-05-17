# Author
Anna Moshchenok

# Libraries
1. Rest Assured  - a java library used for testing and validating the Restful Web Services
1. TestNG - test run/management engine
1. AssertJ - http://joel-costigliola.github.io/assertj/ - fluent assertion instead of testNG assertThat, allows using soft assertions
1. Guice https://github.com/google/guice - a dependency injection framework
1. Lombok - library to write less code

## About the project
Test implementation is based on interfaces. This approach allows runs the same test cases on different environments, localization, platforms

In this project, only an approach for different localizations was realized, but the project could be easily scaled to verify different environments, browsers, etc

To change the localization - set up localization(en/nl) in the 'application.properties' file.

# Run tests

In the root of the project run the command: $ mvn clean test

To generate allure report after test running run the command: $ allure serve target/allure-results

## Preconditions
Need to have JAVA version 8 installed in you system(if you use macOS run $ brew install --cask java8)

Need to have Maven installed (for MacOS run $ brew install maven)

Need to be installed [IntelliJ IDEA](https://www.jetbrains.com/idea/)

Need to be installed allure to generate allure reports (For Mas OS brew install allure) https://docs.qameta.io/allure/#_installing_a_commandline

## IDEA
1. Install the lombok plugin from official market
   1. Open "Preferences"
   1. Open "Plugins"
   1. Search for "lombok" install it and restart the IDE
1. Enable annotation preprocessor for the opened project
   1. Open "Preferences"
   1. Search for "annotation processor"
   1. Click checkbox to enable annotation processor for current project









