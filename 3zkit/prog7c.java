import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class prog7c {

    public static double calculateDiscount(double price, String category) {
        if (category.equals("electronics"))
            return price * 0.9;
        if (category.equals("clothing"))
            return price * 0.8;
        return price;
    }

    public static void main(String[] args) {

        double[] prices = {500, 300, 150};
        String[] categories = {"electronics", "clothing", "grocery"};

        String[] columns = {"Price", "Category", "Result"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        for (int i = 0; i < prices.length; i++) {
            double result = calculateDiscount(prices[i], categories[i]);

            model.addRow(new String[]{
                prices[i] + "",
                categories[i],
                result + ""
            });
        }

        JTable table = new JTable(model);
        JFrame frame = new JFrame();
        frame.add(new JScrollPane(table));
        frame.setVisible(true);
    }
}

