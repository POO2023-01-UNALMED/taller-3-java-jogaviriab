package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	Control control;
	private static int numTv = 0;
	
	
	public TV(Marca marca,boolean estado){
		this.marca = marca;
		this.estado = estado;
		numTv ++;
	}
	
	public Marca getMarca(){
		return marca;
	}
	
	public Control getControl() {
		return control;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public int getCanal() {
		return canal;
	}
	
	//	Sets
	public void setMarca(Marca marca){
		this.marca = marca;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	

	
	public static int getNumTV() {
		return numTv;
	}

	public static void setNumTV(int numTv) {
		TV.numTv = numTv;
	}
	
	public void turnOn() {
		estado = true;
	}
	
	public void turnOff() {
		estado = false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if (this.estado == true && this.canal <= 120) {
			this.canal ++;
		}
	}
	
	public void canalDown() {
		if (this.estado == true && this.canal >= 1) {
			this.canal--;
		}
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}

	public void volumenUp() {
		if(this.estado == true && this.volumen !=7) {
			this.volumen++;
		}
	}
	
	public void volumenDown() {
		if(this.estado == true && this.volumen !=0) {
			this.volumen--;
		}
	}
	
	
	
	
	
	
	
}
