package oop;


//������ ������ Ŭ���� - �ν��Ͻ�(��ü) ������ ���� Ŭ����
public class Method {
	//Ŭ������ �����ϸ� Ŭ���� ���ο��� �Ű������� ���� ������(Default Constructor)��
	//����� ������ ó��
	
	//�޼ҵ� ����
	void displayOne() {//�� �޼��带 ȣ���ؼ� ��� ����� ����.
		System.out.println("Method Ŭ������ displayOne() �޼��� ȣ��");
	}
	
	void displayTwo() {//�� �޼��带 ȣ���ؼ� ��� ����� ����.
		System.out.println("Method Ŭ������ displayTwo() �޼��� ȣ��");
	}
	
	void printOne() {
		int tot=0;
		for(int i=1; i<=100; i++) {
			tot += i;
		}
		System.out.println("1~100 ������ �������� �հ� = " + tot);
	}
	
	void printTwo(int num) {
		
		if(num<=0) {
			System.out.println("[����] �Ű��������� 0���� ū ���� ���޵Ǿ�� �˴ϴ�.");
			return;
		}
		int tot=0;
		for(int i=1; i<=num; i++) {
			tot += i;
		}
		System.out.println("1~"+num+"������ �������� �հ� = " + tot);
	}
	
	void printThree(int num1, int num2) {//�ڷ����� ���� �ʰ� ����ϸ� ����
		/*
		if(num1>num2) {
			System.out.println("[����]ù��° �Ű������� ���޵� ���� �ι�° �Ű������� ���޵� ������ �۾ƾ� �˴ϴ�.");
			return;
		}
		*/
		
		if(num1>num2) {//ġȯ�Ͽ� ���
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		int tot=0;
		for(int i=num1; i<=num2; i++) { 
			tot += i;
		}
		System.out.println(num1+"~"+num2+"������ �������� �հ� = " + tot);
	}
	
	int returnTot(int num1, int num2) {
		if(num1>num2) {//ġȯ�Ͽ� ���
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		int tot=0;
		for(int i=num1; i<=num2; i++) { 
			tot += i;
		}
		
		//������ ����� ���� �޼ҵ� ����� ��ȯ
		//=> �޼ҵ��� ��ȯ���� ���� �ڷ����� ���� ��ȯ
		return tot;
	}
	
	//�Ű������� ���ߵ� �������� Ȧ���� ��� false,
	//¦���� ��� true�� ��ȯ�ϴ� �޼ҵ�
	boolean isOddEven(int num) {
		if(num%2!=0) {
			return false;
		}else {
			return true;
		}
	}
	
	//�Ű������� ��ü�� ���� �ްų� ��ü ��ȯ�� �����ϴ�
	String nameHello(String name) {//��ü ���޹޾� ����
		return name+"��. �ȳ��ϼ���.";
	}
	
	//�迭�� �ؽ��ڵ带 ��ȯ�ϴ� �޼���
	//�迭�� ��� ��Ұ� ��ȯ
	int[] returnArray() {
		/*
		int[] array = {10,20,30,40,50};
		return array;
		*/
		
		//return {10,20,30,40,50};//���� �����̰� �迭�� �ƴ�
		return new int[]{10,20,30,40,50}; //�迭�� ��ȯ
	}
	
	//3���� �Ű������� �������� ���� �޾� �հ踦 ����Ͽ� ��ȯ�ϴ� �޼ҵ�
	int sumOne(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	//�Ű������� �迭�� ���޹޾� �迭 ��Ұ��� �հ踦 ����Ͽ� ��ȯ�ϴ� �޼ҵ�
	int sumTwo(int[] num) {//�Ű� ������ �迭 ���
		int tot = 0;
		for(int temp:num) {
			tot += temp;//�迭 ��ҵ��� �հ踦 ���
		}
		return tot;
	}
	
	
	//�Ű� ���� ���� ��ȣ(...)�� ����� �Ű����� ������ ��� ���� 0�� �̻� ���޹޾�
	//�迭 �������� ��� ����
	int sumThree(int... num) {//�Ű� ������ ������ ����
		int tot = 0;
		for(int temp:num) {
			tot += temp;//�迭 ��ҵ��� �հ踦 ���
		}
		return tot;
	}
	
	
	
	
	
}
