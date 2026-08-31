package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzlu {
    private final zzii zza;

    @Deprecated
    public zzlu(Context context, zzlq zzlqVar) {
        this.zza = new zzii(context, zzlqVar);
    }

    @Deprecated
    public final zzlu zza(final zzym zzymVar) {
        zzii zziiVar = this.zza;
        zzghc.zzh(!zziiVar.zzt);
        zzymVar.getClass();
        zziiVar.zze = new zzght() { // from class: com.google.android.gms.internal.ads.zzif
            @Override // com.google.android.gms.internal.ads.zzght
            public final /* synthetic */ Object zza() {
                return zzymVar;
            }
        };
        return this;
    }

    @Deprecated
    public final zzlu zzb(final zzkj zzkjVar) {
        zzii zziiVar = this.zza;
        zzghc.zzh(!zziiVar.zzt);
        zzkjVar.getClass();
        zziiVar.zzf = new zzght() { // from class: com.google.android.gms.internal.ads.zzig
            @Override // com.google.android.gms.internal.ads.zzght
            public final /* synthetic */ Object zza() {
                return zzkjVar;
            }
        };
        return this;
    }

    @Deprecated
    public final zzlv zzc() {
        zzii zziiVar = this.zza;
        zzghc.zzh(!zziiVar.zzt);
        zziiVar.zzt = true;
        return new zzlv(zziiVar);
    }
}
