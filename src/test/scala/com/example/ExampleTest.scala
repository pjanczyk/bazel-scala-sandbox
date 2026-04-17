package com.example

import lib.Greeting.*
import org.scalatest.funsuite.AnyFunSuite

class ExampleTest extends AnyFunSuite {
  test("example") {
    assert(createHiMessage("test") == "Hi test!")
  }
}
