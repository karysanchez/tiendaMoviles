package com.uisrael.tiendaMoviles.controlador;

import com.uisrael.tiendaMoviles.modelo.entidades.InformacionPropietario;

public interface InformacionPropietarioControlador {

	public void insertarInformacionPropietario(InformacionPropietario nuevoPropietario);

	public InformacionPropietario consultarCredenciales(String correoPropietario, String contrasenaPropietario);

}
