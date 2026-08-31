package com.google.android.gms.internal.p411firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3765t;
import com.google.android.gms.common.util.C3753h;
import org.json.JSONException;
import org.json.JSONObject;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public class zzahv extends AbstractC1945a implements zzaez<zzahv> {
    public static final Parcelable.Creator<zzahv> CREATOR = new zzahu();
    private static final String zza = "zzahv";
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;

    public zzahv() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaez
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzahv zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = AbstractC3765t.m18208a(jSONObject.optString("refresh_token"));
            this.zzc = AbstractC3765t.m18208a(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.zze = AbstractC3765t.m18208a(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzajk.zza(e7, zza, str);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 2, this.zzb, false);
        AbstractC1947c.m8044E(parcel, 3, this.zzc, false);
        AbstractC1947c.m8078z(parcel, 4, Long.valueOf(zza()), false);
        AbstractC1947c.m8044E(parcel, 5, this.zze, false);
        Long l7 = this.zzf;
        l7.longValue();
        AbstractC1947c.m8078z(parcel, 6, l7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public final long zza() {
        Long l7 = this.zzd;
        if (l7 == null) {
            return 0L;
        }
        return l7.longValue();
    }

    public final long zzb() {
        return this.zzf.longValue();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e7) {
            Log.d(zza, "Failed to convert GetTokenResponse to JSON");
            throw new zzaao(e7);
        }
    }

    public final boolean zzg() {
        return C3753h.m18171d().mo18159a() + 300000 < this.zzf.longValue() + (this.zzd.longValue() * 1000);
    }

    public static zzahv zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzahv zzahvVar = new zzahv();
            zzahvVar.zzb = jSONObject.optString("refresh_token", null);
            zzahvVar.zzc = jSONObject.optString("access_token", null);
            zzahvVar.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzahvVar.zze = jSONObject.optString("token_type", null);
            zzahvVar.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzahvVar;
        } catch (JSONException e7) {
            Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
            throw new zzaao(e7);
        }
    }

    public final void zzc(String str) {
        this.zzb = AbstractC3718s.m18077f(str);
    }

    public zzahv(String str, String str2, Long l7, String str3) {
        this(str, str2, l7, str3, Long.valueOf(System.currentTimeMillis()));
    }

    zzahv(String str, String str2, Long l7, String str3, Long l8) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l7;
        this.zze = str3;
        this.zzf = l8;
    }

    public final String zzd() {
        return this.zzb;
    }
}
