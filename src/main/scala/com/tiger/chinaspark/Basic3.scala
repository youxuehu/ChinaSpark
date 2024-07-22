package com.tiger.chinaspark

/**
 * @version v1.0
 * @className Basic3
 * @author youxuehu
 * @date 2024/7/21 下午6:20
 * @desrription 这是类的描述信息
 */
class Basic3 {
  /**
   * apply 方法
   * @return
   */
  def apply() = "ABC"

  def test() = {
    println("execute test method in Basic3")
  }
}

/**
 * 静态类就是单例
 */
object TestStatic {

  var count = 0

  def static(): Unit = {
    println("this is a static method")
  }

  def apply(): Basic3 = new Basic3()

  def incr(): Unit = {
    println(count)
    count = count + 1
  }

}


object Basic3 {

  def main(args: Array[String]): Unit = {
    val b = new Basic3

    println(b())

    TestStatic.static()

    val tt = TestStatic()
    tt.test()

    for (i <- 1 to 10) {
      TestStatic.incr()
    }
    println(TestStatic.count)
  }
}