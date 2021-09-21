
 
Classroom Session - The Full stack: Design Patterns - 1
(9th Sept)	

a) Architecture - High Level Architecture Layers and Building blocks
b) Design Principlets
    1) Revision of basic OO Concepts, Why Patterns
    2) SOLID Principles
    3)  Creational Patterns - Abstract Factory, Factory Method, Builder	4
Classroom Session - The Full stack: Design Patterns - 2
(9th Sept)	    4)  Behavioural Patterns - Decorator, Adaptor, Proxy, Composite
    5)  Structural Patterns - Strategy, Command, Iterator, Observer, Visitor
Build a Small application to connect to database and retrieve data	
 



Learn 
Implement 


20 to 25% - Coding 




naveenks.com

10 days - 

DBMS - RDBMS, MySQL, 
NoSQL - MongoDB, with command propmt, 
Agile - Scrum, sprint, kanban 


Abhishek chaturvedi - CS, 6, 
Abhishek Parmar - IT, 3 
Anshul - IT, 5 
Arghyadeep - CS, 6 
Diya - CS, 5 
Ishwar - IT, 5
Kasturi - CS, 5
Manvi - CS, 5 
Meeti - IT, 5.5 
Mhosin - CS, 6.5
Neel - CS, 5 
Nikita - CS, 5
Raj - CS, 5
Sahil - CS, 6
Santoshi - EC, 4
Shailesh - CS, 5
Shivam - CS, 5 
Shubham - CS, 5 
sreya - CS, 5
Swetlana - CS, 5
vaishnavi - CS, 5
Vidya - CS, 6



90% - Practicles 
	Java 8, 11
	Eclipse (using)
	VS Code 
	IntelliJ
	NetBeans 

	MySQL 

10% - Theory 


1 Tier 
2 Tier 
3 Tier 
N Tier 



Left To Right Approach 
	C 
	
	void main() {
		int a, b, res;
		printf("Hello World"); 
		printf("Enter a Number"); 
		scanf("%d", & a);

		printf("Enter a Number"); 
		scanf("%d", &b);
		
		res = a+b;
		
	}
	
	
Right To Left Approach 

Given the application is loaded on http://barclays.com
When user enters username 
And Password in the given field 
And hits submit button 
Then validate the credentials 
Then show home page 



Scalability 

Horizontal Scalability 
	clusters 
	
Vertical Scalability 
	10m - min - Buy more RAM, buy more HDD, buy more cahce 


Anti Pattern 

	if you have a bulky code its good to break that in to smaller pieces 
		so you can maintain easily 



Design Patterns 


SOLID Priciples 



class Emp {
	private int empId; 
	private Name name; 
	private double salary; 
	private Address address; 
	private Company company;
	... 
}

class Name {
	private String firstName; 
	private String lastName; 

}

class Companay {
	private int cId; 
	private String companyName;
	private String location;
	.... 
}




Amitbhattacharya 

Emp e = new Emp();

1. Raj - Class name could Employee
2. Sahil - Ref name could be better  + documntation
3. 



Car 

Red
Black
Blue
Green






fetch ("https://jsonplaceholder.typicode.com/todos/")
.then(x => x.text())
.then(y => document.getElementById("demo").innerHTML = y);







fetch ("https://jsonplaceholder.typicode.com/todos/")
.then(x => console.log(x))


Singleton 
1. eager 
2. lazy 



EagerSingleton() Creation
Hashcode : 578866604
Data saved... 
hashcode after reading : 942986815


EagerSingleton() Creation
Hashcode : 578866604
Data saved... 
hashcode after reading : 578866604


class Car {
	public static  Car getCar(String carName) {
		if(carName.equals("toyota")) {
			return new Toyota();
		}else if (carName.equals("maruti")) {
			return new Maruti();
		}else if(carName.equals("mercedes")) {
			return new Mercedes();
		}
		
		return null; 
	}
}
class Maruti extends Car {}
class Mercedes  extends Car {}
class Toyota  extends Car {}



 



Car c1 = Car.getCar("toyota"); 
Car c2 = Car.getCar("maruti"); 



Car c =????; 
Payment p = ???;


stratergy pattern 



kasturi 
abhishek 


