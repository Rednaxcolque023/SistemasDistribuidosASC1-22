using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsConsultaSaldo
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnConsultarS_Click(object sender, EventArgs e)
        {
            ServiceReferenceConsulta.SWConsultaSaldoSoapClient sw = new ServiceReferenceConsulta.SWConsultaSaldoSoapClient();
            ServiceReferenceConsulta.Usuario p = sw.Consultar(int.Parse(txtNCuenta.Text));

            if (p != null)
            {
                txtSaldo.Text = p.saldo.ToString();
                
            }
        }
    }
}
