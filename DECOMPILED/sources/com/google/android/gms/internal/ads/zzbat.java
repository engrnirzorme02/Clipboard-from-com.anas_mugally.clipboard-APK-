package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbat extends AbstractC1945a {
    public static final Parcelable.Creator<zzbat> CREATOR = new zzbau();
    public final String zza;
    public final long zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final Bundle zzf;
    public final boolean zzg;
    public long zzh;
    public String zzi;
    public int zzj;

    zzbat(String str, long j7, String str2, String str3, String str4, Bundle bundle, boolean z7, long j8, String str5, int i7) {
        this.zza = str;
        this.zzb = j7;
        this.zzc = str2 == null ? "" : str2;
        this.zzd = str3 == null ? "" : str3;
        this.zze = str4 == null ? "" : str4;
        this.zzf = bundle == null ? new Bundle() : bundle;
        this.zzg = z7;
        this.zzh = j8;
        this.zzi = str5;
        this.zzj = i7;
    }

    public static zzbat zza(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 51);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                String string = sb.toString();
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f(string);
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j7 = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new zzbat(queryParameter, j7, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException e7) {
            e = e7;
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e8) {
            e = e8;
            int i9 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zza;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 2, str, false);
        AbstractC1947c.m8076x(parcel, 3, this.zzb);
        AbstractC1947c.m8044E(parcel, 4, this.zzc, false);
        AbstractC1947c.m8044E(parcel, 5, this.zzd, false);
        AbstractC1947c.m8044E(parcel, 6, this.zze, false);
        AbstractC1947c.m8062j(parcel, 7, this.zzf, false);
        AbstractC1947c.m8059g(parcel, 8, this.zzg);
        AbstractC1947c.m8076x(parcel, 9, this.zzh);
        AbstractC1947c.m8044E(parcel, 10, this.zzi, false);
        AbstractC1947c.m8072t(parcel, 11, this.zzj);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
