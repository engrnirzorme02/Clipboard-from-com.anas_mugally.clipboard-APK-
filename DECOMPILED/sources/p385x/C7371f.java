package p385x;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p361u.AbstractC7147e;
import p361u.C7146d;
import p361u.C7151i;
import p393y.AbstractC7437h;
import p393y.AbstractC7438i;
import p393y.C7431b;
import p393y.C7434e;

/* JADX INFO: renamed from: x.f */
/* JADX INFO: loaded from: classes.dex */
public class C7371f extends AbstractC7378m {

    /* JADX INFO: renamed from: O0 */
    private int f29484O0;

    /* JADX INFO: renamed from: S0 */
    int f29488S0;

    /* JADX INFO: renamed from: T0 */
    int f29489T0;

    /* JADX INFO: renamed from: U0 */
    int f29490U0;

    /* JADX INFO: renamed from: V0 */
    int f29491V0;

    /* JADX INFO: renamed from: M0 */
    C7431b f29482M0 = new C7431b(this);

    /* JADX INFO: renamed from: N0 */
    public C7434e f29483N0 = new C7434e(this);

    /* JADX INFO: renamed from: P0 */
    protected C7431b.b f29485P0 = null;

    /* JADX INFO: renamed from: Q0 */
    private boolean f29486Q0 = false;

    /* JADX INFO: renamed from: R0 */
    protected C7146d f29487R0 = new C7146d();

    /* JADX INFO: renamed from: W0 */
    public int f29492W0 = 0;

    /* JADX INFO: renamed from: X0 */
    public int f29493X0 = 0;

    /* JADX INFO: renamed from: Y0 */
    C7368c[] f29494Y0 = new C7368c[4];

    /* JADX INFO: renamed from: Z0 */
    C7368c[] f29495Z0 = new C7368c[4];

    /* JADX INFO: renamed from: a1 */
    public boolean f29496a1 = false;

    /* JADX INFO: renamed from: b1 */
    public boolean f29497b1 = false;

    /* JADX INFO: renamed from: c1 */
    public boolean f29498c1 = false;

    /* JADX INFO: renamed from: d1 */
    public int f29499d1 = 0;

    /* JADX INFO: renamed from: e1 */
    public int f29500e1 = 0;

    /* JADX INFO: renamed from: f1 */
    private int f29501f1 = 257;

    /* JADX INFO: renamed from: g1 */
    public boolean f29502g1 = false;

    /* JADX INFO: renamed from: h1 */
    private boolean f29503h1 = false;

    /* JADX INFO: renamed from: i1 */
    private boolean f29504i1 = false;

    /* JADX INFO: renamed from: j1 */
    int f29505j1 = 0;

    /* JADX INFO: renamed from: k1 */
    private WeakReference f29506k1 = null;

    /* JADX INFO: renamed from: l1 */
    private WeakReference f29507l1 = null;

    /* JADX INFO: renamed from: m1 */
    private WeakReference f29508m1 = null;

    /* JADX INFO: renamed from: n1 */
    private WeakReference f29509n1 = null;

    /* JADX INFO: renamed from: o1 */
    HashSet f29510o1 = new HashSet();

    /* JADX INFO: renamed from: p1 */
    public C7431b.a f29511p1 = new C7431b.a();

    /* JADX INFO: renamed from: B1 */
    private void m32574B1(C7369d c7369d, C7151i c7151i) {
        this.f29487R0.m31580h(c7151i, this.f29487R0.m31587q(c7369d), 0, 5);
    }

    /* JADX INFO: renamed from: C1 */
    private void m32575C1(C7369d c7369d, C7151i c7151i) {
        this.f29487R0.m31580h(this.f29487R0.m31587q(c7369d), c7151i, 0, 5);
    }

    /* JADX INFO: renamed from: D1 */
    private void m32576D1(C7370e c7370e) {
        int i7 = this.f29493X0 + 1;
        C7368c[] c7368cArr = this.f29494Y0;
        if (i7 >= c7368cArr.length) {
            this.f29494Y0 = (C7368c[]) Arrays.copyOf(c7368cArr, c7368cArr.length * 2);
        }
        this.f29494Y0[this.f29493X0] = new C7368c(c7370e, 1, m32594R1());
        this.f29493X0++;
    }

