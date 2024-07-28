package com.tiger.chinaspark.spark.rdd

import org.apache.spark.{SparkConf, SparkContext}

/**
 * @version v1.0
 * @className Rdd1
 * @author youxuehu
 * @date 2024/7/28 下午9:24
 * @desrription 这是类的描述信息
 */
object Rdd1 {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
    conf.setMaster("local")
    conf.setAppName("test")
    val sparkContent = new SparkContext(conf)
    val listRdd = sparkContent.parallelize(List(1,2,3,4))
    println(listRdd.collect().toList)

    // 每个元素乘以 100
    println(listRdd.map(100 * _).collect().toList)


  }
}
