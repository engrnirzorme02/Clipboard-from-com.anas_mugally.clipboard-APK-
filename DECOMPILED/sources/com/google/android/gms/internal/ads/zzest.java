package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.concurrent.Callable;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzest implements zzeup {
    private static String zzc;
    private final zzgpd zza;
    private final Context zzb;

    public zzest(zzgpd zzgpdVar, Context context) {
        this.zza = zzgpdVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzess
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 27;
    }

    final /* synthetic */ zzesu zzc() {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzfJ)).booleanValue()) {
            return new zzesu(null);
        }
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzfS)).booleanValue()) {
            return new zzesu(C7351t.m32367y().zzb(this.zzb));
        }
        if (zzc == null) {
            zzc = C7351t.m32367y().zzb(this.zzb);
        }
        return new zzesu(zzc);
    }
}
