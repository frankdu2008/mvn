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

