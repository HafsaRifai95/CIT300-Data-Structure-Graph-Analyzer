# Data Structure & Graph Performance Analyzer

## 1. Project Overview

The **Data Structure & Graph Performance Analyzer** is a Java-based console application developed for the CIT300 Data Structures and Algorithms course.

The project demonstrates the implementation and practical use of fundamental data structures, searching algorithms, graph operations, traversal algorithms, and performance analysis.

The application integrates multiple components into a single menu-driven system, allowing users to perform operations and observe their results through a console interface.

## 2. Project Objectives

The main objectives of this project are to:

- Implement and demonstrate fundamental data structures.
- Perform insertion, deletion, searching, and display operations.
- Implement linear and binary searching algorithms.
- Demonstrate stack and queue operations.
- Implement linked list operations.
- Represent graphs and perform graph operations.
- Demonstrate Breadth-First Search (BFS) and Depth-First Search (DFS).
- Compare algorithm performance and computational complexity.
- Apply input validation and error handling.
- Demonstrate object-oriented programming principles.
- Collaborate using GitHub for source-code management and integration.

## 3. Technologies Used

- **Programming Language:** Java
- **Application Type:** Console-Based Application
- **Development Environments:** Visual Studio Code (VS Code) and Eclipse IDE
- **Java Development Kit:** JDK
- **Version Control:** Git and GitHub

## 4. System Features

The application provides a main menu containing the following options:

1. Array Operations
2. Stack Operations
3. Queue Operations
4. Linked List Operations
5. Searching Operations
6. Graph Operations
7. Performance Comparison
8. Display All Results
9. Exit

### 4.1 Array Operations

The array component demonstrates operations on array data, including insertion, deletion, searching, and displaying elements.

### 4.2 Stack Operations

The stack component demonstrates the **Last-In, First-Out (LIFO)** principle, in which the last element added is the first element removed.

The supported operations include:

- Push
- Pop
- Peek
- Display

The application handles attempts to remove elements from an empty stack.

### 4.3 Queue Operations

The queue component demonstrates the **First-In, First-Out (FIFO)** principle, in which the first element added is the first element removed.

The supported operations include:

- Enqueue
- Dequeue
- Peek / Front
- Display

The application handles attempts to remove elements from an empty queue.

### 4.4 Linked List Operations

The linked list component demonstrates dynamic data management through linked nodes.

The supported operations include:

- Insert
- Delete
- Search
- Display

The application also provides information about the linked list, including its size.

### 4.5 Searching Operations

The searching component demonstrates algorithms used to locate elements in a collection.

The searching algorithms include:

- Linear Search
- Binary Search

These algorithms can be compared to understand the differences in their approaches and computational complexities.

**Note:** Binary Search requires appropriately sorted data to work correctly.

### 4.6 Graph Operations

The graph component represents connections between vertices and demonstrates graph traversal algorithms.

The available operations include:

- Add Vertex
- Add Edge
- Display Graph
- Search Vertex
- Breadth-First Search (BFS)
- Depth-First Search (DFS)
- Graph Statistics
- Compare BFS and DFS Performance

The graph component also handles situations such as attempting to add an edge when the required vertices do not exist.

### 4.7 Performance Comparison

The performance comparison component allows users to examine and compare the behaviour of selected algorithms and data structures.

Depending on the implemented functionality, the comparison may consider:

- Execution time
- Operation counts
- Search results
- Traversal results

These results help demonstrate algorithmic efficiency and provide a practical basis for discussing computational complexity.

### 4.8 Display All Results

This option displays the current states of the application's data structures, including arrays, stacks, queues, linked lists, and graphs.

It also provides information about empty data structures where applicable.

## 5. Algorithmic Complexity

The following table summarises the typical time complexities of the searching and graph traversal algorithms used in this project.

| Algorithm | Best Case | Average Case | Worst Case |
|---|---|---|---|
| Linear Search | O(1) | O(n) | O(n) |
| Binary Search | O(1) | O(log n) | O(log n) |
| Breadth-First Search (BFS) | O(V + E) | O(V + E) | O(V + E) |
| Depth-First Search (DFS) | O(V + E) | O(V + E) | O(V + E) |

