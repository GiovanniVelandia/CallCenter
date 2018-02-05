package co.com.almundo.callCenter.enumeracion;

/**
 * Enum que representa el id de los tipos de empleado
 * @author GIOVANNI-PC
 *
 */
public enum EnumTipoEmpleado {

	OPERADOR(1), //
	SUPERVISOR(2), //
	DIRECTOR(3), //
	;

	private int codigo;

	EnumTipoEmpleado(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}
}
