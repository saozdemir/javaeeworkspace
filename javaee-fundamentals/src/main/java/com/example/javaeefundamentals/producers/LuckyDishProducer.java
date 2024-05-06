package com.example.javaeefundamentals.producers;

/**
 * @author saozdemir
 * @project javaeeworkspace
 * @date 23 Apr 2024
 * <p>
 * @description: Bu producer sınıfı bir fabrika modeli gibi çalışır.
 */

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import java.util.ArrayList;
import java.util.List;

public class LuckyDishProducer {

    /**
     * Producer metodları, enjekte edilecek somut tipin çalışma zamanında değiştiği durumlar için çok faydalıdır.
     * Bu, çalışma zamanında polimorfik enjeksiyon sağlar. CDI producer'larını Fabrika Modeli olarak düşünün.
     * <p>
     * Producer'lar ayrıca sahip olmadığımız bean'leri bağlamsal örnekler haline getirmek için bir yol sunar.
     * <p>
     * Üretilen nesnenin varsayılan kapsamı Bağımlı Kapsamdır. Metodu uygun şekilde notasyon ekleyerek değiştirilebilir.
     */
    @Produces
    public List<String> getLuckyDish() {

        List<String> dishes = new ArrayList<>();

        dishes.add("Mantı");
        dishes.add("Haşlama");
        dishes.add("Göveç");
        dishes.add("Tavuk Sote");
        dishes.add("Rosto");
        dishes.add("Mücver");
        dishes.add("Dolma");
        dishes.add("Baklava");
        dishes.add("Musakka");
        return dishes;

    }

    public void dispose(@Disposes List<String> dishes) {
        dishes = null;
    }

}
