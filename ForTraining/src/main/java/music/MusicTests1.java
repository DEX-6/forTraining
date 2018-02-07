package music;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTests1 {

    private void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Мы получили синтезатор");
        } catch (MidiUnavailableException e) {
            System.out.println("Неудача");
        }
    }

    public static void main(String[] args) {
        MusicTests1 mt = new MusicTests1();
        mt.play();
    }
}
