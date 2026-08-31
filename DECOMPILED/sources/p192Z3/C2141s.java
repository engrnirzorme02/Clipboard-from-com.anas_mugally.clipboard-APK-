package p192Z3;

import com.google.android.gms.tasks.OnFailureListener;
import java.util.Objects;
import p164V3.C1770o;

/* JADX INFO: renamed from: Z3.s */
/* JADX INFO: loaded from: classes.dex */
final class C2141s implements OnFailureListener {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ RunnableC2142t f6990a;

    C2141s(RunnableC2142t runnableC2142t) {
        Objects.requireNonNull(runnableC2142t);
        this.f6990a = runnableC2142t;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        if (exc instanceof C1770o) {
            C2139q.f6981h.m8619g("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f6990a.f6992b.m8747d();
        }
    }
}
