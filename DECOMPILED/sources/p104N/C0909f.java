package p104N;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: N.f */
/* JADX INFO: loaded from: classes.dex */
public class C0909f extends C0908e {

    /* JADX INFO: renamed from: c */
    private final Object f3550c;

    public C0909f(int i7) {
        super(i7);
        this.f3550c = new Object();
    }

    @Override // p104N.C0908e, p104N.InterfaceC0907d
    /* JADX INFO: renamed from: a */
    public boolean mo4130a(Object instance) {
        boolean zMo4130a;
        AbstractC6118n.m27187e(instance, "instance");
        synchronized (this.f3550c) {
            zMo4130a = super.mo4130a(instance);
        }
        return zMo4130a;
    }

    @Override // p104N.C0908e, p104N.InterfaceC0907d
    /* JADX INFO: renamed from: b */
    public Object mo4131b() {
        Object objMo4131b;
        synchronized (this.f3550c) {
            objMo4131b = super.mo4131b();
        }
        return objMo4131b;
    }
}
