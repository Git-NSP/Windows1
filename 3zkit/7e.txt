public class prog7e {

    static void testAddition() {
        assert 2 + 3 == 5;
        System.out.println("Addition: PASS");
    }

    static void testSubtraction() {
        assert 5 - 2 == 3;
        System.out.println("Subtraction: PASS");
    }

    public static void main(String[] args) {

        testAddition();
        testSubtraction();
    }
}
