package DefiningClasses.Google;

public class Person {
    private String name;
    private Company company;
    private Car car;
    private Pokemon pokemon;
    private Parents parents;
    private Children children;



    public Person(String name, Company company, Car car, Pokemon pokemon,Parents parents, Children children) {
        this.name = name;
        this.company = company;
        this.car = car;
        this.parents = parents;
        this.children = children;
        this.pokemon = pokemon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Parents getParents() {
        return parents;
    }

    public void setParents(Parents parents) {
        this.parents = parents;
    }

    public Children getChildren() {
        return children;
    }

    public void setChildren(Children children) {
        this.children = children;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }



}
