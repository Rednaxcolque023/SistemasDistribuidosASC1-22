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
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }

        private void btnEnviar_Click(object sender, EventArgs e)
        {
            ServiceReferenceCertificadoNac.SWSEGIPSoapClient sw = new ServiceReferenceCertificadoNac.SWSEGIPSoapClient();
            ServiceReferenceCertificadoNac.CertificadoNacimiento p = sw.ObtenerCertificadoNacimiento(txtCarnet.Text);
            if (p != null)
            {
                txtNombre.Text = p.nombres;
                txtPApellido.Text = p.primer_ape;
                txtSApellido.Text = p.segundo_ape;
                txtFNac.Text = p.fecha_nac;
                txtPadre.Text = p.padre;
                txtMadre.Text = p.madre;
            }
        }
    }
}
