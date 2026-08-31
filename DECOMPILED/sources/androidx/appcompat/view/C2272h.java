package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p111O.AbstractC1057k0;
import p111O.C1053i0;
import p111O.InterfaceC1055j0;

/* JADX INFO: renamed from: androidx.appcompat.view.h */
/* JADX INFO: loaded from: classes.dex */
public class C2272h {

    /* JADX INFO: renamed from: c */
    private Interpolator f7566c;

    /* JADX INFO: renamed from: d */
    InterfaceC1055j0 f7567d;

    /* JADX INFO: renamed from: e */
    private boolean f7568e;

    /* JADX INFO: renamed from: b */
    private long f7565b = -1;

    /* JADX INFO: renamed from: f */
    private final AbstractC1057k0 f7569f = new a();

    /* JADX INFO: renamed from: a */
    final ArrayList f7564a = new ArrayList();

    /* JADX INFO: renamed from: androidx.appcompat.view.h$a */
    class a extends AbstractC1057k0 {

        /* JADX INFO: renamed from: a */
        private boolean f7570a = false;

        /* JADX INFO: renamed from: b */
        private int f7571b = 0;

        a() {
        }

        @Override // p111O.InterfaceC1055j0
        /* JADX INFO: renamed from: b */
        public void mo4696b(View view) {
            int i7 = this.f7571b + 1;
            this.f7571b = i7;
            if (i7 == C2272h.this.f7564a.size()) {
                InterfaceC1055j0 interfaceC1055j0 = C2272h.this.f7567d;
                if (interfaceC1055j0 != null) {
                    interfaceC1055j0.mo4696b(null);
                }
                m9406d();
            }
        }

        @Override // p111O.AbstractC1057k0, p111O.InterfaceC1055j0
        /* JADX INFO: renamed from: c */
        public void mo4697c(View view) {
            if (this.f7570a) {
                return;
            }
            this.f7570a = true;
            InterfaceC1055j0 interfaceC1055j0 = C2272h.this.f7567d;
            if (interfaceC1055j0 != null) {
                interfaceC1055j0.mo4697c(null);
            }
        }

        /* JADX INFO: renamed from: d */
        void m9406d() {
            this.f7571b = 0;
            this.f7570a = false;
            C2272h.this.m9399b();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m9398a() {
        if (this.f7568e) {
            Iterator it = this.f7564a.iterator();
            while (it.hasNext()) {
                ((C1053i0) it.next()).m4685c();
            }
            this.f7568e = false;
        }
    }

    /* JADX INFO: renamed from: b */
    void m9399b() {
        this.f7568e = false;
    }

    /* JADX INFO: renamed from: c */
    public C2272h m9400c(C1053i0 c1053i0) {
        if (!this.f7568e) {
            this.f7564a.add(c1053i0);
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C2272h m9401d(C1053i0 c1053i0, C1053i0 c1053i1) {
        this.f7564a.add(c1053i0);
        c1053i1.m4690i(c1053i0.m4686d());
        this.f7564a.add(c1053i1);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C2272h m9402e(long j7) {
        if (!this.f7568e) {
            this.f7565b = j7;
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C2272h m9403f(Interpolator interpolator) {
        if (!this.f7568e) {
            this.f7566c = interpolator;
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C2272h m9404g(InterfaceC1055j0 interfaceC1055j0) {
        if (!this.f7568e) {
            this.f7567d = interfaceC1055j0;
        }
        return this;
    }

    /* JADX INFO: renamed from: h */
    public void m9405h() {
        if (this.f7568e) {
            return;
        }
        for (C1053i0 c1053i0 : this.f7564a) {
            long j7 = this.f7565b;
            if (j7 >= 0) {
                c1053i0.m4687e(j7);
            }
            Interpolator interpolator = this.f7566c;
            if (interpolator != null) {
                c1053i0.m4688f(interpolator);
            }
            if (this.f7567d != null) {
                c1053i0.m4689g(this.f7569f);
            }
            c1053i0.m4692k();
        }
        this.f7568e = true;
    }
}
