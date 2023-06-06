package Java_zaaw_zad2;

public abstract class Person {
    private String name;
    private String address;

    //brakuje metody abstrakcyjnej showdetails
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public void showDetails(){
        System.out.println(String.format("imie: %s, adres: %s ", name, address));

    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
