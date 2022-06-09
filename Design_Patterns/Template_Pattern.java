
abstract class Prepare {

    public void boilWater() {
        System.out.println("Boil Water");
    }

    public void pourInCup() {
        System.out.println("Pour In Cup");
    }

    public abstract void step2();

    public abstract void step4();

    public final void templateMethod() {
        boilWater();
        step2();
        pourInCup();
        if (doStep4()) {
            step4();
        }
    }

    public boolean doStep4() {
        return true;
    }

}

class PrepareTea extends Prepare {

    @Override
    public void step2() {
        System.out.println("Steep Tea Bag");
    }

    @Override
    public void step4() {
        System.out.println("Add Ginger");
    }

}

class PrepareCoffee extends Prepare {

    @Override
    public void step2() {
        System.out.println("Brew Coffee Grinds");
    }

    @Override
    public void step4() {
        System.out.println("Add Sugar And Milk");
    }
}

public class Test {

    public static void main(String[] args) {

        PrepareTea tea1 = new PrepareTea() {
            @Override
            public boolean doStep4() {
                return true;
            }
        };

        PrepareTea tea2 = new PrepareTea() {
            @Override
            public boolean doStep4() {
                return false;
            }
        };

        PrepareCoffee coffee = new PrepareCoffee();

        tea1.templateMethod();
        tea2.templateMethod();
        coffee.templateMethod();

    }

}
