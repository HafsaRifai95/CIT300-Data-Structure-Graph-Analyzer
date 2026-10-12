# Data Structure and Graph Performance Analyzer

## 1. Project Overview

The **Data Structure and Graph Performance Analyzer** is a Java-based console application developed for the CIT300 Data Structures and Algorithms module. The project demonstrates the implementation and operation of fundamental data structures, searching algorithms, and graph traversal techniques.

Users can interact with the application through a menu-driven interface to perform operations, test different algorithms, and compare their performance.

## 2. Project Objectives

- Implement fundamental data structures using Java.
- Demonstrate searching algorithms and graph traversal techniques.
- Understand the time complexity of different operations and algorithms.
- Compare the performance of selected algorithms.
- Develop a menu-driven console application using object-oriented programming principles.
- Collaborate as a team using Git and GitHub.

## 3. Technologies Used

- **Programming Language:** Java
- **Development Environment:** Visual Studio Code / Eclipse
- **Java Development Kit:** JDK
- **Version Control:** Git
- **Code Hosting and Collaboration:** GitHub

## 4. Main Features

### 4.1 Array Operations
- Insert elements.
- Delete elements.
- Search for elements.
- Display array elements.

### 4.2 Stack Operations
- Push elements onto the stack.
- Pop elements from the stack.
- Peek at the top element.
- Display stack elements.

### 4.3 Queue Operations
- Enqueue elements.
- Dequeue elements.
- View the front element.
- Display queue elements.

### 4.4 Linked List Operations
- Insert elements.
- Delete elements.
- Search for elements.
- Display linked list elements.

### 4.5 Searching Algorithms
- Linear Search.
- Binary Search.
- Demonstration of searching operations.

### 4.6 Graph Operations
- Add vertices.
- Add edges between vertices.
- Display the graph.
- Search for a vertex.
- Perform Breadth-First Search (BFS).
- Perform Depth-First Search (DFS).
- Display graph statistics.
- Compare BFS and DFS performance.

### 4.7 Performance Comparison
- Compare selected searching and graph traversal algorithms.
- Display performance results to help understand algorithm efficiency.

### 4.8 Main Menu and Integration
- Access the different data structure and algorithm modules through a menu-driven interface.
- Navigate between operations.
- Display available results.
- Exit the application.

## 5. Algorithm Complexity

The following table shows the general time complexity of the main algorithms included in the project.

| Algorithm | Best Case | Average Case | Worst Case |
|---|---|---|---|
| Linear Search | O(1) | O(n) | O(n) |
| Binary Search | O(1) | O(log n) | O(log n) |
| Breadth-First Search (BFS) | O(V + E) | O(V + E) | O(V + E) |
| Depth-First Search (DFS) | O(V + E) | O(V + E) | O(V + E) |

**Note:** Binary Search requires sorted data. For graph traversal, `V` represents the number of vertices and `E` represents the number of edges.

## 6. Project Structure

The project contains the following main source files:

```text
CIT300-Data-Structure-Graph-Analyzer/
│
├── src/
│   ├── ArrayOperations.java
│   ├── Stack.java
│   ├── Queue.java
│   ├── LinkedList.java
│   ├── SearchingOperations.java
│   ├── Graph.java
│   ├── GraphTest.java
│   ├── Member2App.java
│   └── main.java
│
├── README.md
└── .gitignore
```

Each Java file contains the implementation or supporting code for the relevant data structure, algorithm, or application functionality.

## 7. How to Run the Project

### Prerequisites

- Install the Java Development Kit (JDK).
- Install Visual Studio Code, Eclipse, or another Java-compatible development environment.
- Clone or download this repository.

### Steps to Run

**1. Clone the repository**

```bash
git clone https://github.com/HafsaRifai95/CIT300-Data-Structure-Graph-Analyzer.git
```

**2. Open the project folder**

Open the downloaded project in Visual Studio Code, Eclipse, or a terminal.

**3. Compile the Java source files**

From the project root directory, run:

```powershell
javac src\*.java
```

**4. Run the application**

```powershell
java -cp src main
```

**5. Use the main menu**

Choose an option from the displayed menu and follow the instructions to perform the available operations.

## 8. Input Validation

The application includes input validation for supported operations to help handle invalid inputs and prevent unsupported operations. For example, graph operations validate vertex references when adding edges.

## 9. Team Members and Individual Contributions

| Student ID | Name | Assigned Responsibility | Individual Contribution |
|---|---|---|---|
| 23DA2-1073 | Nuha Najeem | Array and Searching Implementation | Implemented array operations, including insertion, deletion, searching, and displaying elements. Implemented Linear Search and Binary Search and contributed to testing these functionalities. |
| 23DA2-0792 | Mirza Mazahir | Stack and Queue Implementation | Implemented stack operations, including push, pop, peek, and display. Implemented queue operations, including enqueue, dequeue, viewing the front element, and display. |
| 23DA2-0584 | Ilma Aun Moulana | Linked List Implementation | Implemented linked list operations, including insertion, deletion, searching, and displaying elements. |
| 23DA2-0952 | Hafsa Rifai | Graph Implementation and Traversal | Implemented graph operations, including vertex and edge management, graph display, vertex searching, Breadth-First Search (BFS), and Depth-First Search (DFS). Contributed to graph statistics, BFS and DFS performance comparison, integration, and graph testing. |

**Collaborative Contributions:** All team members contributed to developing the project according to their assigned responsibilities. Git and GitHub were used to manage source code, track changes, and integrate individual contributions into the project.

## 10. GitHub Collaboration

GitHub was used as the central repository for the project. Team members contributed their code, managed changes, and collaborated to integrate the different data structure and algorithm implementations into a single application.

**Repository:** https://github.com/HafsaRifai95/CIT300-Data-Structure-Graph-Analyzer

## 11. Conclusion

The Data Structure and Graph Performance Analyzer demonstrates the practical implementation of fundamental data structures, searching algorithms, and graph traversal techniques using Java. Through this project, the team gained practical experience in algorithm implementation, complexity analysis, testing, integration, and collaborative software development.
