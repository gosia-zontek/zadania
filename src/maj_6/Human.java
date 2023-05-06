package maj_6;

public class Human {
    //class-level variables are FIELDS (nie mowimy o zmiennych tylko polach!)
    //zmianna w metodzie, pole jest w klasie

    //modyfikator dostepu, private - zastezony do klasy, czyli nie da sie go odczytac poza klasa
    //

    //to imie kazdego obiektu czlowiek - kazdy ma swoj egzemplarz pola name
    //niestatyczne rzeczy sa unikalne dla danego obiektu
    //non-static fields and methods are per objetct
    //static fields and methods are per class

    private String name;
    private Integer age;
    private Integer heightInCm;
    private Boolean isMale;
    private String nationality;


    //metody akcesyjne - accessor methods
    //getter - do pozyskiwania wartosci
    //static - zalezne od klasy, bez statica - zalezne od obiektu

    // Constructor - metoda do tworzenia obiektow
    //ma on typ i jest on zawsze taki sam jak nazwa klasy
    public Human(String name, Integer age, Integer heightInCm, Boolean isMale, String nationality){
        this.name = name;
        this.age = age;
        this.heightInCm = heightInCm;
        this.isMale = isMale;
        this.nationality = nationality;
    }

    public Human(String name){
        this.name = name;
        this.age = 18;
        this.heightInCm = 170;
        this.isMale = true;
        this.nationality = "Polish";
    }


    public String getIntroduction() {
        return String.format("HI, my name is %s, I'm %d years old, I'm %d cm tall, I'm a %s, I'm a %s %s" ,
                this.name, this.age, this.heightInCm,this.nationality, isMale ? "man" : "woman" );
    }
    public String getName() {
        return this.name;
    }

    //setter - uzyskiwania wartosci
    public void setName(String name){
        this.name=name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeightInCm() {
        return heightInCm;
    }

    public void setHeightInCm(Integer heightInCm) {
        this.heightInCm = heightInCm;
    }

    public Boolean getMale() {
        return isMale;
    }

    public void setMale(Boolean male) {
        isMale = male;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
