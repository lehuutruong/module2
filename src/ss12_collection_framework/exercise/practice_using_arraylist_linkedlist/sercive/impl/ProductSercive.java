package ss12_collection_framework.exercise.practice_using_arraylist_linkedlist.sercive.impl;

import ss12_collection_framework.exercise.practice_using_arraylist_linkedlist.model.Product;
import ss12_collection_framework.exercise.practice_using_arraylist_linkedlist.sercive.IProduct;

import java.util.*;

public class ProductSercive implements IProduct {
private static Scanner scanner=new Scanner(System.in);
private static List<Product>productList=new ArrayList<>();
    @Override
    public void addProduct() {
      Product product=this.inforProduct();
       productList.add(product);
        System.out.println("thêm sản phẩm thành công");
    }

    @Override
    public void editProduct() {
     Product product=this.findProduct();
        if(product==null){
            System.out.println("không có sản phẩm");
            return;
        }
     do{
         System.out.println("----------------------------------");
         System.out.println("Sản phẩm cần chỉnh sửa");
         System.out.println(product.toString());
         System.out.println("Bạn muốn chỉnh sửa nội dung nào");
         System.out.println("1.Id");
         System.out.println("2.Tên sản phẩm");
         System.out.println("3.Giá tiền");
         System.out.println("4.Thoát");
         System.out.println("chọn nội dung cần chỉnh sửa 1-4");
        int  choose=Integer.parseInt(scanner.nextLine());
         switch (choose) {
             case 1:
                 product.setId(Integer.parseInt(getEditInfor("id")));
                 break;
             case 2:
                 product.setNameProduct(getEditInfor("tên"));
                 break;
             case 3:
                 product.setPrice(Float.parseFloat(getEditInfor("giá tiền")));
                 break;
             case 4:
                 return;
         }
         System.out.println("chỉnh sửa thành công");
         System.out.println("bạn có muốn tếp tục chỉnh sửa ");
         System.out.println("1-có          2-hoàn tất");
         choose=Integer.parseInt(scanner.nextLine());
         if(choose!=1){
             return;
         }
     } while (true);

    }

    @Override
    public void deleteProduct() {
        Product product=this.findProduct();
        if(product==null){
            System.out.println("không tìm thấy đối tượng cần xóa");
        }
        else{
            System.out.println("bạn có chắc chắn xóa đối tượng có id là"+product.getId()+"không?");
            System.out.println("1.có");
            System.out.println("2.không");
            int choice=Integer.parseInt(scanner.nextLine());
            if(choice==1){
                productList.remove(product);
                System.out.println("xóa thành công");
            }
        }
    }

    @Override
    public void displayProduct() {
        for (Product product:productList) {
            System.out.println(product);

        }
    }
    public String getEditInfor(String editContent){
        System.out.println("vui lòng nhập lại "+editContent+"mới:");
        return scanner.nextLine();
    }

    @Override
    public void searchProduct() {
   Product product=inforProduct();

    }

    @Override
    public void sortProduct() {
        System.out.println("1.Sắp xếp theo giá tăng dần");
        System.out.println("2.Sắp xếp theo giá giảm dần");
        int choice=Integer.parseInt(scanner.nextLine());
        if(choice==1){
            Collections.sort(productList);
        }
       else
        if (choice==2){
           Collections.sort(productList);
           Collections.reverse(productList);
        }
        else {
            System.out.println("bạn nhập số không đúng");
        }
    }
    public Product inforProduct(){
        System.out.println("Mời bạn nhập id: ");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập tên: ");
        String name=scanner.nextLine();
        System.out.println("Mời bạn nhập giá tiền");
        float price=Float.parseFloat(scanner.nextLine());
         Product product=new Product(id,name,price);
         return product;
    }
    public Product findProduct(){
        System.out.println("mời bạn nhập vào id cần xóa");
        int id=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <productList.size() ; i++) {
            if(productList.get(i).getId()==id){
                return productList.get(i);
            }
        }
        return null;
    }
}
