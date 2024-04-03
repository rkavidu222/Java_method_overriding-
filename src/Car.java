class Car {
    public void drive(){
        System.out.println("car is drive");
    }
}
class Benz extends Car{
    public void reverse(){
        System.out.println("Reverse drivr");
    }
    public void breake(){
        System.out.println("car breaked");
    }
    public void auto(){
        super.drive();
        reverse();
    }
}
class Test4{
    public static void main(String[] args) {
        Benz b = new Benz();
        b.auto();
    }
}