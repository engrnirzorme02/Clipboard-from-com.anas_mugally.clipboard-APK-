package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfnl {
    private JSONObject zza;
    private final zzfnu zzb;

    public zzfnl(zzfnu zzfnuVar) {
        this.zzb = zzfnuVar;
    }

    public final void zza(JSONObject jSONObject, HashSet hashSet, long j7) {
        this.zzb.zza(new zzfnx(this, hashSet, jSONObject, j7));
    }

    public final void zzb(JSONObject jSONObject, HashSet hashSet, long j7) {
        this.zzb.zza(new zzfnw(this, hashSet, jSONObject, j7));
    }

    public final void zzc() {
        this.zzb.zza(new zzfnv(this));
    }

    public final JSONObject zzd() {
        return this.zza;
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
