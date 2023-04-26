# Implementation Description
1. The biggest opportunity for code improvement from assignment 1 was to use a software pattern. In this instance, the
decorator pattern made the most sense. This gave the flexibility in my code to add classes (beverages) on the fly while
also utilizing the decorator (for condiments) which both have "is a/has a" relationship. 
2. The next opportunity for 
refactoring was how condiments were tracked. The decorator pattern allowed for parameter in the constructor for the
condiment which very easily allowed for a maximum of each condiment. This results in a more robust code solution and 
an overall cleaner implementation. 
3. Finally, I was able to remove "redundant" code. In an earlier implementation, there was a class called "CoffeeMachine" 
and another called "TeaMachine" that acted identically except for the names of the methods that produced the different
beverages. With this implementation, every drink gets its own class from a super class "Drink," so the redundant code
was removed. 



# Project Template

This is a Java Maven Project Template


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

# Run all the unit test classes.


```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

# Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```




