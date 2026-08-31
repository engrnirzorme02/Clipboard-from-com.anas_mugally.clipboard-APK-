package p224d0;

import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.appcompat.app.AbstractC2263x;
import java.util.ArrayList;
import p111O.AbstractC1030Z;

/* JADX INFO: renamed from: d0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5204h implements C5199c.c {

    /* JADX INFO: renamed from: d */
    final Object f19877d;

    /* JADX INFO: renamed from: e */
    final AbstractC5205i f19878e;

    /* JADX INFO: renamed from: j */
    private float f19883j;

    /* JADX INFO: renamed from: m */
    private C5199c f19886m;

    /* JADX INFO: renamed from: n */
    public static final p f19861n = new f("translationX");

    /* JADX INFO: renamed from: o */
    public static final p f19862o = new g("translationY");

    /* JADX INFO: renamed from: p */
    public static final p f19863p = new h("translationZ");

    /* JADX INFO: renamed from: q */
    public static final p f19864q = new i("scaleX");

    /* JADX INFO: renamed from: r */
    public static final p f19865r = new j("scaleY");

    /* JADX INFO: renamed from: s */
    public static final p f19866s = new k("rotation");

    /* JADX INFO: renamed from: t */
    public static final p f19867t = new l("rotationX");

    /* JADX INFO: renamed from: u */
    public static final p f19868u = new m("rotationY");

    /* JADX INFO: renamed from: v */
    public static final p f19869v = new n("x");

    /* JADX INFO: renamed from: w */
    public static final p f19870w = new a("y");

    /* JADX INFO: renamed from: x */
    public static final p f19871x = new b("z");

    /* JADX INFO: renamed from: y */
    public static final p f19872y = new c("alpha");

    /* JADX INFO: renamed from: z */
    public static final p f19873z = new d("scrollX");

    /* JADX INFO: renamed from: A */
    public static final p f19860A = new e("scrollY");

    /* JADX INFO: renamed from: a */
    float f19874a = 0.0f;

    /* JADX INFO: renamed from: b */
    float f19875b = Float.MAX_VALUE;

    /* JADX INFO: renamed from: c */
    boolean f19876c = false;

    /* JADX INFO: renamed from: f */
    boolean f19879f = false;

    /* JADX INFO: renamed from: g */
    float f19880g = Float.MAX_VALUE;

    /* JADX INFO: renamed from: h */
    float f19881h = -Float.MAX_VALUE;

    /* JADX INFO: renamed from: i */
    private long f19882i = 0;

    /* JADX INFO: renamed from: k */
    private final ArrayList f19884k = new ArrayList();

    /* JADX INFO: renamed from: l */
    private final ArrayList f19885l = new ArrayList();

    /* JADX INFO: renamed from: d0.h$a */
    class a extends p {
        a(String str) {
            super(str, null);
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo2742a(View view) {
            return view.getY();
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2743b(View view, float f7) {
            view.setY(f7);
        }
    }

    /* JADX INFO: renamed from: d0.h$b */
    class b extends p {
        b(String str) {
            super(str, null);
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo2742a(View view) {
            return AbstractC1030Z.m4439K(view);
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2743b(View view, float f7) {
            AbstractC1030Z.m4428B0(view, f7);
        }
    }

    /* JADX INFO: renamed from: d0.h$c */
    class c extends p {
        c(String str) {
            super(str, null);
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo2742a(View view) {
            return view.getAlpha();
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2743b(View view, float f7) {
            view.setAlpha(f7);
        }
    }

    /* JADX INFO: renamed from: d0.h$d */
    class d extends p {
        d(String str) {
            super(str, null);
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo2742a(View view) {
            return view.getScrollX();
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2743b(View view, float f7) {
            view.setScrollX((int) f7);
        }
    }

    /* JADX INFO: renamed from: d0.h$e */
    class e extends p {
        e(String str) {
            super(str, null);
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo2742a(View view) {
            return view.getScrollY();
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2743b(View view, float f7) {
            view.setScrollY((int) f7);
        }
    }

    /* JADX INFO: renamed from: d0.h$f */
    class f extends p {
        f(String str) {
            super(str, null);
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo2742a(View view) {
            return view.getTranslationX();
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2743b(View view, float f7) {
            view.setTranslationX(f7);
        }
    }

    /* JADX INFO: renamed from: d0.h$g */
    class g extends p {
        g(String str) {
            super(str, null);
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo2742a(View view) {
            return view.getTranslationY();
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2743b(View view, float f7) {
            view.setTranslationY(f7);
        }
    }

    /* JADX INFO: renamed from: d0.h$h */
    class h extends p {
        h(String str) {
            super(str, null);
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo2742a(View view) {
            return AbstractC1030Z.m4436H(view);
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2743b(View view, float f7) {
            AbstractC1030Z.m4506z0(view, f7);
        }
    }

    /* JADX INFO: renamed from: d0.h$i */
    class i extends p {
        i(String str) {
            super(str, null);
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo2742a(View view) {
            return view.getScaleX();
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2743b(View view, float f7) {
            view.setScaleX(f7);
        }
    }

    /* JADX INFO: renamed from: d0.h$j */
    class j extends p {
        j(String str) {
            super(str, null);
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo2742a(View view) {
            return view.getScaleY();
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2743b(View view, float f7) {
            view.setScaleY(f7);
        }
    }

    /* JADX INFO: renamed from: d0.h$k */
    class k extends p {
        k(String str) {
            super(str, null);
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo2742a(View view) {
            return view.getRotation();
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2743b(View view, float f7) {
            view.setRotation(f7);
        }
    }

    /* JADX INFO: renamed from: d0.h$l */
    class l extends p {
        l(String str) {
            super(str, null);
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo2742a(View view) {
            return view.getRotationX();
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2743b(View view, float f7) {
            view.setRotationX(f7);
        }
    }

    /* JADX INFO: renamed from: d0.h$m */
    class m extends p {
        m(String str) {
            super(str, null);
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo2742a(View view) {
            return view.getRotationY();
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2743b(View view, float f7) {
            view.setRotationY(f7);
        }
    }

    /* JADX INFO: renamed from: d0.h$n */
    class n extends p {
        n(String str) {
            super(str, null);
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo2742a(View view) {
            return view.getX();
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2743b(View view, float f7) {
            view.setX(f7);
        }
    }

    /* JADX INFO: renamed from: d0.h$o */
    static class o {

        /* JADX INFO: renamed from: a */
        float f19887a;

        /* JADX INFO: renamed from: b */
        float f19888b;

        o() {
        }
    }

    /* JADX INFO: renamed from: d0.h$p */
    public static abstract class p extends AbstractC5205i {
        /* synthetic */ p(String str, f fVar) {
            this(str);
        }

        private p(String str) {
            super(str);
        }
    }

    AbstractC5204h(Object obj, AbstractC5205i abstractC5205i) {
        this.f19877d = obj;
        this.f19878e = abstractC5205i;
        if (abstractC5205i == f19866s || abstractC5205i == f19867t || abstractC5205i == f19868u) {
            this.f19883j = 0.1f;
            return;
        }
        if (abstractC5205i == f19872y) {
            this.f19883j = 0.00390625f;
        } else if (abstractC5205i == f19864q || abstractC5205i == f19865r) {
            this.f19883j = 0.002f;
        } else {
            this.f19883j = 1.0f;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m24040b(boolean z7) {
        this.f19879f = false;
        m24044c().m24029k(this);
        this.f19882i = 0L;
        this.f19876c = false;
        for (int i7 = 0; i7 < this.f19884k.size(); i7++) {
            if (this.f19884k.get(i7) != null) {
                AbstractC2263x.m9328a(this.f19884k.get(i7));
                throw null;
            }
        }
        m24042g(this.f19884k);
    }

    /* JADX INFO: renamed from: d */
    private float m24041d() {
        return this.f19878e.mo2742a(this.f19877d);
    }

    /* JADX INFO: renamed from: g */
    private static void m24042g(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private void m24043k() {
        if (this.f19879f) {
            return;
        }
        this.f19879f = true;
        if (!this.f19876c) {
            this.f19875b = m24041d();
        }
        float f7 = this.f19875b;
        if (f7 > this.f19880g || f7 < this.f19881h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        m24044c().m24025d(this, 0L);
    }

    @Override // p224d0.C5199c.c
    /* JADX INFO: renamed from: a */
    public boolean mo24031a(long j7) {
        long j8 = this.f19882i;
        if (j8 == 0) {
            this.f19882i = j7;
            m24047h(this.f19875b);
            return false;
        }
        long j9 = j7 - j8;
        this.f19882i = j7;
        float fM24027g = m24044c().m24027g();
        boolean zMo24050l = mo24050l(fM24027g == 0.0f ? 2147483647L : (long) (j9 / fM24027g));
        float fMin = Math.min(this.f19875b, this.f19880g);
        this.f19875b = fMin;
        float fMax = Math.max(fMin, this.f19881h);
        this.f19875b = fMax;
        m24047h(fMax);
        if (zMo24050l) {
            m24040b(false);
        }
        return zMo24050l;
    }

    /* JADX INFO: renamed from: c */
    public C5199c m24044c() {
        C5199c c5199c = this.f19886m;
        return c5199c != null ? c5199c : C5199c.m24023h();
    }

    /* JADX INFO: renamed from: e */
    float m24045e() {
        return this.f19883j * 0.75f;
    }

    /* JADX INFO: renamed from: f */
    public boolean m24046f() {
        return this.f19879f;
    }

    /* JADX INFO: renamed from: h */
    void m24047h(float f7) {
        this.f19878e.mo2743b(this.f19877d, f7);
        for (int i7 = 0; i7 < this.f19885l.size(); i7++) {
            if (this.f19885l.get(i7) != null) {
                AbstractC2263x.m9328a(this.f19885l.get(i7));
                throw null;
            }
        }
        m24042g(this.f19885l);
    }

    /* JADX INFO: renamed from: i */
    public AbstractC5204h m24048i(float f7) {
        this.f19875b = f7;
        this.f19876c = true;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public void mo24049j() {
        if (!m24044c().m24028j()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f19879f) {
            return;
        }
        m24043k();
    }

    /* JADX INFO: renamed from: l */
    abstract boolean mo24050l(long j7);
}
