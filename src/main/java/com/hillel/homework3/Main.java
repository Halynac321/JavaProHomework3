package com.hillel.homework3;

import static com.hillel.homework3.Animals.count;
import static com.hillel.homework3.Cats.catsCount;
import static com.hillel.homework3.Dogs.dogsCount;

public class Main {
    public static void main(String[] args) {
        Dogs dogBobik = new Dogs("Бобік");
        Dogs dogSharik = new Dogs("Шарік");
        Cats murzik = new Cats("Мурзик");
        dogBobik.run(550);
        dogBobik.swim(9);
        murzik.run(70);
        murzik.swim(9);
        System.out.println("Створено тварин: " + count);
        System.out.println("Створено собак: " + dogsCount);
        System.out.println("Створено котів: " + catsCount);
    }
}
