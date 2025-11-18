# TaskManager

A simple console-based Task Manager application built in Java. It allows users to create, list, update, and delete tasks with due dates and status management (`pending` or `done`).

---

## Features

* Add, list, update, and delete tasks
* Assign unique IDs automatically
* Validate task states (`pending`, `do` or `done`)
* Manage due dates with proper validation (`YYYY-MM-DD`)
* Console-based user interface

---

## Requirements

* Java JDK 8 or higher
* A terminal or IDE (IntelliJ, Eclipse, VS Code, etc.)

---

## Installation and Setup

1. **Clone the repository**

```bash
git clone https://github.com/agomosodev/TaskManager.git
cd TaskManager
```

2. **Compile the project**

```bash
javac -d out src/io/github/agomosodev/*.java
```

* This compiles all `.java` files into the `out` directory.

3. **Run the application**

```bash
java -cp out io.github.agomosodev.TaskManagerApp
```

4. **Using the program**

* The menu will appear in the console:

```
======= Task Manager =======
 1. Add Task
 2. List Tasks
 3. Update Task
 4. Delete Task
 5. Exit
============================
Choose an option:
```

---

## Notes

* Ensure your Java version is at least 8. Check by running:

```bash
java -version
```

* Input validation is implemented for:

  * Task state (`pending` or `done`)
  * Date format (`YYYY-MM-DD`)

* The application currently stores tasks **in memory**, so all data will be lost when the program exits.

---

## License

This project is open-source and free to use.

---

## Author

Antonio Jesús Gómez Osorio ([agomosodev](https://github.com/agomosodev))
