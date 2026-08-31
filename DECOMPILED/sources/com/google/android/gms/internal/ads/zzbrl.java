package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;
import p314o2.AbstractC6572x;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbrl extends AbstractC1945a {
    public static final Parcelable.Creator<zzbrl> CREATOR = new zzbrm();
    public final int zza;
    public final int zzb;
    public final int zzc;

    zzbrl(int i7, int i8, int i9) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
    }

    public static zzbrl zza(AbstractC6572x abstractC6572x) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbrl)) {
            zzbrl zzbrlVar = (zzbrl) obj;
            if (zzbrlVar.zzc == this.zzc && zzbrlVar.zzb == this.zzb && zzbrlVar.zza == this.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        int i7 = this.zza;
        int length = String.valueOf(i7).length();
        int i8 = this.zzb;
        int length2 = String.valueOf(i8).length();
        int i9 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 1 + length2 + 1 + String.valueOf(i9).length());
        sb.append(i7);
        sb.append(".");
        sb.append(i8);
        sb.append(".");
        sb.append(i9);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.zza;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8072t(parcel, 2, this.zzb);
        AbstractC1947c.m8072t(parcel, 3, this.zzc);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
