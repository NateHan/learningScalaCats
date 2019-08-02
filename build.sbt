name := "learningScalaCats"

version := "0.1"

scalaVersion := "2.13.0"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "2.0.0-M4",
  "org.scalatest" %% "scalatest" % "3.0.8" % Test
)

scalacOptions += "-Ypartial-unification"