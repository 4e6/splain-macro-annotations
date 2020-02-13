package test

import io.estatico.newtype.macros.newtype

object Test {

  @newtype case class Foo(ix: Int)
}
