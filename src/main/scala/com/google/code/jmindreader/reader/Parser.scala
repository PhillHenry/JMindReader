package com.google.code.jmindreader.reader

import scala.io.Source

class Parser {

  def mapsParser(line : String) = {
    val split = line.split(" ")
    val range = split(0).split("-")
    println(range(0) + " - " + range(1))
  }

  def process(filename: String, f: String => Unit) {
    val source = Source.fromFile(filename)
    try {
      source.getLines().foreach(f)
    } finally {
      source.close()
    }
  }
}
