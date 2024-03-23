package br.com.cadUser;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("pessoa")
@RequestScoped
public class Pessoa {
	private String nome;
	private ArrayList<String> lista = new ArrayList<>();
	private String nomes;
	
	public Pessoa() {
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<String> getLista() {
		return lista;
	}
	public void setLista(ArrayList<String> lista) {
		this.lista = lista;
	}
	public String getNomes() {
		return nomes;
	}
	public void setNomes(String nomes) {
		this.nomes = nomes;
	}

	public void adicionarNome() {
		
		ArrayList<String> listaAux = new ArrayList<>();
		
		listaAux = this.getLista();
		
		listaAux.add(this.getNome());
		
		this.setLista(listaAux);
	
		this.setNomes(this.getLista().toString());
	}
	
}
