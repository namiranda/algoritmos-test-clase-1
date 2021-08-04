package com.redbee.academy.clase1;

public class MCMyMCD {


    /**
     * Generar un algoritmo que resuelva el mínimo común múltiplo entre 2 números
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer mcm(int num1, int num2) {
        return num1 / mcd(num1, num2) * num2;
    }

    /**
     * Generar un algoritmo que resuelva el máximo común divisor entre 2 números
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer mcd(int num1, int num2) {
        int mcd = 1;
      for(int i = 1; i <= num1 && i <= num2; i++){
          if(num1 % i == 0 && num2 % i == 0){
              mcd = i;
          }
      }
      return mcd;
    }
}
