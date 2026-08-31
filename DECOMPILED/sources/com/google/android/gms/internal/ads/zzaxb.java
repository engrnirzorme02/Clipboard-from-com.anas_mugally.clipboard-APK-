package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaxb extends zzaxl {
    private List zzh;
    private final Context zzi;

    public zzaxb(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i7, int i8, Context context) {
        super(zzavxVar, "JC98YOkW1OV00In88Kxh39aoA4/Lc5LugpNahl16Tw21h78xPzCO3AkqsFSMWF+O", "uHu4aeoXgHtmEAr/p8TbphROLjKobmRTgSnNeTPf/24=", zzarwVar, i7, 31);
        this.zzh = null;
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() {
        zzarw zzarwVar = this.zzd;
        zzarwVar.zzq(-1L);
        zzarwVar.zzr(-1L);
        Context contextZzb = this.zzi;
        if (contextZzb == null) {
            contextZzb = this.zza.zzb();
        }
        if (this.zzh == null) {
            this.zzh = (List) this.zze.invoke(null, contextZzb);
        }
        List list = this.zzh;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (zzarwVar) {
            zzarwVar.zzq(((Long) this.zzh.get(0)).longValue());
            zzarwVar.zzr(((Long) this.zzh.get(1)).longValue());
        }
    }
}
