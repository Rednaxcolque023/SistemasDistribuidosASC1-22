using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace SERECI
{
    public class Persona
    {
        public String carnet;
        public String nombres;
        public String primer_ape;
        public String segundo_ape;
        public String fecha_nac;
        public String sexo;
        public String estado_civil;

        public Persona()
        {

        }
        public Persona(String carnet,String nombres,String primer_ape,String segundo_ape,String fecha_nac,String sexo,String estado_civil)
        {
            this.carnet = carnet;
            this.nombres = nombres;
            this.primer_ape = primer_ape;
            this.segundo_ape = segundo_ape;
            this.fecha_nac = fecha_nac;
            this.sexo = sexo;
            this.estado_civil = estado_civil;

        }
    }
}