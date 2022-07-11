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
    public partial class FormFormulario : Form
    {
        public FormFormulario()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Form1 f1 = new Form1();
            f1.Show();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Form2 f2 = new Form2();
            f2.Show();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Form3 f1 = new Form3();
            f1.Show();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            Form4 f1 = new Form4();
            f1.Show();
        }
    }
}
