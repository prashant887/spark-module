import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers
import summary.execute.getDataFrame

class executeSpec extends AnyFlatSpec with Matchers{

  it should "return a data frame" in {
    getDataFrame.show(truncate = false)
  }
}