Where:

- **n** represents the number of elements.
- **V** represents the number of vertices in a graph.
- **E** represents the number of edges in a graph.

These are standard theoretical time complexities under the usual assumptions for the corresponding algorithms. Actual execution times may vary depending on the input data, graph representation, hardware, and implementation.

## 6. Project Structure

The Java source files are organised inside the `src` directory.

```text
CIT300-Data-Structure-Graph-Analyzer/
│
├── src/
│   ├── ArrayOperations.java
│   ├── Graph.java
│   ├── GraphTest.java
│   ├── LinkedList.java
│   ├── main.java
│   ├── Member2App.java
│   ├── Queue.java
│   ├── SearchingOperations.java
│   └── Stack.java
│
├── README.md
└── .gitignore
```

The main application entry point is `main.java`. It provides the integrated menu through which users access the different components.

## 7. Installation and Execution

### Prerequisites

Before running the application, ensure that a Java Development Kit (JDK) is installed and configured on your computer.

### Step 1: Clone the Repository

Open a terminal and run:

```bash
git clone https://github.com/HafsaRifai95/CIT300-Data-Structure-Graph-Analyzer.git
```

### Step 2: Open the Project Directory

```bash
cd CIT300-Data-Structure-Graph-Analyzer
```

### Step 3: Compile the Java Files

On Windows PowerShell, run:

```powershell
javac src\*.java
```

### Step 4: Run the Application

```powershell
java -cp src main
```

The main menu will appear in the terminal. Enter the number corresponding to the operation you want to perform and follow the prompts.

## 8. Input Validation and Error Handling

The application handles certain invalid operations, such as attempting to add an edge when the required graph vertices do not exist.

Empty data structures can also be displayed, with messages indicating that they contain no elements.

Input validation and error handling help improve the reliability and usability of the application.

## 9. Team Members and Individual Contributions

The project responsibilities were divided among the group members based on the suggested responsibilities provided in the assignment brief. Each member was responsible for a specific component, and the components were integrated into a single application.

## 9. Team Members and Individual Contributions

The project responsibilities were divided among the group members based on the suggested responsibilities provided in the assignment brief. Each member was responsible for a specific component, and the components were integrated into a single application.

| Member | Full Name | Student ID | Assigned Responsibility | Individual Contribution |
|---|---|---|---|---|
| Member 1 | Nuha Najeem | 23DA2-1073 | Array and Searching Implementation | Implemented array operations and searching algorithms, including linear search and binary search. |
| Member 2 | Mirza Mazahir | 23DA2-0792 | Stack and Queue Implementation | Implemented stack and queue operations, demonstrating the LIFO and FIFO principles. |
| Member 3 | Ilma Aun Moulana | 23DA2-0584 | Linked List Implementation | Implemented linked list operations, including insertion, deletion, searching, and displaying elements. |
| Member 4 | Hafsa Rifai | 23DA2-0952 | Graph Implementation and Traversal | Implemented graph operations, vertex and edge management, BFS and DFS traversal, and contributed to the main menu and integration of the graph component. |
| Member 5 | All members took part | All members took part | Performance Comparison, Main Menu, Integration and Testing | Contributed to performance comparison, main menu development, integration, and testing of the application. |

### Collaborative Contributions

All group members contributed to the overall project through their assigned responsibilities. Performance comparison, integration, and testing were collaborative activities where applicable.

GitHub was used to manage source code, track changes, and integrate individual components into the overall application.
## 10. GitHub Collaboration

GitHub was used for source-code management and collaboration throughout the development process.

The repository contains the Java source files and the integrated console application. Commits and pull requests provide a record of development and code integration.

**GitHub Repository:** [CIT300 Data Structure & Graph Performance Analyzer](https://github.com/HafsaRifai95/CIT300-Data-Structure-Graph-Analyzer)

## 11. Conclusion

The Data Structure & Graph Performance Analyzer brings together fundamental data structures, searching algorithms, graph representation, and traversal techniques in a single Java console application.

The project provides a practical environment for exploring data structure operations, understanding algorithmic complexity, and observing how different algorithms behave.

It also demonstrates collaborative software development through GitHub-based source-code management and integration.
