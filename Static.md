## Static nedir ve nerelerde kullanılır?
* Static anahtar kelimesi nesnelere değil bizzat sınıflara aittir. Statik olarak tanımladığımız bir değişken programın çalışma süresi boyunca yaşar.
### Static anahtar kelimesini nerelerde kullanabiliriz
* Değişkenler (class variables)
* Yöntemler (class methods)
* Bloklar (blocks)
* İç içe geçmiş sınıflarda (nested class)
#### Java'daki statik anahtar kelimesi ağırlıklı olarak bellek yönetimi için kullanılır. Nedir bu bellek yönetimi ? Şöyle bir örnek vererek rutini koruyalım. Matematik işlemleri yapan bir math sınıfı yazıyorsunuz. Pi sayısının her zaman sabit ve durağan olması gerekmez mi ? Bu sebeple math sınıfınızda sınıf değişkeni olarak static olarak tanımlayabilirsiniz.
```java 
static final double PI = 3.141592653589793;
```
* Başka sınıflarda Pİ sayısını almak için tekrar tekrar nesne üretip boşuna belleği hunharca kullanmamıza gerek yoktur.
### Nerelerde kullanılmaz ?
* Yapılandırıcılarda (Constructor)
- Arayüzlerde (Interfaces) (Java 8 de interfacelerde kullanılıyor oldu)
+ İç Sınıf metodlarında (Inner Class methods)
+ Yerel değişkenlerde (Local Variables)
* Class (Not Nested)
- Method Local Inner Class(Difference then nested class)
+ Instance Variables
### Static Kullanmalı mıyız ? Kullanmamalı mıyız ? 
#### Static'lerin kullanımı hep tartılşılmıştır. Bir yandan avantaj sağlarken aslında bir yandan da dezavantaj mı sağlıyor? Evet, gerçekten de static kullanıma çok dikkat etmeliyiz, bunu tasarımsal olarak ele alınması gereklidir. Çünkü static kullanımı Nesne Yönelimli paradigmasına aykırıdır. Özellikle, Kapsülleme (Encapsulation) ilkesini ihlal eder.

### Static Örnek - 1
#### Static'ler compile olurken ilk bakılan anahtar kelimeler daha sonra nesnelere ve nesne değişkenlerine bakılır. İlk static alanlar bakıldıgından static içerisinde sadece staticler kullanılabilir. 
* Örneğin ;
```java
  class JavaExample {
   int a = 40; 
   public static void main(String args[])
   {
      System.out.println(a);
   }
}
```
* Yukarıdaki kod örneği derleme anında hata verecektir. "Cannot make a static reference to the non-static field a" uyarısı alınacaktır.
