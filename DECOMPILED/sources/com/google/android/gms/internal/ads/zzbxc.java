package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.AbstractC3453S;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbxc extends AbstractC1945a {
    public static final Parcelable.Creator<zzbxc> CREATOR = new zzbxd();
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final boolean zzd;
    public final List zze;
    public final boolean zzf;
    public final boolean zzg;
    public final List zzh;

    public zzbxc(String str, String str2, boolean z7, boolean z8, List list, boolean z9, boolean z10, List list2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z7;
        this.zzd = z8;
        this.zze = list;
        this.zzf = z9;
        this.zzg = z10;
        this.zzh = list2 == null ? new ArrayList() : list2;
    }

    public static zzbxc zza(JSONObject jSONObject) {
        return new zzbxc(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), AbstractC3453S.m17474a(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), AbstractC3453S.m17474a(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zza;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 2, str, false);
        AbstractC1947c.m8044E(parcel, 3, this.zzb, false);
        AbstractC1947c.m8059g(parcel, 4, this.zzc);
        AbstractC1947c.m8059g(parcel, 5, this.zzd);
        AbstractC1947c.m8046G(parcel, 6, this.zze, false);
        AbstractC1947c.m8059g(parcel, 7, this.zzf);
        AbstractC1947c.m8059g(parcel, 8, this.zzg);
        AbstractC1947c.m8046G(parcel, 9, this.zzh, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
