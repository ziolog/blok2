public class OddOrNot {
    public static void main(String[] args) {

        //generowanie liczby między 1 a 100
        int randomNumberZiolog = (int) (Math.random() * (100-1));
        System.out.println("Wygenerowana liczba to " + randomNumberZiolog);

        //sprawdzanie czy liczba jest parzysta
        if(randomNumberZiolog%2 == 0){
            System.out.println("Liczba " + randomNumberZiolog + " jest parzysta");
        } else {
            System.out.println("Liczba " + randomNumberZiolog + " jest nieparzysta");
        }
    }
}
