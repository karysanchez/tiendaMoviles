package tiendaMoviles;

import java.util.Date;

import org.junit.Test;

import com.uisrael.tiendaMoviles.controlador.CuentaPorCobrarControlador;
import com.uisrael.tiendaMoviles.controlador.CuentasVentaControlador;
import com.uisrael.tiendaMoviles.controlador.DatosIngresoProductoControlador;
import com.uisrael.tiendaMoviles.controlador.DatosSucursalesTiendaControlador;
import com.uisrael.tiendaMoviles.controlador.DatosTiendaControlador;
import com.uisrael.tiendaMoviles.controlador.DetalleIngresoProductosControlador;
import com.uisrael.tiendaMoviles.controlador.DetalleVentaProductosControlador;
import com.uisrael.tiendaMoviles.controlador.IdentificacionPersonaControlador;
import com.uisrael.tiendaMoviles.controlador.InformacionClienteControlador;
import com.uisrael.tiendaMoviles.controlador.InformacionPropietarioControlador;
import com.uisrael.tiendaMoviles.controlador.InformacionProveedorControlador;
import com.uisrael.tiendaMoviles.controlador.ProductosControlador;
import com.uisrael.tiendaMoviles.controlador.VentaProductosControlador;
import com.uisrael.tiendaMoviles.controlador.impl.CuentaPorCobrarControladorImpl;
import com.uisrael.tiendaMoviles.controlador.impl.CuentasVentaControladorImpl;
import com.uisrael.tiendaMoviles.controlador.impl.DatosIngresoProductoControladorImpl;
import com.uisrael.tiendaMoviles.controlador.impl.DatosSucursalesTiendaControladorImpl;
import com.uisrael.tiendaMoviles.controlador.impl.DatosTiendaControladorImpl;
import com.uisrael.tiendaMoviles.controlador.impl.DetalleIngresoProductosControladorImpl;
import com.uisrael.tiendaMoviles.controlador.impl.DetalleVentaProductosControladorImpl;
import com.uisrael.tiendaMoviles.controlador.impl.IdentificacionPersonaControladorImpl;
import com.uisrael.tiendaMoviles.controlador.impl.InformacionClienteControladorImpl;
import com.uisrael.tiendaMoviles.controlador.impl.InformacionPropietarioControladorImpl;
import com.uisrael.tiendaMoviles.controlador.impl.InformacionProveedorControladorImpl;
import com.uisrael.tiendaMoviles.controlador.impl.ProductosControladorImpl;
import com.uisrael.tiendaMoviles.controlador.impl.VentaProductosControladorImpl;
import com.uisrael.tiendaMoviles.modelo.entidades.CuentaPorCobrar;
import com.uisrael.tiendaMoviles.modelo.entidades.CuentasVenta;
import com.uisrael.tiendaMoviles.modelo.entidades.DatosIngresoProducto;
import com.uisrael.tiendaMoviles.modelo.entidades.DatosSucursalesTienda;
import com.uisrael.tiendaMoviles.modelo.entidades.DatosTienda;
import com.uisrael.tiendaMoviles.modelo.entidades.DetalleIngresoProductos;
import com.uisrael.tiendaMoviles.modelo.entidades.DetalleVentaProductos;
import com.uisrael.tiendaMoviles.modelo.entidades.IdentificacionPersona;
import com.uisrael.tiendaMoviles.modelo.entidades.InformacionCliente;
import com.uisrael.tiendaMoviles.modelo.entidades.InformacionPropietario;
import com.uisrael.tiendaMoviles.modelo.entidades.InformacionProveedor;
import com.uisrael.tiendaMoviles.modelo.entidades.Productos;
import com.uisrael.tiendaMoviles.modelo.entidades.VentaProductos;

public class testTiendaMoviles {

	private IdentificacionPersonaControlador identificacionPersonaControlador;
	private InformacionPropietarioControlador informacionPropietarioControlador;
	private CuentaPorCobrarControlador cuentaPorCobrarControlador;
	private CuentasVentaControlador cuentasVentaControlador;
	private DatosIngresoProductoControlador datosIngresoProductoControlador;
	private DatosSucursalesTiendaControlador datosSucursalesTiendaControlador;
	private DatosTiendaControlador datosTiendaControlador;
	private DetalleIngresoProductosControlador detalleIngresoProductosControlador;
	private DetalleVentaProductosControlador detalleVentaProductosControlador;
	private InformacionClienteControlador informacionClienteControlador;
	private InformacionProveedorControlador informacionProveedorControlador;
	private ProductosControlador productosControlador;
	private VentaProductosControlador ventaProductosControlador;

