package com.algaworks.festa.repositoy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.algaworks.festa.model.Convidado;

@Repository
public class Convidados {

	private static List<Convidado> LISTA_CONVIDADOS = new ArrayList<Convidado>();
	private static Long ID_VALIDO = new Long(0);
	
	static {
		LISTA_CONVIDADOS.add(new Convidado(ID_VALIDO++, "Pedro", 2));
		LISTA_CONVIDADOS.add(new Convidado(ID_VALIDO++, "Maria", 3));
		LISTA_CONVIDADOS.add(new Convidado(ID_VALIDO++, "Ricardo", 1));
	}
	
	public void adiciona(Convidado convidado){
		gerarID(convidado);
		LISTA_CONVIDADOS.add(convidado);
	}

	public List<Convidado> todos(){
		return LISTA_CONVIDADOS;
	}
	
	public Convidado buscarPorID(Long id){
		for (Convidado convidado : LISTA_CONVIDADOS) {
			if(convidado.getId().longValue() == id.longValue())
				return convidado;
		}
		return null;
	}
	
	public void remover(Long id){
		Convidado aux = buscarPorID(id);
		if (aux != null) {
			Convidados.LISTA_CONVIDADOS.remove(aux);
		}
	}
	
	private void gerarID(Convidado convidado) {
		convidado.setId(ID_VALIDO);
		ID_VALIDO++;
	}
}