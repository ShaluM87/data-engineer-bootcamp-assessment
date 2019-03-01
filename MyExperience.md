#My experience and further notes

Put here general information about the steps you took, what you liked, disliked, why did you do X instead of Y and so on.

## HDP Sandbox
1.) I started downloading HDP Sandbox first on my machine. and dowloaded virtual box It was 20 gb file. And going to take too long. By that time, I started reading document provided "Learning the Ropes of the HDP Sandbox".

2.) I read prerequisite for the sandbox in my local machine. I need minimum 10GB of RAM dedicated to virtual machine. But my computer seems to be from the old age with a RAM of just 4GB. Which was not enough. So i paused the download and  decided to go for cloud due to its flexibility, cost benefits (free trial available :)) and also for more memory.

3.) I was not having microsoft azure account as i am using it first time and have no idea how cloud works. When it asked my credit card details I was bit worried but was more than happy when I saw the free trial version.

4.) It seems I can run over the mountain now. I followed the documentation for how to CREATE HORTONWORKS DATA PLATFORM SANDBOX IN AZURE. I made my microsoft Azure account and started climbing the hill by building sandbox.

5.) In my first glance on docs, i thought i need to pay for cloud service. But still continuing trying creating sandbox with free trail option.  At the first, i got error of free trial quota of memory usage. I have no idea why it was occuring.

6.) On checking the errors and following the internet, i decreased size of memory usage from 16GB to 8GB and 2cpus. It worked and i was successful to create sandbox. 

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

7.)  I started configuring SSH tunneling and downloaded putty by following documentation and internet. The enviornment is setup in the hosts file. The first milestone achieved and I got the much needed break. 

8.) After couple of coffees and some refreshments I followed the mountain again. I started exploring Ambari. Enviornment setup was not an easy job. Because i was getting error as "connection refused". I tried lot many solutions from internet. This was the time when it was getting more frustating and annoying. But somehow, I stick to the basic and keep trust on my best friend google. 

After lot of hit and trial, help from my only friend google and following the documentations, I setup the the "port name 8080" with "user name and password: maria_dev" in the Sandbox and directly communicated with the host IP. There you go, it started responding. For a while it seems that I was in the heaven. I assumed the hardest part is done. 

To explore ambari, in file view, i uploaded csv files in haddop.

## HDFS & Hive on Spark
To build scala application, I first downloaded sbt as given in the link. later on googled about scala.

1.) I tried https://www.scala-lang.org/download/ and downloaded scala using sbt option. Once connection is setup, I tried to run just "Hello World" on CMD after importing java libraries and followed stackoverfollow for the guidance. 

I used notepadd++ for scala application and write code in downloaded files from dataspark on github. It seems that god was not happy with me and there come the different challenge. I had to communicate with haddop and i was not sure how to do. and my best friend "google" was there to rescue me again. But it was not as easy as I thought. It seems google want to confuse me this time with a lot of documentations and ways.
At one moment the hell was about to break as it was first time for me to work on these monster applications (Hadoop, scala, spark) and I was really getting frustrated. Also, i read a lot of tutorials for these tools to get accustomed with and somehow managed to understand the alphabats for their terms. It took me 2-3 days.

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

