package ifexample;

public class Iftest01 {

	public static void main(String[] args) {
		// 조건문 if
		int score = 100;
		
		if(score >=90) {
			System.out.println("점수는 %d점입니다\n");
			System.out.println("등급은 A입니다");
		}else if(score >=80) {
			System.out.println("점수가80~89입니다");
			System.out.println("등급은 B입니다");
		}else if(score >=70) {
			System.out.println("점수가70~79입니다");
			System.out.println("등급은 C입니다");
		}else if(score >=60) {
			System.out.println("점수가60~69입니다");
			System.out.println("등급은 D입니다");
		}else if(score < 60) {
			System.out.println("점수가50~59입니다");
			System.out.println("등급은 E입니다");
		}

	}

}
