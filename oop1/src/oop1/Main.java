package oop1;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		//SETTING Value
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitsInStock(3);
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setImageUrl("Bilmemne.jpg");
		//GETTING Value
		System.out.println(product1.getName());
		
		Product product2 = new Product("SMEG Kahve", 4500, 9, "bilmemne.jpg", 4);
		System.out.println(product2.getName());
		
		Product[] products = {product1, product2};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		// individual customer class ici bos olmasina ragmen Customer classindan 
		// inherit aldigindan customere ait methodlar ve fieldlara ulasabiliriz
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(0);
		individualCustomer.setPhone("0120012");
		individualCustomer.setCustomNumber("12345");
		individualCustomer.setFirstName("Huseyin");
		individualCustomer.setLastName("Demirel");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(1);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("055555555");
		corporateCustomer.setTaxNumber("00000");
		corporateCustomer.setCustomNumber("2345");
		
		// ikisi de Customer class'tan extend ettiginden bu sekilde array icerisinde tutulabiliyor.
		Customer[] customers = {individualCustomer, corporateCustomer};
	}
}
