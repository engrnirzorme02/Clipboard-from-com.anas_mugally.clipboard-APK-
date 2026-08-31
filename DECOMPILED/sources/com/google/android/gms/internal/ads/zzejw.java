package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class zzejw {
    private final zzdgh zza;

    public zzejw(zzdgh zzdghVar) {
        this.zza = zzdghVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfcu zzfcuVar, zzfcj zzfcjVar, View view, zzejs zzejsVar) {
        zzeju zzejuVar = new zzeju(this, new zzejt(this, zzfcjVar));
        zzdfb zzdfbVarZzd = this.zza.zzd(new zzcri(zzfcuVar, zzfcjVar, null), zzejuVar);
        zzejsVar.zzd(new zzejv(this, zzdfbVarZzd));
        return zzdfbVarZzd.zzh();
    }
}
