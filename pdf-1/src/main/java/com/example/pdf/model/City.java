package com.example.pdf.model;

public class City {

	private Long id;

    private String name;
    private int population;
    
    public City() {
    }
    
	public City(String name, int population) {
		super();
		this.name = name;
		this.population = population;
	}
	
	

	public City(Long id, String name, int population) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
    
	
    
}
