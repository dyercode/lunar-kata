import sbt._
import Keys._

object Dependencies {
  // Libraries
  val scalaTest = "org.scalatest" %% "scalatest" % "3.2.16"

  // Projects
  val lunarDependencies = Seq(scalaTest % Test)
}
