package scanner;

import java.util.Scanner;

public class Scaaner_Ex {

	public static void main(String[] args) {
		//출력타입 변수명 = new 출력타입();
		Register r = new Register(); 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===== 코리아아이티 회원가입 =====");
		System.out.print("아이디 입력 > ");
		String uid = sc.next();
		
		System.out.print("비밀번호 입력 > ");
		String pwd = sc.next();
		
		System.out.print("이름입력 : ");
		String uname = sc.next();
		
		r.setUserid(uid);
		r.setPasswd(pwd);
		r.setUsername(uname);
		
		
		System.out.println();
		System.out.println("===== 코리아아이티 회원가입 목록 =====");
		System.out.println("사용자명 : " + r.getUsername());
		System.out.println("아이디 : " + r.getUserid());
		System.out.println("비밀번호 : " + r.getPasswd());
		

		

	}

}
