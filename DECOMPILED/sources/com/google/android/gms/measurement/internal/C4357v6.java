package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3718s;
import p177X2.AbstractC1945a;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.v6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4357v6 extends AbstractC1945a {
    public static final Parcelable.Creator<C4357v6> CREATOR = new C4365w6();

    /* JADX INFO: renamed from: a */
    public final int f16123a;

    /* JADX INFO: renamed from: b */
    public final String f16124b;

    /* JADX INFO: renamed from: c */
    public final long f16125c;

    /* JADX INFO: renamed from: d */
    public final Long f16126d;

    /* JADX INFO: renamed from: e */
    public final String f16127e;

    /* JADX INFO: renamed from: f */
    public final String f16128f;

    /* JADX INFO: renamed from: r */
    public final Double f16129r;

    C4357v6(int i7, String str, long j7, Long l7, Float f7, String str2, String str3, Double d7) {
        this.f16123a = i7;
        this.f16124b = str;
        this.f16125c = j7;
        this.f16126d = l7;
        this.f16129r = i7 == 1 ? f7 != null ? Double.valueOf(f7.doubleValue()) : null : d7;
        this.f16127e = str2;
        this.f16128f = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        C4365w6.m19247a(this, parcel, i7);
    }

    public final Object zza() {
        Long l7 = this.f16126d;
        if (l7 != null) {
            return l7;
        }
        Double d7 = this.f16129r;
        if (d7 != null) {
            return d7;
        }
        String str = this.f16127e;
        if (str != null) {
            return str;
        }
        return null;
    }

    C4357v6(C4373x6 c4373x6) {
        this(c4373x6.f16230c, c4373x6.f16231d, c4373x6.f16232e, c4373x6.f16229b);
    }

    C4357v6(String str, long j7, Object obj, String str2) {
        AbstractC3718s.m18077f(str);
        this.f16123a = 2;
        this.f16124b = str;
        this.f16125c = j7;
        this.f16128f = str2;
        if (obj == null) {
            this.f16126d = null;
            this.f16129r = null;
            this.f16127e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f16126d = (Long) obj;
            this.f16129r = null;
            this.f16127e = null;
        } else if (obj instanceof String) {
            this.f16126d = null;
            this.f16129r = null;
            this.f16127e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f16126d = null;
                this.f16129r = (Double) obj;
                this.f16127e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
