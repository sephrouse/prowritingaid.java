lazy val root = (project in file(".")).
  settings(
    organization := "prowritingaid",
    name := "pro_writing_aid_java",
    version := "2.0.0",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "io.swagger" % "swagger-annotations" % "1.5.15",
      "com.squareup.okhttp" % "okhttp" % "2.7.5",
      "com.squareup.okhttp" % "logging-interceptor" % "2.7.5",
      "com.google.code.gson" % "gson" % "2.8.1",
      "joda-time" % "joda-time" % "2.9.9" % "compile",
      "junit" % "junit" % "4.12" % "test",
      "com.novocode" % "junit-interface" % "0.10" % "test"
    )
  )