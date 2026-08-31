package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.C3393s2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zzffc implements zzffb {
    private final Object[] zza;

    public zzffc(C3349h2 c3349h2, String str, int i7, String str2, C3393s2 c3393s2) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i7));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(c3349h2.f13950b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(zza(c3349h2.f13951c));
        } else if (hashSet.contains("npa")) {
            arrayList.add(c3349h2.f13951c.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(c3349h2.f13952d));
        }
        if (hashSet.contains("keywords")) {
            List list = c3349h2.f13953e;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(c3349h2.f13954f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(c3349h2.f13955r));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(c3349h2.f13956s));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(c3349h2.f13957t);
        }
        if (hashSet.contains("location")) {
            Location location = c3349h2.f13959v;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(c3349h2.f13960w);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(zza(c3349h2.f13961x));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(zza(c3349h2.f13962y));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = c3349h2.f13963z;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(c3349h2.f13936A);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(c3349h2.f13937B);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(c3349h2.f13938C));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(c3349h2.f13940E));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(c3349h2.f13941F);
        }
        if (hashSet.contains("orientation")) {
            if (c3393s2 != null) {
                arrayList.add(Integer.valueOf(c3393s2.f14089a));
            } else {
                arrayList.add(null);
            }
        }
        this.zza = arrayList.toArray();
    }

    private static String zza(Bundle bundle) {
        String strZza;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            if (obj == null) {
                strZza = "null";
            } else {
                strZza = obj instanceof Bundle ? zza((Bundle) obj) : obj.toString();
            }
            sb.append(strZza);
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzffb
    public final boolean equals(Object obj) {
        if (obj instanceof zzffc) {
            return Arrays.equals(this.zza, ((zzffc) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzffb
    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        Object[] objArr = this.zza;
        int iHashCode = Arrays.hashCode(objArr);
        String string = Arrays.toString(objArr);
        StringBuilder sb = new StringBuilder(String.valueOf(iHashCode).length() + 10 + String.valueOf(string).length() + 1);
        sb.append("[PoolKey#");
        sb.append(iHashCode);
        sb.append(" ");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
