/**
 * Xi Chen 27276605 & Xin Sun 40038821
 * COMP249
 * Assignment #2
 * Due Date 10/13/2017
 * 
 * Program introduction: A class for EducationalBook with 3 constructors and mutators and accessers.
 * Overriding equals and toString methods.
 * Appropriate access rights  
 */
package journal;


public class Journal extends paperpublication.PaperPublication{
	private int issueNumber;
	private String field;
	
	/**
	 * constructors
	 */
	public Journal(){
		super();
		issueNumber=0;
		field=null;
	}
	
	public Journal(String title, double price, int numOfPage,int issueNumber,String field){
		super(title, price, numOfPage);
		this.issueNumber=issueNumber;
		this.field=field;
	}
	
	public Journal(Journal other){
		super(other);
		this.issueNumber=other.issueNumber;
		this.field=other.field;
	}
	
	/**
	 * mutators and accessers.
	 */
	public void setIssueNumber(int issueNumber){
		this.issueNumber=issueNumber;
	}
	public int getIssueNumber(){
		return issueNumber;
	}
	public void setField(String field){
		this.field=field;
	}
	public String getField(){
		return field;
	}
	
	public boolean equals(Object x){
		if(super.equals(x)){
			Journal p = (Journal)x;
			//the paperQuality and issuingFrequency maybe null, it have to be compared after null is eliminated.
			if(this.field==null && p.field==null)
				return(this.issueNumber==p.issueNumber);
			else if((this.field!=null && p.field==null)||(this.field==null && p.field!=null))
				return false;
			else
				return (this.field.equals(p.field)&& this.issueNumber==p.issueNumber);
		}
		else
			return false;
		
	}
	public String toString(){
		return "This Journal has "+ numOfPage + " pages, and costs $"+ price + 
				". It's title is "+title+". Issue number is "+issueNumber+
				", in the filed of "+field+".";
	}
	
	

	
}



