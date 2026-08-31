package p192Z3;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.Recaptcha;

/* JADX INFO: renamed from: Z3.M */
/* JADX INFO: loaded from: classes.dex */
final class C2099M implements InterfaceC2096J {
    C2099M() {
    }

    @Override // p192Z3.InterfaceC2096J
    /* JADX INFO: renamed from: a */
    public final Task mo8638a(Application application, String str) {
        return Recaptcha.fetchTaskClient(application, str);
    }
}
