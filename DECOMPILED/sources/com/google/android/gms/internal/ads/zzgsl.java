package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgsl extends zzgrg {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzgsk zzd;

    /* synthetic */ zzgsl(int i7, int i8, int i9, zzgsk zzgskVar, byte[] bArr) {
        this.zza = i7;
        this.zzd = zzgskVar;
    }

    public static zzgsj zzb() {
        return new zzgsj(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgsl)) {
            return false;
        }
        zzgsl zzgslVar = (zzgsl) obj;
        return zzgslVar.zza == this.zza && zzgslVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzgsl.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int length = strValueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i7 = this.zza;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i7).length() + 10);
        sb.append("AesGcm Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(12);
        sb.append("-byte IV, ");
        sb.append(16);
        sb.append("-byte tag, and ");
        sb.append(i7);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return this.zzd != zzgsk.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzgsk zzd() {
        return this.zzd;
    }
}
