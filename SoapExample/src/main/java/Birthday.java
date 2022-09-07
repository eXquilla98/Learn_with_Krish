import java.io.Serializable;

public class Birthday implements Serializable {

	
	private static final long serialVersionUID = -1072316946290341146L;
	private int id;
	private String Date;
	private String Month;
	private String Year;
	public String getDate() {
		return Date;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDate(String date) {
		Date = date;
	}
	public String getMonth() {
		return Month;
	}
	public void setMonth(String month) {
		Month = month;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}

	@Override
	public String toString() {
		return "Birthday [id=" + id + ", Date=" + Date + ", Month=" + Month + ", Year=" + Year + "]";
	}




}
