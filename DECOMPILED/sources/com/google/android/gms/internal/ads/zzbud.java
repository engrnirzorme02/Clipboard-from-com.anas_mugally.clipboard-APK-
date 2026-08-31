package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbud extends AbstractC1945a {
    public static final Parcelable.Creator<zzbud> CREATOR = new zzbue();
    public final boolean zza;
    public final List zzb;

    public zzbud() {
        this(false, Collections.EMPTY_LIST);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        boolean z7 = this.zza;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8059g(parcel, 2, z7);
        AbstractC1947c.m8046G(parcel, 3, this.zzb, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public zzbud(boolean z7, List list) {
        this.zza = z7;
        this.zzb = list;
    }
}
