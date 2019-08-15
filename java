Install from Installer for Mac
      Install location: /Library/PostgreSQL/11
      Data Directory: /Library/PostgreSQL/11/data
      Password required: 
      Four Componnents:
          - PostgreSQL Server
          - pgAdmin4
          - Stack Builder
          - Command Line Tools
	Password: er ling yi yi
	Port: 5432

	Installation Directory: /Library/PostgreSQL/11
	Bin directory: /Library/PosgreSQL/11/bin
	Server Installation Directory: /Library/PostgreSQL/11
	Data Directory: /Library/PostgreSQL/11/data
	Database Port: 5432
	Database Superuser: postgres
	Operating System Account: postgres
	Database Service: postgresql-11
	Command Line Tools Installation Directory: /Library/PostgreSQL/11
	pgAdmin4 Installation Directory: /Library/PostgreSQL/11/pgAdmin 4
	Stack Builder Installation Directory: /Library/PostgreSQL/11

How to start server?
        $sudo -u postgres /Library/PostgreSQL/11/bin/pg_ctl -D /Library/PostgreSQL/11/data start
            ==>your computer's password
How to connect to postgresql from terminal line?
        $psql -U postgres   
            ===>you need the password for user: postgres. If you did NOT set up during installation, figure it out now
How to stop the postgresql server?
        $sudo -u postgres /Library/PostgreSQL/11/bin/pg_ctl -D /Library/PostgreSQL/11/data start
            ==>your computer's password

How to load the sakila sample database into Postgres?
The tutorial did not work perfectly! It complains some error for public schema, foreign keys, etc, but the database dvdrental is populated indeed.
-Download sample database in zip format: dvdrental.zip
-Extract dvdrental.tar file: $tar -xvf dvdrental.zip	<=extract file as .tar file
-Create database: postgres=#create database dvdrental
-Load sample data into database: $sudo /Library/PostgreSQL/11/bin/pg_restore -U Postgres -d dvdrental /path/to/dvdrental.tar

To access the data, first connect to the database: 
postgres=#\c dvdrental
dvdrental=#\dt	<==show all the table inside the current database






Install python3
install pip
	$sudo easy_install pip
Install virtualenv
	$sudo pip install virtualenv
Start a virtual environment
	$mkdir temp; cd temp
	$vituralenv env
	$chmod +x env/bin/activate
	$source env/bin/activate
Install home-brew
	$ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)”
vi ~/.profile
	export PATH="/usr/local/opt/python/libexec/bin:$PATH”
Update environment
	Source ~/.profile
Install python3
	$brew install python	===>install python3
  
  

– XSL - Exstensible Stylesheet Language 
– XSLT - XSL Transformation Language 
– XPath - XML Path Language


Java Jargons

Jdeveloper
JWS: Jdeveloper Work Space, storing the projects added in the workspace
	under the Model and ViewContoller projects, two files gets created as ‘Model.jpr’ and ‘ViewController,jpr'
JPR: Jdeveloper Project, store the project related information like java files created in the project etc.
.jpx file:  contains all the application modules defined in your Model project. And other configuration details 
	such as database connection used in the model layer. contains configuration information that JDeveloper 
	uses in the design time to allow you to create the data model project with ADF Business Components.

	These files hold the IDE's setting for your project. .jws files store the workspace's information and .jpr 
	files store the project information. .jpx contains the information for creating the data models.

ETL: Extract, Transform, Load

DTO: Data Transfer Object

AMQP: Advanced Message Queuing Protocol
ANT: Another Neat Tool
ADF: Appliction Development Framework
BPEL: Business Process Excecution Language --->Web Service, WSDL, XML, SOAP, UUID
DBMS: DataBase Management System
DOM: Document Object Model
EJB: Enterprise Java Bean
ESB: Enterprise Service Bus

HATOAS: Hypermedia As The Engine Of Application State
HQL: Hibernate Query Language
Informatica: A software development company which offers data integration products, such as ETL, data quality, data replica,
  and data virtualization, master data management, etc. Informatica Powercenter ETL/Data Integration tool is a mostly used
  tool and in the common term when Informatica mentioned, it refers to the Informatica Powercenter tool for ETL.
  ===> ETL: Extract, Transform and Load
JAXP: Java API for XML Processing
JAXB: Java Architecture for XML Binding
JAX-RPC: Java API for XML-base RPC   <===Remote Procedure Call
JAX-rs: Java API for Restful Web Service
JAX-ws: Java API for XML Web Service


JDBC: Java Database Connectivity  <====> ODBC: Open Database Connectivity
JMS: Java Messaging Service
JNDI: Java Name and Directory Interface
JPA: Java Persistent API
LDAP: Lightweight Directory Access Protocol
MDB: Message-Driven Bean
MTOM: Message Transmission Optimization Mechanism
OBIEE: Oracle Business Intelligence Enterprise Edition
OLAP: Online Analytical Processing
POJO: Plain Old Java Object
RMI: Remote Method Invocation
RPC: Remote Procedure Call
SAML: Security Assertion Markup Language
SOA: Service Oriented Architecture
SOAP: Simple Object Access Protocol
WSDL: Web Service Description Language
XSLT: Extensible StyleSheet Language Transformations
XML: eXtensible Markup Language
XOP: XML-Binary Optimized Packaging

Marshalling & Unmarshalling
marshalling or marshaling is the process of transforming the memory representation of an object to a data format suitable for storage or transmission, and it is typically used when data must be moved between different parts of a computer program or from one program to another. Marshalling is similar to serialization and is used to communicate to remote objects with an object, in this case a serialized object. It simplifies complex communication, using composite objects in order to communicate instead of primitives. The inverse of marshalling is called unmarshalling (or demarshalling, similar to deserialization).
