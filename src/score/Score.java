package score;

import java.util.Scanner;

public class Score {

	//�ν��Ͻ� ����
	int inwon;//������ 1���� ������
	
	//���ڵ�(Ŭ����)��� Ÿ���� �ڷḦ �����ϴ� rec��� ����
	//Record rec;//���ڵ尪 1���� ������(7���� ��������� ����)
	Record[] rec;//�迭�ȿ� Ŭ���� ���� ������ �� �ִ�.
	Scanner sc = new Scanner(System.in);
	public void set() {
		
	
		do {
			System.out.print("�ο���?");//3
			inwon = sc.nextInt();
		}while(inwon<1|| inwon>10);
		
		rec = new Record[inwon];
	}
	
	public void input() {

		for(int i = 0; i<inwon; i++) {
			rec[i] = new Record();
			
			System.out.print("�̸�?");//suzi
			rec[i].name = sc.next();
			
			System.out.print("����?");//30
			rec[i].kor = sc.nextInt();
			
			System.out.print("����?");//40
			rec[i].eng = sc.nextInt();
			
			System.out.print("����?");//50
			rec[i].mat = sc.nextInt();
			
			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			
			rec[i].ave = rec[i].tot / 3;
		}
		
	}
	
	private void ranking() {
		int i,j;
		
		//rec �迭�� rank�� �⺻�� 1�� ����: �ʱ�ȭ
		for(i=0; i<inwon; i++) {
			rec[i].rank = 1;
		}
		
		//�������ϱ�(i�� j�� ��)
		for(i=0; i<inwon-1; i++) {
			for(j=i+1; j<inwon; j++) {
				if(rec[i].tot > rec[j].tot) {
					rec[j].rank++;
				}else if(rec[i].tot<rec[j].tot) {
					rec[i].rank++;
				}
			}
		}
		
		
	}
	
	public void print() {
		ranking();//�޼ҵ忡�� �޼ҵ� ȣ��
		
		for(int i=0; i<inwon; i++) {
			System.out.printf("%6s",rec[i].name);
			System.out.printf("%4d",rec[i].kor);
			System.out.printf("%4d",rec[i].eng);
			System.out.printf("%4d",rec[i].mat);
			System.out.printf("%4d",rec[i].tot);
			System.out.printf("%4d",rec[i].ave);
			System.out.printf("%4d\n",rec[i].rank);
		}
	}
	
}
