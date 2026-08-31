package p153U;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.google.android.gms.internal.ads.zzbbn;
import java.util.Arrays;
import p111O.AbstractC1030Z;

/* JADX INFO: renamed from: U.c */
/* JADX INFO: loaded from: classes.dex */
public class C1650c {

    /* JADX INFO: renamed from: x */
    private static final Interpolator f5421x = new a();

    /* JADX INFO: renamed from: a */
    private int f5422a;

    /* JADX INFO: renamed from: b */
    private int f5423b;

    /* JADX INFO: renamed from: d */
    private float[] f5425d;

    /* JADX INFO: renamed from: e */
    private float[] f5426e;

    /* JADX INFO: renamed from: f */
    private float[] f5427f;

    /* JADX INFO: renamed from: g */
    private float[] f5428g;

    /* JADX INFO: renamed from: h */
    private int[] f5429h;

    /* JADX INFO: renamed from: i */
    private int[] f5430i;

    /* JADX INFO: renamed from: j */
    private int[] f5431j;

    /* JADX INFO: renamed from: k */
    private int f5432k;

    /* JADX INFO: renamed from: l */
    private VelocityTracker f5433l;

    /* JADX INFO: renamed from: m */
    private float f5434m;

    /* JADX INFO: renamed from: n */
    private float f5435n;

    /* JADX INFO: renamed from: o */
    private int f5436o;

    /* JADX INFO: renamed from: p */
    private final int f5437p;

    /* JADX INFO: renamed from: q */
    private int f5438q;

    /* JADX INFO: renamed from: r */
    private OverScroller f5439r;

    /* JADX INFO: renamed from: s */
    private final c f5440s;

    /* JADX INFO: renamed from: t */
    private View f5441t;

    /* JADX INFO: renamed from: u */
    private boolean f5442u;

    /* JADX INFO: renamed from: v */
    private final ViewGroup f5443v;

    /* JADX INFO: renamed from: c */
    private int f5424c = -1;

    /* JADX INFO: renamed from: w */
    private final Runnable f5444w = new b();

