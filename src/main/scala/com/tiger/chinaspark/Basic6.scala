package com.tiger.chinaspark

/**
 * @version v1.0
 * @className Basic6
 * @author youxuehu
 * @date 2024/7/22 下午9:45
 * @desrription 这是类的描述信息
 */

class A {

}
class RishA(a : A) {

  def rish {
    println("rish...")
  }
}
object Basic6 extends App {

  // 隐式类型
  implicit def a2RishA(a : A) = new RishA(a)

  val a = new A
  a.rish

  // 隐式方法
  def testParam(implicit name: String): Unit = {
    println(name)
  }

  implicit val name = "implicit!!!"
  testParam
  testParam("xxx")
}
