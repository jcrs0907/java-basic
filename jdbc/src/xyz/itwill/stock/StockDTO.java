package xyz.itwill.stock;

/*
이름            널?       유형           
------------- -------- ------------ 
TITLE         NOT NULL VARCHAR2(50) 
AVERAGE 	  NOT NULL NUMBER       
STOCKCOUNT    NOT NULL NUMBER       
TOTAL         NOT NULL NUMBER       
CREATED       NOT NULL DATE  
*/
public class StockDTO {
	private String title;
	private int average;
	private int	stockCount;
	private int	total;
	private String created;

	
	public StockDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public StockDTO(String title, int average, int stockCount, int total, String created) {
		super();
		this.title = title;
		this.average = average;
		this.stockCount = stockCount;
		this.total = total;
		this.created = created;
	
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}

	public int getStockCount() {
		return stockCount;
	}

	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}


	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}
	
	

	
	
}
