package in.kanha.dto;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(101);
        System.out.println(employee.getId());
        employee.setName("Kanha");
        System.out.println(employee.getName());
        System.out.println(employee);
    }
}
