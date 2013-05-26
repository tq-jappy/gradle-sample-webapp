gradle-sample-jettyapp
======================

- Author : Takumi Endo
- Technologies : Gradle, JAX-RS, Flyway migration, static analysis (findbugs, checkstyle), Heroku (prospected)
- Application Servers : Jetty 8.x
- Summary : Simple web application by Gradle build.

## Build app

Build the app locally:

```
$ gradle build
```

Build and run app locally:

```
$ gradle jettyRunWar
```

Try to access:

- http://localhost:8090/sample/hello
- http://localhost:8090/sample/rest/time
