package association;

public class CarApp {

	public static void main(String[] args) {
		//���� ����
		Engine engine = new Engine();
		//engine.engineDisplay();
		//���� ����
		engine.setFualType("����");
		engine.setDisplacement(2900);
		
		
		
		//�ڵ��� ����
		Car carOne = new Car();
		//carOne.carDisplay();
		
		carOne.setModelName("�׽���");
		carOne.setProductionYear(2018);
		//�ڵ����� ���� ���� - Setter �޼ҵ带 ȣ���Ͽ� ���� ���� ����
		carOne.setCarEngine(engine);
		carOne.carDisplay();	
		System.out.println("---------------------------");
		//�ڵ��� ���� - ���� ����
		//�����ڸ� �̿��Ͽ� ���� ���� ����
		Car carTwo = new Car("����", 2020, new Engine("�ֹ���", 3000));
		
		System.out.println("---------------------------");
		carTwo.carDisplay();
		System.out.println("---------------------------");
		System.out.println(carOne.getModelName()+"�� ���� ���� >> ");
		engine.engineDisplay();
		System.out.println("---------------------------");
		System.out.println(carTwo.getModelName()+"�� ���� ���� >> ");
		//carTwo.getCarEngine() : ���� �ʵ忡 �ִ� ���� �ν��Ͻ� ��ȯ
		//��ȯ���� ���� ������ �ν��Ͻ��� �̿��Ͽ� �޼ҵ� ȣ��
		carTwo.getCarEngine().engineDisplay();
		System.out.println("---------------------------");

	}

}
