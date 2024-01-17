package tp;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class Country {
		private String code;
		private String name;
		private Continent continent;
		private String region;

		public static enum Continent{
			ASIA,EUROPE,AMERICA,AFRICA,OCEANIA;
		}
		
	public Country(String code, String name, Continent continent, String region) {
			super();
			this.code = code;
			this.name = name;
			this.continent = continent;
			this.region = region;
		}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		return Objects.equals(code, other.code) && continent == other.continent && Objects.equals(name, other.name)
				&& Objects.equals(region, other.region);
	}
	
	
	
	

}
