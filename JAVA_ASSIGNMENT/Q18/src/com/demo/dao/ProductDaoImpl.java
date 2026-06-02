package com.demo.dao;



import java.sql.*;

import com.demo.model.Product;
;

public class ProductDaoImpl implements ProductDao {

    @Override
    public void addProduct(Product p) {

        String sql =
                "insert into product values(?,?,?,?)";

        try(Connection con = DBUtil.getConnection();
            PreparedStatement ps =
                    con.prepareStatement(sql)) {

            ps.setInt(1, p.getProductId());
            ps.setString(2, p.getPname());
            ps.setDouble(3, p.getPrice());
            ps.setInt(4, p.getQty());

            ps.executeUpdate();

            System.out.println("Product Added");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteProduct(int id) {

        String sql =
                "delete from product where productid=?";

        try(Connection con = DBUtil.getConnection();
            PreparedStatement ps =
                    con.prepareStatement(sql)) {

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Product Deleted");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateProduct(Product p) {

        String sql =
                "update product set pname=?,price=?,qty=? where productid=?";

        try(Connection con = DBUtil.getConnection();
            PreparedStatement ps =
                    con.prepareStatement(sql)) {

            ps.setString(1, p.getPname());
            ps.setDouble(2, p.getPrice());
            ps.setInt(3, p.getQty());
            ps.setInt(4, p.getProductId());

            ps.executeUpdate();

            System.out.println("Product Updated");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayAll() {

        String sql = "select * from product";

        try(Connection con = DBUtil.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql)) {

            while(rs.next()) {
                System.out.println(
                        rs.getInt(1)+" "
                      + rs.getString(2)+" "
                      + rs.getDouble(3)+" "
                      + rs.getInt(4));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayById(int id) {

        String sql =
                "select * from product where productid=?";

        try(Connection con = DBUtil.getConnection();
            PreparedStatement ps =
                    con.prepareStatement(sql)) {

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                System.out.println(
                        rs.getInt(1)+" "
                      + rs.getString(2)+" "
                      + rs.getDouble(3)+" "
                      + rs.getInt(4));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayQtyGreaterThan(int qty) {

        String sql =
                "select * from product where qty>?";

        try(Connection con = DBUtil.getConnection();
            PreparedStatement ps =
                    con.prepareStatement(sql)) {

            ps.setInt(1, qty);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                System.out.println(
                        rs.getInt(1)+" "
                      + rs.getString(2)+" "
                      + rs.getDouble(3)+" "
                      + rs.getInt(4));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}