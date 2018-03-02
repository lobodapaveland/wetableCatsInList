package com.example.pavel.wetableinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button addCat, addDog, wetAll;
    private TextView countAnimals;
    private EditText catName, dogName;

    private int countOfAnimals;

    private ArrayList<Animal> animalList = new ArrayList<>();

    private static final String TAG = "CatsData";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addCat = (Button) findViewById(R.id.add_cat);
        addDog = (Button) findViewById(R.id.add_dog);
        wetAll = (Button) findViewById(R.id.wet_all);

        countAnimals = (TextView) findViewById(R.id.count_of_animals);

        catName = (EditText) findViewById(R.id.name_cat);
        dogName = (EditText) findViewById(R.id.name_dog);

        addCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameOfNewCat = catName.getText().toString();
                Cat newCat = new Cat(nameOfNewCat, false);

                addNewCatToList(newCat);
                countOfAnimals ++;

                Toast.makeText(MainActivity.this, "New Cat was added" + "With name" + nameOfNewCat, Toast.LENGTH_SHORT).show();
            }
        });

        addDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameOfNewDog = dogName.getText().toString();
                Dog newDog = new Dog(nameOfNewDog, false);

                addNewDogToList(newDog);
                countOfAnimals ++;

                Toast.makeText(MainActivity.this, "New Dog was added" + "With name" + nameOfNewDog, Toast.LENGTH_SHORT).show();


            }
        });

        wetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wetAllAnimals();
            }
        });
    }

    private void addNewCatToList(Cat newCat) {
        animalList.add(newCat);
    }
    private void addNewDogToList(Dog newDog){
        animalList.add(newDog);
    }
    private void wetAllAnimals(){
        for (Animal animal : animalList){
            animal.wet();
            Log.d(TAG, String.valueOf(animal.getCondition()));
        }
    }
}
