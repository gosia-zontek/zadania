package maj_6;

import java.util.ArrayList;
import java.util.List;

public class zadanieObiekty {

    //Ćwiczenie: napisz klasę reprezentującą członka rodziny, powinna zawierać imię, płeć, wiek, oraz referencje (referencje do innych obiektów też mogą być polami) do innych członków rodziny (mąż, żona, dzieci, rodzeństwo, ojciec, matka). Konstruktor powinien zawierać jako parametry imię, płeć oraz wiek, natomiast relacje rodzinne powinno się ustawiać za pomocą setterów. Za pomocą tworzenia obiektów i używania setterów stwórz następującą strukturę rodzinną:
    //Tadeusz jest mężem Doroty i wspólnie mają trójkę dzieci: Mateusza, Olę i Julię. Dorota ma rodziców Zygmunta i Janinę oraz siostrę Monikę, a Tadeusz ma rodziców Henryka i Eugenię oraz rodzeństwo: Edmund, Jadwiga, Hanna, Ryszard.
    private String name;
    private Integer age;
    private Boolean isMale;


    //fields that hold references to other FamilyMember objects
    private zadanieObiekty spouse;
    private List<zadanieObiekty> children;
    private List<zadanieObiekty> siblings;
    private zadanieObiekty mother;
    private zadanieObiekty father;


    public zadanieObiekty(String name, Boolean isMale, Integer age){
        this.name = name;
        this.isMale = isMale;
        this.age = age;

        //by default, they are null
        this.children = new ArrayList<>();
        this.siblings = new ArrayList<>();

        //by default, spouse, mother, father are null (have no value)
        this.mother = null;
        this.father = null;
        this.spouse = null;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getMale() {
        return isMale;
    }

    public void setMale(Boolean male) {
        isMale = male;
    }

    public zadanieObiekty getSpouse() {
        return spouse;
    }

    public void setSpouse(zadanieObiekty spouse) {
        this.spouse = spouse;
    }

    public List<zadanieObiekty> getChildren() {
        return children;
    }

    public void addChildren(zadanieObiekty children) {
        this.children.add(children);
    }

    public List<zadanieObiekty> getSiblings() {
        return siblings;
    }

    public void setSiblings(zadanieObiekty siblings) {
        this.siblings.add(siblings);
    }

    public zadanieObiekty getMother() {
        return mother;
    }

    public void setMother(zadanieObiekty mother) {
        this.mother = mother;
    }

    public zadanieObiekty getFather() {
        return father;
    }

    public void setFather(zadanieObiekty father) {
        this.father = father;
    }
}
