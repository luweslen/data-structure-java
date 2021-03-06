# >\_ Activity 10: Recursion

> **College:** [Instituto Federal do Paraná - campus Londrina](https://londrina.ifpr.edu.br) \
> **Course:** [Tecnologia em Analise e Desenvolvimento de Sistemas](https://londrina.ifpr.edu.br/tecnologia-em-analise-e-desenvolvimento-de-sistemas/componentes-curriculares/) \
> **Subject:** Data Structure \
> **Professor:** [Fernando Accorsi](https://www.linkedin.com/in/fernando-accorsi-b6252823/)

## Exercise 1

The SM method below was developed to calculate the sum of natural numbers less than or equal to N using recursion. For example, for N=4 the result would be 10 (1+2+3+4). However, incorrect method development causes an error during its execution. Look at the method and describe why this error occurs. Suggest the correction.

```java
public int SM (int n){
    if (n <= 0 )
        return 0;
    else
        return n + SM(n);
}
```

**Code:** [Click here](https://github.com/devweslen/data-structure-java/blob/main/Stack/Recursion/Exercise1/src/main/java/br/edu/ifpr/exercise1/Main.java)

## Exercise 2

Build the recursive PRec method to calculate the value of P determined by the series below.

$P=1+\frac{1}{3}+\frac{1}{5}+\frac{1}{7}+...$

The number of terms in the series is determined in the method call. For example, for 3 terms:

$P=1+\frac{1}{3}+\frac{1}{5}$

**Code:** [Click here](https://github.com/devweslen/data-structure-java/blob/main/Stack/Recursion/Exercise2/src/main/java/br/edu/ifpr/exercise2/Main.java)

## Exercise 3

Determine what will be printed when each of the methods below is invoked by passing 3 as an argument (n=3).

**Algorithm 1**

```java
public void imp1 (int n){
    System.out.println(n);
    if (n>0) imp1(n-1);
}
```

**Result on screen**

```bash
3
2
1
0
```

**Algorithm 2**

```java
public void imp2 (int n){
    if (n>0) imp2(n-1);
    System.out.println(n);
}
```

**Result on screen**

```bash
0
1
2
3
```

**Algorithm 3**

```java
public void imp3 (int n){
    System.out.println(n);
    if (n>0) imp3(n-1);
    System.out.println(n);
}
```

**Result on screen**

```bash
3
2
1
0
0
1
2
3
```

## Exercise 4

Build the `public double power method (double base, int exponent)` that calculate base<sup>exponent</sup> for non-negative exponents (version recursive).

$power(2, 3)=2^³ = 2x2x2x2 = 8$

**Code:** [Click here](https://github.com/devweslen/data-structure-java/blob/main/Stack/Recursion/Exercise4/src/main/java/Main.java)

## Exercise 5

Rephrase the recursive method to also calculate with negative exponents.

$power(2, -3)=2^{-3}= \frac{1}{2^3} = 0.125$

**Code:** [Click here](https://github.com/devweslen/data-structure-java/blob/main/Stack/Recursion/Exercise5/src/main/java/Main.java)

## **[#GoBack](https://github.com/devweslen/data-structure-java)**
