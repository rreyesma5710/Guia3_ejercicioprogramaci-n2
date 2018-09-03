package paquete;

public class Ascensor {
	
	private int noPisos;
	private int noSotanos;
	private int pisoActual;
	
	public Ascensor() {}

	public Ascensor(int noPisos, int noSotanos, int pisoActual) {
		this.noPisos = noPisos;
		this.noSotanos = noSotanos;
		this.pisoActual = pisoActual;
	}

	public int getNoPisos() {
		return noPisos;
	}

	public void setNoPisos(int noPisos) {
		this.noPisos = noPisos;
	}

	public int getNoSotanos() {
		return noSotanos;
	}

	public void setNoSotanos(int noSotanos) {
		this.noSotanos = noSotanos;
	}

	public int getPisoActual() {
		return pisoActual;
	}

	public void setPisoActual(int pisoActual) {
		this.pisoActual = pisoActual;
	}

	public int noPisosAtendidos()
	{
		return this.noPisos + this.noSotanos;
	}
	
	public void sube()
	{
		if(this.pisoActual == this.noPisos){
       	 	System.out.println("Ya estás en el piso mas alto");
		}else{
			if(this.pisoActual == -1){
				this.pisoActual = this.pisoActual+2;
	       	 	System.out.println("Subiendo");
			}else{
				this.pisoActual++;
	       	 	System.out.println("Subiendo");
			}
		}
	}
	
	public void baja()
	{
		if(this.pisoActual == this.noSotanos*-1){
       	 	System.out.println("Ya estás en el piso mas bajo");
		}else{
			if(this.pisoActual == 1){
				this.pisoActual = this.pisoActual-2;
	       	 	System.out.println("Bajando");
			}else{
				this.pisoActual--;
				System.out.println("Bajando");
			}	
		}
		
	}

	public String toString() {
		return "Numero de pisos: " + noPisos + "\n"+
				"Numero de sotanos: " + noSotanos + "\n"+
				"Piso actual: " + pisoActual + "\n"+
				"Numero de pisos atendidos: "+this.noPisosAtendidos()+"\n";
	}
}
