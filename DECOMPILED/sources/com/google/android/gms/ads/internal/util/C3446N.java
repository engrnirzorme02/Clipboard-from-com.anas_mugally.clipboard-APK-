package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.common.util.AbstractC3749d;
import com.google.android.gms.internal.ads.zzaop;
import com.google.android.gms.internal.ads.zzapk;
import com.google.android.gms.internal.ads.zzaqm;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbzm;
import java.util.Map;
import p157U3.InterfaceFutureC1673e;
import p404z2.AbstractC7599p;
import p404z2.C7596m;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.N */
/* JADX INFO: loaded from: classes.dex */
public final class C3446N {

    /* JADX INFO: renamed from: a */
    private static zzapk f14209a;

    /* JADX INFO: renamed from: b */
    private static final Object f14210b = new Object();

    /* JADX WARN: Code duplicated, block: B:16:0x0036 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:7:0x0010, B:9:0x0014, B:11:0x001d, B:13:0x002f, B:17:0x003b, B:16:0x0036, B:18:0x003d), top: B:22:0x0010 }] */
    public C3446N(Context context) {
        zzapk zzapkVarZza;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f14210b) {
            try {
                if (f14209a == null) {
                    zzbci.zza(context);
                    if (AbstractC3749d.m18158a()) {
                        zzapkVarZza = zzaqm.zza(context, null);
                    } else {
                        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzeT)).booleanValue()) {
                            zzapkVarZza = C3511z.m17600a(context);
                        } else {
                            zzapkVarZza = zzaqm.zza(context, null);
                        }
                    }
                    f14209a = zzapkVarZza;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC1673e m17467a(String str) {
        zzbzm zzbzmVar = new zzbzm();
        f14209a.zzb(new C3444M(str, null, zzbzmVar));
        return zzbzmVar;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceFutureC1673e m17468b(int i7, String str, Map map, byte[] bArr) {
        C3440K c3440k = new C3440K(null);
        C3436I c3436i = new C3436I(this, str, c3440k);
        C7596m c7596m = new C7596m(null);
        C3438J c3438j = new C3438J(this, i7, str, c3440k, c3436i, bArr, map, c7596m);
        if (C7596m.m33304j()) {
            try {
                c7596m.m33314b(str, "GET", c3438j.zzm(), c3438j.zzn());
            } catch (zzaop e7) {
                String message = e7.getMessage();
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f(message);
            }
        }
        f14209a.zzb(c3438j);
        return c3440k;
    }
}
