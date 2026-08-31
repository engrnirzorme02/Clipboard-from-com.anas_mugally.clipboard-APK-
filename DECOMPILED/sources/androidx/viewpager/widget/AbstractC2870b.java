package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.AbstractC2436b;
import com.google.android.gms.internal.ads.zzbbn;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p111O.AbstractC1030Z;
import p111O.C0982A0;
import p111O.C1032a;
import p111O.InterfaceC0993G;
import p118P.C1170s;
import p146T.AbstractC1446a;

/* JADX INFO: renamed from: androidx.viewpager.widget.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2870b extends ViewGroup {

    /* JADX INFO: renamed from: r0 */
    static final int[] f11692r0 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: s0 */
    private static final Comparator f11693s0 = new a();

    /* JADX INFO: renamed from: t0 */
    private static final Interpolator f11694t0 = new b();

    /* JADX INFO: renamed from: u0 */
    private static final m f11695u0 = new m();

    /* JADX INFO: renamed from: A */
    private int f11696A;

    /* JADX INFO: renamed from: B */
    private float f11697B;

    /* JADX INFO: renamed from: C */
    private float f11698C;

    /* JADX INFO: renamed from: D */
    private int f11699D;

    /* JADX INFO: renamed from: E */
    private int f11700E;

    /* JADX INFO: renamed from: F */
    private boolean f11701F;

    /* JADX INFO: renamed from: G */
    private boolean f11702G;

    /* JADX INFO: renamed from: H */
    private boolean f11703H;

    /* JADX INFO: renamed from: I */
    private int f11704I;

    /* JADX INFO: renamed from: J */
    private boolean f11705J;

    /* JADX INFO: renamed from: K */
    private boolean f11706K;

    /* JADX INFO: renamed from: L */
    private int f11707L;

    /* JADX INFO: renamed from: M */
    private int f11708M;

    /* JADX INFO: renamed from: N */
    private int f11709N;

    /* JADX INFO: renamed from: O */
    private float f11710O;

    /* JADX INFO: renamed from: P */
    private float f11711P;

    /* JADX INFO: renamed from: Q */
    private float f11712Q;

    /* JADX INFO: renamed from: R */
    private float f11713R;

    /* JADX INFO: renamed from: S */
    private int f11714S;

    /* JADX INFO: renamed from: T */
    private VelocityTracker f11715T;

    /* JADX INFO: renamed from: U */
    private int f11716U;

    /* JADX INFO: renamed from: V */
    private int f11717V;

    /* JADX INFO: renamed from: W */
    private int f11718W;

    /* JADX INFO: renamed from: a */
    private int f11719a;

    /* JADX INFO: renamed from: a0 */
    private int f11720a0;

    /* JADX INFO: renamed from: b */
    private final ArrayList f11721b;

    /* JADX INFO: renamed from: b0 */
    private boolean f11722b0;

    /* JADX INFO: renamed from: c */
    private final f f11723c;

    /* JADX INFO: renamed from: c0 */
    private long f11724c0;

    /* JADX INFO: renamed from: d */
    private final Rect f11725d;

    /* JADX INFO: renamed from: d0 */
    private EdgeEffect f11726d0;

    /* JADX INFO: renamed from: e */
    AbstractC2869a f11727e;

    /* JADX INFO: renamed from: e0 */
    private EdgeEffect f11728e0;

    /* JADX INFO: renamed from: f */
    int f11729f;

    /* JADX INFO: renamed from: f0 */
    private boolean f11730f0;

    /* JADX INFO: renamed from: g0 */
    private boolean f11731g0;

    /* JADX INFO: renamed from: h0 */
    private boolean f11732h0;

    /* JADX INFO: renamed from: i0 */
    private int f11733i0;

    /* JADX INFO: renamed from: j0 */
    private List f11734j0;

    /* JADX INFO: renamed from: k0 */
    private j f11735k0;

    /* JADX INFO: renamed from: l0 */
    private j f11736l0;

    /* JADX INFO: renamed from: m0 */
    private List f11737m0;

    /* JADX INFO: renamed from: n0 */
    private int f11738n0;

    /* JADX INFO: renamed from: o0 */
    private ArrayList f11739o0;

    /* JADX INFO: renamed from: p0 */
    private final Runnable f11740p0;

    /* JADX INFO: renamed from: q0 */
    private int f11741q0;

    /* JADX INFO: renamed from: r */
    private int f11742r;

    /* JADX INFO: renamed from: s */
    private Parcelable f11743s;

    /* JADX INFO: renamed from: t */
    private ClassLoader f11744t;

    /* JADX INFO: renamed from: u */
    private Scroller f11745u;

    /* JADX INFO: renamed from: v */
    private boolean f11746v;

    /* JADX INFO: renamed from: w */
    private k f11747w;

    /* JADX INFO: renamed from: x */
    private int f11748x;

    /* JADX INFO: renamed from: y */
    private Drawable f11749y;

    /* JADX INFO: renamed from: z */
    private int f11750z;

    /* JADX INFO: renamed from: androidx.viewpager.widget.b$a */
    static class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f11755b - fVar2.f11755b;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.b$b */
    static class b implements Interpolator {
        b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f7) {
            float f8 = f7 - 1.0f;
            return (f8 * f8 * f8 * f8 * f8) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.b$c */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC2870b.this.setScrollState(0);
            AbstractC2870b.this.m14354H();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.b$d */
    class d implements InterfaceC0993G {

        /* JADX INFO: renamed from: a */
        private final Rect f11752a = new Rect();

        d() {
        }

        @Override // p111O.InterfaceC0993G
        /* JADX INFO: renamed from: a */
        public C0982A0 mo4369a(View view, C0982A0 c0982a0) {
            C0982A0 c0982a0M4450V = AbstractC1030Z.m4450V(view, c0982a0);
            if (c0982a0M4450V.m4281p()) {
                return c0982a0M4450V;
            }
            Rect rect = this.f11752a;
            rect.left = c0982a0M4450V.m4276j();
            rect.top = c0982a0M4450V.m4278l();
            rect.right = c0982a0M4450V.m4277k();
            rect.bottom = c0982a0M4450V.m4275i();
            int childCount = AbstractC2870b.this.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                C0982A0 c0982a0M4467g = AbstractC1030Z.m4467g(AbstractC2870b.this.getChildAt(i7), c0982a0M4450V);
                rect.left = Math.min(c0982a0M4467g.m4276j(), rect.left);
                rect.top = Math.min(c0982a0M4467g.m4278l(), rect.top);
                rect.right = Math.min(c0982a0M4467g.m4277k(), rect.right);
                rect.bottom = Math.min(c0982a0M4467g.m4275i(), rect.bottom);
            }
            return c0982a0M4450V.m4282q(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.b$e */
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.b$f */
    static class f {

        /* JADX INFO: renamed from: a */
        Object f11754a;

        /* JADX INFO: renamed from: b */
        int f11755b;

        /* JADX INFO: renamed from: c */
        boolean f11756c;

        /* JADX INFO: renamed from: d */
        float f11757d;

        /* JADX INFO: renamed from: e */
        float f11758e;

        f() {
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.b$h */
    class h extends C1032a {
        h() {
        }

        /* JADX INFO: renamed from: n */
        private boolean m14379n() {
            AbstractC2869a abstractC2869a = AbstractC2870b.this.f11727e;
            return abstractC2869a != null && abstractC2869a.mo684c() > 1;
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: f */
        public void mo4584f(View view, AccessibilityEvent accessibilityEvent) {
            AbstractC2869a abstractC2869a;
            super.mo4584f(view, accessibilityEvent);
            accessibilityEvent.setClassName(AbstractC2870b.class.getName());
            accessibilityEvent.setScrollable(m14379n());
            if (accessibilityEvent.getEventType() != 4096 || (abstractC2869a = AbstractC2870b.this.f11727e) == null) {
                return;
            }
            accessibilityEvent.setItemCount(abstractC2869a.mo684c());
            accessibilityEvent.setFromIndex(AbstractC2870b.this.f11729f);
            accessibilityEvent.setToIndex(AbstractC2870b.this.f11729f);
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: g */
        public void mo4585g(View view, C1170s c1170s) {
            super.mo4585g(view, c1170s);
            c1170s.m5069m0(AbstractC2870b.class.getName());
            c1170s.m5023H0(m14379n());
            if (AbstractC2870b.this.canScrollHorizontally(1)) {
                c1170s.m5051a(4096);
            }
            if (AbstractC2870b.this.canScrollHorizontally(-1)) {
                c1170s.m5051a(8192);
            }
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: j */
        public boolean mo4588j(View view, int i7, Bundle bundle) {
            if (super.mo4588j(view, i7, bundle)) {
                return true;
            }
            if (i7 == 4096) {
                if (!AbstractC2870b.this.canScrollHorizontally(1)) {
                    return false;
                }
                AbstractC2870b abstractC2870b = AbstractC2870b.this;
                abstractC2870b.setCurrentItem(abstractC2870b.f11729f + 1);
                return true;
            }
            if (i7 != 8192 || !AbstractC2870b.this.canScrollHorizontally(-1)) {
                return false;
            }
            AbstractC2870b abstractC2870b2 = AbstractC2870b.this;
            abstractC2870b2.setCurrentItem(abstractC2870b2.f11729f - 1);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.b$i */
    public interface i {
        /* JADX INFO: renamed from: a */
        void mo14380a(AbstractC2870b abstractC2870b, AbstractC2869a abstractC2869a, AbstractC2869a abstractC2869a2);
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.b$j */
    public interface j {
        /* JADX INFO: renamed from: a */
        void mo365a(int i7, float f7, int i8);

        /* JADX INFO: renamed from: b */
        void mo14381b(int i7);

        /* JADX INFO: renamed from: c */
        void mo366c(int i7);
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.b$k */
    private class k extends DataSetObserver {
        k() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC2870b.this.m14368i();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC2870b.this.m14368i();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.b$l */
    public static class l extends AbstractC1446a {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        int f11767c;

        /* JADX INFO: renamed from: d */
        Parcelable f11768d;

        /* JADX INFO: renamed from: e */
        ClassLoader f11769e;

        /* JADX INFO: renamed from: androidx.viewpager.widget.b$l$a */
        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new l(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public l[] newArray(int i7) {
                return new l[i7];
            }
        }

        public l(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f11767c + "}";
        }

        @Override // p146T.AbstractC1446a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f11767c);
            parcel.writeParcelable(this.f11768d, i7);
        }

        l(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f11767c = parcel.readInt();
            this.f11768d = parcel.readParcelable(classLoader);
            this.f11769e = classLoader;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.b$m */
    static class m implements Comparator {
        m() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z7 = gVar.f11759a;
            if (z7 != gVar2.f11759a) {
                return z7 ? 1 : -1;
            }
            return gVar.f11763e - gVar2.f11763e;
        }
    }

    public AbstractC2870b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11721b = new ArrayList();
        this.f11723c = new f();
        this.f11725d = new Rect();
        this.f11742r = -1;
        this.f11743s = null;
        this.f11744t = null;
        this.f11697B = -3.4028235E38f;
        this.f11698C = Float.MAX_VALUE;
        this.f11704I = 1;
        this.f11714S = -1;
        this.f11730f0 = true;
        this.f11731g0 = false;
        this.f11740p0 = new c();
        this.f11741q0 = 0;
        m14376x();
    }

    /* JADX INFO: renamed from: A */
    private boolean m14331A(float f7, float f8) {
        if (f7 >= this.f11708M || f8 <= 0.0f) {
            return f7 > ((float) (getWidth() - this.f11708M)) && f8 < 0.0f;
        }
        return true;
    }

    /* JADX INFO: renamed from: C */
    private void m14332C(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f11714S) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f11710O = motionEvent.getX(i7);
            this.f11714S = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.f11715T;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: F */
    private boolean m14333F(int i7) {
        if (this.f11721b.size() == 0) {
            if (this.f11730f0) {
                return false;
            }
            this.f11732h0 = false;
            m14351B(0, 0.0f, 0);
            if (this.f11732h0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f fVarM14349v = m14349v();
        int clientWidth = getClientWidth();
        int i8 = this.f11748x;
        int i9 = clientWidth + i8;
        float f7 = clientWidth;
        int i10 = fVarM14349v.f11755b;
        float f8 = ((i7 / f7) - fVarM14349v.f11758e) / (fVarM14349v.f11757d + (i8 / f7));
        this.f11732h0 = false;
        m14351B(i10, f8, (int) (i9 * f8));
        if (this.f11732h0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX INFO: renamed from: G */
    private boolean m14334G(float f7) {
        boolean z7;
        boolean z8;
        float f8 = this.f11710O - f7;
        this.f11710O = f7;
        float scrollX = getScrollX() + f8;
        float clientWidth = getClientWidth();
        float f9 = this.f11697B * clientWidth;
        float f10 = this.f11698C * clientWidth;
        boolean z9 = false;
        f fVar = (f) this.f11721b.get(0);
        ArrayList arrayList = this.f11721b;
        f fVar2 = (f) arrayList.get(arrayList.size() - 1);
        if (fVar.f11755b != 0) {
            f9 = fVar.f11758e * clientWidth;
            z7 = false;
        } else {
            z7 = true;
        }
        if (fVar2.f11755b != this.f11727e.mo684c() - 1) {
            f10 = fVar2.f11758e * clientWidth;
            z8 = false;
        } else {
            z8 = true;
        }
        if (scrollX < f9) {
            if (z7) {
                this.f11726d0.onPull(Math.abs(f9 - scrollX) / clientWidth);
                z9 = true;
            }
            scrollX = f9;
        } else if (scrollX > f10) {
            if (z8) {
                this.f11728e0.onPull(Math.abs(scrollX - f10) / clientWidth);
                z9 = true;
            }
            scrollX = f10;
        }
        int i7 = (int) scrollX;
        this.f11710O += scrollX - i7;
        scrollTo(i7, getScrollY());
        m14333F(i7);
        return z9;
    }

    /* JADX INFO: renamed from: J */
    private void m14335J(int i7, int i8, int i9, int i10) {
        if (i8 > 0 && !this.f11721b.isEmpty()) {
            if (!this.f11745u.isFinished()) {
                this.f11745u.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i8 - getPaddingLeft()) - getPaddingRight()) + i10)) * (((i7 - getPaddingLeft()) - getPaddingRight()) + i9)), getScrollY());
                return;
            }
        }
        f fVarM14375w = m14375w(this.f11729f);
        int iMin = (int) ((fVarM14375w != null ? Math.min(fVarM14375w.f11758e, this.f11698C) : 0.0f) * ((i7 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            m14342h(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX INFO: renamed from: K */
    private void m14336K() {
        int i7 = 0;
        while (i7 < getChildCount()) {
            if (!((g) getChildAt(i7).getLayoutParams()).f11759a) {
                removeViewAt(i7);
                i7--;
            }
            i7++;
        }
    }

    /* JADX INFO: renamed from: N */
    private void m14337N(boolean z7) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z7);
        }
    }

    /* JADX INFO: renamed from: O */
    private boolean m14338O() {
        this.f11714S = -1;
        m14347o();
        this.f11726d0.onRelease();
        this.f11728e0.onRelease();
        return this.f11726d0.isFinished() || this.f11728e0.isFinished();
    }

    /* JADX INFO: renamed from: P */
    private void m14339P(int i7, boolean z7, int i8, boolean z8) {
        f fVarM14375w = m14375w(i7);
        int clientWidth = fVarM14375w != null ? (int) (getClientWidth() * Math.max(this.f11697B, Math.min(fVarM14375w.f11758e, this.f11698C))) : 0;
        if (z7) {
            m14361T(clientWidth, 0, i8);
            if (z8) {
                m14345l(i7);
                return;
            }
            return;
        }
        if (z8) {
            m14345l(i7);
        }
        m14342h(false);
        scrollTo(clientWidth, 0);
        m14333F(clientWidth);
    }

    /* JADX INFO: renamed from: U */
    private void m14340U() {
        if (this.f11738n0 != 0) {
            ArrayList arrayList = this.f11739o0;
            if (arrayList == null) {
                this.f11739o0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                this.f11739o0.add(getChildAt(i7));
            }
            Collections.sort(this.f11739o0, f11695u0);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m14341f(f fVar, int i7, f fVar2) {
        int i8;
        int i9;
        f fVar3;
        f fVar4;
        int iMo684c = this.f11727e.mo684c();
        int clientWidth = getClientWidth();
        float f7 = clientWidth > 0 ? this.f11748x / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i10 = fVar2.f11755b;
            int i11 = fVar.f11755b;
            if (i10 < i11) {
                float fMo14321f = fVar2.f11758e + fVar2.f11757d + f7;
                int i12 = i10 + 1;
                int i13 = 0;
                while (i12 <= fVar.f11755b && i13 < this.f11721b.size()) {
                    Object obj = this.f11721b.get(i13);
                    while (true) {
                        fVar4 = (f) obj;
                        if (i12 <= fVar4.f11755b || i13 >= this.f11721b.size() - 1) {
                            break;
                        }
                        i13++;
                        obj = this.f11721b.get(i13);
                    }
                    while (i12 < fVar4.f11755b) {
                        fMo14321f += this.f11727e.mo14321f(i12) + f7;
                        i12++;
                    }
                    fVar4.f11758e = fMo14321f;
                    fMo14321f += fVar4.f11757d + f7;
                    i12++;
                }
            } else if (i10 > i11) {
                int size = this.f11721b.size() - 1;
                float fMo14321f2 = fVar2.f11758e;
                while (true) {
                    i10--;
                    if (i10 < fVar.f11755b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f11721b.get(size);
                    while (true) {
                        fVar3 = (f) obj2;
                        if (i10 >= fVar3.f11755b || size <= 0) {
                            break;
                        }
                        size--;
                        obj2 = this.f11721b.get(size);
                    }
                    while (i10 > fVar3.f11755b) {
                        fMo14321f2 -= this.f11727e.mo14321f(i10) + f7;
                        i10--;
                    }
                    fMo14321f2 -= fVar3.f11757d + f7;
                    fVar3.f11758e = fMo14321f2;
                }
            }
        }
        int size2 = this.f11721b.size();
        float fMo14321f3 = fVar.f11758e;
        int i14 = fVar.f11755b;
        int i15 = i14 - 1;
        this.f11697B = i14 == 0 ? fMo14321f3 : -3.4028235E38f;
        int i16 = iMo684c - 1;
        this.f11698C = i14 == i16 ? (fVar.f11757d + fMo14321f3) - 1.0f : Float.MAX_VALUE;
        int i17 = i7 - 1;
        while (i17 >= 0) {
            f fVar5 = (f) this.f11721b.get(i17);
            while (true) {
                i9 = fVar5.f11755b;
                if (i15 <= i9) {
                    break;
                }
                fMo14321f3 -= this.f11727e.mo14321f(i15) + f7;
                i15--;
            }
            fMo14321f3 -= fVar5.f11757d + f7;
            fVar5.f11758e = fMo14321f3;
            if (i9 == 0) {
                this.f11697B = fMo14321f3;
            }
            i17--;
            i15--;
        }
        float fMo14321f4 = fVar.f11758e + fVar.f11757d + f7;
        int i18 = fVar.f11755b + 1;
        int i19 = i7 + 1;
        while (i19 < size2) {
            f fVar6 = (f) this.f11721b.get(i19);
            while (true) {
                i8 = fVar6.f11755b;
                if (i18 >= i8) {
                    break;
                }
                fMo14321f4 += this.f11727e.mo14321f(i18) + f7;
                i18++;
            }
            if (i8 == i16) {
                this.f11698C = (fVar6.f11757d + fMo14321f4) - 1.0f;
            }
            fVar6.f11758e = fMo14321f4;
            fMo14321f4 += fVar6.f11757d + f7;
            i19++;
            i18++;
        }
        this.f11731g0 = false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: renamed from: h */
    private void m14342h(boolean z7) {
        boolean z8 = this.f11741q0 == 2;
        if (z8) {
            setScrollingCacheEnabled(false);
            if (!this.f11745u.isFinished()) {
                this.f11745u.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f11745u.getCurrX();
                int currY = this.f11745u.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m14333F(currX);
                    }
                }
            }
        }
        this.f11703H = false;
        for (int i7 = 0; i7 < this.f11721b.size(); i7++) {
            f fVar = (f) this.f11721b.get(i7);
            if (fVar.f11756c) {
                fVar.f11756c = false;
                z8 = true;
            }
        }
        if (z8) {
            if (z7) {
                AbstractC1030Z.m4458b0(this, this.f11740p0);
            } else {
                this.f11740p0.run();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private int m14343j(int i7, float f7, int i8, int i9) {
        if (Math.abs(i9) <= this.f11718W || Math.abs(i8) <= this.f11716U) {
            i7 += (int) (f7 + (i7 >= this.f11729f ? 0.4f : 0.6f));
        } else if (i8 <= 0) {
            i7++;
        }
        if (this.f11721b.size() <= 0) {
            return i7;
        }
        f fVar = (f) this.f11721b.get(0);
        ArrayList arrayList = this.f11721b;
        return Math.max(fVar.f11755b, Math.min(i7, ((f) arrayList.get(arrayList.size() - 1)).f11755b));
    }

    /* JADX INFO: renamed from: k */
    private void m14344k(int i7, float f7, int i8) {
        j jVar = this.f11735k0;
        if (jVar != null) {
            jVar.mo365a(i7, f7, i8);
        }
        List list = this.f11734j0;
        if (list != null) {
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                j jVar2 = (j) this.f11734j0.get(i9);
                if (jVar2 != null) {
                    jVar2.mo365a(i7, f7, i8);
                }
            }
        }
        j jVar3 = this.f11736l0;
        if (jVar3 != null) {
            jVar3.mo365a(i7, f7, i8);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m14345l(int i7) {
        j jVar = this.f11735k0;
        if (jVar != null) {
            jVar.mo366c(i7);
        }
        List list = this.f11734j0;
        if (list != null) {
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                j jVar2 = (j) this.f11734j0.get(i8);
                if (jVar2 != null) {
                    jVar2.mo366c(i7);
                }
            }
        }
        j jVar3 = this.f11736l0;
        if (jVar3 != null) {
            jVar3.mo366c(i7);
        }
    }

    /* JADX INFO: renamed from: m */
    private void m14346m(int i7) {
        j jVar = this.f11735k0;
        if (jVar != null) {
            jVar.mo14381b(i7);
        }
        List list = this.f11734j0;
        if (list != null) {
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                j jVar2 = (j) this.f11734j0.get(i8);
                if (jVar2 != null) {
                    jVar2.mo14381b(i7);
                }
            }
        }
        j jVar3 = this.f11736l0;
        if (jVar3 != null) {
            jVar3.mo14381b(i7);
        }
    }

    /* JADX INFO: renamed from: o */
    private void m14347o() {
        this.f11705J = false;
        this.f11706K = false;
        VelocityTracker velocityTracker = this.f11715T;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f11715T = null;
        }
    }

    /* JADX INFO: renamed from: s */
    private Rect m14348s(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private void setScrollingCacheEnabled(boolean z7) {
        if (this.f11702G != z7) {
            this.f11702G = z7;
        }
    }

    /* JADX INFO: renamed from: v */
    private f m14349v() {
        int i7;
        int clientWidth = getClientWidth();
        float f7 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f8 = clientWidth > 0 ? this.f11748x / clientWidth : 0.0f;
        int i8 = 0;
        boolean z7 = true;
        f fVar = null;
        int i9 = -1;
        float f9 = 0.0f;
        while (i8 < this.f11721b.size()) {
            f fVar2 = (f) this.f11721b.get(i8);
            if (!z7 && fVar2.f11755b != (i7 = i9 + 1)) {
                fVar2 = this.f11723c;
                fVar2.f11758e = f7 + f9 + f8;
                fVar2.f11755b = i7;
                fVar2.f11757d = this.f11727e.mo14321f(i7);
                i8--;
            }
            f fVar3 = fVar2;
            f7 = fVar3.f11758e;
            float f10 = fVar3.f11757d + f7 + f8;
            if (!z7 && scrollX < f7) {
                break;
            }
            if (scrollX < f10 || i8 == this.f11721b.size() - 1) {
                return fVar3;
            }
            int i10 = fVar3.f11755b;
            float f11 = fVar3.f11757d;
            i8++;
            i9 = i10;
            f9 = f11;
            fVar = fVar3;
            z7 = false;
        }
        return fVar;
    }

    /* JADX INFO: renamed from: y */
    private static boolean m14350y(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX INFO: renamed from: B */
    protected void m14351B(int i7, float f7, int i8) {
        int iMax;
        int width;
        int left;
        if (this.f11733i0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f11759a) {
                    int i10 = gVar.f11760b & 7;
                    if (i10 != 1) {
                        if (i10 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i10 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i11 = iMax;
                    width = paddingLeft;
                    paddingLeft = i11;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        m14344k(i7, f7, i8);
        this.f11732h0 = true;
    }

    /* JADX INFO: renamed from: D */
    boolean m14352D() {
        int i7 = this.f11729f;
        if (i7 <= 0) {
            return false;
        }
        m14358Q(i7 - 1, true);
        return true;
    }

    /* JADX INFO: renamed from: E */
    boolean m14353E() {
        AbstractC2869a abstractC2869a = this.f11727e;
        if (abstractC2869a == null || this.f11729f >= abstractC2869a.mo684c() - 1) {
            return false;
        }
        m14358Q(this.f11729f + 1, true);
        return true;
    }

    /* JADX INFO: renamed from: H */
    void m14354H() {
        m14355I(this.f11729f);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00cc A[PHI: r7 r10 r15
      0x00cc: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: I */
    void m14355I(int i7) {
        f fVarM14375w;
        String hexString;
        f fVarM14362a;
        f fVarM14374u;
        f fVar;
        int i8 = this.f11729f;
        if (i8 != i7) {
            fVarM14375w = m14375w(i8);
            this.f11729f = i7;
        } else {
            fVarM14375w = null;
        }
        if (this.f11727e == null) {
            m14340U();
            return;
        }
        if (this.f11703H) {
            m14340U();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.f11727e.mo14329o(this);
        int i9 = this.f11704I;
        int iMax = Math.max(0, this.f11729f - i9);
        int iMo684c = this.f11727e.mo684c();
        int iMin = Math.min(iMo684c - 1, this.f11729f + i9);
        if (iMo684c != this.f11719a) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f11719a + ", found: " + iMo684c + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f11727e.getClass());
        }
        int i10 = 0;
        while (true) {
            if (i10 < this.f11721b.size()) {
                fVarM14362a = (f) this.f11721b.get(i10);
                int i11 = fVarM14362a.f11755b;
                int i12 = this.f11729f;
                if (i11 >= i12) {
                    if (i11 != i12) {
                        break;
                    } else {
                        break;
                    }
                }
                i10++;
            }
            fVarM14362a = null;
            break;
        }
        if (fVarM14362a == null && iMo684c > 0) {
            fVarM14362a = m14362a(this.f11729f, i10);
        }
        if (fVarM14362a != null) {
            int i13 = i10 - 1;
            f fVar2 = i13 >= 0 ? (f) this.f11721b.get(i13) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - fVarM14362a.f11757d) + (getPaddingLeft() / clientWidth);
            float f7 = 0.0f;
            for (int i14 = this.f11729f - 1; i14 >= 0; i14--) {
                if (f7 < paddingLeft || i14 >= iMax) {
                    if (fVar2 == null || i14 != fVar2.f11755b) {
                        f7 += m14362a(i14, i13 + 1).f11757d;
                        i10++;
                        if (i13 >= 0) {
                            fVar = (f) this.f11721b.get(i13);
                        } else {
                            fVar = null;
                        }
                    } else {
                        f7 += fVar2.f11757d;
                        i13--;
                        if (i13 >= 0) {
                            fVar = (f) this.f11721b.get(i13);
                        } else {
                            fVar = null;
                        }
                    }
                    fVar2 = fVar;
                } else {
                    if (fVar2 == null) {
                        break;
                    }
                    if (i14 == fVar2.f11755b && !fVar2.f11756c) {
                        this.f11721b.remove(i13);
                        this.f11727e.mo683a(this, i14, fVar2.f11754a);
                        i13--;
                        i10--;
                        if (i13 >= 0) {
                            fVar = (f) this.f11721b.get(i13);
                        } else {
                            fVar = null;
                        }
                        fVar2 = fVar;
                    }
                }
            }
            float f8 = fVarM14362a.f11757d;
            int i15 = i10 + 1;
            if (f8 < 2.0f) {
                f fVar3 = i15 < this.f11721b.size() ? (f) this.f11721b.get(i15) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i16 = this.f11729f;
                while (true) {
                    i16++;
                    if (i16 >= iMo684c) {
                        break;
                    }
                    if (f8 >= paddingRight && i16 > iMin) {
                        if (fVar3 == null) {
                            break;
                        }
                        if (i16 == fVar3.f11755b && !fVar3.f11756c) {
                            this.f11721b.remove(i15);
                            this.f11727e.mo683a(this, i16, fVar3.f11754a);
                            if (i15 < this.f11721b.size()) {
                                fVar3 = (f) this.f11721b.get(i15);
                            }
                        }
                    } else if (fVar3 == null || i16 != fVar3.f11755b) {
                        f fVarM14362a2 = m14362a(i16, i15);
                        i15++;
                        f8 += fVarM14362a2.f11757d;
                        fVar3 = i15 < this.f11721b.size() ? (f) this.f11721b.get(i15) : null;
                    } else {
                        f8 += fVar3.f11757d;
                        i15++;
                        if (i15 < this.f11721b.size()) {
                            fVar3 = (f) this.f11721b.get(i15);
                        }
                    }
                }
            }
            m14341f(fVarM14362a, i10, fVarM14375w);
            this.f11727e.mo14327m(this, this.f11729f, fVarM14362a.f11754a);
        }
        this.f11727e.mo14319b(this);
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            g gVar = (g) childAt.getLayoutParams();
            gVar.f11764f = i17;
            if (!gVar.f11759a && gVar.f11761c == 0.0f && (fVarM14374u = m14374u(childAt)) != null) {
                gVar.f11761c = fVarM14374u.f11757d;
                gVar.f11763e = fVarM14374u.f11755b;
            }
        }
        m14340U();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            f fVarM14373t = viewFindFocus != null ? m14373t(viewFindFocus) : null;
            if (fVarM14373t == null || fVarM14373t.f11755b != this.f11729f) {
                for (int i18 = 0; i18 < getChildCount(); i18++) {
                    View childAt2 = getChildAt(i18);
                    f fVarM14374u2 = m14374u(childAt2);
                    if (fVarM14374u2 != null && fVarM14374u2.f11755b == this.f11729f && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m14356L(i iVar) {
        List list = this.f11737m0;
        if (list != null) {
            list.remove(iVar);
        }
    }

    /* JADX INFO: renamed from: M */
    public void mo14357M(j jVar) {
        List list = this.f11734j0;
        if (list != null) {
            list.remove(jVar);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m14358Q(int i7, boolean z7) {
        this.f11703H = false;
        m14359R(i7, z7, false);
    }

    /* JADX INFO: renamed from: R */
    void m14359R(int i7, boolean z7, boolean z8) {
        m14360S(i7, z7, z8, 0);
    }

    /* JADX INFO: renamed from: S */
    void m14360S(int i7, boolean z7, boolean z8, int i8) {
        AbstractC2869a abstractC2869a = this.f11727e;
        if (abstractC2869a == null || abstractC2869a.mo684c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z8 && this.f11729f == i7 && this.f11721b.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i7 < 0) {
            i7 = 0;
        } else if (i7 >= this.f11727e.mo684c()) {
            i7 = this.f11727e.mo684c() - 1;
        }
        int i9 = this.f11704I;
        int i10 = this.f11729f;
        if (i7 > i10 + i9 || i7 < i10 - i9) {
            for (int i11 = 0; i11 < this.f11721b.size(); i11++) {
                ((f) this.f11721b.get(i11)).f11756c = true;
            }
        }
        boolean z9 = this.f11729f != i7;
        if (!this.f11730f0) {
            m14355I(i7);
            m14339P(i7, z7, i8, z9);
        } else {
            this.f11729f = i7;
            if (z9) {
                m14345l(i7);
            }
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: T */
    void m14361T(int i7, int i8, int i9) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f11745u;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.f11746v ? this.f11745u.getCurrX() : this.f11745u.getStartX();
            this.f11745u.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i10 = scrollX;
        int scrollY = getScrollY();
        int i11 = i7 - i10;
        int i12 = i8 - scrollY;
        if (i11 == 0 && i12 == 0) {
            m14342h(false);
            m14354H();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i13 = clientWidth / 2;
        float f7 = clientWidth;
        float f8 = i13;
        float fM14369n = f8 + (m14369n(Math.min(1.0f, (Math.abs(i11) * 1.0f) / f7)) * f8);
        int iAbs2 = Math.abs(i9);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fM14369n / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i11) / ((f7 * this.f11727e.mo14321f(this.f11729f)) + this.f11748x)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.f11746v = false;
        this.f11745u.startScroll(i10, scrollY, i11, i12, iMin);
        AbstractC1030Z.m4456a0(this);
    }

    /* JADX INFO: renamed from: a */
    f m14362a(int i7, int i8) {
        f fVar = new f();
        fVar.f11755b = i7;
        fVar.f11754a = this.f11727e.mo686g(this, i7);
        fVar.f11757d = this.f11727e.mo14321f(i7);
        if (i8 < 0 || i8 >= this.f11721b.size()) {
            this.f11721b.add(fVar);
            return fVar;
        }
        this.f11721b.add(i8, fVar);
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i7, int i8) {
        f fVarM14374u;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                View childAt = getChildAt(i9);
                if (childAt.getVisibility() == 0 && (fVarM14374u = m14374u(childAt)) != null && fVarM14374u.f11755b == this.f11729f) {
                    childAt.addFocusables(arrayList, i7, i8);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i8 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList arrayList) {
        f fVarM14374u;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 0 && (fVarM14374u = m14374u(childAt)) != null && fVarM14374u.f11755b == this.f11729f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean zM14350y = gVar.f11759a | m14350y(view);
        gVar.f11759a = zM14350y;
        if (!this.f11701F) {
            super.addView(view, i7, layoutParams);
        } else {
            if (zM14350y) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            gVar.f11762d = true;
            addViewInLayout(view, i7, layoutParams);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m14363b(i iVar) {
        if (this.f11737m0 == null) {
            this.f11737m0 = new ArrayList();
        }
        this.f11737m0.add(iVar);
    }

    /* JADX INFO: renamed from: c */
    public void mo14364c(j jVar) {
        if (this.f11734j0 == null) {
            this.f11734j0 = new ArrayList();
        }
        this.f11734j0.add(jVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i7) {
        if (this.f11727e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i7 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.f11697B));
        }
        return i7 > 0 && scrollX < ((int) (((float) clientWidth) * this.f11698C));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f11746v = true;
        if (this.f11745u.isFinished() || !this.f11745u.computeScrollOffset()) {
            m14342h(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f11745u.getCurrX();
        int currY = this.f11745u.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m14333F(currX)) {
                this.f11745u.abortAnimation();
                scrollTo(0, currY);
            }
        }
        AbstractC1030Z.m4456a0(this);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    /* JADX INFO: renamed from: d */
    public boolean m14365d(int i7) {
        boolean zM14352D;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i7);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i7 == 17 || i7 == 1) {
                zM14352D = m14352D();
            } else if (i7 == 66 || i7 == 2) {
                zM14352D = m14353E();
            } else {
                zM14352D = false;
            }
        } else if (i7 == 17) {
            zM14352D = (viewFindFocus == null || m14348s(this.f11725d, viewFindNextFocus).left < m14348s(this.f11725d, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : m14352D();
        } else if (i7 == 66) {
            zM14352D = (viewFindFocus == null || m14348s(this.f11725d, viewFindNextFocus).left > m14348s(this.f11725d, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : m14353E();
        } else {
            zM14352D = false;
        }
        if (zM14352D) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i7));
        }
        return zM14352D;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m14371q(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarM14374u;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 0 && (fVarM14374u = m14374u(childAt)) != null && fVarM14374u.f11755b == this.f11729f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC2869a abstractC2869a;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC2869a = this.f11727e) != null && abstractC2869a.mo684c() > 1)) {
            if (!this.f11726d0.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f11697B * width);
                this.f11726d0.setSize(height, width);
                zDraw = this.f11726d0.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f11728e0.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f11698C + 1.0f)) * width2);
                this.f11728e0.setSize(height2, width2);
                zDraw |= this.f11728e0.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f11726d0.finish();
            this.f11728e0.finish();
        }
        if (zDraw) {
            AbstractC1030Z.m4456a0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f11749y;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* JADX INFO: renamed from: e */
    public boolean m14366e() {
        if (this.f11705J) {
            return false;
        }
        this.f11722b0 = true;
        setScrollState(1);
        this.f11710O = 0.0f;
        this.f11712Q = 0.0f;
        VelocityTracker velocityTracker = this.f11715T;
        if (velocityTracker == null) {
            this.f11715T = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f11715T.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.f11724c0 = jUptimeMillis;
        return true;
    }

    /* JADX INFO: renamed from: g */
    protected boolean m14367g(View view, boolean z7, int i7, int i8, int i9) {
        int i10;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i11 = i8 + scrollX;
                if (i11 >= childAt.getLeft() && i11 < childAt.getRight() && (i10 = i9 + scrollY) >= childAt.getTop() && i10 < childAt.getBottom() && m14367g(childAt, true, i7, i11 - childAt.getLeft(), i10 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z7 && view.canScrollHorizontally(-i7);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC2869a getAdapter() {
        return this.f11727e;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i7, int i8) {
        if (this.f11738n0 == 2) {
            i8 = (i7 - 1) - i8;
        }
        return ((g) ((View) this.f11739o0.get(i8)).getLayoutParams()).f11764f;
    }

    public int getCurrentItem() {
        return this.f11729f;
    }

    public int getOffscreenPageLimit() {
        return this.f11704I;
    }

    public int getPageMargin() {
        return this.f11748x;
    }

    /* JADX INFO: renamed from: i */
    void m14368i() {
        int iMo684c = this.f11727e.mo684c();
        this.f11719a = iMo684c;
        boolean z7 = this.f11721b.size() < (this.f11704I * 2) + 1 && this.f11721b.size() < iMo684c;
        int iMax = this.f11729f;
        int i7 = 0;
        boolean z8 = false;
        while (i7 < this.f11721b.size()) {
            f fVar = (f) this.f11721b.get(i7);
            int iMo685d = this.f11727e.mo685d(fVar.f11754a);
            if (iMo685d != -1) {
                if (iMo685d == -2) {
                    this.f11721b.remove(i7);
                    i7--;
                    if (!z8) {
                        this.f11727e.mo14329o(this);
                        z8 = true;
                    }
                    this.f11727e.mo683a(this, fVar.f11755b, fVar.f11754a);
                    int i8 = this.f11729f;
                    if (i8 == fVar.f11755b) {
                        iMax = Math.max(0, Math.min(i8, iMo684c - 1));
                    }
                } else {
                    int i9 = fVar.f11755b;
                    if (i9 != iMo685d) {
                        if (i9 == this.f11729f) {
                            iMax = iMo685d;
                        }
                        fVar.f11755b = iMo685d;
                    }
                }
                z7 = true;
            }
            i7++;
        }
        if (z8) {
            this.f11727e.mo14319b(this);
        }
        Collections.sort(this.f11721b, f11693s0);
        if (z7) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                g gVar = (g) getChildAt(i10).getLayoutParams();
                if (!gVar.f11759a) {
                    gVar.f11761c = 0.0f;
                }
            }
            m14359R(iMax, false, true);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: n */
    float m14369n(float f7) {
        return (float) Math.sin((f7 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11730f0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f11740p0);
        Scroller scroller = this.f11745u;
        if (scroller != null && !scroller.isFinished()) {
            this.f11745u.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i7;
        float f7;
        super.onDraw(canvas);
        if (this.f11748x <= 0 || this.f11749y == null || this.f11721b.size() <= 0 || this.f11727e == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f8 = width;
        float f9 = this.f11748x / f8;
        int i8 = 0;
        f fVar = (f) this.f11721b.get(0);
        float f10 = fVar.f11758e;
        int size = this.f11721b.size();
        int i9 = fVar.f11755b;
        int i10 = ((f) this.f11721b.get(size - 1)).f11755b;
        while (i9 < i10) {
            while (true) {
                i7 = fVar.f11755b;
                if (i9 <= i7 || i8 >= size) {
                    break;
                }
                i8++;
                fVar = (f) this.f11721b.get(i8);
            }
            if (i9 == i7) {
                float f11 = fVar.f11758e;
                float f12 = fVar.f11757d;
                f7 = (f11 + f12) * f8;
                f10 = f11 + f12 + f9;
            } else {
                float fMo14321f = this.f11727e.mo14321f(i9);
                f7 = (f10 + fMo14321f) * f8;
                f10 += fMo14321f + f9;
            }
            if (this.f11748x + f7 > scrollX) {
                this.f11749y.setBounds(Math.round(f7), this.f11750z, Math.round(this.f11748x + f7), this.f11696A);
                this.f11749y.draw(canvas);
            }
            if (f7 > scrollX + width) {
                return;
            }
            i9++;
            scrollX = scrollX;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m14338O();
            return false;
        }
        if (action != 0) {
            if (this.f11705J) {
                return true;
            }
            if (this.f11706K) {
                return false;
            }
        }
        if (action == 0) {
            float x7 = motionEvent.getX();
            this.f11712Q = x7;
            this.f11710O = x7;
            float y7 = motionEvent.getY();
            this.f11713R = y7;
            this.f11711P = y7;
            this.f11714S = motionEvent.getPointerId(0);
            this.f11706K = false;
            this.f11746v = true;
            this.f11745u.computeScrollOffset();
            if (this.f11741q0 != 2 || Math.abs(this.f11745u.getFinalX() - this.f11745u.getCurrX()) <= this.f11720a0) {
                m14342h(false);
                this.f11705J = false;
            } else {
                this.f11745u.abortAnimation();
                this.f11703H = false;
                m14354H();
                this.f11705J = true;
                m14337N(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i7 = this.f11714S;
            if (i7 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i7);
                float x8 = motionEvent.getX(iFindPointerIndex);
                float f7 = x8 - this.f11710O;
                float fAbs = Math.abs(f7);
                float y8 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y8 - this.f11713R);
                if (f7 != 0.0f && !m14331A(this.f11710O, f7) && m14367g(this, false, (int) f7, (int) x8, (int) y8)) {
                    this.f11710O = x8;
                    this.f11711P = y8;
                    this.f11706K = true;
                    return false;
                }
                int i8 = this.f11709N;
                if (fAbs > i8 && fAbs * 0.5f > fAbs2) {
                    this.f11705J = true;
                    m14337N(true);
                    setScrollState(1);
                    float f8 = this.f11712Q;
                    float f9 = this.f11709N;
                    this.f11710O = f7 > 0.0f ? f8 + f9 : f8 - f9;
                    this.f11711P = y8;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i8) {
                    this.f11706K = true;
                }
                if (this.f11705J && m14334G(x8)) {
                    AbstractC1030Z.m4456a0(this);
                }
            }
        } else if (action == 6) {
            m14332C(motionEvent);
        }
        if (this.f11715T == null) {
            this.f11715T = VelocityTracker.obtain();
        }
        this.f11715T.addMovement(motionEvent);
        return this.f11705J;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        boolean z8;
        f fVarM14374u;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i11 = i9 - i7;
        int i12 = i10 - i8;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f11759a) {
                    int i15 = gVar.f11760b;
                    int i16 = i15 & 7;
                    int i17 = i15 & 112;
                    if (i16 != 1) {
                        if (i16 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i16 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i11 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i17 != 16) {
                            if (i17 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i17 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i12 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i18 = paddingLeft + scrollX;
                            childAt.layout(i18, paddingTop, childAt.getMeasuredWidth() + i18, paddingTop + childAt.getMeasuredHeight());
                            i13++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i12 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i19 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i19;
                        int i110 = paddingLeft + scrollX;
                        childAt.layout(i110, paddingTop, childAt.getMeasuredWidth() + i110, paddingTop + childAt.getMeasuredHeight());
                        i13++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i11 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i20 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i20;
                    if (i17 != 16) {
                        if (i17 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i17 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i12 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i111 = paddingLeft + scrollX;
                        childAt.layout(i111, paddingTop, childAt.getMeasuredWidth() + i111, paddingTop + childAt.getMeasuredHeight());
                        i13++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i12 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i112 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i112;
                    int i113 = paddingLeft + scrollX;
                    childAt.layout(i113, paddingTop, childAt.getMeasuredWidth() + i113, paddingTop + childAt.getMeasuredHeight());
                    i13++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i21 = (i11 - paddingLeft) - paddingRight;
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt2 = getChildAt(i22);
            if (childAt2.getVisibility() != 8) {
                g gVar2 = (g) childAt2.getLayoutParams();
                if (!gVar2.f11759a && (fVarM14374u = m14374u(childAt2)) != null) {
                    float f7 = i21;
                    int i23 = ((int) (fVarM14374u.f11758e * f7)) + paddingLeft;
                    if (gVar2.f11762d) {
                        gVar2.f11762d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f7 * gVar2.f11761c), 1073741824), View.MeasureSpec.makeMeasureSpec((i12 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i23, paddingTop, childAt2.getMeasuredWidth() + i23, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f11750z = paddingTop;
        this.f11696A = i12 - paddingBottom;
        this.f11733i0 = i13;
        if (this.f11730f0) {
            z8 = false;
            m14339P(this.f11729f, false, 0, false);
        } else {
            z8 = false;
        }
        this.f11730f0 = z8;
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        g gVar;
        g gVar2;
        int i9;
        setMeasuredDimension(View.getDefaultSize(0, i7), View.getDefaultSize(0, i8));
        int measuredWidth = getMeasuredWidth();
        this.f11708M = Math.min(measuredWidth / 10, this.f11707L);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i10 = 0;
        while (true) {
            boolean z7 = true;
            int i11 = 1073741824;
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.f11759a) {
                int i12 = gVar2.f11760b;
                int i13 = i12 & 7;
                int i14 = i12 & 112;
                boolean z8 = i14 == 48 || i14 == 80;
                if (i13 != 3 && i13 != 5) {
                    z7 = false;
                }
                int i15 = Integer.MIN_VALUE;
                if (z8) {
                    i9 = Integer.MIN_VALUE;
                    i15 = 1073741824;
                } else {
                    i9 = z7 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i16 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i16 != -2) {
                    if (i16 == -1) {
                        i16 = paddingLeft;
                    }
                    i15 = 1073741824;
                } else {
                    i16 = paddingLeft;
                }
                int i17 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i17 == -2) {
                    i17 = measuredHeight;
                    i11 = i9;
                } else if (i17 == -1) {
                    i17 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i16, i15), View.MeasureSpec.makeMeasureSpec(i17, i11));
                if (z8) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z7) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i10++;
        }
        this.f11699D = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f11700E = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f11701F = true;
        m14354H();
        this.f11701F = false;
        int childCount2 = getChildCount();
        for (int i18 = 0; i18 < childCount2; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.f11759a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.f11761c), 1073741824), this.f11700E);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i7, Rect rect) {
        int i8;
        int i9;
        int i10;
        f fVarM14374u;
        int childCount = getChildCount();
        if ((i7 & 2) != 0) {
            i9 = childCount;
            i8 = 0;
            i10 = 1;
        } else {
            i8 = childCount - 1;
            i9 = -1;
            i10 = -1;
        }
        while (i8 != i9) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 0 && (fVarM14374u = m14374u(childAt)) != null && fVarM14374u.f11755b == this.f11729f && childAt.requestFocus(i7, rect)) {
                return true;
            }
            i8 += i10;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.m6085a());
        AbstractC2869a abstractC2869a = this.f11727e;
        if (abstractC2869a != null) {
            abstractC2869a.mo14325k(lVar.f11768d, lVar.f11769e);
            m14359R(lVar.f11767c, false, true);
        } else {
            this.f11742r = lVar.f11767c;
            this.f11743s = lVar.f11768d;
            this.f11744t = lVar.f11769e;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.f11767c = this.f11729f;
        AbstractC2869a abstractC2869a = this.f11727e;
        if (abstractC2869a != null) {
            lVar.f11768d = abstractC2869a.mo14326l();
        }
        return lVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (i7 != i9) {
            int i11 = this.f11748x;
            m14335J(i7, i9, i11, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC2869a abstractC2869a;
        if (this.f11722b0) {
            return true;
        }
        boolean zM14338O = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC2869a = this.f11727e) == null || abstractC2869a.mo684c() == 0) {
            return false;
        }
        if (this.f11715T == null) {
            this.f11715T = VelocityTracker.obtain();
        }
        this.f11715T.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f11745u.abortAnimation();
            this.f11703H = false;
            m14354H();
            float x7 = motionEvent.getX();
            this.f11712Q = x7;
            this.f11710O = x7;
            float y7 = motionEvent.getY();
            this.f11713R = y7;
            this.f11711P = y7;
            this.f11714S = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f11710O = motionEvent.getX(actionIndex);
                        this.f11714S = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        m14332C(motionEvent);
                        this.f11710O = motionEvent.getX(motionEvent.findPointerIndex(this.f11714S));
                    }
                } else if (this.f11705J) {
                    m14339P(this.f11729f, true, 0, false);
                    zM14338O = m14338O();
                }
            } else if (!this.f11705J) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f11714S);
                if (iFindPointerIndex == -1) {
                    zM14338O = m14338O();
                } else {
                    float x8 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x8 - this.f11710O);
                    float y8 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y8 - this.f11711P);
                    if (fAbs > this.f11709N && fAbs > fAbs2) {
                        this.f11705J = true;
                        m14337N(true);
                        float f7 = this.f11712Q;
                        this.f11710O = x8 - f7 > 0.0f ? f7 + this.f11709N : f7 - this.f11709N;
                        this.f11711P = y8;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f11705J) {
                        zM14338O = m14334G(motionEvent.getX(motionEvent.findPointerIndex(this.f11714S)));
                    }
                }
            } else if (this.f11705J) {
                zM14338O = m14334G(motionEvent.getX(motionEvent.findPointerIndex(this.f11714S)));
            }
        } else if (this.f11705J) {
            VelocityTracker velocityTracker = this.f11715T;
            velocityTracker.computeCurrentVelocity(zzbbn.zzq.zzf, this.f11717V);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f11714S);
            this.f11703H = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f fVarM14349v = m14349v();
            float f8 = clientWidth;
            m14360S(m14343j(fVarM14349v.f11755b, ((scrollX / f8) - fVarM14349v.f11758e) / (fVarM14349v.f11757d + (this.f11748x / f8)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f11714S)) - this.f11712Q)), true, true, xVelocity);
            zM14338O = m14338O();
        }
        if (zM14338O) {
            AbstractC1030Z.m4456a0(this);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m14370p() {
        if (!this.f11722b0) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f11727e != null) {
            VelocityTracker velocityTracker = this.f11715T;
            velocityTracker.computeCurrentVelocity(zzbbn.zzq.zzf, this.f11717V);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f11714S);
            this.f11703H = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f fVarM14349v = m14349v();
            m14360S(m14343j(fVarM14349v.f11755b, ((scrollX / clientWidth) - fVarM14349v.f11758e) / fVarM14349v.f11757d, xVelocity, (int) (this.f11710O - this.f11712Q)), true, true, xVelocity);
        }
        m14347o();
        this.f11722b0 = false;
    }

    /* JADX INFO: renamed from: q */
    public boolean m14371q(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            return keyEvent.hasModifiers(2) ? m14352D() : m14365d(17);
        }
        if (keyCode == 22) {
            return keyEvent.hasModifiers(2) ? m14353E() : m14365d(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return m14365d(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return m14365d(1);
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public void m14372r(float f7) {
        if (!this.f11722b0) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f11727e == null) {
            return;
        }
        this.f11710O += f7;
        float scrollX = getScrollX() - f7;
        float clientWidth = getClientWidth();
        float f8 = this.f11697B * clientWidth;
        float f9 = this.f11698C * clientWidth;
        f fVar = (f) this.f11721b.get(0);
        ArrayList arrayList = this.f11721b;
        f fVar2 = (f) arrayList.get(arrayList.size() - 1);
        if (fVar.f11755b != 0) {
            f8 = fVar.f11758e * clientWidth;
        }
        if (fVar2.f11755b != this.f11727e.mo684c() - 1) {
            f9 = fVar2.f11758e * clientWidth;
        }
        if (scrollX < f8) {
            scrollX = f8;
        } else if (scrollX > f9) {
            scrollX = f9;
        }
        int i7 = (int) scrollX;
        this.f11710O += scrollX - i7;
        scrollTo(i7, getScrollY());
        m14333F(i7);
        MotionEvent motionEventObtain = MotionEvent.obtain(this.f11724c0, SystemClock.uptimeMillis(), 2, this.f11710O, 0.0f, 0);
        this.f11715T.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f11701F) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(AbstractC2869a abstractC2869a) {
        AbstractC2869a abstractC2869a2 = this.f11727e;
        if (abstractC2869a2 != null) {
            abstractC2869a2.m14328n(null);
            this.f11727e.mo14329o(this);
            for (int i7 = 0; i7 < this.f11721b.size(); i7++) {
                f fVar = (f) this.f11721b.get(i7);
                this.f11727e.mo683a(this, fVar.f11755b, fVar.f11754a);
            }
            this.f11727e.mo14319b(this);
            this.f11721b.clear();
            m14336K();
            this.f11729f = 0;
            scrollTo(0, 0);
        }
        AbstractC2869a abstractC2869a3 = this.f11727e;
        this.f11727e = abstractC2869a;
        this.f11719a = 0;
        if (abstractC2869a != null) {
            if (this.f11747w == null) {
                this.f11747w = new k();
            }
            this.f11727e.m14328n(this.f11747w);
            this.f11703H = false;
            boolean z7 = this.f11730f0;
            this.f11730f0 = true;
            this.f11719a = this.f11727e.mo684c();
            if (this.f11742r >= 0) {
                this.f11727e.mo14325k(this.f11743s, this.f11744t);
                m14359R(this.f11742r, false, true);
                this.f11742r = -1;
                this.f11743s = null;
                this.f11744t = null;
            } else if (z7) {
                requestLayout();
            } else {
                m14354H();
            }
        }
        List list = this.f11737m0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f11737m0.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((i) this.f11737m0.get(i8)).mo14380a(this, abstractC2869a3, abstractC2869a);
        }
    }

    public void setCurrentItem(int i7) {
        this.f11703H = false;
        m14359R(i7, !this.f11730f0, false);
    }

    public void setOffscreenPageLimit(int i7) {
        if (i7 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i7 + " too small; defaulting to 1");
            i7 = 1;
        }
        if (i7 != this.f11704I) {
            this.f11704I = i7;
            m14354H();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.f11735k0 = jVar;
    }

    public void setPageMargin(int i7) {
        int i8 = this.f11748x;
        this.f11748x = i7;
        int width = getWidth();
        m14335J(width, width, i7, i8);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f11749y = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i7) {
        if (this.f11741q0 == i7) {
            return;
        }
        this.f11741q0 = i7;
        m14346m(i7);
    }

    /* JADX INFO: renamed from: t */
    f m14373t(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return m14374u(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* JADX INFO: renamed from: u */
    f m14374u(View view) {
        for (int i7 = 0; i7 < this.f11721b.size(); i7++) {
            f fVar = (f) this.f11721b.get(i7);
            if (this.f11727e.mo14322h(view, fVar.f11754a)) {
                return fVar;
            }
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f11749y;
    }

    /* JADX INFO: renamed from: w */
    f m14375w(int i7) {
        for (int i8 = 0; i8 < this.f11721b.size(); i8++) {
            f fVar = (f) this.f11721b.get(i8);
            if (fVar.f11755b == i7) {
                return fVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    void m14376x() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f11745u = new Scroller(context, f11694t0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f7 = context.getResources().getDisplayMetrics().density;
        this.f11709N = viewConfiguration.getScaledPagingTouchSlop();
        this.f11716U = (int) (400.0f * f7);
        this.f11717V = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f11726d0 = new EdgeEffect(context);
        this.f11728e0 = new EdgeEffect(context);
        this.f11718W = (int) (25.0f * f7);
        this.f11720a0 = (int) (2.0f * f7);
        this.f11707L = (int) (f7 * 16.0f);
        AbstractC1030Z.m4474j0(this, new h());
        if (AbstractC1030Z.m4501x(this) == 0) {
            AbstractC1030Z.m4488q0(this, 1);
        }
        AbstractC1030Z.m4494t0(this, new d());
    }

    /* JADX INFO: renamed from: z */
    public boolean m14377z() {
        return this.f11722b0;
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.b$g */
    public static class g extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a */
        public boolean f11759a;

        /* JADX INFO: renamed from: b */
        public int f11760b;

        /* JADX INFO: renamed from: c */
        float f11761c;

        /* JADX INFO: renamed from: d */
        boolean f11762d;

        /* JADX INFO: renamed from: e */
        int f11763e;

        /* JADX INFO: renamed from: f */
        int f11764f;

        public g() {
            super(-1, -1);
            this.f11761c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11761c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2870b.f11692r0);
            this.f11760b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i7) {
        setPageMarginDrawable(AbstractC2436b.getDrawable(getContext(), i7));
    }
}
