package model.entities;

public class Employee implements Comparable<Employee>{

    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        return salary.compareTo(otherEmployee.getSalary());

        //Retorna um numero inteiro de acordo com a comparação.
        // Se retorna um numero POSITIVO -> O que valor que eu quero comparar é MAIOR;
        // Se retorna um numero NEGATIVO -> O valor que eu quero comparar é MENOR;
        // Se retorna o valor ZERO -> Os valores que estou comparando são iguais;
    }
}
