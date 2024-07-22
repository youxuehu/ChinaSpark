package com.tiger.chinaspark

/**
 * @version v1.0
 * @className Basic4
 * @author youxuehu
 * @date 2024/7/21 下午9:39
 * @desrription 这是类的描述信息
 */

case class Book(name: String, author: String) {}

object Basic4 extends App {
  val value = 1
  val res = value match {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case _ => "nothing"
  }

  val res2 = value match {
    case i if  1 == 1 => "one"
    case i if  1 == 2 => "two"
    case i if  1 == 3 => "three"
    case _ => "nothing"
  }


  def t(obj : Any) = obj match {
    case x : Int => println("int")
    case x : String => println("String")
    case _ => println("unknown type")
  }
  println("get case :" + res)
  println("get case :" + res2)

  t("")

  val book = new Book("jack", "scala")

  book match {
    case Book(name, author) => println("this is a Book")
    case _ => println("unknown")
  }
}
