package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;
import p314o2.EnumC6551c;

/* JADX INFO: loaded from: classes2.dex */
final class zzfkr {
    private final String zza;
    private final EnumC6551c zzb;
    private final String zzc;

    /* synthetic */ zzfkr(zzfkq zzfkqVar, byte[] bArr) {
        this.zza = zzfkqVar.zzb();
        this.zzb = zzfkqVar.zzc();
        this.zzc = zzfkqVar.zzd();
    }

    public final boolean equals(Object obj) {
        EnumC6551c enumC6551c;
        EnumC6551c enumC6551c2;
        if (obj instanceof zzfkr) {
            zzfkr zzfkrVar = (zzfkr) obj;
            if (this.zza.equals(zzfkrVar.zza) && (enumC6551c = this.zzb) != null && (enumC6551c2 = zzfkrVar.zzb) != null && enumC6551c.equals(enumC6551c2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        EnumC6551c enumC6551c = this.zzb;
        return enumC6551c == null ? "unknown" : enumC6551c.name().toLowerCase(Locale.ENGLISH);
    }

    public final String zzc() {
        return this.zzc;
    }
}
