package p111O;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: O.C */
/* JADX INFO: loaded from: classes.dex */
public class C0985C {

    /* JADX INFO: renamed from: a */
    private ViewParent f3779a;

    /* JADX INFO: renamed from: b */
    private ViewParent f3780b;

    /* JADX INFO: renamed from: c */
    private final View f3781c;

    /* JADX INFO: renamed from: d */
    private boolean f3782d;

    /* JADX INFO: renamed from: e */
    private int[] f3783e;

    public C0985C(View view) {
        this.f3781c = view;
    }

    /* JADX INFO: renamed from: g */
    private boolean m4336g(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        ViewParent viewParentM4337h;
        int i12;
        int i13;
        int[] iArr3;
        if (!m4348l() || (viewParentM4337h = m4337h(i11)) == null) {
            return false;
        }
        if (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f3781c.getLocationInWindow(iArr);
            i12 = iArr[0];
            i13 = iArr[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr2 == null) {
            int[] iArrM4338i = m4338i();
            iArrM4338i[0] = 0;
            iArrM4338i[1] = 0;
            iArr3 = iArrM4338i;
        } else {
            iArr3 = iArr2;
        }
        AbstractC1049g0.m4669d(viewParentM4337h, this.f3781c, i7, i8, i9, i10, i11, iArr3);
        if (iArr != null) {
            this.f3781c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i12;
            iArr[1] = iArr[1] - i13;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    private ViewParent m4337h(int i7) {
        if (i7 == 0) {
            return this.f3779a;
        }
        if (i7 != 1) {
            return null;
        }
        return this.f3780b;
    }

    /* JADX INFO: renamed from: i */
    private int[] m4338i() {
        if (this.f3783e == null) {
            this.f3783e = new int[2];
        }
        return this.f3783e;
    }

    /* JADX INFO: renamed from: n */
    private void m4339n(int i7, ViewParent viewParent) {
        if (i7 == 0) {
            this.f3779a = viewParent;
        } else {
            if (i7 != 1) {
                return;
            }
            this.f3780b = viewParent;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m4340a(float f7, float f8, boolean z7) {
        ViewParent viewParentM4337h;
        if (!m4348l() || (viewParentM4337h = m4337h(0)) == null) {
            return false;
        }
        return AbstractC1049g0.m4666a(viewParentM4337h, this.f3781c, f7, f8, z7);
    }

    /* JADX INFO: renamed from: b */
    public boolean m4341b(float f7, float f8) {
        ViewParent viewParentM4337h;
        if (!m4348l() || (viewParentM4337h = m4337h(0)) == null) {
            return false;
        }
        return AbstractC1049g0.m4667b(viewParentM4337h, this.f3781c, f7, f8);
    }

    /* JADX INFO: renamed from: c */
    public boolean m4342c(int i7, int i8, int[] iArr, int[] iArr2) {
        return m4343d(i7, i8, iArr, iArr2, 0);
    }

    /* JADX INFO: renamed from: d */
    public boolean m4343d(int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        ViewParent viewParentM4337h;
        int i10;
        int i11;
        if (!m4348l() || (viewParentM4337h = m4337h(i9)) == null) {
            return false;
        }
        if (i7 == 0 && i8 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f3781c.getLocationInWindow(iArr2);
            i10 = iArr2[0];
            i11 = iArr2[1];
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (iArr == null) {
            iArr = m4338i();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        AbstractC1049g0.m4668c(viewParentM4337h, this.f3781c, i7, i8, iArr3, i9);
        if (iArr2 != null) {
            this.f3781c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i10;
            iArr2[1] = iArr2[1] - i11;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public void m4344e(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        m4336g(i7, i8, i9, i10, iArr, i11, iArr2);
    }

    /* JADX INFO: renamed from: f */
    public boolean m4345f(int i7, int i8, int i9, int i10, int[] iArr) {
        return m4336g(i7, i8, i9, i10, iArr, 0, null);
    }

    /* JADX INFO: renamed from: j */
    public boolean m4346j() {
        return m4347k(0);
    }

    /* JADX INFO: renamed from: k */
    public boolean m4347k(int i7) {
        return m4337h(i7) != null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m4348l() {
        return this.f3782d;
    }

    /* JADX INFO: renamed from: m */
    public void m4349m(boolean z7) {
        if (this.f3782d) {
            AbstractC1030Z.m4432D0(this.f3781c);
        }
        this.f3782d = z7;
    }

    /* JADX INFO: renamed from: o */
    public boolean m4350o(int i7) {
        return m4351p(i7, 0);
    }

    /* JADX INFO: renamed from: p */
    public boolean m4351p(int i7, int i8) {
        if (m4347k(i8)) {
            return true;
        }
        if (!m4348l()) {
            return false;
        }
        View view = this.f3781c;
        for (ViewParent parent = this.f3781c.getParent(); parent != null; parent = parent.getParent()) {
            if (AbstractC1049g0.m4671f(parent, view, this.f3781c, i7, i8)) {
                m4339n(i8, parent);
                AbstractC1049g0.m4670e(parent, view, this.f3781c, i7, i8);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public void m4352q() {
        m4353r(0);
    }

    /* JADX INFO: renamed from: r */
    public void m4353r(int i7) {
        ViewParent viewParentM4337h = m4337h(i7);
        if (viewParentM4337h != null) {
            AbstractC1049g0.m4672g(viewParentM4337h, this.f3781c, i7);
            m4339n(i7, null);
        }
    }
}
