lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.6"
    )),
    name := "empty shapeless template",
    description := "",
    libraryDependencies += "com.chuusai" %% "shapeless" % shapelessVersion,

    scalacOptions ++= Seq(
      "-Xlint",
      "-Yno-adapted-args",
      "-Ywarn-dead-code",        // N.B. doesn't work well with the ??? hole
      "-Ywarn-numeric-widen",
      "-Ywarn-value-discard",
      "-Yliteral-types",
      "-Ywarn-unused-import"     // 2.11 only
    )
  )


lazy val shapelessVersion = "2.3.3"
