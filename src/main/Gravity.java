/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

import java.util.Scanner;

public class Gravity {
	public static void main(String[] args) {
		Scanner br = new Scanner(System.in);
		double time, speed, distance;
		double g = 9.8;
		System.out.println("enter the time");
		time = br.nextDouble();
		speed = g * time;
		distance = (g * time * time) / 2;
		System.out.println("The speed of the object at" + time + " seconds after its release is " + speed + "and the distance the object has travelled in the" + time + "seconds after the relase is " + distance);
	}
}
