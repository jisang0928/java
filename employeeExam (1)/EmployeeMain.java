package employeeExam;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("�̵���");
		e1.setNo(100);
		e1.setAge(25);
		
		System.out.println("[���� ����"+ e1.toString());
		
		Employee e2 = new Employee("������", 200, 18);
		System.out.println("[���� ����"+ e2.toString());
		
		e1.setNo(300);
		System.out.println(e1.getName() + "���� �����" + e1.getNo() + "���� �����.");
		System.out.println("[���� ����"+ e1.toString());
		
		
		e2.setNo(20);
		System.out.println(e1.getName() + "���� ���̰�" + e2.getAge() + "���� �����.");
		System.out.println("[���� ����"+ e2.toString());
	}

}
