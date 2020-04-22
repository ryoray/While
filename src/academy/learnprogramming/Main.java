package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int count = 1;
	    while (count != 6) {
            System.out.println("Count number " + count);
            count++;
        }

        System.out.println("--------------------------------");
	    for (count=1; count < 6; count++) {
            System.out.println("Count number " + count);
        }

        System.out.println("--------------------------------");
	    count = 1;
	    while (true) {
	        if (count >= 6) {
                break;
            }
            System.out.println("Count number " + count);
            count++;
        }

        System.out.println("--------------------------------");
	    count = 1;
	    do {
            System.out.println("Count number " + count);
            count++;
        }while (count != 6);

        System.out.println("--------------------------------");
        System.out.println(isEvenNumber(4));
    }

    public static boolean isEvenNumber(int number) {
        if (number > 0) {
            return (number % 2 == 0);
        }
        return false;
    }
}
