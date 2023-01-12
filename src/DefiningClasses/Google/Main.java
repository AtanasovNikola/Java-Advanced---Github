package DefiningClasses.Google;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Person> map = new LinkedHashMap<>();
        while (!input.equals("End")) {

            String[] currentPerson = input.split("\\s+");
            String name = currentPerson[0];
            Company company = null;
            Pokemon pokemon = null;
            Parents parents = null;
            Children children = null;
            Car car = null;
            switch (currentPerson[1]) {
                case "company":
                    String companyName = currentPerson[2];
                    String department = currentPerson[3];
                    double salary = Double.parseDouble(currentPerson[4]);
                    company = new Company(companyName, department, salary);
                    break;
                case "pokemon":
                    String pokemonName = currentPerson[2];
                    String pokemonType = currentPerson[3];
                    pokemon = new Pokemon(pokemonName, pokemonType);
                    break;
                case "parents":
                    String parentName = currentPerson[2];
                    String parentBirthday = currentPerson[3];
                    parents = new Parents(parentName, parentBirthday);
                    break;
                case "children":
                    String childName = currentPerson[2];
                    String childBirthday = currentPerson[3];
                    children = new Children(childName, childBirthday);
                    break;
                case "car":
                    String carModel = currentPerson[2];
                    int carSpeed = Integer.parseInt(currentPerson[3]);
                    car = new Car(carModel, carSpeed);
                    break;
            }

            map.putIfAbsent(name, new Person(name, company, car, pokemon, parents, children));
            if (map.get(name).getCar() == null && car != null) {
                map.get(name).setCar(car);
            } else if (map.get(name).getChildren() == null && children != null) {
                map.get(name).setChildren(children);
            } else if (map.get(name).getPokemon() == null && pokemon != null) {
                map.get(name).setPokemon(pokemon);
            } else if (map.get(name).getCompany() == null && company != null) {
                map.get(name).setCompany(company);
            } else if (map.get(name).getParents() == null && parents != null) {
                map.get(name).setParents(parents);
            }


            input = scanner.nextLine();
        }
        //Parents:
        //Children:
        String name = scanner.nextLine();
        Person person = map.get(name);
        System.out.println(person.getName());
        System.out.println("Company:");
        if (person.getCompany()!=null) {
            Company company = person.getCompany();
            System.out.printf("%s %s %.2f%n", company.getCompanyName(), company.getDepartment(), company.getSalary());
        }
        System.out.println("Car:");
        if (person.getCar() != null) {
            Car car = person.getCar();
            System.out.printf("%s %s%n", car.getModel(), car.getSpeed());
        }
        System.out.println("Pokemon:");
        if (person.getPokemon()!=null) {
            Pokemon pokemon = person.getPokemon();
            System.out.printf("%s %s%n", pokemon.getName(), pokemon.getType());
        }
        System.out.println("Parents:");
        if (person.getParents()!=null) {
            Parents parents = person.getParents();
            System.out.printf("%s %s%n", parents.getName(), parents.getBirthday());
        }
        System.out.println("Children:");
        if (person.getChildren()!=null) {
            Children children = person.getChildren();
            System.out.printf("%s %s%n", children.getName(), children.getBirthday());
        }
    }
}
