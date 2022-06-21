using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace SERECI
{
    public class CertificadoDefuncion
    {
        public String carnet;
        public String nombres;
        public String primer_ape;
        public String segundo_ape;
        public String fecha_defuncion;
        public String causa;
        

        public CertificadoDefuncion()
        {

        }
        public CertificadoDefuncion(String carnet, String nombres, String primer_ape, String segundo_ape, String fecha_defuncion, String causa)
        {
            this.carnet = carnet;
            this.nombres = nombres;
            this.primer_ape = primer_ape;
            this.segundo_ape = segundo_ape;
            this.fecha_defuncion = fecha_defuncion;
            this.causa = causa;

        }
    }
}