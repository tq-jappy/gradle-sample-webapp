gradle-sample-jettyapp
======================

- Author : Takumi Endo
- Technologies : Gradle, JAX-RS, Flyway migration, static analysis (findbugs, checkstyle)
- Application Servers : Jetty 8.x
- Summary : Simple web application by Gradle build.

## Build and Deploy Locally

```
$ gradle jettyRunWar
```

Try to access:

- http://localhost:8090/gradle-hello-webapp/hello
- http://localhost:8090/gradle-sample-webapp/services/time
