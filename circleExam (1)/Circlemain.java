package circleExam;

public class Circlemain {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		c1.setRadius(5.0);
		System.out.println("������ : " + c1.getRadius());
		System.out.println("���� ���� : "+ c1.computeArea());
		System.out.println("���� �ѷ� : " + c1.computePerimeter());
		Circle c2 = new Circle(8.0);
		System.out.println("������ : " + c2.getRadius());
		System.out.println("���� ���� : "+ c2.computeArea());
		System.out.println("���� �ѷ� : " + c2.computePerimeter());
		// TODO Auto-generated method stub

	}

}
