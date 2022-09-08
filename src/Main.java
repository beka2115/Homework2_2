public class Main {
    public static void main(String[] args) {
        createObject("Apple").print();
        createObject("OnePluse").print();
        createObject("Redmi").print();
    }

    public static Phone createObject(String className) {
        Phone result = null;
        switch (className) {
            case "Apple":
                Apple apple = new Apple
                        ("Iphone 14", 2022, 1000);
                result = apple;
                break;
            case "Redmi":
                Redmi redmi = new Redmi("Redmi 8", 2020, 90);
                result = redmi;
                break;
            case "OnePluse":
                OnePluse onePluse = new OnePluse("OnePluse 9RT", 2021, 500);
                result = onePluse;
                break;
        }
        return result;
    }
}

