package Aplication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Entities.Clientes;
import Entities.Header;

public class ProcessaArquivo {

	ArrayList<Clientes> listacliente = new ArrayList<Clientes>();
	ArrayList<Header> listaheader = new ArrayList<Header>();
	Header header = new Header();
	Clientes cliente = null;
	String[] retorno;
	Scanner sc = new Scanner(System.in);

	public void lerArquivo() {

		try {

			System.out.println("Entre com o local do arquivo: ");
			String str = "C:\\Users\\LUIZ\\Desktop\\Curso Java\\Exercicios Sirius\\Aderente\\CAPRE_20180522_0954_S";

			File file = new File(str);

			BufferedReader br = new BufferedReader(new FileReader(file));

			while (br.ready()) {

				String linha = br.readLine();
				retorno = linha.split(";");
				setDadosHeader();
				setDadosClientes();

			}

			br.close();

			sc.close();

		} catch (IOException e) {
			System.out.println("Erro na leitura do arquivo : " + e.getMessage());

		}

	}

	public void setDadosHeader() {

		if (retorno[0].equals("H")) {

			header = new Header();

			header.setTipoRegistro(retorno[0]);
			header.setTipoOperacao(retorno[1]);
			header.setDia(retorno[2]);
			header.setDia(retorno[3]);
			header.setAno(retorno[4]);

			listaheader.add(header);

		}
	}

	public void setDadosClientes() {

		if (retorno[0].equals("D")) {

			cliente = new Clientes();

			cliente.setTipoRegistro(retorno[0]);
			cliente.setNomeDistribuidor(retorno[1]);
			cliente.setNumeroSorte(retorno[2]);

			listacliente.add(cliente);

		}

	}

	public void printDadosArquivo() {

		for (int i = 0; i < listaheader.size(); i++) {
			Header header1 = new Header();

			header1 = listaheader.get(i);

			System.out.println("Cabecalho: ");
			System.out.println();
			System.out.println(header1.getTipoRegistro() + "eader - " + header1.getTipoOperacao() + ", "
					+ header1.getDia() + ", " + header1.getMes() + ", " + header1.getAno());
			System.out.println();
		}

		System.out.println("Dados dos clientes: ");
		System.out.println();

		for (Clientes clientelista : listacliente) {

			System.out.println(clientelista.getTipoRegistro() + " - " + clientelista.getNomeDistribuidor() + ", "
					+ clientelista.getNumeroSorte());
			System.out.println();
		}

	}

}
