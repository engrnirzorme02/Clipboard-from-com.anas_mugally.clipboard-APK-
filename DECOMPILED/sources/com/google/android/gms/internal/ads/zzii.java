package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzii {
    final Context zza;
    zzdb zzb;
    zzght zzc;
    zzght zzd;
    zzght zze;
    zzght zzf;
    zzght zzg;
    zzggr zzh;
    Looper zzi;
    int zzj;
    zzc zzk;
    int zzl;
    boolean zzm;
    zzlt zzn;
    zzls zzo;
    long zzp;
    long zzq;
    int zzr;
    boolean zzs;
    boolean zzt;
    String zzu;
    zzht zzv;

    public zzii(final Context context, final zzlq zzlqVar) {
        zzght zzghtVar = new zzght() { // from class: com.google.android.gms.internal.ads.zzih
            @Override // com.google.android.gms.internal.ads.zzght
            public final /* synthetic */ Object zza() {
                return zzlqVar;
            }
        };
        zzght zzghtVar2 = new zzght() { // from class: com.google.android.gms.internal.ads.zzic
            @Override // com.google.android.gms.internal.ads.zzght
            public final /* synthetic */ Object zza() {
                return new zzuc(context, new zzacq());
            }
        };
        zzght zzghtVar3 = new zzght() { // from class: com.google.android.gms.internal.ads.zzid
            @Override // com.google.android.gms.internal.ads.zzght
            public final /* synthetic */ Object zza() {
                return new zzyd(context);
            }
        };
        zzib zzibVar = zzib.zza;
        zzght zzghtVar4 = new zzght() { // from class: com.google.android.gms.internal.ads.zzie
            @Override // com.google.android.gms.internal.ads.zzght
            public final /* synthetic */ Object zza() {
                return zzyx.zzh(context);
            }
        };
        zzia zziaVar = zzia.zza;
        context.getClass();
        this.zza = context;
        this.zzc = zzghtVar;
        this.zzd = zzghtVar2;
        this.zze = zzghtVar3;
        this.zzf = zzibVar;
        this.zzg = zzghtVar4;
        this.zzh = zziaVar;
        this.zzi = zzeo.zze();
        this.zzk = zzc.zza;
        this.zzl = 1;
        this.zzm = true;
        this.zzn = zzlt.zzb;
        this.zzo = zzls.zza;
        this.zzv = new zzht(0.97f, 1.03f, 1000L, 1.0E-7f, zzeo.zzq(20L), zzeo.zzq(500L), 0.999f, null);
        this.zzb = zzdb.zza;
        this.zzp = 500L;
        this.zzq = 2000L;
        this.zzr = 600000;
        this.zzs = true;
        this.zzu = "";
        this.zzj = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i7 = zzhy.zza;
        }
    }
}
