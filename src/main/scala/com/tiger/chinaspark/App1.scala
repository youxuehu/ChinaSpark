package com.tiger.chinaspark

import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.serializer.SerializerFeature

class App1(var name: String, var age: Int) {
//  var name: String = _
//  var age: Int = _

  println("name=" + name + ", age=" + age)

  def printInfo(): String = {
    toString()
  }

  override def toString: String = {
    "name=" + name + ", age=" + age
  }
}

/**
 * Hello world!
 *
 */
object App1 {
  println( "Hello World!" )

  def add() {println(123)}

  def add(name : String) {
    println(name)
    val numbers = List(1, 2, 3, 4)
    for(x <- numbers){
      println(x)
    }
  }
  // 匿名函数
  var func1: (Int, Int) => Int = (num1 : Int, num2 : Int) => num1 + num2
  def main(args: Array[String]): Unit = {
    add("jack")
    println(func1(1, 2))

    val app = new App1("tiger", 19)

    println(app.toString)

    val jsonString = JSON.toJSONString(app, SerializerFeature.WriteMapNullValue)
    println(jsonString)
  }
}
