class Vehicle {

    // Lab-4.2 _ 21/02/2025

    private String brand = "Ferrari";
    public void honk() {
        System.out.println("Mew, Mew!");
    }
    public String getBrand() {
        return brand;
    }
}

class Car extends Vehicle {
    private String modelName = "AB4";
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.getBrand());
        System.out.println(myCar.modelName);
    }
}