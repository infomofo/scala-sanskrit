import Dependencies._

name := "scala-sanskrit"

version := "0.1"

scalaVersion := "2.13.1"

lazy val root = (project in file("."))
  .settings(
    name := "scala-sanskrit",
    libraryDependencies += scalaTest % Test
  )
