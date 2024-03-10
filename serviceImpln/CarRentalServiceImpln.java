package serviceImpln;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Car;
import service.CarRentalService;

public class CarRentalServiceImpln implements CarRentalService {
	ArrayList<Car> l1=new ArrayList<Car>();
	Scanner ip=new Scanner(System.in);
public void addCar(){
	System.out.println("enter the below car details");
	System.out.println("enter the car id");
	int cid=ip.nextInt();
	System.out.println("enter the brand name");
	String brand=ip.next();
	System.out.println("enter the color ");
	String color=ip.next();
	System.out.println("enter the price ");
	double price=ip.nextInt();
	System.out.println("enter the fueltype name");
	String fuelType=ip.next();
	System.out.println("enter the model name");
	int model=ip.nextInt();
	System.out.println("enter the milage name");
	int milage=ip.nextInt();

	l1.add(new Car(cid, brand, color, price, fuelType, model, milage));


}

@Override
public void allDetails() {
	System.out.println("------Car Details---------");
	int c=0;
	for(Car ele:l1)
	{
		System.out.println(ele);
		c++;
	}
	if(c==0)
	{
		System.out.println("No Data Found...!");
	}
	
}
@Override
public void findCarById() {
	System.out.println("Enter id car Id");
	int id=ip.nextInt();
	int c=0;
	for(Car ele:l1)
	{
		if(id==ele.getcId())
		{
			System.out.println(ele);
			c++;
			break;
		}
	}
	if(c==0)
	{
		System.out.println("Enter a valid ID");
	}
	
}
@Override
public void sortCarByCid() {
	Collections.sort(l1);
	int c=0;
	for(Car ele:l1)
	{
		System.out.println(ele);
		c++;
	}
	if(c==0)
	{
		System.out.println("Enter a valid ID");
	}
	
}
@Override
public void sortCarByPrice() {
	Collections.sort(l1,new SortByPrice());
	int c=0;
	for(Car ele:l1)
	{
		System.out.println(ele);
		c++;
	}
	if(c==0)
	{
		System.out.println("Enter a valid ID");
	}
	
	
}
@Override
public void sortCarByFuelType() {
	Collections.sort(l1,new sortByFuelType());
	int c=0;
	for(Car ele:l1)
	{
		System.out.println(ele);
		c++;
	}
	if(c==0)
	{
		System.out.println("Enter a valid ID");
	}
	
}
}

