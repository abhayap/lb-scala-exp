import sbt._

object Version {
  val scalaVer     = "2.12.3"
  val scalaParsers = "1.0.4"
  val scalaTest    = "3.0.1"
  val playJson     = "2.6.3"
}

object Library {
  val scalaParsers = "org.scala-lang.modules" %% "scala-parser-combinators" % Version.scalaParsers
  val scalaReflect = "org.scala-lang"          % "scala-reflect"            % Version.scalaVer
  val scalaTest    = "org.scalatest"          %% "scalatest"                % Version.scalaTest
  val playJson     = "com.typesafe.play"      %% "play-json"                % Version.playJson
}

object Dependencies {

  import Library._

  val dependencies = List(
    scalaParsers,
    scalaReflect,
    scalaTest % "test"
  )
}
