name := "learningScalaCats"

version := "0.1"

scalaVersion := "2.13.0"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "2.0.0-M2",
  "org.scalatest" %% "scalatest" % "3.0.8" % Test
)

resolvers += "cats-core" at "https://mvnrepository.com/artifact/org.typelevel/cats-core"

scalacOptions ++= Seq("-Xfatal-warnings","-Ypartial-unification")

val exportFullResolvers = taskKey[Unit]("debug resolvers")

exportFullResolvers := {
  for {
    (resolver,idx) <- fullResolvers.value.zipWithIndex
  } println(s"${idx}.  ${resolver.name}")
}