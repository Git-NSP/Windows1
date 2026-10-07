import java.io.*;

public class prog7b {

    public static double discount(double price, String category) {
        if (category.equals("electronics"))
            return price * 0.9;
        if (category.equals("clothing"))
            return price * 0.8;
        return price;
    }

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new FileReader("testdata.txt"));

        String line;

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            double price = Double.parseDouble(data[0]);
            String category = data[1];

            System.out.println(
                price + " " + category + " " +
                discount(price, category)
            );
        }

        br.close();
    }
}
