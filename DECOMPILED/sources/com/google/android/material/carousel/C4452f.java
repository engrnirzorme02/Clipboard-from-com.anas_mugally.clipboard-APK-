package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p065I.AbstractC0577a;
import p333q3.AbstractC6826a;
import p373v3.InterfaceC7227a;

/* JADX INFO: renamed from: com.google.android.material.carousel.f */
/* JADX INFO: loaded from: classes2.dex */
public class C4452f {

    /* JADX INFO: renamed from: a */
    private final C4451e f16723a;

    /* JADX INFO: renamed from: b */
    private final List f16724b;

    /* JADX INFO: renamed from: c */
    private final List f16725c;

    /* JADX INFO: renamed from: d */
    private final float[] f16726d;

    /* JADX INFO: renamed from: e */
    private final float[] f16727e;

    /* JADX INFO: renamed from: f */
    private final float f16728f;

    /* JADX INFO: renamed from: g */
    private final float f16729g;

    /* JADX INFO: renamed from: com.google.android.material.carousel.f$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f16730a;

        static {
            int[] iArr = new int[AbstractC4449c.a.values().length];
            f16730a = iArr;
            try {
                iArr[AbstractC4449c.a.CONTAINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private C4452f(C4451e c4451e, List list, List list2) {
        this.f16723a = c4451e;
        this.f16724b = Collections.unmodifiableList(list);
        this.f16725c = Collections.unmodifiableList(list2);
        float f7 = ((C4451e) list.get(list.size() - 1)).m19983d().f16715a - c4451e.m19983d().f16715a;
        this.f16728f = f7;
        float f8 = c4451e.m19990k().f16715a - ((C4451e) list2.get(list2.size() - 1)).m19990k().f16715a;
        this.f16729g = f8;
        this.f16726d = m20011m(f7, list, true);
        this.f16727e = m20011m(f8, list2, false);
    }

    /* JADX INFO: renamed from: a */
    private C4451e m20005a(List list, float f7, float[] fArr) {
        float[] fArrM20013o = m20013o(list, f7, fArr);
        return fArrM20013o[0] >= 0.5f ? (C4451e) list.get((int) fArrM20013o[2]) : (C4451e) list.get((int) fArrM20013o[1]);
    }

    /* JADX INFO: renamed from: b */
    private static int m20006b(C4451e c4451e, float f7) {
        for (int iM19989j = c4451e.m19989j(); iM19989j < c4451e.m19987h().size(); iM19989j++) {
            if (f7 == ((C4451e.c) c4451e.m19987h().get(iM19989j)).f16717c) {
                return iM19989j;
            }
        }
        return c4451e.m19987h().size() - 1;
    }

