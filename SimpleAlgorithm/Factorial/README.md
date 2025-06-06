## 1. Factorial Definition

The factorial of `n` (`n!`) is the product of all positive integers from `1` to `n`.

- **Mathematical Definition:** 
  `n! = n × (n − 1) × ⋯ × 1`
- **Base Cases:** 
  `0! = 1` and `1! = 1`
- **Example:** 
  `5! = 5 × 4 × 3 × 2 × 1 = 120`

---

## 2. How to Execute

### Prerequisites
- Java Development Kit (JDK) 17 or higher.

### Steps

**Navigate to the 'Factorial' module directory:**
```bash
cd SimpleAlgorithm/Factorial/
```
(This directory contains the `src` folder and the `Factorial.iml` file.)

**Create output directory for compiled classes:**
```bash
mkdir -p out
```
(IntelliJ configures `out` as the default output directory.)

**Compile the files:**
```bash
javac -d out src/Factorial.java src/Main.java
```

**Execute the application:**
```bash
java -cp out Main
```

**Interact:** 
Enter an integer when prompted.

---

