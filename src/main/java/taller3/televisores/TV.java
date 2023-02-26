package taller3.televisores;

public class TV {
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	static int numTv = 0;
	
	
	TV(Marca marca,boolean estado){
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
	
	void setControl(Control control) {
		this.control = control;
	}
	
	void setPrecio(int precio) {
		this.precio = precio;
	}
	
	void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	void setCanal(int canal) {
		this.canal = canal;
	}
	
	int setNumTv() {
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
