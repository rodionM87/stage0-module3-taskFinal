package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        Object lengthVar;
	lengthVar = checkLenghthDigit(number);
	int lengthInt = (int) lengthVar;
	int reversed = 0;
	for (int i = 1; i <= lengthInt; i++) {
	    int tempNumber = number % 10;
	    reversed = reversed * 10 + tempNumber;
	    number /= 10;
	}
	System.out.println(reversed);
    }
}

    public static Object checkLenghthDigit(int number) {
	int length = 0;
	long temp = 1;
	while (temp <= number) {
	    length++;
	    temp *= 10;
	}
	return length;
    }
