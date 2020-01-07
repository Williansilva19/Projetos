package entities;

import entities.enums.color.Color;

public class Rectangle extends Shape {
	
	private double width;
	private double height;
	
	public Rectangle () {super(); }

	public Rectangle(Color color, double width, double heigth) {
		super(color);
		this.width = width;
		this.height = heigth;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}
	public void setHeight(double heigth) {
		this.height = height;
	}
	@Override
	public double area() {

		return width * height;
	}
}
