# Ürün ve Müşteri Yönetim Uygulaması

Bu Java projesi, temel olarak ürün ve müşteri bilgilerini yöneten bir uygulamadır.

## Proje Açıklaması

`Main` sınıfı, ürün ve müşteri bilgilerini işlemek için temel bir yapıya sahiptir.

### Ürün İşlemleri

1. `Product` sınıfı, ürün özelliklerini temsil eder. Ürünün adı, stok miktarı, indirim oranı, birim fiyatı ve resim URL'si gibi bilgileri içerir.

2. `product1` ve `product2` adlı iki farklı ürün örneği oluşturulur. Bunlar, farklı şekillerde değerler atanarak oluşturulmuşlardır.

3. `products` adlı bir ürün dizisi oluşturularak bu ürünler bu diziye eklenir.

### Ürün Listesi

`for-each` döngüsü kullanılarak ürünlerin listesi HTML formatında ekrana yazdırılır.

### Müşteri İşlemleri

1. `IndividualCustomer` ve `CorporateCustomer` sınıfları, müşteri türlerini temsil eder. Her ikisi de `Customer` sınıfından kalıtım alır ve bu sayede müşteriye özgü bilgilere ulaşabilirler.

2. `individualCustomer` ve `corporateCustomer` adlı iki farklı müşteri örneği oluşturulur. Bu örneklerin her biri, ilgili müşteri tipine özgü bilgilerle doldurulur.

3. `customers` adlı bir müşteri dizisi oluşturularak bu müşteriler bu diziye eklenir.

## Kod Örnekleri

Aşağıda, proje içerisinde kullanılan temel Java kod örneklerini bulabilirsiniz:

```java
Product product1 = new Product();
product1.setName("Delonghi Kahve Makinesi");
product1.setUnitsInStock(3);
// ... Diğer ürün özelliklerinin ayarlanması ...

Product product2 = new Product("SMEG Kahve", 4500, 9, "bilmemne.jpgd", 4);
// ... Diğer ürün özelliklerinin ayarlanması ...

Product[] products = {product1, product2};

for (Product product : products) {
    System.out.println("<li>" + product.getName() + "</li>");
}

IndividualCustomer individualCustomer = new IndividualCustomer();
// ... Müşteri bilgilerinin ayarlanması ...

CorporateCustomer corporateCustomer = new CorporateCustomer();
// ... Müşteri bilgilerinin ayarlanması ...

Customer[] customers = {individualCustomer, corporateCustomer};
