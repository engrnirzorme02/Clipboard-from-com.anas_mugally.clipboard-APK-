package p072I6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1625d;
import p152T5.AbstractC1631j;
import p152T5.AbstractC1638q;

/* JADX INFO: renamed from: I6.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0662s extends AbstractC1625d implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final a f2585d = new a(null);

    /* JADX INFO: renamed from: b */
    private final C0651h[] f2586b;

    /* JADX INFO: renamed from: c */
    private final int[] f2587c;

    /* JADX INFO: renamed from: I6.s$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final void m3161a(long j7, C0648e c0648e, int i7, List list, int i8, int i9, List list2) {
            int i10;
            int i11;
            int i12;
            long j8;
            int i13 = i7;
            if (i8 >= i9) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i14 = i8; i14 < i9; i14++) {
                if (((C0651h) list.get(i14)).m3090F() < i13) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            C0651h c0651h = (C0651h) list.get(i8);
            C0651h c0651h2 = (C0651h) list.get(i9 - 1);
            if (i13 == c0651h.m3090F()) {
                int iIntValue = ((Number) list2.get(i8)).intValue();
                int i15 = i8 + 1;
                C0651h c0651h3 = (C0651h) list.get(i15);
                i10 = i15;
                i11 = iIntValue;
                c0651h = c0651h3;
            } else {
                i10 = i8;
                i11 = -1;
            }
            if (c0651h.m3099k(i13) == c0651h2.m3099k(i13)) {
                int iMin = Math.min(c0651h.m3090F(), c0651h2.m3090F());
                int i16 = 0;
                for (int i17 = i13; i17 < iMin && c0651h.m3099k(i17) == c0651h2.m3099k(i17); i17++) {
                    i16++;
                }
                long jM3163c = j7 + m3163c(c0648e) + ((long) 2) + ((long) i16) + 1;
                c0648e.mo3008A(-i16);
                c0648e.mo3008A(i11);
                int i18 = i13 + i16;
                while (i13 < i18) {
                    c0648e.mo3008A(c0651h.m3099k(i13) & 255);
                    i13++;
                }
                if (i10 + 1 == i9) {
                    if (i18 != ((C0651h) list.get(i10)).m3090F()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    c0648e.mo3008A(((Number) list2.get(i10)).intValue());
                    return;
                } else {
                    C0648e c0648e2 = new C0648e();
                    c0648e.mo3008A(((int) (m3163c(c0648e2) + jM3163c)) * (-1));
                    m3161a(jM3163c, c0648e2, i18, list, i10, i9, list2);
                    c0648e.mo3029W(c0648e2);
                    return;
                }
            }
            int i19 = 1;
            for (int i20 = i10 + 1; i20 < i9; i20++) {
                if (((C0651h) list.get(i20 - 1)).m3099k(i13) != ((C0651h) list.get(i20)).m3099k(i13)) {
                    i19++;
                }
            }
            long jM3163c2 = j7 + m3163c(c0648e) + ((long) 2) + ((long) (i19 * 2));
            c0648e.mo3008A(i19);
            c0648e.mo3008A(i11);
            for (int i21 = i10; i21 < i9; i21++) {
                byte bM3099k = ((C0651h) list.get(i21)).m3099k(i13);
                if (i21 == i10 || bM3099k != ((C0651h) list.get(i21 - 1)).m3099k(i13)) {
                    c0648e.mo3008A(bM3099k & 255);
                }
            }
            C0648e c0648e3 = new C0648e();
            while (i10 < i9) {
                byte bM3099k2 = ((C0651h) list.get(i10)).m3099k(i13);
                int i22 = i10 + 1;
                int i23 = i22;
                while (true) {
                    if (i23 >= i9) {
                        i12 = i9;
                        break;
                    } else {
                        if (bM3099k2 != ((C0651h) list.get(i23)).m3099k(i13)) {
                            i12 = i23;
                            break;
                        }
                        i23++;
                    }
                }
                if (i22 == i12 && i13 + 1 == ((C0651h) list.get(i10)).m3090F()) {
                    c0648e.mo3008A(((Number) list2.get(i10)).intValue());
                    j8 = jM3163c2;
                } else {
                    c0648e.mo3008A(((int) (m3163c(c0648e3) + jM3163c2)) * (-1));
                    j8 = jM3163c2;
                    m3161a(j8, c0648e3, i13 + 1, list, i10, i12, list2);
                }
                jM3163c2 = j8;
                i10 = i12;
            }
            c0648e.mo3029W(c0648e3);
        }

        /* JADX INFO: renamed from: b */
        static /* synthetic */ void m3162b(a aVar, long j7, C0648e c0648e, int i7, List list, int i8, int i9, List list2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j7 = 0;
            }
            aVar.m3161a(j7, c0648e, (i10 & 4) != 0 ? 0 : i7, list, (i10 & 16) != 0 ? 0 : i8, (i10 & 32) != 0 ? list.size() : i9, list2);
        }

        /* JADX INFO: renamed from: c */
        private final long m3163c(C0648e c0648e) {
            return c0648e.m3046h1() / ((long) 4);
        }

        /* JADX INFO: renamed from: d */
        public final C0662s m3164d(C0651h... byteStrings) {
            AbstractC6118n.m27187e(byteStrings, "byteStrings");
            AbstractC6112h abstractC6112h = null;
            int i7 = 0;
            if (byteStrings.length == 0) {
                return new C0662s(new C0651h[0], new int[]{0, -1}, abstractC6112h);
            }
            List listL0 = AbstractC1631j.m6741l0(byteStrings);
            AbstractC1638q.m6775t(listL0);
            ArrayList arrayList = new ArrayList(byteStrings.length);
            for (C0651h c0651h : byteStrings) {
                arrayList.add(-1);
            }
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            List listN = AbstractC1638q.m6769n(Arrays.copyOf(numArr, numArr.length));
            int length = byteStrings.length;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length) {
                listN.set(AbstractC1638q.m6764i(listL0, byteStrings[i8], 0, 0, 6, null), Integer.valueOf(i9));
                i8++;
                i9++;
            }
            if (((C0651h) listL0.get(0)).m3090F() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i10 = 0;
            while (i10 < listL0.size()) {
                C0651h c0651h2 = (C0651h) listL0.get(i10);
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < listL0.size()) {
                    C0651h c0651h3 = (C0651h) listL0.get(i12);
                    if (!c0651h3.m3091I(c0651h2)) {
                        break;
                    }
                    if (c0651h3.m3090F() == c0651h2.m3090F()) {
                        throw new IllegalArgumentException(("duplicate option: " + c0651h3).toString());
                    }
                    if (((Number) listN.get(i12)).intValue() > ((Number) listN.get(i10)).intValue()) {
                        listL0.remove(i12);
                        listN.remove(i12);
                    } else {
                        i12++;
                    }
                }
                i10 = i11;
            }
            C0648e c0648e = new C0648e();
            m3162b(this, 0L, c0648e, 0, listL0, 0, 0, listN, 53, null);
            int[] iArr = new int[(int) m3163c(c0648e)];
            while (!c0648e.mo3009E()) {
                iArr[i7] = c0648e.readInt();
                i7++;
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            AbstractC6118n.m27186d(objArrCopyOf, "copyOf(this, size)");
            return new C0662s((C0651h[]) objArrCopyOf, iArr, abstractC6112h);
        }

        private a() {
        }
    }

    public /* synthetic */ C0662s(C0651h[] c0651hArr, int[] iArr, AbstractC6112h abstractC6112h) {
        this(c0651hArr, iArr);
    }

    @Override // p152T5.AbstractC1623b
    /* JADX INFO: renamed from: b */
    public int mo3154b() {
        return this.f2586b.length;
    }

    @Override // p152T5.AbstractC1623b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0651h) {
            return m3155g((C0651h) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public /* bridge */ boolean m3155g(C0651h c0651h) {
        return super.contains(c0651h);
    }

    @Override // p152T5.AbstractC1625d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0651h) {
            return m3159p((C0651h) obj);
        }
        return -1;
    }

    @Override // p152T5.AbstractC1625d, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C0651h get(int i7) {
        return this.f2586b[i7];
    }

    @Override // p152T5.AbstractC1625d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0651h) {
            return m3160q((C0651h) obj);
        }
        return -1;
    }

    /* JADX INFO: renamed from: m */
    public final C0651h[] m3157m() {
        return this.f2586b;
    }

    /* JADX INFO: renamed from: n */
    public final int[] m3158n() {
        return this.f2587c;
    }

    /* JADX INFO: renamed from: p */
    public /* bridge */ int m3159p(C0651h c0651h) {
        return super.indexOf(c0651h);
    }

    /* JADX INFO: renamed from: q */
    public /* bridge */ int m3160q(C0651h c0651h) {
        return super.lastIndexOf(c0651h);
    }

    private C0662s(C0651h[] c0651hArr, int[] iArr) {
        this.f2586b = c0651hArr;
        this.f2587c = iArr;
    }
}
