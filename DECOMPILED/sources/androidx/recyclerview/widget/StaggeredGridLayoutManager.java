package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.common.api.C3553a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC2765p implements RecyclerView.AbstractC2745A.b {

    /* JADX INFO: renamed from: B */
    private BitSet f10982B;

    /* JADX INFO: renamed from: G */
    private boolean f10987G;

    /* JADX INFO: renamed from: H */
    private boolean f10988H;

    /* JADX INFO: renamed from: I */
    private C2780e f10989I;

    /* JADX INFO: renamed from: J */
    private int f10990J;

    /* JADX INFO: renamed from: O */
    private int[] f10995O;

    /* JADX INFO: renamed from: t */
    C2781f[] f10998t;

    /* JADX INFO: renamed from: u */
    AbstractC2793l f10999u;

    /* JADX INFO: renamed from: v */
    AbstractC2793l f11000v;

    /* JADX INFO: renamed from: w */
    private int f11001w;

    /* JADX INFO: renamed from: x */
    private int f11002x;

    /* JADX INFO: renamed from: y */
    private final C2790i f11003y;

    /* JADX INFO: renamed from: s */
    private int f10997s = -1;

    /* JADX INFO: renamed from: z */
    boolean f11004z = false;

    /* JADX INFO: renamed from: A */
    boolean f10981A = false;

    /* JADX INFO: renamed from: C */
    int f10983C = -1;

    /* JADX INFO: renamed from: D */
    int f10984D = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: E */
    C2779d f10985E = new C2779d();

    /* JADX INFO: renamed from: F */
    private int f10986F = 2;

    /* JADX INFO: renamed from: K */
    private final Rect f10991K = new Rect();

    /* JADX INFO: renamed from: L */
    private final C2777b f10992L = new C2777b();

    /* JADX INFO: renamed from: M */
    private boolean f10993M = false;

    /* JADX INFO: renamed from: N */
    private boolean f10994N = true;

    /* JADX INFO: renamed from: P */
    private final Runnable f10996P = new RunnableC2776a();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    class RunnableC2776a implements Runnable {
        RunnableC2776a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m13595X1();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    class C2777b {

        /* JADX INFO: renamed from: a */
        int f11006a;

        /* JADX INFO: renamed from: b */
        int f11007b;

        /* JADX INFO: renamed from: c */
        boolean f11008c;

        /* JADX INFO: renamed from: d */
        boolean f11009d;

        /* JADX INFO: renamed from: e */
        boolean f11010e;

        /* JADX INFO: renamed from: f */
        int[] f11011f;

        C2777b() {
            m13606c();
        }

        /* JADX INFO: renamed from: a */
        void m13604a() {
            this.f11007b = this.f11008c ? StaggeredGridLayoutManager.this.f10999u.mo13849i() : StaggeredGridLayoutManager.this.f10999u.mo13853m();
        }

        /* JADX INFO: renamed from: b */
        void m13605b(int i7) {
            if (this.f11008c) {
                this.f11007b = StaggeredGridLayoutManager.this.f10999u.mo13849i() - i7;
            } else {
                this.f11007b = StaggeredGridLayoutManager.this.f10999u.mo13853m() + i7;
            }
        }

        /* JADX INFO: renamed from: c */
        void m13606c() {
            this.f11006a = -1;
            this.f11007b = Integer.MIN_VALUE;
            this.f11008c = false;
            this.f11009d = false;
            this.f11010e = false;
            int[] iArr = this.f11011f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* JADX INFO: renamed from: d */
        void m13607d(C2781f[] c2781fArr) {
            int length = c2781fArr.length;
            int[] iArr = this.f11011f;
            if (iArr == null || iArr.length < length) {
                this.f11011f = new int[StaggeredGridLayoutManager.this.f10998t.length];
            }
            for (int i7 = 0; i7 < length; i7++) {
                this.f11011f[i7] = c2781fArr[i7].m13646p(Integer.MIN_VALUE);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C2778c extends RecyclerView.C2766q {

        /* JADX INFO: renamed from: e */
        C2781f f11013e;

        /* JADX INFO: renamed from: f */
        boolean f11014f;

        public C2778c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: renamed from: e */
        public boolean m13608e() {
            return this.f11014f;
        }

        public C2778c(int i7, int i8) {
            super(i7, i8);
        }

        public C2778c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C2778c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    public static class C2780e implements Parcelable {
        public static final Parcelable.Creator<C2780e> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        int f11021a;

        /* JADX INFO: renamed from: b */
        int f11022b;

        /* JADX INFO: renamed from: c */
        int f11023c;

        /* JADX INFO: renamed from: d */
        int[] f11024d;

        /* JADX INFO: renamed from: e */
        int f11025e;

        /* JADX INFO: renamed from: f */
        int[] f11026f;

        /* JADX INFO: renamed from: r */
        List f11027r;

        /* JADX INFO: renamed from: s */
        boolean f11028s;

        /* JADX INFO: renamed from: t */
        boolean f11029t;

        /* JADX INFO: renamed from: u */
        boolean f11030u;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C2780e createFromParcel(Parcel parcel) {
                return new C2780e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C2780e[] newArray(int i7) {
                return new C2780e[i7];
            }
        }

        public C2780e() {
        }

        /* JADX INFO: renamed from: a */
        void m13627a() {
            this.f11024d = null;
            this.f11023c = 0;
            this.f11021a = -1;
            this.f11022b = -1;
        }

        /* JADX INFO: renamed from: b */
        void m13628b() {
            this.f11024d = null;
            this.f11023c = 0;
            this.f11025e = 0;
            this.f11026f = null;
            this.f11027r = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f11021a);
            parcel.writeInt(this.f11022b);
            parcel.writeInt(this.f11023c);
            if (this.f11023c > 0) {
                parcel.writeIntArray(this.f11024d);
            }
            parcel.writeInt(this.f11025e);
            if (this.f11025e > 0) {
                parcel.writeIntArray(this.f11026f);
            }
            parcel.writeInt(this.f11028s ? 1 : 0);
            parcel.writeInt(this.f11029t ? 1 : 0);
            parcel.writeInt(this.f11030u ? 1 : 0);
            parcel.writeList(this.f11027r);
        }

        C2780e(Parcel parcel) {
            this.f11021a = parcel.readInt();
            this.f11022b = parcel.readInt();
            int i7 = parcel.readInt();
            this.f11023c = i7;
            if (i7 > 0) {
                int[] iArr = new int[i7];
                this.f11024d = iArr;
                parcel.readIntArray(iArr);
            }
            int i8 = parcel.readInt();
            this.f11025e = i8;
            if (i8 > 0) {
                int[] iArr2 = new int[i8];
                this.f11026f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f11028s = parcel.readInt() == 1;
            this.f11029t = parcel.readInt() == 1;
            this.f11030u = parcel.readInt() == 1;
            this.f11027r = parcel.readArrayList(C2779d.a.class.getClassLoader());
        }

        public C2780e(C2780e c2780e) {
            this.f11023c = c2780e.f11023c;
            this.f11021a = c2780e.f11021a;
            this.f11022b = c2780e.f11022b;
            this.f11024d = c2780e.f11024d;
            this.f11025e = c2780e.f11025e;
            this.f11026f = c2780e.f11026f;
            this.f11028s = c2780e.f11028s;
            this.f11029t = c2780e.f11029t;
            this.f11030u = c2780e.f11030u;
            this.f11027r = c2780e.f11027r;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    class C2781f {

        /* JADX INFO: renamed from: a */
        ArrayList f11031a = new ArrayList();

        /* JADX INFO: renamed from: b */
        int f11032b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c */
        int f11033c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d */
        int f11034d = 0;

        /* JADX INFO: renamed from: e */
        final int f11035e;

        C2781f(int i7) {
            this.f11035e = i7;
        }

        /* JADX INFO: renamed from: a */
        void m13631a(View view) {
            C2778c c2778cM13644n = m13644n(view);
            c2778cM13644n.f11013e = this;
            this.f11031a.add(view);
            this.f11033c = Integer.MIN_VALUE;
            if (this.f11031a.size() == 1) {
                this.f11032b = Integer.MIN_VALUE;
            }
            if (c2778cM13644n.m13480c() || c2778cM13644n.m13479b()) {
                this.f11034d += StaggeredGridLayoutManager.this.f10999u.mo13845e(view);
            }
        }

        /* JADX INFO: renamed from: b */
        void m13632b(boolean z7, int i7) {
            int iM13642l = z7 ? m13642l(Integer.MIN_VALUE) : m13646p(Integer.MIN_VALUE);
            m13635e();
            if (iM13642l == Integer.MIN_VALUE) {
                return;
            }
            if (!z7 || iM13642l >= StaggeredGridLayoutManager.this.f10999u.mo13849i()) {
                if (z7 || iM13642l <= StaggeredGridLayoutManager.this.f10999u.mo13853m()) {
                    if (i7 != Integer.MIN_VALUE) {
                        iM13642l += i7;
                    }
                    this.f11033c = iM13642l;
                    this.f11032b = iM13642l;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        void m13633c() {
            C2779d.a aVarM13617f;
            ArrayList arrayList = this.f11031a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            C2778c c2778cM13644n = m13644n(view);
            this.f11033c = StaggeredGridLayoutManager.this.f10999u.mo13844d(view);
            if (c2778cM13644n.f11014f && (aVarM13617f = StaggeredGridLayoutManager.this.f10985E.m13617f(c2778cM13644n.m13478a())) != null && aVarM13617f.f11018b == 1) {
                this.f11033c += aVarM13617f.m13624a(this.f11035e);
            }
        }

        /* JADX INFO: renamed from: d */
        void m13634d() {
            C2779d.a aVarM13617f;
            View view = (View) this.f11031a.get(0);
            C2778c c2778cM13644n = m13644n(view);
            this.f11032b = StaggeredGridLayoutManager.this.f10999u.mo13847g(view);
            if (c2778cM13644n.f11014f && (aVarM13617f = StaggeredGridLayoutManager.this.f10985E.m13617f(c2778cM13644n.m13478a())) != null && aVarM13617f.f11018b == -1) {
                this.f11032b -= aVarM13617f.m13624a(this.f11035e);
            }
        }

        /* JADX INFO: renamed from: e */
        void m13635e() {
            this.f11031a.clear();
            m13647q();
            this.f11034d = 0;
        }

        /* JADX INFO: renamed from: f */
        public int m13636f() {
            return StaggeredGridLayoutManager.this.f11004z ? m13639i(this.f11031a.size() - 1, -1, true) : m13639i(0, this.f11031a.size(), true);
        }

        /* JADX INFO: renamed from: g */
        public int m13637g() {
            return StaggeredGridLayoutManager.this.f11004z ? m13639i(0, this.f11031a.size(), true) : m13639i(this.f11031a.size() - 1, -1, true);
        }

        /* JADX INFO: renamed from: h */
        int m13638h(int i7, int i8, boolean z7, boolean z8, boolean z9) {
            int iMo13853m = StaggeredGridLayoutManager.this.f10999u.mo13853m();
            int iMo13849i = StaggeredGridLayoutManager.this.f10999u.mo13849i();
            int i9 = i8 > i7 ? 1 : -1;
            while (i7 != i8) {
                View view = (View) this.f11031a.get(i7);
                int iMo13847g = StaggeredGridLayoutManager.this.f10999u.mo13847g(view);
                int iMo13844d = StaggeredGridLayoutManager.this.f10999u.mo13844d(view);
                boolean z10 = false;
                boolean z11 = !z9 ? iMo13847g >= iMo13849i : iMo13847g > iMo13849i;
                if (!z9 ? iMo13844d > iMo13853m : iMo13844d >= iMo13853m) {
                    z10 = true;
                }
                if (z11 && z10) {
                    if (z7 && z8) {
                        if (iMo13847g >= iMo13853m && iMo13844d <= iMo13849i) {
                            return StaggeredGridLayoutManager.this.m13445m0(view);
                        }
                    } else {
                        if (z8) {
                            return StaggeredGridLayoutManager.this.m13445m0(view);
                        }
                        if (iMo13847g < iMo13853m || iMo13844d > iMo13849i) {
                            return StaggeredGridLayoutManager.this.m13445m0(view);
                        }
                    }
                }
                i7 += i9;
            }
            return -1;
        }

        /* JADX INFO: renamed from: i */
        int m13639i(int i7, int i8, boolean z7) {
            return m13638h(i7, i8, false, false, z7);
        }

        /* JADX INFO: renamed from: j */
        public int m13640j() {
            return this.f11034d;
        }

        /* JADX INFO: renamed from: k */
        int m13641k() {
            int i7 = this.f11033c;
            if (i7 != Integer.MIN_VALUE) {
                return i7;
            }
            m13633c();
            return this.f11033c;
        }

        /* JADX INFO: renamed from: l */
        int m13642l(int i7) {
            int i8 = this.f11033c;
            if (i8 != Integer.MIN_VALUE) {
                return i8;
            }
            if (this.f11031a.size() == 0) {
                return i7;
            }
            m13633c();
            return this.f11033c;
        }

        /* JADX INFO: renamed from: m */
        public View m13643m(int i7, int i8) {
            View view = null;
            if (i8 != -1) {
                int size = this.f11031a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f11031a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f11004z && staggeredGridLayoutManager.m13445m0(view2) >= i7) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f11004z && staggeredGridLayoutManager2.m13445m0(view2) <= i7) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.f11031a.size();
            int i9 = 0;
            while (i9 < size2) {
                View view3 = (View) this.f11031a.get(i9);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.f11004z && staggeredGridLayoutManager3.m13445m0(view3) <= i7) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.f11004z && staggeredGridLayoutManager4.m13445m0(view3) >= i7) || !view3.hasFocusable()) {
                    break;
                }
                i9++;
                view = view3;
            }
            return view;
        }

        /* JADX INFO: renamed from: n */
        C2778c m13644n(View view) {
            return (C2778c) view.getLayoutParams();
        }

        /* JADX INFO: renamed from: o */
        int m13645o() {
            int i7 = this.f11032b;
            if (i7 != Integer.MIN_VALUE) {
                return i7;
            }
            m13634d();
            return this.f11032b;
        }

        /* JADX INFO: renamed from: p */
        int m13646p(int i7) {
            int i8 = this.f11032b;
            if (i8 != Integer.MIN_VALUE) {
                return i8;
            }
            if (this.f11031a.size() == 0) {
                return i7;
            }
            m13634d();
            return this.f11032b;
        }

        /* JADX INFO: renamed from: q */
        void m13647q() {
            this.f11032b = Integer.MIN_VALUE;
            this.f11033c = Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: r */
        void m13648r(int i7) {
            int i8 = this.f11032b;
            if (i8 != Integer.MIN_VALUE) {
                this.f11032b = i8 + i7;
            }
            int i9 = this.f11033c;
            if (i9 != Integer.MIN_VALUE) {
                this.f11033c = i9 + i7;
            }
        }

        /* JADX INFO: renamed from: s */
        void m13649s() {
            int size = this.f11031a.size();
            View view = (View) this.f11031a.remove(size - 1);
            C2778c c2778cM13644n = m13644n(view);
            c2778cM13644n.f11013e = null;
            if (c2778cM13644n.m13480c() || c2778cM13644n.m13479b()) {
                this.f11034d -= StaggeredGridLayoutManager.this.f10999u.mo13845e(view);
            }
            if (size == 1) {
                this.f11032b = Integer.MIN_VALUE;
            }
            this.f11033c = Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: t */
        void m13650t() {
            View view = (View) this.f11031a.remove(0);
            C2778c c2778cM13644n = m13644n(view);
            c2778cM13644n.f11013e = null;
            if (this.f11031a.size() == 0) {
                this.f11033c = Integer.MIN_VALUE;
            }
            if (c2778cM13644n.m13480c() || c2778cM13644n.m13479b()) {
                this.f11034d -= StaggeredGridLayoutManager.this.f10999u.mo13845e(view);
            }
            this.f11032b = Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: u */
        void m13651u(View view) {
            C2778c c2778cM13644n = m13644n(view);
            c2778cM13644n.f11013e = this;
            this.f11031a.add(0, view);
            this.f11032b = Integer.MIN_VALUE;
            if (this.f11031a.size() == 1) {
                this.f11033c = Integer.MIN_VALUE;
            }
            if (c2778cM13644n.m13480c() || c2778cM13644n.m13479b()) {
                this.f11034d += StaggeredGridLayoutManager.this.f10999u.mo13845e(view);
            }
        }

        /* JADX INFO: renamed from: v */
        void m13652v(int i7) {
            this.f11032b = i7;
            this.f11033c = i7;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        RecyclerView.AbstractC2765p.d dVarM13376n0 = RecyclerView.AbstractC2765p.m13376n0(context, attributeSet, i7, i8);
        m13587M2(dVarM13376n0.f10957a);
        m13589O2(dVarM13376n0.f10958b);
        m13588N2(dVarM13376n0.f10959c);
        this.f11003y = new C2790i();
        m13572f2();
    }

    /* JADX INFO: renamed from: A2 */
    private void m13546A2(View view, C2778c c2778c, boolean z7) {
        if (c2778c.f11014f) {
            if (this.f11001w == 1) {
                m13584z2(view, this.f10990J, RecyclerView.AbstractC2765p.m13373Q(m13424c0(), m13425d0(), m13443l0() + m13436i0(), ((ViewGroup.MarginLayoutParams) c2778c).height, true), z7);
                return;
            } else {
                m13584z2(view, RecyclerView.AbstractC2765p.m13373Q(m13460t0(), m13462u0(), m13438j0() + m13441k0(), ((ViewGroup.MarginLayoutParams) c2778c).width, true), this.f10990J, z7);
                return;
            }
        }
        if (this.f11001w == 1) {
            m13584z2(view, RecyclerView.AbstractC2765p.m13373Q(this.f11002x, m13462u0(), 0, ((ViewGroup.MarginLayoutParams) c2778c).width, false), RecyclerView.AbstractC2765p.m13373Q(m13424c0(), m13425d0(), m13443l0() + m13436i0(), ((ViewGroup.MarginLayoutParams) c2778c).height, true), z7);
        } else {
            m13584z2(view, RecyclerView.AbstractC2765p.m13373Q(m13460t0(), m13462u0(), m13438j0() + m13441k0(), ((ViewGroup.MarginLayoutParams) c2778c).width, true), RecyclerView.AbstractC2765p.m13373Q(this.f11002x, m13425d0(), 0, ((ViewGroup.MarginLayoutParams) c2778c).height, false), z7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0155  */
    /* JADX INFO: renamed from: B2 */
    private void m13547B2(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b, boolean z7) {
        boolean z8;
        C2780e c2780e;
        C2777b c2777b = this.f10992L;
        if (!(this.f10989I == null && this.f10983C == -1) && c2746b.m13239b() == 0) {
            m13453p1(c2772w);
            c2777b.m13606c();
            return;
        }
        boolean z9 = (c2777b.f11010e && this.f10983C == -1 && this.f10989I == null) ? false : true;
        if (z9) {
            c2777b.m13606c();
            if (this.f10989I != null) {
                m13559S1(c2777b);
            } else {
                m13554J2();
                c2777b.f11008c = this.f10981A;
            }
            m13591S2(c2746b, c2777b);
            c2777b.f11010e = true;
        }
        if (this.f10989I == null && this.f10983C == -1 && (c2777b.f11008c != this.f10987G || m13603y2() != this.f10988H)) {
            this.f10985E.m13613b();
            c2777b.f11009d = true;
        }
        if (m13407P() > 0 && ((c2780e = this.f10989I) == null || c2780e.f11023c < 1)) {
            if (c2777b.f11009d) {
                for (int i7 = 0; i7 < this.f10997s; i7++) {
                    this.f10998t[i7].m13635e();
                    int i8 = c2777b.f11007b;
                    if (i8 != Integer.MIN_VALUE) {
                        this.f10998t[i7].m13652v(i8);
                    }
                }
            } else if (z9 || this.f10992L.f11011f == null) {
                for (int i9 = 0; i9 < this.f10997s; i9++) {
                    this.f10998t[i9].m13632b(this.f10981A, c2777b.f11007b);
                }
                this.f10992L.m13607d(this.f10998t);
            } else {
                for (int i10 = 0; i10 < this.f10997s; i10++) {
                    C2781f c2781f = this.f10998t[i10];
                    c2781f.m13635e();
                    c2781f.m13652v(this.f10992L.f11011f[i10]);
                }
            }
        }
        m13380C(c2772w);
        this.f11003y.f11215a = false;
        this.f10993M = false;
        m13594U2(this.f11000v.mo13854n());
        m13560T2(c2777b.f11006a, c2746b);
        if (c2777b.f11008c) {
            m13555L2(-1);
            m13573g2(c2772w, this.f11003y, c2746b);
            m13555L2(1);
            C2790i c2790i = this.f11003y;
            c2790i.f11217c = c2777b.f11006a + c2790i.f11218d;
            m13573g2(c2772w, c2790i, c2746b);
        } else {
            m13555L2(1);
            m13573g2(c2772w, this.f11003y, c2746b);
            m13555L2(-1);
            C2790i c2790i2 = this.f11003y;
            c2790i2.f11217c = c2777b.f11006a + c2790i2.f11218d;
            m13573g2(c2772w, c2790i2, c2746b);
        }
        m13553I2();
        if (m13407P() > 0) {
            if (this.f10981A) {
                m13576m2(c2772w, c2746b, true);
                m13577n2(c2772w, c2746b, false);
            } else {
                m13577n2(c2772w, c2746b, true);
                m13576m2(c2772w, c2746b, false);
            }
        }
        if (z7 && !c2746b.m13242e() && this.f10986F != 0 && m13407P() > 0 && (this.f10993M || m13601w2() != null)) {
            m13461t1(this.f10996P);
            z8 = m13595X1();
        }
        if (c2746b.m13242e()) {
            this.f10992L.m13606c();
        }
        this.f10987G = c2777b.f11008c;
        this.f10988H = m13603y2();
        if (z8) {
            this.f10992L.m13606c();
            m13547B2(c2772w, c2746b, false);
        }
    }

    /* JADX INFO: renamed from: C2 */
    private boolean m13548C2(int i7) {
        if (this.f11001w == 0) {
            return (i7 == -1) != this.f10981A;
        }
        return ((i7 == -1) == this.f10981A) == m13603y2();
    }

    /* JADX INFO: renamed from: E2 */
    private void m13549E2(View view) {
        for (int i7 = this.f10997s - 1; i7 >= 0; i7--) {
            this.f10998t[i7].m13651u(view);
        }
    }

    /* JADX INFO: renamed from: F2 */
    private void m13550F2(RecyclerView.C2772w c2772w, C2790i c2790i) {
        int iMin;
        if (!c2790i.f11215a || c2790i.f11223i) {
            return;
        }
        if (c2790i.f11216b == 0) {
            if (c2790i.f11219e == -1) {
                m13551G2(c2772w, c2790i.f11221g);
                return;
            } else {
                m13552H2(c2772w, c2790i.f11220f);
                return;
            }
        }
        if (c2790i.f11219e == -1) {
            int i7 = c2790i.f11220f;
            int iM13579r2 = i7 - m13579r2(i7);
            m13551G2(c2772w, iM13579r2 < 0 ? c2790i.f11221g : c2790i.f11221g - Math.min(iM13579r2, c2790i.f11216b));
        } else {
            int iM13580s2 = m13580s2(c2790i.f11221g) - c2790i.f11221g;
            if (iM13580s2 < 0) {
                iMin = c2790i.f11220f;
            } else {
                iMin = Math.min(iM13580s2, c2790i.f11216b) + c2790i.f11220f;
            }
            m13552H2(c2772w, iMin);
        }
    }

    /* JADX INFO: renamed from: G2 */
    private void m13551G2(RecyclerView.C2772w c2772w, int i7) {
        for (int iM13407P = m13407P() - 1; iM13407P >= 0; iM13407P--) {
            View viewM13405O = m13405O(iM13407P);
            if (this.f10999u.mo13847g(viewM13405O) < i7 || this.f10999u.mo13857q(viewM13405O) < i7) {
                return;
            }
            C2778c c2778c = (C2778c) viewM13405O.getLayoutParams();
            if (c2778c.f11014f) {
                for (int i8 = 0; i8 < this.f10997s; i8++) {
                    if (this.f10998t[i8].f11031a.size() == 1) {
                        return;
                    }
                }
                for (int i9 = 0; i9 < this.f10997s; i9++) {
                    this.f10998t[i9].m13649s();
                }
            } else if (c2778c.f11013e.f11031a.size() == 1) {
                return;
            } else {
                c2778c.f11013e.m13649s();
            }
            m13457r1(viewM13405O, c2772w);
        }
    }

    /* JADX INFO: renamed from: H2 */
    private void m13552H2(RecyclerView.C2772w c2772w, int i7) {
        while (m13407P() > 0) {
            View viewM13405O = m13405O(0);
            if (this.f10999u.mo13844d(viewM13405O) > i7 || this.f10999u.mo13856p(viewM13405O) > i7) {
                return;
            }
            C2778c c2778c = (C2778c) viewM13405O.getLayoutParams();
            if (c2778c.f11014f) {
                for (int i8 = 0; i8 < this.f10997s; i8++) {
                    if (this.f10998t[i8].f11031a.size() == 1) {
                        return;
                    }
                }
                for (int i9 = 0; i9 < this.f10997s; i9++) {
                    this.f10998t[i9].m13650t();
                }
            } else if (c2778c.f11013e.f11031a.size() == 1) {
                return;
            } else {
                c2778c.f11013e.m13650t();
            }
            m13457r1(viewM13405O, c2772w);
        }
    }

    /* JADX INFO: renamed from: I2 */
    private void m13553I2() {
        if (this.f11000v.mo13851k() == 1073741824) {
            return;
        }
        int iM13407P = m13407P();
        float fMax = 0.0f;
        for (int i7 = 0; i7 < iM13407P; i7++) {
            View viewM13405O = m13405O(i7);
            float fMo13845e = this.f11000v.mo13845e(viewM13405O);
            if (fMo13845e >= fMax) {
                if (((C2778c) viewM13405O.getLayoutParams()).m13608e()) {
                    fMo13845e = (fMo13845e * 1.0f) / this.f10997s;
                }
                fMax = Math.max(fMax, fMo13845e);
            }
        }
        int i8 = this.f11002x;
        int iRound = Math.round(fMax * this.f10997s);
        if (this.f11000v.mo13851k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f11000v.mo13854n());
        }
        m13594U2(iRound);
        if (this.f11002x == i8) {
            return;
        }
        for (int i9 = 0; i9 < iM13407P; i9++) {
            View viewM13405O2 = m13405O(i9);
            C2778c c2778c = (C2778c) viewM13405O2.getLayoutParams();
            if (!c2778c.f11014f) {
                if (m13603y2() && this.f11001w == 1) {
                    int i10 = this.f10997s;
                    int i11 = c2778c.f11013e.f11035e;
                    viewM13405O2.offsetLeftAndRight(((-((i10 - 1) - i11)) * this.f11002x) - ((-((i10 - 1) - i11)) * i8));
                } else {
                    int i12 = c2778c.f11013e.f11035e;
                    int i13 = this.f11002x * i12;
                    int i14 = i12 * i8;
                    if (this.f11001w == 1) {
                        viewM13405O2.offsetLeftAndRight(i13 - i14);
                    } else {
                        viewM13405O2.offsetTopAndBottom(i13 - i14);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: J2 */
    private void m13554J2() {
        if (this.f11001w == 1 || !m13603y2()) {
            this.f10981A = this.f11004z;
        } else {
            this.f10981A = !this.f11004z;
        }
    }

    /* JADX INFO: renamed from: L2 */
    private void m13555L2(int i7) {
        C2790i c2790i = this.f11003y;
        c2790i.f11219e = i7;
        c2790i.f11218d = this.f10981A != (i7 == -1) ? -1 : 1;
    }

    /* JADX INFO: renamed from: P2 */
    private void m13556P2(int i7, int i8) {
        for (int i9 = 0; i9 < this.f10997s; i9++) {
            if (!this.f10998t[i9].f11031a.isEmpty()) {
                m13562V2(this.f10998t[i9], i7, i8);
            }
        }
    }

    /* JADX INFO: renamed from: Q2 */
    private boolean m13557Q2(RecyclerView.C2746B c2746b, C2777b c2777b) {
        c2777b.f11006a = this.f10987G ? m13575l2(c2746b.m13239b()) : m13574h2(c2746b.m13239b());
        c2777b.f11007b = Integer.MIN_VALUE;
        return true;
    }

    /* JADX INFO: renamed from: R1 */
    private void m13558R1(View view) {
        for (int i7 = this.f10997s - 1; i7 >= 0; i7--) {
            this.f10998t[i7].m13631a(view);
        }
    }

    /* JADX INFO: renamed from: S1 */
    private void m13559S1(C2777b c2777b) {
        C2780e c2780e = this.f10989I;
        int i7 = c2780e.f11023c;
        if (i7 > 0) {
            if (i7 == this.f10997s) {
                for (int i8 = 0; i8 < this.f10997s; i8++) {
                    this.f10998t[i8].m13635e();
                    C2780e c2780e2 = this.f10989I;
                    int iMo13849i = c2780e2.f11024d[i8];
                    if (iMo13849i != Integer.MIN_VALUE) {
                        iMo13849i += c2780e2.f11029t ? this.f10999u.mo13849i() : this.f10999u.mo13853m();
                    }
                    this.f10998t[i8].m13652v(iMo13849i);
                }
            } else {
                c2780e.m13628b();
                C2780e c2780e3 = this.f10989I;
                c2780e3.f11021a = c2780e3.f11022b;
            }
        }
        C2780e c2780e4 = this.f10989I;
        this.f10988H = c2780e4.f11030u;
        m13588N2(c2780e4.f11028s);
        m13554J2();
        C2780e c2780e5 = this.f10989I;
        int i9 = c2780e5.f11021a;
        if (i9 != -1) {
            this.f10983C = i9;
            c2777b.f11008c = c2780e5.f11029t;
        } else {
            c2777b.f11008c = this.f10981A;
        }
        if (c2780e5.f11025e > 1) {
            C2779d c2779d = this.f10985E;
            c2779d.f11015a = c2780e5.f11026f;
            c2779d.f11016b = c2780e5.f11027r;
        }
    }

    /* JADX INFO: renamed from: T2 */
    private void m13560T2(int i7, RecyclerView.C2746B c2746b) {
        int iMo13854n;
        int iMo13854n2;
        int iM13240c;
        C2790i c2790i = this.f11003y;
        boolean z7 = false;
        c2790i.f11216b = 0;
        c2790i.f11217c = i7;
        if (!m13381C0() || (iM13240c = c2746b.m13240c()) == -1) {
            iMo13854n = 0;
            iMo13854n2 = 0;
        } else {
            if (this.f10981A == (iM13240c < i7)) {
                iMo13854n = this.f10999u.mo13854n();
                iMo13854n2 = 0;
            } else {
                iMo13854n2 = this.f10999u.mo13854n();
                iMo13854n = 0;
            }
        }
        if (m13411S()) {
            this.f11003y.f11220f = this.f10999u.mo13853m() - iMo13854n2;
            this.f11003y.f11221g = this.f10999u.mo13849i() + iMo13854n;
        } else {
            this.f11003y.f11221g = this.f10999u.mo13848h() + iMo13854n;
            this.f11003y.f11220f = -iMo13854n2;
        }
        C2790i c2790i2 = this.f11003y;
        c2790i2.f11222h = false;
        c2790i2.f11215a = true;
        if (this.f10999u.mo13851k() == 0 && this.f10999u.mo13848h() == 0) {
            z7 = true;
        }
        c2790i2.f11223i = z7;
    }

    /* JADX INFO: renamed from: V1 */
    private void m13561V1(View view, C2778c c2778c, C2790i c2790i) {
        if (c2790i.f11219e == 1) {
            if (c2778c.f11014f) {
                m13558R1(view);
                return;
            } else {
                c2778c.f11013e.m13631a(view);
                return;
            }
        }
        if (c2778c.f11014f) {
            m13549E2(view);
        } else {
            c2778c.f11013e.m13651u(view);
        }
    }

    /* JADX INFO: renamed from: V2 */
    private void m13562V2(C2781f c2781f, int i7, int i8) {
        int iM13640j = c2781f.m13640j();
        if (i7 == -1) {
            if (c2781f.m13645o() + iM13640j <= i8) {
                this.f10982B.set(c2781f.f11035e, false);
            }
        } else if (c2781f.m13641k() - iM13640j >= i8) {
            this.f10982B.set(c2781f.f11035e, false);
        }
    }

    /* JADX INFO: renamed from: W1 */
    private int m13563W1(int i7) {
        if (m13407P() == 0) {
            return this.f10981A ? 1 : -1;
        }
        return (i7 < m13599o2()) != this.f10981A ? -1 : 1;
    }

    /* JADX INFO: renamed from: W2 */
    private int m13564W2(int i7, int i8, int i9) {
        int mode;
        return (!(i8 == 0 && i9 == 0) && ((mode = View.MeasureSpec.getMode(i7)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i7) - i8) - i9), mode) : i7;
    }

    /* JADX INFO: renamed from: Y1 */
    private boolean m13565Y1(C2781f c2781f) {
        if (this.f10981A) {
            if (c2781f.m13641k() < this.f10999u.mo13849i()) {
                ArrayList arrayList = c2781f.f11031a;
                return !c2781f.m13644n((View) arrayList.get(arrayList.size() - 1)).f11014f;
            }
        } else if (c2781f.m13645o() > this.f10999u.mo13853m()) {
            return !c2781f.m13644n((View) c2781f.f11031a.get(0)).f11014f;
        }
        return false;
    }

    /* JADX INFO: renamed from: Z1 */
    private int m13566Z1(RecyclerView.C2746B c2746b) {
        if (m13407P() == 0) {
            return 0;
        }
        return AbstractC2796o.m13875a(c2746b, this.f10999u, m13597j2(!this.f10994N), m13596i2(!this.f10994N), this, this.f10994N);
    }

    /* JADX INFO: renamed from: a2 */
    private int m13567a2(RecyclerView.C2746B c2746b) {
        if (m13407P() == 0) {
            return 0;
        }
        return AbstractC2796o.m13876b(c2746b, this.f10999u, m13597j2(!this.f10994N), m13596i2(!this.f10994N), this, this.f10994N, this.f10981A);
    }

    /* JADX INFO: renamed from: b2 */
    private int m13568b2(RecyclerView.C2746B c2746b) {
        if (m13407P() == 0) {
            return 0;
        }
        return AbstractC2796o.m13877c(c2746b, this.f10999u, m13597j2(!this.f10994N), m13596i2(!this.f10994N), this, this.f10994N);
    }

    /* JADX INFO: renamed from: c2 */
    private int m13569c2(int i7) {
        if (i7 == 1) {
            return (this.f11001w != 1 && m13603y2()) ? 1 : -1;
        }
        if (i7 == 2) {
            return (this.f11001w != 1 && m13603y2()) ? -1 : 1;
        }
        if (i7 == 17) {
            return this.f11001w == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i7 == 33) {
            return this.f11001w == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i7 != 66) {
            return (i7 == 130 && this.f11001w == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f11001w == 0 ? 1 : Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: d2 */
    private C2779d.a m13570d2(int i7) {
        C2779d.a aVar = new C2779d.a();
        aVar.f11019c = new int[this.f10997s];
        for (int i8 = 0; i8 < this.f10997s; i8++) {
            aVar.f11019c[i8] = i7 - this.f10998t[i8].m13642l(i7);
        }
        return aVar;
    }

    /* JADX INFO: renamed from: e2 */
    private C2779d.a m13571e2(int i7) {
        C2779d.a aVar = new C2779d.a();
        aVar.f11019c = new int[this.f10997s];
        for (int i8 = 0; i8 < this.f10997s; i8++) {
            aVar.f11019c[i8] = this.f10998t[i8].m13646p(i7) - i7;
        }
        return aVar;
    }

    /* JADX INFO: renamed from: f2 */
    private void m13572f2() {
        this.f10999u = AbstractC2793l.m13842b(this, this.f11001w);
        this.f11000v = AbstractC2793l.m13842b(this, 1 - this.f11001w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$p, androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX INFO: renamed from: g2 */
    private int m13573g2(RecyclerView.C2772w c2772w, C2790i c2790i, RecyclerView.C2746B c2746b) {
        int i7;
        int iM13578q2;
        C2781f c2781fM13582u2;
        int iM13581t2;
        int iMo13845e;
        int iMo13853m;
        int iMo13845e2;
        ?? r7;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        ?? r8 = 0;
        staggeredGridLayoutManager.f10982B.set(0, staggeredGridLayoutManager.f10997s, true);
        if (staggeredGridLayoutManager.f11003y.f11223i) {
            i7 = c2790i.f11219e == 1 ? C3553a.e.API_PRIORITY_OTHER : Integer.MIN_VALUE;
        } else {
            i7 = c2790i.f11219e == 1 ? c2790i.f11221g + c2790i.f11216b : c2790i.f11220f - c2790i.f11216b;
        }
        int i8 = i7;
        staggeredGridLayoutManager.m13556P2(c2790i.f11219e, i8);
        int iMo13849i = staggeredGridLayoutManager.f10981A ? staggeredGridLayoutManager.f10999u.mo13849i() : staggeredGridLayoutManager.f10999u.mo13853m();
        boolean z7 = false;
        ?? r9 = staggeredGridLayoutManager;
        while (c2790i.m13822a(c2746b) && (r9.f11003y.f11223i || !r9.f10982B.isEmpty())) {
            View viewM13823b = c2790i.m13823b(c2772w);
            C2778c c2778c = (C2778c) viewM13823b.getLayoutParams();
            int iM13478a = c2778c.m13478a();
            int iM13618g = r9.f10985E.m13618g(iM13478a);
            ?? r10 = iM13618g == -1 ? 1 : r8;
            if (r10 != 0) {
                c2781fM13582u2 = c2778c.f11014f ? r9.f10998t[r8] : r9.m13582u2(c2790i);
                r9.f10985E.m13622n(iM13478a, c2781fM13582u2);
            } else {
                c2781fM13582u2 = r9.f10998t[iM13618g];
            }
            C2781f c2781f = c2781fM13582u2;
            c2778c.f11013e = c2781f;
            if (c2790i.f11219e == 1) {
                r9.m13437j(viewM13823b);
            } else {
                r9.m13440k(viewM13823b, r8);
            }
            r9.m13546A2(viewM13823b, c2778c, r8);
            if (c2790i.f11219e == 1) {
                iMo13845e = c2778c.f11014f ? r9.m13578q2(iMo13849i) : c2781f.m13642l(iMo13849i);
                iM13581t2 = r9.f10999u.mo13845e(viewM13823b) + iMo13845e;
                if (r10 != 0 && c2778c.f11014f) {
                    C2779d.a aVarM13570d2 = r9.m13570d2(iMo13845e);
                    aVarM13570d2.f11018b = -1;
                    aVarM13570d2.f11017a = iM13478a;
                    r9.f10985E.m13612a(aVarM13570d2);
                }
            } else {
                iM13581t2 = c2778c.f11014f ? r9.m13581t2(iMo13849i) : c2781f.m13646p(iMo13849i);
                iMo13845e = iM13581t2 - r9.f10999u.mo13845e(viewM13823b);
                if (r10 != 0 && c2778c.f11014f) {
                    C2779d.a aVarM13571e2 = r9.m13571e2(iM13581t2);
                    aVarM13571e2.f11018b = 1;
                    aVarM13571e2.f11017a = iM13478a;
                    r9.f10985E.m13612a(aVarM13571e2);
                }
            }
            if (c2778c.f11014f && c2790i.f11218d == -1) {
                if (r10 != 0) {
                    r9.f10993M = true;
                } else {
                    if (!(c2790i.f11219e == 1 ? r9.m13592T1() : r9.m13593U1())) {
                        C2779d.a aVarM13617f = r9.f10985E.m13617f(iM13478a);
                        if (aVarM13617f != null) {
                            aVarM13617f.f11020d = true;
                        }
                        r9.f10993M = true;
                    }
                }
            }
            r9.m13561V1(viewM13823b, c2778c, c2790i);
            if (r9.m13603y2() && r9.f11001w == 1) {
                iMo13845e2 = c2778c.f11014f ? r9.f11000v.mo13849i() : r9.f11000v.mo13849i() - (((r9.f10997s - 1) - c2781f.f11035e) * r9.f11002x);
                iMo13853m = iMo13845e2 - r9.f11000v.mo13845e(viewM13823b);
            } else {
                iMo13853m = c2778c.f11014f ? r9.f11000v.mo13853m() : (c2781f.f11035e * r9.f11002x) + r9.f11000v.mo13853m();
                iMo13845e2 = r9.f11000v.mo13845e(viewM13823b) + iMo13853m;
            }
            int i9 = iMo13845e2;
            int i10 = iMo13853m;
            if (r9.f11001w == 1) {
                r9.m13384E0(viewM13823b, i10, iMo13845e, i9, iM13581t2);
                r7 = this;
            } else {
                r9.m13384E0(viewM13823b, iMo13845e, i10, iM13581t2, i9);
                r7 = r9;
            }
            if (c2778c.f11014f) {
                r7.m13556P2(r7.f11003y.f11219e, i8);
            } else {
                r7.m13562V2(c2781f, r7.f11003y.f11219e, i8);
            }
            r7.m13550F2(c2772w, r7.f11003y);
            if (r7.f11003y.f11222h && viewM13823b.hasFocusable()) {
                if (c2778c.f11014f) {
                    r7.f10982B.clear();
                } else {
                    r7.f10982B.set(c2781f.f11035e, false);
                }
            }
            z7 = true;
            r8 = 0;
            r9 = r7;
        }
        if (!z7) {
            r9.m13550F2(c2772w, r9.f11003y);
        }
        if (r9.f11003y.f11219e == -1) {
            iM13578q2 = r9.f10999u.mo13853m() - r9.m13581t2(r9.f10999u.mo13853m());
        } else {
            iM13578q2 = r9.m13578q2(r9.f10999u.mo13849i()) - r9.f10999u.mo13849i();
        }
        if (iM13578q2 > 0) {
            return Math.min(c2790i.f11216b, iM13578q2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: h2 */
    private int m13574h2(int i7) {
        int iM13407P = m13407P();
        for (int i8 = 0; i8 < iM13407P; i8++) {
            int iM13445m0 = m13445m0(m13405O(i8));
            if (iM13445m0 >= 0 && iM13445m0 < i7) {
                return iM13445m0;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: l2 */
    private int m13575l2(int i7) {
        for (int iM13407P = m13407P() - 1; iM13407P >= 0; iM13407P--) {
            int iM13445m0 = m13445m0(m13405O(iM13407P));
            if (iM13445m0 >= 0 && iM13445m0 < i7) {
                return iM13445m0;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: m2 */
    private void m13576m2(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b, boolean z7) {
        int iMo13849i;
        int iM13578q2 = m13578q2(Integer.MIN_VALUE);
        if (iM13578q2 != Integer.MIN_VALUE && (iMo13849i = this.f10999u.mo13849i() - iM13578q2) > 0) {
            int i7 = iMo13849i - (-m13586K2(-iMo13849i, c2772w, c2746b));
            if (!z7 || i7 <= 0) {
                return;
            }
            this.f10999u.mo13858r(i7);
        }
    }

    /* JADX INFO: renamed from: n2 */
    private void m13577n2(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b, boolean z7) {
        int iMo13853m;
        int iM13581t2 = m13581t2(C3553a.e.API_PRIORITY_OTHER);
        if (iM13581t2 != Integer.MAX_VALUE && (iMo13853m = iM13581t2 - this.f10999u.mo13853m()) > 0) {
            int iM13586K2 = iMo13853m - m13586K2(iMo13853m, c2772w, c2746b);
            if (!z7 || iM13586K2 <= 0) {
                return;
            }
            this.f10999u.mo13858r(-iM13586K2);
        }
    }

    /* JADX INFO: renamed from: q2 */
    private int m13578q2(int i7) {
        int iM13642l = this.f10998t[0].m13642l(i7);
        for (int i8 = 1; i8 < this.f10997s; i8++) {
            int iM13642l2 = this.f10998t[i8].m13642l(i7);
            if (iM13642l2 > iM13642l) {
                iM13642l = iM13642l2;
            }
        }
        return iM13642l;
    }

    /* JADX INFO: renamed from: r2 */
    private int m13579r2(int i7) {
        int iM13646p = this.f10998t[0].m13646p(i7);
        for (int i8 = 1; i8 < this.f10997s; i8++) {
            int iM13646p2 = this.f10998t[i8].m13646p(i7);
            if (iM13646p2 > iM13646p) {
                iM13646p = iM13646p2;
            }
        }
        return iM13646p;
    }

    /* JADX INFO: renamed from: s2 */
    private int m13580s2(int i7) {
        int iM13642l = this.f10998t[0].m13642l(i7);
        for (int i8 = 1; i8 < this.f10997s; i8++) {
            int iM13642l2 = this.f10998t[i8].m13642l(i7);
            if (iM13642l2 < iM13642l) {
                iM13642l = iM13642l2;
            }
        }
        return iM13642l;
    }

    /* JADX INFO: renamed from: t2 */
    private int m13581t2(int i7) {
        int iM13646p = this.f10998t[0].m13646p(i7);
        for (int i8 = 1; i8 < this.f10997s; i8++) {
            int iM13646p2 = this.f10998t[i8].m13646p(i7);
            if (iM13646p2 < iM13646p) {
                iM13646p = iM13646p2;
            }
        }
        return iM13646p;
    }

    /* JADX INFO: renamed from: u2 */
    private C2781f m13582u2(C2790i c2790i) {
        int i7;
        int i8;
        int i9;
        if (m13548C2(c2790i.f11219e)) {
            i8 = this.f10997s - 1;
            i7 = -1;
            i9 = -1;
        } else {
            i7 = this.f10997s;
            i8 = 0;
            i9 = 1;
        }
        C2781f c2781f = null;
        if (c2790i.f11219e == 1) {
            int iMo13853m = this.f10999u.mo13853m();
            int i10 = C3553a.e.API_PRIORITY_OTHER;
            while (i8 != i7) {
                C2781f c2781f2 = this.f10998t[i8];
                int iM13642l = c2781f2.m13642l(iMo13853m);
                if (iM13642l < i10) {
                    c2781f = c2781f2;
                    i10 = iM13642l;
                }
                i8 += i9;
            }
            return c2781f;
        }
        int iMo13849i = this.f10999u.mo13849i();
        int i11 = Integer.MIN_VALUE;
        while (i8 != i7) {
            C2781f c2781f3 = this.f10998t[i8];
            int iM13646p = c2781f3.m13646p(iMo13849i);
            if (iM13646p > i11) {
                c2781f = c2781f3;
                i11 = iM13646p;
            }
            i8 += i9;
        }
        return c2781f;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: v2 */
    private void m13583v2(int i7, int i8, int i9) {
        int i10;
        int i11;
        int iM13600p2;
        int iM13600p3 = this.f10981A ? m13600p2() : m13599o2();
        if (i9 == 8) {
            if (i7 < i8) {
                i10 = i8 + 1;
            } else {
                i10 = i7 + 1;
                i11 = i8;
            }
            this.f10985E.m13619h(i11);
            if (i9 != 1) {
                this.f10985E.m13620j(i7, i8);
            } else if (i9 != 2) {
                this.f10985E.m13621k(i7, i8);
            } else if (i9 == 8) {
                this.f10985E.m13621k(i7, 1);
                this.f10985E.m13620j(i8, 1);
            }
            if (i10 <= iM13600p3) {
                return;
            }
            if (this.f10981A) {
                iM13600p2 = m13599o2();
            } else {
                iM13600p2 = m13600p2();
            }
            if (i11 <= iM13600p2) {
                m13469y1();
            }
        }
        i10 = i7 + i8;
        i11 = i7;
        this.f10985E.m13619h(i11);
        if (i9 != 1) {
            this.f10985E.m13620j(i7, i8);
        } else if (i9 != 2) {
            this.f10985E.m13621k(i7, i8);
        } else if (i9 == 8) {
            this.f10985E.m13621k(i7, 1);
            this.f10985E.m13620j(i8, 1);
        }
        if (i10 <= iM13600p3) {
            return;
        }
        if (this.f10981A) {
            iM13600p2 = m13599o2();
        } else {
            iM13600p2 = m13600p2();
        }
        if (i11 <= iM13600p2) {
            m13469y1();
        }
    }

    /* JADX INFO: renamed from: z2 */
    private void m13584z2(View view, int i7, int i8, boolean z7) {
        m13452p(view, this.f10991K);
        C2778c c2778c = (C2778c) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) c2778c).leftMargin;
        Rect rect = this.f10991K;
        int iM13564W2 = m13564W2(i7, i9 + rect.left, ((ViewGroup.MarginLayoutParams) c2778c).rightMargin + rect.right);
        int i10 = ((ViewGroup.MarginLayoutParams) c2778c).topMargin;
        Rect rect2 = this.f10991K;
        int iM13564W3 = m13564W2(i8, i10 + rect2.top, ((ViewGroup.MarginLayoutParams) c2778c).bottomMargin + rect2.bottom);
        if (z7 ? m13403M1(view, iM13564W2, iM13564W3, c2778c) : m13399K1(view, iM13564W2, iM13564W3, c2778c)) {
            view.measure(iM13564W2, iM13564W3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: A */
    public int mo12965A(RecyclerView.C2746B c2746b) {
        return m13567a2(c2746b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: B */
    public int mo12966B(RecyclerView.C2746B c2746b) {
        return m13568b2(c2746b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: B1 */
    public int mo12967B1(int i7, RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b) {
        return m13586K2(i7, c2772w, c2746b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: C1 */
    public void mo13033C1(int i7) {
        C2780e c2780e = this.f10989I;
        if (c2780e != null && c2780e.f11021a != i7) {
            c2780e.m13627a();
        }
        this.f10983C = i7;
        this.f10984D = Integer.MIN_VALUE;
        m13469y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: D1 */
    public int mo12968D1(int i7, RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b) {
        return m13586K2(i7, c2772w, c2746b);
    }

    /* JADX INFO: renamed from: D2 */
    void m13585D2(int i7, RecyclerView.C2746B c2746b) {
        int iM13599o2;
        int i8;
        if (i7 > 0) {
            iM13599o2 = m13600p2();
            i8 = 1;
        } else {
            iM13599o2 = m13599o2();
            i8 = -1;
        }
        this.f11003y.f11215a = true;
        m13560T2(iM13599o2, c2746b);
        m13555L2(i8);
        C2790i c2790i = this.f11003y;
        c2790i.f11217c = iM13599o2 + c2790i.f11218d;
        c2790i.f11216b = Math.abs(i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: H0 */
    public void mo13393H0(int i7) {
        super.mo13393H0(i7);
        for (int i8 = 0; i8 < this.f10997s; i8++) {
            this.f10998t[i8].m13648r(i7);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: H1 */
    public void mo12970H1(Rect rect, int i7, int i8) {
        int iM13377t;
        int iM13377t2;
        int iM13438j0 = m13438j0() + m13441k0();
        int iM13443l0 = m13443l0() + m13436i0();
        if (this.f11001w == 1) {
            iM13377t2 = RecyclerView.AbstractC2765p.m13377t(i8, rect.height() + iM13443l0, m13431g0());
            iM13377t = RecyclerView.AbstractC2765p.m13377t(i7, (this.f11002x * this.f10997s) + iM13438j0, m13434h0());
        } else {
            iM13377t = RecyclerView.AbstractC2765p.m13377t(i7, rect.width() + iM13438j0, m13434h0());
            iM13377t2 = RecyclerView.AbstractC2765p.m13377t(i8, (this.f11002x * this.f10997s) + iM13443l0, m13431g0());
        }
        m13391G1(iM13377t, iM13377t2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: I0 */
    public void mo13394I0(int i7) {
        super.mo13394I0(i7);
        for (int i8 = 0; i8 < this.f10997s; i8++) {
            this.f10998t[i8].m13648r(i7);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: J */
    public RecyclerView.C2766q mo12971J() {
        return this.f11001w == 0 ? new C2778c(-2, -1) : new C2778c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: J0 */
    public void mo13396J0(RecyclerView.AbstractC2757h abstractC2757h, RecyclerView.AbstractC2757h abstractC2757h2) {
        this.f10985E.m13613b();
        for (int i7 = 0; i7 < this.f10997s; i7++) {
            this.f10998t[i7].m13635e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: K */
    public RecyclerView.C2766q mo12972K(Context context, AttributeSet attributeSet) {
        return new C2778c(context, attributeSet);
    }

    /* JADX INFO: renamed from: K2 */
    int m13586K2(int i7, RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b) {
        if (m13407P() == 0 || i7 == 0) {
            return 0;
        }
        m13585D2(i7, c2746b);
        int iM13573g2 = m13573g2(c2772w, this.f11003y, c2746b);
        if (this.f11003y.f11216b >= iM13573g2) {
            i7 = i7 < 0 ? -iM13573g2 : iM13573g2;
        }
        this.f10999u.mo13858r(-i7);
        this.f10987G = this.f10981A;
        C2790i c2790i = this.f11003y;
        c2790i.f11216b = 0;
        m13550F2(c2772w, c2790i);
        return i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: L */
    public RecyclerView.C2766q mo12973L(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2778c((ViewGroup.MarginLayoutParams) layoutParams) : new C2778c(layoutParams);
    }

    /* JADX INFO: renamed from: M2 */
    public void m13587M2(int i7) {
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo13058m(null);
        if (i7 == this.f11001w) {
            return;
        }
        this.f11001w = i7;
        AbstractC2793l abstractC2793l = this.f10999u;
        this.f10999u = this.f11000v;
        this.f11000v = abstractC2793l;
        m13469y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: N0 */
    public void mo13040N0(RecyclerView recyclerView, RecyclerView.C2772w c2772w) {
        super.mo13040N0(recyclerView, c2772w);
        m13461t1(this.f10996P);
        for (int i7 = 0; i7 < this.f10997s; i7++) {
            this.f10998t[i7].m13635e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: N1 */
    public void mo13041N1(RecyclerView recyclerView, RecyclerView.C2746B c2746b, int i7) {
        C2791j c2791j = new C2791j(recyclerView.getContext());
        c2791j.m13230p(i7);
        m13406O1(c2791j);
    }

    /* JADX INFO: renamed from: N2 */
    public void m13588N2(boolean z7) {
        mo13058m(null);
        C2780e c2780e = this.f10989I;
        if (c2780e != null && c2780e.f11028s != z7) {
            c2780e.f11028s = z7;
        }
        this.f11004z = z7;
        m13469y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: O0 */
    public View mo12974O0(View view, int i7, RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b) {
        View viewM13392H;
        View viewM13643m;
        if (m13407P() == 0 || (viewM13392H = m13392H(view)) == null) {
            return null;
        }
        m13554J2();
        int iM13569c2 = m13569c2(i7);
        if (iM13569c2 == Integer.MIN_VALUE) {
            return null;
        }
        C2778c c2778c = (C2778c) viewM13392H.getLayoutParams();
        boolean z7 = c2778c.f11014f;
        C2781f c2781f = c2778c.f11013e;
        int iM13600p2 = iM13569c2 == 1 ? m13600p2() : m13599o2();
        m13560T2(iM13600p2, c2746b);
        m13555L2(iM13569c2);
        C2790i c2790i = this.f11003y;
        c2790i.f11217c = c2790i.f11218d + iM13600p2;
        c2790i.f11216b = (int) (this.f10999u.mo13854n() * 0.33333334f);
        C2790i c2790i2 = this.f11003y;
        c2790i2.f11222h = true;
        c2790i2.f11215a = false;
        m13573g2(c2772w, c2790i2, c2746b);
        this.f10987G = this.f10981A;
        if (!z7 && (viewM13643m = c2781f.m13643m(iM13600p2, iM13569c2)) != null && viewM13643m != viewM13392H) {
            return viewM13643m;
        }
        if (m13548C2(iM13569c2)) {
            for (int i8 = this.f10997s - 1; i8 >= 0; i8--) {
                View viewM13643m2 = this.f10998t[i8].m13643m(iM13600p2, iM13569c2);
                if (viewM13643m2 != null && viewM13643m2 != viewM13392H) {
                    return viewM13643m2;
                }
            }
        } else {
            for (int i9 = 0; i9 < this.f10997s; i9++) {
                View viewM13643m3 = this.f10998t[i9].m13643m(iM13600p2, iM13569c2);
                if (viewM13643m3 != null && viewM13643m3 != viewM13392H) {
                    return viewM13643m3;
                }
            }
        }
        boolean z8 = (this.f11004z ^ true) == (iM13569c2 == -1);
        if (!z7) {
            View viewMo13038I = mo13038I(z8 ? c2781f.m13636f() : c2781f.m13637g());
            if (viewMo13038I != null && viewMo13038I != viewM13392H) {
                return viewMo13038I;
            }
        }
        if (m13548C2(iM13569c2)) {
            for (int i10 = this.f10997s - 1; i10 >= 0; i10--) {
                if (i10 != c2781f.f11035e) {
                    View viewMo13038I2 = mo13038I(z8 ? this.f10998t[i10].m13636f() : this.f10998t[i10].m13637g());
                    if (viewMo13038I2 != null && viewMo13038I2 != viewM13392H) {
                        return viewMo13038I2;
                    }
                }
            }
        } else {
            for (int i11 = 0; i11 < this.f10997s; i11++) {
                View viewMo13038I3 = mo13038I(z8 ? this.f10998t[i11].m13636f() : this.f10998t[i11].m13637g());
                if (viewMo13038I3 != null && viewMo13038I3 != viewM13392H) {
                    return viewMo13038I3;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: O2 */
    public void m13589O2(int i7) {
        mo13058m(null);
        if (i7 != this.f10997s) {
            m13602x2();
            this.f10997s = i7;
            this.f10982B = new BitSet(this.f10997s);
            this.f10998t = new C2781f[this.f10997s];
            for (int i8 = 0; i8 < this.f10997s; i8++) {
                this.f10998t[i8] = new C2781f(i8);
            }
            m13469y1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: P0 */
    public void mo13042P0(AccessibilityEvent accessibilityEvent) {
        super.mo13042P0(accessibilityEvent);
        if (m13407P() > 0) {
            View viewM13597j2 = m13597j2(false);
            View viewM13596i2 = m13596i2(false);
            if (viewM13597j2 == null || viewM13596i2 == null) {
                return;
            }
            int iM13445m0 = m13445m0(viewM13597j2);
            int iM13445m1 = m13445m0(viewM13596i2);
            if (iM13445m0 < iM13445m1) {
                accessibilityEvent.setFromIndex(iM13445m0);
                accessibilityEvent.setToIndex(iM13445m1);
            } else {
                accessibilityEvent.setFromIndex(iM13445m1);
                accessibilityEvent.setToIndex(iM13445m0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: Q1 */
    public boolean mo12975Q1() {
        return this.f10989I == null;
    }

    /* JADX INFO: renamed from: R2 */
    boolean m13590R2(RecyclerView.C2746B c2746b, C2777b c2777b) {
        int i7;
        if (!c2746b.m13242e() && (i7 = this.f10983C) != -1) {
            if (i7 >= 0 && i7 < c2746b.m13239b()) {
                C2780e c2780e = this.f10989I;
                if (c2780e == null || c2780e.f11021a == -1 || c2780e.f11023c < 1) {
                    View viewMo13038I = mo13038I(this.f10983C);
                    if (viewMo13038I != null) {
                        c2777b.f11006a = this.f10981A ? m13600p2() : m13599o2();
                        if (this.f10984D != Integer.MIN_VALUE) {
                            if (c2777b.f11008c) {
                                c2777b.f11007b = (this.f10999u.mo13849i() - this.f10984D) - this.f10999u.mo13844d(viewMo13038I);
                            } else {
                                c2777b.f11007b = (this.f10999u.mo13853m() + this.f10984D) - this.f10999u.mo13847g(viewMo13038I);
                            }
                            return true;
                        }
                        if (this.f10999u.mo13845e(viewMo13038I) > this.f10999u.mo13854n()) {
                            c2777b.f11007b = c2777b.f11008c ? this.f10999u.mo13849i() : this.f10999u.mo13853m();
                            return true;
                        }
                        int iMo13847g = this.f10999u.mo13847g(viewMo13038I) - this.f10999u.mo13853m();
                        if (iMo13847g < 0) {
                            c2777b.f11007b = -iMo13847g;
                            return true;
                        }
                        int iMo13849i = this.f10999u.mo13849i() - this.f10999u.mo13844d(viewMo13038I);
                        if (iMo13849i < 0) {
                            c2777b.f11007b = iMo13849i;
                            return true;
                        }
                        c2777b.f11007b = Integer.MIN_VALUE;
                    } else {
                        int i8 = this.f10983C;
                        c2777b.f11006a = i8;
                        int i9 = this.f10984D;
                        if (i9 == Integer.MIN_VALUE) {
                            c2777b.f11008c = m13563W1(i8) == 1;
                            c2777b.m13604a();
                        } else {
                            c2777b.m13605b(i9);
                        }
                        c2777b.f11009d = true;
                    }
                } else {
                    c2777b.f11007b = Integer.MIN_VALUE;
                    c2777b.f11006a = this.f10983C;
                }
                return true;
            }
            this.f10983C = -1;
            this.f10984D = Integer.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: S2 */
    void m13591S2(RecyclerView.C2746B c2746b, C2777b c2777b) {
        if (m13590R2(c2746b, c2777b) || m13557Q2(c2746b, c2777b)) {
            return;
        }
        c2777b.m13604a();
        c2777b.f11006a = 0;
    }

    /* JADX INFO: renamed from: T1 */
    boolean m13592T1() {
        int iM13642l = this.f10998t[0].m13642l(Integer.MIN_VALUE);
        for (int i7 = 1; i7 < this.f10997s; i7++) {
            if (this.f10998t[i7].m13642l(Integer.MIN_VALUE) != iM13642l) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: U1 */
    boolean m13593U1() {
        int iM13646p = this.f10998t[0].m13646p(Integer.MIN_VALUE);
        for (int i7 = 1; i7 < this.f10997s; i7++) {
            if (this.f10998t[i7].m13646p(Integer.MIN_VALUE) != iM13646p) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: U2 */
    void m13594U2(int i7) {
        this.f11002x = i7 / this.f10997s;
        this.f10990J = View.MeasureSpec.makeMeasureSpec(i7, this.f11000v.mo13851k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: W0 */
    public void mo12979W0(RecyclerView recyclerView, int i7, int i8) {
        m13583v2(i7, i8, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: X0 */
    public void mo12980X0(RecyclerView recyclerView) {
        this.f10985E.m13613b();
        m13469y1();
    }

    /* JADX INFO: renamed from: X1 */
    boolean m13595X1() {
        int iM13599o2;
        int iM13600p2;
        if (m13407P() == 0 || this.f10986F == 0 || !m13466w0()) {
            return false;
        }
        if (this.f10981A) {
            iM13599o2 = m13600p2();
            iM13600p2 = m13599o2();
        } else {
            iM13599o2 = m13599o2();
            iM13600p2 = m13600p2();
        }
        if (iM13599o2 == 0 && m13601w2() != null) {
            this.f10985E.m13613b();
            m13471z1();
            m13469y1();
            return true;
        }
        if (!this.f10993M) {
            return false;
        }
        int i7 = this.f10981A ? -1 : 1;
        int i8 = iM13600p2 + 1;
        C2779d.a aVarM13616e = this.f10985E.m13616e(iM13599o2, i8, i7, true);
        if (aVarM13616e == null) {
            this.f10993M = false;
            this.f10985E.m13615d(i8);
            return false;
        }
        C2779d.a aVarM13616e2 = this.f10985E.m13616e(iM13599o2, aVarM13616e.f11017a, i7 * (-1), true);
        if (aVarM13616e2 == null) {
            this.f10985E.m13615d(aVarM13616e.f11017a);
        } else {
            this.f10985E.m13615d(aVarM13616e2.f11017a + 1);
        }
        m13471z1();
        m13469y1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: Y0 */
    public void mo12981Y0(RecyclerView recyclerView, int i7, int i8, int i9) {
        m13583v2(i7, i8, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: Z0 */
    public void mo12983Z0(RecyclerView recyclerView, int i7, int i8) {
        m13583v2(i7, i8, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: b1 */
    public void mo12985b1(RecyclerView recyclerView, int i7, int i8, Object obj) {
        m13583v2(i7, i8, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2745A.b
    /* JADX INFO: renamed from: c */
    public PointF mo13049c(int i7) {
        int iM13563W1 = m13563W1(i7);
        PointF pointF = new PointF();
        if (iM13563W1 == 0) {
            return null;
        }
        if (this.f11001w == 0) {
            pointF.x = iM13563W1;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iM13563W1;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: c1 */
    public void mo12986c1(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b) {
        m13547B2(c2772w, c2746b, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: d1 */
    public void mo12987d1(RecyclerView.C2746B c2746b) {
        super.mo12987d1(c2746b);
        this.f10983C = -1;
        this.f10984D = Integer.MIN_VALUE;
        this.f10989I = null;
        this.f10992L.m13606c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: h1 */
    public void mo13055h1(Parcelable parcelable) {
        if (parcelable instanceof C2780e) {
            C2780e c2780e = (C2780e) parcelable;
            this.f10989I = c2780e;
            if (this.f10983C != -1) {
                c2780e.m13627a();
                this.f10989I.m13628b();
            }
            m13469y1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: i1 */
    public Parcelable mo13057i1() {
        int iM13646p;
        int iMo13853m;
        int[] iArr;
        if (this.f10989I != null) {
            return new C2780e(this.f10989I);
        }
        C2780e c2780e = new C2780e();
        c2780e.f11028s = this.f11004z;
        c2780e.f11029t = this.f10987G;
        c2780e.f11030u = this.f10988H;
        C2779d c2779d = this.f10985E;
        if (c2779d == null || (iArr = c2779d.f11015a) == null) {
            c2780e.f11025e = 0;
        } else {
            c2780e.f11026f = iArr;
            c2780e.f11025e = iArr.length;
            c2780e.f11027r = c2779d.f11016b;
        }
        if (m13407P() <= 0) {
            c2780e.f11021a = -1;
            c2780e.f11022b = -1;
            c2780e.f11023c = 0;
            return c2780e;
        }
        c2780e.f11021a = this.f10987G ? m13600p2() : m13599o2();
        c2780e.f11022b = m13598k2();
        int i7 = this.f10997s;
        c2780e.f11023c = i7;
        c2780e.f11024d = new int[i7];
        for (int i8 = 0; i8 < this.f10997s; i8++) {
            if (this.f10987G) {
                iM13646p = this.f10998t[i8].m13642l(Integer.MIN_VALUE);
                if (iM13646p != Integer.MIN_VALUE) {
                    iMo13853m = this.f10999u.mo13849i();
                    iM13646p -= iMo13853m;
                }
            } else {
                iM13646p = this.f10998t[i8].m13646p(Integer.MIN_VALUE);
                if (iM13646p != Integer.MIN_VALUE) {
                    iMo13853m = this.f10999u.mo13853m();
                    iM13646p -= iMo13853m;
                }
            }
            c2780e.f11024d[i8] = iM13646p;
        }
        return c2780e;
    }

    /* JADX INFO: renamed from: i2 */
    View m13596i2(boolean z7) {
        int iMo13853m = this.f10999u.mo13853m();
        int iMo13849i = this.f10999u.mo13849i();
        View view = null;
        for (int iM13407P = m13407P() - 1; iM13407P >= 0; iM13407P--) {
            View viewM13405O = m13405O(iM13407P);
            int iMo13847g = this.f10999u.mo13847g(viewM13405O);
            int iMo13844d = this.f10999u.mo13844d(viewM13405O);
            if (iMo13844d > iMo13853m && iMo13847g < iMo13849i) {
                if (iMo13844d <= iMo13849i || !z7) {
                    return viewM13405O;
                }
                if (view == null) {
                    view = viewM13405O;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: j1 */
    public void mo13439j1(int i7) {
        if (i7 == 0) {
            m13595X1();
        }
    }

    /* JADX INFO: renamed from: j2 */
    View m13597j2(boolean z7) {
        int iMo13853m = this.f10999u.mo13853m();
        int iMo13849i = this.f10999u.mo13849i();
        int iM13407P = m13407P();
        View view = null;
        for (int i7 = 0; i7 < iM13407P; i7++) {
            View viewM13405O = m13405O(i7);
            int iMo13847g = this.f10999u.mo13847g(viewM13405O);
            if (this.f10999u.mo13844d(viewM13405O) > iMo13853m && iMo13847g < iMo13849i) {
                if (iMo13847g >= iMo13853m || !z7) {
                    return viewM13405O;
                }
                if (view == null) {
                    view = viewM13405O;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: k2 */
    int m13598k2() {
        View viewM13596i2 = this.f10981A ? m13596i2(true) : m13597j2(true);
        if (viewM13596i2 == null) {
            return -1;
        }
        return m13445m0(viewM13596i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: m */
    public void mo13058m(String str) {
        if (this.f10989I == null) {
            super.mo13058m(str);
        }
    }

    /* JADX INFO: renamed from: o2 */
    int m13599o2() {
        if (m13407P() == 0) {
            return 0;
        }
        return m13445m0(m13405O(0));
    }

    /* JADX INFO: renamed from: p2 */
    int m13600p2() {
        int iM13407P = m13407P();
        if (iM13407P == 0) {
            return 0;
        }
        return m13445m0(m13405O(iM13407P - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: q */
    public boolean mo13060q() {
        return this.f11001w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: r */
    public boolean mo13062r() {
        return this.f11001w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: s */
    public boolean mo12992s(RecyclerView.C2766q c2766q) {
        return c2766q instanceof C2778c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: u */
    public void mo13065u(int i7, int i8, RecyclerView.C2746B c2746b, RecyclerView.AbstractC2765p.c cVar) {
        int iM13642l;
        int iM13646p;
        if (this.f11001w != 0) {
            i7 = i8;
        }
        if (m13407P() == 0 || i7 == 0) {
            return;
        }
        m13585D2(i7, c2746b);
        int[] iArr = this.f10995O;
        if (iArr == null || iArr.length < this.f10997s) {
            this.f10995O = new int[this.f10997s];
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f10997s; i10++) {
            C2790i c2790i = this.f11003y;
            if (c2790i.f11218d == -1) {
                iM13642l = c2790i.f11220f;
                iM13646p = this.f10998t[i10].m13646p(iM13642l);
            } else {
                iM13642l = this.f10998t[i10].m13642l(c2790i.f11221g);
                iM13646p = this.f11003y.f11221g;
            }
            int i11 = iM13642l - iM13646p;
            if (i11 >= 0) {
                this.f10995O[i9] = i11;
                i9++;
            }
        }
        Arrays.sort(this.f10995O, 0, i9);
        for (int i12 = 0; i12 < i9 && this.f11003y.m13822a(c2746b); i12++) {
            cVar.mo13477a(this.f11003y.f11217c, this.f10995O[i12]);
            C2790i c2790i2 = this.f11003y;
            c2790i2.f11217c += c2790i2.f11218d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: w */
    public int mo13067w(RecyclerView.C2746B c2746b) {
        return m13566Z1(c2746b);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: w2 */
    View m13601w2() {
        int i7;
        View viewM13405O;
        int iMo13847g;
        int iMo13847g2;
        boolean z7;
        boolean z8;
        int iMo13844d;
        int iMo13844d2;
        int iM13407P = m13407P();
        int i8 = iM13407P - 1;
        BitSet bitSet = new BitSet(this.f10997s);
        bitSet.set(0, this.f10997s, true);
        byte b7 = (this.f11001w == 1 && m13603y2()) ? (byte) 1 : (byte) -1;
        if (this.f10981A) {
            iM13407P = -1;
        } else {
            i8 = 0;
        }
        int i9 = i8 < iM13407P ? 1 : -1;
        while (i8 != iM13407P) {
            View viewM13405O2 = m13405O(i8);
            C2778c c2778c = (C2778c) viewM13405O2.getLayoutParams();
            if (!bitSet.get(c2778c.f11013e.f11035e)) {
                if (!c2778c.f11014f && (i7 = i8 + i9) != iM13407P) {
                    viewM13405O = m13405O(i7);
                    if (this.f10981A) {
                        iMo13844d = this.f10999u.mo13844d(viewM13405O2);
                        iMo13844d2 = this.f10999u.mo13844d(viewM13405O);
                        if (iMo13844d >= iMo13844d2) {
                            if (iMo13844d == iMo13844d2) {
                                if (c2778c.f11013e.f11035e - ((C2778c) viewM13405O.getLayoutParams()).f11013e.f11035e < 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (b7 < 0) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (z7 != z8) {
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        iMo13847g = this.f10999u.mo13847g(viewM13405O2);
                        iMo13847g2 = this.f10999u.mo13847g(viewM13405O);
                        if (iMo13847g <= iMo13847g2) {
                            if (iMo13847g == iMo13847g2) {
                                if (c2778c.f11013e.f11035e - ((C2778c) viewM13405O.getLayoutParams()).f11013e.f11035e < 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (b7 < 0) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (z7 != z8) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i8 += i9;
            } else if (!m13565Y1(c2778c.f11013e)) {
                bitSet.clear(c2778c.f11013e.f11035e);
                if (!c2778c.f11014f) {
                    viewM13405O = m13405O(i7);
                    if (this.f10981A) {
                        iMo13844d = this.f10999u.mo13844d(viewM13405O2);
                        iMo13844d2 = this.f10999u.mo13844d(viewM13405O);
                        if (iMo13844d >= iMo13844d2) {
                            if (iMo13844d == iMo13844d2) {
                                if (c2778c.f11013e.f11035e - ((C2778c) viewM13405O.getLayoutParams()).f11013e.f11035e < 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (b7 < 0) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (z7 != z8) {
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        iMo13847g = this.f10999u.mo13847g(viewM13405O2);
                        iMo13847g2 = this.f10999u.mo13847g(viewM13405O);
                        if (iMo13847g <= iMo13847g2) {
                            if (iMo13847g == iMo13847g2) {
                                if (c2778c.f11013e.f11035e - ((C2778c) viewM13405O.getLayoutParams()).f11013e.f11035e < 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (b7 < 0) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (z7 != z8) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i8 += i9;
            }
            return viewM13405O2;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: x */
    public int mo12995x(RecyclerView.C2746B c2746b) {
        return m13567a2(c2746b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: x0 */
    public boolean mo13068x0() {
        return this.f10986F != 0;
    }

    /* JADX INFO: renamed from: x2 */
    public void m13602x2() {
        this.f10985E.m13613b();
        m13469y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: y */
    public int mo12996y(RecyclerView.C2746B c2746b) {
        return m13568b2(c2746b);
    }

    /* JADX INFO: renamed from: y2 */
    boolean m13603y2() {
        return m13426e0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: z */
    public int mo13069z(RecyclerView.C2746B c2746b) {
        return m13566Z1(c2746b);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    static class C2779d {

        /* JADX INFO: renamed from: a */
        int[] f11015a;

        /* JADX INFO: renamed from: b */
        List f11016b;

        C2779d() {
        }

        /* JADX INFO: renamed from: i */
        private int m13609i(int i7) {
            if (this.f11016b == null) {
                return -1;
            }
            a aVarM13617f = m13617f(i7);
            if (aVarM13617f != null) {
                this.f11016b.remove(aVarM13617f);
            }
            int size = this.f11016b.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    i8 = -1;
                    break;
                }
                if (((a) this.f11016b.get(i8)).f11017a >= i7) {
                    break;
                }
                i8++;
            }
            if (i8 == -1) {
                return -1;
            }
            a aVar = (a) this.f11016b.get(i8);
            this.f11016b.remove(i8);
            return aVar.f11017a;
        }

        /* JADX INFO: renamed from: l */
        private void m13610l(int i7, int i8) {
            List list = this.f11016b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f11016b.get(size);
                int i9 = aVar.f11017a;
                if (i9 >= i7) {
                    aVar.f11017a = i9 + i8;
                }
            }
        }

        /* JADX INFO: renamed from: m */
        private void m13611m(int i7, int i8) {
            List list = this.f11016b;
            if (list == null) {
                return;
            }
            int i9 = i7 + i8;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f11016b.get(size);
                int i10 = aVar.f11017a;
                if (i10 >= i7) {
                    if (i10 < i9) {
                        this.f11016b.remove(size);
                    } else {
                        aVar.f11017a = i10 - i8;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m13612a(a aVar) {
            if (this.f11016b == null) {
                this.f11016b = new ArrayList();
            }
            int size = this.f11016b.size();
            for (int i7 = 0; i7 < size; i7++) {
                a aVar2 = (a) this.f11016b.get(i7);
                if (aVar2.f11017a == aVar.f11017a) {
                    this.f11016b.remove(i7);
                }
                if (aVar2.f11017a >= aVar.f11017a) {
                    this.f11016b.add(i7, aVar);
                    return;
                }
            }
            this.f11016b.add(aVar);
        }

        /* JADX INFO: renamed from: b */
        void m13613b() {
            int[] iArr = this.f11015a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f11016b = null;
        }

        /* JADX INFO: renamed from: c */
        void m13614c(int i7) {
            int[] iArr = this.f11015a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i7, 10) + 1];
                this.f11015a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i7 >= iArr.length) {
                int[] iArr3 = new int[m13623o(i7)];
                this.f11015a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f11015a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX INFO: renamed from: d */
        int m13615d(int i7) {
            List list = this.f11016b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.f11016b.get(size)).f11017a >= i7) {
                        this.f11016b.remove(size);
                    }
                }
            }
            return m13619h(i7);
        }

        /* JADX INFO: renamed from: e */
        public a m13616e(int i7, int i8, int i9, boolean z7) {
            List list = this.f11016b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar = (a) this.f11016b.get(i10);
                int i11 = aVar.f11017a;
                if (i11 >= i8) {
                    return null;
                }
                if (i11 >= i7 && (i9 == 0 || aVar.f11018b == i9 || (z7 && aVar.f11020d))) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: f */
        public a m13617f(int i7) {
            List list = this.f11016b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f11016b.get(size);
                if (aVar.f11017a == i7) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        int m13618g(int i7) {
            int[] iArr = this.f11015a;
            if (iArr == null || i7 >= iArr.length) {
                return -1;
            }
            return iArr[i7];
        }

        /* JADX INFO: renamed from: h */
        int m13619h(int i7) {
            int[] iArr = this.f11015a;
            if (iArr == null || i7 >= iArr.length) {
                return -1;
            }
            int iM13609i = m13609i(i7);
            if (iM13609i == -1) {
                int[] iArr2 = this.f11015a;
                Arrays.fill(iArr2, i7, iArr2.length, -1);
                return this.f11015a.length;
            }
            int iMin = Math.min(iM13609i + 1, this.f11015a.length);
            Arrays.fill(this.f11015a, i7, iMin, -1);
            return iMin;
        }

        /* JADX INFO: renamed from: j */
        void m13620j(int i7, int i8) {
            int[] iArr = this.f11015a;
            if (iArr == null || i7 >= iArr.length) {
                return;
            }
            int i9 = i7 + i8;
            m13614c(i9);
            int[] iArr2 = this.f11015a;
            System.arraycopy(iArr2, i7, iArr2, i9, (iArr2.length - i7) - i8);
            Arrays.fill(this.f11015a, i7, i9, -1);
            m13610l(i7, i8);
        }

        /* JADX INFO: renamed from: k */
        void m13621k(int i7, int i8) {
            int[] iArr = this.f11015a;
            if (iArr == null || i7 >= iArr.length) {
                return;
            }
            int i9 = i7 + i8;
            m13614c(i9);
            int[] iArr2 = this.f11015a;
            System.arraycopy(iArr2, i9, iArr2, i7, (iArr2.length - i7) - i8);
            int[] iArr3 = this.f11015a;
            Arrays.fill(iArr3, iArr3.length - i8, iArr3.length, -1);
            m13611m(i7, i8);
        }

        /* JADX INFO: renamed from: n */
        void m13622n(int i7, C2781f c2781f) {
            m13614c(i7);
            this.f11015a[i7] = c2781f.f11035e;
        }

        /* JADX INFO: renamed from: o */
        int m13623o(int i7) {
            int length = this.f11015a.length;
            while (length <= i7) {
                length *= 2;
            }
            return length;
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C7672a();

            /* JADX INFO: renamed from: a */
            int f11017a;

            /* JADX INFO: renamed from: b */
            int f11018b;

            /* JADX INFO: renamed from: c */
            int[] f11019c;

            /* JADX INFO: renamed from: d */
            boolean f11020d;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            class C7672a implements Parcelable.Creator {
                C7672a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i7) {
                    return new a[i7];
                }
            }

            a(Parcel parcel) {
                this.f11017a = parcel.readInt();
                this.f11018b = parcel.readInt();
                this.f11020d = parcel.readInt() == 1;
                int i7 = parcel.readInt();
                if (i7 > 0) {
                    int[] iArr = new int[i7];
                    this.f11019c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* JADX INFO: renamed from: a */
            int m13624a(int i7) {
                int[] iArr = this.f11019c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i7];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f11017a + ", mGapDir=" + this.f11018b + ", mHasUnwantedGapAfter=" + this.f11020d + ", mGapPerSpan=" + Arrays.toString(this.f11019c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i7) {
                parcel.writeInt(this.f11017a);
                parcel.writeInt(this.f11018b);
                parcel.writeInt(this.f11020d ? 1 : 0);
                int[] iArr = this.f11019c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f11019c);
                }
            }

            a() {
            }
        }
    }
}
