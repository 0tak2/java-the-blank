package theblank.blank2.blank26Ans;

public class Coupon25 extends Coupon {

	@Override
	public double calcCouponPrice(Menu menu) {
		return menu.getMenuPrice() * 0.75;
	}

}
