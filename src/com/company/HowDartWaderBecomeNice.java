package com.company;

public class HowDartWaderBecomeNice {

    public static void main(String[] args) {

        Master palpatin = new Master(
                "Sheev Palpatine",
                60,
                5,
                "Oh,my shoes! I feel my force is melting...",
                "I Have Died Before. I'll be baaaaack!!! (Died)");
        Master yoda = new Master(
                "Yoda",
                20,
                5,
                "",
                "Do or Do not! There is no try! You have a sist...hhh(Become to force spirit) ");

        WildCat luke = new WildCat(
                "JediCat",
                "Luke Skywalker",
                "I hate the siths!",
                "Ok, it's time to learn some new skills!",
                "I want to come with you to Alderaan. I want to learn the ways of the Force, and become a Jedi like my father.”");


        HomeCat darthWader = new HomeCat(
                "SithCat",
                "Darth Wader",
                palpatin,
                "play",
                "{Spoiling the Master's lightsaber with force}",
                "{is sitting on his little sith throne and xooooo-khhhhhhhh}");

        Narrator narrator = new Narrator();


        narrator.intro();
        narrator.DartWaderAndPalpatin(palpatin, darthWader);
        narrator.LukeAndYoda(yoda, luke);
        narrator.DartWaderMeetLukeAndKillPalpatin(luke,darthWader);

    }
}
