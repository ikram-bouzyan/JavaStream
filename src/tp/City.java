package tp;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;



public class City {
private int id;
private String name;
private Country country;
private String district;
private int population;

public City(int id, String name, Country country, String district, int population) {
	super();
	this.id = id;
	this.name = name;
	this.country = country;
	this.district = district;
	this.population = population;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Country getCountry() {
	return country;
}
public void setCountry(Country country) {
	this.country = country;
}
public int getPopulation() {
	return population;
}
public void setPopulation(int population) {
	this.population = population;
}

public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	district = district;
}
@Override
public String toString() {
	return "City [id=" + id + ", name=" + name + ", country=" + country + ", population=" + population + "]";
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	City other = (City) obj;
	return Objects.equals(country, other.country) && Objects.equals(district, other.district) && id == other.id
			&& Objects.equals(name, other.name) && population == other.population;
}



	
}

