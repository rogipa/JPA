package basica;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
@IdClass(HistoricoID.class)
public class HistoricoServico implements Serializable {
	
	//@EmbeddedId
	//private HistoricoID id_historico;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "funcionario_id")
	private Funcionario funcionario;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "veiculo_id")
	private Veiculo veiculo;
	
	private String nomeServico;
	
	public HistoricoServico() {}

	public HistoricoServico(String nomeServico) {
		super();
		this.nomeServico = nomeServico;
	}
	
	
	
	

/*	public HistoricoServico(HistoricoID id_historico, String nomeServico) {
		super();
		this.id_historico = id_historico;
		this.nomeServico = nomeServico;
	} */



/*	public HistoricoID getId_historico() {
		return id_historico;
	}



	public void setId_historico(HistoricoID id_historico) {
		this.id_historico = id_historico;
	} */



	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public HistoricoServico(Funcionario funcionario, Veiculo veiculo, String nomeServico) {
		super();
		this.funcionario = funcionario;
		this.veiculo = veiculo;
		this.nomeServico = nomeServico;
	}

	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}
	
	

}
