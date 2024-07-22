package com.tiger.chinaspark

/**
 * @version v1.0
 * @className Basic
 * @author youxuehu
 * @date 2024/7/21 下午5:41
 * @desrription 这是类的描述信息
 */
class Basic {

}

/**
 * 抽象类
 */
abstract class Animal {
  def eat(name: String)
}

/**
 * 继承抽象类
 */
class Dog extends Animal {
  override def eat(name: String): Unit = {
    println("the dog name is " + name)
  }

  val name = "tom"
  val age = 101

}

class Cat extends Animal {
  override def eat(name: String): Unit = {
    println("the cat name is " + name)
  }

  val name = "jack"
  val age = 10
}

object Basic {

  def main(args: Array[String]): Unit = {
    val animal = new Dog

    println(animal.getClass)
    animal.eat("labuladuo")

    println("name=" + animal.name + ", age=" + animal.age)
  }
}