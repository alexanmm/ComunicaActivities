package br.com.digitalhouse.comunicaactivities.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable {

    //Attributes
    private String nome;
    private String profession;
    private int age;

    //Constructor
    public Person() {
    }

    public Person(String nome, String profession, int age) {
        this.nome = nome;
        this.profession = profession;
        this.age = age;
    }

    protected Person(Parcel in) {
        nome = in.readString();
        profession = in.readString();
        age = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeString(profession);
        dest.writeInt(age);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Methods

}
