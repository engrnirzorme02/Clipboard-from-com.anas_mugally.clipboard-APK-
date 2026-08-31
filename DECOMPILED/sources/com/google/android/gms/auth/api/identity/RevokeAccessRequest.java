package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.p409authapi.zbbi;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes.dex */
public class RevokeAccessRequest extends AbstractC1945a implements ReflectedParcelable {
    public static final Parcelable.Creator<RevokeAccessRequest> CREATOR = new C3542e();

    /* JADX INFO: renamed from: a */
    private final zbbi f14432a;

    /* JADX INFO: renamed from: b */
    private final Account f14433b;

    /* JADX INFO: renamed from: c */
    private final String f14434c;

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.RevokeAccessRequest$a */
    public static abstract class AbstractC3536a {
        /* JADX INFO: renamed from: a */
        public abstract RevokeAccessRequest mo17669a();

        /* JADX INFO: renamed from: b */
        public abstract AbstractC3536a mo17670b(String str);
    }

    RevokeAccessRequest(List list, Account account, String str) {
        this.f14432a = zbbi.zbi(list);
        this.f14433b = account;
        this.f14434c = str;
    }

    /* JADX INFO: renamed from: T */
    public Account m17665T() {
        return this.f14433b;
    }

    /* JADX INFO: renamed from: U */
    public List m17666U() {
        return this.f14432a;
    }

    /* JADX INFO: renamed from: V */
    public final String m17667V() {
        return this.f14434c;
    }

    /* JADX INFO: renamed from: W */
    public final AbstractC3536a m17668W() {
        return new C3540c(this);
    }

    public boolean equals(Object obj) {
        if (obj instanceof RevokeAccessRequest) {
            RevokeAccessRequest revokeAccessRequest = (RevokeAccessRequest) obj;
            zbbi zbbiVar = this.f14432a;
            int size = zbbiVar.size();
            zbbi zbbiVar2 = revokeAccessRequest.f14432a;
            if (size == zbbiVar2.size() && zbbiVar.containsAll(zbbiVar2) && AbstractC3714q.m18053b(this.f14433b, revokeAccessRequest.f14433b) && AbstractC3714q.m18053b(this.f14434c, revokeAccessRequest.f14434c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f14432a, this.f14433b, this.f14434c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8048I(parcel, 1, m17666U(), false);
        AbstractC1947c.m8042C(parcel, 2, m17665T(), i7, false);
        AbstractC1947c.m8044E(parcel, 3, this.f14434c, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
