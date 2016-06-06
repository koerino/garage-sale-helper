name := """yard-sell-helper"""

version := "1.0"

scalaVersion := "2.11.7"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean, SbtWeb)

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)