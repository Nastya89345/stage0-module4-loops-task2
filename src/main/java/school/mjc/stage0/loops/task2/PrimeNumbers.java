package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number = 2;
        boolean isPrime;
        int divider;
        while(number <= printToInclusive){
            isPrime = true;
            divider = 2;
            while (divider < number){
                if(number % divider == 0){
                    isPrime = false;
                    break;
                }
                divider ++;
            }
            if(isPrime){
                System.out.println(number);
            }
            number ++;
        }
    }
}
