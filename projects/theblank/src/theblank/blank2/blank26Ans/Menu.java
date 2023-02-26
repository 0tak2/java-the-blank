package theblank.blank2.blank26Ans;

public class Menu {
	private String menuName;
	private String menuComment;
	private int menuPrice;
	
	private Localization localization;
	private Coupon coupon;
	
	public Menu() {
	}

	public Menu(String menuName, String menuComment, int menuPrice) {
		super();
		this.menuName = menuName;
		this.menuComment = menuComment;
		this.menuPrice = menuPrice;
	}
	
	public Menu(String menuName, String menuComment, int menuPrice, Localization localization) {
		this(menuName, menuComment, menuPrice);
		this.localization = localization;
	}

	public Menu(String menuName, String menuComment, int menuPrice, Localization localization, Coupon coupon) {
		this(menuName, menuComment, menuPrice, localization);
		this.coupon = coupon;
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

	public Localization getLocalization() {
		return localization;
	}

	public void setLocalization(Localization localization) {
		this.localization = localization;
	}

	public Coupon getCoupon() {
		return coupon;
	}

	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}
}