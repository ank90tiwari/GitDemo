package com.d4.InnerClasses;
class Discounts
{
	public void Discount10per() {
		System.out.println("10% discount on all products");
	}
	public void Discount20per() {
		System.out.println("20% discount on all products");
	}
	public void Discount30per() {
		System.out.println("30% discount on all products");
	}
	public void Discount40per() {
		System.out.println("40% discount on all products");
	}
	
}
//class ChritsmasOffer extends Discounts
//{
//	@Override
//	public void Discount40per() {
//		System.out.println("50% discount on all products");
//	}
//	
//}
class AnonymousClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Discounts croffer=new Discounts()
		{
			public void Discount30per() {
				System.out.println("90% discount on all products + gifts");
			}
			public void Discount40per() {
				System.out.println("100% discount on all products + gifts ");
			}
		};
		croffer.Discount30per();
		croffer.Discount40per();
		System.out.println(croffer.getClass().getName());

	}

}
