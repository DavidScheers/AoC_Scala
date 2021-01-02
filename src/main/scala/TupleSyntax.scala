

object TupleSyntax {

  final implicit class TupleOps(tuple2: (Int, Int)) extends AnyRef{
    def sum: Int = tuple2._1 + tuple2._2
    def product: Int = tuple2._1 * tuple2._2
  }


  final implicit class Tuple3Ops(tuple3: (Int, Int, Int)) extends AnyRef {
    def sum: Int = tuple3._1 + tuple3._2 + tuple3._3
    def product: Int = tuple3._1 * tuple3._2 * tuple3._3
  }

}
