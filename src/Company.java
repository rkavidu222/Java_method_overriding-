class Company {
    int id;
    String name;
    Company(int id, String name){
        this.id=id;
        this.name=name;
    }
}
class Vertusa extends Company{
    double salary;
    Vertusa(int id, String name, double salary){
        super(id,name);
        this.salary=salary;
    }
    public void print(){
        System.out.println("Id is:- "+id+", Name is:- "+name+", Salary is:- "+salary);
    }
}
class Test5{
    public static void main(String[] args) {
        Vertusa v = new Vertusa(123,"Rash",45000.00);
        v.print();
    }
}
