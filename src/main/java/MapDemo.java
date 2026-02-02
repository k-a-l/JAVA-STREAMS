import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapDemo {

    private String name;
    private int age;
    private String department;
    private int salary;

    public MapDemo(String name, int age, String department, int salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        List<String> names = List.of("Ram", "Hari", "Sita", "Gita", "Mira");
        List<Integer> ages = List.of(20, 30, 40, 50, 60);
        List<String> departments = List.of("IT", "HR", "Finance", "IT", "HR");
        List<Integer> salaries = List.of(20000, 30000, 40000, 50000, 60000);
//List<MapDemo> demos = new ArrayList<>();
//    for(int i = 0; i < names.size(); i++) {
//        demos.add(new MapDemo(names.get(i), ages.get(i), departments.get(i), salaries.get(i)));
//    }

    List<MapDemo> employees = IntStream.range(0, names.size()).mapToObj(i -> new MapDemo(names.get(i), ages.get(i), departments.get(i), salaries.get(i))).collect(Collectors.toList());

    Optional<MapDemo> highestSalary = employees.stream().max(Comparator.comparing(MapDemo::getSalary));
    System.out.println(highestSalary.get().getName());

    highestSalary.ifPresent(employee -> System.out.println(employee.getName() + "" + employee.getAge()+ "" + employee.getSalary()+ "" +employee.getDepartment()));
highestSalary.filter(e -> e.getDepartment().equals("IT") || e.getDepartment().equals("HR")).ifPresent(employee -> System.out.println(employee.getName() + "" + employee.getAge()+ "" + employee.getSalary()));
    }

}
