package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class zzawr extends zzaxl {
    private final zzavy zzh;

    public zzawr(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i7, int i8, zzavy zzavyVar) {
        super(zzavxVar, "OKoG374XK3cB1cjYFPuO/Bg6vy6AufzuCyu4QCURxkWhJwL4+NqQjs8XziSHB+CQ", "PjHrXBXcXoGkJe75zH8RZ0khapXmOV4o2gX+YgkGdus=", zzarwVar, i7, 85);
        this.zzh = zzavyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() {
        Method method = this.zze;
        zzavy zzavyVar = this.zzh;
        long[] jArr = (long[]) method.invoke(null, Long.valueOf(zzavyVar.zzf()), Long.valueOf(zzavyVar.zzg()), Long.valueOf(zzavyVar.zzi()), Long.valueOf(zzavyVar.zzh()));
        zzarw zzarwVar = this.zzd;
        synchronized (zzarwVar) {
            zzarwVar.zzY(jArr[0]);
            zzarwVar.zzZ(jArr[1]);
        }
    }
}
