package app;
import java.util.Scanner;

import service.CarRentalService;
import serviceImpln.CarRentalServiceImpln;

public class CarRentalApp {
	public static void main(String[] args) {
		System.out.println("\t\t=======welcome To Car Rental System=======");
		Scanner ip=new Scanner(System.in);
		CarRentalService c1=new CarRentalServiceImpln();//upcasting
		while(true)
		{
			System.out.println("----Menu------");
			System.out.println("1.Add\n2.All Details\n3.Find Car By ID\n4.sort Details by cid\n5.Sort by Price\n6.Sort by Fuel Type\n7.Exit");
			int op=ip.nextInt();
			
			switch(op)
			{
			case 1:c1.addCar();break;
			case 2:c1.allDetails();break;
			case 3:c1.findCarById();break;
			case 4:c1.sortCarByCid();break;
			case 5:c1.sortCarByPrice();break;
			case 6:c1.sortCarByFuelType();break;
			case 7:System.out.println("--------Thank You Visit Again---------");
				   System.exit(0);
			default:System.out.println("Invalid Option...!");
			
			}
		}
	}

}