    /* JADX INFO: renamed from: U1 */
    public static boolean m32577U1(int i7, C7370e c7370e, C7431b.b bVar, C7431b.a aVar, int i8) {
        int i9;
        int i10;
        if (bVar == null) {
            return false;
        }
        if (c7370e.m32506V() == 8 || (c7370e instanceof C7373h) || (c7370e instanceof C7366a)) {
            aVar.f29766e = 0;
            aVar.f29767f = 0;
            return false;
        }
        aVar.f29762a = c7370e.m32467A();
        aVar.f29763b = c7370e.m32502T();
        aVar.f29764c = c7370e.m32508W();
        aVar.f29765d = c7370e.m32570x();
        aVar.f29770i = false;
        aVar.f29771j = i8;
        C7370e.b bVar2 = aVar.f29762a;
        C7370e.b bVar3 = C7370e.b.MATCH_CONSTRAINT;
        boolean z7 = bVar2 == bVar3;
        boolean z8 = aVar.f29763b == bVar3;
        boolean z9 = z7 && c7370e.f29431d0 > 0.0f;
        boolean z10 = z8 && c7370e.f29431d0 > 0.0f;
        if (z7 && c7370e.m32516a0(0) && c7370e.f29468w == 0 && !z9) {
            aVar.f29762a = C7370e.b.WRAP_CONTENT;
            if (z8 && c7370e.f29470x == 0) {
                aVar.f29762a = C7370e.b.FIXED;
            }
            z7 = false;
        }
        if (z8 && c7370e.m32516a0(1) && c7370e.f29470x == 0 && !z10) {
            aVar.f29763b = C7370e.b.WRAP_CONTENT;
            if (z7 && c7370e.f29468w == 0) {
                aVar.f29763b = C7370e.b.FIXED;
            }
            z8 = false;
        }
        if (c7370e.mo32423n0()) {
            aVar.f29762a = C7370e.b.FIXED;
            z7 = false;
        }
        if (c7370e.mo32424o0()) {
            aVar.f29763b = C7370e.b.FIXED;
            z8 = false;
        }
        if (z9) {
            if (c7370e.f29472y[0] == 4) {
                aVar.f29762a = C7370e.b.FIXED;
            } else if (!z8) {
                C7370e.b bVar4 = aVar.f29763b;
                C7370e.b bVar5 = C7370e.b.FIXED;
                if (bVar4 == bVar5) {
                    i10 = aVar.f29765d;
                } else {
                    aVar.f29762a = C7370e.b.WRAP_CONTENT;
                    bVar.mo10379b(c7370e, aVar);
                    i10 = aVar.f29767f;
                }
                aVar.f29762a = bVar5;
                aVar.f29764c = (int) (c7370e.m32566v() * i10);
            }
        }
        if (z10) {
            if (c7370e.f29472y[1] == 4) {
                aVar.f29763b = C7370e.b.FIXED;
            } else if (!z7) {
                C7370e.b bVar6 = aVar.f29762a;
                C7370e.b bVar7 = C7370e.b.FIXED;
                if (bVar6 == bVar7) {
                    i9 = aVar.f29764c;
                } else {
                    aVar.f29763b = C7370e.b.WRAP_CONTENT;
                    bVar.mo10379b(c7370e, aVar);
                    i9 = aVar.f29766e;
                }
                aVar.f29763b = bVar7;
                if (c7370e.m32568w() == -1) {
                    aVar.f29765d = (int) (i9 / c7370e.m32566v());
                } else {
                    aVar.f29765d = (int) (c7370e.m32566v() * i9);
                }
            }
        }
        bVar.mo10379b(c7370e, aVar);
        c7370e.m32543l1(aVar.f29766e);
        c7370e.m32491M0(aVar.f29767f);
        c7370e.m32489L0(aVar.f29769h);
        c7370e.m32469B0(aVar.f29768g);
        aVar.f29771j = C7431b.a.f29759k;
        return aVar.f29770i;
    }

    /* JADX INFO: renamed from: W1 */
    private void m32578W1() {
        this.f29492W0 = 0;
        this.f29493X0 = 0;
    }

