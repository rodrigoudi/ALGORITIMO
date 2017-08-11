package Uri;

public class PontoDiario {
	
	String entradaPrimeiro;
	
	String saidaPrimeiro;
	
	String entradaSegundo;
	
	String saidaSegundo;
	
	public Integer calculaSaldoHoras() {
		Integer saldo = 0;
		saldo += calculaHoraPonto(entradaPrimeiro,"08:00",1);
		saldo += calculaHoraPonto(saidaPrimeiro,"12:00",2);
		saldo += calculaHoraPonto(entradaSegundo,"14:00",1);
		saldo += calculaHoraPonto(saidaSegundo,"18:00",2);
		return saldo;
	}

	private Integer calculaHoraPonto(String ponto, String referencial,int entradaSaida) {
		Integer minutosPonto = converteHoraMinuto(ponto);
		Integer minutosReferencial = converteHoraMinuto(referencial);
		Integer diferenca  = minutosReferencial - minutosPonto;
		if (diferenca >= -5 && diferenca <= 5){
			minutosPonto = minutosReferencial;
		}
		if (entradaSaida == 1){
			return minutosReferencial - minutosPonto;
		}
		return minutosPonto - minutosReferencial;
		
	}
	
	private Integer converteHoraMinuto(String horaString) {
		String[] horaMinuto1 = horaString.split(":");
		Integer quantidadeMinutos1 = Integer.parseInt(horaMinuto1[0]) * 60;
		quantidadeMinutos1 += Integer.parseInt(horaMinuto1[1]);
		return quantidadeMinutos1;
	}
	
	public static String converteMinutoHora(Integer minuto) {
		Integer minutos = minuto % 60;
		Integer horas = minuto / 60;
		String resposta = "";
		minutos = Math.abs(minutos);
		horas = Math.abs(horas);
		if (minuto < 0){
			resposta += "- ";
		}else{
			resposta += "+ ";
		}
		if (horas < 10){
			resposta += "0"+Math.abs(horas)+":";
		}else {
			resposta += Math.abs(horas)+":";
		}
		if (minutos < 10){
			resposta += "0"+Math.abs(minutos);
		}else {
			resposta += Math.abs(minutos);
		}
		return resposta;
		
	}
	
	public static void main(String args[]) {
		PontoDiario pontoDiario = new PontoDiario();
		System.out.println(pontoDiario.converteHoraMinuto("04:40"));
		System.out.println(pontoDiario.converteHoraMinuto("08:00"));
		pontoDiario.entradaPrimeiro= "04:40";
		pontoDiario.saidaPrimeiro = "11:55";
		pontoDiario.entradaSegundo = "14:10";
		pontoDiario.saidaSegundo = "18:01";
		System.out.println(pontoDiario.calculaSaldoHoras());
		System.out.println(converteMinutoHora(200));
		System.out.println(converteMinutoHora(-20));
	}


}
