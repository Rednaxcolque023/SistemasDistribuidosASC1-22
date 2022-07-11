using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace ServicioWebSOAP
{
    /// <summary>
    /// Descripción breve de WebServiceBANCO
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class WebServiceBANCO : System.Web.Services.WebService
    {

        [WebMethod]
        public Moneda obtenerContizacion(String cotizacion)
        {
            
            if (cotizacion == "US")
            {
                Moneda aux = new Moneda("6,96");
                return aux;
            }
            else if(cotizacion=="EU")
            {
                Moneda aux = new Moneda("8.5");
                return aux;
            }
            else
            {
                Moneda aux = new Moneda("No se encuentra el tipo de moneda");
                return aux;
            }
       
        }
    }
}
