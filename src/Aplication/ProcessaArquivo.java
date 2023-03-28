package Aplication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import Entities.Clientes;
import Entities.Header;

public class ProcessaArquivo {

	ArrayList<Clientes> listacliente = new ArrayList<Clientes>();
	ArrayList<Header> listaheader = new ArrayList<Header>();
	Header header = new Header();
	Clientes cliente = null;
	String[] retorno;

	public void lerArquivo() {

		try {

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

		} catch (Exception e) {
			System.out.println("Erro na leitura do arquivo : " + e.getMessage());

		}

	}

	public void setDadosHeader() {

		if (retorno[0].toUpperCase().equals("H")) {

			try {
				if (retorno.length < 5) {
					
					throw new Exception("Erro no Header - Quantidade de campos invalida: Contem " + retorno.length + " Campos");

				} else {

					header = new Header();

					header.setTipoRegistro(retorno[0]);
					header.setTipoOperacao(retorno[1]);
					header.setDia(retorno[2]);
					header.setMes(retorno[3]);
					header.setAno(retorno[4]);

					listaheader.add(header);

				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}

	public void setDadosClientes() {

		if (retorno[0].toUpperCase().equals("D")) {

			try {

				if (retorno.length >= 3) {
					cliente = new Clientes();

					cliente.setTipoRegistro(retorno[0]);
					cliente.setNomeDistribuidor(retorno[1]);
					cliente.setNumeroSorte(retorno[2]);

					listacliente.add(cliente);
				}
			} catch (Exception e) {
				System.out.println("Erro Cliente: " + e.getMessage());
			}

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
