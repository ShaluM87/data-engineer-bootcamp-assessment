name := "Test1"

version := "0.1"

scalaVersion := "2.11.12"

resolvers += "Hortonworks Repository" at "http://repo.hortonworks.com/content/repositories/releases/"

// https://mvnrepository.com/artifact/org.apache.spark/spark-core
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.0"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.0"
libraryDependencies += "org.apache.hadoop" % "hadoop-common" % "2.6.0"
libraryDependencies += "org.apache.commons" % "commons-io" % "1.3.2"
libraryDependencies += "org.apache.hadoop" % "hadoop-hdfs" % "2.6.0"
libraryDependencies += "org.apache.hbase" % "hbase-client" % "1.2.1"
libraryDependencies +="org.apache.hbase" % "hbase-server" % "1.2.1"
libraryDependencies +="org.apache.hbase" % "hbase-common" % "1.2.1"
libraryDependencies += "com.hortonworks" % "shc-core" % "1.1.1-2.1-s_2.11"
