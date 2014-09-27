name := "sbt-doctest-test"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test"
  //"org.scalacheck" %% "scalacheck" % "1.11.4" % "test"
)

DoctestPlugin.doctestSettings
