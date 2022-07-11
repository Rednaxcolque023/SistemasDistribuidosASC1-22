using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace ServicioWebSOAP
{
    /// <summary>
    /// Descripción breve de WebService
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class WebService : System.Web.Services.WebService
    {

        string datetime = DateTime.Now.ToString("hh:mm:ss tt");
        [WebMethod]
        public string SincronizarFechaHora()
        {
            return datetime;
        }


        [WebMethod]
        public Cufd ObtenerCufd(String idambiente)
        {
            if (idambiente=="12")
            {
                Cufd cufd = new Cufd("12","//","AB0000345C34521");
                return cufd;
            }
            return null;
        }

        [WebMethod]
        public Factura EmitirFactura(int NIT )
        {
            if (NIT == 12345)
            {
                Factura factura = new Factura("12", "ninguna",1212,12,"854689","Alex","asss");
                return factura;
            }
            return null;
        }
    }
}
