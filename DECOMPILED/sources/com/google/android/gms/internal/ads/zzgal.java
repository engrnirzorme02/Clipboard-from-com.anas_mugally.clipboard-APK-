package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.concurrent.ExecutorService;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzgal implements zzfwn {
    private final zzhpr zza;
    private final zzhpr zzb;
    private final ExecutorService zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;

    zzgal(zzhpr zzhprVar, zzhpr zzhprVar2, ExecutorService executorService, boolean z7, boolean z8, boolean z9) {
        this.zza = zzhprVar;
        this.zzb = zzhprVar2;
        this.zzc = executorService;
        this.zzd = z7;
        this.zze = z8;
        this.zzf = z9;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final String zza() {
        return ((zzgbn) this.zzb.zzb()).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final InterfaceFutureC1673e zzb() {
        if (this.zzf) {
            return (zzgol) zzgot.zzj((zzgol) zzgot.zzg(zzgol.zzw(((zzgbc) this.zza.zzb()).zza()), Throwable.class, zzgak.zza, zzgpk.zza()), new zzgob() { // from class: com.google.android.gms.internal.ads.zzgai
                @Override // com.google.android.gms.internal.ads.zzgob
                public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                    return this.zza.zzi((zzgbb) obj);
                }
            }, zzgpk.zza());
        }
        InterfaceFutureC1673e interfaceFutureC1673eZzb = ((zzgbn) this.zzb.zzb()).zzb();
        zzh();
        return interfaceFutureC1673eZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final InterfaceFutureC1673e zzc(Context context) {
        if (!this.zzd) {
            zzh();
        }
        return ((zzgbn) this.zzb.zzb()).zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final InterfaceFutureC1673e zzd(Context context, String str, View view, Activity activity) {
        if (!this.zzd) {
            zzh();
        }
        return ((zzgbn) this.zzb.zzb()).zzd(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final InterfaceFutureC1673e zze(Context context, String str, View view, Activity activity) {
        if (!this.zzd) {
            zzh();
        }
        return ((zzgbn) this.zzb.zzb()).zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final void zzf(InputEvent inputEvent) {
        ((zzgbn) this.zzb.zzb()).zzf(inputEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final int zzg() {
        ((zzgbn) this.zzb.zzb()).zzg();
        return 3;
    }

    final InterfaceFutureC1673e zzh() {
        try {
            return zzgot.zzj(((zzgbc) this.zza.zzb()).zza(), new zzgob() { // from class: com.google.android.gms.internal.ads.zzgaj
                @Override // com.google.android.gms.internal.ads.zzgob
                public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                    return this.zza.zzj((zzgbb) obj);
                }
            }, this.zzc);
        } catch (Throwable th) {
            return zzgot.zzc(th);
        }
    }

    final /* synthetic */ InterfaceFutureC1673e zzi(zzgbb zzgbbVar) {
        return ((zzgbn) this.zzb.zzb()).zzb();
    }

    final /* synthetic */ InterfaceFutureC1673e zzj(zzgbb zzgbbVar) {
        return (this.zze && zzgbbVar == zzgbb.RESULT_UPDATED) ? ((zzgbn) this.zzb.zzb()).zzb() : zzgot.zzb();
    }
}
