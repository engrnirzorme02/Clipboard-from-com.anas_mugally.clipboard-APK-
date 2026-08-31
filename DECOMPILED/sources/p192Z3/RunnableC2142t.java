package p192Z3;

import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;
import p164V3.C1762g;

/* JADX INFO: renamed from: Z3.t */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC2142t implements Runnable {

    /* JADX INFO: renamed from: a */
    private final String f6991a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C2139q f6992b;

    RunnableC2142t(C2139q c2139q, String str) {
        Objects.requireNonNull(c2139q);
        this.f6992b = c2139q;
        this.f6991a = AbstractC3718s.m18077f(str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C1762g.m7395n(this.f6991a));
        if (firebaseAuth.m21989e() != null) {
            Task taskMo8685c = firebaseAuth.mo8685c(true);
            C2139q.f6981h.m8619g("Token refreshing started", new Object[0]);
            taskMo8685c.addOnFailureListener(new C2141s(this));
        }
    }
}
