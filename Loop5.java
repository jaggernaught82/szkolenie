package practice.loops;

public class Loop5 {
    public static void metoda(int[] zmienna){
        int suma=0;
        for (int i=0;i<zmienna.length;i++){
            suma+=zmienna[i];
        }
        System.out.println("Suma elementów tablicy wynosi " + suma);
    }
    public static void main (String[] args){
        int[] zmienna = {12, 13, 15, 55};
        metoda(zmienna);
    }
}
