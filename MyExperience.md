#My experience and further notes

Put here general information about the steps you took, what you liked, disliked, why did you do X instead of Y and so on.

## HDP Sandbox
I started downloading HDP Sandbox first using virtual machine. I read prerequisite for the same. I need minimum 10GB of RAM dedicated to virtual machine. But my computer RAM is just 4GB. Which was not enough.
So then i used microsoft Azure on cloud due to its flexibility, cost benefits and also for more memory.I followed documentation for 
CREATE HORTONWORKS DATA PLATFORM SANDBOX IN AZURE. I created my microsoft Azure account and started created sandbox which i created later on 8GB memory one. As i got error before of free trial quota of memory usage.
Here is my Sanbox information created:
Resource group(change):MysandboxTest; Status:Running;  Location:East US ;  Subscription(change):Free Trial ;
Subscription ID:642ce2fc-fad3-47f8-a829-2ced2b554627; Computer name:azure ; Operating system:Linux; DNS name:Configure;
Size:Standard B2ms (2 vcpus, 8 GB memory)
Public IP address:137.117.85.57; Virtual network/subnet:MysandboxTest-vnet/default
After that i did, SSH tunneling configuration and downloaded putty following documentation as well. 
And enviornment setup in hosts file.
In the end i explore Ambari and tried to upload file from my local machine to HDFS.

## HDFS & Hive on Spark
To build scala application, i first downloaded sbt as given in the link. later on googling about scala,
i tried https://www.scala-lang.org/download/ and i downloaded scala using sbt option. and tried to run just "Hello World" on CMD after importing java libraries and followed stackoverfollow for guidance. Once connection is setup.
Stated executing job mentioned.
1.) I downloaded files on dataspark on github using scala app. and so on
## HBase

I did A because of B...
<br>I had issues with C...
<br>I liked doing D...

