package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaga extends zzagh {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzagh[] zze;

    public zzaga(String str, boolean z7, boolean z8, String[] strArr, zzagh[] zzaghVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z7;
        this.zzc = z8;
        this.zzd = strArr;
        this.zze = zzaghVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaga.class == obj.getClass()) {
            zzaga zzagaVar = (zzaga) obj;
            if (this.zzb == zzagaVar.zzb && this.zzc == zzagaVar.zzc && Objects.equals(this.zza, zzagaVar.zza) && Arrays.equals(this.zzd, zzagaVar.zzd) && Arrays.equals(this.zze, zzagaVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zzb ? 1 : 0) + 527) * 31) + (this.zzc ? 1 : 0)) * 31) + this.zza.hashCode();
    }
}
