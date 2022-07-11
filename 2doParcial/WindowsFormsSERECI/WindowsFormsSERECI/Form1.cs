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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnEnviar_Click(object sender, EventArgs e)
        {
            SWSERECI.SWSEGIPSoapClient sw = new SWSERECI.SWSEGIPSoapClient();
            SWSERECI.Persona p=sw.ObtenerDatos(txtCarnet.Text);
       
            if (p!=null)
            {
                txtNombre.Text = p.nombres;
                txtPApellido.Text = p.primer_ape;
                txtSApellido.Text = p.segundo_ape;
                txtFNac.Text = p.fecha_nac;
                txtSexo.Text = p.sexo;
                txtEstadoCivil.Text = p.estado_civil;
            }
        }

        private void label3_Click(object sender, EventArgs e)
        {

        }
    }
}
