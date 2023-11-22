ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "spark-module"
  )

//com.prashant#modules-common_2.13;0.1.0-SNAPSHOT

libraryDependencies += "com.prashant" %% "modules-common" % "0.1.0-SNAPSHOT" % "provided"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.17" % Test
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.5.0"
