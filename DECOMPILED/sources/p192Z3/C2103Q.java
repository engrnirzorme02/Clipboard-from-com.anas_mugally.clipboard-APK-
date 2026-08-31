package p192Z3;

import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.Objects;

/* JADX INFO: renamed from: Z3.Q */
/* JADX INFO: loaded from: classes.dex */
final class C2103Q implements Continuation {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ RecaptchaAction f6908a;

    C2103Q(C2101O c2101o, RecaptchaAction recaptchaAction) {
        this.f6908a = recaptchaAction;
        Objects.requireNonNull(c2101o);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return ((RecaptchaTasksClient) task.getResult()).executeTask(this.f6908a);
        }
        Exception exc = (Exception) AbstractC3718s.m18083l(task.getException());
        if (!(exc instanceof C2098L)) {
            return Tasks.forException(exc);
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + exc.getMessage());
        }
        return Tasks.forResult("");
    }
}
