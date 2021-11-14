package com.uisrael.tiendaMoviles.modelo.dao;

import com.uisrael.tiendaMoviles.modelo.entidades.InformacionPropietario;

public interface InformacionPropietarioDao {

	public void insertarInformacionPropietario(InformacionPropietario nuevoPropietario);

	public InformacionPropietario consultarCredenciales(String correoPropietario, String contrasenaPropietario);
}
