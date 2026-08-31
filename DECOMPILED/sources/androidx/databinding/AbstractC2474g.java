package androidx.databinding;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC2650l;
import androidx.lifecycle.InterfaceC2657s;
import java.lang.ref.ReferenceQueue;
import p160V.AbstractC1710a;

/* JADX INFO: renamed from: androidx.databinding.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2474g extends AbstractC2468a {

    /* JADX INFO: renamed from: m */
    private static final int f9400m = 8;

    /* JADX INFO: renamed from: a */
    private final Runnable f9409a;

    /* JADX INFO: renamed from: b */
    private boolean f9410b;

    /* JADX INFO: renamed from: c */
    private boolean f9411c;

    /* JADX INFO: renamed from: d */
    private AbstractC2475h[] f9412d;

    /* JADX INFO: renamed from: e */
    private final View f9413e;

    /* JADX INFO: renamed from: f */
    private boolean f9414f;

    /* JADX INFO: renamed from: g */
    private Choreographer f9415g;

    /* JADX INFO: renamed from: h */
    private final Choreographer.FrameCallback f9416h;

    /* JADX INFO: renamed from: i */
    private Handler f9417i;

    /* JADX INFO: renamed from: j */
    private AbstractC2474g f9418j;

    /* JADX INFO: renamed from: k */
    private InterfaceC2657s f9419k;

    /* JADX INFO: renamed from: l */
    static int f9399l = Build.VERSION.SDK_INT;

    /* JADX INFO: renamed from: n */
    private static final boolean f9401n = true;

    /* JADX INFO: renamed from: o */
    private static final InterfaceC2470c f9402o = new a();

    /* JADX INFO: renamed from: p */
    private static final InterfaceC2470c f9403p = new b();

    /* JADX INFO: renamed from: q */
    private static final InterfaceC2470c f9404q = new c();

    /* JADX INFO: renamed from: r */
    private static final InterfaceC2470c f9405r = new d();

    /* JADX INFO: renamed from: s */
    private static final AbstractC2469b f9406s = new e();

    /* JADX INFO: renamed from: t */
    private static final ReferenceQueue f9407t = new ReferenceQueue();

    /* JADX INFO: renamed from: u */
    private static final View.OnAttachStateChangeListener f9408u = new f();

    /* JADX INFO: renamed from: androidx.databinding.g$a */
    class a implements InterfaceC2470c {
        a() {
        }
    }

    /* JADX INFO: renamed from: androidx.databinding.g$b */
    class b implements InterfaceC2470c {
        b() {
        }
    }

    /* JADX INFO: renamed from: androidx.databinding.g$c */
    class c implements InterfaceC2470c {
        c() {
        }
    }

    /* JADX INFO: renamed from: androidx.databinding.g$d */
    class d implements InterfaceC2470c {
        d() {
        }
    }

    /* JADX INFO: renamed from: androidx.databinding.g$e */
    class e extends AbstractC2469b {
        e() {
        }
    }

    /* JADX INFO: renamed from: androidx.databinding.g$f */
    class f implements View.OnAttachStateChangeListener {
        f() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AbstractC2474g.m10840j(view).f9409a.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: androidx.databinding.g$g */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                AbstractC2474g.this.f9410b = false;
            }
            AbstractC2474g.m10846r();
            if (AbstractC2474g.this.f9413e.isAttachedToWindow()) {
                AbstractC2474g.this.m10848i();
            } else {
                AbstractC2474g.this.f9413e.removeOnAttachStateChangeListener(AbstractC2474g.f9408u);
                AbstractC2474g.this.f9413e.addOnAttachStateChangeListener(AbstractC2474g.f9408u);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.databinding.g$h */
    class h implements Choreographer.FrameCallback {
        h() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j7) {
            AbstractC2474g.this.f9409a.run();
        }
    }

    /* JADX INFO: renamed from: androidx.databinding.g$i */
    protected static class i {
    }

    protected AbstractC2474g(InterfaceC2472e interfaceC2472e, View view, int i7) {
        this.f9409a = new g();
        this.f9410b = false;
        this.f9411c = false;
        this.f9412d = new AbstractC2475h[i7];
        this.f9413e = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (f9401n) {
            this.f9415g = Choreographer.getInstance();
            this.f9416h = new h();
        } else {
            this.f9416h = null;
            this.f9417i = new Handler(Looper.myLooper());
        }
    }

    /* JADX INFO: renamed from: f */
    private static InterfaceC2472e m10838f(Object obj) {
        if (obj == null) {
            return null;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    /* JADX INFO: renamed from: h */
    private void m10839h() {
        if (this.f9414f) {
            m10851s();
        } else if (mo10850l()) {
            this.f9414f = true;
            this.f9411c = false;
            mo10847g();
            this.f9414f = false;
        }
    }

    /* JADX INFO: renamed from: j */
    static AbstractC2474g m10840j(View view) {
        if (view != null) {
            return (AbstractC2474g) view.getTag(AbstractC1710a.f5705a);
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    protected static AbstractC2474g m10841m(LayoutInflater layoutInflater, int i7, ViewGroup viewGroup, boolean z7, Object obj) {
        m10838f(obj);
        return AbstractC2473f.m10830i(layoutInflater, i7, viewGroup, z7, null);
    }

    /* JADX INFO: renamed from: n */
    private static boolean m10842n(String str, int i7) {
        int length = str.length();
        if (length == i7) {
            return false;
        }
        while (i7 < length) {
            if (!Character.isDigit(str.charAt(i7))) {
                return false;
            }
            i7++;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX INFO: renamed from: o */
    private static void m10843o(InterfaceC2472e interfaceC2472e, View view, Object[] objArr, i iVar, SparseIntArray sparseIntArray, boolean z7) {
        int id;
        int i7;
        if (m10840j(view) != null) {
            return;
        }
        Object tag = view.getTag();
        String str = tag instanceof String ? (String) tag : null;
        int i8 = 0;
        boolean z8 = true;
        if (z7 && str != null && str.startsWith("layout")) {
            int iLastIndexOf = str.lastIndexOf(95);
            if (iLastIndexOf > 0) {
                int i9 = iLastIndexOf + 1;
                if (m10842n(str, i9)) {
                    int iM10845q = m10845q(str, i9);
                    if (objArr[iM10845q] == null) {
                        objArr[iM10845q] = view;
                    }
                } else {
                    z8 = false;
                }
            } else {
                z8 = false;
            }
        } else if (str == null || !str.startsWith("binding_")) {
            z8 = false;
        } else {
            int iM10845q2 = m10845q(str, f9400m);
            if (objArr[iM10845q2] == null) {
                objArr[iM10845q2] = view;
            }
        }
        if (!z8 && (id = view.getId()) > 0 && sparseIntArray != null && (i7 = sparseIntArray.get(id, -1)) >= 0 && objArr[i7] == null) {
            objArr[i7] = view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (i8 < childCount) {
                InterfaceC2472e interfaceC2472e2 = interfaceC2472e;
                Object[] objArr2 = objArr;
                i iVar2 = iVar;
                SparseIntArray sparseIntArray2 = sparseIntArray;
                m10843o(interfaceC2472e2, viewGroup.getChildAt(i8), objArr2, iVar2, sparseIntArray2, false);
                i8++;
                interfaceC2472e = interfaceC2472e2;
                objArr = objArr2;
                iVar = iVar2;
                sparseIntArray = sparseIntArray2;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    protected static Object[] m10844p(InterfaceC2472e interfaceC2472e, View view, int i7, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i7];
        m10843o(interfaceC2472e, view, objArr, iVar, sparseIntArray, true);
        return objArr;
    }

    /* JADX INFO: renamed from: q */
    private static int m10845q(String str, int i7) {
        int length = str.length();
        int iCharAt = 0;
        while (i7 < length) {
            iCharAt = (iCharAt * 10) + (str.charAt(i7) - '0');
            i7++;
        }
        return iCharAt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static void m10846r() {
        while (f9407t.poll() != null) {
        }
    }

    /* JADX INFO: renamed from: g */
    protected abstract void mo10847g();

    /* JADX INFO: renamed from: i */
    public void m10848i() {
        AbstractC2474g abstractC2474g = this.f9418j;
        if (abstractC2474g == null) {
            m10839h();
        } else {
            abstractC2474g.m10848i();
        }
    }

    /* JADX INFO: renamed from: k */
    public View m10849k() {
        return this.f9413e;
    }

    /* JADX INFO: renamed from: l */
    public abstract boolean mo10850l();

    /* JADX INFO: renamed from: s */
    protected void m10851s() {
        AbstractC2474g abstractC2474g = this.f9418j;
        if (abstractC2474g != null) {
            abstractC2474g.m10851s();
            return;
        }
        InterfaceC2657s interfaceC2657s = this.f9419k;
        if (interfaceC2657s == null || interfaceC2657s.mo419P().mo12626b().m12634d(AbstractC2650l.b.STARTED)) {
            synchronized (this) {
                try {
                    if (this.f9410b) {
                        return;
                    }
                    this.f9410b = true;
                    if (f9401n) {
                        this.f9415g.postFrameCallback(this.f9416h);
                    } else {
                        this.f9417i.post(this.f9409a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    protected void m10852t(View view) {
        view.setTag(AbstractC1710a.f5705a, this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    protected AbstractC2474g(Object obj, View view, int i7) {
        this((InterfaceC2472e) null, view, i7);
        m10838f(obj);
    }
}
