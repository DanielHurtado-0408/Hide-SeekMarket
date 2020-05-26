package co.edu.unbosque.model.persistence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Pareja;


public class ParejaDAO implements Serializable {
	private static final long serialVersionUID = 1L;

	List<Pareja> parejas;
	BaseDatosFile BD;
	
	public ParejaDAO() {
		parejas = new ArrayList<>();
		BD = new BaseDatosFile();
		Pareja pareja1 = new Pareja("Dani", "Ana", "Exito", "11:00", "2:00");
		parejas.add(pareja1);
	}
	

	public boolean agregarPareja(Pareja pareja) {
		String mensaje = "";
		boolean r = true;
		parejas.add(pareja);
		mensaje = "La pareja:  " + pareja + "fue agregado";
		BD.escribirArchivoParejas(parejas);
		System.out.println(mensaje);
		return r;
	}

	public void modificarPareja(Pareja pareja) {
		Pareja jugador = null;
		for (int i = 0; i < parejas.size(); i++) {
			if (parejas.get(i).equals(pareja)) {
				parejas.get(i).setUsuario(pareja.getUsuario());
				parejas.get(i).setPareja(pareja.getPareja());
				parejas.get(i).setComercio(pareja.getComercio());
				parejas.get(i).setApertura(pareja.getApertura());
				parejas.get(i).setCierre(pareja.getCierre());
				parejas.get(i).setCupo(pareja.getCupo());
				pareja = parejas.get(i);
			}
		}
		BD.escribirArchivoParejas(parejas);
	}

	public String eliminarPareja(String pareja) {
		String mensaje = null;
		for (int i = 0; i < parejas.size(); i++) {
			if (parejas.get(i).getPareja().equals(pareja)) {
				parejas.remove(parejas.get(i));
				mensaje = ("Pareja " + pareja + " fue eliminado exitosamente");
			}
		}
		BD.escribirArchivoParejas(parejas);
		return mensaje;
	}

	public String ListaParejas() {
		String mensaje = "";

		for (int i = 0; i < parejas.size(); i++) {
			mensaje += " usuario: " + parejas.get(i).getUsuario() + "pareja: " + parejas.get(i).getPareja()
					+ "Comercio: " + parejas.get(i).getComercio() + "Apertura: " + parejas.get(i).getApertura() + "Cierre: "
					+ parejas.get(i).getCierre() + "Cupo: " + parejas.get(i).getCupo();
		}

		BD.escribirArchivoParejas(parejas);
		return mensaje;

	}

	public String buscarParejaPorDocumentoString(String pareja) {

		String mensaje = null;
		for (int i = 0; i < parejas.size(); i++) {
			if (parejas.get(i).getPareja().equals(pareja)) {
				mensaje = "Pareja : " + pareja + " encontrado exitosamente " + " usuario: "
						+ parejas.get(i).getUsuario() + "pareja: " 
						+ parejas.get(i).getPareja() +  "Comercio: "
						+ parejas.get(i).getComercio() + "Apertura: " 
						+ parejas.get(i).getApertura() + "Cierre: "
						+ parejas.get(i).getCierre() + "Cupo: " 
						+ parejas.get(i).getCupo();
			}
		}
		BD.escribirArchivoParejas(parejas);
		return mensaje;
	}

	public Pareja buscarParejaPorDocumnto(String pareja) {
		String mensaje = "";
		Pareja parejaBuscada = null;
		for (int i = 0; i < parejas.size(); i++) {
			if (parejas.get(i).getPareja().equals(pareja)) {
				parejaBuscada = parejas.get(i);
			}
		}
		BD.escribirArchivoParejas(parejas);
		return parejaBuscada;
	}

	public List<Pareja> getParejas() {
		return parejas;
	}

	public void setParejas(List<Pareja> parejas) {
		this.parejas = parejas;
	}

	public BaseDatosFile getBD() {
		return BD;
	}

	public void setBD(BaseDatosFile bD) {
		BD = bD;
	}

}
