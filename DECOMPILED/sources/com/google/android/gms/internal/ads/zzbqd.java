package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.C3321a2;
import com.google.android.gms.ads.internal.client.C3407w1;
import com.google.android.gms.ads.nativead.C3521b;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p012B2.InterfaceC0080u;
import p314o2.C6574z;
import p340r2.C6887e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbqd implements InterfaceC0080u {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final zzbfl zzg;
    private final boolean zzi;
    private final List zzh = new ArrayList();
    private final Map zzj = new HashMap();

    public zzbqd(Date date, int i7, Set set, Location location, boolean z7, int i8, zzbfl zzbflVar, List list, boolean z8, int i9, String str) {
        this.zza = date;
        this.zzb = i7;
        this.zzc = set;
        this.zze = location;
        this.zzd = z7;
        this.zzf = i8;
        this.zzg = zzbflVar;
        this.zzi = z8;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] strArrSplit = str2.split(":", 3);
                    if (strArrSplit.length == 3) {
                        if ("true".equals(strArrSplit[2])) {
                            this.zzj.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(strArrSplit[2])) {
                            this.zzj.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.zzh.add(str2);
                }
            }
        }
    }

    public final float getAdVolume() {
        return C3407w1.m17330e().m17333g();
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    @Override // p012B2.InterfaceC0064e
    public final Set<String> getKeywords() {
        return this.zzc;
    }

    public final Location getLocation() {
        return this.zze;
    }

    @Override // p012B2.InterfaceC0080u
    public final C6887e getNativeAdOptions() {
        Parcelable.Creator<zzbfl> creator = zzbfl.CREATOR;
        C6887e.a aVar = new C6887e.a();
        zzbfl zzbflVar = this.zzg;
        if (zzbflVar == null) {
            return aVar.m30097a();
        }
        int i7 = zzbflVar.zza;
        if (i7 == 2) {
            aVar.m30098b(zzbflVar.zze);
        } else {
            if (i7 != 3) {
                if (i7 == 4) {
                    aVar.m30101e(zzbflVar.zzg);
                    aVar.m30100d(zzbflVar.zzh);
                }
            }
            C3321a2 c3321a2 = zzbflVar.zzf;
            if (c3321a2 != null) {
                aVar.m30104h(new C6574z(c3321a2));
            }
            aVar.m30098b(zzbflVar.zze);
        }
        aVar.m30103g(zzbflVar.zzb);
        aVar.m30099c(zzbflVar.zzc);
        aVar.m30102f(zzbflVar.zzd);
        return aVar.m30097a();
    }

    @Override // p012B2.InterfaceC0080u
    public final C3521b getNativeAdRequestOptions() {
        return zzbfl.zza(this.zzg);
    }

    public final boolean isAdMuted() {
        return C3407w1.m17330e().m17334h();
    }

    @Override // p012B2.InterfaceC0064e
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzi;
    }

    @Override // p012B2.InterfaceC0064e
    public final boolean isTesting() {
        return this.zzd;
    }

    @Override // p012B2.InterfaceC0080u
    public final boolean isUnifiedNativeAdRequested() {
        return this.zzh.contains("6");
    }

    @Override // p012B2.InterfaceC0064e
    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    @Override // p012B2.InterfaceC0080u
    public final boolean zza() {
        return this.zzh.contains("3");
    }

    @Override // p012B2.InterfaceC0080u
    public final Map zzb() {
        return this.zzj;
    }
}
