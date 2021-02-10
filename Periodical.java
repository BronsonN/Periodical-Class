package sait.bms.problemDomain;

public class Periodical extends Book {
	private String frequency;
	
	public Periodical(String frequency) {
		super();
	}
	
	public Periodical(long ISBN, String callNumber, int availNumber, int totalNumber, String bookTitle, String frequency) {
		super(bookTitle, ISBN, callNumber, availNumber, totalNumber);
		this.frequency = frequency;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	
	public void printBook() {
		System.out.println("Matching books:");
		System.out.println("ISBN:             " + getISBN());
		System.out.println("Call Number:      " + getCallNumber());
		System.out.println("Available:        " + getAvailabiltyNumber());
		System.out.println("Total:            " + getTotalNumber());
		System.out.println("Title:            " + getBookTitle());
		System.out.println("Frequency:        " + getFrequency());
		System.out.println();
	}
	
	@Override
	public String toString() {
		return getISBN() + ";"  + getCallNumber() + ";" + getAvailabiltyNumber() + ";" +getTotalNumber()+ ";" +getBookTitle()+ ";" +frequency;
	}
	
	
}
