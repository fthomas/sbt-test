name := "sbt-doctest-test"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "org.scalacheck" %% "scalacheck" % "1.10.0" % "test"
)

DoctestPlugin.doctestSettings
