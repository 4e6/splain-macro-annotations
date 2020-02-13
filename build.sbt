scalaVersion := "2.13.1"

scalacOptions += "-Ymacro-annotations"

libraryDependencies += "io.estatico" %% "newtype" % "0.4.3"

addCompilerPlugin("io.tryp" % "splain" % "0.5.0" cross CrossVersion.patch)
