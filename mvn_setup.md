- Download latest or the right version of maven from apache website (binary ones are good enough)
  https://maven.apache.org/download.cgi
- Unzip the file
- Copy it to any location you want to, e.g. /usr/local/maven, or C:\maven
- Setup maven home and add maven/bin to your path (Make sure you have Java JDK installed and JAVA_HOME set up before maven)
- Test your maven setting
  $echo $M2_HOME  | echo %M2_HOME%
  $mvn -version

- update settings.xml file to setup local and remote repo
  local
    <localRepository>C:\tools\repo</localRepository>
  remote: Nexus

Setup Nexus
- get a centos 7 server
- sudo yum update -y
- sudo yum install java-1.8.0-openjdk.x86_64
  - how to find JAVA_HOME:
    $update-alternatives --config java
    ==>Selection    Command
      -----------------------------------------------
      *+ 1           java-1.8.0-openjdk.x86_64 (/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.191.b12-1.el7_6.x86_64/jre/bin/java)</code?
      ==>that path is the one you need
  - Add that one as JAVA_HOME to your profile
- sudo mkdir /app && cd /app
- sudo wget https://sonatype-download.global.ssl.fastly.net/nexus/3/nexus-3.0.2-02-unix.tar.gz
- sudo tar -xvf nexus-3.0.2-02-unix.tar.gz
- sudo mv nexus-3.0.2-02 nexus
- sudo adduser nexus
- sudo chown -R nexus:nexus /app/nexus
- run_as_user="nexus"
- sudo vi /app/nexus/bin/nexus.vmoptions
    -Xms1200M
    -Xmx1200M
    -XX:+UnlockDiagnosticVMOptions
    -XX:+UnsyncloadClass
    -Djava.net.preferIPv4Stack=truer
    -Dkaraf.home=.
    -Dkaraf.base=.
    -Dkaraf.etc=etc
    -Djava.util.logging.config.file=etc/java.util.logging.properties
    -Dkaraf.data=/nexus/nexus-data
    -Djava.io.tmpdir=data/tmp
    -Dkaraf.startLocalConsole=false
- sudo ln -s /app/nexus/bin/nexus /etc/init.d/nexus
- sudo chkconfig --add nexus
- sudo chkconfig --levels 345 nexus on
- sudo service nexus start
    User Name: admin 
    Password: admin123

- sudo service nexus stop
- sudo service nexus restart






