ThisBuild / version      := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "2.12.9"

lazy val core = project
  .in(file("core"))
  .settings(
    name := "$name;format="lower,hyphen"$",
  )
  .dependsOn(verified)

lazy val verified = project
  .in(file("verified"))
  .enablePlugins(StainlessPlugin)
  .settings(
    name := "$name;format="lower,hyphen"$-verified"
  )

