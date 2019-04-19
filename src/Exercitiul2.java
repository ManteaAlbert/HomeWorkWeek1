public class Exercitiul2 {
    public static void main(String[] args) {
        int nr = 1;
        while( nr < 5){
            if( nr % 2 == 0){
                System.out.println("Numarul este Par");
            }
            else {
                System.out.println("Numarul este Impar");
            }
            nr++;
        }
        System.out.println("stop");
    }
}
