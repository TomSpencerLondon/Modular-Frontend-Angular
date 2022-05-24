# Modular-Frontend-Angular
Modular Frontend Application with Angular

https://frakton.com/utilizing-maven-front-end-plugin-for-angular-spring-boot/

# Testing back-end and front-end
After completing the configurations steps, we make sure our instances are working correctly before the build. First we can run the backend project by using: mvn spring-boot:run

*Also make sure you execute the command inside the backend module.

Next. we can start our Angular project using: ng serve

# Build project
If everything seems to work correctly we can build the project using: mvn clean install

Make sure you are executing the command in the spring-boot-angular-maven-build parent module

After building the application, in the backend is generated the target/ folder which contains the jar: backend-0.0.1-SNAPSHOT.jar And in the frontend is generated the dist/ folder and node_modules. If you want to run the executable JAR, open terminal and add:

java -jar backend-0.0.1-SNAPSHOT.jar



