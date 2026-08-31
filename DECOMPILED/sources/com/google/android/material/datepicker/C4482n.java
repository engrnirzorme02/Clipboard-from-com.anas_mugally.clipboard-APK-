package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.appcompat.app.AbstractC2263x;
import androidx.recyclerview.widget.C2794m;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import p104N.C0906c;
import p111O.AbstractC1030Z;
import p111O.C1032a;
import p118P.C1170s;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6746g;
import p325p3.AbstractC6747h;
import p325p3.AbstractC6748i;
import p325p3.AbstractC6750k;

/* JADX INFO: renamed from: com.google.android.material.datepicker.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C4482n<S> extends AbstractC4493y {

    /* JADX INFO: renamed from: D0 */
    static final Object f16894D0 = "MONTHS_VIEW_GROUP_TAG";

    /* JADX INFO: renamed from: E0 */
    static final Object f16895E0 = "NAVIGATION_PREV_TAG";

    /* JADX INFO: renamed from: F0 */
    static final Object f16896F0 = "NAVIGATION_NEXT_TAG";

    /* JADX INFO: renamed from: G0 */
    static final Object f16897G0 = "SELECTOR_TOGGLE_TAG";

    /* JADX INFO: renamed from: A0 */
    private View f16898A0;

    /* JADX INFO: renamed from: B0 */
    private MaterialButton f16899B0;

    /* JADX INFO: renamed from: C0 */
    private AccessibilityManager f16900C0;

    /* JADX INFO: renamed from: p0 */
    private int f16901p0;

    /* JADX INFO: renamed from: q0 */
    private InterfaceC4477i f16902q0;

    /* JADX INFO: renamed from: r0 */
    private C4469a f16903r0;

    /* JADX INFO: renamed from: s0 */
    private C4489u f16904s0;

    /* JADX INFO: renamed from: t0 */
    private l f16905t0;

    /* JADX INFO: renamed from: u0 */
    private C4471c f16906u0;

    /* JADX INFO: renamed from: v0 */
    private RecyclerView f16907v0;

    /* JADX INFO: renamed from: w0 */
    private RecyclerView f16908w0;

    /* JADX INFO: renamed from: x0 */
    private View f16909x0;

    /* JADX INFO: renamed from: y0 */
    private View f16910y0;

    /* JADX INFO: renamed from: z0 */
    private View f16911z0;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.n$a */
    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C4491w f16912a;

        a(C4491w c4491w) {
            this.f16912a = c4491w;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4482n.this.m20332n2(this.f16912a.m20406C(C4482n.this.m20330j2().m13053f2() - 1));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.n$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f16914a;

        b(int i7) {
            this.f16914a = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4482n.this.f16908w0.m13197s1(this.f16914a);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.n$c */
    class c extends C1032a {
        c() {
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: g */
        public void mo4585g(View view, C1170s c1170s) {
            super.mo4585g(view, c1170s);
            c1170s.m5072o0(null);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.n$d */
    class d extends AbstractC4464A {

        /* JADX INFO: renamed from: I */
        final /* synthetic */ int f16917I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, int i7, boolean z7, int i8) {
            super(context, i7, z7);
            this.f16917I = i8;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* JADX INFO: renamed from: R1 */
        protected void mo13043R1(RecyclerView.C2746B c2746b, int[] iArr) {
            if (this.f16917I == 0) {
                iArr[0] = C4482n.this.f16908w0.getWidth();
                iArr[1] = C4482n.this.f16908w0.getWidth();
            } else {
                iArr[0] = C4482n.this.f16908w0.getHeight();
                iArr[1] = C4482n.this.f16908w0.getHeight();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.n$e */
    class e implements m {
        e() {
        }

        @Override // com.google.android.material.datepicker.C4482n.m
        /* JADX INFO: renamed from: a */
        public void mo20335a(long j7) {
            if (C4482n.this.f16903r0.m20245g().mo20258D(j7)) {
                C4482n.this.f16902q0.mo20280O(j7);
                Iterator it = C4482n.this.f17016o0.iterator();
                while (it.hasNext()) {
                    ((AbstractC4492x) it.next()).mo20365b(C4482n.this.f16902q0.mo20279K());
                }
                C4482n.this.f16908w0.getAdapter().m13322l();
                if (C4482n.this.f16907v0 != null) {
                    C4482n.this.f16907v0.getAdapter().m13322l();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.n$f */
    class f extends C1032a {
        f() {
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: g */
        public void mo4585g(View view, C1170s c1170s) {
            super.mo4585g(view, c1170s);
            c1170s.m5023H0(false);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.n$g */
    class g extends RecyclerView.AbstractC2764o {

        /* JADX INFO: renamed from: a */
        private final Calendar f16921a = AbstractC4466C.m20223m();

        /* JADX INFO: renamed from: b */
        private final Calendar f16922b = AbstractC4466C.m20223m();

        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2764o
        /* JADX INFO: renamed from: i */
        public void mo13367i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C2746B c2746b) {
            if ((recyclerView.getAdapter() instanceof C4467D) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C4467D c4467d = (C4467D) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C0906c c0906c : C4482n.this.f16902q0.mo20282k()) {
                    Object obj = c0906c.f3546a;
                    if (obj != null && c0906c.f3547b != null) {
                        this.f16921a.setTimeInMillis(((Long) obj).longValue());
                        this.f16922b.setTimeInMillis(((Long) c0906c.f3547b).longValue());
                        int iM20230D = c4467d.m20230D(this.f16921a.get(1));
                        int iM20230D2 = c4467d.m20230D(this.f16922b.get(1));
                        View viewMo13038I = gridLayoutManager.mo13038I(iM20230D);
                        View viewMo13038I2 = gridLayoutManager.mo13038I(iM20230D2);
                        int iM12984Z2 = iM20230D / gridLayoutManager.m12984Z2();
                        int iM12984Z3 = iM20230D2 / gridLayoutManager.m12984Z2();
                        int i7 = iM12984Z2;
                        while (i7 <= iM12984Z3) {
                            View viewMo13038I3 = gridLayoutManager.mo13038I(gridLayoutManager.m12984Z2() * i7);
                            if (viewMo13038I3 != null) {
                                canvas.drawRect((i7 != iM12984Z2 || viewMo13038I == null) ? 0 : viewMo13038I.getLeft() + (viewMo13038I.getWidth() / 2), viewMo13038I3.getTop() + C4482n.this.f16906u0.f16870d.m20261c(), (i7 != iM12984Z3 || viewMo13038I2 == null) ? recyclerView.getWidth() : viewMo13038I2.getLeft() + (viewMo13038I2.getWidth() / 2), viewMo13038I3.getBottom() - C4482n.this.f16906u0.f16870d.m20260b(), C4482n.this.f16906u0.f16874h);
                            }
                            i7++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.n$h */
    class h extends C1032a {
        h() {
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: g */
        public void mo4585g(View view, C1170s c1170s) {
            super.mo4585g(view, c1170s);
            c1170s.m5052b(new C1170s.a(16, C4482n.this.f16898A0.getVisibility() == 0 ? C4482n.this.m12154X(AbstractC6750k.f26496R) : C4482n.this.m12154X(AbstractC6750k.f26494P)));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.n$i */
    class i extends RecyclerView.AbstractC2770u {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C4491w f16925a;

        i(C4491w c4491w) {
            this.f16925a = c4491w;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2770u
        /* JADX INFO: renamed from: b */
        public void mo13489b(RecyclerView recyclerView, int i7, int i8) {
            int iM13052d2 = i7 < 0 ? C4482n.this.m20330j2().m13052d2() : C4482n.this.m20330j2().m13053f2();
            C4489u c4489uM20406C = this.f16925a.m20406C(iM13052d2);
            C4482n.this.f16904s0 = c4489uM20406C;
            C4482n.this.f16899B0.setText(this.f16925a.m20407D(iM13052d2));
            C4482n.this.m20324r2(this.f16925a.m20408E(c4489uM20406C));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.n$j */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4482n.this.m20334q2();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.n$k */
    class k implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C4491w f16928a;

        k(C4491w c4491w) {
            this.f16928a = c4491w;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4482n.this.m20332n2(this.f16928a.m20406C(C4482n.this.m20330j2().m13052d2() + 1));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.n$l */
    enum l {
        DAY,
        YEAR
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.n$m */
    interface m {
        /* JADX INFO: renamed from: a */
        void mo20335a(long j7);
    }

    /* JADX INFO: renamed from: b2 */
    private void m20317b2(View view, C4491w c4491w) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(AbstractC6746g.f26437t);
        this.f16899B0 = materialButton;
        materialButton.setTag(f16897G0);
        AbstractC1030Z.m4474j0(this.f16899B0, new h());
        View viewFindViewById = view.findViewById(AbstractC6746g.f26439v);
        this.f16909x0 = viewFindViewById;
        viewFindViewById.setTag(f16895E0);
        View viewFindViewById2 = view.findViewById(AbstractC6746g.f26438u);
        this.f16910y0 = viewFindViewById2;
        viewFindViewById2.setTag(f16896F0);
        this.f16911z0 = view.findViewById(AbstractC6746g.f26395C);
        this.f16898A0 = view.findViewById(AbstractC6746g.f26441x);
        m20333o2(l.DAY);
        this.f16899B0.setText(this.f16904s0.m20377J());
        this.f16908w0.m13182l(new i(c4491w));
        this.f16899B0.setOnClickListener(new j());
        this.f16910y0.setOnClickListener(new k(c4491w));
        this.f16909x0.setOnClickListener(new a(c4491w));
        m20324r2(c4491w.m20408E(this.f16904s0));
    }

    /* JADX INFO: renamed from: c2 */
    private RecyclerView.AbstractC2764o m20318c2() {
        return new g();
    }

    /* JADX INFO: renamed from: h2 */
    static int m20319h2(Context context) {
        return context.getResources().getDimensionPixelSize(AbstractC6744e.f26335b0);
    }

    /* JADX INFO: renamed from: i2 */
    private static int m20320i2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(AbstractC6744e.f26351j0) + resources.getDimensionPixelOffset(AbstractC6744e.f26353k0) + resources.getDimensionPixelOffset(AbstractC6744e.f26349i0);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(AbstractC6744e.f26339d0);
        int i7 = C4490v.f17001f;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(AbstractC6744e.f26335b0) * i7) + ((i7 - 1) * resources.getDimensionPixelOffset(AbstractC6744e.f26347h0)) + resources.getDimensionPixelOffset(AbstractC6744e.f26331Z);
    }

    /* JADX INFO: renamed from: k2 */
    public static C4482n m20321k2(InterfaceC4477i interfaceC4477i, int i7, C4469a c4469a, AbstractC4480l abstractC4480l) {
        C4482n c4482n = new C4482n();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i7);
        bundle.putParcelable("GRID_SELECTOR_KEY", interfaceC4477i);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c4469a);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", abstractC4480l);
        bundle.putParcelable("CURRENT_MONTH_KEY", c4469a.m20249m());
        c4482n.m12117E1(bundle);
        return c4482n;
    }

    /* JADX INFO: renamed from: l2 */
    private void m20322l2(int i7) {
        this.f16908w0.post(new b(i7));
    }

    /* JADX INFO: renamed from: p2 */
    private void m20323p2() {
        AbstractC1030Z.m4474j0(this.f16908w0, new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public void m20324r2(int i7) {
        this.f16910y0.setEnabled(i7 + 1 < this.f16908w0.getAdapter().mo8548g());
        this.f16909x0.setEnabled(i7 - 1 >= 0);
    }

    @Override // com.google.android.material.datepicker.AbstractC4493y
    /* JADX INFO: renamed from: Q1 */
    public boolean mo20325Q1(AbstractC4492x abstractC4492x) {
        return super.mo20325Q1(abstractC4492x);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: R0 */
    public void mo12080R0(Bundle bundle) {
        super.mo12080R0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f16901p0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f16902q0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f16903r0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f16904s0);
    }

    /* JADX INFO: renamed from: d2 */
    C4469a m20326d2() {
        return this.f16903r0;
    }

    /* JADX INFO: renamed from: e2 */
    C4471c m20327e2() {
        return this.f16906u0;
    }

    /* JADX INFO: renamed from: f2 */
    C4489u m20328f2() {
        return this.f16904s0;
    }

    /* JADX INFO: renamed from: g2 */
    public InterfaceC4477i m20329g2() {
        return this.f16902q0;
    }

    /* JADX INFO: renamed from: j2 */
    LinearLayoutManager m20330j2() {
        return (LinearLayoutManager) this.f16908w0.getLayoutManager();
    }

    /* JADX INFO: renamed from: m2 */
    void m20331m2() {
        MaterialButton materialButton = this.f16899B0;
        if (materialButton != null) {
            materialButton.sendAccessibilityEvent(8);
        }
    }

    /* JADX INFO: renamed from: n2 */
    void m20332n2(C4489u c4489u) {
        C4491w c4491w = (C4491w) this.f16908w0.getAdapter();
        int iM20408E = c4491w.m20408E(c4489u);
        AccessibilityManager accessibilityManager = this.f16900C0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iM20408E2 = iM20408E - c4491w.m20408E(this.f16904s0);
            boolean z7 = Math.abs(iM20408E2) > 3;
            boolean z8 = iM20408E2 > 0;
            this.f16904s0 = c4489u;
            if (z7 && z8) {
                this.f16908w0.m13181k1(iM20408E - 3);
                m20322l2(iM20408E);
            } else if (z7) {
                this.f16908w0.m13181k1(iM20408E + 3);
                m20322l2(iM20408E);
            } else {
                m20322l2(iM20408E);
            }
        } else {
            this.f16904s0 = c4489u;
            this.f16908w0.m13181k1(iM20408E);
        }
        m20324r2(iM20408E);
    }

    /* JADX INFO: renamed from: o2 */
    void m20333o2(l lVar) {
        this.f16905t0 = lVar;
        if (lVar == l.YEAR) {
            this.f16907v0.getLayoutManager().mo13033C1(((C4467D) this.f16907v0.getAdapter()).m20230D(this.f16904s0.f16996c));
            this.f16911z0.setVisibility(0);
            this.f16898A0.setVisibility(8);
            this.f16909x0.setVisibility(8);
            this.f16910y0.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.f16911z0.setVisibility(8);
            this.f16898A0.setVisibility(0);
            this.f16909x0.setVisibility(0);
            this.f16910y0.setVisibility(0);
            m20332n2(this.f16904s0);
        }
    }

    /* JADX INFO: renamed from: q2 */
    void m20334q2() {
        l lVar = this.f16905t0;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            m20333o2(l.DAY);
            this.f16908w0.announceForAccessibility(m12154X(AbstractC6750k.f26497S));
        } else if (lVar == l.DAY) {
            m20333o2(lVar2);
            this.f16907v0.announceForAccessibility(m12154X(AbstractC6750k.f26498T));
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: v0 */
    public void mo681v0(Bundle bundle) {
        super.mo681v0(bundle);
        if (bundle == null) {
            bundle = m12199s();
        }
        this.f16901p0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f16902q0 = (InterfaceC4477i) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f16903r0 = (C4469a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        AbstractC2263x.m9328a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f16904s0 = (C4489u) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: z0 */
    public View mo682z0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i7;
        int i8;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m12204u(), this.f16901p0);
        this.f16906u0 = new C4471c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f16900C0 = (AccessibilityManager) m12214y1().getSystemService("accessibility");
        C4489u c4489uM20250n = this.f16903r0.m20250n();
        if (C4486r.m20354v2(contextThemeWrapper)) {
            i7 = AbstractC6748i.f26476y;
            i8 = 1;
        } else {
            i7 = AbstractC6748i.f26474w;
            i8 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i7, viewGroup, false);
        viewInflate.setMinimumHeight(m20320i2(m12214y1()));
        GridView gridView = (GridView) viewInflate.findViewById(AbstractC6746g.f26442y);
        AbstractC1030Z.m4474j0(gridView, new c());
        int iM20247i = this.f16903r0.m20247i();
        gridView.setAdapter((ListAdapter) (iM20247i > 0 ? new C4481m(iM20247i) : new C4481m()));
        gridView.setNumColumns(c4489uM20250n.f16997d);
        gridView.setEnabled(false);
        this.f16908w0 = (RecyclerView) viewInflate.findViewById(AbstractC6746g.f26394B);
        this.f16908w0.setLayoutManager(new d(m12204u(), i8, false, i8));
        this.f16908w0.setTag(f16894D0);
        C4491w c4491w = new C4491w(contextThemeWrapper, this.f16902q0, this.f16903r0, null, new e());
        this.f16908w0.setAdapter(c4491w);
        int integer = contextThemeWrapper.getResources().getInteger(AbstractC6747h.f26446c);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(AbstractC6746g.f26395C);
        this.f16907v0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f16907v0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f16907v0.setAdapter(new C4467D(this));
            this.f16907v0.m13174h(m20318c2());
        }
        if (viewInflate.findViewById(AbstractC6746g.f26437t) != null) {
            m20317b2(viewInflate, c4491w);
        }
        if (!C4486r.m20354v2(contextThemeWrapper)) {
            new C2794m().m13897b(this.f16908w0);
        }
        this.f16908w0.m13181k1(c4491w.m20408E(this.f16904s0));
        m20323p2();
        return viewInflate;
    }
}
