resolvers ++= Seq(
  Resolver.bintrayIvyRepo("epfl-lara", "sbt-plugins"),
  Resolver.bintrayRepo("epfl-lara", "princess"),
)

val StainlessVersion = "$stainless_version$"

addSbtPlugin("ch.epfl.lara" % "sbt-stainless" % StainlessVersion)

