package by.epam.tat.lecture2.task1.utils.comparators;

import java.util.Comparator;

import by.epam.tat.lecture2.task1.objects.Sweets;

public class WeightComparator implements Comparator<Sweets>{
	public int compare(Sweets o1, Sweets o2){
		return o2.getWeight() - o1.getWeight();
	}
}
