using System.Diagnostics;
using System.ServiceModel;
using System.Windows;


namespace TomcatClientCSharp
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        tomcatServiceReference.CompositeServClient proxy;
        InstanceContext context;

        public MainWindow()
        {
            context = new InstanceContext(this);
            proxy = new tomcatServiceReference.CompositeServClient();

            proxy.setStundentName("C#");
            proxy.setMaxStudents(15);

            InitializeComponent();
        }

        private void btnPass_Click(object sender, RoutedEventArgs e)
        {
            lv.Items.Add(proxy.Pass());
        }

        private void btnSetStudentName_Click(object sender, RoutedEventArgs e)
        {
            if (tbInput.Text != "" ||
                tbInput.Text != "Enter student or class name.")
            {
                proxy.setStundentName(tbInput.Text);
                lv.Items.Add("Student name changed to " + proxy.getStundentName());
            }
        }

        private void btnGetAllStudent_Click(object sender, RoutedEventArgs e)
        {
            var allStudents= proxy.getStudents();
            if (allStudents == null)
            {
                lv.Items.Add("No students in class");
                return;
            }
            foreach (var stud in allStudents)
            {
                lv.Items.Add(stud.stundentName);
            }
        }

        private void btnStartClass_Click(object sender, RoutedEventArgs e)
        {
            lv.Items.Add(proxy.StartClass());
        }

        private void btnAddStudent_Click(object sender, RoutedEventArgs e)
        {
            if (proxy.AddStudent(proxy.getStudent()))
            {
                lv.Items.Add("You went to class.");
            }
        }

        private void btnFail_Click(object sender, RoutedEventArgs e)
        {
            lv.Items.Add(proxy.Fail());
        }
    }
}
