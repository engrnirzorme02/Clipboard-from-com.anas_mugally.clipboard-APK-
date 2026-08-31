package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzejy {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdqc zzb;

    public zzejy(zzdqc zzdqcVar) {
        this.zzb = zzdqcVar;
    }

    public final void zza(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e7) {
            AbstractC3490o0.m17546l("Couldn't create RTB adapter : ", e7);
        }
    }

    public final zzbqw zzb(String str) {
        ConcurrentHashMap concurrentHashMap = this.zza;
        if (concurrentHashMap.containsKey(str)) {
            return (zzbqw) concurrentHashMap.get(str);
        }
        return null;
    }
}
