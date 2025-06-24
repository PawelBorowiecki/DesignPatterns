package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FlyweightFactory {
    private static List<CarFlyweight> cache = new ArrayList<>();


    public static CarFlyweight getFlyweight(String brand, String model, String engine){
        Optional<CarFlyweight> optFlyweight = cache.stream().filter(f ->
                        f.getBrand().equals(brand)
                        && f.getModel().equals(model)
                        && f.getEngine().equals(engine)).findAny();
        if(optFlyweight.isPresent()){
            return optFlyweight.get();
        }
        CarFlyweight flyweight = new CarFlyweight(brand, model, engine);
        cache.add(flyweight);
        return flyweight;
    }
}