	@Test
	public void test() {

		// Ingreso de Identificacion persona propietario
		IdentificacionPersona nuevaIdentificacionPersona = new IdentificacionPersona();

		nuevaIdentificacionPersona.setCodigoIdentificacionPersona("KS2");
		nuevaIdentificacionPersona.setDescripcionIdentificacionPersona("Proveedor");
		nuevaIdentificacionPersona.setEstadoIdentificacionPersona(1);

		identificacionPersonaControlador = new IdentificacionPersonaControladorImpl();
		identificacionPersonaControlador.insertarIdentificacionPersona(nuevaIdentificacionPersona);

		// Ingreso de Identificacion persona cliente
		IdentificacionPersona nuevaIdentificacionPersonaCliente = new IdentificacionPersona();

		nuevaIdentificacionPersonaCliente.setCodigoIdentificacionPersona("CL1");
		nuevaIdentificacionPersonaCliente.setDescripcionIdentificacionPersona("Cliente");
		nuevaIdentificacionPersonaCliente.setEstadoIdentificacionPersona(1);

		identificacionPersonaControlador = new IdentificacionPersonaControladorImpl();
		identificacionPersonaControlador.insertarIdentificacionPersona(nuevaIdentificacionPersonaCliente);

		// Ingreso de información propietario
		InformacionPropietario nuevoPropietario = new InformacionPropietario();
		nuevoPropietario.setNombrePropietario("Karina");
		nuevoPropietario.setApellidoPropietario("Sánchez");
		nuevoPropietario.setIdentificacionPropietario("1717171717");
		nuevoPropietario.setTelefonoPropietario("2635445");
		nuevoPropietario.setCelularPropietario("0874523698");
		nuevoPropietario.setContrasenaPropietario("123a");
		nuevoPropietario.setCorreoPropietario("sanchez@gmail.com");
		nuevoPropietario.setEstadoPropietario(1);
		nuevoPropietario.setFkIdentificacionPersona(nuevaIdentificacionPersona);

		informacionPropietarioControlador = new InformacionPropietarioControladorImpl();
		informacionPropietarioControlador.insertarInformacionPropietario(nuevoPropietario);

		// Ingreso de información tienda
		DatosTienda nuevaTienda = new DatosTienda();
		nuevaTienda.setEstadoTienda(1);
		nuevaTienda.setNombreTienda("Tienda Inicial");

		datosTiendaControlador = new DatosTiendaControladorImpl();
		datosTiendaControlador.insertarTienda(nuevaTienda);

		// Ingreso proveedor
		InformacionProveedor nuevoProveedor = new InformacionProveedor();
		nuevoProveedor.setCodigoProveedor("pro1");
		nuevoProveedor.setDireccionProveedor("Ecuatoriana");
		nuevoProveedor.setEstadoProveedor(1);
		nuevoProveedor.setNombreProveedor("Pronaca");

		informacionProveedorControlador = new InformacionProveedorControladorImpl();
		informacionProveedorControlador.insertarProveedor(nuevoProveedor);

		// Ingreso de datos ingreso
		DatosIngresoProducto nuevoIngreso = new DatosIngresoProducto();
		nuevoIngreso.setEstadoIngreso(1);
		nuevoIngreso.setFechaIngreso(new Date());
		nuevoIngreso.setFkProveedor(nuevoProveedor);

		datosIngresoProductoControlador = new DatosIngresoProductoControladorImpl();
		datosIngresoProductoControlador.insertarIngreso(nuevoIngreso);

		// Ingreso de sucursal
		DatosSucursalesTienda nuevaSucursal = new DatosSucursalesTienda();
		nuevaSucursal.setCodigoSucursal("005");
		nuevaSucursal.setDireccionSucursal("Calderon");
		nuevaSucursal.setEstadoSucursal(1);
		nuevaSucursal.setFkPropietario(nuevoPropietario);
		nuevaSucursal.setFkTienda(nuevaTienda);

		datosSucursalesTiendaControlador = new DatosSucursalesTiendaControladorImpl();
		datosSucursalesTiendaControlador.insertarSucursal(nuevaSucursal);

		// Ingreso de información cliente
		InformacionCliente nuevoCliente = new InformacionCliente();
		nuevoCliente.setApellidoCliente("Fuel");
		nuevoCliente.setCelularCliente("0845221369");
		nuevoCliente.setCorreoCliente("clientef@gmail.com");
		nuevoCliente.setDireccionCliente("La mena");
		nuevoCliente.setEstadoCliente(1);
		nuevoCliente.setFkIdentificacionPersona(nuevaIdentificacionPersonaCliente);
		nuevoCliente.setFkSucursal(nuevaSucursal);
		nuevoCliente.setIdentificacionCliente("1514121516");
		nuevoCliente.setNombreCliente("José");
		nuevoCliente.setTelefonoCliente("2569778");

		informacionClienteControlador = new InformacionClienteControladorImpl();
		informacionClienteControlador.insertarCliente(nuevoCliente);

		// Ingreso de producto
		Productos nuevoProducto = new Productos();
		nuevoProducto.setCodigoProducto("pro054");
		nuevoProducto.setEstadoProducto(1);
		nuevoProducto.setFkSucursal(nuevaSucursal);
		nuevoProducto.setNombreProducto("Atún");
		nuevoProducto.setStockProducto(50);

		productosControlador = new ProductosControladorImpl();
		productosControlador.insertarProducto(nuevoProducto);

		// Ingreso de detalle ingreso producto
		DetalleIngresoProductos nuevoDetalleIngreso = new DetalleIngresoProductos();
		nuevoDetalleIngreso.setCantidadProducto(2);
		nuevoDetalleIngreso.setFkIngreso(nuevoIngreso);
		nuevoDetalleIngreso.setFkProducto(nuevoProducto);
		nuevoDetalleIngreso.setPrecioCompra(2);
		nuevoDetalleIngreso.setPrecioVenta(0.50);

		detalleIngresoProductosControlador = new DetalleIngresoProductosControladorImpl();
		detalleIngresoProductosControlador.insertarDetalleIngreso(nuevoDetalleIngreso);

		// Ingreso de venta
		VentaProductos nuevaVenta = new VentaProductos();
		nuevaVenta.setEstadoVenta(0);
		nuevaVenta.setFechaVenta(new Date());
		nuevaVenta.setFkCliente(nuevoCliente);
		nuevaVenta.setPorcentajeIvaVenta(0.12);
		nuevaVenta.setTotalVenta(12);

		ventaProductosControlador = new VentaProductosControladorImpl();
		ventaProductosControlador.insertarVentaProducto(nuevaVenta);

		// Ingreso de detalle de la venta
		DetalleVentaProductos nuevoDetalleVenta = new DetalleVentaProductos();
		nuevoDetalleVenta.setCantidad(2);
		nuevoDetalleVenta.setDescuentoVenta(1);
		nuevoDetalleVenta.setFkProducto(nuevoProducto);
		nuevoDetalleVenta.setFkVenta(nuevaVenta);
		nuevoDetalleVenta.setPrecioVenta(0.10);

		detalleVentaProductosControlador = new DetalleVentaProductosControladorImpl();
		detalleVentaProductosControlador.insertarDetalleVenta(nuevoDetalleVenta);

		// Ingreso de cuentas por cobrar
		CuentaPorCobrar nuevaCuentaCobrar = new CuentaPorCobrar();
		nuevaCuentaCobrar.setAbonoCobrar(0);
		nuevaCuentaCobrar.setSaldoCobrar(20);
		nuevaCuentaCobrar.setSubtotalCobrar(20);
		nuevaCuentaCobrar.setTotalCobrar(20);

		cuentaPorCobrarControlador = new CuentaPorCobrarControladorImpl();
		cuentaPorCobrarControlador.insertarCuentaPorCobrar(nuevaCuentaCobrar);

		// Ingreso de cuenta
		CuentasVenta nuevaCuenta = new CuentasVenta();
		nuevaCuenta.setCuentaCancelada(0);
		nuevaCuenta.setEstadoCuenta(1);
		nuevaCuenta.setFkCuentaPorCobrar(nuevaCuentaCobrar);
		nuevaCuenta.setFkVenta(nuevaVenta);

		cuentasVentaControlador = new CuentasVentaControladorImpl();
		cuentasVentaControlador.insertarCuentaVenta(nuevaCuenta);
		
		/**SEGUNDO REGISTRO*/
		// Ingreso de Identificacion persona propietario
				IdentificacionPersona nuevaIdentificacionPersona2 = new IdentificacionPersona();

				nuevaIdentificacionPersona2.setCodigoIdentificacionPersona("JN1");
				nuevaIdentificacionPersona2.setDescripcionIdentificacionPersona("Proveedor");
				nuevaIdentificacionPersona2.setEstadoIdentificacionPersona(1);

				identificacionPersonaControlador = new IdentificacionPersonaControladorImpl();
				identificacionPersonaControlador.insertarIdentificacionPersona(nuevaIdentificacionPersona2);

				// Ingreso de Identificacion persona cliente
				IdentificacionPersona nuevaIdentificacionPersonaCliente2 = new IdentificacionPersona();

				nuevaIdentificacionPersonaCliente2.setCodigoIdentificacionPersona("CL2");
				nuevaIdentificacionPersonaCliente2.setDescripcionIdentificacionPersona("Cliente");
				nuevaIdentificacionPersonaCliente2.setEstadoIdentificacionPersona(1);

				identificacionPersonaControlador = new IdentificacionPersonaControladorImpl();
				identificacionPersonaControlador.insertarIdentificacionPersona(nuevaIdentificacionPersonaCliente2);

				// Ingreso de información propietario
				InformacionPropietario nuevoPropietario2 = new InformacionPropietario();
				nuevoPropietario2.setNombrePropietario("Jhonson");
				nuevoPropietario2.setApellidoPropietario("Narváez");
				nuevoPropietario2.setIdentificacionPropietario("1818181818");
				nuevoPropietario2.setTelefonoPropietario("2536445");
				nuevoPropietario2.setCelularPropietario("0984523674");
				nuevoPropietario2.setContrasenaPropietario("aaa53");
				nuevoPropietario2.setCorreoPropietario("jnarvaez@gmail.com");
				nuevoPropietario2.setEstadoPropietario(1);
				nuevoPropietario2.setFkIdentificacionPersona(nuevaIdentificacionPersona2);

				informacionPropietarioControlador = new InformacionPropietarioControladorImpl();
				informacionPropietarioControlador.insertarInformacionPropietario(nuevoPropietario2);

				// Ingreso de información tienda
				DatosTienda nuevaTienda2 = new DatosTienda();
				nuevaTienda2.setEstadoTienda(1);
				nuevaTienda2.setNombreTienda("Tienda Max");

				datosTiendaControlador = new DatosTiendaControladorImpl();
				datosTiendaControlador.insertarTienda(nuevaTienda2);

				// Ingreso proveedor
				InformacionProveedor nuevoProveedor2 = new InformacionProveedor();
				nuevoProveedor2.setCodigoProveedor("proF");
				nuevoProveedor2.setDireccionProveedor("Santa Rita");
				nuevoProveedor2.setEstadoProveedor(1);
				nuevoProveedor2.setNombreProveedor("Pydaco");

				informacionProveedorControlador = new InformacionProveedorControladorImpl();
				informacionProveedorControlador.insertarProveedor(nuevoProveedor2);

				// Ingreso de datos ingreso
				DatosIngresoProducto nuevoIngreso2 = new DatosIngresoProducto();
				nuevoIngreso2.setEstadoIngreso(1);
				nuevoIngreso2.setFechaIngreso(new Date());
				nuevoIngreso2.setFkProveedor(nuevoProveedor2);

				datosIngresoProductoControlador = new DatosIngresoProductoControladorImpl();
				datosIngresoProductoControlador.insertarIngreso(nuevoIngreso2);

				// Ingreso de sucursal
				DatosSucursalesTienda nuevaSucursal2 = new DatosSucursalesTienda();
				nuevaSucursal2.setCodigoSucursal("0008");
				nuevaSucursal2.setDireccionSucursal("San Luis");
				nuevaSucursal2.setEstadoSucursal(1);
				nuevaSucursal2.setFkPropietario(nuevoPropietario2);
				nuevaSucursal2.setFkTienda(nuevaTienda2);

				datosSucursalesTiendaControlador = new DatosSucursalesTiendaControladorImpl();
				datosSucursalesTiendaControlador.insertarSucursal(nuevaSucursal2);

				// Ingreso de información cliente
				InformacionCliente nuevoCliente2 = new InformacionCliente();
				nuevoCliente2.setApellidoCliente("Carmilema");
				nuevoCliente2.setCelularCliente("0852634152");
				nuevoCliente2.setCorreoCliente("cliente.carmilema@gmail.com");
				nuevoCliente2.setDireccionCliente("Chillogallo");
				nuevoCliente2.setEstadoCliente(1);
				nuevoCliente2.setFkIdentificacionPersona(nuevaIdentificacionPersonaCliente);
				nuevoCliente2.setFkSucursal(nuevaSucursal);
				nuevoCliente2.setIdentificacionCliente("1825365252");
				nuevoCliente2.setNombreCliente("Andres");
				nuevoCliente2.setTelefonoCliente("2569444");

				informacionClienteControlador = new InformacionClienteControladorImpl();
				informacionClienteControlador.insertarCliente(nuevoCliente2);

				// Ingreso de producto
				Productos nuevoProducto2 = new Productos();
				nuevoProducto2.setCodigoProducto("pro054");
				nuevoProducto2.setEstadoProducto(1);
				nuevoProducto2.setFkSucursal(nuevaSucursal);
				nuevoProducto2.setNombreProducto("Atún");
				nuevoProducto2.setStockProducto(50);

				productosControlador = new ProductosControladorImpl();
				productosControlador.insertarProducto(nuevoProducto2);

				// Ingreso de detalle ingreso producto
				DetalleIngresoProductos nuevoDetalleIngreso2 = new DetalleIngresoProductos();
				nuevoDetalleIngreso2.setCantidadProducto(2);
				nuevoDetalleIngreso2.setFkIngreso(nuevoIngreso);
				nuevoDetalleIngreso2.setFkProducto(nuevoProducto);
				nuevoDetalleIngreso2.setPrecioCompra(2);
				nuevoDetalleIngreso2.setPrecioVenta(0.50);

				detalleIngresoProductosControlador = new DetalleIngresoProductosControladorImpl();
				detalleIngresoProductosControlador.insertarDetalleIngreso(nuevoDetalleIngreso2);

				// Ingreso de venta
				VentaProductos nuevaVenta2 = new VentaProductos();
				nuevaVenta2.setEstadoVenta(0);
				nuevaVenta2.setFechaVenta(new Date());
				nuevaVenta2.setFkCliente(nuevoCliente2);
				nuevaVenta2.setPorcentajeIvaVenta(0.12);
				nuevaVenta2.setTotalVenta(12);

				ventaProductosControlador = new VentaProductosControladorImpl();
				ventaProductosControlador.insertarVentaProducto(nuevaVenta2);

				// Ingreso de detalle de la venta
				DetalleVentaProductos nuevoDetalleVenta2 = new DetalleVentaProductos();
				nuevoDetalleVenta2.setCantidad(2);
				nuevoDetalleVenta2.setDescuentoVenta(1);
				nuevoDetalleVenta2.setFkProducto(nuevoProducto2);
				nuevoDetalleVenta2.setFkVenta(nuevaVenta2);
				nuevoDetalleVenta2.setPrecioVenta(0.10);

				detalleVentaProductosControlador = new DetalleVentaProductosControladorImpl();
				detalleVentaProductosControlador.insertarDetalleVenta(nuevoDetalleVenta2);

				// Ingreso de cuentas por cobrar
				CuentaPorCobrar nuevaCuentaCobrar2 = new CuentaPorCobrar();
				nuevaCuentaCobrar2.setAbonoCobrar(0);
				nuevaCuentaCobrar2.setSaldoCobrar(20);
				nuevaCuentaCobrar2.setSubtotalCobrar(20);
				nuevaCuentaCobrar2.setTotalCobrar(20);

				cuentaPorCobrarControlador = new CuentaPorCobrarControladorImpl();
				cuentaPorCobrarControlador.insertarCuentaPorCobrar(nuevaCuentaCobrar2);

				// Ingreso de cuenta
				CuentasVenta nuevaCuenta2 = new CuentasVenta();
				nuevaCuenta2.setCuentaCancelada(0);
				nuevaCuenta2.setEstadoCuenta(1);
				nuevaCuenta2.setFkCuentaPorCobrar(nuevaCuentaCobrar2);
				nuevaCuenta2.setFkVenta(nuevaVenta2);

				cuentasVentaControlador = new CuentasVentaControladorImpl();
				cuentasVentaControlador.insertarCuentaVenta(nuevaCuenta2);

//		// Consulta credenciales propietario 
//		 informacionPropietarioControlador = new InformacionPropietarioControladorImpl();
//		InformacionPropietario resultadoCredenciales = informacionPropietarioControlador
//				.consultarCredenciales("correo@gmail.com", "123a");
//		
//		System.out.println("Propietario con credenciales: " + resultadoCredenciales);
//
//		System.out.println("Test Correcto");

	}

}
