package dao;

import database.DataBaseFasade;

public abstract class BaseDao {

	protected DataBaseFasade fasade = new DataBaseFasade();


	public DataBaseFasade getFasada() {
		return fasade;
	}

	public void setFasada(DataBaseFasade fasada) {
		this.fasade = fasada;
	}



}
