package entities;

import java.util.ArrayList;
import java.util.List;

public class InstancesManager {

    private static Integer min;
    private static Integer max;
    private static Integer countInstancesCalled = 1;
    private static List<Instances> instances = new ArrayList<>();

    private InstancesManager() {
    }

    public static void initializer(Integer minimo, Integer maximo) {
        min = minimo;
        max = maximo;

        for (Integer i = 0; i < min; i++) {
            instances.add(new Instances(countInstancesCalled));
            countInstancesCalled++;
        }
    }

    public static Instances getInstances() {
        if(countInstancesCalled < max) {
            instances.add(new Instances(countInstancesCalled));
            countInstancesCalled++;
        }

        return instances.get(countInstancesCalled % min);
    }

}
