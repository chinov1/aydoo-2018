package ar.edu.untref.aydoo;

import java.util.List;

public class SucesionFibo {
	private Entrada entrada;
	private Orientacion orientacion;
	private Direccion direccion;
	private Salida salida;
	private Funcionamiento funcionamiento;
	private Paridad paridad;
	private String respuesta;
	
	public SucesionFibo(String[] arg){
		this.entrada = new Entrada(arg);
	}

	public void generarRespuesta() throws Exception{
		this.respuesta = "Opciones no validas2";
		this.entrada.procesarParametros();
		if(!this.entrada.getDireccion().equals("Opciones no validas")){
			System.out.println("entro!");
			Integer cantidadSucesiones = this.entrada.getNumero();
			String funcionamientoIngresado = this.entrada.getFuncionamiento();
			this.funcionamiento = entrada.instanciarFuncionamiento();
			List<Integer> listaNumeros = this.funcionamiento.getListaNumeros();
			listaNumeros = this.funcionamiento.aplicarFuncionamiento();
			this.paridad = entrada.instanciarParidad(listaNumeros);
			listaNumeros = paridad.mostrarFiltrados();
			//this.direccion = new DireccionDirecta(listaNumeros, entrada.getDireccion());
			this.direccion = entrada.instanciarDireccion(listaNumeros);
			this.direccion.aplicarDireccion();
			//this.orientacion = new OrientacionHorizontal(listaNumeros, entrada.getOrientacion(), funcionamientoIngresado, cantidadSucesiones);
			this.orientacion = entrada.instanciarOrientacion(listaNumeros);
			if (orientacion.getClass() == OrientacionProgresiva.class){
				System.out.println("es progresivos");
			}
			this.respuesta = this.orientacion.aplicarOrientacion();
			this.salida = new SalidaArchivo(respuesta, entrada.getFormatoSalida());
			this.salida.aplicarSalida();
		}else{
			System.out.println("Opciones no validas1");
		}
	}
	
	public String getRespuesta() {
		return this.respuesta;
	}
}
