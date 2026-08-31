package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgsc extends zzgrg {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzgsb zzd;

    /* synthetic */ zzgsc(int i7, int i8, int i9, zzgsb zzgsbVar, byte[] bArr) {
        this.zza = i7;
        this.zzb = i8;
        this.zzd = zzgsbVar;
    }

    public static zzgsa zzb() {
        return new zzgsa(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgsc)) {
            return false;
        }
        zzgsc zzgscVar = (zzgsc) obj;
        return zzgscVar.zza == this.zza && zzgscVar.zzb == this.zzb && zzgscVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzgsc.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int length = strValueOf.length();
        int i7 = this.zzb;
        int length2 = String.valueOf(i7).length();
        int length3 = String.valueOf(16).length();
        int i8 = this.zza;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i8).length() + 10);
        sb.append("AesEax Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i7);
        sb.append("-byte IV, ");
        sb.append(16);
        sb.append("-byte tag, and ");
        sb.append(i8);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return this.zzd != zzgsb.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final zzgsb zze() {
        return this.zzd;
    }
}
