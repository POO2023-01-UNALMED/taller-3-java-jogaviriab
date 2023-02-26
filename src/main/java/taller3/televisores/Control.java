package taller3.televisores;


public class Control {
	Tv tv;
	
//	Control(Tv tv){
//		this.tv = tv;
//	}
	
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
	
	void volumenDown() {
		tv.volumenDown();
	}
	
	void enlazar(Tv tv){
		this.tv = tv;
		tv.control = this;
	}
	
	Tv getTv() {
		return this.tv;
	}
	void setTv(Tv tv) {
		this.tv = tv;
		tv.control = this;
	}
	
}
