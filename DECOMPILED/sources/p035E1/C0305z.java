package p035E1;

import android.util.Log;
import com.bumptech.glide.load.data.InterfaceC3219d;
import com.bumptech.glide.load.data.InterfaceC3220e;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p019C1.EnumC0125a;
import p019C1.InterfaceC0128d;
import p019C1.InterfaceC0130f;
import p051G1.InterfaceC0470a;
import p067I1.InterfaceC0594n;
import p183Y1.AbstractC2018g;

/* JADX INFO: renamed from: E1.z */
/* JADX INFO: loaded from: classes.dex */
class C0305z implements InterfaceC0285f, InterfaceC0285f.a {

    /* JADX INFO: renamed from: a */
    private final C0286g f1276a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0285f.a f1277b;

    /* JADX INFO: renamed from: c */
    private volatile int f1278c;

    /* JADX INFO: renamed from: d */
    private volatile C0282c f1279d;

    /* JADX INFO: renamed from: e */
    private volatile Object f1280e;

    /* JADX INFO: renamed from: f */
    private volatile InterfaceC0594n.a f1281f;

    /* JADX INFO: renamed from: r */
    private volatile C0283d f1282r;

    /* JADX INFO: renamed from: E1.z$a */
    class a implements InterfaceC3219d.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC0594n.a f1283a;

        a(InterfaceC0594n.a aVar) {
            this.f1283a = aVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d.a
        /* JADX INFO: renamed from: c */
        public void mo1313c(Exception exc) {
            if (C0305z.this.m1472f(this.f1283a)) {
                C0305z.this.m1474i(this.f1283a, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d.a
        /* JADX INFO: renamed from: f */
        public void mo1314f(Object obj) {
            if (C0305z.this.m1472f(this.f1283a)) {
                C0305z.this.m1473g(this.f1283a, obj);
            }
        }
    }

    C0305z(C0286g c0286g, InterfaceC0285f.a aVar) {
        this.f1276a = c0286g;
        this.f1277b = aVar;
    }

    /* JADX INFO: renamed from: b */
    private boolean m1469b(Object obj) throws Throwable {
        Throwable th;
        long jM8393b = AbstractC2018g.m8393b();
        boolean z7 = false;
        try {
            InterfaceC3220e interfaceC3220eM1333o = this.f1276a.m1333o(obj);
            Object objMo4040a = interfaceC3220eM1333o.mo4040a();
            InterfaceC0128d interfaceC0128dM1335q = this.f1276a.m1335q(objMo4040a);
            C0284e c0284e = new C0284e(interfaceC0128dM1335q, objMo4040a, this.f1276a.m1329k());
            C0283d c0283d = new C0283d(this.f1281f.f2274a, this.f1276a.m1334p());
            InterfaceC0470a interfaceC0470aM1322d = this.f1276a.m1322d();
            interfaceC0470aM1322d.mo2032b(c0283d, c0284e);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + c0283d + ", data: " + obj + ", encoder: " + interfaceC0128dM1335q + ", duration: " + AbstractC2018g.m8392a(jM8393b));
            }
            if (interfaceC0470aM1322d.mo2031a(c0283d) != null) {
                this.f1282r = c0283d;
                this.f1279d = new C0282c(Collections.singletonList(this.f1281f.f2274a), this.f1276a, this);
                this.f1281f.f2276c.mo931b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f1282r + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f1277b.mo1316c(this.f1281f.f2274a, interfaceC3220eM1333o.mo4040a(), this.f1281f.f2276c, this.f1281f.f2276c.mo932d(), this.f1281f.f2274a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z7 = true;
                if (z7) {
                    throw th;
                }
                this.f1281f.f2276c.mo931b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m1470e() {
        return this.f1278c < this.f1276a.m1325g().size();
    }

    /* JADX INFO: renamed from: j */
    private void m1471j(InterfaceC0594n.a aVar) {
        this.f1281f.f2276c.mo933e(this.f1276a.m1330l(), new a(aVar));
    }

    @Override // p035E1.InterfaceC0285f
    /* JADX INFO: renamed from: a */
    public boolean mo1312a() {
        if (this.f1280e != null) {
            Object obj = this.f1280e;
            this.f1280e = null;
            try {
                if (!m1469b(obj)) {
                    return true;
                }
            } catch (IOException e7) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e7);
                }
            }
        }
        if (this.f1279d != null && this.f1279d.mo1312a()) {
            return true;
        }
        this.f1279d = null;
        this.f1281f = null;
        boolean z7 = false;
        while (!z7 && m1470e()) {
            List listM1325g = this.f1276a.m1325g();
            int i7 = this.f1278c;
            this.f1278c = i7 + 1;
            this.f1281f = (InterfaceC0594n.a) listM1325g.get(i7);
            if (this.f1281f != null && (this.f1276a.m1323e().mo1393c(this.f1281f.f2276c.mo932d()) || this.f1276a.m1339u(this.f1281f.f2276c.mo930a()))) {
                m1471j(this.f1281f);
                z7 = true;
            }
        }
        return z7;
    }

    @Override // p035E1.InterfaceC0285f.a
    /* JADX INFO: renamed from: c */
    public void mo1316c(InterfaceC0130f interfaceC0130f, Object obj, InterfaceC3219d interfaceC3219d, EnumC0125a enumC0125a, InterfaceC0130f interfaceC0130f2) {
        this.f1277b.mo1316c(interfaceC0130f, obj, interfaceC3219d, this.f1281f.f2276c.mo932d(), interfaceC0130f);
    }

    @Override // p035E1.InterfaceC0285f
    public void cancel() {
        InterfaceC0594n.a aVar = this.f1281f;
        if (aVar != null) {
            aVar.f2276c.cancel();
        }
    }

    @Override // p035E1.InterfaceC0285f.a
    /* JADX INFO: renamed from: d */
    public void mo1317d() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: f */
    boolean m1472f(InterfaceC0594n.a aVar) {
        InterfaceC0594n.a aVar2 = this.f1281f;
        return aVar2 != null && aVar2 == aVar;
    }

    /* JADX INFO: renamed from: g */
    void m1473g(InterfaceC0594n.a aVar, Object obj) {
        AbstractC0289j abstractC0289jM1323e = this.f1276a.m1323e();
        if (obj != null && abstractC0289jM1323e.mo1393c(aVar.f2276c.mo932d())) {
            this.f1280e = obj;
            this.f1277b.mo1317d();
        } else {
            InterfaceC0285f.a aVar2 = this.f1277b;
            InterfaceC0130f interfaceC0130f = aVar.f2274a;
            InterfaceC3219d interfaceC3219d = aVar.f2276c;
            aVar2.mo1316c(interfaceC0130f, obj, interfaceC3219d, interfaceC3219d.mo932d(), this.f1282r);
        }
    }

    @Override // p035E1.InterfaceC0285f.a
    /* JADX INFO: renamed from: h */
    public void mo1318h(InterfaceC0130f interfaceC0130f, Exception exc, InterfaceC3219d interfaceC3219d, EnumC0125a enumC0125a) {
        this.f1277b.mo1318h(interfaceC0130f, exc, interfaceC3219d, this.f1281f.f2276c.mo932d());
    }

    /* JADX INFO: renamed from: i */
    void m1474i(InterfaceC0594n.a aVar, Exception exc) {
        InterfaceC0285f.a aVar2 = this.f1277b;
        C0283d c0283d = this.f1282r;
        InterfaceC3219d interfaceC3219d = aVar.f2276c;
        aVar2.mo1318h(c0283d, exc, interfaceC3219d, interfaceC3219d.mo932d());
    }
}
