package p154U0;

import android.content.Context;
import p182Y0.InterfaceC2010a;

/* JADX INFO: renamed from: U0.g */
/* JADX INFO: loaded from: classes.dex */
public class C1657g {

    /* JADX INFO: renamed from: e */
    private static C1657g f5466e;

    /* JADX INFO: renamed from: a */
    private C1651a f5467a;

    /* JADX INFO: renamed from: b */
    private C1652b f5468b;

    /* JADX INFO: renamed from: c */
    private C1655e f5469c;

    /* JADX INFO: renamed from: d */
    private C1656f f5470d;

    private C1657g(Context context, InterfaceC2010a interfaceC2010a) {
        Context applicationContext = context.getApplicationContext();
        this.f5467a = new C1651a(applicationContext, interfaceC2010a);
        this.f5468b = new C1652b(applicationContext, interfaceC2010a);
        this.f5469c = new C1655e(applicationContext, interfaceC2010a);
        this.f5470d = new C1656f(applicationContext, interfaceC2010a);
    }

    /* JADX INFO: renamed from: c */
    public static synchronized C1657g m6915c(Context context, InterfaceC2010a interfaceC2010a) {
        try {
            if (f5466e == null) {
                f5466e = new C1657g(context, interfaceC2010a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5466e;
    }

    /* JADX INFO: renamed from: a */
    public C1651a m6916a() {
        return this.f5467a;
    }

    /* JADX INFO: renamed from: b */
    public C1652b m6917b() {
        return this.f5468b;
    }

    /* JADX INFO: renamed from: d */
    public C1655e m6918d() {
        return this.f5469c;
    }

    /* JADX INFO: renamed from: e */
    public C1656f m6919e() {
        return this.f5470d;
    }
}
