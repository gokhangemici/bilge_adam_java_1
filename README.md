# Java 17 ile gelen yeni özellikler
### Mühürlü sınıflar:
- JEP 409: Mühürlü sınıflar bu sürümde java diline eklendi. Başka sınıfları veya arayüzleri kısıtlayan mühürlü sınıflar ve arayüzler onları uygulayabilir ve onlardan kalıtım alabilir.
### Switch için desen eşleşmesi:
* JEP 406: Switch yapısı için genişletilmiş desen eşleşmesi bir ifadenin her biri belirli bir eyleme sahip bir dizi desene karşı test edilmesini sağlar. Böylece karmaşık veri odaklı sorgulamalar güvenli bir şekide ifade edilebilir.
### Büyük ikonlara erişmek için yeni bir API desteği:
* JDK 17 ile mümkün olduğunda daha yüksek kaliteli simgelere erişime izin veren yeni bir method tanımlandı. 
* Bu method tamamen windows platformu için eklendi. Ancak diğer platformlardaki sonuçlar değişebilir ve daha sonra geliştirilecektir.

 ```java
 FileSystemView fsv = FileSystemView.getFileSystemView();
 Icon icon = fsv.getSystemIcon(new File("application.exe"), 64, 64);
 JLabel label = new JLabel(icon);
```
* Kullanıcı bu kod ile <strong>application.exe<strong> çalıştırılabilir dosyası için yüksek kaliteli bir ikon elde edebilir. Bu ikon highDPI ortamında daha iyi ölçeklenebilecek bir etiket oluşturmak için uygundur.
### Sözde rastgele sayı üreteçleri geliştirildi
* Sözde rastgele sayı üreteçleri için yeni arayüz tipleri ve uygulamaları bu versiyonla birlikte geliyor.
### Hata Mesajlarında Kaynak Detayları
- JavaDoc girdi kaynak dosyasında bir sorunu raporladığında, o sorun için kaynak satırı ve derleyici tanılama mesajlarına benzer şekilde o satırdaki konuma işaret eden bir şapka(^) işaretini gösterir.

- Ek olarak, loglama ve diğer bilgi mesajları standard hata sınıfında yazılmış durumda. 

### Yabancı fonksiyon ve Bellek API
* Bu yeni sürümde Java programlarının java çalışma zamanı dışındaki kod ve verilerle birlikte çalışabileceği bir AP tanıtıldı.
- Etkili bir şekilde yabancı fonksiyonları çağırarak ve yabancı belleğe güvenli bir şekilde erişmesini sağlayarak, Bu API JNI ın kırılganlığı ve tehlikesi olmadan java programlarının yerel kütüphaneleri çağırabilmesine ve yerel verileri işleyebilmesine olanak tanır
