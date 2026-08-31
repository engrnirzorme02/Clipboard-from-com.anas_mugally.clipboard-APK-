package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.content.AbstractC2436b;
import java.util.ArrayList;
import java.util.List;
import p033E.C0247b;
import p041F.AbstractC0400a;
import p111O.AbstractC1030Z;
import p111O.AbstractC1074t;
import p111O.C0982A0;
import p111O.C1032a;
import p118P.C1170s;
import p118P.InterfaceC1173v;
import p146T.AbstractC1446a;
import p153U.C1650c;
import p214c0.AbstractC2976a;
import p214c0.AbstractC2977b;
import p214c0.AbstractC2978c;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* JADX INFO: renamed from: W */
    private static final int[] f9746W = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: a0 */
    static final int[] f9747a0 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: b0 */
    static final boolean f9748b0;

    /* JADX INFO: renamed from: c0 */
    private static final boolean f9749c0;

    /* JADX INFO: renamed from: d0 */
    private static boolean f9750d0;

    /* JADX INFO: renamed from: A */
    private int f9751A;

    /* JADX INFO: renamed from: B */
    private int f9752B;

    /* JADX INFO: renamed from: C */
    private boolean f9753C;

    /* JADX INFO: renamed from: D */
    private InterfaceC2544e f9754D;

    /* JADX INFO: renamed from: E */
    private List f9755E;

    /* JADX INFO: renamed from: F */
    private float f9756F;

    /* JADX INFO: renamed from: G */
    private float f9757G;

    /* JADX INFO: renamed from: H */
    private Drawable f9758H;

    /* JADX INFO: renamed from: I */
    private Drawable f9759I;

    /* JADX INFO: renamed from: J */
    private Drawable f9760J;

    /* JADX INFO: renamed from: K */
    private CharSequence f9761K;

    /* JADX INFO: renamed from: L */
    private CharSequence f9762L;

    /* JADX INFO: renamed from: M */
    private Object f9763M;

    /* JADX INFO: renamed from: N */
    private boolean f9764N;

    /* JADX INFO: renamed from: O */
    private Drawable f9765O;

    /* JADX INFO: renamed from: P */
    private Drawable f9766P;

    /* JADX INFO: renamed from: Q */
    private Drawable f9767Q;

    /* JADX INFO: renamed from: R */
    private Drawable f9768R;

    /* JADX INFO: renamed from: S */
    private final ArrayList f9769S;

    /* JADX INFO: renamed from: T */
    private Rect f9770T;

    /* JADX INFO: renamed from: U */
    private Matrix f9771U;

    /* JADX INFO: renamed from: V */
    private final InterfaceC1173v f9772V;

    /* JADX INFO: renamed from: a */
    private final C2543d f9773a;

    /* JADX INFO: renamed from: b */
    private float f9774b;

    /* JADX INFO: renamed from: c */
    private int f9775c;

    /* JADX INFO: renamed from: d */
    private int f9776d;

    /* JADX INFO: renamed from: e */
    private float f9777e;

    /* JADX INFO: renamed from: f */
    private Paint f9778f;

    /* JADX INFO: renamed from: r */
    private final C1650c f9779r;

    /* JADX INFO: renamed from: s */
    private final C1650c f9780s;

    /* JADX INFO: renamed from: t */
    private final C2548i f9781t;

    /* JADX INFO: renamed from: u */
    private final C2548i f9782u;

    /* JADX INFO: renamed from: v */
    private int f9783v;

    /* JADX INFO: renamed from: w */
    private boolean f9784w;

    /* JADX INFO: renamed from: x */
    private boolean f9785x;

    /* JADX INFO: renamed from: y */
    private int f9786y;

    /* JADX INFO: renamed from: z */
    private int f9787z;

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    class C2540a implements InterfaceC1173v {
        C2540a() {
        }

        @Override // p118P.InterfaceC1173v
        /* JADX INFO: renamed from: a */
        public boolean mo3201a(View view, InterfaceC1173v.a aVar) {
            if (!DrawerLayout.this.m11678A(view) || DrawerLayout.this.m11703p(view) == 2) {
                return false;
            }
            DrawerLayout.this.m11692d(view);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    class ViewOnApplyWindowInsetsListenerC2541b implements View.OnApplyWindowInsetsListener {
        ViewOnApplyWindowInsetsListenerC2541b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).m11685M(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    class C2542c extends C1032a {

        /* JADX INFO: renamed from: d */
        private final Rect f9790d = new Rect();

        C2542c() {
        }

        /* JADX INFO: renamed from: n */
        private void m11708n(C1170s c1170s, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (DrawerLayout.m11677y(childAt)) {
                    c1170s.m5053c(childAt);
                }
            }
        }

        /* JADX INFO: renamed from: o */
        private void m11709o(C1170s c1170s, C1170s c1170s2) {
            Rect rect = this.f9790d;
            c1170s2.m5066l(rect);
            c1170s.m5063j0(rect);
            c1170s.m5039P0(c1170s2.m5050Z());
            c1170s.m5010A0(c1170s2.m5091z());
            c1170s.m5069m0(c1170s2.m5075q());
            c1170s.m5076q0(c1170s2.m5080t());
            c1170s.m5079s0(c1170s2.m5034N());
            c1170s.m5085v0(c1170s2.m5040Q());
            c1170s.m5060g0(c1170s2.m5024I());
            c1170s.m5025I0(c1170s2.m5047W());
            c1170s.m5051a(c1170s2.m5061i());
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: a */
        public boolean mo4581a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo4581a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewM11701n = DrawerLayout.this.m11701n();
            if (viewM11701n == null) {
                return true;
            }
            CharSequence charSequenceM11704q = DrawerLayout.this.m11704q(DrawerLayout.this.m11705r(viewM11701n));
            if (charSequenceM11704q == null) {
                return true;
            }
            text.add(charSequenceM11704q);
            return true;
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: f */
        public void mo4584f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo4584f(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: g */
        public void mo4585g(View view, C1170s c1170s) {
            if (DrawerLayout.f9748b0) {
                super.mo4585g(view, c1170s);
            } else {
                C1170s c1170sM5000b0 = C1170s.m5000b0(c1170s);
                super.mo4585g(view, c1170sM5000b0);
                c1170s.m5029K0(view);
                Object objM4431D = AbstractC1030Z.m4431D(view);
                if (objM4431D instanceof View) {
                    c1170s.m5014C0((View) objM4431D);
                }
                m11709o(c1170s, c1170sM5000b0);
                c1170sM5000b0.m5057e0();
                m11708n(c1170s, (ViewGroup) view);
            }
            c1170s.m5069m0("androidx.drawerlayout.widget.DrawerLayout");
            c1170s.m5083u0(false);
            c1170s.m5085v0(false);
            c1170s.m5058f0(C1170s.a.f4109e);
            c1170s.m5058f0(C1170s.a.f4110f);
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: i */
        public boolean mo4587i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f9748b0 || DrawerLayout.m11677y(view)) {
                return super.mo4587i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    static final class C2543d extends C1032a {
        C2543d() {
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: g */
        public void mo4585g(View view, C1170s c1170s) {
            super.mo4585g(view, c1170s);
            if (DrawerLayout.m11677y(view)) {
                return;
            }
            c1170s.m5014C0(null);
        }
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    public interface InterfaceC2544e {
        /* JADX INFO: renamed from: a */
        void mo11710a(View view);

        /* JADX INFO: renamed from: b */
        void mo11711b(View view);

        /* JADX INFO: renamed from: c */
        void mo11712c(int i7);

        /* JADX INFO: renamed from: d */
        void mo11713d(View view, float f7);
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$h */
    public static abstract class AbstractC2547h implements InterfaceC2544e {
        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC2544e
        /* JADX INFO: renamed from: c */
        public void mo11712c(int i7) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC2544e
        /* JADX INFO: renamed from: d */
        public void mo11713d(View view, float f7) {
        }
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$i */
    private class C2548i extends C1650c.c {

        /* JADX INFO: renamed from: a */
        private final int f9801a;

        /* JADX INFO: renamed from: b */
        private C1650c f9802b;

        /* JADX INFO: renamed from: c */
        private final Runnable f9803c = new a();

        /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$i$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C2548i.this.m11718o();
            }
        }

        C2548i(int i7) {
            this.f9801a = i7;
        }

        /* JADX INFO: renamed from: n */
        private void m11717n() {
            View viewM11699l = DrawerLayout.this.m11699l(this.f9801a == 3 ? 5 : 3);
            if (viewM11699l != null) {
                DrawerLayout.this.m11692d(viewM11699l);
            }
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: a */
        public int mo6886a(View view, int i7, int i8) {
            if (DrawerLayout.this.m11691c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i7, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i7, width));
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: b */
        public int mo6887b(View view, int i7, int i8) {
            return view.getTop();
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: d */
        public int mo6889d(View view) {
            if (DrawerLayout.this.m11679B(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: f */
        public void mo6891f(int i7, int i8) {
            View viewM11699l = (i7 & 1) == 1 ? DrawerLayout.this.m11699l(3) : DrawerLayout.this.m11699l(5);
            if (viewM11699l == null || DrawerLayout.this.m11703p(viewM11699l) != 0) {
                return;
            }
            this.f9802b.m6877b(viewM11699l, i8);
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: g */
        public boolean mo6892g(int i7) {
            return false;
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: h */
        public void mo6893h(int i7, int i8) {
            DrawerLayout.this.postDelayed(this.f9803c, 160L);
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: i */
        public void mo6894i(View view, int i7) {
            ((C2545f) view.getLayoutParams()).f9794c = false;
            m11717n();
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: j */
        public void mo6895j(int i7) {
            DrawerLayout.this.m11688R(i7, this.f9802b.m6882v());
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: k */
        public void mo6896k(View view, int i7, int i8, int i9, int i10) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.m11691c(view, 3) ? i7 + width : DrawerLayout.this.getWidth() - i7) / width;
            DrawerLayout.this.m11687O(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: l */
        public void mo6897l(View view, float f7, float f8) {
            int i7;
            float fM11706s = DrawerLayout.this.m11706s(view);
            int width = view.getWidth();
            if (DrawerLayout.this.m11691c(view, 3)) {
                i7 = (f7 > 0.0f || (f7 == 0.0f && fM11706s > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f7 < 0.0f || (f7 == 0.0f && fM11706s > 0.5f)) {
                    width2 -= width;
                }
                i7 = width2;
            }
            this.f9802b.m6872O(i7, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // p153U.C1650c.c
        /* JADX INFO: renamed from: m */
        public boolean mo6898m(View view, int i7) {
            return DrawerLayout.this.m11679B(view) && DrawerLayout.this.m11691c(view, this.f9801a) && DrawerLayout.this.m11703p(view) == 0;
        }

        /* JADX INFO: renamed from: o */
        void m11718o() {
            View viewM11699l;
            int width;
            int iM6884x = this.f9802b.m6884x();
            boolean z7 = this.f9801a == 3;
            if (z7) {
                viewM11699l = DrawerLayout.this.m11699l(3);
                width = (viewM11699l != null ? -viewM11699l.getWidth() : 0) + iM6884x;
            } else {
                viewM11699l = DrawerLayout.this.m11699l(5);
                width = DrawerLayout.this.getWidth() - iM6884x;
            }
            if (viewM11699l != null) {
                if (((!z7 || viewM11699l.getLeft() >= width) && (z7 || viewM11699l.getLeft() <= width)) || DrawerLayout.this.m11703p(viewM11699l) != 0) {
                    return;
                }
                C2545f c2545f = (C2545f) viewM11699l.getLayoutParams();
                this.f9802b.m6874Q(viewM11699l, width, viewM11699l.getTop());
                c2545f.f9794c = true;
                DrawerLayout.this.invalidate();
                m11717n();
                DrawerLayout.this.m11690b();
            }
        }

        /* JADX INFO: renamed from: p */
        public void m11719p() {
            DrawerLayout.this.removeCallbacks(this.f9803c);
        }

        /* JADX INFO: renamed from: q */
        public void m11720q(C1650c c1650c) {
            this.f9802b = c1650c;
        }
    }

    static {
        int i7 = Build.VERSION.SDK_INT;
        f9748b0 = true;
        f9749c0 = true;
        f9750d0 = i7 >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2976a.f12296a);
    }

    /* JADX INFO: renamed from: D */
    private boolean m11664D(float f7, float f8, View view) {
        if (this.f9770T == null) {
            this.f9770T = new Rect();
        }
        view.getHitRect(this.f9770T);
        return this.f9770T.contains((int) f7, (int) f8);
    }

    /* JADX INFO: renamed from: E */
    private void m11665E(Drawable drawable, int i7) {
        if (drawable == null || !AbstractC0400a.m1702h(drawable)) {
            return;
        }
        AbstractC0400a.m1707m(drawable, i7);
    }

    /* JADX INFO: renamed from: J */
    private Drawable m11666J() {
        int iM4505z = AbstractC1030Z.m4505z(this);
        if (iM4505z == 0) {
            Drawable drawable = this.f9765O;
            if (drawable != null) {
                m11665E(drawable, iM4505z);
                return this.f9765O;
            }
        } else {
            Drawable drawable2 = this.f9766P;
            if (drawable2 != null) {
                m11665E(drawable2, iM4505z);
                return this.f9766P;
            }
        }
        return this.f9767Q;
    }

    /* JADX INFO: renamed from: K */
    private Drawable m11667K() {
        int iM4505z = AbstractC1030Z.m4505z(this);
        if (iM4505z == 0) {
            Drawable drawable = this.f9766P;
            if (drawable != null) {
                m11665E(drawable, iM4505z);
                return this.f9766P;
            }
        } else {
            Drawable drawable2 = this.f9765O;
            if (drawable2 != null) {
                m11665E(drawable2, iM4505z);
                return this.f9765O;
            }
        }
        return this.f9768R;
    }

    /* JADX INFO: renamed from: L */
    private void m11668L() {
        if (f9749c0) {
            return;
        }
        this.f9759I = m11666J();
        this.f9760J = m11667K();
    }

    /* JADX INFO: renamed from: P */
    private void m11669P(View view) {
        C1170s.a aVar = C1170s.a.f4129y;
        AbstractC1030Z.m4462d0(view, aVar.m5094b());
        if (!m11678A(view) || m11703p(view) == 2) {
            return;
        }
        AbstractC1030Z.m4466f0(view, aVar, null, this.f9772V);
    }

    /* JADX INFO: renamed from: Q */
    private void m11670Q(View view, boolean z7) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if ((z7 || m11679B(childAt)) && !(z7 && childAt == view)) {
                AbstractC1030Z.m4488q0(childAt, 4);
            } else {
                AbstractC1030Z.m4488q0(childAt, 1);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private boolean m11671k(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventM11672t = m11672t(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventM11672t);
            motionEventM11672t.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    /* JADX INFO: renamed from: t */
    private MotionEvent m11672t(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f9771U == null) {
                this.f9771U = new Matrix();
            }
            matrix.invert(this.f9771U);
            motionEventObtain.transform(this.f9771U);
        }
        return motionEventObtain;
    }

    /* JADX INFO: renamed from: u */
    static String m11673u(int i7) {
        if ((i7 & 3) == 3) {
            return "LEFT";
        }
        return (i7 & 5) == 5 ? "RIGHT" : Integer.toHexString(i7);
    }

    /* JADX INFO: renamed from: v */
    private static boolean m11674v(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    /* JADX INFO: renamed from: w */
    private boolean m11675w() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            if (((C2545f) getChildAt(i7).getLayoutParams()).f9794c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    private boolean m11676x() {
        return m11701n() != null;
    }

    /* JADX INFO: renamed from: y */
    static boolean m11677y(View view) {
        return (AbstractC1030Z.m4501x(view) == 4 || AbstractC1030Z.m4501x(view) == 2) ? false : true;
    }

    /* JADX INFO: renamed from: A */
    public boolean m11678A(View view) {
        if (m11679B(view)) {
            return (((C2545f) view.getLayoutParams()).f9795d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* JADX INFO: renamed from: B */
    boolean m11679B(View view) {
        int iM4771b = AbstractC1074t.m4771b(((C2545f) view.getLayoutParams()).f9792a, AbstractC1030Z.m4505z(view));
        return ((iM4771b & 3) == 0 && (iM4771b & 5) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: C */
    public boolean m11680C(View view) {
        if (m11679B(view)) {
            return ((C2545f) view.getLayoutParams()).f9793b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* JADX INFO: renamed from: F */
    void m11681F(View view, float f7) {
        float fM11706s = m11706s(view);
        float width = view.getWidth();
        int i7 = ((int) (width * f7)) - ((int) (fM11706s * width));
        if (!m11691c(view, 3)) {
            i7 = -i7;
        }
        view.offsetLeftAndRight(i7);
        m11687O(view, f7);
    }

    /* JADX INFO: renamed from: G */
    public void m11682G(View view) {
        m11683H(view, true);
    }

    /* JADX INFO: renamed from: H */
    public void m11683H(View view, boolean z7) {
        if (!m11679B(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C2545f c2545f = (C2545f) view.getLayoutParams();
        if (this.f9785x) {
            c2545f.f9793b = 1.0f;
            c2545f.f9795d = 1;
            m11670Q(view, true);
            m11669P(view);
        } else if (z7) {
            c2545f.f9795d |= 2;
            if (m11691c(view, 3)) {
                this.f9779r.m6874Q(view, 0, view.getTop());
            } else {
                this.f9780s.m6874Q(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            m11681F(view, 1.0f);
            m11688R(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: I */
    public void m11684I(InterfaceC2544e interfaceC2544e) {
        List list;
        if (interfaceC2544e == null || (list = this.f9755E) == null) {
            return;
        }
        list.remove(interfaceC2544e);
    }

    /* JADX INFO: renamed from: M */
    public void m11685M(Object obj, boolean z7) {
        this.f9763M = obj;
        this.f9764N = z7;
        setWillNotDraw(!z7 && getBackground() == null);
        requestLayout();
    }

    /* JADX INFO: renamed from: N */
    public void m11686N(int i7, int i8) {
        View viewM11699l;
        int iM4771b = AbstractC1074t.m4771b(i8, AbstractC1030Z.m4505z(this));
        if (i8 == 3) {
            this.f9786y = i7;
        } else if (i8 == 5) {
            this.f9787z = i7;
        } else if (i8 == 8388611) {
            this.f9751A = i7;
        } else if (i8 == 8388613) {
            this.f9752B = i7;
        }
        if (i7 != 0) {
            (iM4771b == 3 ? this.f9779r : this.f9780s).m6876a();
        }
        if (i7 != 1) {
            if (i7 == 2 && (viewM11699l = m11699l(iM4771b)) != null) {
                m11682G(viewM11699l);
                return;
            }
            return;
        }
        View viewM11699l2 = m11699l(iM4771b);
        if (viewM11699l2 != null) {
            m11692d(viewM11699l2);
        }
    }

    /* JADX INFO: renamed from: O */
    void m11687O(View view, float f7) {
        C2545f c2545f = (C2545f) view.getLayoutParams();
        if (f7 == c2545f.f9793b) {
            return;
        }
        c2545f.f9793b = f7;
        m11698j(view, f7);
    }

    /* JADX INFO: renamed from: R */
    void m11688R(int i7, View view) {
        int i8;
        int iM6863A = this.f9779r.m6863A();
        int iM6863A2 = this.f9780s.m6863A();
        if (iM6863A == 1 || iM6863A2 == 1) {
            i8 = 1;
        } else {
            i8 = 2;
            if (iM6863A != 2 && iM6863A2 != 2) {
                i8 = 0;
            }
        }
        if (view != null && i7 == 0) {
            float f7 = ((C2545f) view.getLayoutParams()).f9793b;
            if (f7 == 0.0f) {
                m11696h(view);
            } else if (f7 == 1.0f) {
                m11697i(view);
            }
        }
        if (i8 != this.f9783v) {
            this.f9783v = i8;
            List list = this.f9755E;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((InterfaceC2544e) this.f9755E.get(size)).mo11712c(i8);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m11689a(InterfaceC2544e interfaceC2544e) {
        if (interfaceC2544e == null) {
            return;
        }
        if (this.f9755E == null) {
            this.f9755E = new ArrayList();
        }
        this.f9755E.add(interfaceC2544e);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i7, int i8) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z7 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (!m11679B(childAt)) {
                this.f9769S.add(childAt);
            } else if (m11678A(childAt)) {
                childAt.addFocusables(arrayList, i7, i8);
                z7 = true;
            }
        }
        if (!z7) {
            int size = this.f9769S.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) this.f9769S.get(i10);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i7, i8);
                }
            }
        }
        this.f9769S.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        if (m11700m() != null || m11679B(view)) {
            AbstractC1030Z.m4488q0(view, 4);
        } else {
            AbstractC1030Z.m4488q0(view, 1);
        }
        if (f9748b0) {
            return;
        }
        AbstractC1030Z.m4474j0(view, this.f9773a);
    }

    /* JADX INFO: renamed from: b */
    void m11690b() {
        if (this.f9753C) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f9753C = true;
    }

    /* JADX INFO: renamed from: c */
    boolean m11691c(View view, int i7) {
        return (m11705r(view) & i7) == i7;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C2545f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i7 = 0; i7 < childCount; i7++) {
            fMax = Math.max(fMax, ((C2545f) getChildAt(i7).getLayoutParams()).f9793b);
        }
        this.f9777e = fMax;
        boolean zM6880m = this.f9779r.m6880m(true);
        boolean zM6880m2 = this.f9780s.m6880m(true);
        if (zM6880m || zM6880m2) {
            AbstractC1030Z.m4456a0(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m11692d(View view) {
        m11693e(view, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f9777e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x7 = motionEvent.getX();
        float y7 = motionEvent.getY();
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            View childAt = getChildAt(i7);
            if (m11664D(x7, y7, childAt) && !m11707z(childAt) && m11671k(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j7) {
        int height = getHeight();
        boolean zM11707z = m11707z(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i7 = 0;
        if (zM11707z) {
            int childCount = getChildCount();
            int i8 = 0;
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (childAt != view && childAt.getVisibility() == 0 && m11674v(childAt) && m11679B(childAt) && childAt.getHeight() >= height) {
                    if (m11691c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i8) {
                            i8 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i8, 0, width, getHeight());
            i7 = i8;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j7);
        canvas.restoreToCount(iSave);
        float f7 = this.f9777e;
        if (f7 > 0.0f && zM11707z) {
            int i10 = this.f9776d;
            this.f9778f.setColor((i10 & 16777215) | (((int) ((((-16777216) & i10) >>> 24) * f7)) << 24));
            canvas.drawRect(i7, 0.0f, width, getHeight(), this.f9778f);
            return zDrawChild;
        }
        if (this.f9759I != null && m11691c(view, 3)) {
            int intrinsicWidth = this.f9759I.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.f9779r.m6884x(), 1.0f));
            this.f9759I.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f9759I.setAlpha((int) (fMax * 255.0f));
            this.f9759I.draw(canvas);
            return zDrawChild;
        }
        if (this.f9760J != null && m11691c(view, 5)) {
            int intrinsicWidth2 = this.f9760J.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f9780s.m6884x(), 1.0f));
            this.f9760J.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f9760J.setAlpha((int) (fMax2 * 255.0f));
            this.f9760J.draw(canvas);
        }
        return zDrawChild;
    }

    /* JADX INFO: renamed from: e */
    public void m11693e(View view, boolean z7) {
        if (!m11679B(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C2545f c2545f = (C2545f) view.getLayoutParams();
        if (this.f9785x) {
            c2545f.f9793b = 0.0f;
            c2545f.f9795d = 0;
        } else if (z7) {
            c2545f.f9795d |= 4;
            if (m11691c(view, 3)) {
                this.f9779r.m6874Q(view, -view.getWidth(), view.getTop());
            } else {
                this.f9780s.m6874Q(view, getWidth(), view.getTop());
            }
        } else {
            m11681F(view, 0.0f);
            m11688R(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: f */
    public void m11694f() {
        m11695g(false);
    }

    /* JADX INFO: renamed from: g */
    void m11695g(boolean z7) {
        int childCount = getChildCount();
        boolean zM6874Q = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            C2545f c2545f = (C2545f) childAt.getLayoutParams();
            if (m11679B(childAt) && (!z7 || c2545f.f9794c)) {
                zM6874Q |= m11691c(childAt, 3) ? this.f9779r.m6874Q(childAt, -childAt.getWidth(), childAt.getTop()) : this.f9780s.m6874Q(childAt, getWidth(), childAt.getTop());
                c2545f.f9794c = false;
            }
        }
        this.f9781t.m11719p();
        this.f9782u.m11719p();
        if (zM6874Q) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2545f(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C2545f) {
            return new C2545f((C2545f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2545f((ViewGroup.MarginLayoutParams) layoutParams) : new C2545f(layoutParams);
    }

    public float getDrawerElevation() {
        if (f9749c0) {
            return this.f9774b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f9758H;
    }

    /* JADX INFO: renamed from: h */
    void m11696h(View view) {
        View rootView;
        C2545f c2545f = (C2545f) view.getLayoutParams();
        if ((c2545f.f9795d & 1) == 1) {
            c2545f.f9795d = 0;
            List list = this.f9755E;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((InterfaceC2544e) this.f9755E.get(size)).mo11711b(view);
                }
            }
            m11670Q(view, false);
            m11669P(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    /* JADX INFO: renamed from: i */
    void m11697i(View view) {
        C2545f c2545f = (C2545f) view.getLayoutParams();
        if ((c2545f.f9795d & 1) == 0) {
            c2545f.f9795d = 1;
            List list = this.f9755E;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((InterfaceC2544e) this.f9755E.get(size)).mo11710a(view);
                }
            }
            m11670Q(view, true);
            m11669P(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    void m11698j(View view, float f7) {
        List list = this.f9755E;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((InterfaceC2544e) this.f9755E.get(size)).mo11713d(view, f7);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    View m11699l(int i7) {
        int iM4771b = AbstractC1074t.m4771b(i7, AbstractC1030Z.m4505z(this)) & 7;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if ((m11705r(childAt) & 7) == iM4771b) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    View m11700m() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if ((((C2545f) childAt.getLayoutParams()).f9795d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    View m11701n() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (m11679B(childAt) && m11680C(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public int m11702o(int i7) {
        int iM4505z = AbstractC1030Z.m4505z(this);
        if (i7 == 3) {
            int i8 = this.f9786y;
            if (i8 != 3) {
                return i8;
            }
            int i9 = iM4505z == 0 ? this.f9751A : this.f9752B;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
        if (i7 == 5) {
            int i10 = this.f9787z;
            if (i10 != 3) {
                return i10;
            }
            int i11 = iM4505z == 0 ? this.f9752B : this.f9751A;
            if (i11 != 3) {
                return i11;
            }
            return 0;
        }
        if (i7 == 8388611) {
            int i12 = this.f9751A;
            if (i12 != 3) {
                return i12;
            }
            int i13 = iM4505z == 0 ? this.f9786y : this.f9787z;
            if (i13 != 3) {
                return i13;
            }
            return 0;
        }
        if (i7 != 8388613) {
            return 0;
        }
        int i14 = this.f9752B;
        if (i14 != 3) {
            return i14;
        }
        int i15 = iM4505z == 0 ? this.f9787z : this.f9786y;
        if (i15 != 3) {
            return i15;
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9785x = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9785x = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f9764N || this.f9758H == null) {
            return;
        }
        Object obj = this.f9763M;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f9758H.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f9758H.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z7;
        View viewM6881t;
        int actionMasked = motionEvent.getActionMasked();
        boolean zM6873P = this.f9779r.m6873P(motionEvent) | this.f9780s.m6873P(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                m11695g(true);
                this.f9753C = false;
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    m11695g(true);
                    this.f9753C = false;
                }
            } else if (this.f9779r.m6878d(3)) {
                this.f9781t.m11719p();
                this.f9782u.m11719p();
            }
            z7 = false;
        } else {
            float x7 = motionEvent.getX();
            float y7 = motionEvent.getY();
            this.f9756F = x7;
            this.f9757G = y7;
            z7 = this.f9777e > 0.0f && (viewM6881t = this.f9779r.m6881t((int) x7, (int) y7)) != null && m11707z(viewM6881t);
            this.f9753C = false;
        }
        return zM6873P || z7 || m11675w() || this.f9753C;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (i7 != 4 || !m11676x()) {
            return super.onKeyDown(i7, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i7, KeyEvent keyEvent) {
        if (i7 != 4) {
            return super.onKeyUp(i7, keyEvent);
        }
        View viewM11701n = m11701n();
        if (viewM11701n != null && m11703p(viewM11701n) == 0) {
            m11694f();
        }
        return viewM11701n != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        WindowInsets rootWindowInsets;
        float f7;
        int i11;
        boolean z8 = true;
        this.f9784w = true;
        int i12 = i9 - i7;
        int childCount = getChildCount();
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C2545f c2545f = (C2545f) childAt.getLayoutParams();
                if (m11707z(childAt)) {
                    int i14 = ((ViewGroup.MarginLayoutParams) c2545f).leftMargin;
                    childAt.layout(i14, ((ViewGroup.MarginLayoutParams) c2545f).topMargin, childAt.getMeasuredWidth() + i14, ((ViewGroup.MarginLayoutParams) c2545f).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m11691c(childAt, 3)) {
                        float f8 = measuredWidth;
                        i11 = (-measuredWidth) + ((int) (c2545f.f9793b * f8));
                        f7 = (measuredWidth + i11) / f8;
                    } else {
                        float f9 = measuredWidth;
                        int i15 = i12 - ((int) (c2545f.f9793b * f9));
                        f7 = (i12 - i15) / f9;
                        i11 = i15;
                    }
                    boolean z9 = f7 != c2545f.f9793b ? z8 : false;
                    int i16 = c2545f.f9792a & 112;
                    if (i16 == 16) {
                        int i17 = i10 - i8;
                        int i18 = (i17 - measuredHeight) / 2;
                        int i19 = ((ViewGroup.MarginLayoutParams) c2545f).topMargin;
                        if (i18 < i19) {
                            i18 = i19;
                        } else {
                            int i20 = i18 + measuredHeight;
                            int i21 = ((ViewGroup.MarginLayoutParams) c2545f).bottomMargin;
                            if (i20 > i17 - i21) {
                                i18 = (i17 - i21) - measuredHeight;
                            }
                        }
                        childAt.layout(i11, i18, measuredWidth + i11, measuredHeight + i18);
                    } else if (i16 != 80) {
                        int i22 = ((ViewGroup.MarginLayoutParams) c2545f).topMargin;
                        childAt.layout(i11, i22, measuredWidth + i11, measuredHeight + i22);
                    } else {
                        int i23 = i10 - i8;
                        childAt.layout(i11, (i23 - ((ViewGroup.MarginLayoutParams) c2545f).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i11, i23 - ((ViewGroup.MarginLayoutParams) c2545f).bottomMargin);
                    }
                    if (z9) {
                        m11687O(childAt, f7);
                    }
                    int i24 = c2545f.f9793b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i24) {
                        childAt.setVisibility(i24);
                    }
                }
            }
            i13++;
            z8 = true;
        }
        if (f9750d0 && (rootWindowInsets = getRootWindowInsets()) != null) {
            C0247b c0247bM4274h = C0982A0.m4265x(rootWindowInsets).m4274h();
            C1650c c1650c = this.f9779r;
            c1650c.m6869L(Math.max(c1650c.m6883w(), c0247bM4274h.f984a));
            C1650c c1650c2 = this.f9780s;
            c1650c2.m6869L(Math.max(c1650c2.m6883w(), c0247bM4274h.f986c));
        }
        this.f9784w = false;
        this.f9785x = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z7 = this.f9763M != null && AbstractC1030Z.m4499w(this);
        int iM4505z = AbstractC1030Z.m4505z(this);
        int childCount = getChildCount();
        boolean z8 = false;
        boolean z9 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C2545f c2545f = (C2545f) childAt.getLayoutParams();
                if (z7) {
                    int iM4771b = AbstractC1074t.m4771b(c2545f.f9792a, iM4505z);
                    if (AbstractC1030Z.m4499w(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.f9763M;
                        if (iM4771b == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iM4771b == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.f9763M;
                        if (iM4771b == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (iM4771b == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) c2545f).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) c2545f).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) c2545f).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) c2545f).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (m11707z(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) c2545f).leftMargin) - ((ViewGroup.MarginLayoutParams) c2545f).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) c2545f).topMargin) - ((ViewGroup.MarginLayoutParams) c2545f).bottomMargin, 1073741824));
                } else {
                    if (!m11679B(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i9 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f9749c0) {
                        float fM4495u = AbstractC1030Z.m4495u(childAt);
                        float f7 = this.f9774b;
                        if (fM4495u != f7) {
                            AbstractC1030Z.m4486p0(childAt, f7);
                        }
                    }
                    int iM11705r = m11705r(childAt) & 7;
                    boolean z10 = iM11705r == 3;
                    if ((z10 && z8) || (!z10 && z9)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m11673u(iM11705r) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z10) {
                        z8 = true;
                    } else {
                        z9 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i7, this.f9775c + ((ViewGroup.MarginLayoutParams) c2545f).leftMargin + ((ViewGroup.MarginLayoutParams) c2545f).rightMargin, ((ViewGroup.MarginLayoutParams) c2545f).width), ViewGroup.getChildMeasureSpec(i8, ((ViewGroup.MarginLayoutParams) c2545f).topMargin + ((ViewGroup.MarginLayoutParams) c2545f).bottomMargin, ((ViewGroup.MarginLayoutParams) c2545f).height));
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View viewM11699l;
        if (!(parcelable instanceof C2546g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2546g c2546g = (C2546g) parcelable;
        super.onRestoreInstanceState(c2546g.m6085a());
        int i7 = c2546g.f9796c;
        if (i7 != 0 && (viewM11699l = m11699l(i7)) != null) {
            m11682G(viewM11699l);
        }
        int i8 = c2546g.f9797d;
        if (i8 != 3) {
            m11686N(i8, 3);
        }
        int i9 = c2546g.f9798e;
        if (i9 != 3) {
            m11686N(i9, 5);
        }
        int i10 = c2546g.f9799f;
        if (i10 != 3) {
            m11686N(i10, 8388611);
        }
        int i11 = c2546g.f9800r;
        if (i11 != 3) {
            m11686N(i11, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i7) {
        m11668L();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C2546g c2546g = new C2546g(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            C2545f c2545f = (C2545f) getChildAt(i7).getLayoutParams();
            int i8 = c2545f.f9795d;
            boolean z7 = i8 == 1;
            boolean z8 = i8 == 2;
            if (z7 || z8) {
                c2546g.f9796c = c2545f.f9792a;
                break;
            }
        }
        c2546g.f9797d = this.f9786y;
        c2546g.f9798e = this.f9787z;
        c2546g.f9799f = this.f9751A;
        c2546g.f9800r = this.f9752B;
        return c2546g;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z7;
        View viewM11700m;
        this.f9779r.m6867F(motionEvent);
        this.f9780s.m6867F(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x7 = motionEvent.getX();
            float y7 = motionEvent.getY();
            this.f9756F = x7;
            this.f9757G = y7;
            this.f9753C = false;
        } else if (action == 1) {
            float x8 = motionEvent.getX();
            float y8 = motionEvent.getY();
            View viewM6881t = this.f9779r.m6881t((int) x8, (int) y8);
            if (viewM6881t != null && m11707z(viewM6881t)) {
                float f7 = x8 - this.f9756F;
                float f8 = y8 - this.f9757G;
                int iM6885z = this.f9779r.m6885z();
                z7 = (f7 * f7) + (f8 * f8) >= ((float) (iM6885z * iM6885z)) || (viewM11700m = m11700m()) == null || m11703p(viewM11700m) == 2;
            }
            m11695g(z7);
        } else if (action == 3) {
            m11695g(true);
            this.f9753C = false;
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public int m11703p(View view) {
        if (m11679B(view)) {
            return m11702o(((C2545f) view.getLayoutParams()).f9792a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* JADX INFO: renamed from: q */
    public CharSequence m11704q(int i7) {
        int iM4771b = AbstractC1074t.m4771b(i7, AbstractC1030Z.m4505z(this));
        if (iM4771b == 3) {
            return this.f9761K;
        }
        if (iM4771b == 5) {
            return this.f9762L;
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    int m11705r(View view) {
        return AbstractC1074t.m4771b(((C2545f) view.getLayoutParams()).f9792a, AbstractC1030Z.m4505z(this));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z7) {
        super.requestDisallowInterceptTouchEvent(z7);
        if (z7) {
            m11695g(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f9784w) {
            return;
        }
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    float m11706s(View view) {
        return ((C2545f) view.getLayoutParams()).f9793b;
    }

    public void setDrawerElevation(float f7) {
        this.f9774b = f7;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (m11679B(childAt)) {
                AbstractC1030Z.m4486p0(childAt, this.f9774b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(InterfaceC2544e interfaceC2544e) {
        InterfaceC2544e interfaceC2544e2 = this.f9754D;
        if (interfaceC2544e2 != null) {
            m11684I(interfaceC2544e2);
        }
        if (interfaceC2544e != null) {
            m11689a(interfaceC2544e);
        }
        this.f9754D = interfaceC2544e;
    }

    public void setDrawerLockMode(int i7) {
        m11686N(i7, 3);
        m11686N(i7, 5);
    }

    public void setScrimColor(int i7) {
        this.f9776d = i7;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f9758H = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i7) {
        this.f9758H = new ColorDrawable(i7);
        invalidate();
    }

    /* JADX INFO: renamed from: z */
    boolean m11707z(View view) {
        return ((C2545f) view.getLayoutParams()).f9792a == 0;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f9773a = new C2543d();
        this.f9776d = -1728053248;
        this.f9778f = new Paint();
        this.f9785x = true;
        this.f9786y = 3;
        this.f9787z = 3;
        this.f9751A = 3;
        this.f9752B = 3;
        this.f9765O = null;
        this.f9766P = null;
        this.f9767Q = null;
        this.f9768R = null;
        this.f9772V = new C2540a();
        setDescendantFocusability(262144);
        float f7 = getResources().getDisplayMetrics().density;
        this.f9775c = (int) ((64.0f * f7) + 0.5f);
        float f8 = f7 * 400.0f;
        C2548i c2548i = new C2548i(3);
        this.f9781t = c2548i;
        C2548i c2548i2 = new C2548i(5);
        this.f9782u = c2548i2;
        C1650c c1650cM6855n = C1650c.m6855n(this, 1.0f, c2548i);
        this.f9779r = c1650cM6855n;
        c1650cM6855n.m6870M(1);
        c1650cM6855n.m6871N(f8);
        c2548i.m11720q(c1650cM6855n);
        C1650c c1650cM6855n2 = C1650c.m6855n(this, 1.0f, c2548i2);
        this.f9780s = c1650cM6855n2;
        c1650cM6855n2.m6870M(2);
        c1650cM6855n2.m6871N(f8);
        c2548i2.m11720q(c1650cM6855n2);
        setFocusableInTouchMode(true);
        AbstractC1030Z.m4488q0(this, 1);
        AbstractC1030Z.m4474j0(this, new C2542c());
        setMotionEventSplittingEnabled(false);
        if (AbstractC1030Z.m4499w(this)) {
            setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC2541b());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f9746W);
            try {
                this.f9758H = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC2978c.f12299b, i7, 0);
        try {
            int i8 = AbstractC2978c.f12300c;
            if (typedArrayObtainStyledAttributes2.hasValue(i8)) {
                this.f9774b = typedArrayObtainStyledAttributes2.getDimension(i8, 0.0f);
            } else {
                this.f9774b = getResources().getDimension(AbstractC2977b.f12297a);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f9769S = new ArrayList();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public void setStatusBarBackground(int i7) {
        this.f9758H = i7 != 0 ? AbstractC2436b.getDrawable(getContext(), i7) : null;
        invalidate();
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$f */
    public static class C2545f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public int f9792a;

        /* JADX INFO: renamed from: b */
        float f9793b;

        /* JADX INFO: renamed from: c */
        boolean f9794c;

        /* JADX INFO: renamed from: d */
        int f9795d;

        public C2545f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9792a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f9747a0);
            this.f9792a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C2545f(int i7, int i8) {
            super(i7, i8);
            this.f9792a = 0;
        }

        public C2545f(C2545f c2545f) {
            super((ViewGroup.MarginLayoutParams) c2545f);
            this.f9792a = 0;
            this.f9792a = c2545f.f9792a;
        }

        public C2545f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9792a = 0;
        }

        public C2545f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f9792a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2545f(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$g */
    protected static class C2546g extends AbstractC1446a {
        public static final Parcelable.Creator<C2546g> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        int f9796c;

        /* JADX INFO: renamed from: d */
        int f9797d;

        /* JADX INFO: renamed from: e */
        int f9798e;

        /* JADX INFO: renamed from: f */
        int f9799f;

        /* JADX INFO: renamed from: r */
        int f9800r;

        /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$g$a */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C2546g createFromParcel(Parcel parcel) {
                return new C2546g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C2546g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2546g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public C2546g[] newArray(int i7) {
                return new C2546g[i7];
            }
        }

        public C2546g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9796c = 0;
            this.f9796c = parcel.readInt();
            this.f9797d = parcel.readInt();
            this.f9798e = parcel.readInt();
            this.f9799f = parcel.readInt();
            this.f9800r = parcel.readInt();
        }

        @Override // p146T.AbstractC1446a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f9796c);
            parcel.writeInt(this.f9797d);
            parcel.writeInt(this.f9798e);
            parcel.writeInt(this.f9799f);
            parcel.writeInt(this.f9800r);
        }

        public C2546g(Parcelable parcelable) {
            super(parcelable);
            this.f9796c = 0;
        }
    }
}
