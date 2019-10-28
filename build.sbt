import Dependencies._

name := "scala-sanskrit"

version := "0.1"

scalaVersion := "2.13.1"

ThisBuild / scalaVersion := "2.13.0"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.infomofo"
ThisBuild / organizationName := "infomofo"

lazy val root = (project in file("."))
  .settings(
    name := "scala-sanskrit",
    libraryDependencies += scalaTest % Test
  )
