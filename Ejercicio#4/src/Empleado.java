//CREADO POR EDU CONTRERAS
import java.util.Date;

public class Empleado extends Persona 
{
		   
	    private double salario;
	    private Date fechaEntrada;

	    
	    public double getSalario() {
	        return salario;
	    }

	    public void setSalario(double salario) {
	        this.salario = salario;
	    }

	    public Date getFechaEntrada() {
	        return fechaEntrada;
	    }

	    public void setFechaEntrada(Date fechaEntrada) {
	        this.fechaEntrada = fechaEntrada;
	    }

}
