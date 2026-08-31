package p192Z3;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.p411firebaseauthapi.zzaao;
import com.google.android.gms.internal.p411firebaseauthapi.zzahk;
import com.google.android.gms.internal.p411firebaseauthapi.zzaib;
import com.google.firebase.auth.InterfaceC4832P;
import org.json.JSONException;
import org.json.JSONObject;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: Z3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2118d extends AbstractC1945a implements InterfaceC4832P {
    public static final Parcelable.Creator<C2118d> CREATOR = new C2116c();

    /* JADX INFO: renamed from: a */
    private String f6930a;

    /* JADX INFO: renamed from: b */
    private String f6931b;

    /* JADX INFO: renamed from: c */
    private String f6932c;

    /* JADX INFO: renamed from: d */
    private String f6933d;

    /* JADX INFO: renamed from: e */
    private Uri f6934e;

    /* JADX INFO: renamed from: f */
    private String f6935f;

    /* JADX INFO: renamed from: r */
    private String f6936r;

    /* JADX INFO: renamed from: s */
    private boolean f6937s;

    /* JADX INFO: renamed from: t */
    private String f6938t;

    public C2118d(zzaib zzaibVar) {
        AbstractC3718s.m18083l(zzaibVar);
        this.f6930a = zzaibVar.zzd();
        this.f6931b = AbstractC3718s.m18077f(zzaibVar.zzf());
        this.f6932c = zzaibVar.zzb();
        Uri uriZza = zzaibVar.zza();
        if (uriZza != null) {
            this.f6933d = uriZza.toString();
            this.f6934e = uriZza;
        }
        this.f6935f = zzaibVar.zzc();
        this.f6936r = zzaibVar.zze();
        this.f6937s = false;
        this.f6938t = zzaibVar.zzg();
    }

    /* JADX INFO: renamed from: Y */
    public static C2118d m8694Y(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C2118d(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e7) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzaao(e7);
        }
    }

    /* JADX INFO: renamed from: T */
    public final String m8695T() {
        return this.f6932c;
    }

    /* JADX INFO: renamed from: U */
    public final String m8696U() {
        return this.f6935f;
    }

    /* JADX INFO: renamed from: V */
    public final String m8697V() {
        return this.f6936r;
    }

    /* JADX INFO: renamed from: W */
    public final Uri m8698W() {
        if (!TextUtils.isEmpty(this.f6933d) && this.f6934e == null) {
            this.f6934e = Uri.parse(this.f6933d);
        }
        return this.f6934e;
    }

    /* JADX INFO: renamed from: X */
    public final String m8699X() {
        return this.f6930a;
    }

    /* JADX INFO: renamed from: Z */
    public final String m8700Z() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f6930a);
            jSONObject.putOpt("providerId", this.f6931b);
            jSONObject.putOpt("displayName", this.f6932c);
            jSONObject.putOpt("photoUrl", this.f6933d);
            jSONObject.putOpt("email", this.f6935f);
            jSONObject.putOpt("phoneNumber", this.f6936r);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f6937s));
            jSONObject.putOpt("rawUserInfo", this.f6938t);
            return jSONObject.toString();
        } catch (JSONException e7) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzaao(e7);
        }
    }

    @Override // com.google.firebase.auth.InterfaceC4832P
    /* JADX INFO: renamed from: a */
    public final boolean mo8701a() {
        return this.f6937s;
    }

    @Override // com.google.firebase.auth.InterfaceC4832P
    /* JADX INFO: renamed from: g */
    public final String mo8702g() {
        return this.f6931b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, m8699X(), false);
        AbstractC1947c.m8044E(parcel, 2, mo8702g(), false);
        AbstractC1947c.m8044E(parcel, 3, m8695T(), false);
        AbstractC1947c.m8044E(parcel, 4, this.f6933d, false);
        AbstractC1947c.m8044E(parcel, 5, m8696U(), false);
        AbstractC1947c.m8044E(parcel, 6, m8697V(), false);
        AbstractC1947c.m8059g(parcel, 7, mo8701a());
        AbstractC1947c.m8044E(parcel, 8, this.f6938t, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public final String zza() {
        return this.f6938t;
    }

    public C2118d(zzahk zzahkVar, String str) {
        AbstractC3718s.m18083l(zzahkVar);
        AbstractC3718s.m18077f(str);
        this.f6930a = AbstractC3718s.m18077f(zzahkVar.zzi());
        this.f6931b = str;
        this.f6935f = zzahkVar.zzh();
        this.f6932c = zzahkVar.zzg();
        Uri uriZzc = zzahkVar.zzc();
        if (uriZzc != null) {
            this.f6933d = uriZzc.toString();
            this.f6934e = uriZzc;
        }
        this.f6937s = zzahkVar.zzm();
        this.f6938t = null;
        this.f6936r = zzahkVar.zzj();
    }

    public C2118d(String str, String str2, String str3, String str4, String str5, String str6, boolean z7, String str7) {
        this.f6930a = str;
        this.f6931b = str2;
        this.f6935f = str3;
        this.f6936r = str4;
        this.f6932c = str5;
        this.f6933d = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f6934e = Uri.parse(this.f6933d);
        }
        this.f6937s = z7;
        this.f6938t = str7;
    }
}
