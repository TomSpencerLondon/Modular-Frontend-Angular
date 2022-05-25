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

# localhost:8081/users
![Screenshot 2022-05-25 at 08 46 57](https://user-images.githubusercontent.com/27693622/170209311-91ceda43-c5e7-49a9-8604-5d3e2ac1e14d.png)
# localhost:8081/adduser
![Screenshot 2022-05-25 at 08 47 57](https://user-images.githubusercontent.com/27693622/170209442-85ee5515-e5e0-4151-b16b-203ef4774f1a.png)


