using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsSERECI
{
    public partial class Form3 : Form
    {
        public Form3()
        {
            InitializeComponent();
        }

        private void textBox5_TextChanged(object sender, EventArgs e)
        {

        }

        private void btnEnviar_Click(object sender, EventArgs e)
        {

            SRMatrimonio.SWSEGIPSoapClient sm = new SRMatrimonio.SWSEGIPSoapClient();
            SRMatrimonio.CertificadoMatrimonio p = sm.ObtenerCertificadoMatrimonio(txtCarnet.Text);

            if (p != null)
            {
                txtNombreEsposo.Text = p.nombres;
                txtPApellido.Text = p.primer_ape;
                txtSApellido.Text = p.segundo_ape;

                txtNombreEsposo1.Text = p.nombres;
                txtPApellido1.Text = p.primer_ape;
                txtSApellido1.Text = p.segundo_ape;

            }
        }
    }
}
