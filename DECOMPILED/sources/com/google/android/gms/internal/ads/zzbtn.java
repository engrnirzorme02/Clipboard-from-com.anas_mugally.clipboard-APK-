package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.C3353i2;
import com.google.android.gms.ads.internal.client.C3365l2;
import com.google.android.gms.ads.internal.client.C3368m1;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import p060H2.AbstractC0497b;
import p314o2.EnumC6551c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbtn {
    private static zzbye zze;
    private final Context zza;
    private final EnumC6551c zzb;
    private final C3368m1 zzc;
    private final String zzd;

    public zzbtn(Context context, EnumC6551c enumC6551c, C3368m1 c3368m1, String str) {
        this.zza = context;
        this.zzb = enumC6551c;
        this.zzc = c3368m1;
        this.zzd = str;
    }

    public static zzbye zza(Context context) {
        zzbye zzbyeVar;
        synchronized (zzbtn.class) {
            try {
                if (zze == null) {
                    zze = C3244B.m17191b().m17353i(context, new zzbot());
                }
                zzbyeVar = zze;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbyeVar;
    }

    public final void zzb(AbstractC0497b abstractC0497b) {
        C3349h2 c3349h2M17269a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context context = this.zza;
        zzbye zzbyeVarZza = zza(context);
        if (zzbyeVarZza == null) {
            abstractC0497b.onFailure("Internal Error, query info generator is null.");
            return;
        }
        InterfaceC3772a interfaceC3772aM18221N0 = BinderC3773b.m18221N0(context);
        C3368m1 c3368m1 = this.zzc;
        if (c3368m1 == null) {
            C3353i2 c3353i2 = new C3353i2();
            c3353i2.m17240i(jCurrentTimeMillis);
            c3349h2M17269a = c3353i2.m17232a();
        } else {
            c3368m1.m17284o(jCurrentTimeMillis);
            c3349h2M17269a = C3365l2.f14001a.m17269a(context, c3368m1);
        }
        try {
            zzbyeVarZza.zze(interfaceC3772aM18221N0, new zzbyi(this.zzd, this.zzb.name(), null, c3349h2M17269a, 0, null), new zzbtm(this, abstractC0497b));
        } catch (RemoteException unused) {
            abstractC0497b.onFailure("Internal Error.");
        }
    }
}
