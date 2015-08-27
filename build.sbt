/* Turn this project into a Scala.js project by importing these settings */
enablePlugins(ScalaJSPlugin)

workbenchSettings

name := "sjs-js-interop"

version := "1.0"

scalaVersion := "2.11.7"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint"
)

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.8.0",
  "be.doeraene" %%% "scalajs-jquery" % "0.8.0",
  "com.lihaoyi" %%% "scalatags" % "0.5.2",
  "com.lihaoyi" %%% "utest" % "0.3.1" % "test"
)

/* Collect all JavaScript dependencies in one file */
skip in packageJSDependencies := false

/* Make the DOM available for the runtime, that is for Rhino or Node.js. */
jsDependencies += RuntimeDOM

testFrameworks += new TestFramework("utest.runner.Framework")

/* So the main() is auto-detected and needs not to be included in the html */
persistLauncher in Compile := true

/* No main() for tests */
persistLauncher in Test := false

/* For the workbench */
bootSnippet := "base.webapp.BaseApp().main();"

/* Choose one of the two workbench modes */
//updateBrowsers <<= updateBrowsers.triggeredBy(fastOptJS in Compile)
refreshBrowsers <<= refreshBrowsers.triggeredBy(fastOptJS in Compile)

EclipseKeys.withSource := true
