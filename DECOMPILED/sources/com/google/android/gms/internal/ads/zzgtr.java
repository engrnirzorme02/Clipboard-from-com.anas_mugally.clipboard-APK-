package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgtr {
    private zzgtt zza;
    private String zzb;
    private zzgts zzc;
    private zzgrg zzd;

    private zzgtr() {
        throw null;
    }

    public final zzgtr zza(zzgtt zzgttVar) {
        this.zza = zzgttVar;
        return this;
    }

    public final zzgtr zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzgtr zzc(zzgts zzgtsVar) {
        this.zzc = zzgtsVar;
        return this;
    }

    public final zzgtr zzd(zzgrg zzgrgVar) {
        this.zzd = zzgrgVar;
        return this;
    }

    public final zzgtu zze() throws GeneralSecurityException {
        if (this.zza == null) {
            this.zza = zzgtt.zzb;
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        zzgts zzgtsVar = this.zzc;
        if (zzgtsVar == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        zzgrg zzgrgVar = this.zzd;
        if (zzgrgVar == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (zzgrgVar.zza()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((zzgtsVar.equals(zzgts.zza) && (zzgrgVar instanceof zzgsl)) || ((zzgtsVar.equals(zzgts.zzc) && (zzgrgVar instanceof zzgta)) || ((zzgtsVar.equals(zzgts.zzb) && (zzgrgVar instanceof zzguw)) || ((zzgtsVar.equals(zzgts.zzd) && (zzgrgVar instanceof zzgru)) || ((zzgtsVar.equals(zzgts.zze) && (zzgrgVar instanceof zzgsc)) || (zzgtsVar.equals(zzgts.zzf) && (zzgrgVar instanceof zzgsu))))))) {
            return new zzgtu(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        String string = this.zzc.toString();
        String strValueOf = String.valueOf(this.zzd);
        StringBuilder sb = new StringBuilder(string.length() + 67 + strValueOf.length() + 1);
        sb.append("Cannot use parsing strategy ");
        sb.append(string);
        sb.append(" when new keys are picked according to ");
        sb.append(strValueOf);
        sb.append(".");
        throw new GeneralSecurityException(sb.toString());
    }

    /* synthetic */ zzgtr(byte[] bArr) {
    }
}
