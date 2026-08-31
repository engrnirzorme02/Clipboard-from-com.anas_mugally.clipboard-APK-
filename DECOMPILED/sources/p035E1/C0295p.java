package p035E1;

import p019C1.InterfaceC0130f;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: E1.p */
/* JADX INFO: loaded from: classes.dex */
class C0295p implements InterfaceC0301v {

    /* JADX INFO: renamed from: a */
    private final boolean f1228a;

    /* JADX INFO: renamed from: b */
    private final boolean f1229b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0301v f1230c;

    /* JADX INFO: renamed from: d */
    private final a f1231d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0130f f1232e;

    /* JADX INFO: renamed from: f */
    private int f1233f;

    /* JADX INFO: renamed from: r */
    private boolean f1234r;

    /* JADX INFO: renamed from: E1.p$a */
    interface a {
        /* JADX INFO: renamed from: a */
        void mo1401a(InterfaceC0130f interfaceC0130f, C0295p c0295p);
    }

    C0295p(InterfaceC0301v interfaceC0301v, boolean z7, boolean z8, InterfaceC0130f interfaceC0130f, a aVar) {
        this.f1230c = (InterfaceC0301v) AbstractC2022k.m8408e(interfaceC0301v);
        this.f1228a = z7;
        this.f1229b = z8;
        this.f1232e = interfaceC0130f;
        this.f1231d = (a) AbstractC2022k.m8408e(aVar);
    }

    /* JADX INFO: renamed from: a */
    synchronized void m1435a() {
        if (this.f1234r) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f1233f++;
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: b */
    public synchronized void mo1436b() {
        if (this.f1233f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f1234r) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f1234r = true;
        if (this.f1229b) {
            this.f1230c.mo1436b();
        }
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: c */
    public int mo1437c() {
        return this.f1230c.mo1437c();
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: d */
    public Class mo1438d() {
        return this.f1230c.mo1438d();
    }

    /* JADX INFO: renamed from: e */
    InterfaceC0301v m1439e() {
        return this.f1230c;
    }

    /* JADX INFO: renamed from: f */
    boolean m1440f() {
        return this.f1228a;
    }

    /* JADX INFO: renamed from: g */
    void m1441g() {
        boolean z7;
        synchronized (this) {
            int i7 = this.f1233f;
            if (i7 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z7 = true;
            int i8 = i7 - 1;
            this.f1233f = i8;
            if (i8 != 0) {
                z7 = false;
            }
        }
        if (z7) {
            this.f1231d.mo1401a(this.f1232e, this);
        }
    }

    @Override // p035E1.InterfaceC0301v
    public Object get() {
        return this.f1230c.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f1228a + ", listener=" + this.f1231d + ", key=" + this.f1232e + ", acquired=" + this.f1233f + ", isRecycled=" + this.f1234r + ", resource=" + this.f1230c + '}';
    }
}
