package p385x;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p361u.C7145c;
import p361u.C7151i;
import p393y.AbstractC7438i;
import p393y.C7444o;

/* JADX INFO: renamed from: x.d */
/* JADX INFO: loaded from: classes.dex */
public class C7369d {

    /* JADX INFO: renamed from: b */
    private int f29369b;

    /* JADX INFO: renamed from: c */
    private boolean f29370c;

    /* JADX INFO: renamed from: d */
    public final C7370e f29371d;

    /* JADX INFO: renamed from: e */
    public final a f29372e;

    /* JADX INFO: renamed from: f */
    public C7369d f29373f;

    /* JADX INFO: renamed from: i */
    C7151i f29376i;

    /* JADX INFO: renamed from: a */
    private HashSet f29368a = null;

    /* JADX INFO: renamed from: g */
    public int f29374g = 0;

    /* JADX INFO: renamed from: h */
    int f29375h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: x.d$a */
    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C7369d(C7370e c7370e, a aVar) {
        this.f29371d = c7370e;
        this.f29372e = aVar;
    }

    /* JADX INFO: renamed from: a */
    public boolean m32436a(C7369d c7369d, int i7) {
        return m32437b(c7369d, i7, Integer.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: b */
    public boolean m32437b(C7369d c7369d, int i7, int i8, boolean z7) {
        if (c7369d == null) {
            m32452q();
            return true;
        }
        if (!z7 && !m32451p(c7369d)) {
            return false;
        }
        this.f29373f = c7369d;
        if (c7369d.f29368a == null) {
            c7369d.f29368a = new HashSet();
        }
        HashSet hashSet = this.f29373f.f29368a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f29374g = i7;
        this.f29375h = i8;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m32438c(int i7, ArrayList arrayList, C7444o c7444o) {
        HashSet hashSet = this.f29368a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC7438i.m32947a(((C7369d) it.next()).f29371d, i7, arrayList, c7444o);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public HashSet m32439d() {
        return this.f29368a;
    }

    /* JADX INFO: renamed from: e */
    public int m32440e() {
        if (this.f29370c) {
            return this.f29369b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public int m32441f() {
        C7369d c7369d;
        if (this.f29371d.m32506V() == 8) {
            return 0;
        }
        return (this.f29375h == Integer.MIN_VALUE || (c7369d = this.f29373f) == null || c7369d.f29371d.m32506V() != 8) ? this.f29374g : this.f29375h;
    }

    /* JADX INFO: renamed from: g */
    public final C7369d m32442g() {
        switch (this.f29372e) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.f29371d.f29414Q;
            case TOP:
                return this.f29371d.f29415R;
            case RIGHT:
                return this.f29371d.f29412O;
            case BOTTOM:
                return this.f29371d.f29413P;
            default:
                throw new AssertionError(this.f29372e.name());
        }
    }

    /* JADX INFO: renamed from: h */
    public C7370e m32443h() {
        return this.f29371d;
    }

    /* JADX INFO: renamed from: i */
    public C7151i m32444i() {
        return this.f29376i;
    }

    /* JADX INFO: renamed from: j */
    public C7369d m32445j() {
        return this.f29373f;
    }

    /* JADX INFO: renamed from: k */
    public a m32446k() {
        return this.f29372e;
    }

    /* JADX INFO: renamed from: l */
    public boolean m32447l() {
        HashSet hashSet = this.f29368a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C7369d) it.next()).m32442g().m32450o()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public boolean m32448m() {
        HashSet hashSet = this.f29368a;
        return hashSet != null && hashSet.size() > 0;
    }

    /* JADX INFO: renamed from: n */
    public boolean m32449n() {
        return this.f29370c;
    }

    /* JADX INFO: renamed from: o */
    public boolean m32450o() {
        return this.f29373f != null;
    }

    /* JADX INFO: renamed from: p */
    public boolean m32451p(C7369d c7369d) {
        if (c7369d == null) {
            return false;
        }
        a aVarM32446k = c7369d.m32446k();
        a aVar = this.f29372e;
        if (aVarM32446k == aVar) {
            return aVar != a.BASELINE || (c7369d.m32443h().m32514Z() && m32443h().m32514Z());
        }
        switch (aVar) {
            case NONE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z7 = aVarM32446k == a.LEFT || aVarM32446k == a.RIGHT;
                if (c7369d.m32443h() instanceof C7373h) {
                    return z7 || aVarM32446k == a.CENTER_X;
                }
                return z7;
            case TOP:
            case BOTTOM:
                boolean z8 = aVarM32446k == a.TOP || aVarM32446k == a.BOTTOM;
                if (c7369d.m32443h() instanceof C7373h) {
                    return z8 || aVarM32446k == a.CENTER_Y;
                }
                return z8;
            case BASELINE:
                return (aVarM32446k == a.LEFT || aVarM32446k == a.RIGHT) ? false : true;
            case CENTER:
                return (aVarM32446k == a.BASELINE || aVarM32446k == a.CENTER_X || aVarM32446k == a.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.f29372e.name());
        }
    }

    /* JADX INFO: renamed from: q */
    public void m32452q() {
        HashSet hashSet;
        C7369d c7369d = this.f29373f;
        if (c7369d != null && (hashSet = c7369d.f29368a) != null) {
            hashSet.remove(this);
            if (this.f29373f.f29368a.size() == 0) {
                this.f29373f.f29368a = null;
            }
        }
        this.f29368a = null;
        this.f29373f = null;
        this.f29374g = 0;
        this.f29375h = Integer.MIN_VALUE;
        this.f29370c = false;
        this.f29369b = 0;
    }

    /* JADX INFO: renamed from: r */
    public void m32453r() {
        this.f29370c = false;
        this.f29369b = 0;
    }

    /* JADX INFO: renamed from: s */
    public void m32454s(C7145c c7145c) {
        C7151i c7151i = this.f29376i;
        if (c7151i == null) {
            this.f29376i = new C7151i(C7151i.a.UNRESTRICTED, null);
        } else {
            c7151i.m31609k();
        }
    }

    /* JADX INFO: renamed from: t */
    public void m32455t(int i7) {
        this.f29369b = i7;
        this.f29370c = true;
    }

    public String toString() {
        return this.f29371d.m32562t() + ":" + this.f29372e.toString();
    }

    /* JADX INFO: renamed from: u */
    public void m32456u(int i7) {
        if (m32450o()) {
            this.f29375h = i7;
        }
    }
}
