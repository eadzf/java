package ifexample;

public class Iftest01 {

	public static void main(String[] args) {
		// ���ǹ� if
		int score = 100;
		
		if(score >=90) {
			System.out.println("������ %d���Դϴ�\n");
			System.out.println("����� A�Դϴ�");
		}else if(score >=80) {
			System.out.println("������80~89�Դϴ�");
			System.out.println("����� B�Դϴ�");
		}else if(score >=70) {
			System.out.println("������70~79�Դϴ�");
			System.out.println("����� C�Դϴ�");
		}else if(score >=60) {
			System.out.println("������60~69�Դϴ�");
			System.out.println("����� D�Դϴ�");
		}else if(score < 60) {
			System.out.println("������50~59�Դϴ�");
			System.out.println("����� E�Դϴ�");
		}

	}

}
