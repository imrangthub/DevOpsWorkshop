#SonarQube
===========================

 Running SonarQube server with docker:
 
    =>docker run -d --name my-sonarqube-server -e SONAR_ES_BOOTSTRAP_CHECKS_DISABLE=true -p 9000:9000 sonarqube:latest


add in spring boot project:

    <dependency>
      <groupId>org.jacoco</groupId>
      <artifactId>jacoco-maven-plugin</artifactId>
      <version>0.8.10</version>
    </dependency>
    OR
    <build>
        <pluginManagement>
            <plugins>
                <plugin>
                    <groupId>org.sonarsource.scanner.maven</groupId>
                    <artifactId>sonar-maven-plugin</artifactId>
                    <version>3.4.0.905</version>
                </plugin>
            </plugins>
        </pluginManagement>
    </build>




Run maven app:

    mvn sonar:sonar

![image](https://github.com/user-attachments/assets/7c346da3-0a39-4009-9ed7-c13de07725eb)
