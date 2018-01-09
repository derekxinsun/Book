/*
 * Program introduction: A class for EducationalBook with 3 constructors and mutators and accessers.
 * Overriding equals and toString methods.
 * Appropriate access rights  
 */
package book;

public class EducationalBook extends Book{
	private int editionNum;
	private String field;

	/**
	 * constructors
	 */
	public EducationalBook(){
		super();
		editionNum=0;
		field=null;
	}
	
	public EducationalBook(String title, double price, int numOfPage, long iSBN, int issueYear, String authorName, int editionNum, String field){
		super(title,price,numOfPage,iSBN,issueYear,authorName);
		this.editionNum=editionNum;
		this.field=field;
	}
	
	public EducationalBook(EducationalBook other){
		super(other);
		this.editionNum=other.editionNum;
		this.field=other.field;
	}
	
	/**
	 * mutators and accessers.
	 */
	public void setEditionNum(int editionNum){
		this.editionNum=editionNum;
	}
	public int getEditionNum(){
		return editionNum;
	}
	public void setField(String field){
		this.field=field;
	}
	public String getField(){
		return field;
	}
	
	public boolean equals(Object x){
		if(super.equals(x)){
			EducationalBook p = (EducationalBook)x;
			//the paperQuality and issuingFrequency maybe null, it have to be compared after null is eliminated.
			if(this.field==null && p.field==null)
				return(this.editionNum==p.editionNum);
			else if((this.field!=null && p.field==null)||(this.field==null && p.field!=null))
				return false;
			else
				return (this.field.equals(p.field)&& this.editionNum==p.editionNum);
		}
		else
			return false;
		
	}
	
	public String toString(){
		return "This Educational Book has "+ numOfPage + " pages, and costs $"+ price+ 
				". It's title is "+title+". ISBN#:"+iSBN+" Edition#:"+editionNum+
				", issued in "+issueYear+" and writen by "+authorName+
				", in the filed of "+field+".";
	}
}
