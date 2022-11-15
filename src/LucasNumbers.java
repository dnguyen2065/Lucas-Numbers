public class LucasNumbers {

    public static int lucasNumberAns(int amount) {
        if (amount == 0) {
            return 2;
        }
        if (amount == 1) {
            return 1;
        }
        if (amount < 0) {
            return 0;
        }
        return lucasNumberAns(amount - 1) + lucasNumberAns(amount - 2);

    }

    public static int dylanNumbers(int amount) {
        if (amount == 0) {
            return 9;// september
        }
        if (amount == 1) {
            return 8;// 8th
        }
        if (amount < 0) {
            return 0;
        }
        return lucasNumberAns(amount - 1) + lucasNumberAns(amount - 2);

    }
}