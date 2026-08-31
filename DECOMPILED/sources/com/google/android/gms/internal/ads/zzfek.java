package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3324b1;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfek implements zzcvv {
    private final HashSet zza = new HashSet();
    private final Context zzb;
    private final zzbyz zzc;

    public zzfek(Context context, zzbyz zzbyzVar) {
        this.zzb = context;
        this.zzc = zzbyzVar;
    }

    public final synchronized void zzb(HashSet hashSet) {
        HashSet hashSet2 = this.zza;
        hashSet2.clear();
        hashSet2.addAll(hashSet);
    }

    public final Bundle zzc() {
        return this.zzc.zzn(this.zzb, this);
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final synchronized void zzdN(C3324b1 c3324b1) {
        if (c3324b1.f13918a != 3) {
            this.zzc.zzc(this.zza);
        }
    }
}
