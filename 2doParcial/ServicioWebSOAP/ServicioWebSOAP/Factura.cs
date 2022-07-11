using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace ServicioWebSOAP
{
    public class Factura
    {
        public String Nit;
        public String RazonSocial;
        public int NumeroFactura;
        public int CUF;
        public String TipoDocCliente;
        public String NombrCliente;
        public String Lista;

        public Factura() { }

        public Factura(String Nit,String RazonSocial,int NumeroFactura, int CUF,String TipoDocCliente, String NombrCliente, String Lista)
        {
            this.Nit = Nit;
            this.RazonSocial = RazonSocial;
            this.NumeroFactura = NumeroFactura;
            this.CUF = CUF;
            this.TipoDocCliente = TipoDocCliente;
            this.NombrCliente = NombrCliente;
            this.Lista = Lista;
        }

    }
}