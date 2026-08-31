package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class zzafv implements zzan {
    public final String zza;
    public final String zzb;

    public zzafv(String str, String str2) {
        this.zza = zzggj.zzb(str);
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzafv zzafvVar = (zzafv) obj;
            if (this.zza.equals(zzafvVar.zza) && this.zzb.equals(zzafvVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + 527) * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 5 + String.valueOf(str2).length());
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    @Override // com.google.android.gms.internal.ads.zzan
    public final void zza(zzal zzalVar) {
        switch (this.zza) {
            case "TITLE":
                zzalVar.zza(this.zzb);
                break;
            case "ARTIST":
                zzalVar.zzb(this.zzb);
                break;
            case "ALBUM":
                zzalVar.zzc(this.zzb);
                break;
            case "ALBUMARTIST":
                zzalVar.zzd(this.zzb);
                break;
            case "TRACKNUMBER":
                Integer numZzh = zzgne.zzh(this.zzb, 10);
                if (numZzh != null) {
                    zzalVar.zzg(numZzh);
                    break;
                }
                break;
            case "TOTALTRACKS":
                Integer numZzh2 = zzgne.zzh(this.zzb, 10);
                if (numZzh2 != null) {
                    zzalVar.zzh(numZzh2);
                    break;
                }
                break;
            case "DISCNUMBER":
                Integer numZzh3 = zzgne.zzh(this.zzb, 10);
                if (numZzh3 != null) {
                    zzalVar.zzr(numZzh3);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numZzh4 = zzgne.zzh(this.zzb, 10);
                if (numZzh4 != null) {
                    zzalVar.zzs(numZzh4);
                    break;
                }
                break;
            case "GENRE":
                zzalVar.zzt(this.zzb);
                break;
            case "DESCRIPTION":
                zzalVar.zze(this.zzb);
                break;
        }
    }
}
