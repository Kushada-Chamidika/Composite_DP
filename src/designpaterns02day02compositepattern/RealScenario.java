package designpaterns02day02compositepattern;

import java.util.ArrayList;

/**
 *
 * @author 1999k
 */
public class RealScenario {

    public static void main(String[] args) {

        Parent parent1 = new Parent("A", 5);
        Child child1 = new Child("X", 2);
        Parent parent2 = new Parent("B", 3);
        Parent parent3 = new Parent("C", 8);
        Child child2 = new Child("Y", 1);
        Child child3 = new Child("Z", 6);
        Child child4 = new Child("P", 2);

        parent1.addChild(child1);
        parent1.addChild(parent2);
        parent2.addChild(parent3);
        parent2.addChild(child2);
        parent2.addChild(child3);
        parent3.addChild(child4);
        
        System.out.println(parent1.getValue());

    }

}

abstract class AbstractChild {

    String name;
    int value;

    public AbstractChild(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public abstract int getValue();

}

class Child extends AbstractChild {

    public Child(String name, int value) {
        super(name, value);
    }

    @Override
    public int getValue() {
        return this.value;            // child object ekakdi api kelinma eyage value eka return karnawa
    }
}

class Parent extends AbstractChild {

    ArrayList<AbstractChild> abstractChildList = new ArrayList<>();

    public Parent(String name, int value) {
        super(name, value);
    }

    public void addChild(AbstractChild abstractChild) {
        abstractChildList.add(abstractChild);
    }

    @Override
    public int getValue() {  // child eke wage nathuwa mekedi me wage karanan hethuwa thama meyage yata thawa hirchy ekak thiyenna puluwan ethakota eyage value eka ganan kota mulu hirachy ekema value wala ekathuwa one e nisa meka me widiyata karannama one ekath meke speciality ekk 
        int v = this.value;  // methandi apita hirchy eke values tika + eyage value ekanm mehema denna puluwan eyage value eka one naththam apita v = 0 karathaki e nisa eka ape requirment eka anuwa depend wenawa
        for (AbstractChild abstractChild : abstractChildList) {
            v += abstractChild.getValue();  // methana thawa key point ekak mokda methana api getValue nathiwa value kiyana eka call karanm wenne eya normal child ekk nm eyage value eka dunanta eka composite ekak nm prshnayk enawa mokda value eka gaththoth hirchy eka dige yanne na eyata adala value eka witharai ganne anna e nisa hama node ekatama yanna awshya nisa thama apita me widiyata getValue() kiyana eka call karanna wenne
        }
        return v;
    }

}


// me composite kiyana pattern eka apita awsyanm tree structure ekak nodes okkoma print karaganna use karathaki ape requirment eka anuwa wenas karagena