    /* JADX INFO: renamed from: c */
    private static int m20007c(C4451e c4451e) {
        for (int i7 = 0; i7 < c4451e.m19987h().size(); i7++) {
            if (!((C4451e.c) c4451e.m19987h().get(i7)).f16719e) {
                return i7;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    private static int m20008d(C4451e c4451e, float f7) {
        for (int iM19982c = c4451e.m19982c() - 1; iM19982c >= 0; iM19982c--) {
            if (f7 == ((C4451e.c) c4451e.m19987h().get(iM19982c)).f16717c) {
                return iM19982c;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    private static int m20009e(C4451e c4451e) {
        for (int size = c4451e.m19987h().size() - 1; size >= 0; size--) {
            if (!((C4451e.c) c4451e.m19987h().get(size)).f16719e) {
                return size;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    static C4452f m20010f(InterfaceC7227a interfaceC7227a, C4451e c4451e, float f7, float f8, float f9, AbstractC4449c.a aVar) {
        return new C4452f(c4451e, m20014p(interfaceC7227a, c4451e, f7, f8, aVar), m20012n(interfaceC7227a, c4451e, f7, f9, aVar));
    }

    /* JADX INFO: renamed from: m */
    private static float[] m20011m(float f7, List list, boolean z7) {
        int size = list.size();
        float[] fArr = new float[size];
        int i7 = 1;
        while (i7 < size) {
            int i8 = i7 - 1;
            C4451e c4451e = (C4451e) list.get(i8);
            C4451e c4451e2 = (C4451e) list.get(i7);
            fArr[i7] = i7 == size + (-1) ? 1.0f : fArr[i8] + ((z7 ? c4451e2.m19983d().f16715a - c4451e.m19983d().f16715a : c4451e.m19990k().f16715a - c4451e2.m19990k().f16715a) / f7);
            i7++;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: n */
    private static List m20012n(InterfaceC7227a interfaceC7227a, C4451e c4451e, float f7, float f8, AbstractC4449c.a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c4451e);
        int iM20009e = m20009e(c4451e);
        int iMo19932a = interfaceC7227a.mo19935g() ? interfaceC7227a.mo19932a() : interfaceC7227a.mo19933b();
        if (!m20016r(interfaceC7227a, c4451e) && iM20009e != -1) {
            int iM19989j = iM20009e - c4451e.m19989j();
            float f9 = c4451e.m19983d().f16716b - (c4451e.m19983d().f16718d / 2.0f);
            if (iM19989j <= 0 && c4451e.m19988i().f16720f > 0.0f) {
                arrayList.add(m20022x(c4451e, (f9 - c4451e.m19988i().f16720f) - f8, iMo19932a));
                return arrayList;
            }
            float f10 = 0.0f;
            int i7 = 0;
            while (i7 < iM19989j) {
                C4451e c4451e2 = (C4451e) arrayList.get(arrayList.size() - 1);
                int i8 = iM20009e - i7;
                float f11 = f10 + ((C4451e.c) c4451e.m19987h().get(i8)).f16720f;
                int i9 = i8 + 1;
                int i10 = iMo19932a;
                C4451e c4451eM20018t = m20018t(c4451e2, iM20009e, i9 < c4451e.m19987h().size() ? m20008d(c4451e2, ((C4451e.c) c4451e.m19987h().get(i9)).f16717c) + 1 : 0, f9 - f11, c4451e.m19982c() + i7 + 1, c4451e.m19989j() + i7 + 1, i10);
                if (i7 == iM19989j - 1 && f8 > 0.0f) {
                    c4451eM20018t = m20019u(c4451eM20018t, f8, i10, false, f7, aVar);
                    i10 = i10;
                }
                arrayList.add(c4451eM20018t);
                i7++;
                iMo19932a = i10;
                f10 = f11;
            }
        } else if (f8 > 0.0f) {
            arrayList.add(m20019u(c4451e, f8, iMo19932a, false, f7, aVar));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    private static float[] m20013o(List list, float f7, float[] fArr) {
        int size = list.size();
        float f8 = fArr[0];
        int i7 = 1;
        while (i7 < size) {
            float f9 = fArr[i7];
            if (f7 <= f9) {
                return new float[]{AbstractC6826a.m29844b(0.0f, 1.0f, f8, f9, f7), i7 - 1, i7};
            }
            i7++;
            f8 = f9;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    /* JADX INFO: renamed from: p */
    private static List m20014p(InterfaceC7227a interfaceC7227a, C4451e c4451e, float f7, float f8, AbstractC4449c.a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c4451e);
        int iM20007c = m20007c(c4451e);
        int iMo19932a = interfaceC7227a.mo19935g() ? interfaceC7227a.mo19932a() : interfaceC7227a.mo19933b();
        if (!m20015q(c4451e) && iM20007c != -1) {
            int iM19982c = c4451e.m19982c() - iM20007c;
            float f9 = c4451e.m19983d().f16716b - (c4451e.m19983d().f16718d / 2.0f);
            if (iM19982c <= 0 && c4451e.m19981b().f16720f > 0.0f) {
                arrayList.add(m20022x(c4451e, f9 + c4451e.m19981b().f16720f + f8, iMo19932a));
                return arrayList;
            }
            float f10 = 0.0f;
            for (int i7 = 0; i7 < iM19982c; i7++) {
                C4451e c4451e2 = (C4451e) arrayList.get(arrayList.size() - 1);
                int i8 = iM20007c + i7;
                int size = c4451e.m19987h().size() - 1;
                f10 += ((C4451e.c) c4451e.m19987h().get(i8)).f16720f;
                int i9 = i8 - 1;
                if (i9 >= 0) {
                    size = m20006b(c4451e2, ((C4451e.c) c4451e.m19987h().get(i9)).f16717c) - 1;
                }
                int i10 = iMo19932a;
                C4451e c4451eM20018t = m20018t(c4451e2, iM20007c, size, f9 + f10, (c4451e.m19982c() - i7) - 1, (c4451e.m19989j() - i7) - 1, i10);
                iMo19932a = i10;
                if (i7 == iM19982c - 1 && f8 > 0.0f) {
                    c4451eM20018t = m20019u(c4451eM20018t, f8, iMo19932a, true, f7, aVar);
                }
                arrayList.add(c4451eM20018t);
            }
        } else if (f8 > 0.0f) {
            arrayList.add(m20019u(c4451e, f8, iMo19932a, true, f7, aVar));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    private static boolean m20015q(C4451e c4451e) {
        return c4451e.m19981b().f16716b - (c4451e.m19981b().f16718d / 2.0f) >= 0.0f && c4451e.m19981b() == c4451e.m19984e();
    }

    /* JADX INFO: renamed from: r */
    private static boolean m20016r(InterfaceC7227a interfaceC7227a, C4451e c4451e) {
        int iMo19933b = interfaceC7227a.mo19933b();
        if (interfaceC7227a.mo19935g()) {
            iMo19933b = interfaceC7227a.mo19932a();
        }
        return c4451e.m19988i().f16716b + (c4451e.m19988i().f16718d / 2.0f) <= ((float) iMo19933b) && c4451e.m19988i() == c4451e.m19991l();
    }

    /* JADX INFO: renamed from: s */
    private static C4451e m20017s(List list, float f7, float[] fArr) {
        float[] fArrM20013o = m20013o(list, f7, fArr);
        return C4451e.m19978o((C4451e) list.get((int) fArrM20013o[1]), (C4451e) list.get((int) fArrM20013o[2]), fArrM20013o[0]);
    }

    /* JADX INFO: renamed from: t */
    private static C4451e m20018t(C4451e c4451e, int i7, int i8, float f7, int i9, int i10, int i11) {
        ArrayList arrayList = new ArrayList(c4451e.m19987h());
        arrayList.add(i8, (C4451e.c) arrayList.remove(i7));
        C4451e.b bVar = new C4451e.b(c4451e.m19986g(), i11);
        int i12 = 0;
        while (i12 < arrayList.size()) {
            C4451e.c cVar = (C4451e.c) arrayList.get(i12);
            float f8 = cVar.f16718d;
            bVar.m19999e(f7 + (f8 / 2.0f), cVar.f16717c, f8, i12 >= i9 && i12 <= i10, cVar.f16719e, cVar.f16720f);
            f7 += cVar.f16718d;
            i12++;
        }
        return bVar.m20003i();
    }

    /* JADX INFO: renamed from: u */
    private static C4451e m20019u(C4451e c4451e, float f7, int i7, boolean z7, float f8, AbstractC4449c.a aVar) {
        return a.f16730a[aVar.ordinal()] != 1 ? m20021w(c4451e, f7, i7, z7) : m20020v(c4451e, f7, i7, z7, f8);
    }

    /* JADX INFO: renamed from: v */
    private static C4451e m20020v(C4451e c4451e, float f7, int i7, boolean z7, float f8) {
        ArrayList arrayList = new ArrayList(c4451e.m19987h());
        C4451e.b bVar = new C4451e.b(c4451e.m19986g(), i7);
        float fM19992m = f7 / c4451e.m19992m();
        float f9 = z7 ? f7 : 0.0f;
        int i8 = 0;
        while (i8 < arrayList.size()) {
            C4451e.c cVar = (C4451e.c) arrayList.get(i8);
            if (cVar.f16719e) {
                bVar.m19999e(cVar.f16716b, cVar.f16717c, cVar.f16718d, false, true, cVar.f16720f);
            } else {
                boolean z8 = i8 >= c4451e.m19982c() && i8 <= c4451e.m19989j();
                float f10 = cVar.f16718d - fM19992m;
                float fM19960b = AbstractC4449c.m19960b(f10, c4451e.m19986g(), f8);
                float f11 = (f10 / 2.0f) + f9;
                float fAbs = Math.abs(f11 - cVar.f16716b);
                bVar.m20000f(f11, fM19960b, f10, z8, false, cVar.f16720f, z7 ? fAbs : 0.0f, z7 ? 0.0f : fAbs);
                f9 += f10;
            }
            i8++;
        }
        return bVar.m20003i();
    }

    /* JADX INFO: renamed from: w */
    private static C4451e m20021w(C4451e c4451e, float f7, int i7, boolean z7) {
        ArrayList arrayList = new ArrayList(c4451e.m19987h());
        C4451e.b bVar = new C4451e.b(c4451e.m19986g(), i7);
        boolean z8 = true;
        int size = z7 ? 0 : arrayList.size() - 1;
        int i8 = 0;
        while (i8 < arrayList.size()) {
            C4451e.c cVar = (C4451e.c) arrayList.get(i8);
            if (cVar.f16719e && i8 == size) {
                bVar.m19999e(cVar.f16716b, cVar.f16717c, cVar.f16718d, false, true, cVar.f16720f);
            } else {
                float f8 = cVar.f16716b;
                float f9 = z7 ? f8 + f7 : f8 - f7;
                float f10 = z7 ? f7 : 0.0f;
                float f11 = z7 ? 0.0f : f7;
                boolean z9 = (i8 < c4451e.m19982c() || i8 > c4451e.m19989j()) ? false : z8;
                float f12 = f9;
                float f13 = cVar.f16717c;
                float f14 = cVar.f16718d;
                bVar.m20000f(f12, f13, f14, z9, cVar.f16719e, Math.abs(z7 ? Math.max(0.0f, ((f14 / 2.0f) + f12) - i7) : Math.min(0.0f, f12 - (f14 / 2.0f))), f10, f11);
            }
            i8++;
            z8 = true;
        }
        return bVar.m20003i();
    }

    /* JADX INFO: renamed from: x */
    private static C4451e m20022x(C4451e c4451e, float f7, int i7) {
        return m20018t(c4451e, 0, 0, f7, c4451e.m19982c(), c4451e.m19989j(), i7);
    }

    /* JADX INFO: renamed from: g */
    C4451e m20023g() {
        return this.f16723a;
    }

    /* JADX INFO: renamed from: h */
    C4451e m20024h() {
        List list = this.f16725c;
        return (C4451e) list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: i */
    Map m20025i(int i7, int i8, int i9, boolean z7) {
        float fM19986g = this.f16723a.m19986g();
        HashMap map = new HashMap();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= i7) {
                break;
            }
            int i12 = z7 ? (i7 - i10) - 1 : i10;
            if (i12 * fM19986g * (z7 ? -1 : 1) > i9 - this.f16729g || i10 >= i7 - this.f16725c.size()) {
                Integer numValueOf = Integer.valueOf(i12);
                List list = this.f16725c;
                map.put(numValueOf, (C4451e) list.get(AbstractC0577a.m2541b(i11, 0, list.size() - 1)));
                i11++;
            }
            i10++;
        }
        int i13 = 0;
        for (int i14 = i7 - 1; i14 >= 0; i14--) {
            int i15 = z7 ? (i7 - i14) - 1 : i14;
            if (i15 * fM19986g * (z7 ? -1 : 1) < i8 + this.f16728f || i14 < this.f16724b.size()) {
                Integer numValueOf2 = Integer.valueOf(i15);
                List list2 = this.f16724b;
                map.put(numValueOf2, (C4451e) list2.get(AbstractC0577a.m2541b(i13, 0, list2.size() - 1)));
                i13++;
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: j */
    public C4451e m20026j(float f7, float f8, float f9) {
        return m20027k(f7, f8, f9, false);
    }

    /* JADX INFO: renamed from: k */
    C4451e m20027k(float f7, float f8, float f9, boolean z7) {
        float fM29844b;
        List list;
        float[] fArr;
        float f10 = this.f16728f + f8;
        float f11 = f9 - this.f16729g;
        float f12 = m20028l().m19981b().f16721g;
        float f13 = m20024h().m19981b().f16722h;
        if (this.f16728f == f12) {
            f10 += f12;
        }
        if (this.f16729g == f13) {
            f11 -= f13;
        }
        if (f7 < f10) {
            fM29844b = AbstractC6826a.m29844b(1.0f, 0.0f, f8, f10, f7);
            list = this.f16724b;
            fArr = this.f16726d;
        } else {
            if (f7 <= f11) {
                return this.f16723a;
            }
            fM29844b = AbstractC6826a.m29844b(0.0f, 1.0f, f11, f9, f7);
            list = this.f16725c;
            fArr = this.f16727e;
        }
        return z7 ? m20005a(list, fM29844b, fArr) : m20017s(list, fM29844b, fArr);
    }

    /* JADX INFO: renamed from: l */
    C4451e m20028l() {
        List list = this.f16724b;
        return (C4451e) list.get(list.size() - 1);
    }
}
