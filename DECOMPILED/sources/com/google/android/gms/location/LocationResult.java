package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationResult extends AbstractC1945a implements ReflectedParcelable {

    /* JADX INFO: renamed from: a */
    private final List f14989a;

    /* JADX INFO: renamed from: b */
    static final List f14988b = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<LocationResult> CREATOR = new C3941F();

    LocationResult(List list) {
        this.f14989a = list;
    }

    /* JADX INFO: renamed from: T */
    public List m18386T() {
        return this.f14989a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f14989a.size() != this.f14989a.size()) {
            return false;
        }
        Iterator it = locationResult.f14989a.iterator();
        Iterator it2 = this.f14989a.iterator();
        while (it.hasNext()) {
            if (((Location) it2.next()).getTime() != ((Location) it.next()).getTime()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Iterator it = this.f14989a.iterator();
        int i7 = 17;
        while (it.hasNext()) {
            long time = ((Location) it.next()).getTime();
            i7 = (i7 * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i7;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f14989a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8048I(parcel, 1, m18386T(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
