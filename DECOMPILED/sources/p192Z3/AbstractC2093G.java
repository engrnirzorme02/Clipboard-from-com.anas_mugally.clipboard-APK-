package p192Z3;

import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.p411firebaseauthapi.zzaen;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: renamed from: Z3.G */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2093G {
    /* JADX INFO: renamed from: a */
    private static Task m8634a(C2101O c2101o, RecaptchaAction recaptchaAction, String str, Continuation continuation) {
        Task taskM8643b = c2101o.m8643b(str, Boolean.FALSE, recaptchaAction);
        return taskM8643b.continueWithTask(continuation).continueWithTask(new C2097K(str, c2101o, recaptchaAction, continuation));
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ Task m8635b(RecaptchaAction recaptchaAction, FirebaseAuth firebaseAuth, String str, Continuation continuation, Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exc = (Exception) AbstractC3718s.m18083l(task.getException());
        if (zzaen.zzd(exc)) {
            if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action " + String.valueOf(recaptchaAction));
            }
            if (firebaseAuth.m22002w() == null) {
                firebaseAuth.m21999r(new C2101O(firebaseAuth.m21988d(), firebaseAuth));
            }
            return m8634a(firebaseAuth.m22002w(), recaptchaAction, str, continuation);
        }
        Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exc.getMessage());
        return Tasks.forException(exc);
    }

    /* JADX INFO: renamed from: c */
    public final Task m8636c(final FirebaseAuth firebaseAuth, final String str, final RecaptchaAction recaptchaAction, String str2) {
        final Continuation continuation = new Continuation() { // from class: Z3.H
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                AbstractC2093G abstractC2093G = this.f6888a;
                if (task.isSuccessful()) {
                    return abstractC2093G.mo8637d((String) task.getResult());
                }
                Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + ((Exception) AbstractC3718s.m18083l(task.getException())).getMessage() + "\n\n Failing open with a fake token.");
                return abstractC2093G.mo8637d("NO_RECAPTCHA");
            }
        };
        C2101O c2101oM22002w = firebaseAuth.m22002w();
        return (c2101oM22002w == null || !c2101oM22002w.m8644d(str2)) ? mo8637d(null).continueWithTask(new Continuation() { // from class: Z3.I
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return AbstractC2093G.m8635b(recaptchaAction, firebaseAuth, str, continuation, task);
            }
        }) : m8634a(c2101oM22002w, recaptchaAction, str, continuation);
    }

    /* JADX INFO: renamed from: d */
    public abstract Task mo8637d(String str);
}
