name := "Common"

version := "0.1"

scalaVersion := "2.13.5"
libraryDependencies += "io.github.embeddedkafka" %% "embedded-kafka" % "2.8.0" % Test
libraryDependencies += "org.json4s" %% "json4s-native" % "3.7.0-M16"
libraryDependencies += "org.scalactic" %% "scalactic" % "3.3.0-SNAP3"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test
libraryDependencies += "org.mockito" %% "mockito-scala" % "1.16.37" % Test
lazy val actor =project.dependsOn()
  .settings{
    libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % "2.6.14"
    libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.6.14"
    libraryDependencies += "com.typesafe.akka" %% "akka-persistence-typed" % "2.6.14"
    libraryDependencies += "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.6.14" % Test
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test
  }
lazy val Common =project.dependsOn(actor)
lazy val root = (project in file(".")).aggregate(Common,actor)