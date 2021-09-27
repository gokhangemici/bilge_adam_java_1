## Cast nedir ve niçin kullanılır?
*  Kod yazarken bir veri tipinden diğer bir veri tipine aktarım yapmamız gerekebilir.
*  Örneğin bir değişkeni String olarak aldık varsayalım aldığımız değer 5 ancak biz bu değeri int tipinde aktarmak istediğimizi farz edelim 
veya tam tersi int tipinde aldığımız bir değeri String tipine aktarmamız gerektiğini varsayalım işte bu noktada tip dönüşümleri (Type Casting) yardımımıza koşmaktadır
* Bu tarz tip dönüşümde aklımızdan çıkarmamamız gereken bir nokta var. Her tip bellekte bir alan kaplar. Küçük bir veri tipini büyük bir veri tipine dönüştürdüğümüzde bir sorun
olmayacaktır. Fakat tam tersi durum söz konusu olduğunda veri kaybı yaşayabiliriz
* Küçük bir tipi büyük bir veri tipine dönüştürme işlemine Otomatik tip dönüşümü denir.
* Java bize herhangi bir sorun çıkarmaz hata vermez.
* Hedef tip kaynak tipden daha büyükse
* Java bu noktada bize hata vermeyecektir…
* Peki büyük veri türünün küçük veri türüne değişimi nasıl gerçekleşir ?(Casting)

* Kuralları ;

* Tipler birbirine uygun olmalıdır,
* Kaynak tip hedef tipin tutacağı değerden büyük olmamalıdır,
* Küsüratlı sayılar tam sayılara çevirildiğinde küsüratlarını kaybederler
