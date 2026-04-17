package cmd

import lib.Greeting.*
import scala.util.chaining.*

@main def main(): Unit =
  createHiMessage("from Scala Service!")
    .pipe(println)
