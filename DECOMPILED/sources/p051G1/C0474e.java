package p051G1;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p003A1.C0009a;
import p019C1.InterfaceC0130f;

/* JADX INFO: renamed from: G1.e */
/* JADX INFO: loaded from: classes.dex */
public class C0474e implements InterfaceC0470a {

    /* JADX INFO: renamed from: b */
    private final File f1773b;

    /* JADX INFO: renamed from: c */
    private final long f1774c;

    /* JADX INFO: renamed from: e */
    private C0009a f1776e;

    /* JADX INFO: renamed from: d */
    private final C0472c f1775d = new C0472c();

    /* JADX INFO: renamed from: a */
    private final C0479j f1772a = new C0479j();

    protected C0474e(File file, long j7) {
        this.f1773b = file;
        this.f1774c = j7;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0470a m2039c(File file, long j7) {
        return new C0474e(file, j7);
    }

    /* JADX INFO: renamed from: d */
    private synchronized C0009a m2040d() {
        try {
            if (this.f1776e == null) {
                this.f1776e = C0009a.m31V0(this.f1773b, 1, 1, this.f1774c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f1776e;
    }

    @Override // p051G1.InterfaceC0470a
    /* JADX INFO: renamed from: a */
    public File mo2031a(InterfaceC0130f interfaceC0130f) throws Throwable {
        String strM2060b = this.f1772a.m2060b(interfaceC0130f);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strM2060b + " for for Key: " + interfaceC0130f);
        }
        try {
            C0009a.e eVarM48T0 = m2040d().m48T0(strM2060b);
            if (eVarM48T0 != null) {
                return eVarM48T0.m72a(0);
            }
            return null;
        } catch (IOException e7) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e7);
            return null;
        }
    }

    @Override // p051G1.InterfaceC0470a
    /* JADX INFO: renamed from: b */
    public void mo2032b(InterfaceC0130f interfaceC0130f, InterfaceC0470a.b bVar) {
        String strM2060b = this.f1772a.m2060b(interfaceC0130f);
        this.f1775d.m2034a(strM2060b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strM2060b + " for for Key: " + interfaceC0130f);
            }
            try {
                C0009a c0009aM2040d = m2040d();
                if (c0009aM2040d.m48T0(strM2060b) != null) {
                    this.f1775d.m2035b(strM2060b);
                    return;
                }
                C0009a.c cVarM47Q0 = c0009aM2040d.m47Q0(strM2060b);
                if (cVarM47Q0 == null) {
                    throw new IllegalStateException("Had two simultaneous puts for: " + strM2060b);
                }
                try {
                    if (bVar.mo1315a(cVarM47Q0.m57f(0))) {
                        cVarM47Q0.m56e();
                    }
                    cVarM47Q0.m55b();
                    this.f1775d.m2035b(strM2060b);
                } catch (Throwable th) {
                    cVarM47Q0.m55b();
                    throw th;
                }
            } catch (IOException e7) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e7);
                }
            }
        } catch (Throwable th2) {
            this.f1775d.m2035b(strM2060b);
            throw th2;
        }
    }
}
