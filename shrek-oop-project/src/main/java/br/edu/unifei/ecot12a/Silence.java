package br.edu.unifei.ecot12a;

public class Silence implements Melody{

    @Override
    public void execute(Flute f) {
        f.setMelody(new DanceMelody());
        System.out.println("Transition to: Dance Melody");
    }
}