    /* JADX INFO: renamed from: y1 */
    private void m32579y1(C7370e c7370e) {
        int i7 = this.f29492W0 + 1;
        C7368c[] c7368cArr = this.f29495Z0;
        if (i7 >= c7368cArr.length) {
            this.f29495Z0 = (C7368c[]) Arrays.copyOf(c7368cArr, c7368cArr.length * 2);
        }
        this.f29495Z0[this.f29492W0] = new C7368c(c7370e, 0, m32594R1());
        this.f29492W0++;
    }

    /* JADX INFO: renamed from: A1 */
    public void m32580A1(C7369d c7369d) {
        WeakReference weakReference = this.f29507l1;
        if (weakReference == null || weakReference.get() == null || c7369d.m32440e() > ((C7369d) this.f29507l1.get()).m32440e()) {
            this.f29507l1 = new WeakReference(c7369d);
        }
    }

    /* JADX INFO: renamed from: E1 */
    void m32581E1(C7369d c7369d) {
        WeakReference weakReference = this.f29508m1;
        if (weakReference == null || weakReference.get() == null || c7369d.m32440e() > ((C7369d) this.f29508m1.get()).m32440e()) {
            this.f29508m1 = new WeakReference(c7369d);
        }
    }

    /* JADX INFO: renamed from: F1 */
    void m32582F1(C7369d c7369d) {
        WeakReference weakReference = this.f29506k1;
        if (weakReference == null || weakReference.get() == null || c7369d.m32440e() > ((C7369d) this.f29506k1.get()).m32440e()) {
            this.f29506k1 = new WeakReference(c7369d);
        }
    }

    /* JADX INFO: renamed from: G1 */
    public boolean m32583G1(boolean z7) {
        return this.f29483N0.m32927f(z7);
    }

    /* JADX INFO: renamed from: H1 */
    public boolean m32584H1(boolean z7) {
        return this.f29483N0.m32928g(z7);
    }

    /* JADX INFO: renamed from: I1 */
    public boolean m32585I1(boolean z7, int i7) {
        return this.f29483N0.m32929h(z7, i7);
    }

    /* JADX INFO: renamed from: J1 */
    public void m32586J1(AbstractC7147e abstractC7147e) {
        this.f29487R0.m31590v(abstractC7147e);
    }

    /* JADX INFO: renamed from: K1 */
    public C7431b.b m32587K1() {
        return this.f29485P0;
    }

    /* JADX INFO: renamed from: L1 */
    public int m32588L1() {
        return this.f29501f1;
    }

    /* JADX INFO: renamed from: M1 */
    public C7146d m32589M1() {
        return this.f29487R0;
    }

    /* JADX INFO: renamed from: N1 */
    public boolean m32590N1() {
        return false;
    }

