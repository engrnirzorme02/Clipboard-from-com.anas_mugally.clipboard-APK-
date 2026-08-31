package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC2622N;
import androidx.lifecycle.AbstractC2650l;
import androidx.lifecycle.C2626S;
import androidx.lifecycle.C2635a0;
import androidx.lifecycle.C2637b0;
import androidx.lifecycle.C2659u;
import androidx.lifecycle.InterfaceC2639c0;
import androidx.lifecycle.InterfaceC2648j;
import p010B0.C0047f;
import p010B0.C0049h;
import p010B0.InterfaceC0050i;
import p304n0.AbstractC6428a;
import p304n0.C6429b;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: androidx.fragment.app.B */
/* JADX INFO: loaded from: classes.dex */
public class C2575B implements InterfaceC2648j, InterfaceC0050i, InterfaceC2639c0 {

    /* JADX INFO: renamed from: a */
    private final AbstractComponentCallbacksC2591i f10005a;

    /* JADX INFO: renamed from: b */
    private final C2637b0 f10006b;

    /* JADX INFO: renamed from: c */
    private final Runnable f10007c;

    /* JADX INFO: renamed from: d */
    private C2635a0.c f10008d;

    /* JADX INFO: renamed from: e */
    private C2659u f10009e = null;

    /* JADX INFO: renamed from: f */
    private C0049h f10010f = null;

    C2575B(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, C2637b0 c2637b0, Runnable runnable) {
        this.f10005a = abstractComponentCallbacksC2591i;
        this.f10006b = c2637b0;
        this.f10007c = runnable;
    }

    @Override // p010B0.InterfaceC0050i
    /* JADX INFO: renamed from: A */
    public C0047f mo198A() {
        m11956c();
        return this.f10010f.m191b();
    }

    @Override // androidx.lifecycle.InterfaceC2657s
    /* JADX INFO: renamed from: P */
    public AbstractC2650l mo419P() {
        m11956c();
        return this.f10009e;
    }

    /* JADX INFO: renamed from: a */
    void m11955a(AbstractC2650l.a aVar) {
        this.f10009e.m12651i(aVar);
    }

    /* JADX INFO: renamed from: c */
    void m11956c() {
        if (this.f10009e == null) {
            this.f10009e = new C2659u(this);
            C0049h c0049hM190a = C0049h.m190a(this);
            this.f10010f = c0049hM190a;
            c0049hM190a.m192c();
            this.f10007c.run();
        }
    }

    /* JADX INFO: renamed from: d */
    boolean m11957d() {
        return this.f10009e != null;
    }

    /* JADX INFO: renamed from: e */
    void m11958e(Bundle bundle) {
        this.f10010f.m193d(bundle);
    }

    /* JADX INFO: renamed from: f */
    void m11959f(Bundle bundle) {
        this.f10010f.m194e(bundle);
    }

    /* JADX INFO: renamed from: g */
    void m11960g(AbstractC2650l.b bVar) {
        this.f10009e.m12652n(bVar);
    }

    @Override // androidx.lifecycle.InterfaceC2648j
    /* JADX INFO: renamed from: p */
    public C2635a0.c mo11961p() {
        Application application;
        C2635a0.c cVarMo11961p = this.f10005a.mo11961p();
        if (!cVarMo11961p.equals(this.f10005a.f10158h0)) {
            this.f10008d = cVarMo11961p;
            return cVarMo11961p;
        }
        if (this.f10008d == null) {
            Context applicationContext = this.f10005a.m12214y1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = this.f10005a;
            this.f10008d = new C2626S(application, abstractComponentCallbacksC2591i, abstractComponentCallbacksC2591i.m12199s());
        }
        return this.f10008d;
    }

    @Override // androidx.lifecycle.InterfaceC2648j
    /* JADX INFO: renamed from: q */
    public AbstractC6428a mo11962q() {
        Application application;
        Context applicationContext = this.f10005a.m12214y1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C6429b c6429b = new C6429b();
        if (application != null) {
            c6429b.m27642c(C2635a0.a.f10448h, application);
        }
        c6429b.m27642c(AbstractC2622N.f10416a, this.f10005a);
        c6429b.m27642c(AbstractC2622N.f10417b, this);
        if (this.f10005a.m12199s() != null) {
            c6429b.m27642c(AbstractC2622N.f10418c, this.f10005a.m12199s());
        }
        return c6429b;
    }

    @Override // androidx.lifecycle.InterfaceC2639c0
    /* JADX INFO: renamed from: v */
    public C2637b0 mo11963v() {
        m11956c();
        return this.f10006b;
    }
}
