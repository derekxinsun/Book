/**
 * Xi Chen 27276605 & Xin Sun 40038821
 * COMP249
 * Assignment #2
 * Due Date 10/13/2017
 * 
 * Program introduction: A class for Magazine with 3 constructors and mutators and accessers.
 * Overriding equals and toString methods.
 * Appropriate access rights
 */

package magazine;

public class Magazine extends paperpublication.PaperPublication{
	public enum PaperQuality {HIGH, NORMAL, LOW};
	public enum IssuingFrequency {WEEKLY, MONTHLY, YEARLY};
	
	private PaperQuality paperQuality;
	private IssuingFrequency issuingFrequency;
	
	/**
	 * constructors
	 */
	public Magazine(){
		super();
		paperQuality = null;
		issuingFrequency = null;
	}
	
	public Magazine(String title, double price, int numOfPage, PaperQuality paperQuality, IssuingFrequency issuingFrequency){
		super(title, price, numOfPage);
		this.paperQuality = paperQuality;
		this.issuingFrequency = issuingFrequency;
	}
	
	public Magazine(Magazine other){
		super(other);
		this.paperQuality = other.paperQuality;
		this.issuingFrequency = other.issuingFrequency;
	}
	/**
	 * mutators and accessers.
	 */
	public void setPaperQuality(PaperQuality paperQuality){
		this.paperQuality=paperQuality;
	}
	public PaperQuality getPaperQuality(){
		return paperQuality;
	}
	public void setIssuingFrequency(IssuingFrequency issuingFrequency){
		this.issuingFrequency=issuingFrequency;
	}
	public IssuingFrequency getIssuingFrequency(){
		return issuingFrequency;
	}
	
	public boolean equals(Object x){
		if(super.equals(x)){
			Magazine p = (Magazine)x;
			//the paperQuality and issuingFrequency maybe null, it have to be compared after null is eliminated.
			if(this.paperQuality==null && p.paperQuality==null){
				if(this.issuingFrequency==null && p.issuingFrequency==null)
					return true;
				else if((this.issuingFrequency!=null && p.issuingFrequency==null)||(this.issuingFrequency==null && p.issuingFrequency!=null))
					return false;
				else
					return(this.issuingFrequency.equals(this.issuingFrequency));
				
			}
			else if((this.paperQuality==null && p.paperQuality!=null)||(this.paperQuality!=null && p.paperQuality==null))
				return false;
			else
				return (this.issuingFrequency.equals(this.issuingFrequency) && this.paperQuality.equals(this.paperQuality) );
		}
		else
			return false;
		
	}
	
	
	public String toString(){
		return "This Magazine has "+ numOfPage + " pages, and costs $"+ price + 
				". It's title is "+title+". Paper quality is "+paperQuality+
				", and issues "+issuingFrequency+".";
	}
}
