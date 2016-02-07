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

public class SumMostCommonInt {

	public static void main(String[] args) {
		int[]Example = {2,7,8,9,2,4,5,2,4};
		System.out.println(SumMostCommonIntA(Example));
		
		
	}
	/**
	 * This method sums the most common integers of an array.
	 * @param Array of integers to find the most repeated element and sum it up.
	 * @return Integer with the sum of the most repeated element in the array.
	 */
	public static int SumMostCommonIntA(int[] Array){
		int TempCount = 0 , Counter = 0 , CommElem = 0;
		for(int I = 0 ; I < Array.length ; I++){
			for(int J = 0 ; J < Array.length ; J++){
					if(Array[I]==Array[J]){
						TempCount++;
					}
					if(TempCount > Counter){
						CommElem = Array[I];
						Counter = TempCount;
					}
			}
			TempCount = 0;
		}
		return CommElem * Counter;
	}
}
