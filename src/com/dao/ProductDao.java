package com.dao;
import com.domain.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    public static void main(String[] args) {

        System.out.println(new ProductDao().ListProduct().size());

    }

    public List<Product> ListProduct() {
        List<Product> products = new ArrayList<>();
        try {
            Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
            Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=cart",
                    "sa", "sa");

            String sql = "select * from product order by pid desc";
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Product product = new Product();
                int id = rs.getInt(1);
                String name = rs.getString(2);
                float price = rs.getFloat(3);

                product.setPid(id);
                product.setName(name);
                product.setPrice(price);
                products.add(product);

            }

            ps.close();
            c.close();

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return products;
    }

}
