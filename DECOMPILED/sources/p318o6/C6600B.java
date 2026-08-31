package p318o6;

import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p238e6.InterfaceC5372q;

/* JADX INFO: renamed from: o6.B */
/* JADX INFO: loaded from: classes.dex */
final class C6600B {

    /* JADX INFO: renamed from: a */
    public final Object f24868a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6676m f24869b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5372q f24870c;

    /* JADX INFO: renamed from: d */
    public final Object f24871d;

    /* JADX INFO: renamed from: e */
    public final Throwable f24872e;

    public C6600B(Object obj, InterfaceC6676m interfaceC6676m, InterfaceC5372q interfaceC5372q, Object obj2, Throwable th) {
        this.f24868a = obj;
        this.f24869b = interfaceC6676m;
        this.f24870c = interfaceC5372q;
        this.f24871d = obj2;
        this.f24872e = th;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C6600B m27940b(C6600B c6600b, Object obj, InterfaceC6676m interfaceC6676m, InterfaceC5372q interfaceC5372q, Object obj2, Throwable th, int i7, Object obj3) {
        if ((i7 & 1) != 0) {
            obj = c6600b.f24868a;
        }
        if ((i7 & 2) != 0) {
            interfaceC6676m = c6600b.f24869b;
        }
        if ((i7 & 4) != 0) {
            interfaceC5372q = c6600b.f24870c;
        }
        if ((i7 & 8) != 0) {
            obj2 = c6600b.f24871d;
        }
        if ((i7 & 16) != 0) {
            th = c6600b.f24872e;
        }
        Throwable th2 = th;
        InterfaceC5372q interfaceC5372q2 = interfaceC5372q;
        return c6600b.m27941a(obj, interfaceC6676m, interfaceC5372q2, obj2, th2);
    }

    /* JADX INFO: renamed from: a */
    public final C6600B m27941a(Object obj, InterfaceC6676m interfaceC6676m, InterfaceC5372q interfaceC5372q, Object obj2, Throwable th) {
        return new C6600B(obj, interfaceC6676m, interfaceC5372q, obj2, th);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m27942c() {
        return this.f24872e != null;
    }

    /* JADX INFO: renamed from: d */
    public final void m27943d(C6682p c6682p, Throwable th) {
        InterfaceC6676m interfaceC6676m = this.f24869b;
        if (interfaceC6676m != null) {
            c6682p.m28270p(interfaceC6676m, th);
        }
        InterfaceC5372q interfaceC5372q = this.f24870c;
        if (interfaceC5372q != null) {
            c6682p.m28271q(interfaceC5372q, th, this.f24868a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6600B)) {
            return false;
        }
        C6600B c6600b = (C6600B) obj;
        return AbstractC6118n.m27183a(this.f24868a, c6600b.f24868a) && AbstractC6118n.m27183a(this.f24869b, c6600b.f24869b) && AbstractC6118n.m27183a(this.f24870c, c6600b.f24870c) && AbstractC6118n.m27183a(this.f24871d, c6600b.f24871d) && AbstractC6118n.m27183a(this.f24872e, c6600b.f24872e);
    }

    public int hashCode() {
        Object obj = this.f24868a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC6676m interfaceC6676m = this.f24869b;
        int iHashCode2 = (iHashCode + (interfaceC6676m == null ? 0 : interfaceC6676m.hashCode())) * 31;
        InterfaceC5372q interfaceC5372q = this.f24870c;
        int iHashCode3 = (iHashCode2 + (interfaceC5372q == null ? 0 : interfaceC5372q.hashCode())) * 31;
        Object obj2 = this.f24871d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f24872e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f24868a + ", cancelHandler=" + this.f24869b + ", onCancellation=" + this.f24870c + ", idempotentResume=" + this.f24871d + ", cancelCause=" + this.f24872e + ')';
    }

    public /* synthetic */ C6600B(Object obj, InterfaceC6676m interfaceC6676m, InterfaceC5372q interfaceC5372q, Object obj2, Throwable th, int i7, AbstractC6112h abstractC6112h) {
        this(obj, (i7 & 2) != 0 ? null : interfaceC6676m, (i7 & 4) != 0 ? null : interfaceC5372q, (i7 & 8) != 0 ? null : obj2, (i7 & 16) != 0 ? null : th);
    }
}
