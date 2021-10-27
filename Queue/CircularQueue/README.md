# >\_ Activity 11: Circular Queue

> **College:** [Instituto Federal do Paraná - campus Londrina](https://londrina.ifpr.edu.br) \
> **Course:** [Tecnologia em Analise e Desenvolvimento de Sistemas](https://londrina.ifpr.edu.br/tecnologia-em-analise-e-desenvolvimento-de-sistemas/componentes-curriculares/) \
> **Subject:** Data Structure \
> **Professor:** [Fernando Accorsi](https://www.linkedin.com/in/fernando-accorsi-b6252823/)

## Exercise 1

Show the status of an `mf` queue after executing each of the operations below. Present the value of all attributes of the created object.

```java
Queue mf = new Queue (7);
mf.enqueue(“a”);
mf.enqueue(“b”);
mf.enqueue(“c”);
mf.enqueue(“d”);
mf.dequeue();
mf.dequeue();
mf.enqueue(“e”);
mf.dequeue();
mf.enqueue(“f”);
mf.dequeue();
mf.enqueue(“g”);
mf.enqueue(mf.dequeue ());
```

**Answer**
```java
Queue mf = new Queue(7); // [null, null, null, null, null, null, null]
mf.enqueue(“a”); // ['a', null, null, null, null, null, null]
mf.enqueue(“b”); // ['a', 'b', null, null, null, null, null]
mf.enqueue(“c”); // ['a', 'b', 'c', null, null, null, null]
mf.enqueue(“d”); // ['a', 'b', 'c', 'd', null, null, null]
mf.dequeue(); // [null, 'b', 'c', 'd', null, null, null]
mf.dequeue(); // [null, null, 'c', 'd', null, null, null]
mf.enqueue(“e”); // [null, null, 'c', 'd', 'e', null, null]
mf.dequeue(); // [null, null, null, 'd', 'e', null, null]
mf.enqueue(“f”); // [null, null, null, 'd', 'e', 'f', null]
mf.dequeue(); // [null, null, null, null, 'e', 'f', null]
mf.enqueue(“g”); // [null, null, null, null, 'e', 'f', 'g']
mf.enqueue(mf.dequeue()); // ['e', null, null, null, null, 'f', 'g']
```

## Exercise 2

Implement the Queue class and the necessary exception classes presented in class. Build a client class that tests the queue's functionality as described in example below.

Example:
```bash
Qual a opção? (1) Enfileirar (2) Desenfileirar (3) Acessar
1
Digite o elemento:
10
Qual a opção? (1) Enfileirar (2) Desenfileirar (3) Acessar
1
Digite o elemento:
20
Qual a opção? (1) Enfileirar (2) Desenfileirar (3) Acessar
2
O elemento desenfileirado é: 10.
```

**Code:** [Click here](https://github.com/devweslen/data-structure-java/blob/main/Queue/CircularQueue/Exercise2/src/main/java/br/edu/ifpr/exercise2/Main.java)

## Exercise 3

Using the circular queue implementation (exercise 2) as a basis, develop the method **toArray** (Class **Queue**) that returns an array of objects with the elements of the queue in order specified by the **ord** parameter. If the **ord** parameter is **true** it returns the elements of the first to last, otherwise (**false**) returns from last to first. The returned vector must have the exact size of the number of elements in the queue. Add to exercise account 2 new ones features that use the toArray method developed to show queue elements for the user.

```java
public Object [] toArray (boolean ord) { ... }
```

> (*) teste os casos em que o índice do início (front) é maior que o índice da próxima posição livre (rear).

**Code:** [Click here](https://github.com/devweslen/data-structure-java/blob/main/Queue/CircularQueue/Exercise3/src/main/java/br/edu/ifpr/exercise3/Main.java)


[6, null, 3, 4, 5]
rear 1 -> [0]
count 4 
capcacity 5

0 -> 0
1 -> 4
2 -> 3
3 -> 2