/**
 * This class is a Spring Boot application that serves as the entry point for the application.
 * It initializes the Spring context and starts the embedded web server.
 * 
 * <p>Usage:
 * To start the application, run the main method of this class.
 * The application will listen on the default port (8080) and serve the RESTful APIs defined in the controllers package.
 * 
 * <p>Dependencies:
 * This class requires the Spring Boot starter dependencies to be added to the project's build file.
 * Make sure to include the necessary dependencies in the pom.xml (for Maven) or build.gradle (for Gradle) file.
 * 
 * <p>Configuration:
 * The application can be configured using the application.properties or application.yml file.
 * Customize the properties according to your needs, such as the server port, database connection details, etc.
 * 
 * @see <a href="https://spring.io/projects/spring-boot">Spring Boot</a>
 */
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
