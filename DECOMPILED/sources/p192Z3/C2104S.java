package p192Z3;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C3592c;
import com.google.android.gms.internal.p411firebaseauthapi.zzahv;
import p164V3.C1762g;

/* JADX INFO: renamed from: Z3.S */
/* JADX INFO: loaded from: classes.dex */
public final class C2104S {

    /* JADX INFO: renamed from: a */
    private volatile int f6909a;

    /* JADX INFO: renamed from: b */
    private final C2139q f6910b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f6911c;

    public C2104S(C1762g c1762g) {
        this(c1762g.m7405l(), new C2139q(c1762g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final boolean m8653f() {
        return this.f6909a > 0 && !this.f6911c;
    }

    /* JADX INFO: renamed from: b */
    public final void m8655b() {
        this.f6910b.m8745b();
    }

    /* JADX INFO: renamed from: c */
    public final void m8656c(int i7) {
        if (i7 > 0 && this.f6909a == 0) {
            this.f6909a = i7;
            if (m8653f()) {
                this.f6910b.m8746c();
            }
        } else if (i7 == 0 && this.f6909a != 0) {
            this.f6910b.m8745b();
        }
        this.f6909a = i7;
    }

    /* JADX INFO: renamed from: e */
    public final void m8657e(zzahv zzahvVar) {
        if (zzahvVar == null) {
            return;
        }
        long jZza = zzahvVar.zza();
        if (jZza <= 0) {
            jZza = 3600;
        }
        long jZzb = zzahvVar.zzb() + (jZza * 1000);
        C2139q c2139q = this.f6910b;
        c2139q.f6983b = jZzb;
        c2139q.f6984c = -1L;
        if (m8653f()) {
            this.f6910b.m8746c();
        }
    }

    private C2104S(Context context, C2139q c2139q) {
        this.f6911c = false;
        this.f6909a = 0;
        this.f6910b = c2139q;
        ComponentCallbacks2C3592c.m17858c((Application) context.getApplicationContext());
        ComponentCallbacks2C3592c.m17857b().m17860a(new C2106U(this));
    }
}