    @Override // p385x.C7370e
    /* JADX INFO: renamed from: O */
    public void mo32494O(StringBuilder sb) {
        sb.append(this.f29452o + ":{\n");
        sb.append("  actualWidth:" + this.f29427b0);
        sb.append("\n");
        sb.append("  actualHeight:" + this.f29429c0);
        sb.append("\n");
        Iterator it = m32704s1().iterator();
        while (it.hasNext()) {
            ((C7370e) it.next()).mo32494O(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    /* JADX INFO: renamed from: O1 */
    public void m32591O1() {
        this.f29483N0.m32930j();
    }

    /* JADX INFO: renamed from: P1 */
    public void m32592P1() {
        this.f29483N0.m32931k();
    }

    /* JADX INFO: renamed from: Q1 */
    public boolean m32593Q1() {
        return this.f29504i1;
    }

    /* JADX INFO: renamed from: R1 */
    public boolean m32594R1() {
        return this.f29486Q0;
    }

    /* JADX INFO: renamed from: S1 */
    public boolean m32595S1() {
        return this.f29503h1;
    }

    /* JADX INFO: renamed from: T1 */
    public long m32596T1(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f29488S0 = i14;
        this.f29489T0 = i15;
        return this.f29482M0.m32909d(this, i7, i14, i15, i8, i9, i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: V1 */
    public boolean m32597V1(int i7) {
        return (this.f29501f1 & i7) == i7;
    }

    /* JADX INFO: renamed from: X1 */
    public void m32598X1(C7431b.b bVar) {
        this.f29485P0 = bVar;
        this.f29483N0.m32933n(bVar);
    }

    /* JADX INFO: renamed from: Y1 */
    public void m32599Y1(int i7) {
        this.f29501f1 = i7;
        C7146d.f28472s = m32597V1(512);
    }

    /* JADX INFO: renamed from: Z1 */
    public void m32600Z1(int i7) {
        this.f29484O0 = i7;
    }

    /* JADX INFO: renamed from: a2 */
    public void m32601a2(boolean z7) {
        this.f29486Q0 = z7;
    }

    /* JADX INFO: renamed from: b2 */
    public boolean m32602b2(C7146d c7146d, boolean[] zArr) {
        zArr[2] = false;
        boolean zM32597V1 = m32597V1(64);
        mo32559r1(c7146d, zM32597V1);
        int size = this.f29580L0.size();
        boolean z7 = false;
        for (int i7 = 0; i7 < size; i7++) {
            C7370e c7370e = (C7370e) this.f29580L0.get(i7);
            c7370e.mo32559r1(c7146d, zM32597V1);
            if (c7370e.m32520c0()) {
                z7 = true;
            }
        }
        return z7;
    }

    /* JADX INFO: renamed from: c2 */
    public void m32603c2() {
        this.f29482M0.m32910e(this);
    }

    @Override // p385x.C7370e
    /* JADX INFO: renamed from: q1 */
    public void mo32556q1(boolean z7, boolean z8) {
        super.mo32556q1(z7, z8);
        int size = this.f29580L0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((C7370e) this.f29580L0.get(i7)).mo32556q1(z7, z8);
        }
    }

    @Override // p385x.AbstractC7378m, p385x.C7370e
    /* JADX INFO: renamed from: t0 */
    public void mo32563t0() {
        this.f29487R0.m31573E();
        this.f29488S0 = 0;
        this.f29490U0 = 0;
        this.f29489T0 = 0;
        this.f29491V0 = 0;
        this.f29502g1 = false;
        super.mo32563t0();
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0214  */
    /* JADX WARN: Code duplicated, block: B:122:0x021d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0226 A[LOOP:5: B:123:0x0224->B:124:0x0226, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:146:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:151:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:157:0x0308  */
    /* JADX WARN: Code duplicated, block: B:164:0x0329 A[PHI: r13 r19
      0x0329: PHI (r13v9 ??) = (r13v8 ??), (r13v11 ??), (r13v11 ??), (r13v11 ??) binds: [B:150:0x02e5, B:159:0x030e, B:160:0x0310, B:162:0x0316] A[DONT_GENERATE, DONT_INLINE]
      0x0329: PHI (r19v4 ??) = (r19v3 ??), (r19v6 ??), (r19v6 ??), (r19v6 ??) binds: [B:150:0x02e5, B:159:0x030e, B:160:0x0310, B:162:0x0316] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:166:0x032d  */
    /* JADX WARN: Code duplicated, block: B:167:0x0330  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    @Override // p385x.AbstractC7378m
    /* JADX INFO: renamed from: t1 */
    public void mo32604t1() {
        int i7;
        int i8;
        boolean z7;
        int i9;
        ?? r18;
        char c7;
        ?? M32606x1;
        int i10;
        ?? M32602b2;
        ?? r19;
        int iMax;
        ?? r110;
        ?? r13;
        int iMax2;
        ?? r111;
        ?? r14;
        int i11;
        ?? r112;
        ?? r15;
        ?? r16;
        C7370e.b bVar;
        C7370e.b bVar2;
        ?? r7;
        ?? r17;
        ?? r8;
        C7370e.b bVar3;
        int i12 = 0;
        this.f29435f0 = 0;
        this.f29437g0 = 0;
        this.f29503h1 = false;
        this.f29504i1 = false;
        int size = this.f29580L0.size();
        int iMax3 = Math.max(0, m32508W());
        int iMax4 = Math.max(0, m32570x());
        C7370e.b[] bVarArr = this.f29423Z;
        boolean z8 = true;
        C7370e.b bVar4 = bVarArr[1];
        C7370e.b bVar5 = bVarArr[0];
        if (this.f29484O0 == 0 && AbstractC7376k.m32681b(this.f29501f1, 1)) {
            AbstractC7437h.m32945h(this, m32587K1());
            for (int i13 = 0; i13 < size; i13++) {
                C7370e c7370e = (C7370e) this.f29580L0.get(i13);
                if (c7370e.m32545m0() && !(c7370e instanceof C7373h) && !(c7370e instanceof C7366a) && !(c7370e instanceof AbstractC7377l) && !c7370e.m32542l0()) {
                    C7370e.b bVarM32564u = c7370e.m32564u(0);
                    C7370e.b bVarM32564u2 = c7370e.m32564u(1);
                    C7370e.b bVar6 = C7370e.b.MATCH_CONSTRAINT;
                    if (bVarM32564u != bVar6 || c7370e.f29468w == 1 || bVarM32564u2 != bVar6 || c7370e.f29470x == 1) {
                        m32577U1(0, c7370e, this.f29485P0, new C7431b.a(), C7431b.a.f29759k);
                    }
                }
            }
        }
        char c8 = 2;
        if (size <= 2 || !((bVar5 == (bVar3 = C7370e.b.WRAP_CONTENT) || bVar4 == bVar3) && AbstractC7376k.m32681b(this.f29501f1, 1024) && AbstractC7438i.m32949c(this, m32587K1()))) {
            i7 = iMax4;
            i8 = iMax3;
            z7 = false;
        } else {
            if (bVar5 == bVar3) {
                if (iMax3 >= m32508W() || iMax3 <= 0) {
                    iMax3 = m32508W();
                } else {
                    m32543l1(iMax3);
                    this.f29503h1 = true;
                }
            }
            if (bVar4 == bVar3) {
                if (iMax4 >= m32570x() || iMax4 <= 0) {
                    iMax4 = m32570x();
                } else {
                    m32491M0(iMax4);
                    this.f29504i1 = true;
                }
            }
            i7 = iMax4;
            i8 = iMax3;
            z7 = true;
        }
        boolean z9 = m32597V1(64) || m32597V1(128);
        C7146d c7146d = this.f29487R0;
        c7146d.f28487i = false;
        c7146d.f28488j = false;
        if (this.f29501f1 != 0 && z9) {
            c7146d.f28488j = true;
        }
        ArrayList arrayList = this.f29580L0;
        C7370e.b bVarM32467A = m32467A();
        C7370e.b bVar7 = C7370e.b.WRAP_CONTENT;
        boolean z10 = bVarM32467A == bVar7 || m32502T() == bVar7;
        m32578W1();
        for (int i14 = 0; i14 < size; i14++) {
            C7370e c7370e2 = (C7370e) this.f29580L0.get(i14);
            if (c7370e2 instanceof AbstractC7378m) {
                ((AbstractC7378m) c7370e2).mo32604t1();
            }
        }
        boolean zM32597V1 = m32597V1(64);
        ?? r113 = z7;
        int i15 = 0;
        ?? r114 = 1;
        while (r114 != 0) {
            int i16 = i15 + 1;
            try {
                this.f29487R0.m31573E();
                m32578W1();
                m32544m(this.f29487R0);
                int i17 = i12;
                while (i17 < size) {
                    i9 = i12;
                    try {
                        c7 = c8;
                        try {
                            ((C7370e) this.f29580L0.get(i17)).m32544m(this.f29487R0);
                            i17++;
                            i12 = i9;
                            c8 = c7;
                        } catch (Exception e7) {
                            e = e7;
                            r18 = z8;
                            M32606x1 = r114;
                            e.printStackTrace();
                            System.out.println("EXCEPTION : " + e);
                            if (M32606x1 != 0) {
                                M32602b2 = m32602b2(this.f29487R0, AbstractC7376k.f29566a);
                            } else {
                                mo32559r1(this.f29487R0, zM32597V1);
                                for (i10 = i9; i10 < size; i10++) {
                                    ((C7370e) this.f29580L0.get(i10)).mo32559r1(this.f29487R0, zM32597V1);
                                }
                                M32602b2 = i9;
                            }
                            if (z10) {
                                r19 = M32602b2 == true ? 1 : 0;
                            } else {
                                r19 = M32602b2 == true ? 1 : 0;
                            }
                            iMax = Math.max(this.f29449m0, m32508W());
                            r13 = r113;
                            r110 = r19;
                            if (iMax > m32508W()) {
                                m32543l1(iMax);
                                this.f29423Z[i9] = C7370e.b.FIXED;
                                ?? r115 = r18;
                                r110 = r115 == true ? 1 : 0;
                                r13 = r115;
                            }
                            iMax2 = Math.max(this.f29451n0, m32570x());
                            r14 = r13;
                            r111 = r110;
                            if (iMax2 > m32570x()) {
                                m32491M0(iMax2);
                                this.f29423Z[r18] = C7370e.b.FIXED;
                                r17 = r18;
                                r111 = r17 == true ? 1 : 0;
                            }
                            if (r14 == 0) {
                                bVar = this.f29423Z[i9];
                                bVar2 = C7370e.b.WRAP_CONTENT;
                                if (bVar == bVar2) {
                                    r14 = r17;
                                    r7 = r18;
                                    r14 = r14;
                                    r111 = r111;
                                } else {
                                    r14 = r17;
                                    r7 = r18;
                                    r14 = r14;
                                    r111 = r111;
                                }
                                if (this.f29423Z[r7] == bVar2) {
                                    r14 = r17;
                                    i11 = 8;
                                    r15 = r14;
                                    r112 = r111;
                                } else {
                                    r14 = r17;
                                    i11 = 8;
                                    r15 = r14;
                                    r112 = r111;
                                }
                            } else {
                                r14 = r17;
                                i11 = 8;
                                r15 = r14;
                                r112 = r111;
                            }
                            if (i16 > i11) {
                                r16 = i9;
                            } else {
                                r16 = r112;
                            }
                            i15 = i16;
                            i12 = i9;
                            c8 = c7;
                            z8 = true;
                            r113 = r15;
                            r114 = r16;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        c7 = c8;
                    }
                }
                i9 = i12;
                c7 = c8;
                M32606x1 = m32606x1(this.f29487R0);
                WeakReference weakReference = this.f29506k1;
                if (weakReference == null || weakReference.get() == null) {
                    r18 = z8;
                } else {
                    boolean z11 = z8;
                    try {
                        m32575C1((C7369d) this.f29506k1.get(), this.f29487R0.m31587q(this.f29413P));
                        this.f29506k1 = null;
                        r18 = z11;
                    } catch (Exception e9) {
                        e = e9;
                        M32606x1 = M32606x1;
                        r18 = z11;
                        e.printStackTrace();
                        System.out.println("EXCEPTION : " + e);
                    }
                }
                WeakReference weakReference2 = this.f29508m1;
                if (weakReference2 != null && weakReference2.get() != null) {
                    m32574B1((C7369d) this.f29508m1.get(), this.f29487R0.m31587q(this.f29415R));
                    this.f29508m1 = null;
                }
                WeakReference weakReference3 = this.f29507l1;
                if (weakReference3 != null && weakReference3.get() != null) {
                    m32575C1((C7369d) this.f29507l1.get(), this.f29487R0.m31587q(this.f29412O));
                    this.f29507l1 = null;
                }
                WeakReference weakReference4 = this.f29509n1;
                if (weakReference4 != null && weakReference4.get() != null) {
                    m32574B1((C7369d) this.f29509n1.get(), this.f29487R0.m31587q(this.f29414Q));
                    this.f29509n1 = null;
                }
                if (M32606x1 != 0) {
                    this.f29487R0.m31571A();
                }
            } catch (Exception e10) {
                e = e10;
                i9 = i12;
                r18 = z8;
                c7 = c8;
                M32606x1 = r114;
            }
            if (M32606x1 != 0) {
                M32602b2 = m32602b2(this.f29487R0, AbstractC7376k.f29566a);
            } else {
                mo32559r1(this.f29487R0, zM32597V1);
                while (i10 < size) {
                    ((C7370e) this.f29580L0.get(i10)).mo32559r1(this.f29487R0, zM32597V1);
                }
                M32602b2 = i9;
            }
            if (z10 || i16 >= 8 || !AbstractC7376k.f29566a[c7]) {
                r19 = M32602b2 == true ? 1 : 0;
            } else {
                int i18 = i9;
                int iMax5 = i18;
                int iMax6 = iMax5;
                while (i18 < size) {
                    r8 = M32602b2;
                    C7370e c7370e3 = (C7370e) this.f29580L0.get(i18);
                    iMax5 = Math.max(iMax5, c7370e3.f29435f0 + c7370e3.m32508W());
                    iMax6 = Math.max(iMax6, c7370e3.f29437g0 + c7370e3.m32570x());
                    i18++;
                    r8 = r8 == true ? 1 : 0;
                }
                r8 = M32602b2;
                ?? r116 = r8;
                int iMax7 = Math.max(this.f29449m0, iMax5);
                int iMax8 = Math.max(this.f29451n0, iMax6);
                C7370e.b bVar8 = C7370e.b.WRAP_CONTENT;
                r113 = r113;
                r19 = r116;
                if (bVar5 == bVar8 && m32508W() < iMax7) {
                    r113 = r113;
                    r19 = r116;
                    m32543l1(iMax7);
                    this.f29423Z[i9] = bVar8;
                    ?? r117 = r18;
                    r19 = r117 == true ? 1 : 0;
                    r113 = r117;
                }
                if (bVar4 == bVar8 && m32570x() < iMax8) {
                    m32491M0(iMax8);
                    this.f29423Z[r18] = bVar8;
                    r113 = r18;
                    r19 = r113 == true ? 1 : 0;
                }
            }
            iMax = Math.max(this.f29449m0, m32508W());
            r13 = r113;
            r110 = r19;
            if (iMax > m32508W()) {
                m32543l1(iMax);
                this.f29423Z[i9] = C7370e.b.FIXED;
                ?? r118 = r18;
                r110 = r118 == true ? 1 : 0;
                r13 = r118;
            }
            iMax2 = Math.max(this.f29451n0, m32570x());
            r14 = r13;
            r111 = r110;
            if (iMax2 > m32570x()) {
                m32491M0(iMax2);
                this.f29423Z[r18] = C7370e.b.FIXED;
                r17 = r18;
                r111 = r17 == true ? 1 : 0;
            }
            if (r14 == 0) {
                bVar = this.f29423Z[i9];
                bVar2 = C7370e.b.WRAP_CONTENT;
                if (bVar == bVar2 || i8 <= 0 || m32508W() <= i8) {
                    r14 = r17;
                    r7 = r18;
                    r14 = r14;
                    r111 = r111;
                } else {
                    ?? r9 = r18;
                    this.f29503h1 = r9;
                    this.f29423Z[i9] = C7370e.b.FIXED;
                    m32543l1(i8);
                    boolean z12 = r9 == true ? 1 : 0;
                    r111 = z12 ? 1 : 0;
                    r7 = r9;
                    r14 = z12;
                }
                if (this.f29423Z[r7] == bVar2 || i7 <= 0 || m32570x() <= i7) {
                    r14 = r17;
                    i11 = 8;
                    r15 = r14;
                    r112 = r111;
                } else {
                    this.f29504i1 = r7;
                    this.f29423Z[r7] = C7370e.b.FIXED;
                    m32491M0(i7);
                    i11 = 8;
                    r15 = 1;
                    r112 = 1;
                }
            } else {
                r14 = r17;
                i11 = 8;
                r15 = r14;
                r112 = r111;
            }
            if (i16 > i11) {
                r16 = i9;
            } else {
                r16 = r112;
            }
            i15 = i16;
            i12 = i9;
            c8 = c7;
            z8 = true;
            r113 = r15;
            r114 = r16;
        }
        int i19 = i12;
        this.f29580L0 = arrayList;
        if (r113 != 0) {
            C7370e.b[] bVarArr2 = this.f29423Z;
            bVarArr2[i19] = bVar5;
            bVarArr2[1] = bVar4;
        }
        mo32569w0(this.f29487R0.m31591w());
    }

    /* JADX INFO: renamed from: w1 */
    void m32605w1(C7370e c7370e, int i7) {
        if (i7 == 0) {
            m32579y1(c7370e);
        } else if (i7 == 1) {
            m32576D1(c7370e);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m32606x1(C7146d c7146d) {
        C7371f c7371f;
        C7146d c7146d2;
        boolean zM32597V1 = m32597V1(64);
        mo32421g(c7146d, zM32597V1);
        int size = this.f29580L0.size();
        boolean z7 = false;
        for (int i7 = 0; i7 < size; i7++) {
            C7370e c7370e = (C7370e) this.f29580L0.get(i7);
            c7370e.m32503T0(0, false);
            c7370e.m32503T0(1, false);
            if (c7370e instanceof C7366a) {
                z7 = true;
            }
        }
        if (z7) {
            for (int i8 = 0; i8 < size; i8++) {
                C7370e c7370e2 = (C7370e) this.f29580L0.get(i8);
                if (c7370e2 instanceof C7366a) {
                    ((C7366a) c7370e2).m32430z1();
                }
            }
        }
        this.f29510o1.clear();
        for (int i9 = 0; i9 < size; i9++) {
            C7370e c7370e3 = (C7370e) this.f29580L0.get(i9);
            if (c7370e3.m32527f()) {
                if (c7370e3 instanceof AbstractC7377l) {
                    this.f29510o1.add(c7370e3);
                } else {
                    c7370e3.mo32421g(c7146d, zM32597V1);
                }
            }
        }
        while (this.f29510o1.size() > 0) {
            int size2 = this.f29510o1.size();
            Iterator it = this.f29510o1.iterator();
            while (it.hasNext()) {
                AbstractC7377l abstractC7377l = (AbstractC7377l) ((C7370e) it.next());
                if (abstractC7377l.m32699w1(this.f29510o1)) {
                    abstractC7377l.mo32421g(c7146d, zM32597V1);
                    this.f29510o1.remove(abstractC7377l);
                    break;
                }
            }
            if (size2 == this.f29510o1.size()) {
                Iterator it2 = this.f29510o1.iterator();
                while (it2.hasNext()) {
                    ((C7370e) it2.next()).mo32421g(c7146d, zM32597V1);
                }
                this.f29510o1.clear();
            }
        }
        if (C7146d.f28472s) {
            HashSet<C7370e> hashSet = new HashSet();
            for (int i10 = 0; i10 < size; i10++) {
                C7370e c7370e4 = (C7370e) this.f29580L0.get(i10);
                if (!c7370e4.m32527f()) {
                    hashSet.add(c7370e4);
                }
            }
            c7371f = this;
            c7146d2 = c7146d;
            c7371f.m32524e(this, c7146d2, hashSet, m32467A() == C7370e.b.WRAP_CONTENT ? 0 : 1, false);
            for (C7370e c7370e5 : hashSet) {
                AbstractC7376k.m32680a(this, c7146d2, c7370e5);
                c7370e5.mo32421g(c7146d2, zM32597V1);
            }
        } else {
            c7371f = this;
            c7146d2 = c7146d;
            for (int i11 = 0; i11 < size; i11++) {
                C7370e c7370e6 = (C7370e) c7371f.f29580L0.get(i11);
                if (c7370e6 instanceof C7371f) {
                    C7370e.b[] bVarArr = c7370e6.f29423Z;
                    C7370e.b bVar = bVarArr[0];
                    C7370e.b bVar2 = bVarArr[1];
                    C7370e.b bVar3 = C7370e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        c7370e6.m32497Q0(C7370e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        c7370e6.m32532h1(C7370e.b.FIXED);
                    }
                    c7370e6.mo32421g(c7146d2, zM32597V1);
                    if (bVar == bVar3) {
                        c7370e6.m32497Q0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        c7370e6.m32532h1(bVar2);
                    }
                } else {
                    AbstractC7376k.m32680a(this, c7146d2, c7370e6);
                    if (!c7370e6.m32527f()) {
                        c7370e6.mo32421g(c7146d2, zM32597V1);
                    }
                }
            }
        }
        if (c7371f.f29492W0 > 0) {
            AbstractC7367b.m32432b(this, c7146d2, null, 0);
        }
        if (c7371f.f29493X0 > 0) {
            AbstractC7367b.m32432b(this, c7146d2, null, 1);
        }
        return true;
    }

    /* JADX INFO: renamed from: z1 */
    public void m32607z1(C7369d c7369d) {
        WeakReference weakReference = this.f29509n1;
        if (weakReference == null || weakReference.get() == null || c7369d.m32440e() > ((C7369d) this.f29509n1.get()).m32440e()) {
            this.f29509n1 = new WeakReference(c7369d);
        }
    }
}
