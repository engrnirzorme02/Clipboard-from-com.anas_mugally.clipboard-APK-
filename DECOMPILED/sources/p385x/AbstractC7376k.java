package p385x;

import p361u.C7146d;

/* JADX INFO: renamed from: x.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7376k {

    /* JADX INFO: renamed from: a */
    static boolean[] f29566a = new boolean[3];

    /* JADX INFO: renamed from: a */
    static void m32680a(C7371f c7371f, C7146d c7146d, C7370e c7370e) {
        c7370e.f29462t = -1;
        c7370e.f29464u = -1;
        C7370e.b bVar = c7371f.f29423Z[0];
        C7370e.b bVar2 = C7370e.b.WRAP_CONTENT;
        if (bVar != bVar2 && c7370e.f29423Z[0] == C7370e.b.MATCH_PARENT) {
            int i7 = c7370e.f29412O.f29374g;
            int iM32508W = c7371f.m32508W() - c7370e.f29414Q.f29374g;
            C7369d c7369d = c7370e.f29412O;
            c7369d.f29376i = c7146d.m31587q(c7369d);
            C7369d c7369d2 = c7370e.f29414Q;
            c7369d2.f29376i = c7146d.m31587q(c7369d2);
            c7146d.m31578f(c7370e.f29412O.f29376i, i7);
            c7146d.m31578f(c7370e.f29414Q.f29376i, iM32508W);
            c7370e.f29462t = 2;
            c7370e.m32496P0(i7, iM32508W);
        }
        if (c7371f.f29423Z[1] == bVar2 || c7370e.f29423Z[1] != C7370e.b.MATCH_PARENT) {
            return;
        }
        int i8 = c7370e.f29413P.f29374g;
        int iM32570x = c7371f.m32570x() - c7370e.f29415R.f29374g;
        C7369d c7369d3 = c7370e.f29413P;
        c7369d3.f29376i = c7146d.m31587q(c7369d3);
        C7369d c7369d4 = c7370e.f29415R;
        c7369d4.f29376i = c7146d.m31587q(c7369d4);
        c7146d.m31578f(c7370e.f29413P.f29376i, i8);
        c7146d.m31578f(c7370e.f29415R.f29376i, iM32570x);
        if (c7370e.f29447l0 > 0 || c7370e.m32506V() == 8) {
            C7369d c7369d5 = c7370e.f29416S;
            c7369d5.f29376i = c7146d.m31587q(c7369d5);
            c7146d.m31578f(c7370e.f29416S.f29376i, c7370e.f29447l0 + i8);
        }
        c7370e.f29464u = 2;
        c7370e.m32530g1(i8, iM32570x);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m32681b(int i7, int i8) {
        return (i7 & i8) == i8;
    }
}
