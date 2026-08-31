package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgtu extends zzgrg {
    private final zzgtt zza;
    private final String zzb;
    private final zzgts zzc;
    private final zzgrg zzd;

    /* synthetic */ zzgtu(zzgtt zzgttVar, String str, zzgts zzgtsVar, zzgrg zzgrgVar, byte[] bArr) {
        this.zza = zzgttVar;
        this.zzb = str;
        this.zzc = zzgtsVar;
        this.zzd = zzgrgVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgtu)) {
            return false;
        }
        zzgtu zzgtuVar = (zzgtu) obj;
        return zzgtuVar.zzc.equals(this.zzc) && zzgtuVar.zzd.equals(this.zzd) && zzgtuVar.zzb.equals(this.zzb) && zzgtuVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Objects.hash(zzgtu.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final String toString() {
        zzgtt zzgttVar = this.zza;
        zzgrg zzgrgVar = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(zzgrgVar);
        String strValueOf3 = String.valueOf(zzgttVar);
        String str = this.zzb;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        StringBuilder sb = new StringBuilder(length + 64 + length2 + 27 + strValueOf2.length() + 11 + strValueOf3.length() + 1);
        sb.append("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        sb.append(str);
        sb.append(", dekParsingStrategy: ");
        sb.append(strValueOf);
        sb.append(", dekParametersForNewKeys: ");
        sb.append(strValueOf2);
        sb.append(", variant: ");
        sb.append(strValueOf3);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return this.zza != zzgtt.zzb;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzgtt zzc() {
        return this.zza;
    }

    public final zzgrg zzd() {
        return this.zzd;
    }
}
