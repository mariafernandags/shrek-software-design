package br.edu.unifei.ecot12a;

public class DanceMelody implements Melody{

    @Override
    public void execute(Flute f) {
        f.setMelody(new Silence());
        System.out.println("Transition to: Silence");
    }
}
