val ScalatraVersion = "2.8.0"

ThisBuild / scalaVersion := "2.13.4"
ThisBuild / organization := "com.yg"

lazy val hello = (project in file("."))
  .settings(
    name := "space",
    version := "0.1.0-SNAPSHOT",
    libraryDependencies ++= Seq(
      "org.scalatra" %% "scalatra" % ScalatraVersion,
      "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
      "ch.qos.logback" % "logback-classic" % "1.2.3" % "runtime",
      "org.eclipse.jetty" % "jetty-webapp" % "9.4.35.v20201120" % "container",
      "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
      "com.typesafe.slick" %% "slick" % "3.3.2",
      "org.slf4j" % "slf4j-nop" % "1.6.4",
      "com.typesafe.slick" %% "slick-hikaricp" % "3.3.2",
      "com.h2database" % "h2" % "1.4.196",
      "com.mchange" % "c3p0" % "0.9.5.2",
      "mysql" % "mysql-connector-java" % "5.1.44"
    ),
  )

enablePlugins(SbtTwirl)
enablePlugins(JettyPlugin)