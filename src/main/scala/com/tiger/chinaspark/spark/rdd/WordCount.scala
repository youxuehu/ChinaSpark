package com.tiger.chinaspark.spark.rdd

import org.apache.spark.{SparkConf, SparkContext}

/**
 * @version v1.0
 * @className Wordcount
 * @author youxuehu
 * @date 2024/7/28 下午9:57
 * @desrription 这是类的描述信息
 */
object WordCount {

  def main(args: Array[String]): Unit = {

    val rdd = new SparkContext(new SparkConf().setMaster("local").setAppName("WordCount")).textFile("/Users/youxuehu/SDK/ChinaSpark/src/main/scala/com/tiger/chinaspark/spark/rdd/words.data")

    println(rdd.count())
    // 放入缓存
    rdd.cache()
    // 打印行数
    println(rdd.count())

    // 统计单词个数
    // flatMap: 将所有数据合并为一个整体，
    // map将拆分的字符设置为1，组成一个元组
    // reduceByKey: 相同的key，_+_： 值累加
    val wordCount = rdd.flatMap(_.split(" ")).map((_,1)).reduceByKey(_+_)
    println(wordCount.collect().toSeq)
  }

}
