## Stack
* Stack candır. Kullanımı kolaydır.
* Bilgisayarda RAM’de tutulur. Tıpkı Heap gibi.
* Oluşturulan değişkinler stack kapsamından çıkınca otomatik olarak yok edilir.
* Ulaşılması heap‘e göre oldukça hızlıdır.
* Stack üzerinde kullanım fazla olduğunda alan yeterli olmayabilir. Mesela 20 boyutlu bir diziye 21 eleman atamak gibi…
* Oluşturulan değişkenler pointer olmadan kullanılabilir.
* Derleme zamanında oluşturulur.
* Kullanacağınız yerin boyutunu tam olarak biliyorsanız Stack‘i kullanmak sizin için uygun olacaktır.
## Heap
* Heap biraz nazlıdır. Ama nazını çekerseniz oda sizin yükünüzü çeker.
* Bilgisayarda RAM’de tutulur.Tıpkı Stack gibi.
* Bir blok içerisinde oluşturulan heap değişkenler, bloğun dışına çıktığında otomatik olarak yok edilemez, bunun manuel olarak yapılması gerekir.
* Stack ile karşılaştırıldığında oldukça yavaştır.
* Doğru kullanılmaması durumunda bellek sorunları yaratır.
* Değişkenler pointer ile kullanılır.
* Çalışma zamanında oluşturulur.
* İhtiyacınız olan boyutu tam olarak bilmiyorsanız Heap kullanımı sizin için biçilmiş kaftandır.
