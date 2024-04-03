class Human {
    public void show(){
        System.out.println("I am a Human");
    }
}
class Kavi extends Human{
    @Override
    public void show() {
        super.show();
        System.out.println("I am Kavi");
    }
}
class Test3{
    public static void main(String[] args) {
        Kavi k=new Kavi();
        k.show();
    }
}