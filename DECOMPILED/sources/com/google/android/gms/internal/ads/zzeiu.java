package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import org.json.JSONObject;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeiu implements zzeeb {
    private final zzejy zza;
    private final zzdqc zzb;

    zzeiu(zzejy zzejyVar, zzdqc zzdqcVar) {
        this.zza = zzejyVar;
        this.zzb = zzdqcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeeb
    public final zzeec zza(String str, JSONObject jSONObject) {
        zzbqw zzbqwVarZzb;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbR)).booleanValue()) {
            try {
                zzbqwVarZzb = this.zzb.zzb(str);
            } catch (RemoteException e7) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Coundn't create RTB adapter: ", e7);
                zzbqwVarZzb = null;
            }
        } else {
            zzbqwVarZzb = this.zza.zzb(str);
        }
        if (zzbqwVarZzb == null) {
            return null;
        }
        return new zzeec(zzbqwVarZzb, new zzefo(), str);
    }
}
