import TupleSyntax._

class Day1 {

  def run1(allInts: Seq[Int]): Option[Int] = {
    allInts.combinations(2)
      .map{ case Seq(x, y) => (x, y) }
      .find(pair => 2020 == pair.sum)
      .map(pair => pair.product)
  }

  def run1_(allInts: Seq[Int]): Option[Int] = {
    allInts.combinations(2)
      .find(subList => 2020 == subList.sum)
      .map(subList => subList.product)
  }

  def run2(allInts: Seq[Int]): Option[Int] = {
    allInts.combinations(3)
      .map{ case Seq(x, y, z) => (x, y ,z) }
      .find(triple => 2020 == triple.sum)
      .map(triple => triple.product)
  }

}

