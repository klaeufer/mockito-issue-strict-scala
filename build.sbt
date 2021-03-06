name := "mockito-issue-strict-scala"

version := "0.1"

scalaVersion := "2.12.9"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Ywarn-dead-code")

libraryDependencies ++= Seq(
  "com.novocode"  %  "junit-interface" % "0.11"   % Test,
  "org.scalatest" %% "scalatest"       % "3.0.5"  % Test,
  "org.mockito"   %% "mockito-scala"   % "1.+"    % Test
)

enablePlugins(JavaAppPackaging)
