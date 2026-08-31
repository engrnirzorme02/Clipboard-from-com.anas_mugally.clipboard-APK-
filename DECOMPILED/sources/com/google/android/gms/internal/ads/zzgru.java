package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgru extends zzgrg {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzgrt zze;
    private final zzgrs zzf;

    /* synthetic */ zzgru(int i7, int i8, int i9, int i10, zzgrt zzgrtVar, zzgrs zzgrsVar, byte[] bArr) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = i10;
        this.zze = zzgrtVar;
        this.zzf = zzgrsVar;
    }

    public static zzgrr zzb() {
        return new zzgrr(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgru)) {
            return false;
        }
        zzgru zzgruVar = (zzgru) obj;
        return zzgruVar.zza == this.zza && zzgruVar.zzb == this.zzb && zzgruVar.zzc == this.zzc && zzgruVar.zzd == this.zzd && zzgruVar.zze == this.zze && zzgruVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Objects.hash(zzgru.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        zzgrs zzgrsVar = this.zzf;
        String strValueOf = String.valueOf(this.zze);
        String strValueOf2 = String.valueOf(zzgrsVar);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i7 = this.zzc;
        int length3 = String.valueOf(i7).length();
        int i8 = this.zzd;
        int length4 = String.valueOf(i8).length();
        int i9 = this.zza;
        int length5 = String.valueOf(i9).length();
        int i10 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i10).length() + 15);
        sb.append("AesCtrHmacAead Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", hashType: ");
        sb.append(strValueOf2);
        sb.append(", ");
        sb.append(i7);
        sb.append("-byte IV, and ");
        sb.append(i8);
        sb.append("-byte tags, and ");
        sb.append(i9);
        sb.append("-byte AES key, and ");
        sb.append(i10);
        sb.append("-byte HMAC key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return this.zze != zzgrt.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        return this.zzd;
    }

    public final int zzf() {
        return this.zzc;
    }

    public final zzgrt zzg() {
        return this.zze;
    }

    public final zzgrs zzh() {
        return this.zzf;
    }
}
