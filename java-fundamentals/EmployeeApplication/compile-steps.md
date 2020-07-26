## Compile code instructions

1. use `.class` files from `.java` files

```
javac employeeApp/*.java
```

2. create `.jar` file

```
jar cvfe employeeApp.jar employeeApp.Main employeeApp/*.class
```

stands for
```
jar cvfe [name of jar file being created] [] [entry point]
```

3. run `.jar` file

```
java -jar employeeApp.jar
```