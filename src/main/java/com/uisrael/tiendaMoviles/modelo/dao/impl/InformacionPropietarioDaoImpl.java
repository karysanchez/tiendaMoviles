package com.uisrael.tiendaMoviles.modelo.dao.impl;

import javax.persistence.TypedQuery;

import com.uisrael.tiendaMoviles.modelo.dao.InformacionPropietarioDao;
import com.uisrael.tiendaMoviles.modelo.entidades.InformacionPropietario;

public class InformacionPropietarioDaoImpl extends GenericaDaoImpl<InformacionPropietario>
		implements InformacionPropietarioDao {

	@Override
	public void insertarInformacionPropietario(InformacionPropietario nuevoPropietario) {

		this.beginTransaction();
		this.create(nuevoPropietario);
		this.commit();
	}

	@Override
	public InformacionPropietario consultarCredenciales(String correoPropietario, String contrasenaPropietario) {
		TypedQuery<InformacionPropietario> query = this.entityManager
				.createQuery(
						"Select cre From InformacionPropietario cre where cre.correoPropietario= '" + correoPropietario
								+ "' and cre.contrasenaPropietario=" + contrasenaPropietario,
						InformacionPropietario.class);
		return query.getSingleResult();

	}

}
