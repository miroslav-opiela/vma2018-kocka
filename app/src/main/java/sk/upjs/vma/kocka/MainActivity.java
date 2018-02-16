package sk.upjs.vma.kocka;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

/**
 * Hlavna a v tomto pripade jedina aktivita.
 */
public class MainActivity extends AppCompatActivity {

    // Button reprezentujuci kocku
    private Button diceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // nastavi sa layout z xml suboru activity_main.xml.
        setContentView(R.layout.activity_main);

        // pri vytvoreni aktivity sa nacita button podla svojho ID
        diceButton = findViewById(R.id.diceButton);
    }

    /**
     * Metoda vykonana po kliknuti na kocku/button. Vygeneruje nahodne cislo a zmeni text na buttone.
     */
    public void rollDice(View view) {
        int randomNumber = getRandomRoll();
        diceButton.setText(Integer.toString(randomNumber));
    }

    /**
     * Vrati nahodne cele cislo z rozsahu 1-6.
     */
    private int getRandomRoll() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

}
