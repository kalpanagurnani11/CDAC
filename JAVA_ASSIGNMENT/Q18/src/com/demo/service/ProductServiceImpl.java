package com.demo.service;



import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;
import com.demo.model.Product;

public class ProductServiceImpl
        implements ProductService {

    ProductDao dao =
            new ProductDaoImpl();

    public void addProduct(Product p){
        dao.addProduct(p);
    }

    public void deleteProduct(int id){
        dao.deleteProduct(id);
    }

    public void updateProduct(Product p){
        dao.updateProduct(p);
    }

    public void displayAll(){
        dao.displayAll();
    }

    public void displayById(int id){
        dao.displayById(id);
    }

    public void displayQtyGreaterThan(int qty){
        dao.displayQtyGreaterThan(qty);
    }
}