class Bank {
    int intrest(){
        return 0;
    }
}
class BOC extends Bank{
    @Override
    int intrest() {
        return 16;
    }
}
class HNB extends Bank{
    @Override
    int intrest() {
        return 17;
    }
}
class NDB extends Bank{
    @Override
    int intrest() {
        return 18;
    }
}
class Test2{
    public static void main(String[] args) {
        BOC b = new BOC();
        HNB h = new HNB();
        NDB n = new NDB();
        System.out.println("BOC bank intrest is:- "+b.intrest());
        System.out.println("HNB bank intrest is:- "+h.intrest());
        System.out.println("NDB bank intrest is:- "+n.intrest());


    }
}
