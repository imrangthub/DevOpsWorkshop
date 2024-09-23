#ShellScript
================================

$ cat simpleShell

        #!/bin/bash

        # Function to display the current time
        get_time() {
            echo "Current Time: $(date +'%Y-%m-%d %H:%M:%S')"
        }

        # Function to display help instructions
        show_help() {
            echo "Usage: simpleShell [command]"
            echo "Commands:"
            echo "  gettime   Show the current time"
            echo "  help      Display this help message"
            echo "  -help     Display this help message"
        }

        # Check the first argument and call the appropriate function
        case "$1" in
            gettime)
                get_time
                ;;
            help | -help)
                show_help
                ;;
            *)
                echo "Invalid command. Use 'help' for usage instructions."
                ;;
        esac


    $ export PATH="$PATH:/home/mypc/imranMadbar/myPROJECT/DevOpsWorkshop/shells-script"
    
    $ simpleShell gettime


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
