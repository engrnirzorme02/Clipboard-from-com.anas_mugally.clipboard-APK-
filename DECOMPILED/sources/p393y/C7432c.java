package p393y;

import java.util.ArrayList;
import java.util.Iterator;
import p385x.C7369d;
import p385x.C7370e;
import p385x.C7371f;

/* JADX INFO: renamed from: y.c */
/* JADX INFO: loaded from: classes.dex */
public class C7432c extends AbstractC7445p {

    /* JADX INFO: renamed from: k */
    ArrayList f29772k;

    /* JADX INFO: renamed from: l */
    private int f29773l;

    public C7432c(C7370e c7370e, int i7) {
        super(c7370e);
        this.f29772k = new ArrayList();
        this.f29840f = i7;
        m32911q();
    }

    /* JADX INFO: renamed from: q */
    private void m32911q() {
        C7370e c7370e;
        C7370e c7370e2 = this.f29836b;
        C7370e c7370eM32488L = c7370e2.m32488L(this.f29840f);
        while (true) {
            C7370e c7370e3 = c7370eM32488L;
            c7370e = c7370e2;
            c7370e2 = c7370e3;
            if (c7370e2 == null) {
                break;
            } else {
                c7370eM32488L = c7370e2.m32488L(this.f29840f);
            }
        }
        this.f29836b = c7370e;
        this.f29772k.add(c7370e.m32492N(this.f29840f));
        C7370e c7370eM32484J = c7370e.m32484J(this.f29840f);
        while (c7370eM32484J != null) {
            this.f29772k.add(c7370eM32484J.m32492N(this.f29840f));
            c7370eM32484J = c7370eM32484J.m32484J(this.f29840f);
        }
        for (AbstractC7445p abstractC7445p : this.f29772k) {
            int i7 = this.f29840f;
            if (i7 == 0) {
                abstractC7445p.f29836b.f29428c = this;
            } else if (i7 == 1) {
                abstractC7445p.f29836b.f29430d = this;
            }
        }
        if (this.f29840f == 0 && ((C7371f) this.f29836b.m32486K()).m32594R1() && this.f29772k.size() > 1) {
            ArrayList arrayList = this.f29772k;
            this.f29836b = ((AbstractC7445p) arrayList.get(arrayList.size() - 1)).f29836b;
        }
        this.f29773l = this.f29840f == 0 ? this.f29836b.m32572z() : this.f29836b.m32500S();
    }

