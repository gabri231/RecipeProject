package projectJava;

import java.sql.Date;
import java.util.ArrayList;

public class Recipe {
	private int code;
	private String name;
	private int quantity;
	private ArrayList<Ingredient> ingredientList = new ArrayList<Ingredient>();
	private double kCcal;
	private double carboHidrates;
	private double proteins;
	private double fat;
	private double salt;
	private ArrayList<Allergen> allergenList = new ArrayList<Allergen>();
	private String cuisine;
	private Date dateOfCreation;
	
	
	
	
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
	public ArrayList<Ingredient> getIngredientList() {
		return ingredientList;
	}
	public void setIngredientList(ArrayList<Ingredient> ingredientList) {
		this.ingredientList = ingredientList;
	}
	public double getkCcal() {
		return kCcal;
	}
	public void setkCcal(double kCcal) {
		this.kCcal = kCcal;
	}
	public double getCarboHidrates() {
		return carboHidrates;
	}
	public void setCarboHidrates(double carboHidrates) {
		this.carboHidrates = carboHidrates;
	}
	public double getProteins() {
		return proteins;
	}
	public void setProteins(double proteins) {
		this.proteins = proteins;
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
	public ArrayList<Allergen> getAllergenList() {
		return allergenList;
	}
	public void setAllergenList(ArrayList<Allergen> allergenList) {
		this.allergenList = allergenList;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public Date getDateOfCreation() {
		return dateOfCreation;
	}
	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}
	

	
	public void agregarIngrediente(Ingredient ingrediente){
		
	}
	
	public void agregarProcedimiento(CookingProcedure procedimiento) {
		
	}
	
	
	@Override
	public String toString() {
		return "Recipe [code=" + code + ", name=" + name + ", quantity=" + quantity + ", ingredientList="
				+ ingredientList + ", kCcal=" + kCcal + ", carboHidrates=" + carboHidrates + ", proteins=" + proteins
				+ ", fat=" + fat + ", salt=" + salt + ", allergenList=" + allergenList + ", cuisine=" + cuisine
				+ ", dateOfCreation=" + dateOfCreation + "]";
	}
	
	
		
	
}
