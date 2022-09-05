package equals;



public class Main{
public static void main(String[] args)
{
  Employee emp1 = new Employee();

  emp1.setId("001");
  emp1.setName("Dinuka");
  emp1.setCode("cc21");
  emp1.setAddress("Galle");
  emp1.setNic("12345678");

  System.out.println("Employee ID:"+emp1.getId());
  System.out.println("Employee Name:"+emp1.getName());
  System.out.println("Employee Code:"+emp1.getCode());
  System.out.println("Employee Address:"+emp1.getAddress());
  System.out.println("Employee Nic:"+emp1.getNic());
  System.out.println(" ");
  Employee emp2 = new Employee();

  emp2.setId("002");
  emp2.setName("Hiruni");
  emp2.setCode("cc23");
  emp2.setAddress("Matara");
  emp2.setNic("87654321");

  System.out.println("Employee ID:"+emp2.getId());
  System.out.println("Employee Name:"+emp2.getName());
  System.out.println("Employee Code:"+emp2.getCode());
  System.out.println("Employee Address:"+emp2.getAddress());
  System.out.println("Employee Nic:"+emp2.getNic());
  System.out.println(" ");

  Employee emp3 = new Employee();

  emp3.setId("003");
  emp3.setName("Yashodha");
  emp3.setCode("cc21");
  emp3.setAddress("Colombo");
  emp3.setNic("12368678");

  System.out.println("Employee ID:"+emp3.getId());
  System.out.println("Employee Name:"+emp3.getName());
  System.out.println("Employee Code:"+emp3.getCode());
  System.out.println("Employee Address:"+emp3.getAddress());
  System.out.println("Employee Nic:"+emp3.getNic());
  System.out.println(" ");
//memmory address
  System.out.println("Memmory Address");
  System.out.println(emp1.id== emp2.id);
  System.out.println(emp2.id== emp3.id);
  System.out.println(emp3.id== emp1.id);

  System.out.println(emp1.code== emp2.code);
  System.out.println(emp2.code== emp3.code);
  System.out.println(emp3.code== emp1.code);
  System.out.println(" ");

//value
  System.out.println("Value ");
  System.out.println(emp1.id.equals(emp2.id) );
  System.out.println(emp2.id.equals(emp3.id) );
  System.out.println(emp3.id.equals(emp1.id) );

  System.out.println(emp1.code.equals(emp2.code) );
  System.out.println(emp2.code.equals(emp3.code) );
  System.out.println(emp3.code.equals(emp1.code) );
}

}