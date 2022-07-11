using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace ServicioWebSOAP
{
    public class Cufd
    {
        public String idambiente;
        public String modalidad;
        public String nit;

        public Cufd() { }

        public Cufd(String idambiente, String modalidad, String nit)
        {
            this.idambiente = idambiente;
            this.modalidad = modalidad;
            this.nit = nit;
        }
    }
}