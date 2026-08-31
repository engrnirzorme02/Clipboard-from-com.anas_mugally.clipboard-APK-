package p069I3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p325p3.AbstractC6752m;

/* JADX INFO: renamed from: I3.n */
/* JADX INFO: loaded from: classes2.dex */
public class C0627n {

    /* JADX INFO: renamed from: m */
    public static final InterfaceC0617d f2403m = new C0625l(0.5f);

    /* JADX INFO: renamed from: a */
    AbstractC0618e f2404a;

    /* JADX INFO: renamed from: b */
    AbstractC0618e f2405b;

    /* JADX INFO: renamed from: c */
    AbstractC0618e f2406c;

    /* JADX INFO: renamed from: d */
    AbstractC0618e f2407d;

    /* JADX INFO: renamed from: e */
    InterfaceC0617d f2408e;

    /* JADX INFO: renamed from: f */
    InterfaceC0617d f2409f;

    /* JADX INFO: renamed from: g */
    InterfaceC0617d f2410g;

    /* JADX INFO: renamed from: h */
    InterfaceC0617d f2411h;

    /* JADX INFO: renamed from: i */
    C0620g f2412i;

    /* JADX INFO: renamed from: j */
    C0620g f2413j;

    /* JADX INFO: renamed from: k */
    C0620g f2414k;

    /* JADX INFO: renamed from: l */
    C0620g f2415l;

    /* JADX INFO: renamed from: I3.n$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        InterfaceC0617d mo2738a(InterfaceC0617d interfaceC0617d);
    }

    /* JADX INFO: renamed from: a */
    public static b m2754a() {
        return new b();
    }

    /* JADX INFO: renamed from: b */
    public static b m2755b(Context context, int i7, int i8) {
        return m2756c(context, i7, i8, 0);
    }

    /* JADX INFO: renamed from: c */
    private static b m2756c(Context context, int i7, int i8, int i9) {
        return m2757d(context, i7, i8, new C0614a(i9));
    }

