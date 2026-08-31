package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzym {
    private zzyl zza;
    private zzyu zzb;

    public void zzb() {
        this.zza = null;
        this.zzb = null;
    }

    public boolean zzd() {
        throw null;
    }

    public void zze(zzc zzcVar) {
        throw null;
    }

    public zzlm zzg() {
        throw null;
    }

    public abstract void zzp(Object obj);

    public abstract zzyn zzq(zzln[] zzlnVarArr, zzwq zzwqVar, zzup zzupVar, zzbe zzbeVar);

    public final void zzr(zzyl zzylVar, zzyu zzyuVar) {
        zzghc.zzh(this.zza == null);
        this.zza = zzylVar;
        this.zzb = zzyuVar;
    }

    protected final void zzs() {
        zzyl zzylVar = this.zza;
        if (zzylVar != null) {
            zzylVar.zzq();
        }
    }

    protected final zzyu zzt() {
        zzyu zzyuVar = this.zzb;
        zzyuVar.getClass();
        return zzyuVar;
    }
}
