public class Main {
    public static void main(String[] args) {

        int number;
        int result = 0;

        for(number = 0; number <= 100; number++){
            if(number % 2 == 0) {
                System.out.print(number + " ");
                result += number;
            }
        }
        System.out.println();
        System.out.println(result);
    }
}
