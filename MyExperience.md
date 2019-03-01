#My experience and further notes

Put here general information about the steps you took, what you liked, disliked, why did you do X instead of Y and so on.

## HDP Sandbox
1.) I started downloading HDP Sandbox first on my machine. and dowloaded virtual box It was 20 gb file. And going to take too long. By that time, I started reading document provided "Learning the Ropes of the HDP Sandbox".

2.) I read prerequisite for the sandbox in my local machine. I need minimum 10GB of RAM dedicated to virtual machine. But my computer RAM is just 4GB. Which was not enough. So i paused the download and  decided to go for cloud due to its flexibility, cost benefits and also for more memory.

3.) I was not having microsoft azure account as i am using it first time and have no idea how cloud works.

4.)  I followed documentation for CREATE HORTONWORKS DATA PLATFORM SANDBOX IN AZURE. I created my microsoft Azure account and started created sandbox.

5.) In my first glance on docs, i thought i need to pay for cloud service. But still continuing trying creating sandbox with free trail option.  At the first, i got error of free trial quota of memory usage.

6.) On checking the error, i decreased sixe of memory usagefrom 16GB to 8GB and 2cpus. Then i was successful to create sandbox.

# Created Sandbox Information: 
Resource group(change):MysandboxTest Status:Running Location:West US Subscription(change):Free Trial
Subscription ID:642ce2fc-fad3-47f8-a829-2ced2b554627 Computer name:doon Operating system:Linux
Size:Standard B2ms (2 vcpus, 8 GB memory) Public IP address:104.42.183.126
Virtual network/subnet:MysandboxTestvnet385/default   DNS name:Configure

7.) After that i did, SSH tunneling configuration and downloaded putty following documentation as well. 
And enviornment setup in hosts file.
8.) In the end, i explore Ambari with port name 8080 with user name and password: maria_dev
Enviornment set was not an easy job. Because i was getting error as "connection refused". I tried lot many solutions from internet.
And to explore ambari, in file view, i uploaded csv files in haddop.

## HDFS & Hive on Spark
To build scala application, i first downloaded sbt as given in the link. later on googling about scala,
1.) i tried https://www.scala-lang.org/download/ and i downloaded scala using sbt option. and tried to run just "Hello World" on CMD after importing java libraries and followed stackoverfollow for guidance. Once connection is setup.
I used notepadd++ for scala application. and write code also to downloaded files from dataspark on github. But after that, i had to communicate with haddop which i was not sure how to do. I was checking on internet and following lot many documentation.
It was really frustrating. Also, i read about tutorials for scala, spark and hadoop. Because it was first time i was using it and understand for these terms. It took 2-3 days to me.
While going through docs, i got Hortonwork document for setting up spark enviornment development with scala.
https://hortonworks.com/tutorial/setting-up-a-spark-development-environment-with-scala/

I followed it. And downloaded IntelliJ and JDK kit as mentioned in doc.

2.) To get used to for interface of IJ, i tried 2 examples with scala app for "Hello World" printing and word counter in a file.
   And tried to upload this file in Haddop followong documention after creating JAR file.
 
 3.) And after that, i created class for HDFS n Hive. Then i go through for online training for spark fundamentals and application. Because i was using it first time and had no idea about it.
   
## HBase

I did A because of B...
<br>I had issues with C...
<br>I liked doing D...

