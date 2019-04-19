public class Exercitiul3 {
    public static void main(String[] args) {
        int n = 20;
        int m = 4 ;
        int i = 1 ;
        System.out.println("Afiseaza Nr:");
        while (i <= n){
            if(i % m == 0){
                System.out.println(i);
            }
            i++;
        }
        System.out.println("Stop");
    }
}