    /* JADX INFO: renamed from: d */
    private static b m2757d(Context context, int i7, int i8, InterfaceC0617d interfaceC0617d) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i7);
        if (i8 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i8, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC6752m.f26972l6);
        try {
            int i9 = typedArrayObtainStyledAttributes.getInt(AbstractC6752m.f26983m6, 0);
            int i10 = typedArrayObtainStyledAttributes.getInt(AbstractC6752m.f27016p6, i9);
            int i11 = typedArrayObtainStyledAttributes.getInt(AbstractC6752m.f27027q6, i9);
            int i12 = typedArrayObtainStyledAttributes.getInt(AbstractC6752m.f27005o6, i9);
            int i13 = typedArrayObtainStyledAttributes.getInt(AbstractC6752m.f26994n6, i9);
            InterfaceC0617d interfaceC0617dM2761m = m2761m(typedArrayObtainStyledAttributes, AbstractC6752m.f27038r6, interfaceC0617d);
            InterfaceC0617d interfaceC0617dM2761m2 = m2761m(typedArrayObtainStyledAttributes, AbstractC6752m.f27071u6, interfaceC0617dM2761m);
            InterfaceC0617d interfaceC0617dM2761m3 = m2761m(typedArrayObtainStyledAttributes, AbstractC6752m.f27082v6, interfaceC0617dM2761m);
            InterfaceC0617d interfaceC0617dM2761m4 = m2761m(typedArrayObtainStyledAttributes, AbstractC6752m.f27060t6, interfaceC0617dM2761m);
            return new b().m2794B(i10, interfaceC0617dM2761m2).m2798F(i11, interfaceC0617dM2761m3).m2812x(i12, interfaceC0617dM2761m4).m2808t(i13, m2761m(typedArrayObtainStyledAttributes, AbstractC6752m.f27049s6, interfaceC0617dM2761m));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: e */
    public static b m2758e(Context context, AttributeSet attributeSet, int i7, int i8) {
        return m2759f(context, attributeSet, i7, i8, 0);
    }

    /* JADX INFO: renamed from: f */
    public static b m2759f(Context context, AttributeSet attributeSet, int i7, int i8, int i9) {
        return m2760g(context, attributeSet, i7, i8, new C0614a(i9));
    }

    /* JADX INFO: renamed from: g */
    public static b m2760g(Context context, AttributeSet attributeSet, int i7, int i8, InterfaceC0617d interfaceC0617d) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6752m.f26677K4, i7, i8);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC6752m.f26688L4, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(AbstractC6752m.f26699M4, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m2757d(context, resourceId, resourceId2, interfaceC0617d);
    }

    /* JADX INFO: renamed from: m */
    public static InterfaceC0617d m2761m(TypedArray typedArray, int i7, InterfaceC0617d interfaceC0617d) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i7);
        if (typedValuePeekValue != null) {
            int i8 = typedValuePeekValue.type;
            if (i8 == 5) {
                return new C0614a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i8 == 6) {
                return new C0625l(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC0617d;
    }

    /* JADX INFO: renamed from: h */
    public C0620g m2762h() {
        return this.f2414k;
    }

    /* JADX INFO: renamed from: i */
    public AbstractC0618e m2763i() {
        return this.f2407d;
    }

    /* JADX INFO: renamed from: j */
    public InterfaceC0617d m2764j() {
        return this.f2411h;
    }

    /* JADX INFO: renamed from: k */
    public AbstractC0618e m2765k() {
        return this.f2406c;
    }

    /* JADX INFO: renamed from: l */
    public InterfaceC0617d m2766l() {
        return this.f2410g;
    }

    /* JADX INFO: renamed from: n */
    public C0620g m2767n() {
        return this.f2415l;
    }

    /* JADX INFO: renamed from: o */
    public C0620g m2768o() {
        return this.f2413j;
    }

    /* JADX INFO: renamed from: p */
    public C0620g m2769p() {
        return this.f2412i;
    }

    /* JADX INFO: renamed from: q */
    public AbstractC0618e m2770q() {
        return this.f2404a;
    }

    /* JADX INFO: renamed from: r */
    public InterfaceC0617d m2771r() {
        return this.f2408e;
    }

    /* JADX INFO: renamed from: s */
    public AbstractC0618e m2772s() {
        return this.f2405b;
    }

    /* JADX INFO: renamed from: t */
    public InterfaceC0617d m2773t() {
        return this.f2409f;
    }

    public String toString() {
        return "[" + m2771r() + ", " + m2773t() + ", " + m2766l() + ", " + m2764j() + "]";
    }

    /* JADX INFO: renamed from: u */
    public boolean m2774u() {
        return (this.f2405b instanceof C0626m) && (this.f2404a instanceof C0626m) && (this.f2406c instanceof C0626m) && (this.f2407d instanceof C0626m);
    }

    /* JADX INFO: renamed from: v */
    public boolean m2775v(RectF rectF) {
        boolean z7 = this.f2415l.getClass().equals(C0620g.class) && this.f2413j.getClass().equals(C0620g.class) && this.f2412i.getClass().equals(C0620g.class) && this.f2414k.getClass().equals(C0620g.class);
        float fMo2655a = this.f2408e.mo2655a(rectF);
        return z7 && ((this.f2409f.mo2655a(rectF) > fMo2655a ? 1 : (this.f2409f.mo2655a(rectF) == fMo2655a ? 0 : -1)) == 0 && (this.f2411h.mo2655a(rectF) > fMo2655a ? 1 : (this.f2411h.mo2655a(rectF) == fMo2655a ? 0 : -1)) == 0 && (this.f2410g.mo2655a(rectF) > fMo2655a ? 1 : (this.f2410g.mo2655a(rectF) == fMo2655a ? 0 : -1)) == 0) && m2774u();
    }

    /* JADX INFO: renamed from: w */
    public b m2776w() {
        return new b(this);
    }

    /* JADX INFO: renamed from: x */
    public C0627n m2777x(float f7) {
        return m2776w().m2803o(f7).m2802m();
    }

    /* JADX INFO: renamed from: y */
    public C0627n m2778y(InterfaceC0617d interfaceC0617d) {
        return m2776w().m2804p(interfaceC0617d).m2802m();
    }

    /* JADX INFO: renamed from: z */
    public C0627n m2779z(c cVar) {
        return m2776w().m2797E(cVar.mo2738a(m2771r())).m2801I(cVar.mo2738a(m2773t())).m2811w(cVar.mo2738a(m2764j())).m2793A(cVar.mo2738a(m2766l())).m2802m();
    }

    private C0627n(b bVar) {
        this.f2404a = bVar.f2416a;
        this.f2405b = bVar.f2417b;
        this.f2406c = bVar.f2418c;
        this.f2407d = bVar.f2419d;
        this.f2408e = bVar.f2420e;
        this.f2409f = bVar.f2421f;
        this.f2410g = bVar.f2422g;
        this.f2411h = bVar.f2423h;
        this.f2412i = bVar.f2424i;
        this.f2413j = bVar.f2425j;
        this.f2414k = bVar.f2426k;
        this.f2415l = bVar.f2427l;
    }

    /* JADX INFO: renamed from: I3.n$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private AbstractC0618e f2416a;

        /* JADX INFO: renamed from: b */
        private AbstractC0618e f2417b;

        /* JADX INFO: renamed from: c */
        private AbstractC0618e f2418c;

        /* JADX INFO: renamed from: d */
        private AbstractC0618e f2419d;

        /* JADX INFO: renamed from: e */
        private InterfaceC0617d f2420e;

        /* JADX INFO: renamed from: f */
        private InterfaceC0617d f2421f;

        /* JADX INFO: renamed from: g */
        private InterfaceC0617d f2422g;

        /* JADX INFO: renamed from: h */
        private InterfaceC0617d f2423h;

        /* JADX INFO: renamed from: i */
        private C0620g f2424i;

        /* JADX INFO: renamed from: j */
        private C0620g f2425j;

        /* JADX INFO: renamed from: k */
        private C0620g f2426k;

        /* JADX INFO: renamed from: l */
        private C0620g f2427l;

        public b() {
            this.f2416a = AbstractC0623j.m2747b();
            this.f2417b = AbstractC0623j.m2747b();
            this.f2418c = AbstractC0623j.m2747b();
            this.f2419d = AbstractC0623j.m2747b();
            this.f2420e = new C0614a(0.0f);
            this.f2421f = new C0614a(0.0f);
            this.f2422g = new C0614a(0.0f);
            this.f2423h = new C0614a(0.0f);
            this.f2424i = AbstractC0623j.m2748c();
            this.f2425j = AbstractC0623j.m2748c();
            this.f2426k = AbstractC0623j.m2748c();
            this.f2427l = AbstractC0623j.m2748c();
        }

        /* JADX INFO: renamed from: n */
        private static float m2792n(AbstractC0618e abstractC0618e) {
            if (abstractC0618e instanceof C0626m) {
                return ((C0626m) abstractC0618e).f2402a;
            }
            if (abstractC0618e instanceof C0619f) {
                return ((C0619f) abstractC0618e).f2336a;
            }
            return -1.0f;
        }

        /* JADX INFO: renamed from: A */
        public b m2793A(InterfaceC0617d interfaceC0617d) {
            this.f2422g = interfaceC0617d;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public b m2794B(int i7, InterfaceC0617d interfaceC0617d) {
            return m2795C(AbstractC0623j.m2746a(i7)).m2797E(interfaceC0617d);
        }

        /* JADX INFO: renamed from: C */
        public b m2795C(AbstractC0618e abstractC0618e) {
            this.f2416a = abstractC0618e;
            float fM2792n = m2792n(abstractC0618e);
            if (fM2792n != -1.0f) {
                m2796D(fM2792n);
            }
            return this;
        }

        /* JADX INFO: renamed from: D */
        public b m2796D(float f7) {
            this.f2420e = new C0614a(f7);
            return this;
        }

        /* JADX INFO: renamed from: E */
        public b m2797E(InterfaceC0617d interfaceC0617d) {
            this.f2420e = interfaceC0617d;
            return this;
        }

        /* JADX INFO: renamed from: F */
        public b m2798F(int i7, InterfaceC0617d interfaceC0617d) {
            return m2799G(AbstractC0623j.m2746a(i7)).m2801I(interfaceC0617d);
        }

        /* JADX INFO: renamed from: G */
        public b m2799G(AbstractC0618e abstractC0618e) {
            this.f2417b = abstractC0618e;
            float fM2792n = m2792n(abstractC0618e);
            if (fM2792n != -1.0f) {
                m2800H(fM2792n);
            }
            return this;
        }

        /* JADX INFO: renamed from: H */
        public b m2800H(float f7) {
            this.f2421f = new C0614a(f7);
            return this;
        }

        /* JADX INFO: renamed from: I */
        public b m2801I(InterfaceC0617d interfaceC0617d) {
            this.f2421f = interfaceC0617d;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C0627n m2802m() {
            return new C0627n(this);
        }

        /* JADX INFO: renamed from: o */
        public b m2803o(float f7) {
            return m2796D(f7).m2800H(f7).m2814z(f7).m2810v(f7);
        }

        /* JADX INFO: renamed from: p */
        public b m2804p(InterfaceC0617d interfaceC0617d) {
            return m2797E(interfaceC0617d).m2801I(interfaceC0617d).m2793A(interfaceC0617d).m2811w(interfaceC0617d);
        }

        /* JADX INFO: renamed from: q */
        public b m2805q(int i7, float f7) {
            return m2806r(AbstractC0623j.m2746a(i7)).m2803o(f7);
        }

        /* JADX INFO: renamed from: r */
        public b m2806r(AbstractC0618e abstractC0618e) {
            return m2795C(abstractC0618e).m2799G(abstractC0618e).m2813y(abstractC0618e).m2809u(abstractC0618e);
        }

        /* JADX INFO: renamed from: s */
        public b m2807s(C0620g c0620g) {
            this.f2426k = c0620g;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public b m2808t(int i7, InterfaceC0617d interfaceC0617d) {
            return m2809u(AbstractC0623j.m2746a(i7)).m2811w(interfaceC0617d);
        }

        /* JADX INFO: renamed from: u */
        public b m2809u(AbstractC0618e abstractC0618e) {
            this.f2419d = abstractC0618e;
            float fM2792n = m2792n(abstractC0618e);
            if (fM2792n != -1.0f) {
                m2810v(fM2792n);
            }
            return this;
        }

        /* JADX INFO: renamed from: v */
        public b m2810v(float f7) {
            this.f2423h = new C0614a(f7);
            return this;
        }

        /* JADX INFO: renamed from: w */
        public b m2811w(InterfaceC0617d interfaceC0617d) {
            this.f2423h = interfaceC0617d;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public b m2812x(int i7, InterfaceC0617d interfaceC0617d) {
            return m2813y(AbstractC0623j.m2746a(i7)).m2793A(interfaceC0617d);
        }

        /* JADX INFO: renamed from: y */
        public b m2813y(AbstractC0618e abstractC0618e) {
            this.f2418c = abstractC0618e;
            float fM2792n = m2792n(abstractC0618e);
            if (fM2792n != -1.0f) {
                m2814z(fM2792n);
            }
            return this;
        }

        /* JADX INFO: renamed from: z */
        public b m2814z(float f7) {
            this.f2422g = new C0614a(f7);
            return this;
        }

        public b(C0627n c0627n) {
            this.f2416a = AbstractC0623j.m2747b();
            this.f2417b = AbstractC0623j.m2747b();
            this.f2418c = AbstractC0623j.m2747b();
            this.f2419d = AbstractC0623j.m2747b();
            this.f2420e = new C0614a(0.0f);
            this.f2421f = new C0614a(0.0f);
            this.f2422g = new C0614a(0.0f);
            this.f2423h = new C0614a(0.0f);
            this.f2424i = AbstractC0623j.m2748c();
            this.f2425j = AbstractC0623j.m2748c();
            this.f2426k = AbstractC0623j.m2748c();
            this.f2427l = AbstractC0623j.m2748c();
            this.f2416a = c0627n.f2404a;
            this.f2417b = c0627n.f2405b;
            this.f2418c = c0627n.f2406c;
            this.f2419d = c0627n.f2407d;
            this.f2420e = c0627n.f2408e;
            this.f2421f = c0627n.f2409f;
            this.f2422g = c0627n.f2410g;
            this.f2423h = c0627n.f2411h;
            this.f2424i = c0627n.f2412i;
            this.f2425j = c0627n.f2413j;
            this.f2426k = c0627n.f2414k;
            this.f2427l = c0627n.f2415l;
        }
    }

    public C0627n() {
        this.f2404a = AbstractC0623j.m2747b();
        this.f2405b = AbstractC0623j.m2747b();
        this.f2406c = AbstractC0623j.m2747b();
        this.f2407d = AbstractC0623j.m2747b();
        this.f2408e = new C0614a(0.0f);
        this.f2409f = new C0614a(0.0f);
        this.f2410g = new C0614a(0.0f);
        this.f2411h = new C0614a(0.0f);
        this.f2412i = AbstractC0623j.m2748c();
        this.f2413j = AbstractC0623j.m2748c();
        this.f2414k = AbstractC0623j.m2748c();
        this.f2415l = AbstractC0623j.m2748c();
    }
}
