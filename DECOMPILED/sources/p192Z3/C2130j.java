package p192Z3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.InterfaceC4881v;
import org.json.JSONException;
import org.json.JSONObject;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: Z3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2130j implements InterfaceC4881v {
    public static final Parcelable.Creator<C2130j> CREATOR = new C2128i();

    /* JADX INFO: renamed from: a */
    private long f6964a;

    /* JADX INFO: renamed from: b */
    private long f6965b;

    public C2130j(long j7, long j8) {
        this.f6964a = j7;
        this.f6965b = j8;
    }

    /* JADX INFO: renamed from: a */
    public static C2130j m8731a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new C2130j(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m8732b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.f6964a);
            jSONObject.put("creationTimestamp", this.f6965b);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.InterfaceC4881v
    /* JADX INFO: renamed from: q */
    public final long mo8733q() {
        return this.f6965b;
    }

    @Override // com.google.firebase.auth.InterfaceC4881v
    /* JADX INFO: renamed from: v */
    public final long mo8734v() {
        return this.f6964a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8076x(parcel, 1, mo8734v());
        AbstractC1947c.m8076x(parcel, 2, mo8733q());
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
