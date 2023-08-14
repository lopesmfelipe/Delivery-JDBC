package entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private Long id;
	private Double latitude;
	private Double longitude;
	private Instant moment;   // Instant is a java class
	private OrderStatus status;  // This class is a 'enum'
	
	
	/* Since List is an interface, we cannot create objects from it.
	 * In order to use functionalities of the List interface, we can use
	 * these classes: ArrayList. LinkedList. Like down here:*/
	private List<Product> products = new ArrayList<>();  

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<Product> getProducts() {
		return products;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", moment=" + moment
				+ ", status=" + status + ", products=" + products + "]";
	}
	
}
