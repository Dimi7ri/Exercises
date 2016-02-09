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

public class ElimDuplicElements {

	public static void main(String[] args) {
		String[] Example = {"a","b","c","d","a","c","d","d","a"};
		System.out.println("Using HashSet: "+RemoveDuplicatesHash(Example));
	}
	
	/**
	 * This method removes duplicate elements using a property of Set.
	 * @param example Array of Strings
	 * @return String without duplicated elements.
	 */
	public static String RemoveDuplicatesHash(String[] example){
		HashSet<String> myhash = new HashSet<String>();
		for(String letters: example)
			myhash.add(letters);
		
		return myhash.toString();
	}

}
