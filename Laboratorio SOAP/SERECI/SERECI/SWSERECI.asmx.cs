using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace SERECI
{
    /// <summary>
    /// Descripción breve de SWSEGIP
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class SWSEGIP : System.Web.Services.WebService
    {

        [WebMethod]
        public Persona ObtenerDatos(String CI)
        {

            if (CI=="8542560")
            {
                Persona aux = new Persona("8542560","Alexander","Sacaca","Colque","14/02/1999","masculino","soltero");
                return aux;
            }
            return null;
        }
        [WebMethod]
        public CertificadoNacimiento ObtenerCertificadoNacimiento(String CI)
        {

            if (CI == "8542560")
            {
                CertificadoNacimiento cn = new CertificadoNacimiento("8542560", "Alexander", "Sacaca", "Colque", "14/02/1999", "Maximo Sacaca", "Rosse Mary Colque");
                return cn;
            }
            return null;
        }
        [WebMethod]
        public CertificadoMatrimonio ObtenerCertificadoMatrimonio(String CI)
        {
            //List<CertificadoMatrimonio> listfa = new List<CertificadoMatrimonio>();
            if (CI == "8542560")
            {
                CertificadoMatrimonio esposo = new CertificadoMatrimonio("8542560", "Alexander", "Sacaca", "Colque");
                CertificadoMatrimonio esposo1 = new CertificadoMatrimonio("123456", "///////", "/////////", "///////");
                //listfa.Add(esposo);
                //listfa.Add(esposo1);
                //String text = "";
                /*foreach (CertificadoMatrimonio certificadoMatrimonio in listfa)
                {
                    text += esposo;
                    text += esposo1;
                }*/
                return esposo; 
                                
            }
            return null;
        }

        [WebMethod]
        public CertificadoDefuncion ObtenerCertificadoDefuncion(String CI)
        {

            if (CI == "8542560")
            {
                CertificadoDefuncion cn = new CertificadoDefuncion("8542560", "Alexander", "Sacaca", "Colque", "14/02/1999", "/////////////////");
                return cn;
            }
            return null;
        }
    }
}
