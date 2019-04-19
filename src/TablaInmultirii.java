public class TablaInmultirii {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Afisare tabla inmultirii:");
        while (i <= 10) {
            int j = 0;
            int produs = 0;
            while (j <= 10) {
                produs = i * j;
                j++;
                System.out.println(i + "x" + j + "=" + produs);
            }
            i++;
        }
    }
}





