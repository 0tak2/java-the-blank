package theblank.blank2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MenuCommon {
	private String menuName;
	private String menuComment;
	private int menuPrice;
	private String menuRegion;
	
	public MenuCommon() {
	}

	public MenuCommon(String menuName, String menuComment, int menuPrice, String menuRegion) {
		super();
		this.menuName = menuName;
		this.menuComment = menuComment;
		this.menuPrice = menuPrice;
		this.menuRegion = menuRegion;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuComment() {
		return menuComment;
	}

	public void setMenuComment(String menuComment) {
		this.menuComment = menuComment;
	}

	public int getMenuPrice() {
		return menuPrice;
	}

	public void setMenuPrice(int menu) {
		this.menuPrice = menu;
	}

	public String getMenuRegion() {
		return menuRegion;
	}

	public void setMenuRegion(String menuRegion) {
		this.menuRegion = menuRegion;
	}
}

class MenuUS {
	private String menuRegion;
	private String menuNameLocal;
	private int menuPriceLocal;
	
	____
}

class MenuKR {
	private String menuRegion;
	private String menuNameLocal;
	private int menuPriceLocal;
	
	____
}

class TestStup2 {
	public ArrayList<MenuCommon> getMenuList() {
		ArrayList<MenuCommon> list = new ArrayList<MenuCommon>();
		
		list.add(new MenuUS("BigMac", "Big Big One", 5, "Big Mac", 5));
		list.add(new MenuUS("SangsChiCom", "Spicy...", 4, "SangsChiCom", 4));
		list.add(new MenuUS("1955", "better than Big Mac", 6, "more than Big Mac", 6));
		list.add(new MenuKR("BulgogiBurger", "Inspired By Korean Food", 3, "불고기버거", 3500));
		list.add(new MenuKR("SaewooBurger", "better than lotteria", 3, "새우버거", 3500));
		
		return list;
	}
}


public class Blank24 {

	public static void main(String[] args) {
		List<MenuCommon> list = new TestStup2().getMenuList();
		
		System.out.println("맥도날드 전사 메뉴정보조회");
		System.out.print ("검색할 메뉴 이름을 입력해주세요. > ");
		
		Scanner sc = new Scanner(System.in);
		
		String query = null;
		while(!(query = sc.next()).equals("exit")) {
			for (MenuCommon menu : list) {
				if (query.equals(menu.getMenuName())) {
					System.out.println("Name: " + menu.getMenuName());
					System.out.println("Comment: " + menu.getMenuComment());
					System.out.println("Price(US): " + menu.getMenuPrice());
					
					____
					
					break;
				}
			}
		}
	}
}

//맥도날드 전사 메뉴정보조회
//검색할 메뉴 이름을 입력해주세요. > BulgogiBurger
//Name: BulgogiBurger
//Comment: Inspired By Korean Food
//Price(US): 3
//Region Code: KR
//Name(Local): 불고기버거
//Price(Local): 3500원
