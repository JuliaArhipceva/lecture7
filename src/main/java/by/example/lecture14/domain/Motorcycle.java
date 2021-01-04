package by.example.lecture14.domain;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Motorcycle implements Externalizable {

    private String model;
    private String color;

    public Motorcycle() {
    }

    public Motorcycle(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF("model: " + model);
        out.writeUTF(color);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.model = in.readUTF().substring(7);
        this.color = in.readUTF();
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
