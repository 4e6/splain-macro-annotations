# splain-macro-annotations

In Scala 2.13 macro annotations are enabled with `-Ymacro-annotations` compiler flag.

Splain 0.5.0 doesn't respect `-Ymacro-annotations` causing an error:

```
[error] splain-macro-annotations/Test.scala:7:23: macro annotation could not be expanded (you cannot use a macro annotation in the same compilation run that defines it)
[error]   @newtype case class Foo(ix: Int)
[error]                       ^
[error] one error found
```

Without the compiler plugin, the project builds successfully.
