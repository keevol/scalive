organization := "tv.cntt"

name         := "scalive-repl"

version      := "1.0-SNAPSHOT"

autoScalaLibrary := false

libraryDependencies <+= scalaVersion { v =>
  "org.scala-lang" % "scala-compiler" % v
}
