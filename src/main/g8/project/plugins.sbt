resolvers ++= Seq(
  Resolver.bintrayIvyRepo("epfl-lara", "sbt-plugins"),
  Resolver.bintrayRepo("epfl-lara", "princess"),
  "uuverifiers" at "http://logicrunch.research.it.uu.se/maven",
)

val StainlessVersion = "$stainless_version$"

addSbtPlugin("ch.epfl.lara" % "sbt-stainless" % StainlessVersion)

