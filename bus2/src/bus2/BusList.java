package bus2;

public class BusList {
	   public int id;
	   public String start;
	   public String end;
	   public String starttime;
	   public String Class;
	   public int seats;
	   public int price;
	   public String date;

	   public BusList() {

	   }

	   @Override
	   public String toString() {
	      return "BusList [id=" + id + ", start=" + start + ", end=" + end + ", starttime=" + starttime + ", Class="
	            + Class + ", seats=" + seats + ", price=" + price + ", date=" + date + "]";
	   }

	   public BusList(int id, String start, String end, String starttime, String class1, int seats, int price,
	         String date) {
	      super();
	      this.id = id;
	      this.start = start;
	      this.end = end;
	      this.starttime = starttime;
	      Class = class1;
	      this.seats = seats;
	      this.price = price;
	      this.date = date;
	   }



	}