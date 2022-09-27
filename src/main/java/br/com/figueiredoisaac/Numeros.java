package main.java.br.com.figueiredoisaac;

import java.util.List;
import java.util.ArrayList;

public class Numeros {

//base da calculadora, recebe uma String em formato de uma operação matematica,
//ordena as funções privadas para realizar o calculo e por fim retorna o resultado esperado.
	public String calculadora(String calculo) {
		String resultado;
		List<Double> listaNumeros = new ArrayList<Double>();
		List<Character> listaOperadores = new ArrayList<Character>();

		listaNumeros = obterNumeros(calculo);
		listaOperadores = obterOperadores(calculo);

		resultado = calculaValor(listaNumeros, listaOperadores);

		return resultado;
	}

//recebemos as listas de numeros e operadores que já foram separadas pelas outras funções
//e organizamos para realizar as operaçoes pedidas pelo usuario atraves da funcao executar
//operacao. retornando ao final o valor em forma de String.
	private String calculaValor(List<Double> listaNumeros, List<Character> listaOperadores) {
		String resultado = "";
		double total = 0.0;
		int contador = 0;
		for (int i = 0; i < listaNumeros.size() - 1; i++) {
			if (i == 0) {
				double n1 = listaNumeros.get(i).doubleValue();
				double n2 = listaNumeros.get(i + 1).doubleValue();
				char operador = listaOperadores.get(i).charValue();
				total = executarOperacao(n1, operador, n2);
				contador++;

			} else {

				double n2 = listaNumeros.get(i+1).doubleValue();
				char operador = listaOperadores.get(contador).charValue();
				total = executarOperacao(total, operador, n2);
				contador++;
			}
		}
		resultado = ""+total;
		return resultado;
	}

//responsavel pela execução da operação informada.
//variavel resultado é criada para armazenar a operação
//o condicional if verifica qual das operações foi escolhida
//e executa a operação salvando na variavel criada anteriormente

	private double executarOperacao(double n1, char operador, double n2) {
		double resultado = 0.0;

		if (operador == '+') {
			resultado = n1 + n2;
		} else if (operador == '-') {
			resultado = n1 - n2;
		} else if (operador == '/') {
			resultado = n1 / n2;
		} else if (operador == '*') {
			resultado = n1 * n2;
		}
		return resultado;
	}

// recebemos a String calculo e atraves de um laço for e condicionais
// separamos os numeros(Strings) dos operadores enquanto transformamos
// numeros(Strings) em numeros(doubles) para podermos utiliza-los no calculo.
// por fim um novo if é lançado para caso a lista não esteja vazia apos o laço for.
	private List<Double> obterNumeros(String calculo) {
		List<Double> listaNumeros = new ArrayList<Double>();
		String numeroEmString = "";
		for (int i = 0; i < calculo.length(); i++) {

			if (eOperador(calculo.charAt(i))) {
				Double numero = Double.valueOf(numeroEmString);
				listaNumeros.add(numero);
				numeroEmString = "";
			} else {
				numeroEmString = numeroEmString.concat("" + calculo.charAt(i));
			}
		}
		if (!numeroEmString.isEmpty()) {
			Double numero = Double.valueOf(numeroEmString);
			listaNumeros.add(numero);

		}
		return listaNumeros;
	}

// recebemos a String calculo e atraves do laço for verificamos quem e 
// operador e quem nao e atraves da funçao eOperador e adicionamos os operadores
// a uma lista de operadores para serem utilizados no calculo
	private List<Character> obterOperadores(String calculo) {

		List<Character> listaOperadores = new ArrayList<Character>();

		for (int i = 0; i < calculo.length(); i++) {

			if (eOperador(calculo.charAt(i))) {
				listaOperadores.add(new Character(calculo.charAt(i)));
			}
		}

		return listaOperadores;
	}

// responsavel pela verificação da validade da operação
// utilizando uma condicional e um boleano, verifica se o caractere informado
// esta entre as 4 operações possiveis no nosso programa

	private boolean eOperador(char caracter) {
		boolean eOperador = false;
		if (caracter == '-' || caracter == '+' || caracter == '/' || caracter == '*') {
			eOperador = true;
		}
		return eOperador;
	}
}