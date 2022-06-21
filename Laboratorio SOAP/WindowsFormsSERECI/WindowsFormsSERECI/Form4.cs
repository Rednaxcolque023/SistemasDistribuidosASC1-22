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
    public partial class Form4 : Form
    {
        public Form4()
        {
            InitializeComponent();
        }

        private void btnEnviar_Click(object sender, EventArgs e)
        { 
            SRMatrimonio.SWSEGIPSoapClient sw = new SRMatrimonio.SWSEGIPSoapClient();
            SRMatrimonio.CertificadoDefuncion p = sw.ObtenerCertificadoDefuncion(txtCarnet.Text);
            if (p != null)
            {
                txtNombre.Text = p.nombres;
                txtPApellido.Text = p.primer_ape;
                txtSApellido.Text = p.segundo_ape;
                txtDefuncion.Text = p.fecha_defuncion;
                txtCausa.Text = p.causa;
            }
        }
    }
}
