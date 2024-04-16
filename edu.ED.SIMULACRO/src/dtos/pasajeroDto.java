package dtos;

import java.time.LocalDateTime;

public class pasajeroDto {

	String DNI = "aaaaa";
	String zonaDestino= "aaaaa";
	boolean vieneEnCoche = false;
	boolean embarcaElCoche = false;
	boolean tieneMercancia = false;
	boolean esApta = false;
	LocalDateTime precisionS;
	LocalDateTime precisionSE;
	LocalDateTime precisionSO;
	LocalDateTime precisionSN;
	LocalDateTime precisionEN;
	LocalDateTime precisionOE;
	LocalDateTime precisionPIF;
	LocalDateTime precionMinEmbarque; 
	
	
	public pasajeroDto(String dNI) {
		super();
		DNI = dNI;
		this.zonaDestino = zonaDestino;
		this.vieneEnCoche = vieneEnCoche;
		this.embarcaElCoche = embarcaElCoche;
		this.tieneMercancia = tieneMercancia;
		this.esApta = esApta;
		this.precisionS = precisionS;
		this.precisionSE = precisionSE;
		this.precisionSO = precisionSO;
		this.precisionSN = precisionSN;
		this.precisionEN = precisionEN;
		this.precisionOE = precisionOE;
		this.precisionPIF = precisionPIF;
		this.precionMinEmbarque = precionMinEmbarque;
	}





	
	
	
	
	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		DNI = dNI;
	}


	public String getZonaDestino() {
		return zonaDestino;
	}


	public void setZonaDestino(String zonaDestino) {
		this.zonaDestino = zonaDestino;
	}


	public boolean isVieneEnCoche() {
		return vieneEnCoche;
	}


	public void setVieneEnCoche(boolean vieneEnCoche) {
		this.vieneEnCoche = vieneEnCoche;
	}


	public boolean isEmbarcaElCoche() {
		return embarcaElCoche;
	}


	public void setEmbarcaElCoche(boolean embarcaElCoche) {
		this.embarcaElCoche = embarcaElCoche;
	}


	public boolean isTieneMercancia() {
		return tieneMercancia;
	}


	public void setTieneMercancia(boolean tieneMercancia) {
		this.tieneMercancia = tieneMercancia;
	}


	public boolean isEsApta() {
		return esApta;
	}


	public void setEsApta(boolean esApta) {
		this.esApta = esApta;
	}


	public LocalDateTime getPrecisionS() {
		return precisionS;
	}


	public void setPrecisionS(LocalDateTime precisionS) {
		this.precisionS = precisionS;
	}


	public LocalDateTime getPrecisionSE() {
		return precisionSE;
	}


	public void setPrecisionSE(LocalDateTime precisionSE) {
		this.precisionSE = precisionSE;
	}


	public LocalDateTime getPrecisionSO() {
		return precisionSO;
	}


	public void setPrecisionSO(LocalDateTime precisionSO) {
		this.precisionSO = precisionSO;
	}


	public LocalDateTime getPrecisionSN() {
		return precisionSN;
	}


	public void setPrecisionSN(LocalDateTime precisionSN) {
		this.precisionSN = precisionSN;
	}


	public LocalDateTime getPrecisionEN() {
		return precisionEN;
	}


	public void setPrecisionEN(LocalDateTime precisionEN) {
		this.precisionEN = precisionEN;
	}


	public LocalDateTime getPrecisionOE() {
		return precisionOE;
	}


	public void setPrecisionOE(LocalDateTime precisionOE) {
		this.precisionOE = precisionOE;
	}


	public LocalDateTime getPrecisionPIF() {
		return precisionPIF;
	}


	public void setPrecisionPIF(LocalDateTime precisionPIF) {
		this.precisionPIF = precisionPIF;
	}


	public LocalDateTime getPrecionMinEmbarque() {
		return precionMinEmbarque;
	}


	public void setPrecionMinEmbarque(LocalDateTime precionMinEmbarque) {
		this.precionMinEmbarque = precionMinEmbarque;
	}


	
	
	
	public pasajeroDto() {
		super();
	}
	
	
	
	
	
	
	
	
	
	
}
