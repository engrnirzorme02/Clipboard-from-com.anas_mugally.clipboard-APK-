package p153U;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.C2401l;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.internal.ads.zzbbn;
import java.util.ArrayList;
import java.util.List;
import p111O.AbstractC1030Z;
import p111O.C1032a;
import p118P.AbstractC1153b;
import p118P.AbstractC1172u;
import p118P.C1170s;
import p118P.C1171t;

/* JADX INFO: renamed from: U.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1648a extends C1032a {

    /* JADX INFO: renamed from: n */
    private static final Rect f5403n = new Rect(C3553a.e.API_PRIORITY_OTHER, C3553a.e.API_PRIORITY_OTHER, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o */
    private static final AbstractC1649b.a f5404o = new a();

    /* JADX INFO: renamed from: p */
    private static final AbstractC1649b.b f5405p = new b();

    /* JADX INFO: renamed from: h */
    private final AccessibilityManager f5410h;

    /* JADX INFO: renamed from: i */
    private final View f5411i;

    /* JADX INFO: renamed from: j */
    private c f5412j;

    /* JADX INFO: renamed from: d */
    private final Rect f5406d = new Rect();

    /* JADX INFO: renamed from: e */
    private final Rect f5407e = new Rect();

    /* JADX INFO: renamed from: f */
    private final Rect f5408f = new Rect();

    /* JADX INFO: renamed from: g */
    private final int[] f5409g = new int[2];

    /* JADX INFO: renamed from: k */
    int f5413k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l */
    int f5414l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m */
    private int f5415m = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: U.a$a */
    class a implements AbstractC1649b.a {
        a() {
        }

        @Override // p153U.AbstractC1649b.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6821a(C1170s c1170s, Rect rect) {
            c1170s.m5064k(rect);
        }
    }

    /* JADX INFO: renamed from: U.a$b */
    class b implements AbstractC1649b.b {
        b() {
        }

        @Override // p153U.AbstractC1649b.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C1170s mo6823a(C2401l c2401l, int i7) {
            return (C1170s) c2401l.m10310i(i7);
        }

        @Override // p153U.AbstractC1649b.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int mo6824b(C2401l c2401l) {
            return c2401l.m10309h();
        }
    }

    /* JADX INFO: renamed from: U.a$c */
    private class c extends C1171t {
        c() {
        }

        @Override // p118P.C1171t
        /* JADX INFO: renamed from: b */
        public C1170s mo5115b(int i7) {
            return C1170s.m5000b0(AbstractC1648a.this.m6806J(i7));
        }

        @Override // p118P.C1171t
        /* JADX INFO: renamed from: d */
        public C1170s mo5117d(int i7) {
            int i8 = i7 == 2 ? AbstractC1648a.this.f5413k : AbstractC1648a.this.f5414l;
            if (i8 == Integer.MIN_VALUE) {
                return null;
            }
            return mo5115b(i8);
        }

        @Override // p118P.C1171t
        /* JADX INFO: renamed from: f */
        public boolean mo5119f(int i7, int i8, Bundle bundle) {
            return AbstractC1648a.this.m6814R(i7, i8, bundle);
        }
    }

    public AbstractC1648a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f5411i = view;
        this.f5410h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (AbstractC1030Z.m4501x(view) == 0) {
            AbstractC1030Z.m4488q0(view, 1);
        }
    }

    /* JADX INFO: renamed from: D */
    private static Rect m6784D(View view, int i7, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i7 == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i7 == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i7 == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i7 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        rect.set(0, -1, width, -1);
        return rect;
    }

    /* JADX INFO: renamed from: G */
    private boolean m6785G(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f5411i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f5411i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    /* JADX INFO: renamed from: H */
    private static int m6786H(int i7) {
        if (i7 == 19) {
            return 33;
        }
        if (i7 != 21) {
            return i7 != 22 ? 130 : 66;
        }
        return 17;
    }

    /* JADX INFO: renamed from: I */
    private boolean m6787I(int i7, Rect rect) {
        C1170s c1170s;
        C2401l c2401lM6799y = m6799y();
        int i8 = this.f5414l;
        C1170s c1170s2 = i8 == Integer.MIN_VALUE ? null : (C1170s) c2401lM6799y.m10305d(i8);
        if (i7 == 1 || i7 == 2) {
            c1170s = (C1170s) AbstractC1649b.m6830d(c2401lM6799y, f5405p, f5404o, c1170s2, i7, AbstractC1030Z.m4505z(this.f5411i) == 1, false);
        } else {
            if (i7 != 17 && i7 != 33 && i7 != 66 && i7 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i9 = this.f5414l;
            if (i9 != Integer.MIN_VALUE) {
                m6800z(i9, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m6784D(this.f5411i, i7, rect2);
            }
            c1170s = (C1170s) AbstractC1649b.m6829c(c2401lM6799y, f5405p, f5404o, c1170s2, rect2, i7);
        }
        return m6815V(c1170s != null ? c2401lM6799y.m10307f(c2401lM6799y.m10306e(c1170s)) : Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: S */
    private boolean m6788S(int i7, int i8, Bundle bundle) {
        if (i8 == 1) {
            return m6815V(i7);
        }
        if (i8 == 2) {
            return m6817o(i7);
        }
        if (i8 != 64) {
            return i8 != 128 ? mo6808L(i7, i8, bundle) : m6792n(i7);
        }
        return m6790U(i7);
    }

    /* JADX INFO: renamed from: T */
    private boolean m6789T(int i7, Bundle bundle) {
        return AbstractC1030Z.m4453Y(this.f5411i, i7, bundle);
    }

    /* JADX INFO: renamed from: U */
    private boolean m6790U(int i7) {
        int i8;
        if (!this.f5410h.isEnabled() || !this.f5410h.isTouchExplorationEnabled() || (i8 = this.f5413k) == i7) {
            return false;
        }
        if (i8 != Integer.MIN_VALUE) {
            m6792n(i8);
        }
        this.f5413k = i7;
        this.f5411i.invalidate();
        m6816W(i7, 32768);
        return true;
    }

    /* JADX INFO: renamed from: X */
    private void m6791X(int i7) {
        int i8 = this.f5415m;
        if (i8 == i7) {
            return;
        }
        this.f5415m = i7;
        m6816W(i7, 128);
        m6816W(i8, 256);
    }

    /* JADX INFO: renamed from: n */
    private boolean m6792n(int i7) {
        if (this.f5413k != i7) {
            return false;
        }
        this.f5413k = Integer.MIN_VALUE;
        this.f5411i.invalidate();
        m6816W(i7, 65536);
        return true;
    }

    /* JADX INFO: renamed from: p */
    private boolean m6793p() {
        int i7 = this.f5414l;
        return i7 != Integer.MIN_VALUE && mo6808L(i7, 16, null);
    }

    /* JADX INFO: renamed from: q */
    private AccessibilityEvent m6794q(int i7, int i8) {
        return i7 != -1 ? m6795r(i7, i8) : m6796s(i8);
    }

    /* JADX INFO: renamed from: r */
    private AccessibilityEvent m6795r(int i7, int i8) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i8);
        C1170s c1170sM6806J = m6806J(i7);
        accessibilityEventObtain.getText().add(c1170sM6806J.m5013C());
        accessibilityEventObtain.setContentDescription(c1170sM6806J.m5080t());
        accessibilityEventObtain.setScrollable(c1170sM6806J.m5046V());
        accessibilityEventObtain.setPassword(c1170sM6806J.m5045U());
        accessibilityEventObtain.setEnabled(c1170sM6806J.m5034N());
        accessibilityEventObtain.setChecked(c1170sM6806J.m5028K());
        m6810N(i7, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(c1170sM6806J.m5075q());
        AbstractC1172u.m5122c(accessibilityEventObtain, this.f5411i, i7);
        accessibilityEventObtain.setPackageName(this.f5411i.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    /* JADX INFO: renamed from: s */
    private AccessibilityEvent m6796s(int i7) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i7);
        this.f5411i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    /* JADX INFO: renamed from: t */
    private C1170s m6797t(int i7) {
        C1170s c1170sM4999a0 = C1170s.m4999a0();
        c1170sM4999a0.m5079s0(true);
        c1170sM4999a0.m5083u0(true);
        c1170sM4999a0.m5069m0("android.view.View");
        Rect rect = f5403n;
        c1170sM4999a0.m5062i0(rect);
        c1170sM4999a0.m5063j0(rect);
        c1170sM4999a0.m5014C0(this.f5411i);
        mo6812P(i7, c1170sM4999a0);
        if (c1170sM4999a0.m5013C() == null && c1170sM4999a0.m5080t() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        c1170sM4999a0.m5064k(this.f5407e);
        if (this.f5407e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iM5061i = c1170sM4999a0.m5061i();
        if ((iM5061i & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iM5061i & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        c1170sM4999a0.m5010A0(this.f5411i.getContext().getPackageName());
        c1170sM4999a0.m5031L0(this.f5411i, i7);
        if (this.f5413k == i7) {
            c1170sM4999a0.m5060g0(true);
            c1170sM4999a0.m5051a(128);
        } else {
            c1170sM4999a0.m5060g0(false);
            c1170sM4999a0.m5051a(64);
        }
        boolean z7 = this.f5414l == i7;
        if (z7) {
            c1170sM4999a0.m5051a(2);
        } else if (c1170sM4999a0.m5038P()) {
            c1170sM4999a0.m5051a(1);
        }
        c1170sM4999a0.m5085v0(z7);
        this.f5411i.getLocationOnScreen(this.f5409g);
        c1170sM4999a0.m5066l(this.f5406d);
        if (this.f5406d.equals(rect)) {
            c1170sM4999a0.m5064k(this.f5406d);
            if (c1170sM4999a0.f4085b != -1) {
                C1170s c1170sM4999a1 = C1170s.m4999a0();
                for (int i8 = c1170sM4999a0.f4085b; i8 != -1; i8 = c1170sM4999a1.f4085b) {
                    c1170sM4999a1.m5016D0(this.f5411i, -1);
                    c1170sM4999a1.m5062i0(f5403n);
                    mo6812P(i8, c1170sM4999a1);
                    c1170sM4999a1.m5064k(this.f5407e);
                    Rect rect2 = this.f5406d;
                    Rect rect3 = this.f5407e;
                    rect2.offset(rect3.left, rect3.top);
                }
                c1170sM4999a1.m5057e0();
            }
            this.f5406d.offset(this.f5409g[0] - this.f5411i.getScrollX(), this.f5409g[1] - this.f5411i.getScrollY());
        }
        if (this.f5411i.getLocalVisibleRect(this.f5408f)) {
            this.f5408f.offset(this.f5409g[0] - this.f5411i.getScrollX(), this.f5409g[1] - this.f5411i.getScrollY());
            if (this.f5406d.intersect(this.f5408f)) {
                c1170sM4999a0.m5063j0(this.f5406d);
                if (m6785G(this.f5406d)) {
                    c1170sM4999a0.m5039P0(true);
                }
            }
        }
        return c1170sM4999a0;
    }

    /* JADX INFO: renamed from: u */
    private C1170s m6798u() {
        C1170s c1170sM5001c0 = C1170s.m5001c0(this.f5411i);
        AbstractC1030Z.m4451W(this.f5411i, c1170sM5001c0);
        ArrayList arrayList = new ArrayList();
        mo6803C(arrayList);
        if (c1170sM5001c0.m5073p() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            c1170sM5001c0.m5054d(this.f5411i, ((Integer) arrayList.get(i7)).intValue());
        }
        return c1170sM5001c0;
    }

    /* JADX INFO: renamed from: y */
    private C2401l m6799y() {
        ArrayList arrayList = new ArrayList();
        mo6803C(arrayList);
        C2401l c2401l = new C2401l();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            c2401l.m10308g(((Integer) arrayList.get(i7)).intValue(), m6797t(((Integer) arrayList.get(i7)).intValue()));
        }
        return c2401l;
    }

    /* JADX INFO: renamed from: z */
    private void m6800z(int i7, Rect rect) {
        m6806J(i7).m5064k(rect);
    }

    /* JADX INFO: renamed from: A */
    public final int m6801A() {
        return this.f5414l;
    }

    /* JADX INFO: renamed from: B */
    protected abstract int mo6802B(float f7, float f8);

    /* JADX INFO: renamed from: C */
    protected abstract void mo6803C(List list);

    /* JADX INFO: renamed from: E */
    public final void m6804E(int i7) {
        m6805F(i7, 0);
    }

    /* JADX INFO: renamed from: F */
    public final void m6805F(int i7, int i8) {
        ViewParent parent;
        if (i7 == Integer.MIN_VALUE || !this.f5410h.isEnabled() || (parent = this.f5411i.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventM6794q = m6794q(i7, 2048);
        AbstractC1153b.m4980b(accessibilityEventM6794q, i8);
        parent.requestSendAccessibilityEvent(this.f5411i, accessibilityEventM6794q);
    }

    /* JADX INFO: renamed from: J */
    C1170s m6806J(int i7) {
        return i7 == -1 ? m6798u() : m6797t(i7);
    }

    /* JADX INFO: renamed from: K */
    public final void m6807K(boolean z7, int i7, Rect rect) {
        int i8 = this.f5414l;
        if (i8 != Integer.MIN_VALUE) {
            m6817o(i8);
        }
        if (z7) {
            m6787I(i7, rect);
        }
    }

    /* JADX INFO: renamed from: L */
    protected abstract boolean mo6808L(int i7, int i8, Bundle bundle);

    /* JADX INFO: renamed from: M */
    protected void m6809M(AccessibilityEvent accessibilityEvent) {
    }

    /* JADX INFO: renamed from: N */
    protected void m6810N(int i7, AccessibilityEvent accessibilityEvent) {
    }

    /* JADX INFO: renamed from: O */
    protected void mo6811O(C1170s c1170s) {
    }

    /* JADX INFO: renamed from: P */
    protected abstract void mo6812P(int i7, C1170s c1170s);

    /* JADX INFO: renamed from: Q */
    protected void mo6813Q(int i7, boolean z7) {
    }

    /* JADX INFO: renamed from: R */
    boolean m6814R(int i7, int i8, Bundle bundle) {
        return i7 != -1 ? m6788S(i7, i8, bundle) : m6789T(i8, bundle);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m6815V(int i7) {
        int i8;
        if ((!this.f5411i.isFocused() && !this.f5411i.requestFocus()) || (i8 = this.f5414l) == i7) {
            return false;
        }
        if (i8 != Integer.MIN_VALUE) {
            m6817o(i8);
        }
        if (i7 == Integer.MIN_VALUE) {
            return false;
        }
        this.f5414l = i7;
        mo6813Q(i7, true);
        m6816W(i7, 8);
        return true;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m6816W(int i7, int i8) {
        ViewParent parent;
        if (i7 == Integer.MIN_VALUE || !this.f5410h.isEnabled() || (parent = this.f5411i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f5411i, m6794q(i7, i8));
    }

    @Override // p111O.C1032a
    /* JADX INFO: renamed from: b */
    public C1171t mo4582b(View view) {
        if (this.f5412j == null) {
            this.f5412j = new c();
        }
        return this.f5412j;
    }

    @Override // p111O.C1032a
    /* JADX INFO: renamed from: f */
    public void mo4584f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo4584f(view, accessibilityEvent);
        m6809M(accessibilityEvent);
    }

    @Override // p111O.C1032a
    /* JADX INFO: renamed from: g */
    public void mo4585g(View view, C1170s c1170s) {
        super.mo4585g(view, c1170s);
        mo6811O(c1170s);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m6817o(int i7) {
        if (this.f5414l != i7) {
            return false;
        }
        this.f5414l = Integer.MIN_VALUE;
        mo6813Q(i7, false);
        m6816W(i7, 8);
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m6818v(MotionEvent motionEvent) {
        if (this.f5410h.isEnabled() && this.f5410h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.f5415m == Integer.MIN_VALUE) {
                    return false;
                }
                m6791X(Integer.MIN_VALUE);
                return true;
            }
            int iMo6802B = mo6802B(motionEvent.getX(), motionEvent.getY());
            m6791X(iMo6802B);
            if (iMo6802B != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    /* JADX INFO: renamed from: w */
    public final boolean m6819w(KeyEvent keyEvent) {
        int i7 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case zzbbn.zzt.zzm /* 21 */:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int iM6786H = m6786H(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z7 = false;
                                while (i7 < repeatCount && m6787I(iM6786H, null)) {
                                    i7++;
                                    z7 = true;
                                }
                                return z7;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                m6793p();
                                return true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    m6793p();
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return m6787I(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return m6787I(1, null);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final int m6820x() {
        return this.f5413k;
    }
}
