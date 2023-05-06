package maj_6;

public class Obiektowe {
    public static void main( String[] args ) {
        FamilyMember tadeusz = new FamilyMember("Tadeusz", true, 60);
        FamilyMember dorota = new FamilyMember("Dorota", false, 54);
        FamilyMember mateusz = new FamilyMember("Mateusz", true, 24);
        FamilyMember ola = new FamilyMember("Ola", false, 19);
        FamilyMember julia = new FamilyMember("Julia", false, 12);
        FamilyMember zygmunt = new FamilyMember("Zygmunt", true, 80);
        FamilyMember janina = new FamilyMember("Janina", false, 74);
        FamilyMember monika = new FamilyMember("Monika", false, 50);

        // Tadeusz jest mężem Doroty
        tadeusz.setSpouse(dorota);

        //  wspólnie mają trójkę dzieci: Mateusza, Olę i Julię.
        tadeusz.addChild(mateusz);
        tadeusz.addChild(ola);
        tadeusz.addChild(julia);
        dorota.addChild(mateusz);
        dorota.addChild(ola);
        dorota.addChild(julia);

        // Dorota ma rodziców Zygmunta i Janinę oraz siostrę Monikę
        zygmunt.setSpouse(janina);

        zygmunt.addChild(dorota);
        janina.addChild(dorota);
        zygmunt.addChild(monika);
        janina.addChild(monika);

        // Maternal grand-mother
        System.out.println(mateusz.getMother().getMother().getName());

        // First grandson from first daughter
        System.out.println(janina.getChildren().get(0).getChildren().get(0).getName());
    }
}





        //creation of the object and the first reference
//        Human firstReference = new Human("Gosia", 25, 172, false, "Polish");
//        //copying the reference (there are now two references)
//        Human secondReference = firstReference;
//
//        System.out.println(firstReference.getName());
//        System.out.println(secondReference.getName());
//        firstReference.setName("Marcin");
//        System.out.println(secondReference.getName());
//


        //Klasa to szablon tworzenia obiektow
        //Obiekt to twor, zlozony z metod i zmiennych, ktory ma na celu reprezentowac czegos w formie danych i logiki
        //objetct creation (class instancing)
//        Human humanA = new Human("Gosia", 25, 172, false, "Polish");
//        Human humanB = new Human("Mateusz", 24, 176, true, "French");
//        Human humanC = new Human("Arek");
//        Human humanD = new Human("Arek");
//        Human humanE = humanC;
//
//        //humanC == humanD FALSE
//        //humanC == humanE TRUE
//        //humanC.equals(humanD) TRUE
//        //humanC.equals(humanE) TRUE
//        humanB.setName("Krzysztof");
//        System.out.println(humanA.getIntriduction());
//        System.out.println(humanB.getIntriduction());
//        System.out.println(humanC.getIntriduction());
