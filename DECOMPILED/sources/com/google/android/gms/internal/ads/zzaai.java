package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaai {
    private final Context zza;
    private final zzaau zzb;
    private zzbr zzc;
    private boolean zzd;
    private boolean zzf;
    private long zzg = 15000;
    private final zzaav zzh = new zzaav(1.0f);
    private zzdb zze = zzdb.zza;

    public zzaai(Context context, zzaau zzaauVar) {
        this.zza = context.getApplicationContext();
        this.zzb = zzaauVar;
    }

    public final zzaai zza(boolean z7) {
        this.zzd = true;
        return this;
    }

    public final zzaai zzb(zzdb zzdbVar) {
        this.zze = zzdbVar;
        return this;
    }

    public final zzaai zzc(long j7) {
        this.zzg = j7;
        return this;
    }

    public final zzaaq zzd() {
        zzghc.zzh(!this.zzf);
        if (this.zzc == null) {
            this.zzc = new zzaao(false);
        }
        zzaaq zzaaqVar = new zzaaq(this, null);
        this.zzf = true;
        return zzaaqVar;
    }

    final /* synthetic */ Context zze() {
        return this.zza;
    }

    final /* synthetic */ zzaau zzf() {
        return this.zzb;
    }

    final /* synthetic */ zzbr zzg() {
        return this.zzc;
    }

    final /* synthetic */ boolean zzh() {
        return this.zzd;
    }

    final /* synthetic */ zzdb zzi() {
        return this.zze;
    }

    final /* synthetic */ long zzj() {
        return this.zzg;
    }

    final /* synthetic */ zzaav zzk() {
        return this.zzh;
    }
}
