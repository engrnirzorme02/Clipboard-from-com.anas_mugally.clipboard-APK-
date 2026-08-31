package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Callable;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgdh implements zzgcz {
    private final InterfaceFutureC1673e zza;

    zzgdh(final Context context, zzgea zzgeaVar, zzgpd zzgpdVar, zzfui zzfuiVar) {
        if (!zzfuiVar.zzc()) {
            this.zza = zzgot.zza(null);
            return;
        }
        InterfaceFutureC1673e interfaceFutureC1673eSubmit = zzgpdVar.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzgdg
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Context context2 = context;
                try {
                    return zzfoo.zza(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
        zzgeaVar.zze(53, interfaceFutureC1673eSubmit);
        this.zza = interfaceFutureC1673eSubmit;
    }

    @Override // com.google.android.gms.internal.ads.zzgcz
    public final void zzb(Map map) {
        map.put("gs", this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgcz
    public final void zzc(Map map, Context context, View view) {
        map.put("gs", this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgcz
    public final void zzd(Map map) {
        map.put("gs", this.zza);
    }
}
