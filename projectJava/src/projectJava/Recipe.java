package projectJava;

import java.util.ArrayList;

public class Recipe {

	int code;
	String name;
	int quantity;
	ArrayList<Ingredient> listIngredient;
	double kcal;
	double carbohidrates;
	double proteines;
	double fat;
	double salt;
	Allergen allergen;
	
	
	public Recipe(int code, String name, int quantity, ArrayList<Ingredient> listIngredient, double kcal,
			double carbohidrates, double proteines, double fat, double salt, Allergen allergen) {
		super();
		this.code = code;
		this.name = name;
		this.quantity = quantity;
		this.listIngredient = listIngredient;
		this.kcal = kcal;
		this.carbohidrates = carbohidrates;
		this.proteines = proteines;
		this.fat = fat;
		this.salt = salt;
		this.allergen = allergen;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public ArrayList<Ingredient> getListIngredient() {
		return listIngredient;
	}


	public void setListIngredient(ArrayList<Ingredient> listIngredient) {
		this.listIngredient = listIngredient;
	}


	public double getKcal() {
		return kcal;
	}


	public void setKcal(double kcal) {
		this.kcal = kcal;
	}


	public double getCarbohidrates() {
		return carbohidrates;
	}


	public void setCarbohidrates(double carbohidrates) {
		this.carbohidrates = carbohidrates;
	}


	public double getProteines() {
		return proteines;
	}


	public void setProteines(double proteines) {
		this.proteines = proteines;
	}


	public double getFat() {
		return fat;
	}


	public void setFat(double fat) {
		this.fat = fat;
	}


	public double getSalt() {
		return salt;
	}


	public void setSalt(double salt) {
		this.salt = salt;
	}


	public Allergen getAllergen() {
		return allergen;
	}


	public void setAllergen(Allergen allergen) {
		this.allergen = allergen;
	}
	
	
	
	

}
