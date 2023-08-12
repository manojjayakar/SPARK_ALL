//What is SparkContext
Since Spark 1.x, SparkContext is an entry point to Spark and is defined in org.apache.spark package. It is used to programmatically create Spark RDD, accumulators, and broadcast variables on the cluster. Its object sc is default variable available in spark-shell and it can be programmatically created using SparkContext class.
// Create SparkSession object
import org.apache.spark.sql.SparkSession
object SparkSessionTest extends App {
  val spark = SparkSession.builder()
      .master("local[1]")
      .appName("SparkByExamples.com")
      .getOrCreate();
  println(spark.sparkContext)
  println("Spark App Name : "+spark.sparkContext.appname)
}

// Outputs
//org.apache.spark.SparkContext@2fdf17dc
//Spark App Name : SparkByExamples.com
