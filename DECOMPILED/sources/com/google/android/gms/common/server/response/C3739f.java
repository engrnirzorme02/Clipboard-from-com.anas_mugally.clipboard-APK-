package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Map;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.common.server.response.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3739f extends AbstractC1945a {
    public static final Parcelable.Creator<C3739f> CREATOR = new C3743j();

    /* JADX INFO: renamed from: a */
    final int f14887a;

    /* JADX INFO: renamed from: b */
    final String f14888b;

    /* JADX INFO: renamed from: c */
    final ArrayList f14889c;

    C3739f(int i7, String str, ArrayList arrayList) {
        this.f14887a = i7;
        this.f14888b = str;
        this.f14889c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f14887a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8044E(parcel, 2, this.f14888b, false);
        AbstractC1947c.m8048I(parcel, 3, this.f14889c, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    C3739f(String str, Map map) {
        ArrayList arrayList;
        this.f14887a = 1;
        this.f14888b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new C3740g(str2, (AbstractC3734a.a) map.get(str2)));
            }
        }
        this.f14889c = arrayList;
    }
}
