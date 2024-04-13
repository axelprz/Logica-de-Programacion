
package SumadeNumerosPrimos;

public class NumPrimos {
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public long sumaPrimerosPrimos(int n) {
        int count = 0; 
        int num = 2;  
        long suma = 0; 
        
        while (count < n) {
            if (esPrimo(num)) {
                suma += num;
                count++;
            }
            num++;
        }
        return suma;
    }
}
