package Com.Penjaringan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x;
        int jumlah = 0;
        Scanner input = new Scanner(System.in);
    
        System.out.println("====== SELAMAT DATANG DI PROGRAM ABSOLUTE VALUE ======");
        System.out.print("Berapa banyak nilai yang ingin Anda buat -> ");
        x = input.nextInt();
        
        int[] array = new int[x];
        System.out.println("Silahkan masukan nilai : ");
        
        for(int i = 0; i < x; i++) {
            array[i] = input.nextInt();
            if(array[i] < 0){
                array[i] = array[i] * -1;
            }
        }
        for (int a : array){
            
            jumlah = jumlah + a;
        }
        
        System.out.println(jumlah);
    }
    
}
