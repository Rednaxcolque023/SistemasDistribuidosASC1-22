using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace SERECI
{
    public class CertificadoNacimiento
    {
        public String carnet;
        public String nombres;
        public String primer_ape;
        public String segundo_ape;
        public String fecha_nac;
        public String padre;
        public String madre;

        public CertificadoNacimiento()
        {

        }
        public CertificadoNacimiento(String carnet, String nombres, String primer_ape, String segundo_ape, String fecha_nac, String padre, String madre)
        {
            this.carnet = carnet;
            this.nombres = nombres;
            this.primer_ape = primer_ape;
            this.segundo_ape = segundo_ape;
            this.fecha_nac = fecha_nac;
            this.padre = padre;
            this.madre = madre;

        }
    }
}