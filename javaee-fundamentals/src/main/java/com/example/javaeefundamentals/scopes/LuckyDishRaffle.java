package com.example.javaeefundamentals.scopes;

/**
 * @author saozdemir
 * @project javaeeworkspace
 * @date 23 Apr 2024
 * <p>
 * @description:
 */
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.Random;

@Named
public class LuckyDishRaffle {

    @Inject
    private List<String> luckyDishes;



    private final Random random = new Random();



    public String getYourLuckyDish() {
        return luckyDishes.get(random.nextInt(8));
    }



}
