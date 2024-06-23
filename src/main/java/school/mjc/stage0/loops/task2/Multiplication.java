package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int number = 0;
        int border = multiplyByAndToInclusive > 0 ? multiplyByAndToInclusive : -multiplyByAndToInclusive;
        if (multiplyByAndToInclusive != 0) {
            while (number <= border){
                System.out.println(number * multiplyByAndToInclusive);
                number ++;
            }

        }


    }
}
