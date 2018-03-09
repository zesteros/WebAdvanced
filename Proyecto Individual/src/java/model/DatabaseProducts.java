/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.entities.Product;

/**
 *
 * @author Angelo
 */
public class DatabaseProducts extends DatabaseDriver {
    
    public final String[] COLUMN_NAMES = {
        "ProductID",
        "ProductName",
        "Description",
        "SuggestedPrice",
        "BuyPrice",
        "UnitsInStock",
        "UnitsInOrder",
        "SKU",
        "Scale",
        "CategoryID",
        "SupplierID",
        "Image"
    };
    
    public final String GET_ALL_PRODUCTS_QUERY = "SELECT * FROM products;";

    public ArrayList<Product> getProducts() {
        connect();
        ArrayList<Product> products = new ArrayList();
        Statement query;
        try {
            query = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = query.executeQuery(GET_ALL_PRODUCTS_QUERY);
            while(rs.next()){
                Product product = new Product();
                product.setProductID(rs.getInt(COLUMN_NAMES[0]));
                product.setProductName(rs.getString(COLUMN_NAMES[1]));
                product.setDescription(rs.getString(COLUMN_NAMES[2]));
                product.setSuggestedPrice(rs.getFloat(COLUMN_NAMES[3]));
                product.setBuyPrice(rs.getFloat(COLUMN_NAMES[4]));
                product.setStock(rs.getFloat(COLUMN_NAMES[5]));
                product.setOrdered(rs.getFloat(COLUMN_NAMES[6]));
                product.setSku(rs.getString(COLUMN_NAMES[7]));
                product.setScale(rs.getString(COLUMN_NAMES[8]));
                product.setCategoryId(rs.getInt(COLUMN_NAMES[9]));
                product.setCategoryName(getCategoryNameFromID(product.getCategoryId()));
                product.setSupplierId(rs.getInt(COLUMN_NAMES[10]));
                product.setSupplierName(getSupplierNameFromID(product.getSupplierId()));
                product.setImage(rs.getString(COLUMN_NAMES[11]));
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
return null;
    }

    private String getCategoryIDFromName(int categoryId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getCategoryNameFromID(int categoryId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getSupplierNameFromID(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
