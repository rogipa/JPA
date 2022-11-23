package basica;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class HistoricoID implements Serializable {
	
	
	private int funcionario;
	private int veiculo;
	
	public HistoricoID() {}

	public HistoricoID(int funcionario, int veiculo) {
		super();
		this.funcionario = funcionario;
		this.veiculo = veiculo;
	}

/*	@Override
	public int hashCode() {
		return Objects.hash(funcionario, veiculo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HistoricoID other = (HistoricoID) obj;
		return funcionario == other.funcionario && veiculo == other.veiculo;
	}
	*/
	
	
	
	
	
	
	
	

}
