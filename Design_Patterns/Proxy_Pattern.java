
public class Test {

    public static void main(String[] args) {
        //X x = new X();

        //XReal x1 = new Xreal(); // Library Version
        //x1.m(100);
        Windows11OSGenuine os1 = new Windows11OSGenuine();
        os1.access("Q43FJ05");

        Windows11OSTrial os2 = new Windows11OSTrial();

        os2.access("Q43FJ02"); // wrong Serial no

        try {
            Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        }

        os2.access("Q43FJ05");
    }

}

interface Windows11OS {

    public abstract void access(String serialKey);
}

class Windows11OSGenuine implements Windows11OS {

    @Override
    public void access(String serialKey) {
        System.out.println("You're using full version of windows 11");
    }

}

class Windows11OSTrial implements Windows11OS {

    private Windows11OSGenuine os = new Windows11OSGenuine(); // Proxy HAS- Real Object

    @Override
    public void access(String serialKey) {

        if (serialKey.equals("Q43FJ05")) {
            os.access(serialKey);
        } else {
            System.out.println("You're using Trial version of windows 11");
        }

    }

}
