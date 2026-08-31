package p318o6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC6112h;

/* JADX INFO: renamed from: o6.C */
/* JADX INFO: loaded from: classes.dex */
public class C6602C {

    /* JADX INFO: renamed from: b */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f24873b = AtomicIntegerFieldUpdater.newUpdater(C6602C.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a */
    public final Throwable f24874a;

    public C6602C(Throwable th, boolean z7) {
        this.f24874a = th;
        this._handled$volatile = z7 ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m27957a() {
        return f24873b.get(this) != 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m27958c() {
        return f24873b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return AbstractC6633S.m28108a(this) + '[' + this.f24874a + ']';
    }

    public /* synthetic */ C6602C(Throwable th, boolean z7, int i7, AbstractC6112h abstractC6112h) {
        this(th, (i7 & 2) != 0 ? false : z7);
    }
}
