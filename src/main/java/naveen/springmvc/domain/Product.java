package naveen.springmvc.domain;

public class Product {
	private Integer id;
	private String description;
	private int price;
	private String url;

	public Product() {
	}

	public Product(Integer id, String description, int price, String url) {
		this.id = id;
		this.description = description;
		this.price = price;
		this.url = url;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
