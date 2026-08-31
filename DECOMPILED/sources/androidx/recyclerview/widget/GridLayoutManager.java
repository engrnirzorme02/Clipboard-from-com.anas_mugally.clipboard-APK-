package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import p118P.C1170s;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: I */
    boolean f10713I;

    /* JADX INFO: renamed from: J */
    int f10714J;

    /* JADX INFO: renamed from: K */
    int[] f10715K;

    /* JADX INFO: renamed from: L */
    View[] f10716L;

    /* JADX INFO: renamed from: M */
    final SparseIntArray f10717M;

    /* JADX INFO: renamed from: N */
    final SparseIntArray f10718N;

    /* JADX INFO: renamed from: O */
    AbstractC2740c f10719O;

    /* JADX INFO: renamed from: P */
    final Rect f10720P;

    /* JADX INFO: renamed from: Q */
    private boolean f10721Q;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C2738a extends AbstractC2740c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC2740c
        /* JADX INFO: renamed from: e */
        public int mo12997e(int i7, int i8) {
            return i7 % i8;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC2740c
        /* JADX INFO: renamed from: f */
        public int mo12998f(int i7) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class AbstractC2740c {

        /* JADX INFO: renamed from: a */
        final SparseIntArray f10724a = new SparseIntArray();

        /* JADX INFO: renamed from: b */
        final SparseIntArray f10725b = new SparseIntArray();

        /* JADX INFO: renamed from: c */
        private boolean f10726c = false;

        /* JADX INFO: renamed from: d */
        private boolean f10727d = false;

        /* JADX INFO: renamed from: a */
        static int m13001a(SparseIntArray sparseIntArray, int i7) {
            int size = sparseIntArray.size() - 1;
            int i8 = 0;
            while (i8 <= size) {
                int i9 = (i8 + size) >>> 1;
                if (sparseIntArray.keyAt(i9) < i7) {
                    i8 = i9 + 1;
                } else {
                    size = i9 - 1;
                }
            }
            int i10 = i8 - 1;
            if (i10 < 0 || i10 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i10);
        }

        /* JADX INFO: renamed from: b */
        int m13002b(int i7, int i8) {
            if (!this.f10727d) {
                return m13004d(i7, i8);
            }
            int i9 = this.f10725b.get(i7, -1);
            if (i9 != -1) {
                return i9;
            }
            int iM13004d = m13004d(i7, i8);
            this.f10725b.put(i7, iM13004d);
            return iM13004d;
        }

        /* JADX INFO: renamed from: c */
        int m13003c(int i7, int i8) {
            if (!this.f10726c) {
                return mo12997e(i7, i8);
            }
            int i9 = this.f10724a.get(i7, -1);
            if (i9 != -1) {
                return i9;
            }
            int iMo12997e = mo12997e(i7, i8);
            this.f10724a.put(i7, iMo12997e);
            return iMo12997e;
        }

        /* JADX INFO: renamed from: d */
        public int m13004d(int i7, int i8) {
            int i9;
            int i10;
            int iM13003c;
            int iM13001a;
            if (!this.f10727d || (iM13001a = m13001a(this.f10725b, i7)) == -1) {
                i9 = 0;
                i10 = 0;
                iM13003c = 0;
            } else {
                i9 = this.f10725b.get(iM13001a);
                i10 = iM13001a + 1;
                iM13003c = m13003c(iM13001a, i8) + mo12998f(iM13001a);
                if (iM13003c == i8) {
                    i9++;
                    iM13003c = 0;
                }
            }
            int iMo12998f = mo12998f(i7);
            while (i10 < i7) {
                int iMo12998f2 = mo12998f(i10);
                iM13003c += iMo12998f2;
                if (iM13003c == i8) {
                    i9++;
                    iM13003c = 0;
                } else if (iM13003c > i8) {
                    i9++;
                    iM13003c = iMo12998f2;
                }
                i10++;
            }
            return iM13003c + iMo12998f > i8 ? i9 + 1 : i9;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0024  */
        /* JADX WARN: Code duplicated, block: B:14:0x002b  */
        /* JADX WARN: Code duplicated, block: B:15:0x002d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:16:0x002f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX INFO: renamed from: e */
        public int mo12997e(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.mo12998f(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.f10726c
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.f10724a
                int r2 = m13001a(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.f10724a
                int r3 = r3.get(r2)
                int r4 = r5.mo12998f(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = r1
                r3 = r2
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.mo12998f(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = r1
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.AbstractC2740c.mo12997e(int, int):int");
        }

        /* JADX INFO: renamed from: f */
        public abstract int mo12998f(int i7);

        /* JADX INFO: renamed from: g */
        public void m13005g() {
            this.f10725b.clear();
        }

        /* JADX INFO: renamed from: h */
        public void m13006h() {
            this.f10724a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f10713I = false;
        this.f10714J = -1;
        this.f10717M = new SparseIntArray();
        this.f10718N = new SparseIntArray();
        this.f10719O = new C2738a();
        this.f10720P = new Rect();
        m12988g3(RecyclerView.AbstractC2765p.m13376n0(context, attributeSet, i7, i8).f10958b);
    }

    /* JADX INFO: renamed from: P2 */
    private void m12949P2(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b, int i7, boolean z7) {
        int i8;
        int i9;
        int i10;
        int i11 = 0;
        if (z7) {
            i10 = 1;
            i9 = i7;
            i8 = 0;
        } else {
            i8 = i7 - 1;
            i9 = -1;
            i10 = -1;
        }
        while (i8 != i9) {
            View view = this.f10716L[i8];
            C2739b c2739b = (C2739b) view.getLayoutParams();
            int iM12960c3 = m12960c3(c2772w, c2746b, m13445m0(view));
            c2739b.f10723f = iM12960c3;
            c2739b.f10722e = i11;
            i11 += iM12960c3;
            i8 += i10;
        }
    }

    /* JADX INFO: renamed from: Q2 */
    private void m12950Q2() {
        int iM13407P = m13407P();
        for (int i7 = 0; i7 < iM13407P; i7++) {
            C2739b c2739b = (C2739b) m13405O(i7).getLayoutParams();
            int iM13478a = c2739b.m13478a();
            this.f10717M.put(iM13478a, c2739b.m13000f());
            this.f10718N.put(iM13478a, c2739b.m12999e());
        }
    }

    /* JADX INFO: renamed from: R2 */
    private void m12951R2(int i7) {
        this.f10715K = m12952S2(this.f10715K, this.f10714J, i7);
    }

    /* JADX INFO: renamed from: S2 */
    static int[] m12952S2(int[] iArr, int i7, int i8) {
        int i9;
        if (iArr == null || iArr.length != i7 + 1 || iArr[iArr.length - 1] != i8) {
            iArr = new int[i7 + 1];
        }
        int i10 = 0;
        iArr[0] = 0;
        int i11 = i8 / i7;
        int i12 = i8 % i7;
        int i13 = 0;
        for (int i14 = 1; i14 <= i7; i14++) {
            i10 += i12;
            if (i10 <= 0 || i7 - i10 >= i12) {
                i9 = i11;
            } else {
                i9 = i11 + 1;
                i10 -= i7;
            }
            i13 += i9;
            iArr[i14] = i13;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: T2 */
    private void m12953T2() {
        this.f10717M.clear();
        this.f10718N.clear();
    }

    /* JADX INFO: renamed from: U2 */
    private int m12954U2(RecyclerView.C2746B c2746b) {
        if (m13407P() != 0 && c2746b.m13239b() != 0) {
            m13046Y1();
            boolean zM13064s2 = m13064s2();
            View viewM13050c2 = m13050c2(!zM13064s2, true);
            View viewM13048b2 = m13048b2(!zM13064s2, true);
            if (viewM13050c2 != null && viewM13048b2 != null) {
                int iM13002b = this.f10719O.m13002b(m13445m0(viewM13050c2), this.f10714J);
                int iM13002b2 = this.f10719O.m13002b(m13445m0(viewM13048b2), this.f10714J);
                int iMax = this.f10741x ? Math.max(0, ((this.f10719O.m13002b(c2746b.m13239b() - 1, this.f10714J) + 1) - Math.max(iM13002b, iM13002b2)) - 1) : Math.max(0, Math.min(iM13002b, iM13002b2));
                if (zM13064s2) {
                    return Math.round((iMax * (Math.abs(this.f10738u.mo13844d(viewM13048b2) - this.f10738u.mo13847g(viewM13050c2)) / ((this.f10719O.m13002b(m13445m0(viewM13048b2), this.f10714J) - this.f10719O.m13002b(m13445m0(viewM13050c2), this.f10714J)) + 1))) + (this.f10738u.mo13853m() - this.f10738u.mo13847g(viewM13050c2)));
                }
                return iMax;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: V2 */
    private int m12955V2(RecyclerView.C2746B c2746b) {
        if (m13407P() != 0 && c2746b.m13239b() != 0) {
            m13046Y1();
            View viewM13050c2 = m13050c2(!m13064s2(), true);
            View viewM13048b2 = m13048b2(!m13064s2(), true);
            if (viewM13050c2 != null && viewM13048b2 != null) {
                if (!m13064s2()) {
                    return this.f10719O.m13002b(c2746b.m13239b() - 1, this.f10714J) + 1;
                }
                return (int) (((this.f10738u.mo13844d(viewM13048b2) - this.f10738u.mo13847g(viewM13050c2)) / ((this.f10719O.m13002b(m13445m0(viewM13048b2), this.f10714J) - this.f10719O.m13002b(m13445m0(viewM13050c2), this.f10714J)) + 1)) * (this.f10719O.m13002b(c2746b.m13239b() - 1, this.f10714J) + 1));
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: W2 */
    private void m12956W2(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b, LinearLayoutManager.C2741a c2741a, int i7) {
        boolean z7 = i7 == 1;
        int iM12959b3 = m12959b3(c2772w, c2746b, c2741a.f10745b);
        if (z7) {
            while (iM12959b3 > 0) {
                int i8 = c2741a.f10745b;
                if (i8 <= 0) {
                    return;
                }
                int i9 = i8 - 1;
                c2741a.f10745b = i9;
                iM12959b3 = m12959b3(c2772w, c2746b, i9);
            }
            return;
        }
        int iM13239b = c2746b.m13239b() - 1;
        int i10 = c2741a.f10745b;
        while (i10 < iM13239b) {
            int i11 = i10 + 1;
            int iM12959b4 = m12959b3(c2772w, c2746b, i11);
            if (iM12959b4 <= iM12959b3) {
                break;
            }
            i10 = i11;
            iM12959b3 = iM12959b4;
        }
        c2741a.f10745b = i10;
    }

    /* JADX INFO: renamed from: X2 */
    private void m12957X2() {
        View[] viewArr = this.f10716L;
        if (viewArr == null || viewArr.length != this.f10714J) {
            this.f10716L = new View[this.f10714J];
        }
    }

    /* JADX INFO: renamed from: a3 */
    private int m12958a3(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b, int i7) {
        if (!c2746b.m13242e()) {
            return this.f10719O.m13002b(i7, this.f10714J);
        }
        int iM13522f = c2772w.m13522f(i7);
        if (iM13522f != -1) {
            return this.f10719O.m13002b(iM13522f, this.f10714J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i7);
        return 0;
    }

    /* JADX INFO: renamed from: b3 */
    private int m12959b3(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b, int i7) {
        if (!c2746b.m13242e()) {
            return this.f10719O.m13003c(i7, this.f10714J);
        }
        int i8 = this.f10718N.get(i7, -1);
        if (i8 != -1) {
            return i8;
        }
        int iM13522f = c2772w.m13522f(i7);
        if (iM13522f != -1) {
            return this.f10719O.m13003c(iM13522f, this.f10714J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i7);
        return 0;
    }

    /* JADX INFO: renamed from: c3 */
    private int m12960c3(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b, int i7) {
        if (!c2746b.m13242e()) {
            return this.f10719O.mo12998f(i7);
        }
        int i8 = this.f10717M.get(i7, -1);
        if (i8 != -1) {
            return i8;
        }
        int iM13522f = c2772w.m13522f(i7);
        if (iM13522f != -1) {
            return this.f10719O.mo12998f(iM13522f);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i7);
        return 1;
    }

    /* JADX INFO: renamed from: d3 */
    private void m12961d3(float f7, int i7) {
        m12951R2(Math.max(Math.round(f7 * this.f10714J), i7));
    }

    /* JADX INFO: renamed from: e3 */
    private void m12962e3(View view, int i7, boolean z7) {
        int iM13373Q;
        int iM13373Q2;
        C2739b c2739b = (C2739b) view.getLayoutParams();
        Rect rect = c2739b.f10962b;
        int i8 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c2739b).topMargin + ((ViewGroup.MarginLayoutParams) c2739b).bottomMargin;
        int i9 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c2739b).leftMargin + ((ViewGroup.MarginLayoutParams) c2739b).rightMargin;
        int iM12982Y2 = m12982Y2(c2739b.f10722e, c2739b.f10723f);
        if (this.f10736s == 1) {
            iM13373Q2 = RecyclerView.AbstractC2765p.m13373Q(iM12982Y2, i7, i9, ((ViewGroup.MarginLayoutParams) c2739b).width, false);
            iM13373Q = RecyclerView.AbstractC2765p.m13373Q(this.f10738u.mo13854n(), m13425d0(), i8, ((ViewGroup.MarginLayoutParams) c2739b).height, true);
        } else {
            int iM13373Q3 = RecyclerView.AbstractC2765p.m13373Q(iM12982Y2, i7, i8, ((ViewGroup.MarginLayoutParams) c2739b).height, false);
            int iM13373Q4 = RecyclerView.AbstractC2765p.m13373Q(this.f10738u.mo13854n(), m13462u0(), i9, ((ViewGroup.MarginLayoutParams) c2739b).width, true);
            iM13373Q = iM13373Q3;
            iM13373Q2 = iM13373Q4;
        }
        m12963f3(view, iM13373Q2, iM13373Q, z7);
    }

    /* JADX INFO: renamed from: f3 */
    private void m12963f3(View view, int i7, int i8, boolean z7) {
        RecyclerView.C2766q c2766q = (RecyclerView.C2766q) view.getLayoutParams();
        if (z7 ? m13403M1(view, i7, i8, c2766q) : m13399K1(view, i7, i8, c2766q)) {
            view.measure(i7, i8);
        }
    }

    /* JADX INFO: renamed from: i3 */
    private void m12964i3() {
        int iM13424c0;
        int iM13443l0;
        if (m13061q2() == 1) {
            iM13424c0 = m13460t0() - m13441k0();
            iM13443l0 = m13438j0();
        } else {
            iM13424c0 = m13424c0() - m13436i0();
            iM13443l0 = m13443l0();
        }
        m12951R2(iM13424c0 - iM13443l0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: A */
    public int mo12965A(RecyclerView.C2746B c2746b) {
        return this.f10721Q ? m12954U2(c2746b) : super.mo12965A(c2746b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: B */
    public int mo12966B(RecyclerView.C2746B c2746b) {
        return this.f10721Q ? m12955V2(c2746b) : super.mo12966B(c2746b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: B1 */
    public int mo12967B1(int i7, RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b) {
        m12964i3();
        m12957X2();
        return super.mo12967B1(i7, c2772w, c2746b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: D1 */
    public int mo12968D1(int i7, RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b) {
        m12964i3();
        m12957X2();
        return super.mo12968D1(i7, c2772w, c2746b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: G2 */
    public void mo12969G2(boolean z7) {
        if (z7) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo12969G2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: H1 */
    public void mo12970H1(Rect rect, int i7, int i8) {
        int iM13377t;
        int iM13377t2;
        if (this.f10715K == null) {
            super.mo12970H1(rect, i7, i8);
        }
        int iM13438j0 = m13438j0() + m13441k0();
        int iM13443l0 = m13443l0() + m13436i0();
        if (this.f10736s == 1) {
            iM13377t2 = RecyclerView.AbstractC2765p.m13377t(i8, rect.height() + iM13443l0, m13431g0());
            int[] iArr = this.f10715K;
            iM13377t = RecyclerView.AbstractC2765p.m13377t(i7, iArr[iArr.length - 1] + iM13438j0, m13434h0());
        } else {
            iM13377t = RecyclerView.AbstractC2765p.m13377t(i7, rect.width() + iM13438j0, m13434h0());
            int[] iArr2 = this.f10715K;
            iM13377t2 = RecyclerView.AbstractC2765p.m13377t(i8, iArr2[iArr2.length - 1] + iM13443l0, m13431g0());
        }
        m13391G1(iM13377t, iM13377t2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: J */
    public RecyclerView.C2766q mo12971J() {
        return this.f10736s == 0 ? new C2739b(-2, -1) : new C2739b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: K */
    public RecyclerView.C2766q mo12972K(Context context, AttributeSet attributeSet) {
        return new C2739b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: L */
    public RecyclerView.C2766q mo12973L(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2739b((ViewGroup.MarginLayoutParams) layoutParams) : new C2739b(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View mo12974O0(View view, int i7, RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b) {
        int iM13407P;
        int i8;
        int iM13407P2;
        View view2;
        View view3;
        View view4;
        int i9;
        int i10;
        int i11;
        RecyclerView.C2772w c2772w2 = c2772w;
        RecyclerView.C2746B c2746b2 = c2746b;
        View viewM13392H = m13392H(view);
        View view5 = null;
        if (viewM13392H == null) {
            return null;
        }
        C2739b c2739b = (C2739b) viewM13392H.getLayoutParams();
        int i12 = c2739b.f10722e;
        int i13 = c2739b.f10723f + i12;
        if (super.mo12974O0(view, i7, c2772w, c2746b) == null) {
            return null;
        }
        if ((m13044W1(i7) == 1) != this.f10741x) {
            iM13407P2 = m13407P() - 1;
            iM13407P = -1;
            i8 = -1;
        } else {
            iM13407P = m13407P();
            i8 = 1;
            iM13407P2 = 0;
        }
        boolean z7 = this.f10736s == 1 && m13063r2();
        int iM12958a3 = m12958a3(c2772w2, c2746b2, iM13407P2);
        int i14 = -1;
        int i15 = -1;
        int iMin = 0;
        int iMin2 = 0;
        int i16 = iM13407P2;
        View view6 = null;
        while (i16 != iM13407P) {
            int iM12958a4 = m12958a3(c2772w2, c2746b2, i16);
            View viewM13405O = m13405O(i16);
            if (viewM13405O == viewM13392H) {
                break;
            }
            if (!viewM13405O.hasFocusable() || iM12958a4 == iM12958a3) {
                C2739b c2739b2 = (C2739b) viewM13405O.getLayoutParams();
                int i17 = c2739b2.f10722e;
                view2 = viewM13392H;
                int i18 = c2739b2.f10723f + i17;
                if (viewM13405O.hasFocusable() && i17 == i12 && i18 == i13) {
                    return viewM13405O;
                }
                if (!(viewM13405O.hasFocusable() && view5 == null) && (viewM13405O.hasFocusable() || view6 != null)) {
                    view3 = view5;
                    int iMin3 = Math.min(i18, i13) - Math.max(i17, i12);
                    if (!viewM13405O.hasFocusable()) {
                        if (view3 == null) {
                            view4 = view6;
                            i9 = iMin;
                            if (m13383D0(viewM13405O, false, true)) {
                                i10 = iMin2;
                                if (iMin3 > i10) {
                                    i11 = i15;
                                } else if (iMin3 == i10) {
                                    i11 = i15;
                                    if (z7 == (i17 > i11)) {
                                    }
                                    iMin = i9;
                                    view5 = view3;
                                    i16 += i8;
                                    c2772w2 = c2772w;
                                    c2746b2 = c2746b;
                                    viewM13392H = view2;
                                } else {
                                    i11 = i15;
                                }
                                if (viewM13405O.hasFocusable()) {
                                    i15 = i11;
                                    iMin2 = i10;
                                    i14 = c2739b2.f10722e;
                                    view6 = view4;
                                    view5 = viewM13405O;
                                    iMin = Math.min(i18, i13) - Math.max(i17, i12);
                                } else {
                                    int i19 = c2739b2.f10722e;
                                    iMin2 = Math.min(i18, i13) - Math.max(i17, i12);
                                    view6 = viewM13405O;
                                    i15 = i19;
                                    iMin = i9;
                                    view5 = view3;
                                }
                                i16 += i8;
                                c2772w2 = c2772w;
                                c2746b2 = c2746b;
                                viewM13392H = view2;
                            }
                            i15 = i11;
                            iMin2 = i10;
                            view6 = view4;
                            iMin = i9;
                            view5 = view3;
                            i16 += i8;
                            c2772w2 = c2772w;
                            c2746b2 = c2746b;
                            viewM13392H = view2;
                        }
                        i11 = i15;
                        i10 = iMin2;
                        i15 = i11;
                        iMin2 = i10;
                        view6 = view4;
                        iMin = i9;
                        view5 = view3;
                        i16 += i8;
                        c2772w2 = c2772w;
                        c2746b2 = c2746b;
                        viewM13392H = view2;
                    } else if (iMin3 <= iMin) {
                        if (iMin3 == iMin) {
                        }
                    }
                } else {
                    view3 = view5;
                }
                view4 = view6;
                i9 = iMin;
                i11 = i15;
                i10 = iMin2;
                if (viewM13405O.hasFocusable()) {
                    i15 = i11;
                    iMin2 = i10;
                    i14 = c2739b2.f10722e;
                    view6 = view4;
                    view5 = viewM13405O;
                    iMin = Math.min(i18, i13) - Math.max(i17, i12);
                } else {
                    int i110 = c2739b2.f10722e;
                    iMin2 = Math.min(i18, i13) - Math.max(i17, i12);
                    view6 = viewM13405O;
                    i15 = i110;
                    iMin = i9;
                    view5 = view3;
                }
                i16 += i8;
                c2772w2 = c2772w;
                c2746b2 = c2746b;
                viewM13392H = view2;
            } else {
                if (view5 != null) {
                    break;
                }
                view2 = viewM13392H;
                view3 = view5;
            }
            view4 = view6;
            i9 = iMin;
            i11 = i15;
            i10 = iMin2;
            i15 = i11;
            iMin2 = i10;
            view6 = view4;
            iMin = i9;
            view5 = view3;
            i16 += i8;
            c2772w2 = c2772w;
            c2746b2 = c2746b;
            viewM13392H = view2;
        }
        View view7 = view5;
        return view7 != null ? view7 : view6;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: Q1 */
    public boolean mo12975Q1() {
        return this.f10731D == null && !this.f10713I;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: S1 */
    void mo12976S1(RecyclerView.C2746B c2746b, LinearLayoutManager.C2743c c2743c, RecyclerView.AbstractC2765p.c cVar) {
        int iMo12998f = this.f10714J;
        for (int i7 = 0; i7 < this.f10714J && c2743c.m13079c(c2746b) && iMo12998f > 0; i7++) {
            int i8 = c2743c.f10756d;
            cVar.mo13477a(i8, Math.max(0, c2743c.f10759g));
            iMo12998f -= this.f10719O.mo12998f(i8);
            c2743c.f10756d += c2743c.f10757e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: T */
    public int mo12977T(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b) {
        if (this.f10736s == 1) {
            return this.f10714J;
        }
        if (c2746b.m13239b() < 1) {
            return 0;
        }
        return m12958a3(c2772w, c2746b, c2746b.m13239b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: U0 */
    public void mo12978U0(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b, View view, C1170s c1170s) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C2739b)) {
            super.m13413T0(view, c1170s);
            return;
        }
        C2739b c2739b = (C2739b) layoutParams;
        int iM12958a3 = m12958a3(c2772w, c2746b, c2739b.m13478a());
        if (this.f10736s == 0) {
            c1170s.m5074p0(C1170s.g.m5112a(c2739b.m12999e(), c2739b.m13000f(), iM12958a3, 1, false, false));
        } else {
            c1170s.m5074p0(C1170s.g.m5112a(iM12958a3, 1, c2739b.m12999e(), c2739b.m13000f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: W0 */
    public void mo12979W0(RecyclerView recyclerView, int i7, int i8) {
        this.f10719O.m13006h();
        this.f10719O.m13005g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: X0 */
    public void mo12980X0(RecyclerView recyclerView) {
        this.f10719O.m13006h();
        this.f10719O.m13005g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: Y0 */
    public void mo12981Y0(RecyclerView recyclerView, int i7, int i8, int i9) {
        this.f10719O.m13006h();
        this.f10719O.m13005g();
    }

    /* JADX INFO: renamed from: Y2 */
    int m12982Y2(int i7, int i8) {
        if (this.f10736s != 1 || !m13063r2()) {
            int[] iArr = this.f10715K;
            return iArr[i8 + i7] - iArr[i7];
        }
        int[] iArr2 = this.f10715K;
        int i9 = this.f10714J;
        return iArr2[i9 - i7] - iArr2[(i9 - i7) - i8];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: Z0 */
    public void mo12983Z0(RecyclerView recyclerView, int i7, int i8) {
        this.f10719O.m13006h();
        this.f10719O.m13005g();
    }

    /* JADX INFO: renamed from: Z2 */
    public int m12984Z2() {
        return this.f10714J;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: b1 */
    public void mo12985b1(RecyclerView recyclerView, int i7, int i8, Object obj) {
        this.f10719O.m13006h();
        this.f10719O.m13005g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: c1 */
    public void mo12986c1(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b) {
        if (c2746b.m13242e()) {
            m12950Q2();
        }
        super.mo12986c1(c2772w, c2746b);
        m12953T2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: d1 */
    public void mo12987d1(RecyclerView.C2746B c2746b) {
        super.mo12987d1(c2746b);
        this.f10713I = false;
    }

    /* JADX INFO: renamed from: g3 */
    public void m12988g3(int i7) {
        if (i7 == this.f10714J) {
            return;
        }
        this.f10713I = true;
        if (i7 >= 1) {
            this.f10714J = i7;
            this.f10719O.m13006h();
            m13469y1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i7);
        }
    }

    /* JADX INFO: renamed from: h3 */
    public void m12989h3(AbstractC2740c abstractC2740c) {
        this.f10719O = abstractC2740c;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: k2 */
    View mo12990k2(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b, boolean z7, boolean z8) {
        int i7;
        int iM13407P;
        int iM13407P2 = m13407P();
        int i8 = 1;
        if (z8) {
            iM13407P = m13407P() - 1;
            i7 = -1;
            i8 = -1;
        } else {
            i7 = iM13407P2;
            iM13407P = 0;
        }
        int iM13239b = c2746b.m13239b();
        m13046Y1();
        int iMo13853m = this.f10738u.mo13853m();
        int iMo13849i = this.f10738u.mo13849i();
        View view = null;
        View view2 = null;
        while (iM13407P != i7) {
            View viewM13405O = m13405O(iM13407P);
            int iM13445m0 = m13445m0(viewM13405O);
            if (iM13445m0 >= 0 && iM13445m0 < iM13239b && m12959b3(c2772w, c2746b, iM13445m0) == 0) {
                if (((RecyclerView.C2766q) viewM13405O.getLayoutParams()).m13480c()) {
                    if (view2 == null) {
                        view2 = viewM13405O;
                    }
                } else {
                    if (this.f10738u.mo13847g(viewM13405O) < iMo13849i && this.f10738u.mo13844d(viewM13405O) >= iMo13853m) {
                        return viewM13405O;
                    }
                    if (view == null) {
                        view = viewM13405O;
                    }
                }
            }
            iM13407P += i8;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: p0 */
    public int mo12991p0(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b) {
        if (this.f10736s == 0) {
            return this.f10714J;
        }
        if (c2746b.m13239b() < 1) {
            return 0;
        }
        return m12958a3(c2772w, c2746b, c2746b.m13239b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: s */
    public boolean mo12992s(RecyclerView.C2766q c2766q) {
        return c2766q instanceof C2739b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: t2 */
    void mo12993t2(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b, LinearLayoutManager.C2743c c2743c, LinearLayoutManager.C2742b c2742b) {
        int i7;
        int i8;
        int iM13438j0;
        int iM13443l0;
        int iMo13846f;
        int iMo13846f2;
        int i9;
        int iM13373Q;
        int iM13373Q2;
        View viewM13080d;
        int iMo13852l = this.f10738u.mo13852l();
        boolean z7 = iMo13852l != 1073741824;
        int i10 = m13407P() > 0 ? this.f10715K[this.f10714J] : 0;
        if (z7) {
            m12964i3();
        }
        boolean z8 = c2743c.f10757e == 1;
        int iM12959b3 = this.f10714J;
        if (!z8) {
            iM12959b3 = m12959b3(c2772w, c2746b, c2743c.f10756d) + m12960c3(c2772w, c2746b, c2743c.f10756d);
        }
        int i11 = 0;
        while (i11 < this.f10714J && c2743c.m13079c(c2746b) && iM12959b3 > 0) {
            int i12 = c2743c.f10756d;
            int iM12960c3 = m12960c3(c2772w, c2746b, i12);
            if (iM12960c3 > this.f10714J) {
                throw new IllegalArgumentException("Item at position " + i12 + " requires " + iM12960c3 + " spans but GridLayoutManager has only " + this.f10714J + " spans.");
            }
            iM12959b3 -= iM12960c3;
            if (iM12959b3 < 0 || (viewM13080d = c2743c.m13080d(c2772w)) == null) {
                break;
            }
            this.f10716L[i11] = viewM13080d;
            i11++;
        }
        if (i11 == 0) {
            c2742b.f10750b = true;
            return;
        }
        m12949P2(c2772w, c2746b, i11, z8);
        float f7 = 0.0f;
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            View view = this.f10716L[i14];
            if (c2743c.f10764l == null) {
                if (z8) {
                    m13437j(view);
                } else {
                    m13440k(view, 0);
                }
            } else if (z8) {
                m13433h(view);
            } else {
                m13435i(view, 0);
            }
            m13452p(view, this.f10720P);
            m12962e3(view, iMo13852l, false);
            int iMo13845e = this.f10738u.mo13845e(view);
            if (iMo13845e > i13) {
                i13 = iMo13845e;
            }
            float fMo13846f = (this.f10738u.mo13846f(view) * 1.0f) / ((C2739b) view.getLayoutParams()).f10723f;
            if (fMo13846f > f7) {
                f7 = fMo13846f;
            }
        }
        if (z7) {
            m12961d3(f7, i10);
            i13 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                View view2 = this.f10716L[i15];
                m12962e3(view2, 1073741824, true);
                int iMo13845e2 = this.f10738u.mo13845e(view2);
                if (iMo13845e2 > i13) {
                    i13 = iMo13845e2;
                }
            }
        }
        for (int i16 = 0; i16 < i11; i16++) {
            View view3 = this.f10716L[i16];
            if (this.f10738u.mo13845e(view3) != i13) {
                C2739b c2739b = (C2739b) view3.getLayoutParams();
                Rect rect = c2739b.f10962b;
                int i17 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c2739b).topMargin + ((ViewGroup.MarginLayoutParams) c2739b).bottomMargin;
                int i18 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c2739b).leftMargin + ((ViewGroup.MarginLayoutParams) c2739b).rightMargin;
                int iM12982Y2 = m12982Y2(c2739b.f10722e, c2739b.f10723f);
                if (this.f10736s == 1) {
                    iM13373Q2 = RecyclerView.AbstractC2765p.m13373Q(iM12982Y2, 1073741824, i18, ((ViewGroup.MarginLayoutParams) c2739b).width, false);
                    iM13373Q = View.MeasureSpec.makeMeasureSpec(i13 - i17, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13 - i18, 1073741824);
                    iM13373Q = RecyclerView.AbstractC2765p.m13373Q(iM12982Y2, 1073741824, i17, ((ViewGroup.MarginLayoutParams) c2739b).height, false);
                    iM13373Q2 = iMakeMeasureSpec;
                }
                m12963f3(view3, iM13373Q2, iM13373Q, true);
            }
        }
        c2742b.f10749a = i13;
        if (this.f10736s == 1) {
            if (c2743c.f10758f == -1) {
                iMo13846f2 = c2743c.f10754b;
                i9 = iMo13846f2 - i13;
            } else {
                i9 = c2743c.f10754b;
                iMo13846f2 = i9 + i13;
            }
            iM13443l0 = i9;
            iMo13846f = 0;
            iM13438j0 = 0;
        } else {
            if (c2743c.f10758f == -1) {
                i8 = c2743c.f10754b;
                i7 = i8 - i13;
            } else {
                i7 = c2743c.f10754b;
                i8 = i7 + i13;
            }
            iM13438j0 = i7;
            iM13443l0 = 0;
            iMo13846f = i8;
            iMo13846f2 = 0;
        }
        for (int i19 = 0; i19 < i11; i19++) {
            View view4 = this.f10716L[i19];
            C2739b c2739b2 = (C2739b) view4.getLayoutParams();
            if (this.f10736s != 1) {
                iM13443l0 = this.f10715K[c2739b2.f10722e] + m13443l0();
                iMo13846f2 = this.f10738u.mo13846f(view4) + iM13443l0;
            } else if (m13063r2()) {
                iMo13846f = m13438j0() + this.f10715K[this.f10714J - c2739b2.f10722e];
                iM13438j0 = iMo13846f - this.f10738u.mo13846f(view4);
            } else {
                iM13438j0 = this.f10715K[c2739b2.f10722e] + m13438j0();
                iMo13846f = this.f10738u.mo13846f(view4) + iM13438j0;
            }
            int i20 = iMo13846f2;
            int i21 = iM13443l0;
            int i22 = iMo13846f;
            int i23 = iM13438j0;
            m13384E0(view4, i23, i21, i22, i20);
            iMo13846f2 = i20;
            iM13438j0 = i23;
            iMo13846f = i22;
            iM13443l0 = i21;
            if (c2739b2.m13480c() || c2739b2.m13479b()) {
                c2742b.f10751c = true;
            }
            c2742b.f10752d = view4.hasFocusable() | c2742b.f10752d;
        }
        Arrays.fill(this.f10716L, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: v2 */
    void mo12994v2(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b, LinearLayoutManager.C2741a c2741a, int i7) {
        super.mo12994v2(c2772w, c2746b, c2741a, i7);
        m12964i3();
        if (c2746b.m13239b() > 0 && !c2746b.m13242e()) {
            m12956W2(c2772w, c2746b, c2741a, i7);
        }
        m12957X2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: x */
    public int mo12995x(RecyclerView.C2746B c2746b) {
        return this.f10721Q ? m12954U2(c2746b) : super.mo12995x(c2746b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: y */
    public int mo12996y(RecyclerView.C2746B c2746b) {
        return this.f10721Q ? m12955V2(c2746b) : super.mo12996y(c2746b);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C2739b extends RecyclerView.C2766q {

        /* JADX INFO: renamed from: e */
        int f10722e;

        /* JADX INFO: renamed from: f */
        int f10723f;

        public C2739b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10722e = -1;
            this.f10723f = 0;
        }

        /* JADX INFO: renamed from: e */
        public int m12999e() {
            return this.f10722e;
        }

        /* JADX INFO: renamed from: f */
        public int m13000f() {
            return this.f10723f;
        }

        public C2739b(int i7, int i8) {
            super(i7, i8);
            this.f10722e = -1;
            this.f10723f = 0;
        }

        public C2739b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f10722e = -1;
            this.f10723f = 0;
        }

        public C2739b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10722e = -1;
            this.f10723f = 0;
        }
    }

    public GridLayoutManager(Context context, int i7) {
        super(context);
        this.f10713I = false;
        this.f10714J = -1;
        this.f10717M = new SparseIntArray();
        this.f10718N = new SparseIntArray();
        this.f10719O = new C2738a();
        this.f10720P = new Rect();
        m12988g3(i7);
    }

    public GridLayoutManager(Context context, int i7, int i8, boolean z7) {
        super(context, i8, z7);
        this.f10713I = false;
        this.f10714J = -1;
        this.f10717M = new SparseIntArray();
        this.f10718N = new SparseIntArray();
        this.f10719O = new C2738a();
        this.f10720P = new Rect();
        m12988g3(i7);
    }
}
