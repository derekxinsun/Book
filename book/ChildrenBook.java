/**
 * Xi Chen 27276605 & Xin Sun 40038821
 * COMP249
 * Assignment #2
 * Due Date 10/13/2017
 * 
 * Program introduction: A class for ChildrenBook with 3 constructors and mutators and accessers.
 * Overriding equals and toString methods.
 * Appropriate access rights  
 */
package book;

public class ChildrenBook extends Book{
	private int minAge;

	/**
	 * constructors
	 */
	public ChildrenBook(){
		super();
		minAge=0;
	}
	
	public ChildrenBook(String title, double price, int numOfPage, long iSBN, int issueYear,String authorName, int minAge){
		super(title,price,numOfPage,iSBN,issueYear,authorName);
		this.minAge=minAge;
	}
	
	public ChildrenBook(ChildrenBook other){
		super(other);
		this.minAge=other.minAge;
	}
	
	/**
	 * mutators and accessers.
	 */
	public void setMinAge(int minAge){
		this.minAge=minAge;
	}
	public int getMinAge(){
		return minAge;
	}
	
	public boolean equals(Object x){
		if(super.equals(x)){
			ChildrenBook p = (ChildrenBook)x;
			return (this.minAge==p.minAge);
		}
		else
			return false;
		
	}
	
	public String toString(){
		return "This Children Book has "+ numOfPage + " pages, and costs $"+ price + 
				". It's title is "+title+". ISBN#:"+iSBN+
				", issued in "+issueYear+" and writen by "+authorName+". It is suitable for age " +minAge+
				" and up.";
	}
	
	
}
