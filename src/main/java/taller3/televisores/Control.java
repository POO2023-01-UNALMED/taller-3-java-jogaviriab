 package taller3.televisores;


public class Control {
	TV tv;
	

	
	void turnOn() {
		tv.turnOn();
	}
	
	void turnOff() {
		tv.turnOff();
	}
	
	void canalUp() {
		tv.canalUp();
	}
	
	void canalDown() {
		tv.canalDown();
	}
	
	void volumenUp() {
		tv.volumenUp();
	}
	
	void setCanal(int canal) {
		tv.setCanal(canal);
	}
	
	void volumenDown() {
		tv.volumenDown();
	}
	
	void enlazar(TV tv){
		this.tv = tv;
		tv.control = this;
	}
	
	TV getTv() {
		return this.tv;
	}
	void setTv(TV tv) {
		this.tv = tv;
		tv.control = this;
	}
	
}
