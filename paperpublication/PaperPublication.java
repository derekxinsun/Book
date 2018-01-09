/**
 * Xi Chen 27276605 & Xin Sun 40038821
 * COMP249
 * Assignment #2
 * Due Date 10/13/2017
 * 
 * Program introduction: A class for PaperPublication with 3 constructors and mutators and accessers.
 * Overriding equals and toString methods.
 * Appropriate access rights  
 */

package paperpublication;

public class PaperPublication {
	
	protected String title;
	protected double price;
	protected int numOfPage;
	
	/**
	 * constructors
	 */
	public PaperPublication(){
		title = null;
		price=0;
		numOfPage=0;
	}
	
	public PaperPublication(String title, double price, int numOfPage){
		this.title = title;
		this.price = price;
		this.numOfPage = numOfPage;
	}
	
	public PaperPublication(PaperPublication other){
		this.title = other.title;
		this.price=other.price;
		this.numOfPage=other.numOfPage;
	}
	
	/**
	 * mutators and accessers.
	 */
	public void setTitle(String title){
		this.title=title;
	}
	public String getTitle(){
		return title;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public double getPrice(){
		return price;
	}
	public void setNumOfPage(int numOfPage){
		this.numOfPage=numOfPage;
	}
	public int getNumOfPage(){
		return numOfPage;
	}
	
	public boolean equals(Object x){
		if (x == null || this == null || this.getClass()!= x.getClass())
			// "this == null" is actually useless, when the calling object is null, it will crash before the method runs.
			return false;
		else
		{
			PaperPublication p = (PaperPublication)x;
			//the title maybe null, it have to be compared after null is eliminated.
			if(this.title==null && p.title==null)
				return(this.price == p.price && this.numOfPage == p.numOfPage);
			else if((this.title==null && p.title!=null)||(this.title!=null && p.title==null))
				return false;
			else
				return (this.title.equals(p.title) && this.price == p.price && this.numOfPage == p.numOfPage);
		}
		
	}
	
	public String toString(){
		return "This Paper Publication has "+ numOfPage +
				" pages, and costs $"+ price + ". It's title is "+title+".";
}

}
