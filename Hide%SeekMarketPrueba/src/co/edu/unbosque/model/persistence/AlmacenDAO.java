package co.edu.unbosque.model.persistence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Almacen;

public class AlmacenDAO implements Serializable {
	private static final long serialVersionUID = 1L;

	List<Almacen> almacenes;
	BaseDatosFile BD;
	
	public AlmacenDAO () {
		almacenes = new ArrayList<>();
		BD = new BaseDatosFile();
		Almacen almacen1 = new Almacen("Exito", "133144", "AV 68 con americas", "8:00 am", "7:00 pm");
		almacenes.add(almacen1);
	}

	public boolean agregarAlmacen(Almacen almacen) {
		boolean mensaje = true;
		almacenes.add(almacen);
		BD.escribirArchivoAlmacenes(almacenes);
		return mensaje;
	}

	public void modificarAlmacen(Almacen almacen) {
		Almacen Almacen = null;
		for (int i = 0; i < almacenes.size(); i++) {
			if (almacenes.get(i).equals(almacen)) {
				almacenes.get(i).setNombre(almacen.getNombre());
				almacenes.get(i).setDireccion(almacen.getDireccion());
				almacenes.get(i).setId(almacen.getId());
				almacenes.get(i).setApertura(almacen.getApertura());
				almacenes.get(i).setCierre(almacen.getCierre());
				Almacen = almacenes.get(i);
			}
		}
		BD.escribirArchivoAlmacenes(almacenes);
	}

	public String eliminarAlacen(String documento) {
		String mensaje = null;
		for (int i = 0; i < almacenes.size(); i++) {
			if (almacenes.get(i).getId().equals(documento)) {
				almacenes.remove(almacenes.get(i));
				mensaje = ("Almacen " + documento + " fue eliminado exitosamente");
			}
		}
		BD.escribirArchivoAlmacenes(almacenes);
		return mensaje;
	}

	public String ListaAlmacenes() {
		String mensaje = "";

		for (int i = 0; i < almacenes.size(); i++) {
			mensaje += " nombre: " + almacenes.get(i).getNombre() + "apellido: " + almacenes.get(i).getDireccion()
					+ "Documento: " + almacenes.get(i).getId();
		}

		BD.escribirArchivoAlmacenes(almacenes);
		return mensaje;

	}

	public String buscarAlmacenPorNombreString(String nombre) {

		String mensaje = null;
		for (int i = 0; i < almacenes.size(); i++) {
			if (almacenes.get(i).getNombre().equals(nombre)) {
				mensaje = "Almacen: " + nombre + " encontrado exitosamente " + " nombre: "
						+ almacenes.get(i).getNombre() + "apellido: " + almacenes.get(i).getDireccion() + "Documento: "
						+ almacenes.get(i).getId();
			}
		}
		BD.escribirArchivoAlmacenes(almacenes);
		return mensaje;
	}

	public Almacen buscarAlmacenPorNombre(String nombre) {
		String mensaje = "";
		Almacen almacen = null;
		for (int i = 0; i < almacenes.size(); i++) {
			if (almacenes.get(i).getNombre().equals(nombre)) {
				almacen = almacenes.get(i);
			}
		}
		BD.escribirArchivoAlmacenes(almacenes);
		return almacen;
	}

	public List<Almacen> getAlmacenes() {
		return almacenes;
	}

	public void setAlmacenes(List<Almacen> almacenes) {
		this.almacenes = almacenes;
	}

	public BaseDatosFile getBD() {
		return BD;
	}

	public void setBD(BaseDatosFile bD) {
		BD = bD;
	}

}
