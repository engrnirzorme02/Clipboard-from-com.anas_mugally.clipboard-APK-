package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfns extends zzfnt {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfns(zzfnl zzfnlVar, HashSet hashSet, JSONObject jSONObject, long j7) {
        super(zzfnlVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j7;
    }
}
