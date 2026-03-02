package btth.run;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import btth.business.IProductService;
import btth.business.ProductServiceImpl;
import btth.model.Product;


public class ProductView {
    private static final IProductService productService = new ProductServiceImpl();
    public static void showProductMenu(Scanner sc){
        while (true){
            System.out.println("""
                    +--------------------MENU-------------------+
                    |1. Hiển thị danh sách sản phẩm             |
                    |2. Thêm mới sản phẩm                       |
                    |3. Cập nhật thông tin sản phẩm             |
                    |4. Xóa sản phẩm                            |
                    |5. Lọc sản phẩm                            |
                    |6. Sắp xếp sản phẩm                        |
                    |7. Thoát                                   |
                    +-------------------------------------------+
                    """);
            System.out.println("Nhap lua chọn");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    showListProduct();
                    break;
                case 2:
                    addListProduct();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("không thuộc menu");
            }

        }
    }

    private static void showListProduct(){
        List<Product> list = productService.findAll();

        if (list.isEmpty()) {
            System.err.println("Khong có san pham nao !!!");
            return;
        }
        // in tieieu đề
        System.out.printf("+%s+%s+%s+%s+%s+%s+\n",
                "-".repeat(6),
                "-".repeat(27),
                "-".repeat(12),
                "-".repeat(7),
                "-".repeat(12),
                "-".repeat(22)
        );
        System.out.printf("| %-4s | %-25s | %-10s | %-5s | %-10s | %-20s |\n",
                "ID", "Name", "Price", "Stock", "Desc", "Created At"
        );
        System.out.printf("+%s+%s+%s+%s+%s+%s+\n",
                "-".repeat(6),
                "-".repeat(27),
                "-".repeat(12),
                "-".repeat(7),
                "-".repeat(12),
                "-".repeat(22)
        );


        for (Product p : list){
            System.out.print(p);
        }

        System.out.printf("+%s+%s+%s+%s+%s+%s+\n",
                "-".repeat(6),
                "-".repeat(27),
                "-".repeat(12),
                "-".repeat(7),
                "-".repeat(12),
                "-".repeat(22)
        );
    }
    private static void addListProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID sản phẩm: ");
        String id = sc.nextLine().trim();
        if (id.isEmpty()) {
            System.err.println("ID không được để trống");
            return;
        }

        List<Product> products = productService.findAll();
        for (Product p : products) {
            if (p.getId().equalsIgnoreCase(id)) {
                System.err.println("ID sản phẩm đã tồn tại");
                return;
            }
        }

        System.out.print("Nhập tên sản phẩm: ");
        String name = sc.nextLine().trim();
        if (name.isEmpty()) {
            System.err.println("Tên không được để trống");
            return;
        }

        System.out.print("Nhập giá : ");
        double price;
        price = Double.parseDouble(sc.nextLine().trim());
        if (price <= 0) {
            System.err.println("Giá phải lớn hơn 0!");
            return;
        }

        System.out.print("Nhập số lượng tồn kho: ");
        int stock;
        stock = Integer.parseInt(sc.nextLine().trim());
        if (stock < 0) {
            System.err.println("Số lượng tồn kho không được âm!");
            return;
        }

        System.out.print("Nhập mô tả: ");
        String description = sc.nextLine().trim();

        Product newProduct = new Product(id, name, price, stock, description, new Date());

        productService.add(newProduct);
    }
}
