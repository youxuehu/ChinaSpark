package com.tiger.chinaspark

/**
 * @version v1.0
 * @className Basic5
 * @author youxuehu
 * @date 2024/7/21 下午10:06
 * @desrription 这是类的描述信息
 */
object Basic5 extends App {

  // List

  val l = List(1,2,3,4,5,6,7,8,9,10)
  val newL = l.map(2 * _)

  println(newL)

  println(l.map((x: Int) => 2 * x))
  println(l.map((x) => 2 * x))
  println(l.map(x => 2 * x))

  // Set

  val s = Set(1,2,1,2,3)
  println(s.map((x: Int) => 2 * x))
  println(s.map((x) => 2 * x))
  println(s.map(x => 2 * x))


  // 元祖
  val t = ("localhost", "8080")
  println(t)
  println(t._1)
  println(t._2)

  val v = "a" -> "b"
  println(v)

  /**
   *
  /Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=49310:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/lib/tools.jar:/Users/youxuehu/SDK/ChinaSpark/target/classes:/Users/youxuehu/.m2/repository/org/scala-lang/scala-library/2.11.4/scala-library-2.11.4.jar:/Users/youxuehu/.m2/repository/com/alibaba/fastjson/1.2.62/fastjson-1.2.62.jar com.tiger.chinaspark.Basic5
  List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
  List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
  List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
  List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
  Set(2, 4, 6)
  Set(2, 4, 6)
  Set(2, 4, 6)
  (localhost,8080)
  localhost
  8080
  (a,b)

  Process finished with exit code 0

   *
   */

  val m = Map("a" -> "b", "c" -> "d")
  println(m)
  println(m("a"))
  println(m("c"))

  println(m.get("a"))
  println(m.get("c"))

  println(m.get("e"))

  val f = List(1,2)

  f.foreach(println(_))
  f.foreach((x: Int) => x * 2)
  val newF = f.filter(x => x == 1)
  println(newF)


  val f1 = List(1,2)
  val f2 = List(3,4)
  // zip
  println(f1.zip(f2))

  // partition
  println(f1.partition(_ % 2 == 0))

  // flatten
  val f3 = List(List(1,2), List(3,4)).flatten
  println(f3) // List(1, 2, 3, 4)

  val f4 = List(List(1,2), List(3,4))
  // flatMap
  val f5 = f4.flatMap(x => x.map(_ * 2))
  print(f5) // List(2, 4, 6, 8)
}
