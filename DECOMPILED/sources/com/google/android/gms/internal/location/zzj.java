package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.C3688d;
import com.google.android.gms.location.C3959Y;
import java.util.Collections;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzj extends AbstractC1945a {
    final C3959Y zzc;
    final List<C3688d> zzd;
    final String zze;
    static final List<C3688d> zza = Collections.EMPTY_LIST;
    static final C3959Y zzb = new C3959Y();
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();

    zzj(C3959Y c3959y, List<C3688d> list, String str) {
        this.zzc = c3959y;
        this.zzd = list;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        return AbstractC3714q.m18053b(this.zzc, zzjVar.zzc) && AbstractC3714q.m18053b(this.zzd, zzjVar.zzd) && AbstractC3714q.m18053b(this.zze, zzjVar.zze);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(this.zzd);
        String str = this.zze;
        int length = strValueOf.length();
        StringBuilder sb = new StringBuilder(length + 77 + strValueOf2.length() + String.valueOf(str).length());
        sb.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb.append(strValueOf);
        sb.append(", clients=");
        sb.append(strValueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8042C(parcel, 1, this.zzc, i7, false);
        AbstractC1947c.m8048I(parcel, 2, this.zzd, false);
        AbstractC1947c.m8044E(parcel, 3, this.zze, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
