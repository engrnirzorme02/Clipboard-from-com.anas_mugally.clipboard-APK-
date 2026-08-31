package p206b0;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: b0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2920b {

    /* JADX INFO: renamed from: a */
    private final AtomicBoolean f12033a;

    public C2920b(boolean z7) {
        this.f12033a = new AtomicBoolean(z7);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m14651a() {
        return this.f12033a.get();
    }

    /* JADX INFO: renamed from: b */
    public final void m14652b(boolean z7) {
        this.f12033a.set(z7);
    }
}
