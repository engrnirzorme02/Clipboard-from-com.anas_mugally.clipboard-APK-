package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbuv extends AbstractC1945a {
    public static final Parcelable.Creator<zzbuv> CREATOR = new zzbuw();
    public final Bundle zza;
    public final C7584a zzb;
    public final ApplicationInfo zzc;
    public final String zzd;
    public final List zze;
    public final PackageInfo zzf;
    public final String zzg;
    public final String zzh;
    public zzfey zzi;
    public String zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final Bundle zzm;
    public final Bundle zzn;
    public final int zzo;

    public zzbuv(Bundle bundle, C7584a c7584a, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, zzfey zzfeyVar, String str4, boolean z7, boolean z8, Bundle bundle2, Bundle bundle3, int i7) {
        this.zza = bundle;
        this.zzb = c7584a;
        this.zzd = str;
        this.zzc = applicationInfo;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzfeyVar;
        this.zzj = str4;
        this.zzk = z7;
        this.zzl = z8;
        this.zzm = bundle2;
        this.zzn = bundle3;
        this.zzo = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        Bundle bundle = this.zza;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8062j(parcel, 1, bundle, false);
        AbstractC1947c.m8042C(parcel, 2, this.zzb, i7, false);
        AbstractC1947c.m8042C(parcel, 3, this.zzc, i7, false);
        AbstractC1947c.m8044E(parcel, 4, this.zzd, false);
        AbstractC1947c.m8046G(parcel, 5, this.zze, false);
        AbstractC1947c.m8042C(parcel, 6, this.zzf, i7, false);
        AbstractC1947c.m8044E(parcel, 7, this.zzg, false);
        AbstractC1947c.m8044E(parcel, 9, this.zzh, false);
        AbstractC1947c.m8042C(parcel, 10, this.zzi, i7, false);
        AbstractC1947c.m8044E(parcel, 11, this.zzj, false);
        AbstractC1947c.m8059g(parcel, 12, this.zzk);
        AbstractC1947c.m8059g(parcel, 13, this.zzl);
        AbstractC1947c.m8062j(parcel, 14, this.zzm, false);
        AbstractC1947c.m8062j(parcel, 15, this.zzn, false);
        AbstractC1947c.m8072t(parcel, 16, this.zzo);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
