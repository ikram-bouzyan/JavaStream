package tp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import tp.Country.Continent;

public class Tp {

	public static void main(String[] args) {
		Country ABW = new Country("ABW","Aruba",Continent.AMERICA,"Caribbean");
		Country AFG = new Country("AFG","Afghanistan",Continent.ASIA,"Southern and Central Asia");
		Country AIA = new Country("AIA","Anguilla",Continent.AMERICA,"Caribbean");
		Country ALB = new Country("ALB","Albania",Continent.EUROPE,"Southern Europe");
		Country AND = new Country("AND","Andorra",Continent.EUROPE,"Southern Europe");
		Country ANT = new Country("ANT","Netherlands Antilles",Continent.AMERICA,"Caribbean");
		Country ARE =new Country("ARE","United Arab Emirates",Continent.ASIA,"Middle East");
		Country ARG =new Country("ARG","Argentina",Continent.AMERICA,"South America");
		Country ARM =new Country("ARM","Armenia",Continent.ASIA,"Middle East");
		Country ASM =new Country("ASM","American Samoa",Continent.OCEANIA,"Polynesia");
		Country ATG =new Country("ATG","Antigua and Barbuda",Continent.AMERICA,"Caribbean");
		Country BWA =new Country("BWA","Botswana",Continent.AFRICA,"Southern Africa");
		Country CAF =new Country("CAF","Central African Republic",Continent.AFRICA,"Central Africa");
		Country NLD =new Country("NLD","Netherlands",Continent.EUROPE,"Western Europe");
		Country DZA =new Country("DZA","Algeria",Continent.AFRICA,"Northern Africa");
		 
		
		
		
		List<City> cities = Arrays.asList(
				new City (1,"Kabul",AFG,"Kabol",1780000),
				new City (2,"Qandahar",AFG,"Qandahar",237500),
				new City (3,"Herat",AFG,"Herat",186800),
				new City (4,"Mazar-e-Sharif",AFG,"Balkh",127800),

				new City (5,"Amsterdam",NLD,"Noord-Holland",731200),
				new City (6,"Rotterdam",NLD,"Zuid-Holland",593321),
				new City (7,"Haag",NLD,"Zuid-Holland",440900),

				new City (8,"Willemstad",ANT,"Curaçao",2345),
				new City (9,"Tirana",ALB,"Tirana",270000),
				new City (10,"Alger",DZA,"Alger",2168000),
				new City (11,"Oran",DZA,"Oran",609823),
				new City (21,"Constantine",DZA,"Constantine",443727)
				);
		
		
		List<CountryLanguage> languages = Arrays.asList(
				new CountryLanguage (ABW,"Dutch",true,5.3),
				new CountryLanguage (ABW,"English",false,9.5),
				new CountryLanguage (ABW,"Papiamento",false,76.7),
				new CountryLanguage (ABW,"Spanish",false,7.4),
				new CountryLanguage (AFG,"Balochi",false,0.9),
				new CountryLanguage (AFG,"Dari",true,32.1),
				new CountryLanguage (AFG,"Pashto",true,52.4),
				new CountryLanguage (AFG,"Turkmenian",false,1.9),
				new CountryLanguage (AFG,"Uzbek",false,8.8),
				new CountryLanguage (AIA,"English",true,0.0),
				new CountryLanguage (ALB,"Albaniana",true,97.9),
				new CountryLanguage (ALB,"Greek",false,1.8),
				new CountryLanguage (ALB,"Macedonian",false,0.1),
				new CountryLanguage (AND,"Catalan",true,32.3),
				new CountryLanguage (AND,"French",false,6.2),
				new CountryLanguage (AND,"Portuguese",false,10.8),
				new CountryLanguage (AND,"Spanish",false,44.6),
				new CountryLanguage (ANT,"Dutch",true,0.0),
				new CountryLanguage (ANT,"English",false,7.8),
				new CountryLanguage (ANT,"Papiamento",true,86.2),
				new CountryLanguage (ARE,"Arabic",true,42.0),
				new CountryLanguage (ARE,"Hindi",false,0.0),
				new CountryLanguage (ARG,"Indian Languages",false,0.3),
				new CountryLanguage (ARG,"Italian",false,1.7),
				new CountryLanguage (ARG,"Spanish",true,96.8),
				new CountryLanguage (ARM,"Armenian",true,93.4),
				new CountryLanguage (ARM,"Azerbaijani",false,2.6),
				new CountryLanguage (ASM,"English",true,3.1),
				new CountryLanguage (ASM,"Samoan",true,90.6),
				new CountryLanguage (ASM,"Tongan",false,3.1),
				new CountryLanguage (ATG,"Creole English",false,95.7),
				new CountryLanguage (ATG,"English",true,0.0),
				new CountryLanguage (BWA,"Khoekhoe",false,2.5),
				new CountryLanguage (BWA,"Ndebele",false,1.3),
				new CountryLanguage (BWA,"San",false,3.5),
				new CountryLanguage (BWA,"Shona",false,12.3),
				new CountryLanguage (BWA,"Tswana",false,75.5),
				new CountryLanguage (CAF,"Banda",false,23.5),
				new CountryLanguage (CAF,"Gbaya",false,23.8),
				new CountryLanguage (CAF,"Mandjia",false,14.8),
				new CountryLanguage (CAF,"Mbum",false,6.4),
				new CountryLanguage (CAF,"Ngbaka",false,7.5),
				new CountryLanguage (CAF,"Sara",false,6.4),
				new CountryLanguage (DZA,"Arabic",true,86.0),
				new CountryLanguage (DZA,"Berberi",false,14.0),
				new CountryLanguage (NLD,"Arabic",false,0.9),
				new CountryLanguage (NLD,"Dutch",true,95.6),
				new CountryLanguage (NLD,"Fries",false,3.7),
				new CountryLanguage (NLD,"Turkish",true,0.8)

				);
		
		
		//1-	Afficher toutes les villes (triées par nom) ;
		
		List<String> cities1 = cities.stream()
				.map(c->c.getName())
				.sorted()
				.toList();
		
		cities1.forEach(System.out::println);
		System.out.println("------------Q1-----------");
		System.out.println("-----------Q2------------");
		//2-	Afficher toutes les langues (triées par pourcentage)
		List<CountryLanguage> language = languages.stream()
				.sorted(Comparator.comparing(CountryLanguage::getPercentage))
				.toList();
		
		language.forEach(System.out::println);
		System.out.println("------------Q2-----------");
		
		System.out.println("-----------Q3------------");
		//3-	Afficher les noms des villes et leur population, ayant comme « countryCode »  la valeur NLD ;
		List<City> cities2 = cities.stream()
				.filter(c->c.getCountry().getCode().equals("NLD"))
				.toList();
		cities2.forEach(c->System.out.println(c.getName() + " " + c.getPopulation()));
		
		System.out.println("------------Q3-----------");
		
		System.out.println("-----------Q4------------");
		//4-	Afficher les noms des villes dont la population est inférieure à 700000 ;
		cities.stream()
		.filter(c->c.getPopulation()<700000)
		.map(City::getName)
		.forEach(System.out::println);
		System.out.println("------------Q4-----------");
		
		System.out.println("------------Q5-----------");
		//5-	Afficher les noms des villes de l’« Afghanistan» ;
		cities.stream()
		.filter(c->"Afghanistan".equals(c.getCountry().getName()))
		.map(c->c.getName())
		.forEach(System.out::println);
		System.out.println("------------Q5-----------");
		
		System.out.println("------------Q6-----------");
		//6-	Afficher les langues utilisées dans « Netherlands» ;
		languages.stream()
		.filter(c->"Netherlands".equals(c.getCountry().getName()))
		.map(c->c.getLanguage())
		.forEach(System.out::println);
		System.out.println("------------Q6-----------");
		
		System.out.println("------------Q7-----------");
		//7-	Afficher la langue officielle utilisées dans « Argentina» ;
		languages.stream()
		.filter(c->"Argentina".equals(c.getCountry().getName()) && c.isIsOfficial())
		.map(c->c.getLanguage())
		.forEach(System.out::println);
		System.out.println("------------Q7-----------");
		
		System.out.println("------------Q8-----------");
		//8-	Afficher le pourcentage de la langue officielle utilisée dans « Argentina» ;
		languages.stream()
		.filter(c->"Argentina".equals(c.getCountry().getName()) && c.isIsOfficial())
		.map(c->c.getPercentage())
		.forEach(System.out::println);
		
		System.out.println("------------Q8-----------");
		
		System.out.println("------------Q9-----------");
		//9-	Afficher les pays dont le pourcentage de la langue officielle utilisée dépasse 20% 
		languages.stream()
		.filter(c->c.isIsOfficial() && c.getPercentage()>=20)
		.map(CountryLanguage::getCountry)
		.distinct()
		.forEach(System.out::println);
		
		System.out.println("------------Q9-----------");
		
		
		System.out.println("------------Q10-----------");
		//10-	Afficher les pays utilisant la langue « English »; 
		languages.stream()
		.filter(c->c.getLanguage().equals("English"))
		.map(CountryLanguage::getCountry)
		.forEach(System.out::println);
		
		System.out.println("------------Q10-----------");
		
		System.out.println("------------Q11-----------");
		//11-	Afficher les pays utilisant la langue « English » comme langue officielle ;
		languages.stream()
		.filter(c->c.getLanguage().equals("English") && c.isIsOfficial())
		.map(CountryLanguage::getCountry)
		.forEach(System.out::println);
		System.out.println("------------Q11-----------");
		System.out.println("------------Q12-----------");
		
		//11-	12-	Compter le nombre des villes existantes dans « Afghanistan» ;
		long nbVille = cities.stream()
		.filter(c->c.getCountry().getName()=="Afghanistan")
		.count();
		System.out.println(nbVille);
		System.out.println("------------Q12-----------");
		
		System.out.println("------------Q13-----------");
		//13-	Renvoyer le maximum de populations des villes dans « Afghanistan» ;
		int max = cities.stream()
		.filter(c->c.getCountry().getName()=="Afghanistan")
		.mapToInt(c->c.getPopulation())
		.max().getAsInt();
		System.out.println(max);
		System.out.println("------------Q13-----------");
		System.out.println("------------Q14-----------");
		//14-	Renvoyer la ville ayant le minimum de population dans « Afghanistan» ;
		System.out.println("------------Q14-----------");
		int min = cities.stream()
		.filter(c->c.getCountry().getName()=="Afghanistan")
		.mapToInt(c->c.getPopulation())
		.min().getAsInt();
		cities.stream()
		.filter(c->c.getPopulation()==min && c.getCountry().getName()=="Afghanistan")
		.map(City::getName)
		.forEach(System.out::println);
		System.out.println("------------Q14-----------");
		
		System.out.println("------------Q15-----------");
		//15-	Calculer la population totale du « Afghanistan »
		int totalPopulation = cities.stream()
		.filter(c->c.getCountry().getName()=="Afghanistan")
		.mapToInt(c->c.getPopulation()).sum();
		System.out.println(totalPopulation);
		System.out.println("------------Q15-----------");
		
		System.out.println("------------Q16-----------");
		//16-	Compter le nombre des villes ;
		System.out.println(cities.stream().count());
		System.out.println("------------Q16-----------");
		
		System.out.println("------------Q17-----------");
		//17-	Compter le nombre des pays ;
		System.out.println(languages.stream()
				.map(CountryLanguage::getCountry)
				.distinct()
				.count());
		System.out.println(languages.stream()
				.map(CountryLanguage::getCountry)
				.map(Country::getContinent)
				.distinct()
				.count());
		System.out.println("------------Q17-----------");
		
		System.out.println("------------Q18-----------");
		//18-	Compter le nombre des langues utilisées dans tous les pays;
		System.out.println(languages.stream()
				.map(CountryLanguage::getLanguage)
				.distinct()
				.count());
		System.out.println("------------Q18-----------");
		
		System.out.println("------------Q19-----------");
		//19-	Compter le nombre des langues officielles utilisées dans tous les pays;
		System.out.println(languages.stream()
				.filter(c->c.isIsOfficial())
				.map(CountryLanguage::getLanguage)
				.distinct()
				.count());
		System.out.println("------------Q19-----------");
		
		System.out.println("------------Q20-----------");
		//20-	Compter le nombre des langues par pays ;
		Map<Country, Long> nbLangueParPayes = languages.stream()
				.collect(Collectors.groupingBy(CountryLanguage::getCountry,Collectors.counting()));
		
		//System.out.println(nbLangueParPayes);
		nbLangueParPayes.forEach((k,v)->System.out.println(k.getName()+" "+v));
		System.out.println("------------Q20-----------");
//nbLangueParPayes
		System.out.println("------------Q21-----------");
		//21-	Compter le nombre des pays par continent ;
		Map<Country.Continent, Long> nbPayesParContinent = languages.stream()
				.collect(Collectors.groupingBy(l->l.getCountry().getContinent(),Collectors.counting()));
		nbPayesParContinent.forEach((k,v)->System.out.println(k+" "+v));

		System.out.println("------------Q21-----------");
		System.out.println("------------Q22-----------");

		
		//22-	Compter le nombre des langues non-officielles par pays ;
	
		System.out.println("------------Q22-----------");
Map<Country, Long> nbLangueNonOf =languages.stream()
.filter(l->l.isIsOfficial()!=true)
.collect(Collectors.groupingBy(l->l.getCountry(),Collectors.counting()));
nbLangueNonOf.forEach((k,v)->System.out.println(k.getName()+" "+v));

	
	}

}
