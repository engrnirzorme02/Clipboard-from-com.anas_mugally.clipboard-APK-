package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.location.zzbe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.location.h */
/* JADX INFO: loaded from: classes2.dex */
public class C3969h extends AbstractC1945a {
    public static final Parcelable.Creator<C3969h> CREATOR = new C3980s();

    /* JADX INFO: renamed from: a */
    private final List f15023a;

    /* JADX INFO: renamed from: b */
    private final int f15024b;

    /* JADX INFO: renamed from: c */
    private final String f15025c;

    /* JADX INFO: renamed from: d */
    private final String f15026d;

    /* JADX INFO: renamed from: com.google.android.gms.location.h$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final List f15027a = new ArrayList();

        /* JADX INFO: renamed from: b */
        private int f15028b = 5;

        /* JADX INFO: renamed from: c */
        private String f15029c = "";

        /* JADX INFO: renamed from: a */
        public a m18392a(InterfaceC3967f interfaceC3967f) {
            AbstractC3718s.m18084m(interfaceC3967f, "geofence can't be null.");
            AbstractC3718s.m18073b(interfaceC3967f instanceof zzbe, "Geofence must be created using Geofence.Builder.");
            this.f15027a.add((zzbe) interfaceC3967f);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m18393b(List list) {
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC3967f interfaceC3967f = (InterfaceC3967f) it.next();
                    if (interfaceC3967f != null) {
                        m18392a(interfaceC3967f);
                    }
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C3969h m18394c() {
            AbstractC3718s.m18073b(!this.f15027a.isEmpty(), "No geofence has been added to this request.");
            return new C3969h(this.f15027a, this.f15028b, this.f15029c, null);
        }

        /* JADX INFO: renamed from: d */
        public a m18395d(int i7) {
            this.f15028b = i7 & 7;
            return this;
        }
    }

    C3969h(List list, int i7, String str, String str2) {
        this.f15023a = list;
        this.f15024b = i7;
        this.f15025c = str;
        this.f15026d = str2;
    }

    /* JADX INFO: renamed from: T */
    public int m18391T() {
        return this.f15024b;
    }

    public String toString() {
        return "GeofencingRequest[geofences=" + this.f15023a + ", initialTrigger=" + this.f15024b + ", tag=" + this.f15025c + ", attributionTag=" + this.f15026d + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8048I(parcel, 1, this.f15023a, false);
        AbstractC1947c.m8072t(parcel, 2, m18391T());
        AbstractC1947c.m8044E(parcel, 3, this.f15025c, false);
        AbstractC1947c.m8044E(parcel, 4, this.f15026d, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
