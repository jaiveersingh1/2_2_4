package org.pltw.examples.animalapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;

public class AnimalActivity extends ActionBarActivity {

    public static TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        output = (TextView)findViewById(R.id.output);
        Duck duck = new Duck();
        Fish fish = new Fish();
        Seal seal = new Seal();
        Fox fox = new Fox();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(duck);
        animals.add(fish);
        animals.add(seal);
        animals.add(fox);
        for(Animal a : animals)
        {
            this.output.append("\nAnimal goes " + a.say());
            if(a instanceof Fun)
            {
                this.output.append("\n" + ((Fun)a).play());
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_animal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
