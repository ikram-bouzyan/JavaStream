package tp;

import java.util.Objects;

public class CountryLanguage {
	private Country country;
	private String language;
	private boolean IsOfficial;
	private double percentage;
	public CountryLanguage(Country country, String language, boolean isOfficial, double percentage) {
		super();
		this.country = country;
		this.language = language;
		IsOfficial = isOfficial;
		this.percentage = percentage;
	}
	
	@Override
	public String toString() {
		return "CountryLanguage [Country=" + country + ", language=" + language + ", IsOfficial=" + IsOfficial
				+ ", percentage=" + percentage + "]";
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public boolean isIsOfficial() {
		return IsOfficial;
	}

	public void setIsOfficial(boolean isOfficial) {
		IsOfficial = isOfficial;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountryLanguage other = (CountryLanguage) obj;
		return Objects.equals(country, other.country) && IsOfficial == other.IsOfficial
				&& Objects.equals(language, other.language)
				&& Double.doubleToLongBits(percentage) == Double.doubleToLongBits(other.percentage);
	}
	
	
	
	 
}
