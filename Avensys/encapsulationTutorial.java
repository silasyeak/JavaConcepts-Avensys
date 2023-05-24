package avensysPartTwo;

class Book{
	private int pgNo;
	
	//setters
	public void setPageNum(int x) {
		if(x>0) {
			pgNo = x;
		}else {
			System.out.println("Invalid page number");
		}
		
	}
	
	//getters
	public int getPageNum() {
		return pgNo;
	}
	
}

public class encapsulationTutorial {

	public static void main(String[] args) {
		Book book = new Book();
		book.setPageNum(-100);
		int page = book.getPageNum();
		System.out.println("the page number of the book is " + page);

	}

}
