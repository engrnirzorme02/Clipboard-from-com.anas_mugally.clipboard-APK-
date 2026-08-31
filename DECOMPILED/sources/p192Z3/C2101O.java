package p192Z3;

import com.google.android.gms.internal.p411firebaseauthapi.zzac;
import com.google.android.gms.internal.p411firebaseauthapi.zzahs;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;
import p164V3.C1762g;

/* JADX INFO: renamed from: Z3.O */
/* JADX INFO: loaded from: classes.dex */
public final class C2101O {

    /* JADX INFO: renamed from: a */
    private final Object f6899a;

    /* JADX INFO: renamed from: b */
    private final Map f6900b;

    /* JADX INFO: renamed from: c */
    private zzahs f6901c;

    /* JADX INFO: renamed from: d */
    C1762g f6902d;

    /* JADX INFO: renamed from: e */
    private FirebaseAuth f6903e;

    /* JADX INFO: renamed from: f */
    InterfaceC2096J f6904f;

    public C2101O(C1762g c1762g, FirebaseAuth firebaseAuth) {
        this(c1762g, firebaseAuth, new C2099M());
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ void m8639c(C2101O c2101o, zzahs zzahsVar, Task task, String str) {
        synchronized (c2101o.f6899a) {
            c2101o.f6901c = zzahsVar;
            c2101o.f6900b.put(str, task);
        }
    }

    /* JADX INFO: renamed from: e */
    private final Task m8640e(String str) {
        Task task;
        synchronized (this.f6899a) {
            task = (Task) this.f6900b.get(str);
        }
        return task;
    }

    /* JADX INFO: renamed from: f */
    private static String m8641f(String str) {
        return zzac.zzc(str) ? "*" : str;
    }

    /* JADX INFO: renamed from: a */
    public final Task m8642a(String str, Boolean bool) {
        Task taskM8640e;
        String strM8641f = m8641f(str);
        return (bool.booleanValue() || (taskM8640e = m8640e(strM8641f)) == null) ? this.f6903e.m21998p("RECAPTCHA_ENTERPRISE").continueWithTask(new C2100N(this, strM8641f)) : taskM8640e;
    }

    /* JADX INFO: renamed from: b */
    public final Task m8643b(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        String strM8641f = m8641f(str);
        Task taskM8640e = m8640e(strM8641f);
        if (bool.booleanValue() || taskM8640e == null) {
            taskM8640e = m8642a(strM8641f, bool);
        }
        return taskM8640e.continueWithTask(new C2103Q(this, recaptchaAction));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8644d(String str) {
        boolean z7;
        synchronized (this.f6899a) {
            try {
                zzahs zzahsVar = this.f6901c;
                z7 = zzahsVar != null && zzahsVar.zzc(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    private C2101O(C1762g c1762g, FirebaseAuth firebaseAuth, InterfaceC2096J interfaceC2096J) {
        this.f6899a = new Object();
        this.f6900b = new HashMap();
        this.f6902d = c1762g;
        this.f6903e = firebaseAuth;
        this.f6904f = interfaceC2096J;
    }
}
