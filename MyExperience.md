#My experience and further notes

Put here general information about the steps you took, what you liked, disliked, why did you do X instead of Y and so on.

## HDP Sandbox
1.) I started downloading HDP Sandbox first on my machine. It was 20 gb file. It was taking too long. By that time, I started reading guidlines provided in the "Learning the Ropes of the HDP Sandbox".

2.) I read prerequisite for the sandbox. I needed minimum 10GB of RAM dedicated to virtual machine if i want to install in my local machine. But my computer have a RAM of just 4GB. Which was not enough. So i paused the download and looked for other options. I decided to go for cloud due to its flexibility, cost benefits and also for more memory.

3.) I was not having microsoft azure account as i am using it for the first time and I have no idea how it works. When it asked my credit card details I was bit concerned but was happy when I saw the free trial version.

4.) It seems I can run over the mountain now. I followed the documentation for how to CREATE HORTONWORKS DATA PLATFORM SANDBOX IN AZURE. I made my microsoft Azure account and started climbing the hill by building sandbox.

5.) I got error of "free trial quota of memory usage". I had no idea why it was occuring. In my first glance on this, i thought i need to pay for cloud service. But still continuing trying building sandbox with free trial option. 

6.) On checking the errors and following the internet, i decreased size of memory usage from 16GB to 8GB and 2 CPU's. It worked and I was successful to create sandbox. 

Sandbox Information: 

Resource group(change):MysandboxTest

Status:Running

Location:West US    

Subscription(change):Free Trial

Subscription ID:642ce2fc-fad3-47f8-a829-2ced2b554627 

Computer name:doon 

Operating system:Linux

Size:Standard B2ms (2 vcpus, 8 GB memory) 

Public IP address:104.42.183.126

Virtual network/subnet:MysandboxTestvnet385/default  

DNS name:Configure

7.)  I started configuring SSH tunneling and downloaded putty by following documentation and internet. The enviornment setup in the hosts file. I started exploring Ambari. Enviornment setup was not an easy job. Because i was getting error as "connection refused". I tried lot many solutions from internet. This was the time when it was getting more frustating and annoying. But somehow, I stick to the basic and keep trust on my best friend google. 

After a lot of hit and trial, help from my only friend google and following the documentations, I added the the "port name 8080" with "user name and password: maria_dev" in the Sandbox and directly communicated with the host IP for ambari. There you go, it started responding. I assumed the hardest part is done. 

To explore ambari, in file view, i uploaded csv files in hadoop.

## HDFS & Hive on Spark
To build scala application, I first downloaded sbt as given in the link. later on, I googled about scala.

1.) I tried https://www.scala-lang.org/download/ and downloaded scala using sbt option. Once connection is setup, I tried to run just "Hello World" on CMD after importing java libraries and followed stackoverfollow for the guidance. 

I used notepad++ for scala application and write code in downloaded files from dataspark on github. There comes the different challenge. I had to communicate with hadoop and i was not sure how to do. It was not as easy as I thought. It seems my friend google want to test my patience by confusing me this time with a lot of documentations and ways.
It was first time that I was working on these monster applications (Hadoop, scala, spark) and I was really getting frustrated. Moreover, I read a lot of tutorials for these tools to get accustomed with and somehow managed to understand the alphabats for their terms. It took me 2-3 days.

While going through docs, I got Hortonwork document for setting up spark enviornment development with scala.
https://hortonworks.com/tutorial/setting-up-a-spark-development-environment-with-scala/

I followed it. And downloaded IntelliJ and JDK kit as mentioned in doc.

2.) To get used to with the interface of IJ, i tried couple of examples with scala. For example: printing "Hello World" and to count the words in a file. Later on, I tried to upload this file in Hadoop following documention after creating JAR file. Afterwards, I created class for HDFS and Hive.
 
 3.)  I followed online training for spark fundamentals and applications as I was using it first time and had no idea about it.
 
 4.) I searched how to upload csv file in sandbox. First I started with one file "drivers.csv". Again, it was not easy to communicate with hadoop. I created jar file and ran spark-submit. I was able to upload file and could view in Ambari. Later on, I worked for list of files.
 
 6.) Setting up library dependencies in "Build.sbt" took a lot of time for me. 
  
 7.) Afterwards, setting up "SparkSession" variable and pointing it to sandbox was also tough. I followed google tips and docs. But with too many options and different kinds of ideas were really confusing.I just tried and tried further.
 
 9.) I was not able to communicate with my sandbox many times as services got very slow. I got "connection refused error" on my ambari and terminal. 
 
 10. I restarted my sandbox 3-4 times. May be because of that, my free trial amount is consumed fully today. 
 
 11.) I followed docs to understand about dataframe. How it works but i could not work on that.
 
 It was really nice and challenging experience. Though I could not finish task,I learned many things about hadoop, scala and spark. Thanks for providing me a chance to work on these environments. Looking forward for the next step.

 

