name := "sbt-doctest-test"

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.10.0" % "test"
)

DoctestPlugin.doctestSettings
