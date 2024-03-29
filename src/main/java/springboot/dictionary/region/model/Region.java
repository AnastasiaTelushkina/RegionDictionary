package springboot.dictionary.region.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String abbreviation;

    public Region() {
    }

    public Region(String name, String abbreviation) {
        this.name = name;
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Region{" + "id=" + this.id + ", name='" + this.name + '\'' + ", abbreviation='" + this.abbreviation + '\'' + '}';
    }

    public void setId(Long id) {
        this.id = id;
    }
}

