package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.concurrent.Callable;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeno implements zzeup {
    private final Context zza;
    private final zzgpd zzb;

    zzeno(zzgpd zzgpdVar, Context context) {
        this.zzb = zzgpdVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        final ContentResolver contentResolver;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zznJ)).booleanValue() && (contentResolver = this.zza.getContentResolver()) != null) {
            return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzenn
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    ContentResolver contentResolver2 = contentResolver;
                    return new zzenp(Settings.Secure.getString(contentResolver2, "advertising_id"), Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1);
                }
            });
        }
        return zzgot.zza(new zzenp(null, false));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 61;
    }
}
