package co.com.almundo.callCenter.empleado;

/**
 * Clase que se encarga de representar al empleado en el sistema
 * 
 * @author GIOVANNI-PC
 *
 */
public class Empleado {

	private Integer codigo;
	private TipoEmpleado tipoEmpleado;
	private boolean asignado;

	// Se puede agregar mas variables realcionadas a un empleado esto puede ser
	// una entidad que sea representado como tabla de BD

	public TipoEmpleado getTipoEmpleado() {
		return tipoEmpleado;
	}

	public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}

	public boolean isAsignado() {
		return asignado;
	}

	public void setAsignado(boolean asignado) {
		this.asignado = asignado;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

}
