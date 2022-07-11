using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsFactura
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnenviar_Click(object sender, EventArgs e)
        {
            String a =cbxmoneda.Text;
            String resultado = " ";
            ServiceReference1.WebServiceBANCOSoapClient sw = new ServiceReference1.WebServiceBANCOSoapClient();
            ServiceReferenceFactura.SincronizarFechaHoraRequest sf = new ServiceReferenceFactura.SincronizarFechaHoraRequest();

            if (cbxmoneda.Text=="US")
            {
                txtresultadomoneda.Text=resultado.;
            }
            else if (cbxmoneda.Text=="EU")
            {
                txtresultadomoneda.Text;
            }

            switch(cbxmoneda.Text)
            {
                case "US":
                    resultado = sw.obtenerContizacion(a.ToString());
                    break;
                case "EU":
                    resultado = sw.obtenerContizacion(a.ToString());
                    break;
            }

            txtresultadomoneda.Text = resultado.ToString();
            
        }
    }
}
