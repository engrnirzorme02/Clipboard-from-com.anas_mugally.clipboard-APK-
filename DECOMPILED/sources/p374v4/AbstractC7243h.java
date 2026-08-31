package p374v4;

import java.util.concurrent.atomic.AtomicBoolean;
import p006A4.C0018c;
import p006A4.C0019d;
import p006A4.C0024i;
import p006A4.InterfaceC0020e;
import p334q4.C6834a;

/* JADX INFO: renamed from: v4.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7243h {

    /* JADX INFO: renamed from: a */
    private AtomicBoolean f28871a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    private boolean f28872b = false;

    /* JADX INFO: renamed from: a */
    public abstract C0019d mo31895a(C0018c c0018c, C0024i c0024i);

    /* JADX INFO: renamed from: b */
    public abstract void mo31896b(C6834a c6834a);

    /* JADX INFO: renamed from: c */
    public abstract void mo31897c(C0019d c0019d);

    /* JADX INFO: renamed from: d */
    public abstract C0024i mo31898d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo31899e(AbstractC7243h abstractC7243h);

    /* JADX INFO: renamed from: f */
    public boolean m31988f() {
        return this.f28871a.get();
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo31900g(InterfaceC0020e.a aVar);

    /* JADX INFO: renamed from: h */
    public void m31989h() {
        this.f28871a.compareAndSet(false, true);
    }
}
