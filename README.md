# Simple Java App

This is a minimal Java application.

Build with Maven:

```bash
mvn package
```

Run with Maven:

```bash
mvn exec:java -Dexec.mainClass="com.example.App" -Dexec.args="1 2 3"
```

Or compile/run with `javac`/`java`:

```bash
javac -d out src/main/java/com/example/App.java
java -cp out com.example.App 1 2 3
```
