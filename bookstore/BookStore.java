/**
 * Xi Chen 27276605 & Xin Sun 40038821
 * COMP249
 * Assignment #2
 * Due Date 10/13/2017
 * 
 * Program introduction: This is a program to compare difference paper publications
 * and get the book has the least number of pages and the one that has the most number of pages.
 *
 *
 */
package bookstore;

import magazine.*;
import magazine.Magazine.*;
import journal.*;
import paperpublication.*;
import book.*;

public class BookStore {

	public static void main(String[] args) {
		/**
		 * create different paper publications
		 */
		PaperPublication p1 = new PaperPublication("PaperP",25,360);

		Book b1 = new Book("Book", 20, 300, 27270001, 1990, "John");
		
		ChildrenBook c1 = new ChildrenBook("Benjamin", 15, 180, 27270002, 1970, "Benjamin", 6);

		EducationalBook e1 = new EducationalBook ("Calculus", 23, 480, 27270003, 1870, "Newton", 16, null);
	
		Journal j1 = new Journal("Times", 5, 60, 4003001,"Politics");
		
		Magazine m1 = new Magazine("Playboy", 12, 50, PaperQuality.HIGH, IssuingFrequency.MONTHLY);
		
		PaperPublication p2 = new PaperPublication("PaperP",23,700);

		Book b2 = new Book("Book", 21, 600, 27270001, 1990, "John");
		
		ChildrenBook c2 = new ChildrenBook("Benjamin", 15, 180, 27270002, 1970, "Benjamin", 6);

		EducationalBook e2 = new EducationalBook ("Calculus", 24, 800, 27270005, 1870,null, 16, "Math");
	
		Journal j2 = new Journal("Times", 22, 100, 4003001,"Politics");
		
		Magazine m2 = new Magazine("Playboy", 12, 50, PaperQuality.HIGH, IssuingFrequency.MONTHLY);
		
		Journal j3 = new Journal("News", 5, 80, 4003007,"News");
		
		Magazine m3 = new Magazine("Games", 13, 20, PaperQuality.LOW, IssuingFrequency.WEEKLY);
		
		PaperPublication p3 = new PaperPublication("Publication",23,568);
		
		/**
		 * Compare them with equals methods
		 */
		System.out.println("comparing p1 & p2");
		System.out.println("p1: "+p1+"\np1: "+ p2);
		System.out.println(p1.equals(p2)?"same book":"not the same book");
		System.out.println("comparing b1 & b2");
		System.out.println("b1: "+b1+"\nb2: "+ b2);
		System.out.println(b1.equals(b2)?"same book":"not the same book");
		System.out.println("comparing c1 & c2");
		System.out.println("c1: "+c1+"\nc2: "+ c2);
		System.out.println(c1.equals(c2)?"same book":"not the same book");
		System.out.println("comparing e1 & e2");
		System.out.println("e1: "+e1+"\ne2: "+ e2);
		System.out.println(e1.equals(e2)?"same book":"not the same book");
		System.out.println("comparing j1 & j2");
		System.out.println("j1: "+j1+"\nj2: "+ j2);
		System.out.println(j1.equals(j2)?"same book":"not the same book");
		System.out.println("comparing m1 & m2");
		System.out.println("m1: "+m1+"\nm2: "+ m2);
		System.out.println(m1.equals(m2)?"same book":"not the same book");
		System.out.println();
		
		/**
		 * Put all the paper publications into an array and find the one with most pages and least pages.
		 */
		PaperPublication[] array ={p1,b1,c1,e1,j1,m1,p2,b2,c2,e2,j2,m2,j3,m3,p3};
		int max = array[0].getNumOfPage();
		int maxIndex=0;
		for(int i=0;i<array.length;i++){
			if(array[i].getNumOfPage()>=max){
				max = array[i].getNumOfPage();
				maxIndex = i;
			}
		}
		System.out.println(array[maxIndex]+"\nhas most number of pages on location " +maxIndex);
		
		System.out.println();
		
		int min = array[0].getNumOfPage();
		int minIndex=0;
		for(int i=0;i<array.length;i++){
			if(array[i].getNumOfPage()<=min){
				min = array[i].getNumOfPage();
				minIndex = i;
			}
		}
		System.out.println(array[minIndex]+"\nhas least number of pages on location " +minIndex);
	
	
	}
	
	
	
}
