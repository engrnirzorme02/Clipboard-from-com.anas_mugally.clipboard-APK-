package p179X4;

import p063H5.C0530Z;
import p164V3.C1771p;
import p193Z4.InterfaceC2158j;
import p211b5.InterfaceC2972b;
import p285k5.InterfaceC6074i;

/* JADX INFO: renamed from: X4.q */
/* JADX INFO: loaded from: classes.dex */
public class C1994q implements InterfaceC1958E {

    /* JADX INFO: renamed from: d */
    private static final C0530Z.g f6627d;

    /* JADX INFO: renamed from: e */
    private static final C0530Z.g f6628e;

    /* JADX INFO: renamed from: f */
    private static final C0530Z.g f6629f;

    /* JADX INFO: renamed from: a */
    private final InterfaceC2972b f6630a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC2972b f6631b;

    /* JADX INFO: renamed from: c */
    private final C1771p f6632c;

    static {
        C0530Z.d dVar = C0530Z.f1980e;
        f6627d = C0530Z.g.m2296e("x-firebase-client-log-type", dVar);
        f6628e = C0530Z.g.m2296e("x-firebase-client", dVar);
        f6629f = C0530Z.g.m2296e("x-firebase-gmpid", dVar);
    }

    public C1994q(InterfaceC2972b interfaceC2972b, InterfaceC2972b interfaceC2972b2, C1771p c1771p) {
        this.f6631b = interfaceC2972b;
        this.f6630a = interfaceC2972b2;
        this.f6632c = c1771p;
    }

    /* JADX INFO: renamed from: b */
    private void m8355b(C0530Z c0530z) {
        C1771p c1771p = this.f6632c;
        if (c1771p == null) {
            return;
        }
        String strM7423c = c1771p.m7423c();
        if (strM7423c.length() != 0) {
            c0530z.m2287p(f6629f, strM7423c);
        }
    }

    @Override // p179X4.InterfaceC1958E
    /* JADX INFO: renamed from: a */
    public void mo8098a(C0530Z c0530z) {
        if (this.f6630a.get() == null || this.f6631b.get() == null) {
            return;
        }
        int iM8766d = ((InterfaceC2158j) this.f6630a.get()).mo8762b("fire-fst").m8766d();
        if (iM8766d != 0) {
            c0530z.m2287p(f6627d, Integer.toString(iM8766d));
        }
        c0530z.m2287p(f6628e, ((InterfaceC6074i) this.f6631b.get()).mo27106a());
        m8355b(c0530z);
    }
}
