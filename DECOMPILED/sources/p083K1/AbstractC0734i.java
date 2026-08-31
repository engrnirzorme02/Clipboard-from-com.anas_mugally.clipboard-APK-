package p083K1;

import p035E1.InterfaceC0301v;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: K1.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0734i implements InterfaceC0301v {

    /* JADX INFO: renamed from: a */
    protected final Object f2914a;

    public AbstractC0734i(Object obj) {
        this.f2914a = AbstractC2022k.m8408e(obj);
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: b */
    public void mo1436b() {
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: c */
    public final int mo1437c() {
        return 1;
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: d */
    public Class mo1438d() {
        return this.f2914a.getClass();
    }

    @Override // p035E1.InterfaceC0301v
    public final Object get() {
        return this.f2914a;
    }
}
