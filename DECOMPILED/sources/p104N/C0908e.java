package p104N;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: N.e */
/* JADX INFO: loaded from: classes.dex */
public class C0908e implements InterfaceC0907d {

    /* JADX INFO: renamed from: a */
    private final Object[] f3548a;

    /* JADX INFO: renamed from: b */
    private int f3549b;

    public C0908e(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f3548a = new Object[i7];
    }

    /* JADX INFO: renamed from: c */
    private final boolean m4132c(Object obj) {
        int i7 = this.f3549b;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f3548a[i8] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // p104N.InterfaceC0907d
    /* JADX INFO: renamed from: a */
    public boolean mo4130a(Object instance) {
        AbstractC6118n.m27187e(instance, "instance");
        if (m4132c(instance)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i7 = this.f3549b;
        Object[] objArr = this.f3548a;
        if (i7 >= objArr.length) {
            return false;
        }
        objArr[i7] = instance;
        this.f3549b = i7 + 1;
        return true;
    }

    @Override // p104N.InterfaceC0907d
    /* JADX INFO: renamed from: b */
    public Object mo4131b() {
        int i7 = this.f3549b;
        if (i7 <= 0) {
            return null;
        }
        int i8 = i7 - 1;
        Object obj = this.f3548a[i8];
        AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f3548a[i8] = null;
        this.f3549b--;
        return obj;
    }
}
