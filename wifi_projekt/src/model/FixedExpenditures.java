package model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQuery(name ="readAllFixedExpenditures", query = "select fxe from FixedExpenditures fxe")
//@NamedQuery(name ="readAllFixedExpendituresYears", query = "select dateFixedExpenditures from FixedExpenditures")
public class FixedExpenditures {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String category;
	private Double amount;
	private LocalDate dateFixedExpenditures = LocalDate.now();
	
	
	public FixedExpenditures(String category, double amount, LocalDate dateFixedExpenditures) {
		super();
		this.category = category;
		this.amount = amount;
		this.dateFixedExpenditures = dateFixedExpenditures;
	}
	
	public FixedExpenditures() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return dateFixedExpenditures;
	}

	public void setDate(LocalDate dateFixedExpenditures) {
		this.dateFixedExpenditures = dateFixedExpenditures;
	}

	@Override
	public String toString() {
		return "FixedExpenditures [id=" + id + ", category=" + category + ", amount=" + amount + ", date=" + dateFixedExpenditures + "]";
	}
	
	

}
