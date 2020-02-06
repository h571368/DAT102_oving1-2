package no.hvl.dat102.koe.adt;


public interface KoeADT<T> {

	/* Legge til et element bak i k�en.* 
	 * @param element er elementet som blir satt inn i k�en*/
	
	
	void innKoe(T element);
	/* Fjerner og returnerer elementet foran i k�en.* 
	 * @return elementet foran i k�en* 
	 * @exceptionEmptyCollection Exception unntak kastes hvis k�en allerede er tom
	 * */    
	
	T utKoe();
	/* Returnerer elementet foran i k�en uten � fjerne det fra k�en.* 
	 * @return elementet foran i k�en* 
	 * @EmptyCollection Exception unntak kastes hvis k�en allerede er tom
	 * */
	
	T foerste() ;
	/* Returnerer sann hvis k�en ikke inneholder noen elementer.* 
	 * @return sann dersom k�en er tom ellers usann*/
	
	boolean erTom();
	/* Returnerer antall elementer i k�en.* 
	 * @return antall elementer i k�en*/
	
	int antall();
	

}//interface
