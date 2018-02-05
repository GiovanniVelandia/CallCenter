package co.com.almundo.callCenter.empleado;
/**
 * Clase que se encarga de representar los tipos de empleado que existen en el
 * sistema
 * 
 * @author GIOVANNI-PC
 *
 */
public class TipoEmpleado {

	private Integer id;
	private String cargo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
