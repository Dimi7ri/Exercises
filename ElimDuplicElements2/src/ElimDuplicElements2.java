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

import java.util.HashSet;

public class ElimDuplicElements2 {

	public static void main(String[] args) {
		String Example = "abcdacdda";
		System.out.println("Using HashSet: "+RemoveDuplicatesHash2(Example));
	}
	
	/**
	 * This method removes duplicate elements of a String using a property of Set.
	 * @param example String
	 * @return String without duplicated elements.
	 */
	public static String RemoveDuplicatesHash2(String example){
		char[] exampleChar = example.toCharArray();
		HashSet<Character> myhash = new HashSet<Character>();
		for(char letters: exampleChar)
			myhash.add(letters);
		
		StringBuilder sb = new StringBuilder();
		for (Character string : myhash) {
		    sb.append(string);
		}
		
		return sb.toString();
	}

}
