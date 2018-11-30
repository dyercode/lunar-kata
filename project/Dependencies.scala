import sbt._
import Keys._

object Dependencies {
  // Versions

  // Libraries
  val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"

  // Projects
  val lunarDependencies = Seq(scalaTest % "test")
}
