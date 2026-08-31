package com.google.android.gms.internal.ads;

import android.app.Activity;
import p396y2.AbstractBinderC7534v;

/* JADX INFO: loaded from: classes2.dex */
final class zzece extends zzeda {
    private final Activity zza;
    private final AbstractBinderC7534v zzb;
    private final String zzc;
    private final String zzd;

    /* synthetic */ zzece(Activity activity, AbstractBinderC7534v abstractBinderC7534v, String str, String str2, byte[] bArr) {
        this.zza = activity;
        this.zzb = abstractBinderC7534v;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        AbstractBinderC7534v abstractBinderC7534v;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzeda) {
            zzeda zzedaVar = (zzeda) obj;
            if (this.zza.equals(zzedaVar.zza()) && ((abstractBinderC7534v = this.zzb) != null ? abstractBinderC7534v.equals(zzedaVar.zzb()) : zzedaVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzedaVar.zzc()) : zzedaVar.zzc() == null) && ((str2 = this.zzd) != null ? str2.equals(zzedaVar.zzd()) : zzedaVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        AbstractBinderC7534v abstractBinderC7534v = this.zzb;
        int iHashCode2 = ((iHashCode * 1000003) ^ (abstractBinderC7534v == null ? 0 : abstractBinderC7534v.hashCode())) * 1000003;
        String str = this.zzc;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zzd;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        int length2 = strValueOf.length();
        String str = this.zzc;
        int length3 = String.valueOf(str).length();
        String str2 = this.zzd;
        StringBuilder sb = new StringBuilder(length + 40 + length2 + 13 + length3 + 6 + String.valueOf(str2).length() + 1);
        sb.append("OfflineUtilsParams{activity=");
        sb.append(string);
        sb.append(", adOverlay=");
        sb.append(strValueOf);
        sb.append(", gwsQueryId=");
        sb.append(str);
        sb.append(", uri=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzeda
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzeda
    public final AbstractBinderC7534v zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzeda
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzeda
    public final String zzd() {
        return this.zzd;
    }
}
