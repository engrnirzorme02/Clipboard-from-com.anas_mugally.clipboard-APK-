package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.core.content.InterfaceC2437c;
import androidx.core.content.InterfaceC2438d;
import androidx.fragment.app.AbstractActivityC2592j;
import androidx.lifecycle.AbstractC2650l;
import androidx.lifecycle.C2637b0;
import androidx.lifecycle.C2659u;
import androidx.lifecycle.InterfaceC2639c0;
import androidx.loader.app.AbstractC2665a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p010B0.C0047f;
import p010B0.InterfaceC0050i;
import p017C.AbstractC0101b;
import p017C.InterfaceC0115p;
import p017C.InterfaceC0116q;
import p104N.InterfaceC0904a;
import p111O.InterfaceC1080w;
import p111O.InterfaceC1086z;
import p223d.AbstractActivityC5187q;
import p223d.C5165H;
import p223d.InterfaceC5167J;
import p231e.InterfaceC5249b;
import p239f.AbstractC5385f;
import p239f.InterfaceC5386g;
import p256h0.InterfaceC5546q;

/* JADX INFO: renamed from: androidx.fragment.app.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC2592j extends AbstractActivityC5187q implements AbstractC0101b.d {

    /* JADX INFO: renamed from: J */
    boolean f10212J;

    /* JADX INFO: renamed from: K */
    boolean f10213K;

    /* JADX INFO: renamed from: H */
    final C2594l f10210H = C2594l.m12250b(new a());

    /* JADX INFO: renamed from: I */
    final C2659u f10211I = new C2659u(this);

    /* JADX INFO: renamed from: L */
    boolean f10214L = true;

    /* JADX INFO: renamed from: androidx.fragment.app.j$a */
    class a extends AbstractC2596n implements InterfaceC2437c, InterfaceC2438d, InterfaceC0115p, InterfaceC0116q, InterfaceC2639c0, InterfaceC5167J, InterfaceC5386g, InterfaceC0050i, InterfaceC5546q, InterfaceC1080w {
        public a() {
            super(AbstractActivityC2592j.this);
        }

        @Override // p010B0.InterfaceC0050i
        /* JADX INFO: renamed from: A */
        public C0047f mo198A() {
            return AbstractActivityC2592j.this.mo198A();
        }

        @Override // androidx.core.content.InterfaceC2438d
        /* JADX INFO: renamed from: H */
        public void mo10597H(InterfaceC0904a interfaceC0904a) {
            AbstractActivityC2592j.this.mo10597H(interfaceC0904a);
        }

        @Override // p017C.InterfaceC0115p
        /* JADX INFO: renamed from: J */
        public void mo559J(InterfaceC0904a interfaceC0904a) {
            AbstractActivityC2592j.this.mo559J(interfaceC0904a);
        }

        @Override // androidx.core.content.InterfaceC2438d
        /* JADX INFO: renamed from: K */
        public void mo10598K(InterfaceC0904a interfaceC0904a) {
            AbstractActivityC2592j.this.mo10598K(interfaceC0904a);
        }

        @Override // androidx.lifecycle.InterfaceC2657s
        /* JADX INFO: renamed from: P */
        public AbstractC2650l mo419P() {
            return AbstractActivityC2592j.this.f10211I;
        }

        @Override // p256h0.InterfaceC5546q
        /* JADX INFO: renamed from: a */
        public void mo12237a(AbstractC2599q abstractC2599q, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
            AbstractActivityC2592j.this.m12235M0(abstractComponentCallbacksC2591i);
        }

        @Override // p223d.InterfaceC5167J
        /* JADX INFO: renamed from: b */
        public C5165H mo12238b() {
            return AbstractActivityC2592j.this.mo12238b();
        }

        @Override // p256h0.AbstractC5540k
        /* JADX INFO: renamed from: d */
        public View mo12098d(int i7) {
            return AbstractActivityC2592j.this.findViewById(i7);
        }

        @Override // p111O.InterfaceC1080w
        /* JADX INFO: renamed from: e */
        public void mo4782e(InterfaceC1086z interfaceC1086z) {
            AbstractActivityC2592j.this.mo4782e(interfaceC1086z);
        }

        @Override // p256h0.AbstractC5540k
        /* JADX INFO: renamed from: f */
        public boolean mo12099f() {
            Window window = AbstractActivityC2592j.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.core.content.InterfaceC2437c
        /* JADX INFO: renamed from: g */
        public void mo10595g(InterfaceC0904a interfaceC0904a) {
            AbstractActivityC2592j.this.mo10595g(interfaceC0904a);
        }

        @Override // p017C.InterfaceC0116q
        /* JADX INFO: renamed from: h */
        public void mo561h(InterfaceC0904a interfaceC0904a) {
            AbstractActivityC2592j.this.mo561h(interfaceC0904a);
        }

        @Override // p017C.InterfaceC0116q
        /* JADX INFO: renamed from: l */
        public void mo562l(InterfaceC0904a interfaceC0904a) {
            AbstractActivityC2592j.this.mo562l(interfaceC0904a);
        }

        @Override // androidx.fragment.app.AbstractC2596n
        /* JADX INFO: renamed from: m */
        public void mo12239m(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            AbstractActivityC2592j.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC2596n
        /* JADX INFO: renamed from: o */
        public LayoutInflater mo12241o() {
            return AbstractActivityC2592j.this.getLayoutInflater().cloneInContext(AbstractActivityC2592j.this);
        }

        @Override // androidx.fragment.app.AbstractC2596n
        /* JADX INFO: renamed from: q */
        public void mo12242q() {
            m12244u();
        }

        @Override // p017C.InterfaceC0115p
        /* JADX INFO: renamed from: r */
        public void mo560r(InterfaceC0904a interfaceC0904a) {
            AbstractActivityC2592j.this.mo560r(interfaceC0904a);
        }

        @Override // p111O.InterfaceC1080w
        /* JADX INFO: renamed from: s */
        public void mo4783s(InterfaceC1086z interfaceC1086z) {
            AbstractActivityC2592j.this.mo4783s(interfaceC1086z);
        }

        @Override // p239f.InterfaceC5386g
        /* JADX INFO: renamed from: t */
        public AbstractC5385f mo12243t() {
            return AbstractActivityC2592j.this.mo12243t();
        }

        /* JADX INFO: renamed from: u */
        public void m12244u() {
            AbstractActivityC2592j.this.m23994u0();
        }

        @Override // androidx.lifecycle.InterfaceC2639c0
        /* JADX INFO: renamed from: v */
        public C2637b0 mo11963v() {
            return AbstractActivityC2592j.this.mo11963v();
        }

        @Override // androidx.core.content.InterfaceC2437c
        /* JADX INFO: renamed from: w */
        public void mo10596w(InterfaceC0904a interfaceC0904a) {
            AbstractActivityC2592j.this.mo10596w(interfaceC0904a);
        }

        @Override // androidx.fragment.app.AbstractC2596n
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public AbstractActivityC2592j mo12240n() {
            return AbstractActivityC2592j.this;
        }
    }

    public AbstractActivityC2592j() {
        m12229J0();
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ Bundle m12227E0(AbstractActivityC2592j abstractActivityC2592j) {
        abstractActivityC2592j.m12234K0();
        abstractActivityC2592j.f10211I.m12651i(AbstractC2650l.a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: renamed from: J0 */
    private void m12229J0() {
        mo198A().m187c("android:support:lifecycle", new C0047f.b() { // from class: h0.g
            @Override // p010B0.C0047f.b
            /* JADX INFO: renamed from: a */
            public final Bundle mo174a() {
                return AbstractActivityC2592j.m12227E0(this.f21369a);
            }
        });
        mo10595g(new InterfaceC0904a() { // from class: h0.h
            @Override // p104N.InterfaceC0904a
            public final void accept(Object obj) {
                this.f21370a.f10210H.m12262m();
            }
        });
        m23991m0(new InterfaceC0904a() { // from class: h0.i
            @Override // p104N.InterfaceC0904a
            public final void accept(Object obj) {
                this.f21371a.f10210H.m12262m();
            }
        });
        m23990l0(new InterfaceC5249b() { // from class: h0.j
            @Override // p231e.InterfaceC5249b
            /* JADX INFO: renamed from: a */
            public final void mo9134a(Context context) {
                this.f21372a.f10210H.m12251a(null);
            }
        });
    }

    /* JADX INFO: renamed from: L0 */
    private static boolean m12230L0(AbstractC2599q abstractC2599q, AbstractC2650l.b bVar) {
        boolean zM12230L0 = false;
        for (AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i : abstractC2599q.m12401u0()) {
            if (abstractComponentCallbacksC2591i != null) {
                if (abstractComponentCallbacksC2591i.m12116E() != null) {
                    zM12230L0 |= m12230L0(abstractComponentCallbacksC2591i.m12201t(), bVar);
                }
                C2575B c2575b = abstractComponentCallbacksC2591i.f10156f0;
                if (c2575b != null && c2575b.mo419P().mo12626b().m12634d(AbstractC2650l.b.STARTED)) {
                    abstractComponentCallbacksC2591i.f10156f0.m11960g(bVar);
                    zM12230L0 = true;
                }
                if (abstractComponentCallbacksC2591i.f10154e0.mo12626b().m12634d(AbstractC2650l.b.STARTED)) {
                    abstractComponentCallbacksC2591i.f10154e0.m12652n(bVar);
                    zM12230L0 = true;
                }
            }
        }
        return zM12230L0;
    }

    /* JADX INFO: renamed from: G0 */
    final View m12231G0(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f10210H.m12263n(view, str, context, attributeSet);
    }

    /* JADX INFO: renamed from: H0 */
    public AbstractC2599q m12232H0() {
        return this.f10210H.m12261l();
    }

    /* JADX INFO: renamed from: I0 */
    public AbstractC2665a m12233I0() {
        return AbstractC2665a.m12681b(this);
    }

    /* JADX INFO: renamed from: K0 */
    void m12234K0() {
        while (m12230L0(m12232H0(), AbstractC2650l.b.CREATED)) {
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m12235M0(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
    }

    /* JADX INFO: renamed from: N0 */
    protected void m12236N0() {
        this.f10211I.m12651i(AbstractC2650l.a.ON_RESUME);
        this.f10210H.m12257h();
    }

    @Override // p017C.AbstractC0101b.d
    /* JADX INFO: renamed from: a */
    public final void mo396a(int i7) {
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (m420Q(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f10212J);
            printWriter.print(" mResumed=");
            printWriter.print(this.f10213K);
            printWriter.print(" mStopped=");
            printWriter.print(this.f10214L);
            if (getApplication() != null) {
                AbstractC2665a.m12681b(this).mo12682a(str2, fileDescriptor, printWriter, strArr);
            }
            this.f10210H.m12261l().m12361V(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // p223d.AbstractActivityC5187q, android.app.Activity
    protected void onActivityResult(int i7, int i8, Intent intent) {
        this.f10210H.m12262m();
        super.onActivityResult(i7, i8, intent);
    }

    @Override // p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10211I.m12651i(AbstractC2650l.a.ON_CREATE);
        this.f10210H.m12254e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewM12231G0 = m12231G0(view, str, context, attributeSet);
        return viewM12231G0 == null ? super.onCreateView(view, str, context, attributeSet) : viewM12231G0;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f10210H.m12255f();
        this.f10211I.m12651i(AbstractC2650l.a.ON_DESTROY);
    }

    @Override // p223d.AbstractActivityC5187q, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 == 6) {
            return this.f10210H.m12253d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f10213K = false;
        this.f10210H.m12256g();
        this.f10211I.m12651i(AbstractC2650l.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        m12236N0();
    }

    @Override // p223d.AbstractActivityC5187q, android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        this.f10210H.m12262m();
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.f10210H.m12262m();
        super.onResume();
        this.f10213K = true;
        this.f10210H.m12260k();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.f10210H.m12262m();
        super.onStart();
        this.f10214L = false;
        if (!this.f10212J) {
            this.f10212J = true;
            this.f10210H.m12252c();
        }
        this.f10210H.m12260k();
        this.f10211I.m12651i(AbstractC2650l.a.ON_START);
        this.f10210H.m12258i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f10210H.m12262m();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f10214L = true;
        m12234K0();
        this.f10210H.m12259j();
        this.f10211I.m12651i(AbstractC2650l.a.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewM12231G0 = m12231G0(null, str, context, attributeSet);
        return viewM12231G0 == null ? super.onCreateView(str, context, attributeSet) : viewM12231G0;
    }
}
