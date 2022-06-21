using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace SERECI
{
    public class CertificadoMatrimonio
    {
        public String carnet;
        public String nombres;
        public String primer_ape;
        public String segundo_ape;

        public CertificadoMatrimonio()
        {

        }
        public CertificadoMatrimonio(String carnet, String nombres, String primer_ape, String segundo_ape)
        {
            this.carnet = carnet;
            this.nombres = nombres;
            this.primer_ape = primer_ape;
            this.segundo_ape = segundo_ape;
            
        }
    }
}