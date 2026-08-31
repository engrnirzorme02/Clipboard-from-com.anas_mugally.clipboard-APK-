package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfql extends zzfqr {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    /* synthetic */ zzfql(String str, boolean z7, int i7, zzfqi zzfqiVar, zzfqj zzfqjVar, int i8, byte[] bArr) {
        this.zzb = str;
        this.zzc = i7;
        this.zzd = i8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfqr) {
            zzfqr zzfqrVar = (zzfqr) obj;
            if (this.zzb.equals(zzfqrVar.zza())) {
                zzfqrVar.zzb();
                int i7 = this.zzc;
                int iZze = zzfqrVar.zze();
                if (i7 == 0) {
                    throw null;
                }
                if (i7 == iZze) {
                    zzfqrVar.zzc();
                    zzfqrVar.zzd();
                    int i8 = this.zzd;
                    int iZzf = zzfqrVar.zzf();
                    if (i8 == 0) {
                        throw null;
                    }
                    if (iZzf == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() ^ 1000003;
        int i7 = this.zzc;
        if (i7 == 0) {
            throw null;
        }
        int i8 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i7;
        if (this.zzd != 0) {
            return (i8 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i7 = this.zzc;
        if (i7 == 1) {
            str = "ALL_CHECKS";
        } else if (i7 == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i7 != 3) {
            str = i7 != 4 ? "null" : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        String str2 = this.zzd == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 73 + str.length() + 91 + str2.length() + 1);
        sb.append("FileComplianceOptions{fileOwner=");
        sb.append(str3);
        sb.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb.append(str);
        sb.append(", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfqr
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqr
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfqr
    public final zzfqi zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqr
    public final zzfqj zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqr
    public final int zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfqr
    public final int zzf() {
        return this.zzd;
    }
}
