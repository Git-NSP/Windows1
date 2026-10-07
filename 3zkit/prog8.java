import java.io.*;

public class prog8 {

    static double discount(double price, String category) {
        if (category.equals("electronics"))
            return price * 0.9;
        if (category.equals("clothing"))
            return price * 0.8;
        return price;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("data.csv"));

        String line;

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            double price = Double.parseDouble(data[0]);
            String category = data[1];
            double expected = Double.parseDouble(data[2]);

            double actual = discount(price, category);

            if (actual == expected)
                System.out.println("PASS");
            else
                System.out.println("FAIL");
        }

        br.close();
    }
}