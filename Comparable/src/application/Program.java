package application;

import model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        String path = "/home/larramendi/IdeaProjects/Interfaces/Comparable/src/files/name_and_salary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String emplyeeCSV = br.readLine();
            while (emplyeeCSV != null) {
                String[] fields = emplyeeCSV.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                emplyeeCSV = br.readLine();
            }
            Collections.sort(list); //Operação que ordena a lista (CompareTo());
            for (Employee e : list) {
                System.out.println(e.getName() + ", " + e.getSalary());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

