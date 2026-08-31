package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgsu extends zzgrg {
    private final int zza;
    private final zzgst zzb;

    /* synthetic */ zzgsu(int i7, zzgst zzgstVar, byte[] bArr) {
        this.zza = i7;
        this.zzb = zzgstVar;
    }

    public static zzgss zzb() {
        return new zzgss(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgsu)) {
            return false;
        }
        zzgsu zzgsuVar = (zzgsu) obj;
        return zzgsuVar.zza == this.zza && zzgsuVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzgsu.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        int length = strValueOf.length();
        int i7 = this.zza;
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(i7).length() + 10);
        sb.append("AesGcmSiv Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i7);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return this.zzb != zzgst.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzgst zzd() {
        return this.zzb;
    }
}