    /* JADX INFO: renamed from: U.c$a */
    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f7) {
            float f8 = f7 - 1.0f;
            return (f8 * f8 * f8 * f8 * f8) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: U.c$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1650c.this.m6868K(0);
        }
    }

    /* JADX INFO: renamed from: U.c$c */
    public static abstract class c {
        /* JADX INFO: renamed from: a */
        public abstract int mo6886a(View view, int i7, int i8);

        /* JADX INFO: renamed from: b */
        public abstract int mo6887b(View view, int i7, int i8);

        /* JADX INFO: renamed from: c */
        public int m6888c(int i7) {
            return i7;
        }

        /* JADX INFO: renamed from: d */
        public int mo6889d(View view) {
            return 0;
        }

        /* JADX INFO: renamed from: e */
        public int mo6890e(View view) {
            return 0;
        }

        /* JADX INFO: renamed from: f */
        public void mo6891f(int i7, int i8) {
        }

        /* JADX INFO: renamed from: g */
        public boolean mo6892g(int i7) {
            return false;
        }

        /* JADX INFO: renamed from: h */
        public void mo6893h(int i7, int i8) {
        }

        /* JADX INFO: renamed from: i */
        public void mo6894i(View view, int i7) {
        }

        /* JADX INFO: renamed from: j */
        public abstract void mo6895j(int i7);

        /* JADX INFO: renamed from: k */
        public abstract void mo6896k(View view, int i7, int i8, int i9, int i10);

        /* JADX INFO: renamed from: l */
        public abstract void mo6897l(View view, float f7, float f8);

        /* JADX INFO: renamed from: m */
        public abstract boolean mo6898m(View view, int i7);
    }

    private C1650c(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f5443v = viewGroup;
        this.f5440s = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i7 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f5437p = i7;
        this.f5436o = i7;
        this.f5423b = viewConfiguration.getScaledTouchSlop();
        this.f5434m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f5435n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5439r = new OverScroller(context, f5421x);
    }

    /* JADX INFO: renamed from: D */
    private boolean m6842D(int i7) {
        if (m6865C(i7)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i7 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX INFO: renamed from: G */
    private void m6843G() {
        this.f5433l.computeCurrentVelocity(zzbbn.zzq.zzf, this.f5434m);
        m6857p(m6849g(this.f5433l.getXVelocity(this.f5424c), this.f5435n, this.f5434m), m6849g(this.f5433l.getYVelocity(this.f5424c), this.f5435n, this.f5434m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [U.c$c] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: H */
    private void m6844H(float f7, float f8, int i7) {
        int i8;
        boolean zM6847c = m6847c(f7, f8, i7, 1);
        ?? r7 = zM6847c;
        if (m6847c(f8, f7, i7, 4)) {
            r7 = (zM6847c ? 1 : 0) | 4;
        }
        ?? r8 = r7;
        if (m6847c(f7, f8, i7, 2)) {
            r8 = (r7 == true ? 1 : 0) | 2;
        }
        ?? r9 = r8;
        if (m6847c(f8, f7, i7, 8)) {
            i8 = (r8 == true ? 1 : 0) | 8;
        }
        if (r9 == 0) {
            r9 = i8;
            return;
        }
        r9 = i8;
        int[] iArr = this.f5430i;
        iArr[i7] = (iArr[i7] | r9) == true ? 1 : 0;
        this.f5440s.mo6891f(r9, i7);
    }

    /* JADX INFO: renamed from: I */
    private void m6845I(float f7, float f8, int i7) {
        m6860s(i7);
        float[] fArr = this.f5425d;
        this.f5427f[i7] = f7;
        fArr[i7] = f7;
        float[] fArr2 = this.f5426e;
        this.f5428g[i7] = f8;
        fArr2[i7] = f8;
        this.f5429h[i7] = m6862y((int) f7, (int) f8);
        this.f5432k |= 1 << i7;
    }

    /* JADX INFO: renamed from: J */
    private void m6846J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i7 = 0; i7 < pointerCount; i7++) {
            int pointerId = motionEvent.getPointerId(i7);
            if (m6842D(pointerId)) {
                float x7 = motionEvent.getX(i7);
                float y7 = motionEvent.getY(i7);
                this.f5427f[pointerId] = x7;
                this.f5428g[pointerId] = y7;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m6847c(float f7, float f8, int i7, int i8) {
        float fAbs = Math.abs(f7);
        float fAbs2 = Math.abs(f8);
        if ((this.f5429h[i7] & i8) == i8 && (this.f5438q & i8) != 0 && (this.f5431j[i7] & i8) != i8 && (this.f5430i[i7] & i8) != i8) {
            int i9 = this.f5423b;
            if (fAbs > i9 || fAbs2 > i9) {
                if (fAbs < fAbs2 * 0.5f && this.f5440s.mo6892g(i8)) {
                    int[] iArr = this.f5431j;
                    iArr[i7] = iArr[i7] | i8;
                    return false;
                }
                if ((this.f5430i[i7] & i8) == 0 && fAbs > this.f5423b) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    private boolean m6848f(View view, float f7, float f8) {
        if (view == null) {
            return false;
        }
        boolean z7 = this.f5440s.mo6889d(view) > 0;
        boolean z8 = this.f5440s.mo6890e(view) > 0;
        if (z7 && z8) {
            float f9 = (f7 * f7) + (f8 * f8);
            int i7 = this.f5423b;
            return f9 > ((float) (i7 * i7));
        }
        if (z7) {
            return Math.abs(f7) > ((float) this.f5423b);
        }
        return z8 && Math.abs(f8) > ((float) this.f5423b);
    }

    /* JADX INFO: renamed from: g */
    private float m6849g(float f7, float f8, float f9) {
        float fAbs = Math.abs(f7);
        if (fAbs < f8) {
            return 0.0f;
        }
        if (fAbs > f9) {
            return f7 > 0.0f ? f9 : -f9;
        }
        return f7;
    }

    /* JADX INFO: renamed from: h */
    private int m6850h(int i7, int i8, int i9) {
        int iAbs = Math.abs(i7);
        if (iAbs < i8) {
            return 0;
        }
        if (iAbs > i9) {
            return i7 > 0 ? i9 : -i9;
        }
        return i7;
    }

    /* JADX INFO: renamed from: i */
    private void m6851i() {
        float[] fArr = this.f5425d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f5426e, 0.0f);
        Arrays.fill(this.f5427f, 0.0f);
        Arrays.fill(this.f5428g, 0.0f);
        Arrays.fill(this.f5429h, 0);
        Arrays.fill(this.f5430i, 0);
        Arrays.fill(this.f5431j, 0);
        this.f5432k = 0;
    }

    /* JADX INFO: renamed from: j */
    private void m6852j(int i7) {
        if (this.f5425d == null || !m6865C(i7)) {
            return;
        }
        this.f5425d[i7] = 0.0f;
        this.f5426e[i7] = 0.0f;
        this.f5427f[i7] = 0.0f;
        this.f5428g[i7] = 0.0f;
        this.f5429h[i7] = 0;
        this.f5430i[i7] = 0;
        this.f5431j[i7] = 0;
        this.f5432k = (~(1 << i7)) & this.f5432k;
    }

    /* JADX INFO: renamed from: k */
    private int m6853k(int i7, int i8, int i9) {
        if (i7 == 0) {
            return 0;
        }
        int width = this.f5443v.getWidth();
        float f7 = width / 2;
        float fM6858q = f7 + (m6858q(Math.min(1.0f, Math.abs(i7) / width)) * f7);
        int iAbs = Math.abs(i8);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fM6858q / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i7) / i9) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: l */
    private int m6854l(View view, int i7, int i8, int i9, int i10) {
        float f7;
        float f8;
        float f9;
        float f10;
        int iM6850h = m6850h(i9, (int) this.f5435n, (int) this.f5434m);
        int iM6850h2 = m6850h(i10, (int) this.f5435n, (int) this.f5434m);
        int iAbs = Math.abs(i7);
        int iAbs2 = Math.abs(i8);
        int iAbs3 = Math.abs(iM6850h);
        int iAbs4 = Math.abs(iM6850h2);
        int i11 = iAbs3 + iAbs4;
        int i12 = iAbs + iAbs2;
        if (iM6850h != 0) {
            f7 = iAbs3;
            f8 = i11;
        } else {
            f7 = iAbs;
            f8 = i12;
        }
        float f11 = f7 / f8;
        if (iM6850h2 != 0) {
            f9 = iAbs4;
            f10 = i11;
        } else {
            f9 = iAbs2;
            f10 = i12;
        }
        return (int) ((m6853k(i7, iM6850h, this.f5440s.mo6889d(view)) * f11) + (m6853k(i8, iM6850h2, this.f5440s.mo6890e(view)) * (f9 / f10)));
    }

    /* JADX INFO: renamed from: n */
    public static C1650c m6855n(ViewGroup viewGroup, float f7, c cVar) {
        C1650c c1650cM6856o = m6856o(viewGroup, cVar);
        c1650cM6856o.f5423b = (int) (c1650cM6856o.f5423b * (1.0f / f7));
        return c1650cM6856o;
    }

    /* JADX INFO: renamed from: o */
    public static C1650c m6856o(ViewGroup viewGroup, c cVar) {
        return new C1650c(viewGroup.getContext(), viewGroup, cVar);
    }

    /* JADX INFO: renamed from: p */
    private void m6857p(float f7, float f8) {
        this.f5442u = true;
        this.f5440s.mo6897l(this.f5441t, f7, f8);
        this.f5442u = false;
        if (this.f5422a == 1) {
            m6868K(0);
        }
    }

    /* JADX INFO: renamed from: q */
    private float m6858q(float f7) {
        return (float) Math.sin((f7 - 0.5f) * 0.47123894f);
    }

    /* JADX INFO: renamed from: r */
    private void m6859r(int i7, int i8, int i9, int i10) {
        int left = this.f5441t.getLeft();
        int top = this.f5441t.getTop();
        if (i9 != 0) {
            i7 = this.f5440s.mo6886a(this.f5441t, i7, i9);
            AbstractC1030Z.m4448T(this.f5441t, i7 - left);
        }
        int i11 = i7;
        if (i10 != 0) {
            i8 = this.f5440s.mo6887b(this.f5441t, i8, i10);
            AbstractC1030Z.m4449U(this.f5441t, i8 - top);
        }
        int i12 = i8;
        if (i9 == 0 && i10 == 0) {
            return;
        }
        this.f5440s.mo6896k(this.f5441t, i11, i12, i11 - left, i12 - top);
    }

    /* JADX INFO: renamed from: s */
    private void m6860s(int i7) {
        float[] fArr = this.f5425d;
        if (fArr == null || fArr.length <= i7) {
            int i8 = i7 + 1;
            float[] fArr2 = new float[i8];
            float[] fArr3 = new float[i8];
            float[] fArr4 = new float[i8];
            float[] fArr5 = new float[i8];
            int[] iArr = new int[i8];
            int[] iArr2 = new int[i8];
            int[] iArr3 = new int[i8];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f5426e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f5427f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f5428g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f5429h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f5430i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f5431j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f5425d = fArr2;
            this.f5426e = fArr3;
            this.f5427f = fArr4;
            this.f5428g = fArr5;
            this.f5429h = iArr;
            this.f5430i = iArr2;
            this.f5431j = iArr3;
        }
    }

    /* JADX INFO: renamed from: u */
    private boolean m6861u(int i7, int i8, int i9, int i10) {
        int left = this.f5441t.getLeft();
        int top = this.f5441t.getTop();
        int i11 = i7 - left;
        int i12 = i8 - top;
        if (i11 == 0 && i12 == 0) {
            this.f5439r.abortAnimation();
            m6868K(0);
            return false;
        }
        this.f5439r.startScroll(left, top, i11, i12, m6854l(this.f5441t, i11, i12, i9, i10));
        m6868K(2);
        return true;
    }

    /* JADX INFO: renamed from: y */
    private int m6862y(int i7, int i8) {
        int i9 = i7 < this.f5443v.getLeft() + this.f5436o ? 1 : 0;
        if (i8 < this.f5443v.getTop() + this.f5436o) {
            i9 |= 4;
        }
        if (i7 > this.f5443v.getRight() - this.f5436o) {
            i9 |= 2;
        }
        return i8 > this.f5443v.getBottom() - this.f5436o ? i9 | 8 : i9;
    }

    /* JADX INFO: renamed from: A */
    public int m6863A() {
        return this.f5422a;
    }

    /* JADX INFO: renamed from: B */
    public boolean m6864B(int i7, int i8) {
        return m6866E(this.f5441t, i7, i8);
    }

    /* JADX INFO: renamed from: C */
    public boolean m6865C(int i7) {
        return ((1 << i7) & this.f5432k) != 0;
    }

    /* JADX INFO: renamed from: E */
    public boolean m6866E(View view, int i7, int i8) {
        return view != null && i7 >= view.getLeft() && i7 < view.getRight() && i8 >= view.getTop() && i8 < view.getBottom();
    }

    /* JADX INFO: renamed from: F */
    public void m6867F(MotionEvent motionEvent) {
        int i7;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m6876a();
        }
        if (this.f5433l == null) {
            this.f5433l = VelocityTracker.obtain();
        }
        this.f5433l.addMovement(motionEvent);
        int i8 = 0;
        if (actionMasked == 0) {
            float x7 = motionEvent.getX();
            float y7 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM6881t = m6881t((int) x7, (int) y7);
            m6845I(x7, y7, pointerId);
            m6875R(viewM6881t, pointerId);
            int i9 = this.f5429h[pointerId];
            int i10 = this.f5438q;
            if ((i9 & i10) != 0) {
                this.f5440s.mo6893h(i9 & i10, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f5422a == 1) {
                m6843G();
            }
            m6876a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f5422a == 1) {
                if (m6842D(this.f5424c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f5424c);
                    float x8 = motionEvent.getX(iFindPointerIndex);
                    float y8 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f5427f;
                    int i11 = this.f5424c;
                    int i12 = (int) (x8 - fArr[i11]);
                    int i13 = (int) (y8 - this.f5428g[i11]);
                    m6859r(this.f5441t.getLeft() + i12, this.f5441t.getTop() + i13, i12, i13);
                    m6846J(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i8 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i8);
                if (m6842D(pointerId2)) {
                    float x9 = motionEvent.getX(i8);
                    float y9 = motionEvent.getY(i8);
                    float f7 = x9 - this.f5425d[pointerId2];
                    float f8 = y9 - this.f5426e[pointerId2];
                    m6844H(f7, f8, pointerId2);
                    if (this.f5422a != 1) {
                        View viewM6881t2 = m6881t((int) x9, (int) y9);
                        if (m6848f(viewM6881t2, f7, f8) && m6875R(viewM6881t2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i8++;
            }
            m6846J(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f5422a == 1) {
                m6857p(0.0f, 0.0f);
            }
            m6876a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x10 = motionEvent.getX(actionIndex);
            float y10 = motionEvent.getY(actionIndex);
            m6845I(x10, y10, pointerId3);
            if (this.f5422a != 0) {
                if (m6864B((int) x10, (int) y10)) {
                    m6875R(this.f5441t, pointerId3);
                    return;
                }
                return;
            } else {
                m6875R(m6881t((int) x10, (int) y10), pointerId3);
                int i14 = this.f5429h[pointerId3];
                int i15 = this.f5438q;
                if ((i14 & i15) != 0) {
                    this.f5440s.mo6893h(i14 & i15, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f5422a == 1 && pointerId4 == this.f5424c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i8 >= pointerCount2) {
                    i7 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i8);
                if (pointerId5 != this.f5424c) {
                    View viewM6881t3 = m6881t((int) motionEvent.getX(i8), (int) motionEvent.getY(i8));
                    View view = this.f5441t;
                    if (viewM6881t3 == view && m6875R(view, pointerId5)) {
                        i7 = this.f5424c;
                        break;
                    }
                }
                i8++;
            }
            if (i7 == -1) {
                m6843G();
            }
        }
        m6852j(pointerId4);
    }

    /* JADX INFO: renamed from: K */
    void m6868K(int i7) {
        this.f5443v.removeCallbacks(this.f5444w);
        if (this.f5422a != i7) {
            this.f5422a = i7;
            this.f5440s.mo6895j(i7);
            if (this.f5422a == 0) {
                this.f5441t = null;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m6869L(int i7) {
        this.f5436o = i7;
    }

    /* JADX INFO: renamed from: M */
    public void m6870M(int i7) {
        this.f5438q = i7;
    }

    /* JADX INFO: renamed from: N */
    public void m6871N(float f7) {
        this.f5435n = f7;
    }

    /* JADX INFO: renamed from: O */
    public boolean m6872O(int i7, int i8) {
        if (this.f5442u) {
            return m6861u(i7, i8, (int) this.f5433l.getXVelocity(this.f5424c), (int) this.f5433l.getYVelocity(this.f5424c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0101  */
    /* JADX INFO: renamed from: P */
    public boolean m6873P(MotionEvent motionEvent) {
        View viewM6881t;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m6876a();
        }
        if (this.f5433l == null) {
            this.f5433l = VelocityTracker.obtain();
        }
        this.f5433l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x7 = motionEvent.getX();
            float y7 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m6845I(x7, y7, pointerId);
            View viewM6881t2 = m6881t((int) x7, (int) y7);
            if (viewM6881t2 == this.f5441t && this.f5422a == 2) {
                m6875R(viewM6881t2, pointerId);
            }
            int i7 = this.f5429h[pointerId];
            int i8 = this.f5438q;
            if ((i7 & i8) != 0) {
                this.f5440s.mo6893h(i7 & i8, pointerId);
            }
        } else if (actionMasked == 1) {
            m6876a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                m6876a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x8 = motionEvent.getX(actionIndex);
                float y8 = motionEvent.getY(actionIndex);
                m6845I(x8, y8, pointerId2);
                int i9 = this.f5422a;
                if (i9 == 0) {
                    int i10 = this.f5429h[pointerId2];
                    int i11 = this.f5438q;
                    if ((i10 & i11) != 0) {
                        this.f5440s.mo6893h(i10 & i11, pointerId2);
                    }
                } else if (i9 == 2 && (viewM6881t = m6881t((int) x8, (int) y8)) == this.f5441t) {
                    m6875R(viewM6881t, pointerId2);
                }
            } else if (actionMasked == 6) {
                m6852j(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f5425d != null && this.f5426e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i12 = 0; i12 < pointerCount; i12++) {
                int pointerId3 = motionEvent.getPointerId(i12);
                if (m6842D(pointerId3)) {
                    float x9 = motionEvent.getX(i12);
                    float y9 = motionEvent.getY(i12);
                    float f7 = x9 - this.f5425d[pointerId3];
                    float f8 = y9 - this.f5426e[pointerId3];
                    View viewM6881t3 = m6881t((int) x9, (int) y9);
                    boolean z7 = viewM6881t3 != null && m6848f(viewM6881t3, f7, f8);
                    if (!z7) {
                        m6844H(f7, f8, pointerId3);
                        if (this.f5422a != 1) {
                            break;
                        }
                    } else {
                        int left = viewM6881t3.getLeft();
                        int i13 = (int) f7;
                        int iMo6886a = this.f5440s.mo6886a(viewM6881t3, left + i13, i13);
                        int top = viewM6881t3.getTop();
                        int i14 = (int) f8;
                        int iMo6887b = this.f5440s.mo6887b(viewM6881t3, top + i14, i14);
                        int iMo6889d = this.f5440s.mo6889d(viewM6881t3);
                        int iMo6890e = this.f5440s.mo6890e(viewM6881t3);
                        if ((iMo6889d == 0 || (iMo6889d > 0 && iMo6886a == left)) && (iMo6890e == 0 || (iMo6890e > 0 && iMo6887b == top))) {
                            break;
                        }
                        m6844H(f7, f8, pointerId3);
                        if (this.f5422a != 1 || (z7 && m6875R(viewM6881t3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            m6846J(motionEvent);
        }
        return this.f5422a == 1;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m6874Q(View view, int i7, int i8) {
        this.f5441t = view;
        this.f5424c = -1;
        boolean zM6861u = m6861u(i7, i8, 0, 0);
        if (!zM6861u && this.f5422a == 0 && this.f5441t != null) {
            this.f5441t = null;
        }
        return zM6861u;
    }

    /* JADX INFO: renamed from: R */
    boolean m6875R(View view, int i7) {
        if (view == this.f5441t && this.f5424c == i7) {
            return true;
        }
        if (view == null || !this.f5440s.mo6898m(view, i7)) {
            return false;
        }
        this.f5424c = i7;
        m6877b(view, i7);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m6876a() {
        this.f5424c = -1;
        m6851i();
        VelocityTracker velocityTracker = this.f5433l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5433l = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m6877b(View view, int i7) {
        if (view.getParent() == this.f5443v) {
            this.f5441t = view;
            this.f5424c = i7;
            this.f5440s.mo6894i(view, i7);
            m6868K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f5443v + ")");
    }

    /* JADX INFO: renamed from: d */
    public boolean m6878d(int i7) {
        int length = this.f5425d.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (m6879e(i7, i8)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean m6879e(int i7, int i8) {
        if (!m6865C(i8)) {
            return false;
        }
        boolean z7 = (i7 & 1) == 1;
        boolean z8 = (i7 & 2) == 2;
        float f7 = this.f5427f[i8] - this.f5425d[i8];
        float f8 = this.f5428g[i8] - this.f5426e[i8];
        if (z7 && z8) {
            float f9 = (f7 * f7) + (f8 * f8);
            int i9 = this.f5423b;
            return f9 > ((float) (i9 * i9));
        }
        if (z7) {
            return Math.abs(f7) > ((float) this.f5423b);
        }
        return z8 && Math.abs(f8) > ((float) this.f5423b);
    }

    /* JADX INFO: renamed from: m */
    public boolean m6880m(boolean z7) {
        if (this.f5422a == 2) {
            boolean zComputeScrollOffset = this.f5439r.computeScrollOffset();
            int currX = this.f5439r.getCurrX();
            int currY = this.f5439r.getCurrY();
            int left = currX - this.f5441t.getLeft();
            int top = currY - this.f5441t.getTop();
            if (left != 0) {
                AbstractC1030Z.m4448T(this.f5441t, left);
            }
            if (top != 0) {
                AbstractC1030Z.m4449U(this.f5441t, top);
            }
            if (left != 0 || top != 0) {
                this.f5440s.mo6896k(this.f5441t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f5439r.getFinalX() && currY == this.f5439r.getFinalY()) {
                this.f5439r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z7) {
                    this.f5443v.post(this.f5444w);
                } else {
                    m6868K(0);
                }
            }
        }
        return this.f5422a == 2;
    }

    /* JADX INFO: renamed from: t */
    public View m6881t(int i7, int i8) {
        for (int childCount = this.f5443v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f5443v.getChildAt(this.f5440s.m6888c(childCount));
            if (i7 >= childAt.getLeft() && i7 < childAt.getRight() && i8 >= childAt.getTop() && i8 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public View m6882v() {
        return this.f5441t;
    }

    /* JADX INFO: renamed from: w */
    public int m6883w() {
        return this.f5437p;
    }

    /* JADX INFO: renamed from: x */
    public int m6884x() {
        return this.f5436o;
    }

    /* JADX INFO: renamed from: z */
    public int m6885z() {
        return this.f5423b;
    }
}
