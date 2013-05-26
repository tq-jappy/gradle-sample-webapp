gradle-sample-jettyapp
======================

- Author : Takumi Endo
- Technologies : Gradle, JAX-RS, Flyway migration, static analysis (findbugs, checkstyle), Heroku (prospected)
- Application Servers : Jetty 8.x
- Summary : Simple web application by Gradle build.

## Build app locally:

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

## Deploy to Heroku

```
$ heroku create -s cedar {appname}
$ git push heroku master
```

Try to access:

- http://{appname}.herokuapp.com/gradle-sample/hello
- http://{appname}.herokuapp.com/gradle-sample/rest/time