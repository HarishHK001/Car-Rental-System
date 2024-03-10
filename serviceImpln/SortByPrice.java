package serviceImpln;

import java.util.Comparator;

import entity.Car;

public class SortByPrice implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		if(o1.getPrice()>o2.getPrice())
		{
			return 1;
		}
		else if(o1.getPrice()<o2.getPrice())
		{
			return -1;
		}
		return 0;
	}
	

}
class sortByFuelType implements Comparator<Car>
{

	@Override
	public int compare(Car o1, Car o2) {
		
		return o1.getFuelType().compareTo(o2.getFuelType());
	}
	
}
