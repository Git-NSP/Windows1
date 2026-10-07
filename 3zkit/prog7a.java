import java.util.Random;

public class prog7a {

    public static double discount(double price, String category) {
        if (category.equals("electronics"))
            return price * 0.9;
        if (category.equals("clothing"))
            return price * 0.8;
        return price;
    }

    public static void main(String[] args) {

        String[] categories = {"electronics", "clothing", "grocery"};
        Random r = new Random();

        for (int i = 1; i <= 5; i++) {

            int price = 100 + r.nextInt(901);
            String category = categories[r.nextInt(3)];

            double result = discount(price, category);

            System.out.println(price + " " + category + " " + result);
        }
    }
}
