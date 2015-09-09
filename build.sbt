name := "async"

organization := "qiaobutang"

version := "0.1"

scalaVersion := "2.11.7"

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-feature"
)

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.1.3"
)
