package summary

import org.apache.spark.sql.DataFrame
import spark.{closeSpark, getSparkSession}

object execute {

  def main(args: Array[String]): Unit = {
    getDataFrame.show(truncate = false)
  }

  def getDataFrame:DataFrame={
    getSparkSession("execute").sql("select current_timestamp")
  }
}
