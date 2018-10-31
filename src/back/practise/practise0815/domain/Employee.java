package back.practise.practise0815.domain;

public class Employee {

    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    @Override
    public String toString() {
        return  name + " " + address + " " + number;
    }

    public void mailCheck(){
        System.out.println("邮寄支票给："+this.name+" "+this.address);
    }

}
