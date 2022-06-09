public class Test {

    public static void main(String[] args) {
        //A a = new A();
        //B b = new B();
        
        AppleFactory factory1 = new iPhoneFactory();
        AppleFactory factory2 = new macBookProFactory();
        
        AppleDevice device1 = factory1.getDevice(); 
        device1.getModel();
        
        AppleDevice device2 = factory2.getDevice();
        device2.getModel();

    }

}

interface AppleDevice {

    public abstract void getModel();
}

class iPhone implements AppleDevice {

    @Override
    public void getModel() {
        System.out.println("Apple iPhone");
    }

}

class macBookPro implements AppleDevice {

    @Override
    public void getModel() {
        System.out.println("Apple MacBook Pro");
    }

}

interface AppleFactory { // Factory

    public abstract AppleDevice getDevice();
}

class iPhoneFactory implements AppleFactory {

    @Override
    public AppleDevice getDevice() {
        return new iPhone();
    }

}

class macBookProFactory implements AppleFactory {

    @Override
    public AppleDevice getDevice() {
        return new macBookPro();
    }

}
