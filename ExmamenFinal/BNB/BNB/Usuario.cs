using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace BNB
{
    public class Usuario
    {
        public int cuenta;
        public float saldo;

        public Usuario() { }

        public Usuario(int cuenta, float saldo)
        {
            this.cuenta = cuenta;
            this.saldo = saldo;
        }
       
    }
}