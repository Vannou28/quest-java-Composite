public class Main {

    public static void main(String[] args) {
        Person parentOriginel = new Person("Pierre");
        Person filsN1 = new Person("fabien");
        Person filsN2 = new Person("aurelien");
        Person petitFilsN1 = new Person("paul");
        Person petitFilsN2 = new Person("alexi");
        Person petitFilsN3 = new Person("artur");
        Person petitFilsN4 = new Person("lucas");

        parentOriginel.addDescendant(filsN1);
        parentOriginel.addDescendant(filsN2);

        filsN1.addDescendant(petitFilsN1);
        filsN1.addDescendant(petitFilsN2);
        filsN2.addDescendant(petitFilsN3);
        filsN2.addDescendant(petitFilsN4);
        
        System.out.print("Arbre genialogique de ");
        System.out.println(parentOriginel.toString());

        System.out.print("Arbre genialogique de ");
        System.out.println(filsN1.toString());
    }
}
