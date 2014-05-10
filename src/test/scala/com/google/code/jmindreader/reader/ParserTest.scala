package com.google.code.jmindreader.reader

import org.scalatest.FunSuite
import java.io.FileNotFoundException

class ParserTest extends FunSuite {
  val loader = new Parser
  val goodFile = "src/test/resources/maps"

  def noOp(x : String) = {  }

  test("file does not exist") {
    intercept[FileNotFoundException] {
      loader.process("non-existant file", noOp)
    }
  }

  test("parse file") {
    loader.process(goodFile, noOp)
  }

  test("parse line") {
    loader.mapsParser("00400000-00401000 r-xp 00000000 08:03 10224731                           /usr/local/bin/Java/jdk1.8.0_05/bin/java")
  }
}
