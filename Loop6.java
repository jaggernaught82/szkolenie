package practice.loops;

public class Loop6 {
    public static void metoda(int[][] zmienna){
        int suma=0;
        for (int i = 0; i < zmienna.length; i++){
            for (int j = 0; j < zmienna[i].length; j++)
            suma=zmienna[i][j]+suma;
        }
        System.out.println("Suma elementów tablicy wynosi " + suma);
    }
    public static void main (String[] args){
        int[][] zmienna = new int [3][];
        zmienna[0] = new int[] {12, 13, 15, 55};
        zmienna[1] = new int[] {1, 3, 2};
        zmienna[2] = new int[] {9,2};
        metoda(zmienna);
    }
}
