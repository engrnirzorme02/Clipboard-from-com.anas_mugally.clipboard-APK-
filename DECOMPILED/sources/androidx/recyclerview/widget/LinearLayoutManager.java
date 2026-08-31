package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.common.api.C3553a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC2765p implements C2787f.h, RecyclerView.AbstractC2745A.b {

    /* JADX INFO: renamed from: A */
    int f10728A;

    /* JADX INFO: renamed from: B */
    int f10729B;

    /* JADX INFO: renamed from: C */
    private boolean f10730C;

    /* JADX INFO: renamed from: D */
    C2744d f10731D;

    /* JADX INFO: renamed from: E */
    final C2741a f10732E;

    /* JADX INFO: renamed from: F */
    private final C2742b f10733F;

    /* JADX INFO: renamed from: G */
    private int f10734G;

    /* JADX INFO: renamed from: H */
    private int[] f10735H;

    /* JADX INFO: renamed from: s */
    int f10736s;

    /* JADX INFO: renamed from: t */
    private C2743c f10737t;

    /* JADX INFO: renamed from: u */
    AbstractC2793l f10738u;

    /* JADX INFO: renamed from: v */
    private boolean f10739v;

    /* JADX INFO: renamed from: w */
    private boolean f10740w;

    /* JADX INFO: renamed from: x */
    boolean f10741x;

    /* JADX INFO: renamed from: y */
    private boolean f10742y;

    /* JADX INFO: renamed from: z */
    private boolean f10743z;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    static class C2741a {

        /* JADX INFO: renamed from: a */
        AbstractC2793l f10744a;

        /* JADX INFO: renamed from: b */
        int f10745b;

        /* JADX INFO: renamed from: c */
        int f10746c;

        /* JADX INFO: renamed from: d */
        boolean f10747d;

        /* JADX INFO: renamed from: e */
        boolean f10748e;

        C2741a() {
            m13074e();
        }

        /* JADX INFO: renamed from: a */
        void m13070a() {
            this.f10746c = this.f10747d ? this.f10744a.mo13849i() : this.f10744a.mo13853m();
        }

        /* JADX INFO: renamed from: b */
        public void m13071b(View view, int i7) {
            if (this.f10747d) {
                this.f10746c = this.f10744a.mo13844d(view) + this.f10744a.m13855o();
            } else {
                this.f10746c = this.f10744a.mo13847g(view);
            }
            this.f10745b = i7;
        }

        /* JADX INFO: renamed from: c */
        public void m13072c(View view, int i7) {
            int iM13855o = this.f10744a.m13855o();
            if (iM13855o >= 0) {
                m13071b(view, i7);
                return;
            }
            this.f10745b = i7;
            if (this.f10747d) {
                int iMo13849i = (this.f10744a.mo13849i() - iM13855o) - this.f10744a.mo13844d(view);
                this.f10746c = this.f10744a.mo13849i() - iMo13849i;
                if (iMo13849i > 0) {
                    int iMo13845e = this.f10746c - this.f10744a.mo13845e(view);
                    int iMo13853m = this.f10744a.mo13853m();
                    int iMin = iMo13845e - (iMo13853m + Math.min(this.f10744a.mo13847g(view) - iMo13853m, 0));
                    if (iMin < 0) {
                        this.f10746c += Math.min(iMo13849i, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iMo13847g = this.f10744a.mo13847g(view);
            int iMo13853m2 = iMo13847g - this.f10744a.mo13853m();
            this.f10746c = iMo13847g;
            if (iMo13853m2 > 0) {
                int iMo13849i2 = (this.f10744a.mo13849i() - Math.min(0, (this.f10744a.mo13849i() - iM13855o) - this.f10744a.mo13844d(view))) - (iMo13847g + this.f10744a.mo13845e(view));
                if (iMo13849i2 < 0) {
                    this.f10746c -= Math.min(iMo13853m2, -iMo13849i2);
                }
            }
        }

        /* JADX INFO: renamed from: d */
        boolean m13073d(View view, RecyclerView.C2746B c2746b) {
            RecyclerView.C2766q c2766q = (RecyclerView.C2766q) view.getLayoutParams();
            return !c2766q.m13480c() && c2766q.m13478a() >= 0 && c2766q.m13478a() < c2746b.m13239b();
        }

        /* JADX INFO: renamed from: e */
        void m13074e() {
            this.f10745b = -1;
            this.f10746c = Integer.MIN_VALUE;
            this.f10747d = false;
            this.f10748e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f10745b + ", mCoordinate=" + this.f10746c + ", mLayoutFromEnd=" + this.f10747d + ", mValid=" + this.f10748e + '}';
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    protected static class C2742b {

        /* JADX INFO: renamed from: a */
        public int f10749a;

        /* JADX INFO: renamed from: b */
        public boolean f10750b;

        /* JADX INFO: renamed from: c */
        public boolean f10751c;

        /* JADX INFO: renamed from: d */
        public boolean f10752d;

        protected C2742b() {
        }

        /* JADX INFO: renamed from: a */
        void m13075a() {
            this.f10749a = 0;
            this.f10750b = false;
            this.f10751c = false;
            this.f10752d = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    static class C2743c {

        /* JADX INFO: renamed from: b */
        int f10754b;

        /* JADX INFO: renamed from: c */
        int f10755c;

        /* JADX INFO: renamed from: d */
        int f10756d;

        /* JADX INFO: renamed from: e */
        int f10757e;

        /* JADX INFO: renamed from: f */
        int f10758f;

        /* JADX INFO: renamed from: g */
        int f10759g;

        /* JADX INFO: renamed from: k */
        int f10763k;

        /* JADX INFO: renamed from: m */
        boolean f10765m;

        /* JADX INFO: renamed from: a */
        boolean f10753a = true;

        /* JADX INFO: renamed from: h */
        int f10760h = 0;

        /* JADX INFO: renamed from: i */
        int f10761i = 0;

        /* JADX INFO: renamed from: j */
        boolean f10762j = false;

        /* JADX INFO: renamed from: l */
        List f10764l = null;

        C2743c() {
        }

        /* JADX INFO: renamed from: e */
        private View m13076e() {
            int size = this.f10764l.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = ((RecyclerView.AbstractC2749E) this.f10764l.get(i7)).f10894a;
                RecyclerView.C2766q c2766q = (RecyclerView.C2766q) view.getLayoutParams();
                if (!c2766q.m13480c() && this.f10756d == c2766q.m13478a()) {
                    m13078b(view);
                    return view;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        public void m13077a() {
            m13078b(null);
        }

        /* JADX INFO: renamed from: b */
        public void m13078b(View view) {
            View viewM13081f = m13081f(view);
            if (viewM13081f == null) {
                this.f10756d = -1;
            } else {
                this.f10756d = ((RecyclerView.C2766q) viewM13081f.getLayoutParams()).m13478a();
            }
        }

        /* JADX INFO: renamed from: c */
        boolean m13079c(RecyclerView.C2746B c2746b) {
            int i7 = this.f10756d;
            return i7 >= 0 && i7 < c2746b.m13239b();
        }

        /* JADX INFO: renamed from: d */
        View m13080d(RecyclerView.C2772w c2772w) {
            if (this.f10764l != null) {
                return m13076e();
            }
            View viewM13531o = c2772w.m13531o(this.f10756d);
            this.f10756d += this.f10757e;
            return viewM13531o;
        }

        /* JADX INFO: renamed from: f */
        public View m13081f(View view) {
            int iM13478a;
            int size = this.f10764l.size();
            View view2 = null;
            int i7 = C3553a.e.API_PRIORITY_OTHER;
            for (int i8 = 0; i8 < size; i8++) {
                View view3 = ((RecyclerView.AbstractC2749E) this.f10764l.get(i8)).f10894a;
                RecyclerView.C2766q c2766q = (RecyclerView.C2766q) view3.getLayoutParams();
                if (view3 != view && !c2766q.m13480c() && (iM13478a = (c2766q.m13478a() - this.f10756d) * this.f10757e) >= 0 && iM13478a < i7) {
                    if (iM13478a == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i7 = iM13478a;
                }
            }
            return view2;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    public static class C2744d implements Parcelable {
        public static final Parcelable.Creator<C2744d> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        int f10766a;

        /* JADX INFO: renamed from: b */
        int f10767b;

        /* JADX INFO: renamed from: c */
        boolean f10768c;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C2744d createFromParcel(Parcel parcel) {
                return new C2744d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C2744d[] newArray(int i7) {
                return new C2744d[i7];
            }
        }

        public C2744d() {
        }

        /* JADX INFO: renamed from: a */
        boolean m13082a() {
            return this.f10766a >= 0;
        }

        /* JADX INFO: renamed from: b */
        void m13083b() {
            this.f10766a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f10766a);
            parcel.writeInt(this.f10767b);
            parcel.writeInt(this.f10768c ? 1 : 0);
        }

        C2744d(Parcel parcel) {
            this.f10766a = parcel.readInt();
            this.f10767b = parcel.readInt();
            this.f10768c = parcel.readInt() == 1;
        }

        public C2744d(C2744d c2744d) {
            this.f10766a = c2744d.f10766a;
            this.f10767b = c2744d.f10767b;
            this.f10768c = c2744d.f10768c;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    /* JADX INFO: renamed from: B2 */
    private void m13007B2() {
        if (this.f10736s == 1 || !m13063r2()) {
            this.f10741x = this.f10740w;
        } else {
            this.f10741x = !this.f10740w;
        }
    }

    /* JADX INFO: renamed from: H2 */
    private boolean m13008H2(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b, C2741a c2741a) {
        View viewMo12990k2;
        boolean z7 = false;
        if (m13407P() == 0) {
            return false;
        }
        View viewM13423b0 = m13423b0();
        if (viewM13423b0 != null && c2741a.m13073d(viewM13423b0, c2746b)) {
            c2741a.m13072c(viewM13423b0, m13445m0(viewM13423b0));
            return true;
        }
        boolean z8 = this.f10739v;
        boolean z9 = this.f10742y;
        if (z8 != z9 || (viewMo12990k2 = mo12990k2(c2772w, c2746b, c2741a.f10747d, z9)) == null) {
            return false;
        }
        c2741a.m13071b(viewMo12990k2, m13445m0(viewMo12990k2));
        if (!c2746b.m13242e() && mo12975Q1()) {
            int iMo13847g = this.f10738u.mo13847g(viewMo12990k2);
            int iMo13844d = this.f10738u.mo13844d(viewMo12990k2);
            int iMo13853m = this.f10738u.mo13853m();
            int iMo13849i = this.f10738u.mo13849i();
            boolean z10 = iMo13844d <= iMo13853m && iMo13847g < iMo13853m;
            if (iMo13847g >= iMo13849i && iMo13844d > iMo13849i) {
                z7 = true;
            }
            if (z10 || z7) {
                if (c2741a.f10747d) {
                    iMo13853m = iMo13849i;
                }
                c2741a.f10746c = iMo13853m;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: I2 */
    private boolean m13009I2(RecyclerView.C2746B c2746b, C2741a c2741a) {
        int i7;
        if (!c2746b.m13242e() && (i7 = this.f10728A) != -1) {
            if (i7 >= 0 && i7 < c2746b.m13239b()) {
                c2741a.f10745b = this.f10728A;
                C2744d c2744d = this.f10731D;
                if (c2744d != null && c2744d.m13082a()) {
                    boolean z7 = this.f10731D.f10768c;
                    c2741a.f10747d = z7;
                    if (z7) {
                        c2741a.f10746c = this.f10738u.mo13849i() - this.f10731D.f10767b;
                    } else {
                        c2741a.f10746c = this.f10738u.mo13853m() + this.f10731D.f10767b;
                    }
                    return true;
                }
                if (this.f10729B != Integer.MIN_VALUE) {
                    boolean z8 = this.f10741x;
                    c2741a.f10747d = z8;
                    if (z8) {
                        c2741a.f10746c = this.f10738u.mo13849i() - this.f10729B;
                    } else {
                        c2741a.f10746c = this.f10738u.mo13853m() + this.f10729B;
                    }
                    return true;
                }
                View viewMo13038I = mo13038I(this.f10728A);
                if (viewMo13038I == null) {
                    if (m13407P() > 0) {
                        c2741a.f10747d = (this.f10728A < m13445m0(m13405O(0))) == this.f10741x;
                    }
                    c2741a.m13070a();
                } else {
                    if (this.f10738u.mo13845e(viewMo13038I) > this.f10738u.mo13854n()) {
                        c2741a.m13070a();
                        return true;
                    }
                    if (this.f10738u.mo13847g(viewMo13038I) - this.f10738u.mo13853m() < 0) {
                        c2741a.f10746c = this.f10738u.mo13853m();
                        c2741a.f10747d = false;
                        return true;
                    }
                    if (this.f10738u.mo13849i() - this.f10738u.mo13844d(viewMo13038I) < 0) {
                        c2741a.f10746c = this.f10738u.mo13849i();
                        c2741a.f10747d = true;
                        return true;
                    }
                    c2741a.f10746c = c2741a.f10747d ? this.f10738u.mo13844d(viewMo13038I) + this.f10738u.m13855o() : this.f10738u.mo13847g(viewMo13038I);
                }
                return true;
            }
            this.f10728A = -1;
            this.f10729B = Integer.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: J2 */
    private void m13010J2(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b, C2741a c2741a) {
        if (m13009I2(c2746b, c2741a) || m13008H2(c2772w, c2746b, c2741a)) {
            return;
        }
        c2741a.m13070a();
        c2741a.f10745b = this.f10742y ? c2746b.m13239b() - 1 : 0;
    }

    /* JADX INFO: renamed from: K2 */
    private void m13011K2(int i7, int i8, boolean z7, RecyclerView.C2746B c2746b) {
        int iMo13853m;
        this.f10737t.f10765m = m13032A2();
        this.f10737t.f10758f = i7;
        int[] iArr = this.f10735H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo13043R1(c2746b, iArr);
        int iMax = Math.max(0, this.f10735H[0]);
        int iMax2 = Math.max(0, this.f10735H[1]);
        boolean z8 = i7 == 1;
        C2743c c2743c = this.f10737t;
        int i9 = z8 ? iMax2 : iMax;
        c2743c.f10760h = i9;
        if (!z8) {
            iMax = iMax2;
        }
        c2743c.f10761i = iMax;
        if (z8) {
            c2743c.f10760h = i9 + this.f10738u.mo13850j();
            View viewM13025n2 = m13025n2();
            C2743c c2743c2 = this.f10737t;
            c2743c2.f10757e = this.f10741x ? -1 : 1;
            int iM13445m0 = m13445m0(viewM13025n2);
            C2743c c2743c3 = this.f10737t;
            c2743c2.f10756d = iM13445m0 + c2743c3.f10757e;
            c2743c3.f10754b = this.f10738u.mo13844d(viewM13025n2);
            iMo13853m = this.f10738u.mo13844d(viewM13025n2) - this.f10738u.mo13849i();
        } else {
            View viewM13026o2 = m13026o2();
            this.f10737t.f10760h += this.f10738u.mo13853m();
            C2743c c2743c4 = this.f10737t;
            c2743c4.f10757e = this.f10741x ? 1 : -1;
            int iM13445m1 = m13445m0(viewM13026o2);
            C2743c c2743c5 = this.f10737t;
            c2743c4.f10756d = iM13445m1 + c2743c5.f10757e;
            c2743c5.f10754b = this.f10738u.mo13847g(viewM13026o2);
            iMo13853m = (-this.f10738u.mo13847g(viewM13026o2)) + this.f10738u.mo13853m();
        }
        C2743c c2743c6 = this.f10737t;
        c2743c6.f10755c = i8;
        if (z7) {
            c2743c6.f10755c = i8 - iMo13853m;
        }
        c2743c6.f10759g = iMo13853m;
    }

    /* JADX INFO: renamed from: L2 */
    private void m13012L2(int i7, int i8) {
        this.f10737t.f10755c = this.f10738u.mo13849i() - i8;
        C2743c c2743c = this.f10737t;
        c2743c.f10757e = this.f10741x ? -1 : 1;
        c2743c.f10756d = i7;
        c2743c.f10758f = 1;
        c2743c.f10754b = i8;
        c2743c.f10759g = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: M2 */
    private void m13013M2(C2741a c2741a) {
        m13012L2(c2741a.f10745b, c2741a.f10746c);
    }

    /* JADX INFO: renamed from: N2 */
    private void m13014N2(int i7, int i8) {
        this.f10737t.f10755c = i8 - this.f10738u.mo13853m();
        C2743c c2743c = this.f10737t;
        c2743c.f10756d = i7;
        c2743c.f10757e = this.f10741x ? 1 : -1;
        c2743c.f10758f = -1;
        c2743c.f10754b = i8;
        c2743c.f10759g = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: O2 */
    private void m13015O2(C2741a c2741a) {
        m13014N2(c2741a.f10745b, c2741a.f10746c);
    }

    /* JADX INFO: renamed from: T1 */
    private int m13016T1(RecyclerView.C2746B c2746b) {
        if (m13407P() == 0) {
            return 0;
        }
        m13046Y1();
        return AbstractC2796o.m13875a(c2746b, this.f10738u, m13050c2(!this.f10743z, true), m13048b2(!this.f10743z, true), this, this.f10743z);
    }

    /* JADX INFO: renamed from: U1 */
    private int m13017U1(RecyclerView.C2746B c2746b) {
        if (m13407P() == 0) {
            return 0;
        }
        m13046Y1();
        return AbstractC2796o.m13876b(c2746b, this.f10738u, m13050c2(!this.f10743z, true), m13048b2(!this.f10743z, true), this, this.f10743z, this.f10741x);
    }

    /* JADX INFO: renamed from: V1 */
    private int m13018V1(RecyclerView.C2746B c2746b) {
        if (m13407P() == 0) {
            return 0;
        }
        m13046Y1();
        return AbstractC2796o.m13877c(c2746b, this.f10738u, m13050c2(!this.f10743z, true), m13048b2(!this.f10743z, true), this, this.f10743z);
    }

    /* JADX INFO: renamed from: a2 */
    private View m13019a2() {
        return m13054g2(0, m13407P());
    }

    /* JADX INFO: renamed from: e2 */
    private View m13020e2() {
        return m13054g2(m13407P() - 1, -1);
    }

    /* JADX INFO: renamed from: i2 */
    private View m13021i2() {
        return this.f10741x ? m13019a2() : m13020e2();
    }

    /* JADX INFO: renamed from: j2 */
    private View m13022j2() {
        return this.f10741x ? m13020e2() : m13019a2();
    }

    /* JADX INFO: renamed from: l2 */
    private int m13023l2(int i7, RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b, boolean z7) {
        int iMo13849i;
        int iMo13849i2 = this.f10738u.mo13849i() - i7;
        if (iMo13849i2 <= 0) {
            return 0;
        }
        int i8 = -m13034C2(-iMo13849i2, c2772w, c2746b);
        int i9 = i7 + i8;
        if (!z7 || (iMo13849i = this.f10738u.mo13849i() - i9) <= 0) {
            return i8;
        }
        this.f10738u.mo13858r(iMo13849i);
        return iMo13849i + i8;
    }

    /* JADX INFO: renamed from: m2 */
    private int m13024m2(int i7, RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b, boolean z7) {
        int iMo13853m;
        int iMo13853m2 = i7 - this.f10738u.mo13853m();
        if (iMo13853m2 <= 0) {
            return 0;
        }
        int i8 = -m13034C2(iMo13853m2, c2772w, c2746b);
        int i9 = i7 + i8;
        if (!z7 || (iMo13853m = i9 - this.f10738u.mo13853m()) <= 0) {
            return i8;
        }
        this.f10738u.mo13858r(-iMo13853m);
        return i8 - iMo13853m;
    }

    /* JADX INFO: renamed from: n2 */
    private View m13025n2() {
        return m13405O(this.f10741x ? 0 : m13407P() - 1);
    }

    /* JADX INFO: renamed from: o2 */
    private View m13026o2() {
        return m13405O(this.f10741x ? m13407P() - 1 : 0);
    }

    /* JADX INFO: renamed from: u2 */
    private void m13027u2(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b, int i7, int i8) {
        if (!c2746b.m13244g() || m13407P() == 0 || c2746b.m13242e() || !mo12975Q1()) {
            return;
        }
        List listM13527k = c2772w.m13527k();
        int size = listM13527k.size();
        int iM13445m0 = m13445m0(m13405O(0));
        int iMo13845e = 0;
        int iMo13845e2 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            RecyclerView.AbstractC2749E abstractC2749E = (RecyclerView.AbstractC2749E) listM13527k.get(i9);
            if (!abstractC2749E.m13290z()) {
                if ((abstractC2749E.m13281q() < iM13445m0) != this.f10741x) {
                    iMo13845e += this.f10738u.mo13845e(abstractC2749E.f10894a);
                } else {
                    iMo13845e2 += this.f10738u.mo13845e(abstractC2749E.f10894a);
                }
            }
        }
        this.f10737t.f10764l = listM13527k;
        if (iMo13845e > 0) {
            m13014N2(m13445m0(m13026o2()), i7);
            C2743c c2743c = this.f10737t;
            c2743c.f10760h = iMo13845e;
            c2743c.f10755c = 0;
            c2743c.m13077a();
            m13047Z1(c2772w, this.f10737t, c2746b, false);
        }
        if (iMo13845e2 > 0) {
            m13012L2(m13445m0(m13025n2()), i8);
            C2743c c2743c2 = this.f10737t;
            c2743c2.f10760h = iMo13845e2;
            c2743c2.f10755c = 0;
            c2743c2.m13077a();
            m13047Z1(c2772w, this.f10737t, c2746b, false);
        }
        this.f10737t.f10764l = null;
    }

    /* JADX INFO: renamed from: w2 */
    private void m13028w2(RecyclerView.C2772w c2772w, C2743c c2743c) {
        if (!c2743c.f10753a || c2743c.f10765m) {
            return;
        }
        int i7 = c2743c.f10759g;
        int i8 = c2743c.f10761i;
        if (c2743c.f10758f == -1) {
            m13030y2(c2772w, i7, i8);
        } else {
            m13031z2(c2772w, i7, i8);
        }
    }

    /* JADX INFO: renamed from: x2 */
    private void m13029x2(RecyclerView.C2772w c2772w, int i7, int i8) {
        if (i7 == i8) {
            return;
        }
        if (i8 <= i7) {
            while (i7 > i8) {
                m13459s1(i7, c2772w);
                i7--;
            }
        } else {
            for (int i9 = i8 - 1; i9 >= i7; i9--) {
                m13459s1(i9, c2772w);
            }
        }
    }

    /* JADX INFO: renamed from: y2 */
    private void m13030y2(RecyclerView.C2772w c2772w, int i7, int i8) {
        int iM13407P = m13407P();
        if (i7 < 0) {
            return;
        }
        int iMo13848h = (this.f10738u.mo13848h() - i7) + i8;
        if (this.f10741x) {
            for (int i9 = 0; i9 < iM13407P; i9++) {
                View viewM13405O = m13405O(i9);
                if (this.f10738u.mo13847g(viewM13405O) < iMo13848h || this.f10738u.mo13857q(viewM13405O) < iMo13848h) {
                    m13029x2(c2772w, 0, i9);
                    return;
                }
            }
            return;
        }
        int i10 = iM13407P - 1;
        for (int i11 = i10; i11 >= 0; i11--) {
            View viewM13405O2 = m13405O(i11);
            if (this.f10738u.mo13847g(viewM13405O2) < iMo13848h || this.f10738u.mo13857q(viewM13405O2) < iMo13848h) {
                m13029x2(c2772w, i10, i11);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: z2 */
    private void m13031z2(RecyclerView.C2772w c2772w, int i7, int i8) {
        if (i7 < 0) {
            return;
        }
        int i9 = i7 - i8;
        int iM13407P = m13407P();
        if (!this.f10741x) {
            for (int i10 = 0; i10 < iM13407P; i10++) {
                View viewM13405O = m13405O(i10);
                if (this.f10738u.mo13844d(viewM13405O) > i9 || this.f10738u.mo13856p(viewM13405O) > i9) {
                    m13029x2(c2772w, 0, i10);
                    return;
                }
            }
            return;
        }
        int i11 = iM13407P - 1;
        for (int i12 = i11; i12 >= 0; i12--) {
            View viewM13405O2 = m13405O(i12);
            if (this.f10738u.mo13844d(viewM13405O2) > i9 || this.f10738u.mo13856p(viewM13405O2) > i9) {
                m13029x2(c2772w, i11, i12);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: A */
    public int mo12965A(RecyclerView.C2746B c2746b) {
        return m13017U1(c2746b);
    }

    /* JADX INFO: renamed from: A2 */
    boolean m13032A2() {
        return this.f10738u.mo13851k() == 0 && this.f10738u.mo13848h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: B */
    public int mo12966B(RecyclerView.C2746B c2746b) {
        return m13018V1(c2746b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: B1 */
    public int mo12967B1(int i7, RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b) {
        if (this.f10736s == 1) {
            return 0;
        }
        return m13034C2(i7, c2772w, c2746b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: C1 */
    public void mo13033C1(int i7) {
        this.f10728A = i7;
        this.f10729B = Integer.MIN_VALUE;
        C2744d c2744d = this.f10731D;
        if (c2744d != null) {
            c2744d.m13083b();
        }
        m13469y1();
    }

    /* JADX INFO: renamed from: C2 */
    int m13034C2(int i7, RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b) {
        if (m13407P() == 0 || i7 == 0) {
            return 0;
        }
        m13046Y1();
        this.f10737t.f10753a = true;
        int i8 = i7 > 0 ? 1 : -1;
        int iAbs = Math.abs(i7);
        m13011K2(i8, iAbs, true, c2746b);
        C2743c c2743c = this.f10737t;
        int iM13047Z1 = c2743c.f10759g + m13047Z1(c2772w, c2743c, c2746b, false);
        if (iM13047Z1 < 0) {
            return 0;
        }
        if (iAbs > iM13047Z1) {
            i7 = i8 * iM13047Z1;
        }
        this.f10738u.mo13858r(-i7);
        this.f10737t.f10763k = i7;
        return i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: D1 */
    public int mo12968D1(int i7, RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b) {
        if (this.f10736s == 0) {
            return 0;
        }
        return m13034C2(i7, c2772w, c2746b);
    }

    /* JADX INFO: renamed from: D2 */
    public void m13035D2(int i7, int i8) {
        this.f10728A = i7;
        this.f10729B = i8;
        C2744d c2744d = this.f10731D;
        if (c2744d != null) {
            c2744d.m13083b();
        }
        m13469y1();
    }

    /* JADX INFO: renamed from: E2 */
    public void m13036E2(int i7) {
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i7);
        }
        mo13058m(null);
        if (i7 != this.f10736s || this.f10738u == null) {
            AbstractC2793l abstractC2793lM13842b = AbstractC2793l.m13842b(this, i7);
            this.f10738u = abstractC2793lM13842b;
            this.f10732E.f10744a = abstractC2793lM13842b;
            this.f10736s = i7;
            m13469y1();
        }
    }

    /* JADX INFO: renamed from: F2 */
    public void m13037F2(boolean z7) {
        mo13058m(null);
        if (z7 == this.f10740w) {
            return;
        }
        this.f10740w = z7;
        m13469y1();
    }

    /* JADX INFO: renamed from: G2 */
    public void mo12969G2(boolean z7) {
        mo13058m(null);
        if (this.f10742y == z7) {
            return;
        }
        this.f10742y = z7;
        m13469y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: I */
    public View mo13038I(int i7) {
        int iM13407P = m13407P();
        if (iM13407P == 0) {
            return null;
        }
        int iM13445m0 = i7 - m13445m0(m13405O(0));
        if (iM13445m0 >= 0 && iM13445m0 < iM13407P) {
            View viewM13405O = m13405O(iM13445m0);
            if (m13445m0(viewM13405O) == i7) {
                return viewM13405O;
            }
        }
        return super.mo13038I(i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: J */
    public RecyclerView.C2766q mo12971J() {
        return new RecyclerView.C2766q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: L1 */
    boolean mo13039L1() {
        return (m13425d0() == 1073741824 || m13462u0() == 1073741824 || !m13464v0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: N0 */
    public void mo13040N0(RecyclerView recyclerView, RecyclerView.C2772w c2772w) {
        super.mo13040N0(recyclerView, c2772w);
        if (this.f10730C) {
            m13453p1(c2772w);
            c2772w.m13519c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: N1 */
    public void mo13041N1(RecyclerView recyclerView, RecyclerView.C2746B c2746b, int i7) {
        C2791j c2791j = new C2791j(recyclerView.getContext());
        c2791j.m13230p(i7);
        m13406O1(c2791j);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: O0 */
    public View mo12974O0(View view, int i7, RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b) {
        int iM13044W1;
        m13007B2();
        if (m13407P() == 0 || (iM13044W1 = m13044W1(i7)) == Integer.MIN_VALUE) {
            return null;
        }
        m13046Y1();
        m13011K2(iM13044W1, (int) (this.f10738u.mo13854n() * 0.33333334f), false, c2746b);
        C2743c c2743c = this.f10737t;
        c2743c.f10759g = Integer.MIN_VALUE;
        c2743c.f10753a = false;
        m13047Z1(c2772w, c2743c, c2746b, true);
        View viewM13022j2 = iM13044W1 == -1 ? m13022j2() : m13021i2();
        View viewM13026o2 = iM13044W1 == -1 ? m13026o2() : m13025n2();
        if (!viewM13026o2.hasFocusable()) {
            return viewM13022j2;
        }
        if (viewM13022j2 == null) {
            return null;
        }
        return viewM13026o2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: P0 */
    public void mo13042P0(AccessibilityEvent accessibilityEvent) {
        super.mo13042P0(accessibilityEvent);
        if (m13407P() > 0) {
            accessibilityEvent.setFromIndex(m13052d2());
            accessibilityEvent.setToIndex(m13053f2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: Q1 */
    public boolean mo12975Q1() {
        return this.f10731D == null && this.f10739v == this.f10742y;
    }

    /* JADX INFO: renamed from: R1 */
    protected void mo13043R1(RecyclerView.C2746B c2746b, int[] iArr) {
        int i7;
        int iM13059p2 = m13059p2(c2746b);
        if (this.f10737t.f10758f == -1) {
            i7 = 0;
        } else {
            i7 = iM13059p2;
            iM13059p2 = 0;
        }
        iArr[0] = iM13059p2;
        iArr[1] = i7;
    }

    /* JADX INFO: renamed from: S1 */
    void mo12976S1(RecyclerView.C2746B c2746b, C2743c c2743c, RecyclerView.AbstractC2765p.c cVar) {
        int i7 = c2743c.f10756d;
        if (i7 < 0 || i7 >= c2746b.m13239b()) {
            return;
        }
        cVar.mo13477a(i7, Math.max(0, c2743c.f10759g));
    }

    /* JADX INFO: renamed from: W1 */
    int m13044W1(int i7) {
        if (i7 == 1) {
            return (this.f10736s != 1 && m13063r2()) ? 1 : -1;
        }
        if (i7 == 2) {
            return (this.f10736s != 1 && m13063r2()) ? -1 : 1;
        }
        if (i7 == 17) {
            return this.f10736s == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i7 == 33) {
            return this.f10736s == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i7 != 66) {
            return (i7 == 130 && this.f10736s == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f10736s == 0 ? 1 : Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: X1 */
    C2743c m13045X1() {
        return new C2743c();
    }

    /* JADX INFO: renamed from: Y1 */
    void m13046Y1() {
        if (this.f10737t == null) {
            this.f10737t = m13045X1();
        }
    }

    /* JADX INFO: renamed from: Z1 */
    int m13047Z1(RecyclerView.C2772w c2772w, C2743c c2743c, RecyclerView.C2746B c2746b, boolean z7) {
        int i7 = c2743c.f10755c;
        int i8 = c2743c.f10759g;
        if (i8 != Integer.MIN_VALUE) {
            if (i7 < 0) {
                c2743c.f10759g = i8 + i7;
            }
            m13028w2(c2772w, c2743c);
        }
        int i9 = c2743c.f10755c + c2743c.f10760h;
        C2742b c2742b = this.f10733F;
        while (true) {
            if ((!c2743c.f10765m && i9 <= 0) || !c2743c.m13079c(c2746b)) {
                break;
            }
            c2742b.m13075a();
            mo12993t2(c2772w, c2746b, c2743c, c2742b);
            if (!c2742b.f10750b) {
                c2743c.f10754b += c2742b.f10749a * c2743c.f10758f;
                if (!c2742b.f10751c || c2743c.f10764l != null || !c2746b.m13242e()) {
                    int i10 = c2743c.f10755c;
                    int i11 = c2742b.f10749a;
                    c2743c.f10755c = i10 - i11;
                    i9 -= i11;
                }
                int i12 = c2743c.f10759g;
                if (i12 != Integer.MIN_VALUE) {
                    int i13 = i12 + c2742b.f10749a;
                    c2743c.f10759g = i13;
                    int i14 = c2743c.f10755c;
                    if (i14 < 0) {
                        c2743c.f10759g = i13 + i14;
                    }
                    m13028w2(c2772w, c2743c);
                }
                if (z7 && c2742b.f10752d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i7 - c2743c.f10755c;
    }

    /* JADX INFO: renamed from: b2 */
    View m13048b2(boolean z7, boolean z8) {
        return this.f10741x ? m13056h2(0, m13407P(), z7, z8) : m13056h2(m13407P() - 1, -1, z7, z8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2745A.b
    /* JADX INFO: renamed from: c */
    public PointF mo13049c(int i7) {
        if (m13407P() == 0) {
            return null;
        }
        int i8 = (i7 < m13445m0(m13405O(0))) != this.f10741x ? -1 : 1;
        return this.f10736s == 0 ? new PointF(i8, 0.0f) : new PointF(0.0f, i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: c1 */
    public void mo12986c1(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b) {
        int i7;
        int i8;
        int i9;
        int i10;
        int iM13023l2;
        int i11;
        View viewMo13038I;
        int iMo13847g;
        int iMo13849i;
        int i12 = -1;
        if (!(this.f10731D == null && this.f10728A == -1) && c2746b.m13239b() == 0) {
            m13453p1(c2772w);
            return;
        }
        C2744d c2744d = this.f10731D;
        if (c2744d != null && c2744d.m13082a()) {
            this.f10728A = this.f10731D.f10766a;
        }
        m13046Y1();
        this.f10737t.f10753a = false;
        m13007B2();
        View viewM13423b0 = m13423b0();
        C2741a c2741a = this.f10732E;
        if (!c2741a.f10748e || this.f10728A != -1 || this.f10731D != null) {
            c2741a.m13074e();
            C2741a c2741a2 = this.f10732E;
            c2741a2.f10747d = this.f10741x ^ this.f10742y;
            m13010J2(c2772w, c2746b, c2741a2);
            this.f10732E.f10748e = true;
        } else if (viewM13423b0 != null && (this.f10738u.mo13847g(viewM13423b0) >= this.f10738u.mo13849i() || this.f10738u.mo13844d(viewM13423b0) <= this.f10738u.mo13853m())) {
            this.f10732E.m13072c(viewM13423b0, m13445m0(viewM13423b0));
        }
        C2743c c2743c = this.f10737t;
        c2743c.f10758f = c2743c.f10763k >= 0 ? 1 : -1;
        int[] iArr = this.f10735H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo13043R1(c2746b, iArr);
        int iMax = Math.max(0, this.f10735H[0]) + this.f10738u.mo13853m();
        int iMax2 = Math.max(0, this.f10735H[1]) + this.f10738u.mo13850j();
        if (c2746b.m13242e() && (i11 = this.f10728A) != -1 && this.f10729B != Integer.MIN_VALUE && (viewMo13038I = mo13038I(i11)) != null) {
            if (this.f10741x) {
                iMo13849i = this.f10738u.mo13849i() - this.f10738u.mo13844d(viewMo13038I);
                iMo13847g = this.f10729B;
            } else {
                iMo13847g = this.f10738u.mo13847g(viewMo13038I) - this.f10738u.mo13853m();
                iMo13849i = this.f10729B;
            }
            int i13 = iMo13849i - iMo13847g;
            if (i13 > 0) {
                iMax += i13;
            } else {
                iMax2 -= i13;
            }
        }
        C2741a c2741a3 = this.f10732E;
        if (!c2741a3.f10747d ? !this.f10741x : this.f10741x) {
            i12 = 1;
        }
        mo12994v2(c2772w, c2746b, c2741a3, i12);
        m13380C(c2772w);
        this.f10737t.f10765m = m13032A2();
        this.f10737t.f10762j = c2746b.m13242e();
        this.f10737t.f10761i = 0;
        C2741a c2741a4 = this.f10732E;
        if (c2741a4.f10747d) {
            m13015O2(c2741a4);
            C2743c c2743c2 = this.f10737t;
            c2743c2.f10760h = iMax;
            m13047Z1(c2772w, c2743c2, c2746b, false);
            C2743c c2743c3 = this.f10737t;
            i8 = c2743c3.f10754b;
            int i14 = c2743c3.f10756d;
            int i15 = c2743c3.f10755c;
            if (i15 > 0) {
                iMax2 += i15;
            }
            m13013M2(this.f10732E);
            C2743c c2743c4 = this.f10737t;
            c2743c4.f10760h = iMax2;
            c2743c4.f10756d += c2743c4.f10757e;
            m13047Z1(c2772w, c2743c4, c2746b, false);
            C2743c c2743c5 = this.f10737t;
            i7 = c2743c5.f10754b;
            int i16 = c2743c5.f10755c;
            if (i16 > 0) {
                m13014N2(i14, i8);
                C2743c c2743c6 = this.f10737t;
                c2743c6.f10760h = i16;
                m13047Z1(c2772w, c2743c6, c2746b, false);
                i8 = this.f10737t.f10754b;
            }
        } else {
            m13013M2(c2741a4);
            C2743c c2743c7 = this.f10737t;
            c2743c7.f10760h = iMax2;
            m13047Z1(c2772w, c2743c7, c2746b, false);
            C2743c c2743c8 = this.f10737t;
            i7 = c2743c8.f10754b;
            int i17 = c2743c8.f10756d;
            int i18 = c2743c8.f10755c;
            if (i18 > 0) {
                iMax += i18;
            }
            m13015O2(this.f10732E);
            C2743c c2743c9 = this.f10737t;
            c2743c9.f10760h = iMax;
            c2743c9.f10756d += c2743c9.f10757e;
            m13047Z1(c2772w, c2743c9, c2746b, false);
            C2743c c2743c10 = this.f10737t;
            i8 = c2743c10.f10754b;
            int i19 = c2743c10.f10755c;
            if (i19 > 0) {
                m13012L2(i17, i7);
                C2743c c2743c11 = this.f10737t;
                c2743c11.f10760h = i19;
                m13047Z1(c2772w, c2743c11, c2746b, false);
                i7 = this.f10737t.f10754b;
            }
        }
        if (m13407P() > 0) {
            if (this.f10741x ^ this.f10742y) {
                int iM13023l3 = m13023l2(i7, c2772w, c2746b, true);
                i9 = i8 + iM13023l3;
                i10 = i7 + iM13023l3;
                iM13023l2 = m13024m2(i9, c2772w, c2746b, false);
            } else {
                int iM13024m2 = m13024m2(i8, c2772w, c2746b, true);
                i9 = i8 + iM13024m2;
                i10 = i7 + iM13024m2;
                iM13023l2 = m13023l2(i10, c2772w, c2746b, false);
            }
            i8 = i9 + iM13023l2;
            i7 = i10 + iM13023l2;
        }
        m13027u2(c2772w, c2746b, i8, i7);
        if (c2746b.m13242e()) {
            this.f10732E.m13074e();
        } else {
            this.f10738u.m13859s();
        }
        this.f10739v = this.f10742y;
    }

    /* JADX INFO: renamed from: c2 */
    View m13050c2(boolean z7, boolean z8) {
        return this.f10741x ? m13056h2(m13407P() - 1, -1, z7, z8) : m13056h2(0, m13407P(), z7, z8);
    }

    @Override // androidx.recyclerview.widget.C2787f.h
    /* JADX INFO: renamed from: d */
    public void mo13051d(View view, View view2, int i7, int i8) {
        mo13058m("Cannot drop a view during a scroll or layout calculation");
        m13046Y1();
        m13007B2();
        int iM13445m0 = m13445m0(view);
        int iM13445m1 = m13445m0(view2);
        byte b7 = iM13445m0 < iM13445m1 ? (byte) 1 : (byte) -1;
        if (this.f10741x) {
            if (b7 == 1) {
                m13035D2(iM13445m1, this.f10738u.mo13849i() - (this.f10738u.mo13847g(view2) + this.f10738u.mo13845e(view)));
                return;
            } else {
                m13035D2(iM13445m1, this.f10738u.mo13849i() - this.f10738u.mo13844d(view2));
                return;
            }
        }
        if (b7 == -1) {
            m13035D2(iM13445m1, this.f10738u.mo13847g(view2));
        } else {
            m13035D2(iM13445m1, this.f10738u.mo13844d(view2) - this.f10738u.mo13845e(view));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: d1 */
    public void mo12987d1(RecyclerView.C2746B c2746b) {
        super.mo12987d1(c2746b);
        this.f10731D = null;
        this.f10728A = -1;
        this.f10729B = Integer.MIN_VALUE;
        this.f10732E.m13074e();
    }

    /* JADX INFO: renamed from: d2 */
    public int m13052d2() {
        View viewM13056h2 = m13056h2(0, m13407P(), false, true);
        if (viewM13056h2 == null) {
            return -1;
        }
        return m13445m0(viewM13056h2);
    }

    /* JADX INFO: renamed from: f2 */
    public int m13053f2() {
        View viewM13056h2 = m13056h2(m13407P() - 1, -1, false, true);
        if (viewM13056h2 == null) {
            return -1;
        }
        return m13445m0(viewM13056h2);
    }

    /* JADX INFO: renamed from: g2 */
    View m13054g2(int i7, int i8) {
        int i9;
        int i10;
        m13046Y1();
        if (i8 <= i7 && i8 >= i7) {
            return m13405O(i7);
        }
        if (this.f10738u.mo13847g(m13405O(i7)) < this.f10738u.mo13853m()) {
            i9 = 16644;
            i10 = 16388;
        } else {
            i9 = 4161;
            i10 = 4097;
        }
        return this.f10736s == 0 ? this.f10941e.m13899a(i7, i8, i9, i10) : this.f10942f.m13899a(i7, i8, i9, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: h1 */
    public void mo13055h1(Parcelable parcelable) {
        if (parcelable instanceof C2744d) {
            C2744d c2744d = (C2744d) parcelable;
            this.f10731D = c2744d;
            if (this.f10728A != -1) {
                c2744d.m13083b();
            }
            m13469y1();
        }
    }

    /* JADX INFO: renamed from: h2 */
    View m13056h2(int i7, int i8, boolean z7, boolean z8) {
        m13046Y1();
        int i9 = z7 ? 24579 : 320;
        int i10 = z8 ? 320 : 0;
        return this.f10736s == 0 ? this.f10941e.m13899a(i7, i8, i9, i10) : this.f10942f.m13899a(i7, i8, i9, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: i1 */
    public Parcelable mo13057i1() {
        if (this.f10731D != null) {
            return new C2744d(this.f10731D);
        }
        C2744d c2744d = new C2744d();
        if (m13407P() <= 0) {
            c2744d.m13083b();
            return c2744d;
        }
        m13046Y1();
        boolean z7 = this.f10739v ^ this.f10741x;
        c2744d.f10768c = z7;
        if (z7) {
            View viewM13025n2 = m13025n2();
            c2744d.f10767b = this.f10738u.mo13849i() - this.f10738u.mo13844d(viewM13025n2);
            c2744d.f10766a = m13445m0(viewM13025n2);
            return c2744d;
        }
        View viewM13026o2 = m13026o2();
        c2744d.f10766a = m13445m0(viewM13026o2);
        c2744d.f10767b = this.f10738u.mo13847g(viewM13026o2) - this.f10738u.mo13853m();
        return c2744d;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX INFO: renamed from: k2 */
    View mo12990k2(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b, boolean z7, boolean z8) {
        int i7;
        int iM13407P;
        int i8;
        m13046Y1();
        int iM13407P2 = m13407P();
        if (z8) {
            iM13407P = m13407P() - 1;
            i7 = -1;
            i8 = -1;
        } else {
            i7 = iM13407P2;
            iM13407P = 0;
            i8 = 1;
        }
        int iM13239b = c2746b.m13239b();
        int iMo13853m = this.f10738u.mo13853m();
        int iMo13849i = this.f10738u.mo13849i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iM13407P != i7) {
            View viewM13405O = m13405O(iM13407P);
            int iM13445m0 = m13445m0(viewM13405O);
            int iMo13847g = this.f10738u.mo13847g(viewM13405O);
            int iMo13844d = this.f10738u.mo13844d(viewM13405O);
            if (iM13445m0 >= 0 && iM13445m0 < iM13239b) {
                if (!((RecyclerView.C2766q) viewM13405O.getLayoutParams()).m13480c()) {
                    boolean z9 = iMo13844d <= iMo13853m && iMo13847g < iMo13853m;
                    boolean z10 = iMo13847g >= iMo13849i && iMo13844d > iMo13849i;
                    if (!z9 && !z10) {
                        return viewM13405O;
                    }
                    if (z7) {
                        if (z10) {
                            view2 = viewM13405O;
                        } else if (view == null) {
                            view = viewM13405O;
                        }
                    } else if (z9) {
                        view2 = viewM13405O;
                    } else if (view == null) {
                        view = viewM13405O;
                    }
                } else if (view3 == null) {
                    view3 = viewM13405O;
                }
            }
            iM13407P += i8;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: m */
    public void mo13058m(String str) {
        if (this.f10731D == null) {
            super.mo13058m(str);
        }
    }

    /* JADX INFO: renamed from: p2 */
    protected int m13059p2(RecyclerView.C2746B c2746b) {
        if (c2746b.m13241d()) {
            return this.f10738u.mo13854n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: q */
    public boolean mo13060q() {
        return this.f10736s == 0;
    }

    /* JADX INFO: renamed from: q2 */
    public int m13061q2() {
        return this.f10736s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: r */
    public boolean mo13062r() {
        return this.f10736s == 1;
    }

    /* JADX INFO: renamed from: r2 */
    protected boolean m13063r2() {
        return m13426e0() == 1;
    }

    /* JADX INFO: renamed from: s2 */
    public boolean m13064s2() {
        return this.f10743z;
    }

    /* JADX INFO: renamed from: t2 */
    void mo12993t2(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b, C2743c c2743c, C2742b c2742b) {
        int iMo13846f;
        int i7;
        int i8;
        int i9;
        int iM13438j0;
        int iMo13846f2;
        int i10;
        int i11;
        View viewM13080d = c2743c.m13080d(c2772w);
        if (viewM13080d == null) {
            c2742b.f10750b = true;
            return;
        }
        RecyclerView.C2766q c2766q = (RecyclerView.C2766q) viewM13080d.getLayoutParams();
        if (c2743c.f10764l == null) {
            if (this.f10741x == (c2743c.f10758f == -1)) {
                m13437j(viewM13080d);
            } else {
                m13440k(viewM13080d, 0);
            }
        } else {
            if (this.f10741x == (c2743c.f10758f == -1)) {
                m13433h(viewM13080d);
            } else {
                m13435i(viewM13080d, 0);
            }
        }
        mo13387F0(viewM13080d, 0, 0);
        c2742b.f10749a = this.f10738u.mo13845e(viewM13080d);
        if (this.f10736s == 1) {
            if (m13063r2()) {
                iMo13846f2 = m13460t0() - m13441k0();
                iM13438j0 = iMo13846f2 - this.f10738u.mo13846f(viewM13080d);
            } else {
                iM13438j0 = m13438j0();
                iMo13846f2 = this.f10738u.mo13846f(viewM13080d) + iM13438j0;
            }
            if (c2743c.f10758f == -1) {
                i11 = c2743c.f10754b;
                i10 = i11 - c2742b.f10749a;
            } else {
                i10 = c2743c.f10754b;
                i11 = c2742b.f10749a + i10;
            }
            int i12 = iM13438j0;
            i9 = i10;
            i8 = i12;
            iMo13846f = i11;
            i7 = iMo13846f2;
        } else {
            int iM13443l0 = m13443l0();
            iMo13846f = this.f10738u.mo13846f(viewM13080d) + iM13443l0;
            if (c2743c.f10758f == -1) {
                int i13 = c2743c.f10754b;
                i8 = i13 - c2742b.f10749a;
                i7 = i13;
            } else {
                int i14 = c2743c.f10754b;
                i7 = c2742b.f10749a + i14;
                i8 = i14;
            }
            i9 = iM13443l0;
        }
        m13384E0(viewM13080d, i8, i9, i7, iMo13846f);
        if (c2766q.m13480c() || c2766q.m13479b()) {
            c2742b.f10751c = true;
        }
        c2742b.f10752d = viewM13080d.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: u */
    public void mo13065u(int i7, int i8, RecyclerView.C2746B c2746b, RecyclerView.AbstractC2765p.c cVar) {
        if (this.f10736s != 0) {
            i7 = i8;
        }
        if (m13407P() == 0 || i7 == 0) {
            return;
        }
        m13046Y1();
        m13011K2(i7 > 0 ? 1 : -1, Math.abs(i7), true, c2746b);
        mo12976S1(c2746b, this.f10737t, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: v */
    public void mo13066v(int i7, RecyclerView.AbstractC2765p.c cVar) {
        boolean z7;
        int i8;
        C2744d c2744d = this.f10731D;
        if (c2744d == null || !c2744d.m13082a()) {
            m13007B2();
            z7 = this.f10741x;
            i8 = this.f10728A;
            if (i8 == -1) {
                i8 = z7 ? i7 - 1 : 0;
            }
        } else {
            C2744d c2744d2 = this.f10731D;
            z7 = c2744d2.f10768c;
            i8 = c2744d2.f10766a;
        }
        int i9 = z7 ? -1 : 1;
        for (int i10 = 0; i10 < this.f10734G && i8 >= 0 && i8 < i7; i10++) {
            cVar.mo13477a(i8, 0);
            i8 += i9;
        }
    }

    /* JADX INFO: renamed from: v2 */
    void mo12994v2(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b, C2741a c2741a, int i7) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: w */
    public int mo13067w(RecyclerView.C2746B c2746b) {
        return m13016T1(c2746b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: x */
    public int mo12995x(RecyclerView.C2746B c2746b) {
        return m13017U1(c2746b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: x0 */
    public boolean mo13068x0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: y */
    public int mo12996y(RecyclerView.C2746B c2746b) {
        return m13018V1(c2746b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: z */
    public int mo13069z(RecyclerView.C2746B c2746b) {
        return m13016T1(c2746b);
    }

    public LinearLayoutManager(Context context, int i7, boolean z7) {
        this.f10736s = 1;
        this.f10740w = false;
        this.f10741x = false;
        this.f10742y = false;
        this.f10743z = true;
        this.f10728A = -1;
        this.f10729B = Integer.MIN_VALUE;
        this.f10731D = null;
        this.f10732E = new C2741a();
        this.f10733F = new C2742b();
        this.f10734G = 2;
        this.f10735H = new int[2];
        m13036E2(i7);
        m13037F2(z7);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f10736s = 1;
        this.f10740w = false;
        this.f10741x = false;
        this.f10742y = false;
        this.f10743z = true;
        this.f10728A = -1;
        this.f10729B = Integer.MIN_VALUE;
        this.f10731D = null;
        this.f10732E = new C2741a();
        this.f10733F = new C2742b();
        this.f10734G = 2;
        this.f10735H = new int[2];
        RecyclerView.AbstractC2765p.d dVarM13376n0 = RecyclerView.AbstractC2765p.m13376n0(context, attributeSet, i7, i8);
        m13036E2(dVarM13376n0.f10957a);
        m13037F2(dVarM13376n0.f10959c);
        mo12969G2(dVarM13376n0.f10960d);
    }
}
