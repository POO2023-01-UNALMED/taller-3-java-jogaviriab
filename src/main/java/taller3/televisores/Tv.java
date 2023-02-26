package taller3.televisores;

public class Tv {
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	static int numTv = 0;
	
	
	Tv(Marca marca,boolean estado){
		this.marca = marca;
		this.estado = estado;
		numTv ++;
	}
	
	Marca getMarca(){
		return marca;
	}
	
	Control getControl() {
		return control;
	}
	
	int getPrecio() {
		return precio;
	}
	
	int getVolumen() {
		return volumen;
	}
	
	int getCanal() {
		return canal;
	}
	
	//	Sets
	void setMarca(Marca marca){
		this.marca = marca;
	}
	
	void getControl(Control control) {
		this.control = control;
	}
	
	void  getPrecio(int precio) {
		this.precio = precio;
	}
	
	void  getVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	void  getCanal(int canal) {
		this.canal = canal;
	}
	
	int getNumTv() {
		return numTv;
	}
	
	void turnOn() {
		estado = true;
	}
	
	void turnOff() {
		estado = false;
	}
	
	boolean getEstado() {
		return estado;
	}
	
	void canalUp() {
		if (this.estado == true && this.canal !=120) {
			this.canal ++;
		}
	}
	
	void canalDown() {
		if (this.estado == true && this.canal != 1) {
			this.canal--;
		}
	}
	
	void volumenUp() {
		if(this.estado == true && this.volumen !=7) {
			this.volumen++;
		}
	}
	
	void volumenDown() {
		if(this.estado == true && this.volumen !=0) {
			this.volumen--;
		}
	}
	
	
	
	
	
	
	
}
