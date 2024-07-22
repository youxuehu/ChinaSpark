package com.tiger.chinaspark

/**
 * @version v1.0
 * @className Basic2
 * @author youxuehu
 * @date 2024/7/21 下午5:51
 * @desrription 这是类的描述信息
 */
class Basic2 {

}

//trait Logger {
////  def log(msg: String): Unit = {
////    println("log: " + msg)
////  }
////}
////
////class Test extends Logger {
////  def test(): Unit = {
////    log("xxx")
////  }
////}

trait Logger {
  def log(msg: String)
}
trait ConsoleLogger {

  def log(msg: String): Unit = {
    println(msg)
  }
}
trait MessageLogger extends ConsoleLogger {
  override def log(msg: String): Unit = {
    println("save account money to bank : " + msg)
  }
}

abstract class Account {
  def save
}

class MyAccount extends Account with ConsoleLogger {

  override def save: Unit = {
    log("100")
  }
}
class Test extends ConsoleLogger {

  def test(): Unit = {
    log("XXX")
  }
}
object Basic2 {

  def main(args: Array[String]): Unit = {
    val t = new Test

    t.test()

    val a = new MyAccount with MessageLogger
    a.save
  }

}