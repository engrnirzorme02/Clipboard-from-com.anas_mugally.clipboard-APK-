package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.C2791j;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.C3553a;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p033E.AbstractC0246a;
import p065I.AbstractC0577a;
import p104N.AbstractC0910g;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6752m;
import p333q3.AbstractC6826a;
import p373v3.InterfaceC7227a;
import p386x0.AbstractC7382d;

/* JADX INFO: loaded from: classes2.dex */
public class CarouselLayoutManager extends RecyclerView.AbstractC2765p implements InterfaceC7227a, RecyclerView.AbstractC2745A.b {

    /* JADX INFO: renamed from: A */
    private int f16660A;

    /* JADX INFO: renamed from: B */
    private Map f16661B;

    /* JADX INFO: renamed from: C */
    private AbstractC4448b f16662C;

    /* JADX INFO: renamed from: D */
    private final View.OnLayoutChangeListener f16663D;

    /* JADX INFO: renamed from: E */
    private int f16664E;

    /* JADX INFO: renamed from: F */
    private int f16665F;

    /* JADX INFO: renamed from: G */
    private int f16666G;

    /* JADX INFO: renamed from: s */
    int f16667s;

    /* JADX INFO: renamed from: t */
    int f16668t;

    /* JADX INFO: renamed from: u */
    int f16669u;

    /* JADX INFO: renamed from: v */
    private boolean f16670v;

    /* JADX INFO: renamed from: w */
    private final C4445c f16671w;

    /* JADX INFO: renamed from: x */
    private AbstractC4449c f16672x;

    /* JADX INFO: renamed from: y */
    private C4452f f16673y;

    /* JADX INFO: renamed from: z */
    private C4451e f16674z;

    /* JADX INFO: renamed from: com.google.android.material.carousel.CarouselLayoutManager$a */
    class C4443a extends C2791j {
        C4443a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2745A
        /* JADX INFO: renamed from: a */
        public PointF mo13215a(int i7) {
            return CarouselLayoutManager.this.mo13049c(i7);
        }

