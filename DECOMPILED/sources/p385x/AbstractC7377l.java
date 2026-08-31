package p385x;

import java.util.HashSet;
import p393y.C7431b;

/* JADX INFO: renamed from: x.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7377l extends AbstractC7375j {

    /* JADX INFO: renamed from: N0 */
    private int f29567N0 = 0;

    /* JADX INFO: renamed from: O0 */
    private int f29568O0 = 0;

    /* JADX INFO: renamed from: P0 */
    private int f29569P0 = 0;

    /* JADX INFO: renamed from: Q0 */
    private int f29570Q0 = 0;

    /* JADX INFO: renamed from: R0 */
    private int f29571R0 = 0;

    /* JADX INFO: renamed from: S0 */
    private int f29572S0 = 0;

    /* JADX INFO: renamed from: T0 */
    private int f29573T0 = 0;

    /* JADX INFO: renamed from: U0 */
    private int f29574U0 = 0;

    /* JADX INFO: renamed from: V0 */
    private boolean f29575V0 = false;

    /* JADX INFO: renamed from: W0 */
    private int f29576W0 = 0;

    /* JADX INFO: renamed from: X0 */
    private int f29577X0 = 0;

    /* JADX INFO: renamed from: Y0 */
    protected C7431b.a f29578Y0 = new C7431b.a();

    /* JADX INFO: renamed from: Z0 */
    C7431b.b f29579Z0 = null;

    /* JADX INFO: renamed from: A1 */
    public int m32682A1() {
        return this.f29573T0;
    }

    /* JADX INFO: renamed from: B1 */
    public int m32683B1() {
        return this.f29574U0;
    }

    /* JADX INFO: renamed from: C1 */
    public int m32684C1() {
        return this.f29567N0;
    }

    /* JADX INFO: renamed from: D1 */
    public abstract void mo32638D1(int i7, int i8, int i9, int i10);

    /* JADX INFO: renamed from: E1 */
    protected void m32685E1(C7370e c7370e, C7370e.b bVar, int i7, C7370e.b bVar2, int i8) {
        while (this.f29579Z0 == null && m32486K() != null) {
            this.f29579Z0 = ((C7371f) m32486K()).m32587K1();
        }
        C7431b.a aVar = this.f29578Y0;
        aVar.f29762a = bVar;
        aVar.f29763b = bVar2;
        aVar.f29764c = i7;
        aVar.f29765d = i8;
        this.f29579Z0.mo10379b(c7370e, aVar);
        c7370e.m32543l1(this.f29578Y0.f29766e);
        c7370e.m32491M0(this.f29578Y0.f29767f);
        c7370e.m32489L0(this.f29578Y0.f29769h);
        c7370e.m32469B0(this.f29578Y0.f29768g);
    }

    /* JADX INFO: renamed from: F1 */
    protected boolean m32686F1() {
        C7370e c7370e = this.f29425a0;
        C7431b.b bVarM32587K1 = c7370e != null ? ((C7371f) c7370e).m32587K1() : null;
        if (bVarM32587K1 == null) {
            return false;
        }
        for (int i7 = 0; i7 < this.f29565M0; i7++) {
            C7370e c7370e2 = this.f29564L0[i7];
            if (c7370e2 != null && !(c7370e2 instanceof C7373h)) {
                C7370e.b bVarM32564u = c7370e2.m32564u(0);
                C7370e.b bVarM32564u2 = c7370e2.m32564u(1);
                C7370e.b bVar = C7370e.b.MATCH_CONSTRAINT;
                if (bVarM32564u != bVar || c7370e2.f29468w == 1 || bVarM32564u2 != bVar || c7370e2.f29470x == 1) {
                    if (bVarM32564u == bVar) {
                        bVarM32564u = C7370e.b.WRAP_CONTENT;
                    }
                    if (bVarM32564u2 == bVar) {
                        bVarM32564u2 = C7370e.b.WRAP_CONTENT;
                    }
                    C7431b.a aVar = this.f29578Y0;
                    aVar.f29762a = bVarM32564u;
                    aVar.f29763b = bVarM32564u2;
                    aVar.f29764c = c7370e2.m32508W();
                    this.f29578Y0.f29765d = c7370e2.m32570x();
                    bVarM32587K1.mo10379b(c7370e2, this.f29578Y0);
                    c7370e2.m32543l1(this.f29578Y0.f29766e);
                    c7370e2.m32491M0(this.f29578Y0.f29767f);
                    c7370e2.m32469B0(this.f29578Y0.f29768g);
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: G1 */
    public boolean m32687G1() {
        return this.f29575V0;
    }

    /* JADX INFO: renamed from: H1 */
    protected void m32688H1(boolean z7) {
        this.f29575V0 = z7;
    }

    /* JADX INFO: renamed from: I1 */
    public void m32689I1(int i7, int i8) {
        this.f29576W0 = i7;
        this.f29577X0 = i8;
    }

    /* JADX INFO: renamed from: J1 */
    public void m32690J1(int i7) {
        this.f29569P0 = i7;
        this.f29567N0 = i7;
        this.f29570Q0 = i7;
        this.f29568O0 = i7;
        this.f29571R0 = i7;
        this.f29572S0 = i7;
    }

    /* JADX INFO: renamed from: K1 */
    public void m32691K1(int i7) {
        this.f29568O0 = i7;
    }

    /* JADX INFO: renamed from: L1 */
    public void m32692L1(int i7) {
        this.f29572S0 = i7;
    }

    /* JADX INFO: renamed from: M1 */
    public void m32693M1(int i7) {
        this.f29569P0 = i7;
        this.f29573T0 = i7;
    }

    /* JADX INFO: renamed from: N1 */
    public void m32694N1(int i7) {
        this.f29570Q0 = i7;
        this.f29574U0 = i7;
    }

    /* JADX INFO: renamed from: O1 */
    public void m32695O1(int i7) {
        this.f29571R0 = i7;
        this.f29573T0 = i7;
        this.f29574U0 = i7;
    }

    /* JADX INFO: renamed from: P1 */
    public void m32696P1(int i7) {
        this.f29567N0 = i7;
    }

    @Override // p385x.AbstractC7375j, p385x.InterfaceC7374i
    /* JADX INFO: renamed from: b */
    public void mo32676b(C7371f c7371f) {
        m32698v1();
    }

    /* JADX INFO: renamed from: u1 */
    public void m32697u1(boolean z7) {
        int i7 = this.f29571R0;
        if (i7 > 0 || this.f29572S0 > 0) {
            if (z7) {
                this.f29573T0 = this.f29572S0;
                this.f29574U0 = i7;
            } else {
                this.f29573T0 = i7;
                this.f29574U0 = this.f29572S0;
            }
        }
    }

    /* JADX INFO: renamed from: v1 */
    public void m32698v1() {
        for (int i7 = 0; i7 < this.f29565M0; i7++) {
            C7370e c7370e = this.f29564L0[i7];
            if (c7370e != null) {
                c7370e.m32507V0(true);
            }
        }
    }

    /* JADX INFO: renamed from: w1 */
    public boolean m32699w1(HashSet hashSet) {
        for (int i7 = 0; i7 < this.f29565M0; i7++) {
            if (hashSet.contains(this.f29564L0[i7])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public int m32700x1() {
        return this.f29577X0;
    }

    /* JADX INFO: renamed from: y1 */
    public int m32701y1() {
        return this.f29576W0;
    }

    /* JADX INFO: renamed from: z1 */
    public int m32702z1() {
        return this.f29568O0;
    }
}
