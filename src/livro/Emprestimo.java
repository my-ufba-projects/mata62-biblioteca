package livro;

import java.time.LocalDate;

import usuario.Usuario;
import exemplar.Exemplar;

public class Emprestimo {
	Livro livro;
	private String codigoExemplar;
	LocalDate dataEmprestimo;
	Usuario usuario;
	LocalDate dataPrevistaDevolucao;
	LocalDate dataDevolucao;
	Exemplar exemplar;
	private String estadoLivro;

	public Emprestimo(Usuario usuario, Livro livro, Exemplar exemplar, int numeroDias, String codigoExemplar) {
		this.usuario = usuario;
		this.livro = livro;
		this.exemplar = exemplar;
		this.dataEmprestimo = LocalDate.now();
		this.codigoExemplar = codigoExemplar;
		this.dataPrevistaDevolucao = LocalDate.now().plusDays(numeroDias);
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Livro getLivro() {
		return livro;
	}

	public int getCodigoLivro() {
		return livro.getCodigo();
	}

	public String getCodigoExemplar() {
		return codigoExemplar;
	}

	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public LocalDate getDataDevolucao() {
		return this.dataDevolucao;
	}

	public LocalDate getDataPrevistaDevolucao() {
		return dataPrevistaDevolucao;
	}

	public void setEstadoLivro(String estado) {
		this.estadoLivro = estado;
	}

	public String getEstadoLivro() {
		return this.estadoLivro;
	}
	
	public Exemplar getExemplar() {
		return this.exemplar;
	}
	
	public String getNomeEstadoExemplar() {
		return exemplar.getNomeEstadoExemplar();
	}
}
