package btth.business;

import btth.model.Product;

import java.util.List;

public interface IProductService {
    // định nghĩa các phương thức của menu chức năng
    List<Product> findAll();
    void add(Product product);
}
