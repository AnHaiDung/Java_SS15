package btth.business;

import btth.model.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductServiceImpl implements IProductService{
    private static final List<Product> list = new ArrayList<>();

    static {
        list.add(new Product("P001","Iphone 14",500,99,"zin",new Date()));
        list.add(new Product("P002","Iphone 15",600,99,"zin",new Date()));
        list.add(new Product("P003","Iphone 16",800,99,"zin",new Date()));
    }

    @Override
    public List<Product> findAll() {
        return list;
    }

    @Override
    public void add(Product product) {
        list.add(product);
        System.out.println("Thêm sản phẩm thành công");
    }
}
