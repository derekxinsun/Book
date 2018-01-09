/**
 * Xi Chen 27276605 & Xin Sun 40038821
 * COMP249
 * Assignment #2
 * Due Date 10/13/2017
 * 
 * Program introduction: A class for Book with 3 constructors and mutators and accessers.
 * Overriding equals and toString methods.
 * Appropriate access rights  
 */
package book;


public class Book extends paperpublication.PaperPublication{
	protected long iSBN;
	protected int issueYear;
	protected String authorName;

	/**
	 * constructors
	 */
	public Book(){
		super();
		iSBN=0;
		issueYear=0;
		authorName=null;
	}
	
	public Book(String title, double price, int numOfPage, long iSBN, int issueYear,String authorName){
		super(title,price,numOfPage);
		this.iSBN=iSBN;
		this.issueYear=issueYear;
		this.authorName=authorName;
	}
	
	public Book(Book other){
		super(other);
		this.iSBN=other.iSBN;
		this.issueYear=other.issueYear;
		this.authorName=other.authorName;
	}
	
	/**
	 * mutators and accessers.
	 */
	public void setISBN(long iSBN){
		iSBN=this.iSBN;
	}
	public long getISBN(){
		return iSBN;
	}
	public void setIssueYear(int issueYear){
		this.issueYear=issueYear;
	}
	public int getIssueYear(){
		return issueYear;
	}
	public void setAuthorName(String authorName){
		this.authorName=authorName;
	}
	public String getAuthorName(){
		return authorName;
	}
	
	public boolean equals(Object x){
		if(super.equals(x)){
			Book p = (Book)x;
			//the paperQuality and issuingFrequency maybe null, it have to be compared after null is eliminated.
			if(this.authorName==null && p.authorName==null)
				return(this.issueYear==p.issueYear && this.iSBN==p.iSBN);
			else if((this.authorName!=null && p.authorName==null)||(this.authorName==null && p.authorName!=null))
				return false;
			else
				return (this.authorName.equals(p.authorName)&& this.issueYear==p.issueYear&& this.iSBN==p.iSBN );
		}
		else
			return false;
		
	}
	
	public String toString(){
		return "This Book has "+ numOfPage + " pages, and costs $"+ price + 
				". It's title is "+title+". ISBN#: "+iSBN+
				", issued in "+issueYear+" and writen by "+authorName+".";
	}
}
