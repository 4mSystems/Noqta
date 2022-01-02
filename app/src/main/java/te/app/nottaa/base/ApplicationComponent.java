package te.app.nottaa.base;

public class ApplicationComponent implements androidx.databinding.DataBindingComponent {

    private ApplicationBinding applicationBinding = new ApplicationBinding();

    public ApplicationBinding getApplicationBinding() {
        return applicationBinding;
    }

}
