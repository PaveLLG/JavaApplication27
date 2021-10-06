import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.ArrayList;


public class JavaApplication27 {


    public static void main(String[] args) {
        ArrayList<Person> oldList = new ArrayList<>();

        oldList.add(new Person("Name1", 20));
        oldList.add(new Person("Name2", 40));

        ObservableList<Person> fxList = FXCollections.observableArrayList(oldList);

        fxList.addListener(new ListChangeListener<Person>() {
            @Override
            public void onChanged(Change<? extends Person> c) {

            }
        });

        //....

        fxList.add(new Person("Name3", 33));
        fxList.remove(0);

        for(Person person:oldList){

        }


    }
}


    class Person{
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }


