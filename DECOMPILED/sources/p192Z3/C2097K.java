package p192Z3;

import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.p411firebaseauthapi.zzaen;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;

/* JADX INFO: renamed from: Z3.K */
/* JADX INFO: loaded from: classes.dex */
final class C2097K implements Continuation {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ String f6893a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ C2101O f6894b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ RecaptchaAction f6895c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ Continuation f6896d;

    C2097K(String str, C2101O c2101o, RecaptchaAction recaptchaAction, Continuation continuation) {
        this.f6893a = str;
        this.f6894b = c2101o;
        this.f6895c = recaptchaAction;
        this.f6896d = continuation;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful() || !zzaen.zzc((Exception) AbstractC3718s.m18083l(task.getException()))) {
            return task;
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + this.f6893a);
        }
        return this.f6894b.m8643b(this.f6893a, Boolean.TRUE, this.f6895c).continueWithTask(this.f6896d);
    }
}
