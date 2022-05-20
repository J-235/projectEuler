

public class MultiplesSummator {

    int until;

    public MultiplesSummator(int until) {

        this.until = until;
    }

    public int allMultiplesOf(int multiple1, int multiple2) {

        int sumOfMultiples = 0;
        for (int number = 1; number < until; number++) {
            if ((number % 3 == 0) || (number % 5 == 0)) {
                sumOfMultiples += number;
            }
        }
        return sumOfMultiples;
    }
}
