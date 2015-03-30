package org.scalatest.examples.flatspec

import com.spirale.ds.Hello
import org.scalatest.{Matchers, FlatSpec}

class HelloTest extends FlatSpec with Matchers{

  "Hello" should "say" in {
    Hello.greeting should include ("hello")

  }
}