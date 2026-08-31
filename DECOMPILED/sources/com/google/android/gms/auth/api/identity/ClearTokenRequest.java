package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes.dex */
public class ClearTokenRequest extends AbstractC1945a implements ReflectedParcelable {
    public static final Parcelable.Creator<ClearTokenRequest> CREATOR = new C3541d();

    /* JADX INFO: renamed from: a */
    private final String f14430a;

    /* JADX INFO: renamed from: b */
    private final String f14431b;

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.ClearTokenRequest$a */
    public static abstract class AbstractC3535a {
        /* JADX INFO: renamed from: a */
        public abstract ClearTokenRequest mo17663a();

        /* JADX INFO: renamed from: b */
        public abstract AbstractC3535a mo17664b(String str);
    }

    ClearTokenRequest(String str, String str2) {
        this.f14430a = str;
        this.f14431b = str2;
    }

    /* JADX INFO: renamed from: T */
    public String m17660T() {
        return this.f14430a;
    }

    /* JADX INFO: renamed from: U */
    public final String m17661U() {
        return this.f14431b;
    }

    /* JADX INFO: renamed from: V */
    public final AbstractC3535a m17662V() {
        return new C3539b(this);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ClearTokenRequest) {
            ClearTokenRequest clearTokenRequest = (ClearTokenRequest) obj;
            if (AbstractC3714q.m18053b(this.f14430a, clearTokenRequest.f14430a) && AbstractC3714q.m18053b(this.f14431b, clearTokenRequest.f14431b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f14430a, this.f14431b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, m17660T(), false);
        AbstractC1947c.m8044E(parcel, 2, this.f14431b, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
