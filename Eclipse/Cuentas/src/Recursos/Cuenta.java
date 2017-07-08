package Recursos;

import java.util.ArrayList;

public class Cuenta {
	private String nombre;
    private float monto;
    private ArrayList <Float> historico = new ArrayList<Float>();

    public Cuenta() {
    }

    public Cuenta(String nombre, float monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 
    public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public ArrayList<Float> getHistorico() {
		return historico;
	}

	public void setHistorico(ArrayList<Float> historico) {
		this.historico = historico;
	}

	public void actualizarHistorico(float valor){
        if(historico.size()==0) {
            historico.add(valor);
        	setMonto(valor);
        }
        else {
            historico.add(monto - valor);
            setMonto(monto-valor);
        }
        
    }
}
