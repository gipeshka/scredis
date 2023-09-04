resolvers += "Artifactory" at "https://liveintent.jfrog.io/liveintent/sbt"

addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "1.4.1")
addSbtPlugin("com.dwijnand" % "sbt-dynver" % "4.1.1")
addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.6.1")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.11.0")
addSbtPlugin("com.liveintent"    % "li-sbt-plugins" % "8.2.0")

addSbtPlugin("com.lightbend.paradox" % "sbt-paradox" % "0.10.2")

ThisBuild / libraryDependencySchemes += "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always