    /* JADX INFO: renamed from: r */
    private C7370e m32912r() {
        for (int i7 = 0; i7 < this.f29772k.size(); i7++) {
            AbstractC7445p abstractC7445p = (AbstractC7445p) this.f29772k.get(i7);
            if (abstractC7445p.f29836b.m32506V() != 8) {
                return abstractC7445p.f29836b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    private C7370e m32913s() {
        for (int size = this.f29772k.size() - 1; size >= 0; size--) {
            AbstractC7445p abstractC7445p = (AbstractC7445p) this.f29772k.get(size);
            if (abstractC7445p.f29836b.m32506V() != 8) {
                return abstractC7445p.f29836b;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0160  */
    @Override // p393y.AbstractC7445p, p393y.InterfaceC7433d
    /* JADX INFO: renamed from: a */
    public void mo32914a(InterfaceC7433d interfaceC7433d) {
        int i7;
        int i8;
        boolean z7;
        float f7;
        float f8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f9;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z8;
        if (this.f29842h.f29792j && this.f29843i.f29792j) {
            C7370e c7370eM32486K = this.f29836b.m32486K();
            boolean zM32594R1 = c7370eM32486K instanceof C7371f ? ((C7371f) c7370eM32486K).m32594R1() : false;
            int i17 = this.f29843i.f29789g - this.f29842h.f29789g;
            int size = this.f29772k.size();
            int i18 = 0;
            while (true) {
                i7 = -1;
                i8 = 8;
                if (i18 >= size) {
                    i18 = -1;
                    break;
                } else if (((AbstractC7445p) this.f29772k.get(i18)).f29836b.m32506V() != 8) {
                    break;
                } else {
                    i18++;
                }
            }
            int i19 = size - 1;
            for (int i20 = i19; i20 >= 0; i20--) {
                if (((AbstractC7445p) this.f29772k.get(i20)).f29836b.m32506V() != 8) {
                    i7 = i20;
                    break;
                }
            }
            int i21 = 0;
            while (true) {
                if (i21 >= 2) {
                    z7 = zM32594R1;
                    f7 = 0.0f;
                    f8 = 0.0f;
                    i9 = 0;
                    i10 = 0;
                    i11 = 0;
                    break;
                }
                int i22 = 0;
                i10 = 0;
                i11 = 0;
                int i23 = 0;
                f8 = 0.0f;
                while (i22 < size) {
                    AbstractC7445p abstractC7445p = (AbstractC7445p) this.f29772k.get(i22);
                    if (abstractC7445p.f29836b.m32506V() == i8) {
                        z8 = zM32594R1;
                    } else {
                        i23++;
                        if (i22 > 0 && i22 >= i18) {
                            i10 += abstractC7445p.f29842h.f29788f;
                        }
                        C7436g c7436g = abstractC7445p.f29839e;
                        int i24 = c7436g.f29789g;
                        boolean z9 = abstractC7445p.f29838d != C7370e.b.MATCH_CONSTRAINT;
                        if (z9) {
                            int i25 = this.f29840f;
                            if (i25 == 0 && !abstractC7445p.f29836b.f29432e.f29839e.f29792j) {
                                return;
                            }
                            if (i25 == 1 && !abstractC7445p.f29836b.f29434f.f29839e.f29792j) {
                                return;
                            } else {
                                z8 = zM32594R1;
                            }
                        } else {
                            z8 = zM32594R1;
                            if (abstractC7445p.f29835a == 1 && i21 == 0) {
                                i24 = c7436g.f29804m;
                                i11++;
                            } else if (c7436g.f29792j) {
                            }
                            z9 = true;
                        }
                        if (z9) {
                            i10 += i24;
                        } else {
                            i11++;
                            float f10 = abstractC7445p.f29836b.f29395D0[this.f29840f];
                            if (f10 >= 0.0f) {
                                f8 += f10;
                            }
                        }
                        if (i22 < i19 && i22 < i7) {
                            i10 += -abstractC7445p.f29843i.f29788f;
                        }
                    }
                    i22++;
                    zM32594R1 = z8;
                    i8 = 8;
                }
                z7 = zM32594R1;
                f7 = 0.0f;
                if (i10 < i17 || i11 == 0) {
                    i9 = i23;
                    break;
                } else {
                    i21++;
                    zM32594R1 = z7;
                    i8 = 8;
                }
            }
            int i26 = this.f29842h.f29789g;
            if (z7) {
                i26 = this.f29843i.f29789g;
            }
            float f11 = 0.5f;
            if (i10 > i17) {
                i26 = z7 ? i26 + ((int) (((i10 - i17) / 2.0f) + 0.5f)) : i26 - ((int) (((i10 - i17) / 2.0f) + 0.5f));
            }
            if (i11 > 0) {
                float f12 = i17 - i10;
                int i27 = (int) ((f12 / i11) + 0.5f);
                int i28 = 0;
                int i29 = 0;
                while (i28 < size) {
                    AbstractC7445p abstractC7445p2 = (AbstractC7445p) this.f29772k.get(i28);
                    float f13 = f11;
                    int i30 = i26;
                    if (abstractC7445p2.f29836b.m32506V() != 8 && abstractC7445p2.f29838d == C7370e.b.MATCH_CONSTRAINT) {
                        C7436g c7436g2 = abstractC7445p2.f29839e;
                        if (c7436g2.f29792j) {
                            i27 = i27;
                            i29 = i29;
                        } else {
                            int i31 = f8 > f7 ? (int) (((abstractC7445p2.f29836b.f29395D0[this.f29840f] * f12) / f8) + f13) : i27;
                            if (this.f29840f == 0) {
                                C7370e c7370e = abstractC7445p2.f29836b;
                                i15 = c7370e.f29388A;
                                i16 = c7370e.f29474z;
                            } else {
                                C7370e c7370e2 = abstractC7445p2.f29836b;
                                i15 = c7370e2.f29394D;
                                i16 = c7370e2.f29392C;
                            }
                            int i32 = i29;
                            int iMax = Math.max(i16, abstractC7445p2.f29835a == 1 ? Math.min(i31, c7436g2.f29804m) : i31);
                            if (i15 > 0) {
                                iMax = Math.min(i15, iMax);
                            }
                            if (iMax != i31) {
                                i29 = i32 + 1;
                                i31 = iMax;
                            } else {
                                i29 = i32;
                            }
                            abstractC7445p2.f29839e.mo32936d(i31);
                        }
                    } else {
                        i27 = i27;
                        i29 = i29;
                    }
                    i28++;
                    f11 = f13;
                    i26 = i30;
                    f12 = f12;
                    i27 = i27;
                }
                i12 = i26;
                f9 = f11;
                int i33 = i29;
                if (i33 > 0) {
                    i11 -= i33;
                    i10 = 0;
                    for (int i34 = 0; i34 < size; i34++) {
                        AbstractC7445p abstractC7445p3 = (AbstractC7445p) this.f29772k.get(i34);
                        if (abstractC7445p3.f29836b.m32506V() != 8) {
                            if (i34 > 0 && i34 >= i18) {
                                i10 += abstractC7445p3.f29842h.f29788f;
                            }
                            i10 += abstractC7445p3.f29839e.f29789g;
                            if (i34 < i19 && i34 < i7) {
                                i10 += -abstractC7445p3.f29843i.f29788f;
                            }
                        }
                    }
                }
                i14 = 2;
                if (this.f29773l == 2 && i33 == 0) {
                    i13 = 0;
                    this.f29773l = 0;
                } else {
                    i13 = 0;
                }
            } else {
                i12 = i26;
                f9 = 0.5f;
                i13 = 0;
                i14 = 2;
            }
            if (i10 > i17) {
                this.f29773l = i14;
            }
            if (i9 > 0 && i11 == 0 && i18 == i7) {
                this.f29773l = i14;
            }
            int i35 = this.f29773l;
            if (i35 == 1) {
                int i36 = i9 > 1 ? (i17 - i10) / (i9 - 1) : i9 == 1 ? (i17 - i10) / 2 : i13;
                if (i11 > 0) {
                    i36 = i13;
                }
                int i37 = i12;
                while (i13 < size) {
                    AbstractC7445p abstractC7445p4 = (AbstractC7445p) this.f29772k.get(z7 ? size - (i13 + 1) : i13);
                    if (abstractC7445p4.f29836b.m32506V() == 8) {
                        abstractC7445p4.f29842h.mo32936d(i37);
                        abstractC7445p4.f29843i.mo32936d(i37);
                    } else {
                        if (i13 > 0) {
                            i37 = z7 ? i37 - i36 : i37 + i36;
                        }
                        if (i13 > 0 && i13 >= i18) {
                            i37 = z7 ? i37 - abstractC7445p4.f29842h.f29788f : i37 + abstractC7445p4.f29842h.f29788f;
                        }
                        if (z7) {
                            abstractC7445p4.f29843i.mo32936d(i37);
                        } else {
                            abstractC7445p4.f29842h.mo32936d(i37);
                        }
                        C7436g c7436g3 = abstractC7445p4.f29839e;
                        int i38 = c7436g3.f29789g;
                        if (abstractC7445p4.f29838d == C7370e.b.MATCH_CONSTRAINT && abstractC7445p4.f29835a == 1) {
                            i38 = c7436g3.f29804m;
                        }
                        i37 = z7 ? i37 - i38 : i37 + i38;
                        if (z7) {
                            abstractC7445p4.f29842h.mo32936d(i37);
                        } else {
                            abstractC7445p4.f29843i.mo32936d(i37);
                        }
                        abstractC7445p4.f29841g = true;
                        if (i13 < i19 && i13 < i7) {
                            i37 = z7 ? i37 - (-abstractC7445p4.f29843i.f29788f) : i37 + (-abstractC7445p4.f29843i.f29788f);
                        }
                    }
                    i13++;
                }
                return;
            }
            if (i35 == 0) {
                int i39 = (i17 - i10) / (i9 + 1);
                if (i11 > 0) {
                    i39 = i13;
                }
                int i40 = i12;
                while (i13 < size) {
                    AbstractC7445p abstractC7445p5 = (AbstractC7445p) this.f29772k.get(z7 ? size - (i13 + 1) : i13);
                    if (abstractC7445p5.f29836b.m32506V() == 8) {
                        abstractC7445p5.f29842h.mo32936d(i40);
                        abstractC7445p5.f29843i.mo32936d(i40);
                    } else {
                        int i41 = z7 ? i40 - i39 : i40 + i39;
                        if (i13 > 0 && i13 >= i18) {
                            i41 = z7 ? i41 - abstractC7445p5.f29842h.f29788f : i41 + abstractC7445p5.f29842h.f29788f;
                        }
                        if (z7) {
                            abstractC7445p5.f29843i.mo32936d(i41);
                        } else {
                            abstractC7445p5.f29842h.mo32936d(i41);
                        }
                        C7436g c7436g4 = abstractC7445p5.f29839e;
                        int iMin = c7436g4.f29789g;
                        if (abstractC7445p5.f29838d == C7370e.b.MATCH_CONSTRAINT && abstractC7445p5.f29835a == 1) {
                            iMin = Math.min(iMin, c7436g4.f29804m);
                        }
                        i40 = z7 ? i41 - iMin : i41 + iMin;
                        if (z7) {
                            abstractC7445p5.f29842h.mo32936d(i40);
                        } else {
                            abstractC7445p5.f29843i.mo32936d(i40);
                        }
                        if (i13 < i19 && i13 < i7) {
                            i40 = z7 ? i40 - (-abstractC7445p5.f29843i.f29788f) : i40 + (-abstractC7445p5.f29843i.f29788f);
                        }
                    }
                    i13++;
                }
                return;
            }
            if (i35 == 2) {
                float fM32571y = this.f29840f == 0 ? this.f29836b.m32571y() : this.f29836b.m32498R();
                if (z7) {
                    fM32571y = 1.0f - fM32571y;
                }
                int i42 = (int) (((i17 - i10) * fM32571y) + f9);
                if (i42 < 0 || i11 > 0) {
                    i42 = i13;
                }
                int i43 = z7 ? i12 - i42 : i12 + i42;
                while (i13 < size) {
                    AbstractC7445p abstractC7445p6 = (AbstractC7445p) this.f29772k.get(z7 ? size - (i13 + 1) : i13);
                    if (abstractC7445p6.f29836b.m32506V() == 8) {
                        abstractC7445p6.f29842h.mo32936d(i43);
                        abstractC7445p6.f29843i.mo32936d(i43);
                    } else {
                        if (i13 > 0 && i13 >= i18) {
                            i43 = z7 ? i43 - abstractC7445p6.f29842h.f29788f : i43 + abstractC7445p6.f29842h.f29788f;
                        }
                        if (z7) {
                            abstractC7445p6.f29843i.mo32936d(i43);
                        } else {
                            abstractC7445p6.f29842h.mo32936d(i43);
                        }
                        C7436g c7436g5 = abstractC7445p6.f29839e;
                        int i44 = c7436g5.f29789g;
                        if (abstractC7445p6.f29838d == C7370e.b.MATCH_CONSTRAINT && abstractC7445p6.f29835a == 1) {
                            i44 = c7436g5.f29804m;
                        }
                        i43 = z7 ? i43 - i44 : i43 + i44;
                        if (z7) {
                            abstractC7445p6.f29842h.mo32936d(i43);
                        } else {
                            abstractC7445p6.f29843i.mo32936d(i43);
                        }
                        if (i13 < i19 && i13 < i7) {
                            i43 = z7 ? i43 - (-abstractC7445p6.f29843i.f29788f) : i43 + (-abstractC7445p6.f29843i.f29788f);
                        }
                    }
                    i13++;
                }
            }
        }
    }

    @Override // p393y.AbstractC7445p
    /* JADX INFO: renamed from: d */
    void mo32915d() {
        Iterator it = this.f29772k.iterator();
        while (it.hasNext()) {
            ((AbstractC7445p) it.next()).mo32915d();
        }
        int size = this.f29772k.size();
        if (size < 1) {
            return;
        }
        C7370e c7370e = ((AbstractC7445p) this.f29772k.get(0)).f29836b;
        C7370e c7370e2 = ((AbstractC7445p) this.f29772k.get(size - 1)).f29836b;
        if (this.f29840f == 0) {
            C7369d c7369d = c7370e.f29412O;
            C7369d c7369d2 = c7370e2.f29414Q;
            C7435f c7435fM32975i = m32975i(c7369d, 0);
            int iM32441f = c7369d.m32441f();
            C7370e c7370eM32912r = m32912r();
            if (c7370eM32912r != null) {
                iM32441f = c7370eM32912r.f29412O.m32441f();
            }
            if (c7435fM32975i != null) {
                m32971b(this.f29842h, c7435fM32975i, iM32441f);
            }
            C7435f c7435fM32975i2 = m32975i(c7369d2, 0);
            int iM32441f2 = c7369d2.m32441f();
            C7370e c7370eM32913s = m32913s();
            if (c7370eM32913s != null) {
                iM32441f2 = c7370eM32913s.f29414Q.m32441f();
            }
            if (c7435fM32975i2 != null) {
                m32971b(this.f29843i, c7435fM32975i2, -iM32441f2);
            }
        } else {
            C7369d c7369d3 = c7370e.f29413P;
            C7369d c7369d4 = c7370e2.f29415R;
            C7435f c7435fM32975i3 = m32975i(c7369d3, 1);
            int iM32441f3 = c7369d3.m32441f();
            C7370e c7370eM32912r2 = m32912r();
            if (c7370eM32912r2 != null) {
                iM32441f3 = c7370eM32912r2.f29413P.m32441f();
            }
            if (c7435fM32975i3 != null) {
                m32971b(this.f29842h, c7435fM32975i3, iM32441f3);
            }
            C7435f c7435fM32975i4 = m32975i(c7369d4, 1);
            int iM32441f4 = c7369d4.m32441f();
            C7370e c7370eM32913s2 = m32913s();
            if (c7370eM32913s2 != null) {
                iM32441f4 = c7370eM32913s2.f29415R.m32441f();
            }
            if (c7435fM32975i4 != null) {
                m32971b(this.f29843i, c7435fM32975i4, -iM32441f4);
            }
        }
        this.f29842h.f29783a = this;
        this.f29843i.f29783a = this;
    }

    @Override // p393y.AbstractC7445p
    /* JADX INFO: renamed from: e */
    public void mo32916e() {
        for (int i7 = 0; i7 < this.f29772k.size(); i7++) {
            ((AbstractC7445p) this.f29772k.get(i7)).mo32916e();
        }
    }

    @Override // p393y.AbstractC7445p
    /* JADX INFO: renamed from: f */
    void mo32917f() {
        this.f29837c = null;
        Iterator it = this.f29772k.iterator();
        while (it.hasNext()) {
            ((AbstractC7445p) it.next()).mo32917f();
        }
    }

    @Override // p393y.AbstractC7445p
    /* JADX INFO: renamed from: j */
    public long mo32918j() {
        int size = this.f29772k.size();
        long jMo32918j = 0;
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC7445p abstractC7445p = (AbstractC7445p) this.f29772k.get(i7);
            jMo32918j = jMo32918j + ((long) abstractC7445p.f29842h.f29788f) + abstractC7445p.mo32918j() + ((long) abstractC7445p.f29843i.f29788f);
        }
        return jMo32918j;
    }

    @Override // p393y.AbstractC7445p
    /* JADX INFO: renamed from: m */
    boolean mo32919m() {
        int size = this.f29772k.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!((AbstractC7445p) this.f29772k.get(i7)).mo32919m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f29840f == 0 ? "horizontal : " : "vertical : ");
        for (AbstractC7445p abstractC7445p : this.f29772k) {
            sb.append("<");
            sb.append(abstractC7445p);
            sb.append("> ");
        }
        return sb.toString();
    }
}
