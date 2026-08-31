package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p142S2.C1391b;
import p142S2.C1412w;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes.dex */
public final class SignInConfiguration extends AbstractC1945a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C1412w();

    /* JADX INFO: renamed from: a */
    private final String f14499a;

    /* JADX INFO: renamed from: b */
    private final GoogleSignInOptions f14500b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f14499a = AbstractC3718s.m18077f(str);
        this.f14500b = googleSignInOptions;
    }

    /* JADX INFO: renamed from: T */
    public final GoogleSignInOptions m17734T() {
        return this.f14500b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f14499a.equals(signInConfiguration.f14499a)) {
            GoogleSignInOptions googleSignInOptions = this.f14500b;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f14500b;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new C1391b().m5967a(this.f14499a).m5967a(this.f14500b).m5968b();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f14499a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 2, str, false);
        AbstractC1947c.m8042C(parcel, 5, this.f14500b, i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
