package designpaterns02day02compositepattern;

import java.util.ArrayList;

/**
 *
 * @author 1999k
 */
public class Test {

    public static void main(String[] args) {

    }

}

abstract class AbstractComposite {

    public abstract void method1();

}

class Leaf extends AbstractComposite {

    @Override
    public void method1() {

    }

}

class Composite extends AbstractComposite {

//    Leaf leaf;                 me widiyata api eka eka nothiyanan hethuwa thama apita mekedi eka object ekkta wada allanna ba namuth real exampople eke ekkata wada thiyanan puluwan e nisa apita wenawa array list ekka wage object godak use karanna puluwan widiyak use karanna
//    Composite composite;   
//    ArrayList<Leaf> leafList = new ArrayList<>();                apita mehema array list thiyanan giyama thiyana prshne thama warga deka thiyaganna apita wenawa array list dekk use karanna namuth ekata solution ekk widiyata apita puluwan dekama ekama class type ekakk karala eka type ekkain thiyaganna
//    ArrayList<Composite> compositeList = new ArrayList<>();
    ArrayList<AbstractComposite> abstractCompositeList = new ArrayList<>();   // methandi api karanne abstarct class ekak wenama hadala eka leaf saha composite kiyana dekatama extends karanwa ethakota e dekama eyalage childla wena nisa apita puluwan super type eken eka array list ekk use karala ekata leaf saha composite kiyana dekama store karaganna

    @Override
    public void method1() {

    }

}
