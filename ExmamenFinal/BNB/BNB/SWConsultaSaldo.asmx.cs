using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace BNB
{
    /// <summary>
    /// Descripción breve de SWConsultaSaldo
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class SWConsultaSaldo : System.Web.Services.WebService
    {

        [WebMethod]
        public Usuario Consultar(int Ncuenta)
        {
            switch (Ncuenta)
            {
                case 123456:
                    Usuario usuario = new Usuario(123456, 450);
                    return usuario;
                case 456789:
                    Usuario usuario1 = new Usuario(456789, 500);
                    return usuario1;
                case 123789:
                    Usuario usuario2 = new Usuario(123789, 9000);
                    return usuario2;
                case 456123:
                    Usuario usuario3 = new Usuario(456123, 1000);
                    return usuario3;

            }
            return null;
        }

    }   
}
