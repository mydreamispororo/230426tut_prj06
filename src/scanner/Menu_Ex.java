package scanner;

import java.util.Scanner;


public class Menu_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		

		while(run) { //무한반복, 프로그램 누가 언제 사용할 지 모르기에 계속 실행 
			System.out.println("========== 코리아아이티 그룹웨어 ==========");
			System.out.println("---------- 아래 메뉴를 선택하세요 ----------");
			System.out.println("1. 회원가입  2. 회원조회  3. 회원수정  4. 회원삭제  5. 종료");
			System.out.println("---------------------------------------------------");
			System.out.print("Enter your Choice Number > ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("회원가입을 진행합니다.");
				System.out.println();
				break;
			
			case 2:
				System.out.println("회원정보를 조회합니다.");
				System.out.println();
				break;
				
			case 3:
				System.out.println("회원정보를 수정합니다.");
				System.out.println();
				break;
				
			case 4:
				System.out.println("회원정보를 삭제합니다.");
				System.out.println();
				break;
				
			default:
				System.out.println("시스템을 종료합니다.");
				System.out.println();
				System.exit(0);
			
			}
			
		}
			
	}

}
