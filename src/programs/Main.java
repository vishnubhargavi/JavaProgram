package programs;

public class Main {
    public static void main(String[] args) {
        Department department = new Department1(4);
        System.out.println(department.getDepartmentSize());


        Product product = new Product(8);
        System.out.println(product.getPrice());
        System.out.println(product.getPrice(2));


        Parent1 parent11 = new Parent1();
        parent11.message();
        Child child1 = new Child();
        child1.message();
        Parent1 parent2 = new Child();
        parent2.message();

}
}