package it.enaip.cinema;

/*La classe Biglietto contiene gli attributi posizione che indica il posto a sedere nella sala cinematografica ed il
prezzo.
 La classe biglietto contiene i metodi applicaRiduzioneAnziani() e calcolaRiduzioneBambini() per
determinare la riduzione sul prezzo intero del biglietto.
*/
public class Biglietto {
	int age;
	float price;
	float seatPrice;
	public float discount (int age, float price) {
		if (age > 60) {
			seatPrice = (float) (price * 0.7);
	}
		return seatPrice;
	 
	}
}
