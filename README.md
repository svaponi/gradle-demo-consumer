# Maven Remote Repository Gradle Demo Consumer

Java/Gradle demo project to show **how to use private artifacts** from a remote _Maven Repository_. 

To see **how to publish private artifacts** on a remote _Maven Repository_ see [svaponi/gradle-demo-artifact](https://github.com/svaponi/gradle-demo-artifact).


## How to

Build and test project:

```bash
gradle clean build
```

If you get an error, see [Local configuration for remote Maven Repository](/#local-configuration-for-remote-maven-repository).

Package:

```bash
gradle clean test jar
```

Run application:

```bash
java -jar build/libs/*-1.0.jar
```

### Gradle Tasks

Show all Gradle tasks available on this project:

```bash
gradle tasks --all
```

### Local configuration for remote Maven Repository

To connect to our remote Maven repository we need to define some variable used by Gradle.

In order to make variables visible to our Gradle scripts, you need to define them in `~/.gradle/gradle.properties`.

```bash
echo '
remote_repository_baseurl=YOUR_REMOTE_REPOSITORY_URL
remote_repository_username=YOUR_REMOTE_REPOSITORY_USERNAME
remote_repository_password=YOUR_REMOTE_REPOSITORY_ENCRYPTED_PASSWORD
' >> ~/.gradle/gradle.properties
```
> **ATTENTION**: the property names are not standard. They are only used within this repository, see [`build.gradle`](/build.gradle).

> If you use Artifatory, see [JFrog documentation](https://www.jfrog.com/confluence/display/RTF/Centrally+Secure+Passwords).
