# mobillium-staj-task2

### Konu 
<pre> Liste ve detay ekranları arasında veri paslayarak navigasyon/geçiş yapma </pre>

Navigasyon için 3 farklı yolu uygulanacak.<br><br>
1- Activity - Activity arasında navigasyon ve veri paslama<br>
2- Fragment - Fragment arasında navigasyon ve veri paslama<br>
3- Navigation Components kullanarak Fragment'lar arası navigasyon ve veri paslama<br>
4- Fragment Result API ile veri paslama

<hr>

### Navigation component dependencies

<pre>
- build.gradle (:app)

dependencies {
    def nav_version = "2.5.3"
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
}<br>
plugins{
 id 'androidx.navigation.safeargs.kotlin'
 }
<hr> 
- build.gradle(project) 

 dependencies {
        def nav_version = "2.5.3"
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
    }
</pre>

<hr>

### Hedef

1- Öncelikle her iki ekranı activity olarak tasarlayıp, ilgili liste item'a tıklanınca detay activity ekranını açılacak. Detay ekranına giderken Liste item'da gördülen tüm dataları da detay ekranına paslayıp, ilgili yerlerde setlenecek. <br>
2- Sonrasında ayrı bir activity oluşturup, bu activity'ye ait 2 ayrı fragment oluşturulacak: Liste ve Detay. Fragment'lar arasında argument setleyerek ilgili dataları paslayarak, navigasyon tamamlanacak. <br>
3- Projene navigation component'in ekli olduğundan emin olduktan sonra, ayrı bir activity oluşturulacak. Bu activity altında Liste ve Detay için 2 yeni fragment oluşturulacak. Bir nav graph oluşturulup, kurulumu yapılacak. Navigation component ve SafeArgs kullanarak bu 2 fragment arasında data paslayarak, navigasyon tamamlanacak. <br>
4- Son olarak, navigation component için oluşturulan fragment'lardan detay ekranında bulunan refresh iconuna tıklanınca, rastgele min-max sıcaklık değerleri arasında bir sayıyı, o günün sıcaklık değerine setlenecek. Setlenen değer, verileri güncelle butonuna basınca Fragment Result API kullanarak Liste fragment'ındaki değeri güncellemek için kullanılacak. Geri geldiğinde atanan son random sıcaklık değeri ilgili item'daki sıcaklık değerine setlenmiş olacak. 

<hr>

### Kaynaklar 

* [Introduction to activities](https://developer.android.com/guide/components/activities/intro-activities)
* [Create a fragment](https://developer.android.com/guide/fragments/create)
* [Get started with the Navigation component](https://developer.android.com/guide/navigation/navigation-getting-started)
* [Learn Jetpack Navigation - Codelab](https://developer.android.com/codelabs/android-navigation)
* [Get results using the Fragment Result API](https://developer.android.com/guide/fragments/communicate#fragment-result)
