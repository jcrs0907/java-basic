package basic;

public class IfApp {

	public static void main(String[] args) {
		int num = 10;
		
		//�������� Ȧ���� ¦���� �����Ͽ� ���
		if(num%2 != 0) {
			System.out.println(num+">> Ȧ��");
		}else {
			System.out.println(num+">> ¦��");
		}
		System.out.println("================================================");
		char mun = '0';
		
		//�������� ������ �Ǵ� �񿵹��ڷ� �����Ͽ� ���
		if(mun >= 'A' && mun<='Z' || mun>='a' && mun<='z') {
			System.out.println("[���]"+mun+">> ������");
		}else{
			System.out.println("[���]"+mun+">> �񿵹���");
		}
		System.out.println("============================");
		
		int jumsu = 188;
		//�������� 0~100 ������ ��ȿ���� �ƴ��� �����Ͽ� ��� - ��ȿ�� �˻�
		
		if(jumsu >= 0 && jumsu <= 100) {
			//�������� ���� ����� �����Ͽ� ���
			//100~90 : A, 89~80 : B, 79~70 : c, 69~60 : D, 59~0 : F
			
			//null character : ���ڰ��� �������� �ʴ� ����
//			char grade = '\0'; //������ �����ϱ� ���� ����
//			
//			if(jumsu <= 100 && jumsu >= 90) {
//				grade = 'A';
//			}else if(jumsu <= 89 && jumsu >= 80) {
//				grade = 'B';
//			}else if(jumsu <= 79 && jumsu >= 70) {
//				grade = 'c';
//			}else if(jumsu <= 69 && jumsu >= 60) {
//				grade = 'D';
//			}else if(jumsu <= 59 && jumsu >= 0) {
//				grade = 'F';
//			}
			
			char grade;
			if(jumsu >= 90) {
				grade = 'A';
			}else if(jumsu >= 80) {
				grade = 'B';
			}else if(jumsu >= 70) {
				grade = 'c';
			}else if(jumsu >= 60) {
				grade = 'D';
			}else {
				grade = 'F';
			}
			
			System.out.println(grade+ jumsu);
		}else {
			System.out.println("[���] 0~100 ������ ��� ���������� ���� �Է� �Ǿ����ϴ�.");
		}
	}

	//ctrl shift f -> beautify
	
}
