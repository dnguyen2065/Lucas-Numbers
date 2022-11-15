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
}