package br.edu.unifei.ecot12a;

public class Main {
    public static void main(String[] args) {
        
        Curse m1 = new Curse();
        m1.setName("Transformation");
        m1.setTransformation("Frog");
        m1.setBreakCondition("A kiss of true love");

        Curse m2 = new Curse();
        m2.setName("Transformation");
        m2.setTransformation("Ogre");
        m2.setBreakCondition("A kiss of true love");
        m2.setDuration("nocturnal");

        EnchantedObject obj1 = new EnchantedObject();
        obj1.setType("Magic mirror");
        obj1.setOrigin("Snow white");

        Princess p = new Princess();
        p.setName("Fiona");
        p.setStory("imprisoned in a tower guarded by a dragon");
        p.setCurse(m2);

        Human h1 = new Human();
        h1.setName("Lilian");
        h1.setCurse(m1);
        h1.setChild(p);

        Human h2 = new Human();
        h2.setName("Harold");
        h2.setPartner(h1);
        h2.setChild(p);

        Human h3 = new Human();
        h3.setName("Farquaad");
        h3.setHeight(1f);
        h3.getObjects().add(obj1);

        Human h4 = new Human();
        h4.setName("Enchanted");

        Creature c = new Creature();
        c.setName("Talking donkey");
        c.setFriendly(true);
        c.setMagicAbility("to speak");

        Creature c3 = new Creature();
        c3.setName("Elizabeth"); //em alguns jogos, o dragao é referido como Elizabeth
        c3.setType("Dragon");
        c3.setMagicAbility("Devastating fire breath, capable of melting steel and protecting your territory");
        c3.setPartner(c);

        EnchantedObject v = new EnchantedObject();
        v.setType("Magic wand");

        Potion p1 = new Transformation();
        p1.setDuration(1);
        p1.setEffect("Transforms the drinker and their true love into their most beautiful human forms.");

        Potion p2 = new Love();
        p2.setDuration(1);
        p2.setEffect("Induces instant romantic affection for the first person the drinker lays eyes on after consumption.");

        Fairy f = new Fairy();
        f.setWings(true);
        f.setBrightness("Low");
        f.setChild(h4);
        f.setMagic_wand(v);
        f.getPotions().add(p1);
        f.getPotions().add(p2);

        Contract con = new Contract();
        con.setBenefit("A day of freedom");
        con.setPayment("Loss of a day of your life");
        con.setTerminationClause("A kiss of true love");

        Rumpelstiltskin rump = Rumpelstiltskin.getInstance();
        rump.setHeight(1f);
        rump.setFriendly(true);
        rump.setType("Elf");
        rump.setNegociationHability("Persuasion");
        rump.setCurrentPersonality("Manipulator");
        rump.getContracts().add(con);

        Flute fla = new Flute();
        fla.setRange(100000);

        JeremySteig j = new JeremySteig();
        j.setName("Jeremy Steig");
        j.setMusicalPrecision("High");
        j.setFlute(fla);

        Ogre o = new Ogre();
        o.setName("Shrek");
        o.setIntimidation("High");
        o.setPartner(p);

        Biome b1 = new Biome();
        b1.setName("Temperate ");
        b1.setClimate("Mild");
        b1.setHumidity("Balanced");

        Biome b2 = new Biome();
        b2.setName("Lowland");
        b2.setClimate("Very humid");
        b2.setHumidity("High");

        Castle c2 = new Castle();
        c2.setArchitecture("Renaissance");
        c2.setGuards(100000);

        Kingdom r1 = new Kingdom();
        r1.setName("Duloc");
        r1.setBiome(b1);
        r1.setKing(h3);

        Kingdom r2 = new Kingdom();
        r2.setName("Tao Tao Distante");
        r2.setBiome(b1);
        r2.setCastle(c2);
        r2.setKing(h2);

        Kingdom r3 = new Kingdom();
        r3.setName("Pantano");
        r3.setBiome(b2);
        r3.setKing(o); //shrek é o unico ser habitante do pantano, por isso é definido como rei.

        System.out.println("Once upon a time, in a biome with a " + b1.getClimate() + " climate, there was a kingdom called " + r2.getName() +
        ", ruled by King " + r2.getKing().getName() + " and his wife " + r2.getKing().getPartner().getName() +
        ". They had a daughter, Princess " + h1.getChild().getName() + ", who carried a terrible curse of type " +
        p.getCurse().getName() + ", transforming into a " + p.getCurse().getTransformation() + " during the " + p.getCurse().getDuration() + " period." +
        " The princess was " + p.getStory() + " so that a prince could save her, as the condition to break the curse was " +
        p.getCurse().getBreakCondition() + ".\n");

        System.out.println("Not far from there, there was a kingdom known as " + r1.getName() + ", ruled by King " + r1.getKing().getName() +
                ", who was searching for a princess to marry. Then, through a " + r1.getKing().getObjects().get(0).getType() +
                " originating from the story of " + r1.getKing().getObjects().get(0).getOrigin() + ", the king learns about Princess " + p.getName() +
                " and falls in love. But his plan was not to rescue her himself — he wanted to send his strongest soldier to do it.\n");

        System.out.println("Meanwhile, in a modest kingdom known as " + r3.getName() +
                ", lived a lonely ogre named " + r3.getKing().getName() +
                ". One day, Shrek was surprised to find various magical creatures in his land, sent there by order of King " + r1.getKing().getName() +
                ", who had decreed the expulsion of all enchanted figures from his domain to serve his own interests.\n");

        System.out.println("Thus, Shrek meets his most loyal friend, the " + c.getName() + ".");

        System.out.println("Now the adventure begins...\n");

        System.out.println("So, " + o.getName() + " and the " + c.getName() + " set out to reclaim the " + r3.getName() +
                ". Upon arriving, the king is astonished by the ogre's strength as he defeats all the soldiers. So, King " + r1.getKing().getName() +
                " makes Shrek a proposal: he must save the princess from the dragon's tower.\n");

        System.out.println("Shrek accepts the offer and departs with Donkey to rescue the princess.\n");

        System.out.println("At the tower, the two encounter the dragon, who possesses a " + c3.getMagicAbility() +
                ". Despite this, the dragon's attitude changes upon noticing Donkey, revealing an unexpectedly friendly side.\n");

        System.out.println("On the way home, Shrek reveals to Fiona that he is an ogre, and the princess is stunned.\n");

        System.out.println("The princess starts hiding every night so that Shrek does not notice her curse.\n");

        System.out.println("During the journey back to the kingdom, Fiona and Shrek grow closer, sharing stories and moments that reveal their true personalities. Although Fiona hides her nightly transformation, Shrek begins to feel something special for the princess.\n");

        System.out.println("One night, Donkey discovers Fiona's secret. He finds her transformed into an ogre and, shocked, confronts her. She reveals her curse and her fear that Shrek might not accept her true form. Donkey, however, encourages Fiona to be honest with Shrek.\n");

        System.out.println("Upon arriving in the kingdom of " + r1.getName() + ", Shrek hands Fiona over to King " + r1.getKing().getName() +
                " as promised. However, he feels empty and decides to return to the swamp, believing Fiona deserves someone better.\n");

        System.out.println("Fiona, about to marry King " + r1.getKing().getName() +
                ", feels torn between duty and the feelings she has developed for Shrek. Meanwhile, Donkey, realizing Shrek made a mistake, goes to the swamp to convince him to fight for what he feels.\n");

        System.out.println("Encouraged by Donkey, Shrek returns to the kingdom of " + r1.getName() + " to stop the wedding. During the ceremony, he declares his love for Fiona in front of everyone, surprising King " + r1.getKing().getName() + ".\n");

        System.out.println("At sunset, Fiona's curse manifests, revealing her ogre form. King " + r1.getKing().getName() +
                " tries to use this against her, but Shrek defends her, saying he loves her regardless. The dragon " + c3.getName() +
                ", attracted by its love for Donkey, also appears and swallows the king, ending his tyranny.\n");

        System.out.println("Fiona, upon hearing Shrek’s declaration of true love, kisses him, breaking her curse. However, to everyone’s surprise, she remains an ogre. Fiona realizes her true form is the one in which she feels most loved and accepted.\n");

        System.out.println("Shrek and Fiona return to the swamp, now transformed into a joyful and welcoming home. They celebrate their union with friends, magical creatures, the loyal Donkey, and the dragon " + c3.getName() + ". Peace finally reigns among the kingdoms.\n");

        System.out.println("And so, the story ends with Shrek learning that true love goes beyond appearances, and Fiona discovering that her real beauty lies in being who she truly is.\n");

        System.out.println("---------------------------------------------------------------End of Movie 1-------------------------------------------------------------------------------------\n\n");

        System.out.println("Above, I tested the functionality of all classes. Below, only some scenes will be described to test the patterns.\n\n");

        System.out.println("Rumpelstiltskin, a " + rump.getType() +
                " known for his negotiation skill in " + rump.getNegociationHability() +
                ", offered Shrek a contract with the benefit of " + con.getBenefit() +
                ". The required payment is " + con.getPayment() +
                ", with a termination clause of " + con.getTerminationClause() + ".");

        System.out.println("Shrek signed this contract.\n");

        System.out.println("Testing Singleton pattern for Rumpelstiltskin:");
        Rumpelstiltskin rumpelstiltskin2 = Rumpelstiltskin.getInstance();
        System.out.println("Instance 1: " + rump);
        System.out.println("Instance 2: " + rumpelstiltskin2);

        if (rump == rumpelstiltskin2) {
            System.out.println("Both instances point to the same object. The Singleton pattern is working correctly.\n");
        } else {
            System.out.println("Instances are different. The Singleton pattern was not implemented correctly.\n");
        }

        System.out.println("The flutist " + j.getName() +
                " is known for his musical precision: " + j.getMusicalPrecision() +
                ", and for the magical flute that has a range of " + fla.getRange() + " meters.");

        System.out.println("The flute is currently in mode: " + fla.getMelody());

        System.out.println("At the request of Rumpelstiltskin, Jeremy plays a melody to capture Shrek, making all the ogres dance.");

        fla.executeMelody();
        System.out.println("The flute now switches to state: " + fla.getMelody() + ".\n");

    }
}