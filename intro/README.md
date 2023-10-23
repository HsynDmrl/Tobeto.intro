# Kredi Hesaplama Uygulaması

Bu Java programı, kredi hesaplamaları ve döviz kuru değişimlerini izlemek için kullanılan bir örnek uygulamadır.

## Proje Açıklaması

Bu proje, kredi ve döviz kuru verilerini işleyen temel değişkenleri içerir:

- `ortaMetin` ve `altMetin`: İlgili metin verilerini içeren `String` değişkenler.
- `vade`: Kredi vadesini saklayan bir tamsayı.
- `dlrDun` ve `dlrBugun`: Dolar kurunu temsil eden ondalık sayılar.
- `dolarDustuMu`: Doların değerinde bir düşüş olup olmadığını belirleyen bir boolean değişken.
- `okYonu`: Doların değişim yönünü (yükselme, düşme, eşit) belirlemek için kullanılan bir `String`.

## Koşullu İfadeler

Program, döviz kuru değişikliklerini izlemek için bir dizi koşullu ifade içerir. Değişen kur değerlerine göre, `okYonu` değişkeni ayarlanır ve sonucu ekrana yazdırır.

```java
if (dlrBugun < dlrDun) {
    okYonu = "down.swg"; 
    System.out.println(okYonu);
}
else if (dlrBugun == dlrDun) {
    okYonu = "equal.swg"; 
    System.out.println(okYonu);
}
else {
    okYonu = "up.swg"; 
    System.out.println(okYonu);
}