String str="CREATE TABLE REGISTRATION " +
        "(id INTEGER not NULL, " +
        " first VARCHAR(255), " + 
        " last VARCHAR(255), " + 
		 " email VARCHAR(255), " + 
        " age INTEGER, " + 
        " PRIMARY KEY ( id ))";
		
		
		
db.properties 
create-registration=create table registration (id integer not noll...)







Builder Pattern 


Monolithic v/s Microservice 

 


The Single-responsibility principle: "There should never be more than one reason for a class to change."[5] In other words, every class should have only one responsibility.[6]


class EmployeeDAO {
	public void save(Employee emp) {}
	
}

class EmployeeService {
	public void checkEmployee(Employee emp) {}
	
}


The Open–closed principle: 

"Software entities ... should be open for extension, but closed for modification." 

Blue-Green 

The Liskov substitution principle: "Functions that use pointers or references to base classes must be able to use objects of derived classes without knowing it."[8] See also design by contract.[8]


interface Shape {
	void area();
}

class Rect implements Shape{
	void area() { lx b}
}

class Circle implement Shape {
	void area() { pi * r * r }
}

class Display {
	void static showArea(Shape shape) {
		shape.area();
	} 
}

Shape s = new Circle()

Display.showArea(s); 



The Interface segregation principle: "Many client-specific interfaces are better than one general-purpose interface."[9][4]


The Dependency inversion principle: "Depend upon abstractions, [not] concretions."[10][4]


interface Database {
	public void save(String data); 
	public void delete(int data); 
}

class Mysql implements Database {
	public void save(String data) {}
	public void delete(int data) {}
}


class Oracle implements Database {
	public void save(String data) {}
	public void delete(int data) {}
}


class User  {
	Database db; 
	public User(Database db) {this.db = db;}
	
	
	public void persist(String data) {
		db.save();
	} 
	public void remove(int id) {
		db.delete(id);
	}
}

Spring 


main{
	@AutoWired
	Mysql mysql;
	User user = new User(mysql); 
	user.persist("Anshul"); 
	user.remove(123); 
}



Day 2 

Classroom Session - 
a) Introduction to Maven, Gradle for Dependency Resolutions 
b) Build process - Introduction to Maven, Gradle
 



spring 
hibernate 
jpa 
slf4j
lobok 
log4j2 
junit 
hamcrest 
etc.... 


1. is to build the .jar file 
2. good tool for dependency management 
3. reporting 
4. maven will help to generate the project (artifacts)


download maven 
https://dlcdn.apache.org/maven/maven-3/3.8.2/binaries/apache-maven-3.8.2-bin.zip

in windows you have set the path\bin in evn variable (user / system)
 



create a java project <- maven 
create a spring project <- maven
create a hibernate project  <- maven

group 
   -> artifacts 
   	 -> version 
	 
	 
	 
<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.17</version>
</dependency>



<!-- https://mvnrepository.com/artifact/org.slf4j/slf4j-api -->
<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-api</artifactId>
    <version>1.7.30</version>
</dependency>




mvn archetype:generate 

1822: remote -> org.apache.maven.archetypes:maven-archetype-quickstart (An archetype which contains a sample Maven project.)

> mvn archetype:generate -DgroupId=com.mycompany -DartifactId=first-project -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false


Maven has 3 stages 
1. clean -> mvn clean 
2. build 
3. reporting 


1045  tree
 1046  clear
 1047  pwd
 1048  ls
 1049  cd first-project
 1050  mvn clean 
 1051  ls
 1052  mvn validate
 1053  ls
 1054  mvn compile 
 1055  ls
 1056  tree
 1057  mvn clean test
 1058  tree
 1059  mvn clean install
 1060  tree


 mvn clean install -DskipTests=true

> mvn dependency:analyse
> mvn dependency:tree
> mvn dependency:resolve
> mvn eclipse:eclipse 
> mvn site 


excersise 

1. change the skin
generate the site with different skin 
2. install sonar lint to your eclipse 
3. generate multi module project in eclipse 
4. create a hello world application but not with system.out instead logger from slf4j / log4j2 



