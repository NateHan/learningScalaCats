name := "learningScalaCats"

version := "0.1"

scalaVersion := "2.13.0"

libraryDependencies ++= Seq("org.typelevel" %% "cats-core" % "2.0.0-M2")

resolvers += "cats-core" at "https://mvnrepository.com/artifact/org.typelevel/cats-core"

scalacOptions ++= Seq("-Xfatal-warnings","-Ypartial-unification")
