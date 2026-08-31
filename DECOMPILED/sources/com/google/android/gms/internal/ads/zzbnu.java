package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.util.Arrays;
import java.util.Locale;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbnu {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbod zzc;
    private zzbod zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final boolean zzd(Context context) {
        if (((Boolean) zzbes.zzc.zze()).booleanValue()) {
            return Arrays.asList(((String) zzbes.zzd.zze()).split(",")).contains(C3431F0.m17399W(zzc(context)).m17378a().toLowerCase(Locale.ROOT));
        }
        return false;
    }

    public final zzbod zza(Context context, C7584a c7584a, zzfie zzfieVar) {
        zzbod zzbodVar;
        synchronized (this.zzb) {
            try {
                if (this.zzd == null) {
                    this.zzd = new zzbod(zzc(context), c7584a, zzd(context) ? (String) zzbes.zzb.zze() : (String) zzbes.zzf.zze(), zzfieVar);
                }
                zzbodVar = this.zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbodVar;
    }

    public final zzbod zzb(Context context, C7584a c7584a, zzfie zzfieVar) {
        zzbod zzbodVar;
        String str;
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    if (zzd(context)) {
                        str = ((Boolean) zzbeo.zzg.zze()).booleanValue() ? (String) zzbes.zza.zze() : (String) zzbes.zze.zze();
                    } else if (((Boolean) zzbeo.zzf.zze()).booleanValue()) {
                        str = (String) C3250D.m17200c().zzd(zzbci.zza);
                    } else {
                        str = (String) C3250D.m17200c().zzd(zzbci.zzb);
                    }
                    this.zzc = new zzbod(zzc(context), c7584a, str, zzfieVar);
                }
                zzbodVar = this.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbodVar;
    }
}
