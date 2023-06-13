package TrabalhoGrauB;

public class Payment {
	
//Attribute Declaration
	
	private double value;
	private int installments;
	private String type;
	
//Empty Constructor
	
	public Payment () {
		super ();
		
	}
	
//Constructor

	public Payment(double value, int installments, String type) {
		super();
		this.value = value;
		this.installments = installments;
		this.type = type;
	}
	
//Getters&Setters

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public int getInstallments() {
		return installments;
	}

	public void setInstallments(int installments) {
		this.installments = installments;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
//toString
	
	@Override
	public String toString() {
		return "Payment [value=" + value + ", installments=" + installments + ", type=" + type + "]";
	}
	
//Methods
	
	public double installmentsValue () {
		
		return installments;
	};
	
	
	
	

}
