/*
 *  This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * 
 * @author Dimitri Vasiliev
 *
 */

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SumIntList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		System.out.println("Sum using for loop: "+SumIntListForLoop(list));
		System.out.println("Sum using while loop: "+SumIntListWhileLoop(list));
		System.out.println("Sum using recursion: "+SumIntListRecursion(list));
	}
	/**
	 * This method sums the integers of a list using a for loop.
	 * @param list of integers to be summed up.
	 * @return Integer with the sum of the elements in the list.
	 */
	public static int SumIntListForLoop(List<Integer> list ){
		int sum = 0;
		for(Integer number : list){
			sum += number;
		}
		return sum;
	}
	
	/**
	 * This method sums the integers of a list using a while loop and an iterator.
	 * @param list of integers to be summed up.
	 * @return Integer with the sum of the elements in the list.
	 */
	public static int SumIntListWhileLoop(List<Integer> list){
		int sum = 0;
		Iterator<Integer> itr = list.iterator(); 
		while(itr.hasNext()){
			sum += (int)itr.next();
		}
		return sum;
	}

	/**
	 * This method sums the integers of a list recursively.
	 * @param list of integers to be summed up.
	 * @return Integer with the sum of the elements in the list.
	 */
	public static int SumIntListRecursion(List<Integer> list){
		if (list.isEmpty() == true ) {
			return 0;
        	}
        	else {
        		return list.get(0) + SumIntListRecursion(list.subList(1, list.size()));
        	}
	}
}