- mvn archetype:generate -DgroupId=com.naveen -DartifactId=parent-project
- cd parent-project
 - mvn archetype:generate -DgroupId=com.naveen -DartifactId=services
 - mvn archetype:generate -DgroupId=com.naveen -DartifactId=core 
 - mvn archetype:generate -DgroupId=com.naveen -DartifactId=web-app

gradle

https://gradle.org/install/


Assignment Github link : 
https://github.com/Talapala-Sneha/Sample-app



# Day 3 


<img src="./notes-and-images/tdd.drawio.png">

a) Introduction to Automated Testing
      1. Agile Values and Principles around Software Quality
      2. Introduction to TDD & Benefits of TDD
      3. Test First Vs. Test Last (Formulazing the intent)




In the development we involve stake holder 

## Water fall model 
- Requirement Analysis 
- Design 
- Implementation 
- Testing 


### In agile 
- MDD - Model Driven Development 
- DDD - Domain Driven Development 
- BDD - Behaviour Driven Development 
- TDD - Test Driven Development 

DSL - Domain Specific Language 


- BDD
  - Given 
  - When
  - Then 
  - And 
  - But 


Given the application example.com is loaded 
When the user enter valid user name 
And valid password 
And clicks on Submit button 
Then the application show home screen 


### Agile 
1. Scrum Master 
2. Sprint - Definite time 
3. Kanban - Not Definite time 
4. Burndown / BurnUp Chart 


### junit 3 
```
class MyTestClass extends TestCase {
	@Test
	public void myTest() {}
	public void hello() {}
}
```

# junit 4 
```
	assertEquals("hello", "hello"); 
```
# junit 5 
  - hamcrest which is asserting library 


```
	 assertThat(theBiscuit, equalTo(myBiscuit)); 
	 assertThat("chocolate chips", theBiscuit.getChocolateChipCount(), equalTo(10)); 

```

- junit 5 Dependencies 
  - https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine/5.7.1
  - https://mvnrepository.com/artifact/org.hamcrest/hamcrest-all/1.3
  - https://mvnrepository.com/artifact/org.mockito/mockito-core/3.8.0
  - https://mvnrepository.com/artifact/org.mockito/mockito-junit-jupiter/3.8.0
  






// POST, PUT, GET, DELETE 
```

public interface IMessageService {
	
	public List<String> getMessages(String author);
}


public class MessageServiceImpl implements IMessageService {
	public List<String> getMessages(String author) {

		BL 
		to connect to DB 

	}
}

```



# Day 4 

Classroom - The Full stack: Cloud-based Applications - 1
a) Microservices Architecture
b) Introduction to REST API	4



Classroom - The Full stack: Cloud-based Applications - 2
b) Completion of REST API
c) Serverless Architecture - AWS 	
 
check for AWS Access 


<?xml version="1.0"?>

<employees>
	<emp>
		<empid>101</empid>
		<empname>Harshini</empname>
		<empsal>12345</empsal>
		<address>
			<hno>h123</hno>
			<street>Some Blvd </street>
		</address>
	</emp>
	<emp>
		<empid>102</empid>
		<empname>Purushotham</empname>
		<empsal>22334</empsal>
		<address>
			<hno>h543</hno>
			<street>California Blvd </street>
		</address>
	</emp>
</employees>


to json (light weight)

employee:[
	emp:{
		empid:101, 
		empname:"Harshini", 
		empsal:1234, 
		address:{
			hno:h123, 
			street:"Some Blvd"
		}
	}

]




- Rest 
- Restfull



Sprint Boot 
	Java 8, 11 
	Eclipse / VS Code / Intellij 
MongoDB 

GitBash


To Start Mongod 

> mongod --dbpath .
> mongo 



- com.barclays.rest.works (RestWorksApplication.java) - @SpringBootApplication
  - com.barclays.rest.works.controller
  - com.barclays.rest.works.service - EmployeeService - @Service
  - com.barclays.rest.works.entity
  - com.barclays.rest.works.xxxx



