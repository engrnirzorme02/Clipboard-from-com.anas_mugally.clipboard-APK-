package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.C3393s2;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzezh implements zzffl {
    public final zzfaa zza;
    public final zzfac zzb;
    public final C3349h2 zzc;
    public final String zzd;
    public final Executor zze;
    public final C3393s2 zzf;
    public final zzffb zzg;

    public zzezh(zzfaa zzfaaVar, zzfac zzfacVar, C3349h2 c3349h2, String str, Executor executor, C3393s2 c3393s2, zzffb zzffbVar) {
        this.zza = zzfaaVar;
        this.zzb = zzfacVar;
        this.zzc = c3349h2;
        this.zzd = str;
        this.zze = executor;
        this.zzf = c3393s2;
        this.zzg = zzffbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffl
    public final Executor zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzffl
    public final zzffb zzb() {
        return this.zzg;
    }
}
