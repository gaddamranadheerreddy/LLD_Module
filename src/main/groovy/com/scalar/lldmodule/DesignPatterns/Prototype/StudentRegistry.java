package com.scalar.lldmodule.DesignPatterns.Prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> registry;

    //Constructor
    public StudentRegistry() {
        registry = new HashMap<>();
    }

    public void put(String key, Student student) {
        registry.put(key, student);
    }

    public Student get(String key) {
        return registry.get(key);
    }
}
