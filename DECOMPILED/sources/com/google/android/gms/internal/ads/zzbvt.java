package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import org.json.JSONArray;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbvt extends AbstractC1945a {
    public static final Parcelable.Creator<zzbvt> CREATOR = new zzbvu();
    public final String zza;
    public final int zzb;

    public zzbvt(String str, int i7) {
        this.zza = str;
        this.zzb = i7;
    }

    public static zzbvt zza(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzbvt(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbvt)) {
            return false;
        }
        zzbvt zzbvtVar = (zzbvt) obj;
        return AbstractC3714q.m18053b(this.zza, zzbvtVar.zza) && AbstractC3714q.m18053b(Integer.valueOf(this.zzb), Integer.valueOf(zzbvtVar.zzb));
    }

    public final int hashCode() {
        return AbstractC3714q.m18054c(this.zza, Integer.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zza;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 2, str, false);
        AbstractC1947c.m8072t(parcel, 3, this.zzb);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
