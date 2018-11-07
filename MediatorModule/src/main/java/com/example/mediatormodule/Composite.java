package com.example.mediatormodule;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.print(name);
        if(null != components){

        }
    }
}
