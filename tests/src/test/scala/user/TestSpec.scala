package user

import org.specs2._

class TestSpec extends Specification with ScalaCheck { def is = s2"""

 test $e1

"""

  def e1 = {
    ok
  }

}

class TestMutableSpec extends mutable.Specification {
}
