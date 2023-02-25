package theblank.blank2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Menu {
	____
}

class TestStup {
	public ArrayList<Menu> getMenuList() {
		ArrayList<Menu> list = new ArrayList<Menu>();
		
		list.add(new Menu("빅맥", "우리가게 시그니쳐~~", 5000));
		list.add(new Menu("상스치콤", "매콤한 치킨버거~", 4000));
		list.add(new Menu("1955", "난빅맥보다이게더조아", 6000));
		list.add(new Menu("애플파이", "빼먹으면섭섭하자너", 3000));
		list.add(new Menu("맥너겟", "가끔 쿠폰주면 사묵지", 2500));
		
		return list;
	}
}


public class Blank22 {

	public static void main(String[] args) {
		List<Menu> list = new TestStup().getMenuList();
		
		System.out.println("지금은 한 1985년쯤... 이 프로그램은 미국맥도날드의 메뉴정보질의프로그램입니다..");
		System.out.print ("검색할 메뉴 이름을 입력해주세요. > ");
		
		Scanner sc = new Scanner(System.in);
		
		String query = null;
		while(!(query = sc.next()).equals("exit")) {
			for (____) {
				____
			}
		}
	}
}

