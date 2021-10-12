
package br.edu.ifpr.exercise1;

class Main {
  // public static int SM(int n){
  //   if (n <= 0)
  //     return 0;
  //   else
  //     return n + SM(n);
  // }

  public static int SM(int n){
    if (n <= 0)
      return 0;
    else
      return n + SM(n - 1); // Erro aqui
  }

  public static void main(String[] args) {
    System.out.println(SM(5));
  }
}
