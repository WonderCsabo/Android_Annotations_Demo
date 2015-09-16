package slidenerd.vivz.aademo;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.OptionsMenu;

@EActivity(R.layout.activity_base)
@OptionsMenu(R.menu.menu_sub)
public class SubActivity extends BaseActivity {

    @AfterViews
    void setMessage() {
        message.setText("Hey is this working? ");
    }

    @Override
    public int getActivityLayout() {
        return R.layout.activity_sub;
    }
}
