package grand.app.notta.utils.helper;

import android.content.Intent;

public interface LauncherInterface {
    interface permissionInterface {
        void result(int request, boolean result);
    }

    interface activityResultInterface {
        void result(int request, int resultCode, Intent result);
    }

}
