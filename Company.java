package com.mycompany.company.system;

import java.util.ArrayList;


public class Company implements Subject{
public String name;
    public Employee head;
    ArrayList<Department> departments;
    ArrayList<Observer> observers;
    
 public Company(String name, Employee head) {
        this.name = name;
        this.head = head;
        this.departments = new ArrayList<>();
        this.observers = new ArrayList<>();
    }
public void addDepartment(Department department) {
        this.departments.add(department);
        this.addObserver(department);
        
        this.notifyObservers();
    }
public void removeDepartment(Department department) {
        this.departments.remove(department);
        this.removeObserver(department);
        
        this.notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }
   @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }
     @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}