2021-09-15 12:24:33.288  INFO 74412 --- [nio-9090-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'


<servlet>
	<servlet-class>com.naveen.HelloWorld</serlet-class>
	<servlet-name>hello</servlet-name>
</servlet>

<servlet-mapping>
	<servlet-name>hello</servlet-name>
	<url-pattern>/hello</url-pattern>
</servlet-mapping>
 
<servlet>
	<servlet-class>com.naveen.LoginValidate</serlet-class>
	<servlet-name>login</servlet-name>
</servlet>

<servlet-mapping>
	<servlet-name>login</servlet-name>
	<url-pattern>/login</url-pattern>
</servlet-mapping>





<servlet>
	<servlet-class>com.naveen.DispatcherServlet</serlet-class>
	<servlet-name>dispatcherServlet</servlet-name>
</servlet>

<servlet-mapping>
	<servlet-name>dispatcherServlet</servlet-name>
	<url-pattern>/*</url-pattern>
</servlet-mapping>




## application.properties 

### set mongodb properties 
spring.data.mongodb.database=barclays-db
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017





In clean coding which below declaration is better. 

a. ArrayList<String> list = new ArrayList<String>();  -> ArrayList  list = new ArrayList (); 
b. List<String> list = new ArrayList<String>();  -> List  list = new ArrayList (); 
c. List<String> list = new ArrayList<>(); 
d. List list = new ArrayList(); 



interface List {
	public void one();
	public void two();
}

// naveen 
class ArrayList implements List{

	public void one() {}
	public void two() {}
	public void three() {}
}

class Vector implements List {
public void one() {}

}

// sanya 
1. List list = new Vector();

2. List list = new ArrayList();
list.one();

// Abhinaya 
List list = new ArrayList();
list.one();


Pendrive 



@Autowired 
private List list;


- done 
GET /employee 
GET /employee/{empId}
POST /employee


- TODO 
PUT /employee 
{
	new data model which you want to update 
}

DELETE /employee/id



# Day 5


Given - pre condition 
When - is actual job 
Then - is after work 


when(repo.save(emp)).thenReturn(emp); 


assertEquals("Harish", service.insertEmployee(emp).getName()); 



Git Works 
For User 
- git config --global user.name Naveen 
- git config --global user.email adith.naveen@gmail.com 
- git config --global --edit 

For System wide  
- git config --system user.name Naveen 
- git config --system user.email adith.naveen@gmail.com 
- git config --system --edit 


- git init (the current folder will become git repo)
- git init my-repo (new folder called my-repo will be created and then it becomes git repo)


<esc> :wq

-- to remove the file which is created before staging 

- Step 1 : Modify Hello.java + save and Exit 
- Step 2 : git status -- should see a messsage "Modified <File>" 
- Step 3 : git restore Hello.java -this command will discard what ever work you have done before commit 

--- 

- Step 1 : Create a new file called Employee.java + add some content + Save & exit 
- Step 2 : git status - it says untracked file
- Step 3 : to remove rm Employee.java 



working with Branching Stratergy 
- 1. To create a branch 
  -  git branch <branch-name>
- 2. To Switch a branch 
  - git checkout <branch-name>
- 3. Edit the file which is in new branch (login-branch) 
- 4. git branch --merged  - will show the branches merged to current branch (Main)
- 5. git branch --no-merged - will show if the branch is not merged if any 
- 6. git diff main..new-branch 
- 7. git diff new-branch..main^ (^ to check 1 level above)
- 8. git log --oneline --graph --all --decorate 
- 9. git log --oneline --graph --all --decorate -5 (will give you last 5 commits)


Seeding local repo to github 
1. git remote add origin https://github.com/adithnaveen/git-training-braclays-delete.git
2. git branch -M main 
3. git push -u origin main 


Create a tag for application 
1. git tag --help  
2. git tag -l (to list the tags)
3. git tag -a v1.0 -m "first bench mark created"
4. git push origin v1.0     



Naveen's Team 

adith.naveen@gmail.com 

- shubham15gupta09@gmail.com
```	> git branch shubham-branch 
	> git checkout shubahm-branch 
	> make some changes 
	> git push origin shubham-branch ```

	
harshir07@gmail.com
```	> git branch harshini-branch 
	> git checkout harshini-branch 
	> make some changes 
	> git push origin harshini-branch 
```
apooorvagupta30@outlook.com
	````> git branch apoorva-branch 
	> git checkout apoorva-branch 
	> make some changes 
	> git push origin apoorva-branch 
````


> git clone https://github.com/barclays-training-delete/team-work.git

###  Git Cheat Sheet 
https://education.github.com/git-cheat-sheet-education.pdf

### Github CLI 
https://github.com/cli/cli




# DAY 6 

I T M - Model / Role 


 
 
Classroom - Build Pipelines - 2	b) Completion of Build Process
c) Automatic Build Process using Jenkins (introduction only, Setup of Jenkins not covered)
d) Automated Code reviews - Sonar (Introduction only , Setup Configuration of Sonar not covered) 
 


CI / CD - Continious Integration / Continious Development 

- Jenkins 
  - hundreds of plugins
- Bamboo 


- Maven 

c:\program files\java\jdk11\


GIT 
GITHUB 
MAVEN
ANT
PIPELINE 
BLUEOCEAN
JAVA SCRIPT 
JUNIT 




In Jenkins  there are types of project 

1. Simple 
2. Pipe line - Groovy 



Jenkins - In the Bash/ win bash 
cd /Volumes/Kanchan/MyTrainings/barclays/boot-camp-sep-2021/jenkins-java
javac -d . *.java
java com.company.Hello




Jenkinsfile 


pipeline {
    agent { M3 }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}



from jenkins 
pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/adithnaveen/git-training-barclays-delete.git'

                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

        }
        stage('JAR') {
            steps {
                sh "mvn install"
            }
        }
    }
}



# Day 7 

Containarization - Docker 
Deploye application on cloud - AWS 

-  docker pull mongo 
-  docker run --name my-mongo -d mongo
-  docker run --name my-mongo1 -p 27018:27017 -d  mongo
-  docker ps  (which will show all the docker container running)
-  docker stop <containerID> - which will strop the container specified 
-  docker ps -a (which will show all the coker containers running + stopped)
-  docker start <containerID> - to start existing stopped containers 

-  docker pull ubuntu 


-  docker build -f Dockerfile -t user-app:1 . 
-  docker run -p 9090:9090 

push the image to cloud 
- docker image tag user-app:1 adithnaveen/user-app-barclays:1 (make sure you do this )
- docker push adithnaveen/user-app-barclays:1 ( to push it to docker hub, pls login [docker login])

### to execute spring boot applicaiton written 
- docker pull adithnaveen/user-app-barclays
- docker run --name my-spring-boot -p 9090:9090 adithnaveen/user-app-barclays:1
- http://localhost:9090/user 


### get into the container 
- docker exec -it 50ac7729e13c /bin/bash


1. Create spring boot project + write basic code 
2. mvn clean install - this creates a .jar file 
3. java -jar target/barclays-app.jar - to executed spring boot application 

Help Links 
- https://docs.microsoft.com/en-us/windows/wsl/install-win10 
- https://www.thecodebuzz.com/docker-error-daemon-is-not-running/



- Create a spring boot application which connects to mongodb 
- dockerize the application (preferably with docker compose file )


working with docker compose 


 1028  git clone https://github.com/adithnaveen/axis-docker-jenkins-nov2020.git
 1029  docker-componse -version
 1030  docker-compose -version
 1031  ls
 1032  cd axis-docker-jenkins-nov2020
 1033  clear
 1034  ls
 1035  docker-compose up -d
 1036  docker network create axis-network
 1037  docker-compose up -d
 1038  mvn clean install
 1039  clear
 1040  docker-compose up -d
 1041  docker images
 1042  docker ps 
 1043  docker-compose ps 
 1044  docker-compose down
 1045  docker-compose ps 




# Day 8, 9, 10 

- Project 
  - Project Statement - morning 
  - Each Project will have 10 People , 23 + 17 = 40 
  - 
## Day 8 
## Day 9 
## Day 10 




1. Spring Boot application + UI (JavaScript + HTML + CSS), Containarization, CI/CD + Branching Stratergy
2. Spring Microservices (Netflix OSS Tools) - Eureka, API Gateway, Open Feign, Swagger/Postman, Containarization, CI/CD + Branching Stratergy

Optional 
- AWS / Azure / Heroku / GCP 

Thursday 
-	stake holders from Barclays to come and evaluate 




1. Scrum Master + Meistertask / Jira 
2. Developers 
3. Database 
4. Dockerizing 
5. Jenkins 
6. Cloud Optional 
7. SCM 
8. SonarQube (Test Coverage)