        @Override // androidx.recyclerview.widget.C2791j
        /* JADX INFO: renamed from: t */
        public int mo13829t(View view, int i7) {
            if (CarouselLayoutManager.this.f16673y == null || !CarouselLayoutManager.this.mo19935g()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.m19936h2(carouselLayoutManager.m13445m0(view));
        }

        @Override // androidx.recyclerview.widget.C2791j
        /* JADX INFO: renamed from: u */
        public int mo13830u(View view, int i7) {
            if (CarouselLayoutManager.this.f16673y == null || CarouselLayoutManager.this.mo19935g()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.m19936h2(carouselLayoutManager.m13445m0(view));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.CarouselLayoutManager$b */
    private static final class C4444b {

        /* JADX INFO: renamed from: a */
        final View f16676a;

        /* JADX INFO: renamed from: b */
        final float f16677b;

        /* JADX INFO: renamed from: c */
        final float f16678c;

        /* JADX INFO: renamed from: d */
        final C4446d f16679d;

        C4444b(View view, float f7, float f8, C4446d c4446d) {
            this.f16676a = view;
            this.f16677b = f7;
            this.f16678c = f8;
            this.f16679d = c4446d;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.CarouselLayoutManager$c */
    private static class C4445c extends RecyclerView.AbstractC2764o {

        /* JADX INFO: renamed from: a */
        private final Paint f16680a;

        /* JADX INFO: renamed from: b */
        private List f16681b;

        C4445c() {
            Paint paint = new Paint();
            this.f16680a = paint;
            this.f16681b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2764o
        /* JADX INFO: renamed from: k */
        public void mo13369k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C2746B c2746b) {
            super.mo13369k(canvas, recyclerView, c2746b);
            this.f16680a.setStrokeWidth(recyclerView.getResources().getDimension(AbstractC6744e.f26370t));
            for (C4451e.c cVar : this.f16681b) {
                this.f16680a.setColor(AbstractC0246a.m1174c(-65281, -16776961, cVar.f16717c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).mo19935g()) {
                    canvas.drawLine(cVar.f16716b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).m19876B2(), cVar.f16716b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).m19925x2(), this.f16680a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).m19926y2(), cVar.f16716b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).m19927z2(), cVar.f16716b, this.f16680a);
                }
            }
        }

        /* JADX INFO: renamed from: l */
        void m19939l(List list) {
            this.f16681b = Collections.unmodifiableList(list);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.CarouselLayoutManager$d */
    private static class C4446d {

        /* JADX INFO: renamed from: a */
        final C4451e.c f16682a;

        /* JADX INFO: renamed from: b */
        final C4451e.c f16683b;

        C4446d(C4451e.c cVar, C4451e.c cVar2) {
            AbstractC0910g.m4133a(cVar.f16715a <= cVar2.f16715a);
            this.f16682a = cVar;
            this.f16683b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new C4453g());
    }

    /* JADX INFO: renamed from: A2 */
    private int m19875A2() {
        return this.f16662C.mo19953g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public int m19876B2() {
        return this.f16662C.mo19954h();
    }

    /* JADX INFO: renamed from: C2 */
    private int m19877C2() {
        if (m13411S()) {
            return 0;
        }
        return m19938w2() == 1 ? m13436i0() : m13441k0();
    }

    /* JADX INFO: renamed from: D2 */
    private int m19878D2(int i7, C4451e c4451e) {
        return m19928G2() ? (int) (((m19918o2() - c4451e.m19988i().f16715a) - (i7 * c4451e.m19986g())) - (c4451e.m19986g() / 2.0f)) : (int) (((i7 * c4451e.m19986g()) - c4451e.m19981b().f16715a) + (c4451e.m19986g() / 2.0f));
    }

    /* JADX INFO: renamed from: E2 */
    private int m19879E2(int i7, C4451e c4451e) {
        int i8 = C3553a.e.API_PRIORITY_OTHER;
        for (C4451e.c cVar : c4451e.m19985f()) {
            float fM19986g = (i7 * c4451e.m19986g()) + (c4451e.m19986g() / 2.0f);
            int iM19918o2 = (m19928G2() ? (int) ((m19918o2() - cVar.f16715a) - fM19986g) : (int) (fM19986g - cVar.f16715a)) - this.f16667s;
            if (Math.abs(i8) > Math.abs(iM19918o2)) {
                i8 = iM19918o2;
            }
        }
        return i8;
    }

    /* JADX INFO: renamed from: F2 */
    private static C4446d m19880F2(List list, float f7, boolean z7) {
        float f8 = Float.MAX_VALUE;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        float f9 = -3.4028235E38f;
        float f10 = Float.MAX_VALUE;
        float f11 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < list.size(); i11++) {
            C4451e.c cVar = (C4451e.c) list.get(i11);
            float f12 = z7 ? cVar.f16716b : cVar.f16715a;
            float fAbs = Math.abs(f12 - f7);
            if (f12 <= f7 && fAbs <= f8) {
                i7 = i11;
                f8 = fAbs;
            }
            if (f12 > f7 && fAbs <= f10) {
                i9 = i11;
                f10 = fAbs;
            }
            if (f12 <= f11) {
                i8 = i11;
                f11 = f12;
            }
            if (f12 > f9) {
                i10 = i11;
                f9 = f12;
            }
        }
        if (i7 == -1) {
            i7 = i8;
        }
        if (i9 == -1) {
            i9 = i10;
        }
        return new C4446d((C4451e.c) list.get(i7), (C4451e.c) list.get(i9));
    }

    /* JADX INFO: renamed from: H2 */
    private boolean m19881H2(float f7, C4446d c4446d) {
        float fM19905a2 = m19905a2(f7, m19924u2(f7, c4446d) / 2.0f);
        if (m19928G2()) {
            return fM19905a2 < 0.0f;
        }
        return fM19905a2 > ((float) m19918o2());
    }

    /* JADX INFO: renamed from: I2 */
    private boolean m19882I2(float f7, C4446d c4446d) {
        float fM19904Z1 = m19904Z1(f7, m19924u2(f7, c4446d) / 2.0f);
        if (m19928G2()) {
            return fM19904Z1 > ((float) m19918o2());
        }
        return fM19904Z1 < 0.0f;
    }

    /* JADX INFO: renamed from: J2 */
    private void m19883J2() {
        if (this.f16670v && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i7 = 0; i7 < m13407P(); i7++) {
                View viewM13405O = m13405O(i7);
                Log.d("CarouselLayoutManager", "item position " + m13445m0(viewM13405O) + ", center:" + m19919p2(viewM13405O) + ", child index:" + i7);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    /* JADX INFO: renamed from: K2 */
    private C4444b m19884K2(RecyclerView.C2772w c2772w, float f7, int i7) {
        View viewM13531o = c2772w.m13531o(i7);
        mo13387F0(viewM13531o, 0, 0);
        float fM19904Z1 = m19904Z1(f7, this.f16674z.m19986g() / 2.0f);
        C4446d c4446dM19880F2 = m19880F2(this.f16674z.m19987h(), fM19904Z1, false);
        return new C4444b(viewM13531o, fM19904Z1, m19909e2(fM19904Z1, c4446dM19880F2), c4446dM19880F2);
    }

    /* JADX INFO: renamed from: L2 */
    private float m19885L2(View view, float f7, float f8, Rect rect) {
        float fM19904Z1 = m19904Z1(f7, f8);
        C4446d c4446dM19880F2 = m19880F2(this.f16674z.m19987h(), fM19904Z1, false);
        float fM19909e2 = m19909e2(fM19904Z1, c4446dM19880F2);
        super.mo13415V(view, rect);
        m19897V2(view, fM19904Z1, c4446dM19880F2);
        this.f16662C.mo19956j(view, rect, f8, fM19909e2);
        return fM19909e2;
    }

    /* JADX INFO: renamed from: M2 */
    private void m19886M2(RecyclerView.C2772w c2772w) {
        View viewM13531o = c2772w.m13531o(0);
        mo13387F0(viewM13531o, 0, 0);
        C4451e c4451eMo19965g = this.f16672x.mo19965g(this, viewM13531o);
        if (m19928G2()) {
            c4451eMo19965g = C4451e.m19979p(c4451eMo19965g, m19918o2());
        }
        this.f16673y = C4452f.m20010f(this, c4451eMo19965g, m19920q2(), m19923t2(), m19877C2(), this.f16672x.m19963e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public void m19887N2() {
        this.f16673y = null;
        m13469y1();
    }

    /* JADX INFO: renamed from: O2 */
    private void m19888O2(RecyclerView.C2772w c2772w) {
        while (m13407P() > 0) {
            View viewM13405O = m13405O(0);
            float fM19919p2 = m19919p2(viewM13405O);
            if (!m19882I2(fM19919p2, m19880F2(this.f16674z.m19987h(), fM19919p2, true))) {
                break;
            } else {
                m13457r1(viewM13405O, c2772w);
            }
        }
        while (m13407P() - 1 >= 0) {
            View viewM13405O2 = m13405O(m13407P() - 1);
            float fM19919p3 = m19919p2(viewM13405O2);
            if (!m19881H2(fM19919p3, m19880F2(this.f16674z.m19987h(), fM19919p3, true))) {
                return;
            } else {
                m13457r1(viewM13405O2, c2772w);
            }
        }
    }

    /* JADX INFO: renamed from: P2 */
    private int m19889P2(int i7, RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b) {
        if (m13407P() == 0 || i7 == 0) {
            return 0;
        }
        if (this.f16673y == null) {
            m19886M2(c2772w);
        }
        if (m13428f() <= m19921r2(this.f16673y).m19993n()) {
            return 0;
        }
        int iM19912i2 = m19912i2(i7, this.f16667s, this.f16668t, this.f16669u);
        this.f16667s += iM19912i2;
        m19899W2(this.f16673y);
        float fM19986g = this.f16674z.m19986g() / 2.0f;
        float fM19910f2 = m19910f2(m13445m0(m13405O(0)));
        Rect rect = new Rect();
        float f7 = m19928G2() ? this.f16674z.m19988i().f16716b : this.f16674z.m19981b().f16716b;
        float f8 = Float.MAX_VALUE;
        for (int i8 = 0; i8 < m13407P(); i8++) {
            View viewM13405O = m13405O(i8);
            float fAbs = Math.abs(f7 - m19885L2(viewM13405O, fM19910f2, fM19986g, rect));
            if (viewM13405O != null && fAbs < f8) {
                this.f16665F = m13445m0(viewM13405O);
                f8 = fAbs;
            }
            fM19910f2 = m19904Z1(fM19910f2, this.f16674z.m19986g());
        }
        m19915l2(c2772w, c2746b);
        return iM19912i2;
    }

    /* JADX INFO: renamed from: Q2 */
    private void m19890Q2(RecyclerView recyclerView, int i7) {
        if (mo19935g()) {
            recyclerView.scrollBy(i7, 0);
        } else {
            recyclerView.scrollBy(0, i7);
        }
    }

    /* JADX INFO: renamed from: S1 */
    public static /* synthetic */ void m19892S1(final CarouselLayoutManager carouselLayoutManager, View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        carouselLayoutManager.getClass();
        if (i9 - i7 == i13 - i11 && i10 - i8 == i14 - i12) {
            return;
        }
        view.post(new Runnable() { // from class: v3.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f28813a.m19887N2();
            }
        });
    }

    /* JADX INFO: renamed from: S2 */
    private void m19893S2(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6752m.f26662J0);
            m19929R2(typedArrayObtainStyledAttributes.getInt(AbstractC6752m.f26673K0, 0));
            m19931U2(typedArrayObtainStyledAttributes.getInt(AbstractC7382d.f29595g, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: V2 */
    private void m19897V2(View view, float f7, C4446d c4446d) {
    }

    /* JADX INFO: renamed from: W2 */
    private void m19899W2(C4452f c4452f) {
        int i7 = this.f16669u;
        int i8 = this.f16668t;
        if (i7 <= i8) {
            this.f16674z = m19921r2(c4452f);
        } else {
            this.f16674z = c4452f.m20026j(this.f16667s, i8, i7);
        }
        this.f16671w.m19939l(this.f16674z.m19987h());
    }

    /* JADX INFO: renamed from: X2 */
    private void m19901X2() {
        int iM13428f = m13428f();
        int i7 = this.f16664E;
        if (iM13428f == i7 || this.f16673y == null) {
            return;
        }
        if (this.f16672x.mo19966h(this, i7)) {
            m19887N2();
        }
        this.f16664E = iM13428f;
    }

    /* JADX INFO: renamed from: Y1 */
    private void m19902Y1(View view, int i7, C4444b c4444b) {
        float fM19986g = this.f16674z.m19986g() / 2.0f;
        m13440k(view, i7);
        mo13387F0(view, 0, 0);
        float f7 = c4444b.f16678c;
        this.f16662C.mo19955i(view, (int) (f7 - fM19986g), (int) (f7 + fM19986g));
        m19897V2(view, c4444b.f16677b, c4444b.f16679d);
    }

    /* JADX INFO: renamed from: Y2 */
    private void m19903Y2() {
        if (!this.f16670v || m13407P() < 1) {
            return;
        }
        int i7 = 0;
        while (i7 < m13407P() - 1) {
            int iM13445m0 = m13445m0(m13405O(i7));
            int i8 = i7 + 1;
            int iM13445m1 = m13445m0(m13405O(i8));
            if (iM13445m0 > iM13445m1) {
                m19883J2();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i7 + "] had adapter position [" + iM13445m0 + "] and child at index [" + i8 + "] had adapter position [" + iM13445m1 + "].");
            }
            i7 = i8;
        }
    }

    /* JADX INFO: renamed from: Z1 */
    private float m19904Z1(float f7, float f8) {
        return m19928G2() ? f7 - f8 : f7 + f8;
    }

    /* JADX INFO: renamed from: a2 */
    private float m19905a2(float f7, float f8) {
        return m19928G2() ? f7 + f8 : f7 - f8;
    }

    /* JADX INFO: renamed from: b2 */
    private void m19906b2(RecyclerView.C2772w c2772w, int i7, int i8) {
        if (i7 < 0 || i7 >= m13428f()) {
            return;
        }
        C4444b c4444bM19884K2 = m19884K2(c2772w, m19910f2(i7), i7);
        m19902Y1(c4444bM19884K2.f16676a, i8, c4444bM19884K2);
    }

    /* JADX INFO: renamed from: c2 */
    private void m19907c2(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b, int i7) {
        float fM19910f2 = m19910f2(i7);
        while (i7 < c2746b.m13239b()) {
            float fM19904Z1 = m19904Z1(fM19910f2, this.f16674z.m19986g() / 2.0f);
            C4446d c4446dM19880F2 = m19880F2(this.f16674z.m19987h(), fM19904Z1, false);
            float fM19909e2 = m19909e2(fM19904Z1, c4446dM19880F2);
            if (m19881H2(fM19909e2, c4446dM19880F2)) {
                return;
            }
            fM19910f2 = m19904Z1(fM19910f2, this.f16674z.m19986g());
            if (!m19882I2(fM19909e2, c4446dM19880F2)) {
                View viewM13531o = c2772w.m13531o(i7);
                m19902Y1(viewM13531o, -1, new C4444b(viewM13531o, fM19904Z1, fM19909e2, c4446dM19880F2));
            }
            i7++;
        }
    }

    /* JADX INFO: renamed from: d2 */
    private void m19908d2(RecyclerView.C2772w c2772w, int i7) {
        float fM19910f2 = m19910f2(i7);
        while (i7 >= 0) {
            float fM19904Z1 = m19904Z1(fM19910f2, this.f16674z.m19986g() / 2.0f);
            C4446d c4446dM19880F2 = m19880F2(this.f16674z.m19987h(), fM19904Z1, false);
            float fM19909e2 = m19909e2(fM19904Z1, c4446dM19880F2);
            if (m19882I2(fM19909e2, c4446dM19880F2)) {
                return;
            }
            fM19910f2 = m19905a2(fM19910f2, this.f16674z.m19986g());
            if (!m19881H2(fM19909e2, c4446dM19880F2)) {
                View viewM13531o = c2772w.m13531o(i7);
                m19902Y1(viewM13531o, 0, new C4444b(viewM13531o, fM19904Z1, fM19909e2, c4446dM19880F2));
            }
            i7--;
        }
    }

    /* JADX INFO: renamed from: e2 */
    private float m19909e2(float f7, C4446d c4446d) {
        C4451e.c cVar = c4446d.f16682a;
        float f8 = cVar.f16716b;
        C4451e.c cVar2 = c4446d.f16683b;
        float fM29844b = AbstractC6826a.m29844b(f8, cVar2.f16716b, cVar.f16715a, cVar2.f16715a, f7);
        if (c4446d.f16683b != this.f16674z.m19983d() && c4446d.f16682a != this.f16674z.m19990k()) {
            return fM29844b;
        }
        C4451e.c cVar3 = c4446d.f16683b;
        return fM29844b + ((f7 - cVar3.f16715a) * (1.0f - cVar3.f16717c));
    }

    /* JADX INFO: renamed from: f2 */
    private float m19910f2(int i7) {
        return m19904Z1(m19875A2() - this.f16667s, this.f16674z.m19986g() * i7);
    }

    /* JADX INFO: renamed from: g2 */
    private int m19911g2(RecyclerView.C2746B c2746b, C4452f c4452f) {
        boolean zM19928G2 = m19928G2();
        C4451e c4451eM20028l = zM19928G2 ? c4452f.m20028l() : c4452f.m20024h();
        C4451e.c cVarM19981b = zM19928G2 ? c4451eM20028l.m19981b() : c4451eM20028l.m19988i();
        int iM13239b = (int) (((((c2746b.m13239b() - 1) * c4451eM20028l.m19986g()) * (zM19928G2 ? -1.0f : 1.0f)) - (cVarM19981b.f16715a - m19875A2())) + (((zM19928G2 ? -1 : 1) * cVarM19981b.f16718d) / 2.0f));
        return zM19928G2 ? Math.min(0, iM13239b) : Math.max(0, iM13239b);
    }

    /* JADX INFO: renamed from: i2 */
    private static int m19912i2(int i7, int i8, int i9, int i10) {
        int i11 = i8 + i7;
        if (i11 < i9) {
            return i9 - i8;
        }
        return i11 > i10 ? i10 - i8 : i7;
    }

    /* JADX INFO: renamed from: j2 */
    private int m19913j2(C4452f c4452f) {
        boolean zM19928G2 = m19928G2();
        C4451e c4451eM20024h = zM19928G2 ? c4452f.m20024h() : c4452f.m20028l();
        return (int) (m19875A2() - m19905a2((zM19928G2 ? c4451eM20024h.m19988i() : c4451eM20024h.m19981b()).f16715a, c4451eM20024h.m19986g() / 2.0f));
    }

    /* JADX INFO: renamed from: k2 */
    private int m19914k2(int i7) {
        int iM19938w2 = m19938w2();
        if (i7 == 1) {
            return -1;
        }
        if (i7 == 2) {
            return 1;
        }
        if (i7 == 17) {
            if (iM19938w2 == 0) {
                return m19928G2() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i7 == 33) {
            return iM19938w2 == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i7 == 66) {
            if (iM19938w2 == 0) {
                return m19928G2() ? -1 : 1;
            }
            return Integer.MIN_VALUE;
        }
        if (i7 == 130) {
            return iM19938w2 == 1 ? 1 : Integer.MIN_VALUE;
        }
        Log.d("CarouselLayoutManager", "Unknown focus request:" + i7);
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: l2 */
    private void m19915l2(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b) {
        m19888O2(c2772w);
        if (m13407P() == 0) {
            m19908d2(c2772w, this.f16660A - 1);
            m19907c2(c2772w, c2746b, this.f16660A);
        } else {
            int iM13445m0 = m13445m0(m13405O(0));
            int iM13445m1 = m13445m0(m13405O(m13407P() - 1));
            m19908d2(c2772w, iM13445m0 - 1);
            m19907c2(c2772w, c2746b, iM13445m1 + 1);
        }
        m19903Y2();
    }

    /* JADX INFO: renamed from: m2 */
    private View m19916m2() {
        return m13405O(m19928G2() ? 0 : m13407P() - 1);
    }

    /* JADX INFO: renamed from: n2 */
    private View m19917n2() {
        return m13405O(m19928G2() ? m13407P() - 1 : 0);
    }

    /* JADX INFO: renamed from: o2 */
    private int m19918o2() {
        return mo19935g() ? mo19932a() : mo19933b();
    }

    /* JADX INFO: renamed from: p2 */
    private float m19919p2(View view) {
        Rect rect = new Rect();
        super.mo13415V(view, rect);
        return mo19935g() ? rect.centerX() : rect.centerY();
    }

    /* JADX INFO: renamed from: q2 */
    private int m19920q2() {
        int i7;
        int i8;
        if (m13407P() <= 0) {
            return 0;
        }
        RecyclerView.C2766q c2766q = (RecyclerView.C2766q) m13405O(0).getLayoutParams();
        if (this.f16662C.f16692a == 0) {
            i7 = ((ViewGroup.MarginLayoutParams) c2766q).leftMargin;
            i8 = ((ViewGroup.MarginLayoutParams) c2766q).rightMargin;
        } else {
            i7 = ((ViewGroup.MarginLayoutParams) c2766q).topMargin;
            i8 = ((ViewGroup.MarginLayoutParams) c2766q).bottomMargin;
        }
        return i7 + i8;
    }

    /* JADX INFO: renamed from: r2 */
    private C4451e m19921r2(C4452f c4452f) {
        return m19928G2() ? c4452f.m20024h() : c4452f.m20028l();
    }

    /* JADX INFO: renamed from: s2 */
    private C4451e m19922s2(int i7) {
        C4451e c4451e;
        Map map = this.f16661B;
        return (map == null || (c4451e = (C4451e) map.get(Integer.valueOf(AbstractC0577a.m2541b(i7, 0, Math.max(0, m13428f() + (-1)))))) == null) ? this.f16673y.m20023g() : c4451e;
    }

    /* JADX INFO: renamed from: t2 */
    private int m19923t2() {
        if (m13411S()) {
            return 0;
        }
        return m19938w2() == 1 ? m13443l0() : m13438j0();
    }

    /* JADX INFO: renamed from: u2 */
    private float m19924u2(float f7, C4446d c4446d) {
        C4451e.c cVar = c4446d.f16682a;
        float f8 = cVar.f16718d;
        C4451e.c cVar2 = c4446d.f16683b;
        return AbstractC6826a.m29844b(f8, cVar2.f16718d, cVar.f16716b, cVar2.f16716b, f7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x2 */
    public int m19925x2() {
        return this.f16662C.mo19950d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public int m19926y2() {
        return this.f16662C.mo19951e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public int m19927z2() {
        return this.f16662C.mo19952f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: A */
    public int mo12965A(RecyclerView.C2746B c2746b) {
        return this.f16667s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: B */
    public int mo12966B(RecyclerView.C2746B c2746b) {
        return this.f16669u - this.f16668t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: B1 */
    public int mo12967B1(int i7, RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b) {
        if (mo13060q()) {
            return m19889P2(i7, c2772w, c2746b);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: C1 */
    public void mo13033C1(int i7) {
        this.f16665F = i7;
        if (this.f16673y == null) {
            return;
        }
        this.f16667s = m19878D2(i7, m19922s2(i7));
        this.f16660A = AbstractC0577a.m2541b(i7, 0, Math.max(0, m13428f() - 1));
        m19899W2(this.f16673y);
        m13469y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: D1 */
    public int mo12968D1(int i7, RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b) {
        if (mo13062r()) {
            return m19889P2(i7, c2772w, c2746b);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: F0 */
    public void mo13387F0(View view, int i7, int i8) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    /* JADX INFO: renamed from: G2 */
    boolean m19928G2() {
        return mo19935g() && m13426e0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: J */
    public RecyclerView.C2766q mo12971J() {
        return new RecyclerView.C2766q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: L0 */
    public void mo13400L0(RecyclerView recyclerView) {
        super.mo13400L0(recyclerView);
        this.f16672x.m19964f(recyclerView.getContext());
        m19887N2();
        recyclerView.addOnLayoutChangeListener(this.f16663D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: N0 */
    public void mo13040N0(RecyclerView recyclerView, RecyclerView.C2772w c2772w) {
        super.mo13040N0(recyclerView, c2772w);
        recyclerView.removeOnLayoutChangeListener(this.f16663D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: N1 */
    public void mo13041N1(RecyclerView recyclerView, RecyclerView.C2746B c2746b, int i7) {
        C4443a c4443a = new C4443a(recyclerView.getContext());
        c4443a.m13230p(i7);
        m13406O1(c4443a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: O0 */
    public View mo12974O0(View view, int i7, RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b) {
        int iM19914k2;
        if (m13407P() == 0 || (iM19914k2 = m19914k2(i7)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iM19914k2 == -1) {
            if (m13445m0(view) == 0) {
                return null;
            }
            m19906b2(c2772w, m13445m0(m13405O(0)) - 1, 0);
            return m19917n2();
        }
        if (m13445m0(view) == m13428f() - 1) {
            return null;
        }
        m19906b2(c2772w, m13445m0(m13405O(m13407P() - 1)) + 1, -1);
        return m19916m2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: P0 */
    public void mo13042P0(AccessibilityEvent accessibilityEvent) {
        super.mo13042P0(accessibilityEvent);
        if (m13407P() > 0) {
            accessibilityEvent.setFromIndex(m13445m0(m13405O(0)));
            accessibilityEvent.setToIndex(m13445m0(m13405O(m13407P() - 1)));
        }
    }

    /* JADX INFO: renamed from: R2 */
    public void m19929R2(int i7) {
        this.f16666G = i7;
        m19887N2();
    }

    /* JADX INFO: renamed from: T2 */
    public void m19930T2(AbstractC4449c abstractC4449c) {
        this.f16672x = abstractC4449c;
        m19887N2();
    }

    /* JADX INFO: renamed from: U2 */
    public void m19931U2(int i7) {
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i7);
        }
        mo13058m(null);
        AbstractC4448b abstractC4448b = this.f16662C;
        if (abstractC4448b == null || i7 != abstractC4448b.f16692a) {
            this.f16662C = AbstractC4448b.m19948b(this, i7);
            m19887N2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: V */
    public void mo13415V(View view, Rect rect) {
        super.mo13415V(view, rect);
        float fCenterY = rect.centerY();
        if (mo19935g()) {
            fCenterY = rect.centerX();
        }
        float fM19924u2 = m19924u2(fCenterY, m19880F2(this.f16674z.m19987h(), fCenterY, true));
        float fWidth = mo19935g() ? (rect.width() - fM19924u2) / 2.0f : 0.0f;
        float fHeight = mo19935g() ? 0.0f : (rect.height() - fM19924u2) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: W0 */
    public void mo12979W0(RecyclerView recyclerView, int i7, int i8) {
        super.mo12979W0(recyclerView, i7, i8);
        m19901X2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: X0 */
    public void mo12980X0(RecyclerView recyclerView) {
        super.mo12980X0(recyclerView);
        m19901X2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: Z0 */
    public void mo12983Z0(RecyclerView recyclerView, int i7, int i8) {
        super.mo12983Z0(recyclerView, i7, i8);
        m19901X2();
    }

    @Override // p373v3.InterfaceC7227a
    /* JADX INFO: renamed from: a */
    public int mo19932a() {
        return m13460t0();
    }

    @Override // p373v3.InterfaceC7227a
    /* JADX INFO: renamed from: b */
    public int mo19933b() {
        return m13424c0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2745A.b
    /* JADX INFO: renamed from: c */
    public PointF mo13049c(int i7) {
        if (this.f16673y == null) {
            return null;
        }
        int iM19937v2 = m19937v2(i7, m19922s2(i7));
        return mo19935g() ? new PointF(iM19937v2, 0.0f) : new PointF(0.0f, iM19937v2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: c1 */
    public void mo12986c1(RecyclerView.C2772w c2772w, RecyclerView.C2746B c2746b) {
        if (c2746b.m13239b() <= 0 || m19918o2() <= 0.0f) {
            m13453p1(c2772w);
            this.f16660A = 0;
            return;
        }
        boolean zM19928G2 = m19928G2();
        C4452f c4452f = this.f16673y;
        boolean z7 = c4452f == null;
        if (z7 || c4452f.m20023g().m19980a() != m19918o2()) {
            m19886M2(c2772w);
        }
        int iM19913j2 = m19913j2(this.f16673y);
        int iM19911g2 = m19911g2(c2746b, this.f16673y);
        this.f16668t = zM19928G2 ? iM19911g2 : iM19913j2;
        if (zM19928G2) {
            iM19911g2 = iM19913j2;
        }
        this.f16669u = iM19911g2;
        if (z7) {
            this.f16667s = iM19913j2;
            this.f16661B = this.f16673y.m20025i(m13428f(), this.f16668t, this.f16669u, m19928G2());
            int i7 = this.f16665F;
            if (i7 != -1) {
                this.f16667s = m19878D2(i7, m19922s2(i7));
            }
        }
        int i8 = this.f16667s;
        this.f16667s = i8 + m19912i2(0, i8, this.f16668t, this.f16669u);
        this.f16660A = AbstractC0577a.m2541b(this.f16660A, 0, c2746b.m13239b());
        m19899W2(this.f16673y);
        m13380C(c2772w);
        m19915l2(c2772w, c2746b);
        this.f16664E = m13428f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: d1 */
    public void mo12987d1(RecyclerView.C2746B c2746b) {
        super.mo12987d1(c2746b);
        if (m13407P() == 0) {
            this.f16660A = 0;
        } else {
            this.f16660A = m13445m0(m13405O(0));
        }
        m19903Y2();
    }

    @Override // p373v3.InterfaceC7227a
    /* JADX INFO: renamed from: e */
    public int mo19934e() {
        return this.f16666G;
    }

    @Override // p373v3.InterfaceC7227a
    /* JADX INFO: renamed from: g */
    public boolean mo19935g() {
        return this.f16662C.f16692a == 0;
    }

    /* JADX INFO: renamed from: h2 */
    int m19936h2(int i7) {
        return (int) (this.f16667s - m19878D2(i7, m19922s2(i7)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: q */
    public boolean mo13060q() {
        return mo19935g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: r */
    public boolean mo13062r() {
        return !mo19935g();
    }

    /* JADX INFO: renamed from: v2 */
    int m19937v2(int i7, C4451e c4451e) {
        return m19878D2(i7, c4451e) - this.f16667s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: w */
    public int mo13067w(RecyclerView.C2746B c2746b) {
        if (m13407P() == 0 || this.f16673y == null || m13428f() <= 1) {
            return 0;
        }
        return (int) (m13460t0() * (this.f16673y.m20023g().m19986g() / mo12996y(c2746b)));
    }

    /* JADX INFO: renamed from: w2 */
    public int m19938w2() {
        return this.f16662C.f16692a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: x */
    public int mo12995x(RecyclerView.C2746B c2746b) {
        return this.f16667s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: x0 */
    public boolean mo13068x0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: x1 */
    public boolean mo13468x1(RecyclerView recyclerView, View view, Rect rect, boolean z7, boolean z8) {
        int iM19879E2;
        if (this.f16673y == null || (iM19879E2 = m19879E2(m13445m0(view), m19922s2(m13445m0(view)))) == 0) {
            return false;
        }
        m19890Q2(recyclerView, m19879E2(m13445m0(view), this.f16673y.m20026j(this.f16667s + m19912i2(iM19879E2, this.f16667s, this.f16668t, this.f16669u), this.f16668t, this.f16669u)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: y */
    public int mo12996y(RecyclerView.C2746B c2746b) {
        return this.f16669u - this.f16668t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p
    /* JADX INFO: renamed from: z */
    public int mo13069z(RecyclerView.C2746B c2746b) {
        if (m13407P() == 0 || this.f16673y == null || m13428f() <= 1) {
            return 0;
        }
        return (int) (m13424c0() * (this.f16673y.m20023g().m19986g() / mo12966B(c2746b)));
    }

    public CarouselLayoutManager(AbstractC4449c abstractC4449c) {
        this(abstractC4449c, 0);
    }

    public CarouselLayoutManager(AbstractC4449c abstractC4449c, int i7) {
        this.f16670v = false;
        this.f16671w = new C4445c();
        this.f16660A = 0;
        this.f16663D = new View.OnLayoutChangeListener() { // from class: v3.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                CarouselLayoutManager.m19892S1(this.f28812a, view, i8, i9, i10, i11, i12, i13, i14, i15);
            }
        };
        this.f16665F = -1;
        this.f16666G = 0;
        m19930T2(abstractC4449c);
        m19931U2(i7);
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f16670v = false;
        this.f16671w = new C4445c();
        this.f16660A = 0;
        this.f16663D = new View.OnLayoutChangeListener() { // from class: v3.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                CarouselLayoutManager.m19892S1(this.f28812a, view, i9, i10, i11, i12, i13, i14, i15, i16);
            }
        };
        this.f16665F = -1;
        this.f16666G = 0;
        m19930T2(new C4453g());
        m19893S2(context, attributeSet);
    }
}
