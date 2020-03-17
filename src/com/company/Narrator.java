package com.company;

public class Narrator {


    public void tellphrase(Master who, String phrase){
        System.out.println(who.name+": "+phrase);
    }
    public void tellphrase(Cat who, String phrase){
        System.out.println(who.getName()+": "+phrase);
    }
    public void tellphrase(String phrase){
        System.out.println("Narrator: "+phrase);
    }

    public void intro() {
        tellphrase("A long time ago in a galaxy far, far away... " +
                "Rebel spaceships, striking\n" +
                "from a hidden base, have won\n" +
                "their first victory against\n" +
                "the evil Galactic Empire.\n" +
                "\n" +
                "During the battle, Rebel\n" +
                "spies managed to steal secret\n" +
                "plans to the Empire's\n" +
                "ultimate weapon, the DEATH\n" +
                "STAR, an armored space\n" +
                "station with enough power to\n" +
                "destroy an entire planet.\n" +
                "\n" +
                "Pursued by the Empire's\n" +
                "sinister agents, Princess\n" +
                "Leia races home aboard her\n" +
                "starship, custodian of the\n" +
                "stolen plans that can save\n" +
                "her people and restore\n" +
                "freedom to the galaxy....." +
                "\n\n");

    }

    public void DartWaderAndPalpatin(Master palpatin, HomeCat DW) {
        System.out.println("\n===Chapter 1===\n(Emperor's flagship)\n");
        DW.layOnSofa();
        DW.play();
        tellphrase(palpatin, "Come to me, my little kitty, I have a mission for you.");
        DW.spoilShoes();
        tellphrase(palpatin, "Stop it! I want to tell you something. Come here!");
        tellphrase(DW, "{Comming up to Palpatin}");
        tellphrase(palpatin, "So, I need you to find plans of DEATH STAR at the Rebel Planet.\n" +
                " Our spy send the message that they are hidden at the Tatuin. \n" +
                "I want you to destroy a Rebel base and bring back the plans. \n If you succeed, I'll teach you how to create thunders.\n " +
                "If not ... You will regret about that! Understood? ");
        tellphrase(DW, "Meow! {xooooo-khhhhhhhh}");

    }

    public void LukeAndYoda(Master yoda, WildCat luke) {
        System.out.println("\n===Chapter 2===\n(Tatuin)\n");
        tellphrase("\n There was a good wild cat named Luke Skywalker that lived on the planet Tatuin." +
                "\n\nThere was usual morning in the Luke's village. But suddenly, he have heard that somebody in the yard. ");
        luke.hatePeople();
        tellphrase(luke, "Who is there? ");
        tellphrase("There was Master Yoda, legendary Jedi Master ");
        tellphrase(yoda, "Hello, my young padawan!\n " +
                "That force is flowing in you I feel. Yrssss.... \n " +
                "With me come to Alderaan. Hrshhhh...\n " +
                "I can teach you, and maybe a Jedi you'll become and fight with sith you will!\n " +
                "Or even you can learn testing and java and become an Automation QA Engineer and save the world!\n " +
                "What your answer will be? Yrsss..");
        luke.saveWorld();
        tellphrase(yoda, "Good young padawan! ");
        tellphrase("{Both set out to Alderaan}\n" +
                "=3 years later= \n" +
                "#STUDYwasHARD \n " +
                "Luke was tha last Jedi that have been trained by Master Yoda\n" +
                "At the end of study course Green Master call Luke and said: ");
        while (true) {
            yoda.decreaseAmountOfMoney();
            if (yoda.amountOfMoney<=0)
                break;
        }
        tellphrase("Then he got the assignment to secret mission...");
    }
    public void DartWaderMeetLukeAndKillPalpatin(WildCat luke, HomeCat DW) {
        System.out.println("\n===Chapter 3===\n(Somewhere in the space)\n\n ");
        tellphrase("Darth Wader haven't went to Tatuin.\n " +
                "He new that Luke, his son is living there, so he tricked Palpatin,\n " +
                "destroy half of Imperial fleet and continue to spoiling shoes of his Master\n ");
        while (DW.master.amountOfMoney>20)
            DW.spoilShoes();
        System.out.println("\n=3 years later= \n");
        tellphrase("Luke was captured during the mission. After a while he had been brought to Darth Wader");
        tellphrase(DW, "Luke, I'm your father!");
        tellphrase(luke, "NOOOOOO, It's Impossible!!!");
        tellphrase(DW, "I have a plan to kill Palpatin, then we will rule the galaxy.");
        tellphrase(luke,"Ok, but how are you gonna do tha...");
        DW.spoilShoes();
        DW.spoilShoes();
        tellphrase("The End!");

    }


}
