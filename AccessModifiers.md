## Java Erişim Belirleyicileri
#### Erişim belirleyiciler adından da anlaşılacağı üzere bir sınıfın değişkenine ya da metoduna sınıfın içinden, sınıftan oluşturulmuş nesneden ve sınıftan kalıtılmış sınıflardan ulaşımın nasıl olacağını belirleyen kelimelerdir
* public
* protected
* private
* default
+ Görüldüğü üzere javada erişim belirleyicileri dörde ayrılır.
## Public (Genel)
* Public erişim belirleyicisine sahip olan değişken veya metodlar sınıfın içerisinden, sınıftan oluşturulan nesneden ya da sınıftan kalıtılmış sınıf veya sınıflardan ,paket içerisinde ve dışarısından ulaşıma açıktır. Bu tür değişken veya metodlara ulaşmak, değişkenlerin değerlerini çekmek ya da değiştirmek mümkündür
## Private
* Private erişim belirleyicisine sahip değişken ya da metodlar sadece sınıf içerisinden erişime açıktırlar.
* Bu tür erişim belirleyicisine sahip değişken ya da metodlara sınıftan üretilmiş nesneden, alt sınıflardan ulaşım yapılamaz.
- Sınıfın sadece özellik ve metodları private erişim belirleyicisine sahip olabilirler, sınıfın erişim belirleyicisi private olamaz.
## Protected (Korumalı)
* Bu tip erişim belirleyicisine sahip değişken ya da metodlar sınıf içerisinden, aynı sınıftan oluşturulmuş nesneden ve alt sınıflardan oluşturulmuş nesneden erişime açıktır.
* Ancak bu sınıfın bulunduğu dış paketten erişime açık değildirler fakat dış paketteki sınıf import edilip kalıtım uygulanırsa kalıtılan sınıftan erişime açıktır ama yine de nesne ulaşımına kapalıdır.
* Sınıfın özellikleri,
* Sınıfın metodları ve yapılandırıcı metodları protected olabilir.
* Sınıfın erişim belirleyicisi protected olamaz.
## Default (Erişim belirleyicisi olmayan)
* Default tipindeki değişkenler sınıf içerisinden erişime, nesneden erişime, paket içinden erişime açıktırlar ancak protected a aksi olarak bu tür değişkenler dış paketlerden kalıtım ile dahi olsa ulaşıma açık değildirler.
* Sınıfın özellikleri, metodları, yapılandırıcı metodları default olabilir.
* Sınıfın kendisinin erişim belirleyicisi default olabilir.
## Erişim Tablosu
![alt](https://ramazanbiyikci.com.tr/wp-content/uploads-static/2016/08/Resim1-1024x550.png)
