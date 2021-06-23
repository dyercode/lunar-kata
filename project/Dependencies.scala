import sbt._
import Keys._

object Dependencies {
  // Versions

  // Libraries
  val scalaTest = "org.scalatest" %% "scalatest" % "3.2.9"

  // Projects
  val lunarDependencies = Seq(scalaTest % Test)
}
