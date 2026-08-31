package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.location.d */
/* JADX INFO: loaded from: classes2.dex */
public class C3965d extends AbstractC1945a {
    public static final Parcelable.Creator<C3965d> CREATOR = new C3958X();

    /* JADX INFO: renamed from: e */
    public static final Comparator f15018e = new C3957W();

    /* JADX INFO: renamed from: a */
    private final List f15019a;

    /* JADX INFO: renamed from: b */
    private final String f15020b;

    /* JADX INFO: renamed from: c */
    private final List f15021c;

    /* JADX INFO: renamed from: d */
    private String f15022d;

    public C3965d(List list, String str, List list2, String str2) {
        AbstractC3718s.m18084m(list, "transitions can't be null");
        AbstractC3718s.m18073b(list.size() > 0, "transitions can't be empty.");
        AbstractC3718s.m18083l(list);
        TreeSet treeSet = new TreeSet(f15018e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3964c c3964c = (C3964c) it.next();
            AbstractC3718s.m18073b(treeSet.add(c3964c), String.format("Found duplicated transition: %s.", c3964c));
        }
        this.f15019a = Collections.unmodifiableList(list);
        this.f15020b = str;
        this.f15021c = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.f15022d = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3965d c3965d = (C3965d) obj;
            if (AbstractC3714q.m18053b(this.f15019a, c3965d.f15019a) && AbstractC3714q.m18053b(this.f15020b, c3965d.f15020b) && AbstractC3714q.m18053b(this.f15022d, c3965d.f15022d) && AbstractC3714q.m18053b(this.f15021c, c3965d.f15021c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f15019a.hashCode() * 31;
        String str = this.f15020b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f15021c;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f15022d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f15019a);
        String str = this.f15020b;
        String strValueOf2 = String.valueOf(this.f15021c);
        String str2 = this.f15022d;
        int length = strValueOf.length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + strValueOf2.length() + String.valueOf(str2).length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(strValueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append("', mClients=");
        sb.append(strValueOf2);
        sb.append(", mAttributionTag=");
        sb.append(str2);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        AbstractC3718s.m18083l(parcel);
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8048I(parcel, 1, this.f15019a, false);
        AbstractC1947c.m8044E(parcel, 2, this.f15020b, false);
        AbstractC1947c.m8048I(parcel, 3, this.f15021c, false);
        AbstractC1947c.m8044E(parcel, 4, this.f15022d, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
