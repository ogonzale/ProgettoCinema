package it.enaip.cinema;

/*La classe Biglietto contiene gli attributi posizione che indica il posto a sedere nella sala cinematografica ed il
prezzo.
 La classe biglietto contiene i metodi applicaRiduzioneAnziani() e calcolaRiduzioneBambini() per
determinare la riduzione sul prezzo intero del biglietto.
*/
public class Biglietto {
	private int age;
	private float price;
	private float seatPrice;
	
	public float discount () {
		if (age > 60) {
			seatPrice = (float) (price * 0.7);
		}else if (age < 18){
			seatPrice = (float) (price * 0.5);
		}
		return seatPrice;
	 
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getSeatPrice() {
		return seatPrice;
	}

	public void setSeatPrice(float seatPrice) {
		this.seatPrice = seatPrice;
	}
	
	
}
