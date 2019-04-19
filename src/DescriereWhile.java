public class DescriereWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
        }
        // Folosind comanda system.out.println , ne va afisa numerele de la 1 la 10 unele sub altele;
        int j = 0;
        while (j < 10){
            System.out.print(j + " ");
            j++;
        }
        System.out.println();
        // Folosing comanda system.out.print , ne va afisa numerele in linie de la stanga la dreapta;
        // Practic numere vor fi unele dupa altele;
        // Iar pt un aspect mai frumos am adaugat si un spatiu .
        int k1 = 0;
        while (k1 < 10){
            int sum = 0;
            int k2= 0;
            while (k2 < k1){
                sum = sum +k2;
                k2++;
            }
            System.out.println("Suma este " + sum);
            k1++;
        }
    }
}

