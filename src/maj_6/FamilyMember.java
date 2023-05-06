package maj_6;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FamilyMember {
    private String name;
    private Boolean isMale;
    private Integer age;

    // Fields that hold references to other FamilyMember objects
    private FamilyMember spouse;
    private List<FamilyMember> children;
    private FamilyMember mother;
    private FamilyMember father;

    public FamilyMember(String name, Boolean isMale, Integer age) {
        this.name = name;
        this.isMale = isMale;
        this.age = age;

        // By default, spouse, mother, father are null (have no value)
        this.spouse = null;
        this.mother = null;
        this.father = null;

        // By default, children and siblings are empty lists
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getMale() {
        return isMale;
    }

    public void setMale(Boolean male) {
        isMale = male;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public FamilyMember getSpouse() {
        return spouse;
    }

    public void setSpouse(FamilyMember anotherSpouse) {
        // For this man, set anotherSpouse as his wife
        this.spouse = anotherSpouse;

        // For anotherSpouse (woman), set this as her husband
        anotherSpouse.spouse = this;
    }

    public List<FamilyMember> getChildren() {
        return children;
    }

    public void addChild(FamilyMember child) {
        this.children.add(child);

        if (isMale) {
            child.father = this;
        }
        else {
            child.mother = this;
        }
    }

    public List<FamilyMember> getSiblings() {
        // this - reference to the object on which the method is invoked

        // Siblings are another children of my parents
        // Use set to avoid duplicates
        Set<FamilyMember> siblings = new HashSet<>();

        if (this.father != null) {
            siblings.addAll(this.father.getChildren());
        }
        if (this.mother != null) {
            siblings.addAll(this.mother.getChildren());
        }
        // Remove myself, as I'm not my own sibling
        siblings.remove(this);

        return new ArrayList<>(siblings);
    }

    public FamilyMember getMother() {
        return mother;
    }

    public void setMother(FamilyMember mother) {
        this.mother = mother;
        mother.addChild(this);
    }

    public FamilyMember getFather() {
        return father;
    }

    public void setFather(FamilyMember father) {
        this.father = father;
        father.addChild(this);
    }
}