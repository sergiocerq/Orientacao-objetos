import entities.Instances;
import entities.InstancesManager;

public class Main {
    public static void main(String[] args) {

        InstancesManager.initializer(3, 5);

        Instances i1 = InstancesManager.getInstances();
        Instances i2 = InstancesManager.getInstances();
        Instances i3 = InstancesManager.getInstances();
        Instances i4 = InstancesManager.getInstances();
        Instances i5 = InstancesManager.getInstances();
        Instances i6 = InstancesManager.getInstances();

        if (i6.getId() == i1.getId()) System.out.println("OK");

        Instances i7 = InstancesManager.getInstances();

        if (i7.getId() == i2.getId()) System.out.println("OK");
    }
}